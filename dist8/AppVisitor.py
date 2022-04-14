# Generated from ./antlr4/App.g4 by ANTLR 4.9.2
from antlr4 import *
from utils.AppParseTreeVisitor import AppParseTreeVisitor
from utils.Programm import Programm
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


    def visitSimpleVariableType(self, ctx:AppParser.SimpleVariableTypeContext):
        return ctx.getText()


    def visitComplexVariableType(self, ctx:AppParser.ComplexVariableTypeContext):
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


    def visitArithmeticalExpression(self, ctx:AppParser.ArithmeticalExpressionContext, type_=None):
        NR_OF_CHILDREN = self.getNrOfChildren(ctx)
        if NR_OF_CHILDREN == 1: # variable name or INT
            if type(self.visitChildren(ctx)) is int:
                return self.visitChildren(ctx)
            else:
                name = self.visitChildren(ctx)
                print("It is variable: {}".format(name))

                if Programm.getVariable(name) is None:
                    raise UndefinedVariableReferenceError(name)

                if type is not None and  Programm.getVariable(name).getTypeString() != type_:
                    raise ParameterError("Bad type")
        else:
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


    def visitDeclaration(self, ctx:AppParser.DeclarationContext):

        if ctx.name_ is None or (ctx.type_sim is None and ctx.type_com is None) or (ctx.value_ is None and (ctx.value1_ is None or ctx.value2_ is None)):
            return

        name = self.visit(ctx.name_)
        type = None
        
        if ctx.type_sim is not None: # simple type
            type = self.visit(ctx.type_sim)
            value = self.visit(ctx.value_)
            Programm.defineNewVariable(name, Programm.strToType(type), value)

        else: 
            # definition with value of complex type
            type = self.visit(ctx.type_com)
            value1 = self.visit(ctx.value1_)
            value2 = self.visit(ctx.value2_)
            Programm.defineNewVariable(name, Programm.strToType(type), value1, value2)

            if type == "OBJECT":
                PyturtleHandler.add_new_object(name, value1, value2)
            
        return "declaration"


    def visitDefinition(self, ctx:AppParser.DefinitionContext):
        NR_OF_CHILDREN = self.getNrOfChildren(ctx)

        if NR_OF_CHILDREN is None or NR_OF_CHILDREN < 8:
            return
        
        name = self.visitChild(ctx,2)
        
        if Programm.getVariable(name) is None:
            raise UndefinedVariableReferenceError(name)
        
        type = Programm.getVariable(name).type
        value = self.visitChild(ctx,6, type) 

        if NR_OF_CHILDREN < 10: # simple type
            Programm.defineExistingVariable(name, value)

        else: # complex type
            value2 = None
            if self.visitChild(ctx,8) is not None:
                value2 = self.visitChild(ctx,8)
            
            elif self.visitChild(ctx,9) is not None:
                value2 = self.visitChild(ctx,9)
            
            else:
                value2 = self.visitChild(ctx,10)

            Programm.defineExistingVariable(name, value, value2)

            # if Programm.getVariablesTypeStr(name) == "OBJECT":
                # PyGameHandler.modify_object(name, value, value2)

        return "definition"



    # [NOT IMPLEMENTED] Visit a parse tree produced by AppParser#conditionalStatement.
    def visitConditionalStatement(self, ctx:AppParser.ConditionalStatementContext):
        return self.visitChildren(ctx)


    # [NOT IMPLEMENTED] Visit a parse tree produced by AppParser#condition.
    def visitCondition(self, ctx:AppParser.ConditionContext):
        return self.visitChildren(ctx)


    def visitParallelExpression(self, ctx:AppParser.ParallelExpressionContext):
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