# Generated from ./antlr4/App.g4 by ANTLR 4.9.2
from antlr4 import *
from utils.AppParseTreeVisitor import AppParseTreeVisitor
from utils.Programm import Programm
from utils.Variable import *
from utils.Error import *
from front.PygameHandler import PyGameHandler
from front.PyturtleHandler import *
if __name__ is not None and "." in __name__:
    from .AppParser import AppParser
else:
    from AppParser import AppParser
# This class defines a complete generic visitor for a parse tree produced by AppParser.

class AppVisitor(AppParseTreeVisitor):
    inside_sequence = False
    forces = {} # mapps object name to forces applied to it str-> List[Force]

    # [NOT IMPLEMENTED] Visit a parse tree produced by AppParser#primaryExpression.
    def visitPrimaryExpression(self, ctx:AppParser.PrimaryExpressionContext):
        return self.visitChildren(ctx)


    # [NOT IMPLEMENTED] Visit a parse tree produced by AppParser#instruction.
    def visitInstruction(self, ctx:AppParser.InstructionContext):
        return self.visitChildren(ctx)

    def visitVariableType(self, ctx:AppParser.VariableTypeContext):
        return ctx.getText()


    def visitVariableName(self, ctx:AppParser.VariableNameContext):
        return ctx.getText()


    # [NOT IMPLEMENTED] Visit a parse tree produced by AppParser#functionName.
    def visitFunctionName(self, ctx:AppParser.FunctionNameContext):
        return self.visitChildren(ctx)

    
    def visitApplyForce(self, ctx:AppParser.ApplyForceContext):
        NR_OF_CHILDREN = self.getNrOfChildren(ctx)
        if NR_OF_CHILDREN < 11:
            return
        if ctx.object_ is None or ctx.force_ is None or ctx.time_ is None:
            return
        
        object_name = self.visit(ctx.object_)
        force_name = self.visit(ctx.force_)
        time_name = self.visit(ctx.time_)

        if Programm.getVariable(object_name) is None or Programm.getVariable(object_name).value is None:
            raise UndefinedVariableReferenceError(object_name)

        if Programm.getVariable(force_name) is None or Programm.getVariable(force_name).value is None:
            raise UndefinedVariableReferenceError(force_name)
        
        if Programm.getVariable(time_name) is None or Programm.getVariable(time_name).value is None:
            raise UndefinedVariableReferenceError(time_name)
        
        angle = Programm.getVariable(force_name).value
        power = Programm.getVariable(force_name).value2
        
        time_val = Programm.getVariable(time_name).value
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

    def visitInteger(self, ctx:AppParser.IntegerContext):
        value = ctx.getText()
        return int(value)

    def visitForce_type(self, ctx:AppParser.Force_typeContext):
        print("Angle:{}, power: {}".format(ctx.angle.getText(), ctx.power.getText()))
        return int(ctx.angle.getText()), int(ctx.power.getText())
    
    def visitObject_type(self, ctx:AppParser.Object_typeContext):
        return int(ctx.x_cor.getText()), int(ctx.y_cor.getText())

    def visitArithmeticalExpression(self, ctx:AppParser.ArithmeticalExpressionContext, type_=None):
        NR_OF_CHILDREN = self.getNrOfChildren(ctx)

        if NR_OF_CHILDREN == 1: # variable name or INT
            if type(self.getNodesChild(ctx,0)).__name__ == "IntegerContext":
                print("Integer")
                return self.visitChildren(ctx)

            elif type(self.getNodesChild(ctx,0)).__name__ == "VariableNameContext":
                print("Variable name")
                name = self.visitChildren(ctx)

                if Programm.getVariable(name) is None:
                    raise UndefinedVariableReferenceError(name)

                if Programm.getVariable(name).type == Type.INT or Programm.getVariable(name).type == Type.TIME:
                    return Programm.getVariable(name).value
            else:
                return self.visitChildren(ctx)

        else:
            type1 = type(self.getNodesChild(ctx.left,0)).__name__
            val1 = self.getNodesChild(ctx.left,0).getText()
            type2 = type(self.getNodesChild(ctx.right,0)).__name__
            val2 = self.getNodesChild(ctx.right,0).getText()

            if not Programm.areTypesCompatible(type1, type2, val1, val2):
                raise Error("Arithmetical operation on different types are not allowed: {}, {} -> {},{}".format(type1,type2, val1, val2))
            else:
                print("Types are ok: {}, {} -> {},{}".format(type1,type2, val1, val2))
            
            artm_type = None
            if type1 == "VariableNameContext":
                artm_type = Programm.getVariable(val1).type
            elif type1 == "IntegerContext":
                artm_type = Type.INT
            elif type1 == "Object_typeContext":
                artm_type = Type.OBJECT
            elif type1 == "Force_typeContext":
                artm_type = Type.FORCE
            else:
                artm_type = 'ARITM_EXPR'

            print("Artm type: {}".format(artm_type))
            
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
            Programm.defineNewVariable(name, Programm.strToType(type_), value)

        elif type_ == 'FORCE':
            value1, value2 = self.visit(ctx.value_)
            Programm.defineNewVariable(name, Programm.strToType(type_), value1, value2)

        elif type_ == 'OBJECT':
            value1, value2 = self.visit(ctx.value_)
            Programm.defineNewVariable(name, Programm.strToType(type_), value1, value2)
            PyturtleHandler.add_new_object(name, value1, value2)
            
        return "declaration"


    def visitDefinition(self, ctx:AppParser.DefinitionContext):

        if ctx.name_ is None or (ctx.value_ is None and (ctx.value1_ is None or ctx.value2_ is None)):
            return
        
        name = self.visit(ctx.name_)
        if Programm.getVariable(name) is None:
            raise UndefinedVariableReferenceError(name)
        
        type = Programm.getVariable(name).type

        if ctx.value_ is not None: # simple type
            value = self.visit(ctx.value_)
            Programm.defineExistingVariable(name, value)

        else: # complex type
            value1 = self.visit(ctx.value1_)
            value2 = self.visit(ctx.value2_)

            Programm.defineExistingVariable(name, value1, value2)

        return "definition"



    # [NOT IMPLEMENTED] Visit a parse tree produced by AppParser#conditionalStatement.
    def visitConditionalStatement(self, ctx:AppParser.ConditionalStatementContext):
        return self.visitChildren(ctx)


    # [NOT IMPLEMENTED] Visit a parse tree produced by AppParser#condition.
    def visitCondition(self, ctx:AppParser.ConditionContext):
        return self.visitChildren(ctx)


    def visitParallelExpression(self, ctx:AppParser.ParallelExpressionContext):
        id = len(Programm.local_scopes)
        local_variables = {}
        Programm.local_scopes.append(local_variables)
        AppVisitor.inside_sequence = True
        # do the work
        AppVisitor.inside_sequence = False
        AppVisitor.forces.clear()
        # return self.visitChildren(ctx)


    # [NOT IMPLEMENTED] Visit a parse tree produced by AppParser#loop.
    def visitLoop(self, ctx:AppParser.LoopContext):
        return self.visitChildren(ctx)


    # [NOT IMPLEMENTED] Visit a parse tree produced by AppParser#function.
    def visitFunction(self, ctx:AppParser.FunctionContext):
        return self.visitChildren(ctx)


    # [NOT IMPLEMENTED] Visit a parse tree produced by AppParser#functionBody.
    def visitFunctionBody(self, ctx:AppParser.FunctionBodyContext):
        return self.visitChildren(ctx)


    # [NOT IMPLEMENTED] Visit a parse tree produced by AppParser#functionArgs.
    def visitFunctionArgs(self, ctx:AppParser.FunctionArgsContext):
        return self.visitChildren(ctx)


    # [NOT IMPLEMENTED] Visit a parse tree produced by AppParser#whiteSpace.
    def visitWhiteSpace(self, ctx:AppParser.WhiteSpaceContext):
        return self.visitChildren(ctx)



del AppParser