from antlr4 import *
from utils.AppParseTreeVisitor import AppParseTreeVisitor
from utils.Programm import Programm
from utils.Variable import *
from utils.Error import *
from utils.Function import Function
from front.PygameHandler import PyGameHandler
from front.PyturtleHandler import *
from queue import LifoQueue
if __name__ is not None and "." in __name__:
    from .AppParser import AppParser
else:
    from AppParser import AppParser
# This class defines a complete generic visitor for a parse tree produced by AppParser.

class AppVisitor(AppParseTreeVisitor):
    inside_sequence = False
    forces = {} # mapps object name to forces applied to it str-> List[Force]

    def visitPrimaryExpression(self, ctx:AppParser.PrimaryExpressionContext):

        # gathering info about the functions declarations
        for child in ctx.children:
            if type(child).__name__ == "FunctionDeclarationContext":
                self.visit(child)
        
        # executing programm
        for child in ctx.children:
            if type(child).__name__ != "FunctionDeclarationContext":
                self.visit(child)

    # [NOT IMPLEMENTED] Visit a parse tree produced by AppParser#instruction.
    def visitInstruction(self, ctx:AppParser.InstructionContext):
        return self.visitChildren(ctx)


    def visitVariableType(self, ctx:AppParser.VariableTypeContext):
        return ctx.getText()


    def visitVariableName(self, ctx:AppParser.VariableNameContext):
        return ctx.getText()


    def visitFunctionName(self, ctx:AppParser.FunctionNameContext):
        return ctx.getText()


    def visitInteger(self, ctx:AppParser.IntegerContext):
        value = ctx.getText()
        return int(value)

    def visitForce_type(self, ctx:AppParser.Force_typeContext):
        print("Angle:{}, power: {}".format(ctx.angle.getText(), ctx.power.getText()))
        return int(ctx.angle.getText()), int(ctx.power.getText())
    
    def visitObject_type(self, ctx:AppParser.Object_typeContext):
        return int(ctx.x_cor.getText()), int(ctx.y_cor.getText())


    def visitApplyForce(self, ctx:AppParser.ApplyForceContext):
        NR_OF_CHILDREN = self.getNrOfChildren(ctx)
        if NR_OF_CHILDREN < 11:
            return
        if ctx.object_ is None or (ctx.force_ is None and ctx.force_val is None) or (ctx.time_ is None and ctx.time_val is None):
            return
        
        object_name = self.visit(ctx.object_)
        if Programm.getVariable(object_name) is None or Programm.getVariable(object_name).value is None:
            raise UndefinedVariableReferenceError(object_name)
        
        angle = None
        power = None
        if ctx.force_ is not None: # force is variable
            force_name = self.visit(ctx.force_)
            if Programm.getVariable(force_name) is None or Programm.getVariable(force_name).value is None:
                raise UndefinedVariableReferenceError(force_name)
            angle = Programm.getVariable(force_name).value
            power = Programm.getVariable(force_name).value2
        
        else: # force is value
            angle, power = self.visit(ctx.force_val)

        time_val = None
        if ctx.time_ is not None:
            time_name = self.visit(ctx.time_)
            if Programm.getVariable(time_name) is None or Programm.getVariable(time_name).value is None:
                raise UndefinedVariableReferenceError(time_name)
            time_val = Programm.getVariable(time_name).value
        else:
            time_val = self.visit(ctx.time_val)
        
        force_ = Force(angle, power, time_val)
        delay = 0
        if ctx.delay_:
            delay = self.visit(ctx.delay_)
            print(delay)

        if AppVisitor.forces.get(object_name) is None:
            AppVisitor.forces[object_name] = [force_]
        else:
            AppVisitor.forces[object_name].append(force_)

        if not AppVisitor.inside_sequence:
            print("IN APPLY FORCE not in sequence")
            PyturtleHandler.add_forces(AppVisitor.forces)
            AppVisitor.forces.clear()

        return self.visitChildren(ctx)


    def visitArithmeticalExpression(self, ctx:AppParser.ArithmeticalExpressionContext):
        NR_OF_CHILDREN = self.getNrOfChildren(ctx)

        if NR_OF_CHILDREN == 1: # variable name or INT
            if type(self.getNodesChild(ctx,0)).__name__ == "IntegerContext":
                return self.visitChildren(ctx)

            elif type(self.getNodesChild(ctx,0)).__name__ == "VariableNameContext":
                name = self.visitChildren(ctx)

                if Programm.getVariable(name, Programm.scope_history.top()) is None:
                    raise UndefinedVariableReferenceError(name)

                if Programm.getVariable(name, Programm.scope_history.top()).type == Type.INT or Programm.getVariable(name, Programm.scope_history.top()).type == Type.TIME:
                    return Programm.getVariable(name, Programm.scope_history.top()).value
            else:
                return self.visitChildren(ctx)

        else:
            type1 = type(self.getNodesChild(ctx.left,0)).__name__
            val1 = self.getNodesChild(ctx.left,0).getText()
            type2 = type(self.getNodesChild(ctx.right,0)).__name__
            val2 = self.getNodesChild(ctx.right,0).getText()

            if not Programm.areTypesCompatible(type1, type2, val1, val2):
                raise Error("Arithmetical operation on different types are not allowed: {}, {} -> {},{}".format(type1,type2, val1, val2))
            
            artm_type = None
            if type1 == "VariableNameContext":
                artm_type = Programm.getVariable(val1, Programm.scope_history.top()).type
            elif type1 == "IntegerContext":
                artm_type = Type.INT
            elif type1 == "Object_typeContext":
                artm_type = Type.OBJECT
            elif type1 == "Force_typeContext":
                artm_type = Type.FORCE
            else:
                artm_type = 'ARITM_EXPR'

            # print("Artm type: {}".format(artm_type))
            
            if artm_type == Type.INT or artm_type == Type.TIME:
                l = self.visit(ctx.left)
                r = self.visit(ctx.right)

                op = ctx.op.text
                operation =  {
                '+': lambda: l + r,
                '-': lambda: l - r,
                '*': lambda: l * r,
                '/': lambda: l / r,
                }
                return operation.get(op, lambda: None)()
            
            elif artm_type == Type.FORCE:
                l_angle, l_power = self.visit(ctx.left)
                r_angle, r_power = self.visit(ctx.right)
                print("Operation on forces left:[{},{}], right:[{},{}]".format(l_angle, l_power, r_angle, r_power))
                
                op = ctx.op.text
                # caculate output force and return

            elif artm_type == Type.OBJECT:
                print("Operation on objects")
            
            else:
                return self.visitChildren(ctx)


    def visitDeclaration(self, ctx:AppParser.DeclarationContext):

        if ctx.name_ is None or ctx.type_sim is None or ctx.value_ is None:
            return

        name = self.visit(ctx.name_)
        type_ = self.visit(ctx.type_sim)

        print("Type: {}".format(type_))

        if type_ == 'INT' or type_ == 'TIME':
            if type(self.visit(ctx.value_)) is not int:
                raise Error("Bad casting: {}".format(type(self.visit(ctx.value_))))
            value = self.visit(ctx.value_)
            Programm.defineNewVariable(name, Programm.strToType(type_), value, scope=Programm.scope_history.top())

        elif type_ == 'FORCE':
            value1, value2 = self.visit(ctx.value_)
            Programm.defineNewVariable(name, Programm.strToType(type_), value1, value2, scope=Programm.scope_history.top())

        elif type_ == 'OBJECT':
            value1, value2 = self.visit(ctx.value_)
            Programm.defineNewVariable(name, Programm.strToType(type_), value1, value2, scope=Programm.scope_history.top())
            PyturtleHandler.add_new_object(name, value1, value2)
            
        return "declaration"


    def visitDefinition(self, ctx:AppParser.DefinitionContext):

        if ctx.name_ is None or (ctx.value_ is None and (ctx.value1_ is None or ctx.value2_ is None)):
            return
        
        name = self.visit(ctx.name_)
        if Programm.getVariable(name, Programm.scope_history.top()) is None:
            raise UndefinedVariableReferenceError(name)
        
        type = Programm.getVariable(name, Programm.scope_history.top()).type

        if ctx.value_ is not None: # simple type
            value = self.visit(ctx.value_)
            Programm.defineExistingVariable(name, value, scope=Programm.scope_history.top())

        else: # complex type
            value1 = self.visit(ctx.value1_)
            value2 = self.visit(ctx.value2_)

            Programm.defineExistingVariable(name, value1, value2, scope=Programm.scope_id)

        return "definition"



    # [NOT IMPLEMENTED] Visit a parse tree produced by AppParser#conditionalStatement.
    def visitConditionalStatement(self, ctx:AppParser.ConditionalStatementContext):
        id = Programm.scope_history.getSize()
        Programm.scope_history.push(id)

        if len(Programm.local_scopes) <= id:
            local_variables = {}
            Programm.local_scopes.append(local_variables) # adding new variable scope
        
        self.visitChildren(ctx)
        Programm.displayVariables()
        Programm.scope_history.pop()


    # [NOT IMPLEMENTED] Visit a parse tree produced by AppParser#condition.
    def visitCondition(self, ctx:AppParser.ConditionContext):
        return self.visitChildren(ctx)


    # [NOT IMPLEMENTED] Visit a parse tree produced by AppParser#conditionBody.
    def visitConditionBody(self, ctx:AppParser.ConditionBodyContext):
        return self.visitChildren(ctx)

    # [NOT IMPLEMENTED]
    def visitParallelExpression(self, ctx:AppParser.ParallelExpressionContext):
        AppVisitor.inside_sequence = True
        # do the work
        AppVisitor.inside_sequence = False
        AppVisitor.forces.clear()
        # return self.visitChildren(ctx)


    # [NOT IMPLEMENTED] Visit a parse tree produced by AppParser#parallelBody.
    def visitParallelBody(self, ctx:AppParser.ParallelBodyContext):
        return self.visitChildren(ctx)


    # [NOT IMPLEMENTED] Visit a parse tree produced by AppParser#loop.
    def visitLoop(self, ctx:AppParser.LoopContext):
        return self.visitChildren(ctx)


    # [NOT IMPLEMENTED] Visit a parse tree produced by AppParser#loopBody.
    def visitLoopBody(self, ctx:AppParser.LoopBodyContext):
        return self.visitChildren(ctx)


    # [NOT IMPLEMENTED] Visit a parse tree produced by AppParser#functionCall.
    def visitFunctionCall(self, ctx:AppParser.FunctionCallContext):
        return self.visitChildren(ctx)


    def visitFunctionDeclaration(self, ctx:AppParser.FunctionDeclarationContext):
        
        f_name = self.visit(ctx.f_name)

        if Programm.getFunction(f_name) is not None:
            raise FunctionRedefinitionError(f_name)
        
        func = Function(f_name)
        if ctx.f_args is not None: # function has params
            func.params = self.visit(ctx.f_args) # function args returns dict of variables
        # modify func
        Programm.addFunction(func)


    # [NOT IMPLEMENTED] Visit a parse tree produced by AppParser#functionBody.
    def visitFunctionBody(self, ctx:AppParser.FunctionBodyContext):
        return self.visitChildren(ctx)


    def visitFunctionArgs(self, ctx:AppParser.FunctionArgsContext):
        arguments = {}
        for child in ctx.children:
            if type(child).__name__ == "FunctionArgumentContext":
                # add check whether no redefinition
                name, var = self.visit(child)
                arguments[name] = var
        return arguments
    

    def visitFunctionArgument(self, ctx:AppParser.FunctionArgumentContext):
        name = self.visit(ctx.name_)
        type = self.visit(ctx.type_)
        var = Variable(name, Programm.strToType(type), None, None)
        return name, var


    # Visit a parse tree produced by AppParser#whiteSpace.
    def visitWhiteSpace(self, ctx:AppParser.WhiteSpaceContext):
        return self.visitChildren(ctx)



del AppParser