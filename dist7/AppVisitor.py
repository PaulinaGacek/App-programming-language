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
        print("IN APPLY FORCE")

        object_name = self.visit(ctx.object_)
        force_name = self.visit(ctx.force_)
        time_name = self.visit(ctx.time_)

        if Programm.getVariable(object_name) is None or Programm.getVariable(object_name).value is None:
            raise UndefinedVariableReferenceError(object_name)

        if Programm.getVariable(force_name) is None or Programm.getVariable(force_name).value is None:
            raise UndefinedVariableReferenceError(force_name)
        
        if Programm.getVariable(time_name) is None or Programm.getVariable(time_name).value is None:
            raise UndefinedVariableReferenceError(time_name)
            
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
        NR_OF_CHILDREN = self.getNrOfChildren(ctx)

        if NR_OF_CHILDREN is None or NR_OF_CHILDREN < 6:
            return

        name = self.visitChild(ctx,4)
        type = self.visitChild(ctx,2)
        
        if NR_OF_CHILDREN >= 6 and NR_OF_CHILDREN <= 7: # definition without value
            Programm.declareNewVariable(name, Programm.strToType(type))
            if type == "OBJECT":
                PyGameHandler.add_new_object(name, None, None)
        
        elif NR_OF_CHILDREN >= 10 and NR_OF_CHILDREN <=11: # definition with value - simple type
            value = self.visitChild(ctx,8)
            Programm.defineNewVariable(name, Programm.strToType(type), value)

        else: 
            # definition with value of complex type
            value1 = self.visitChild(ctx,8)
            value2 = None
            if self.visitChild(ctx,10) is not None:
                value2 = self.visitChild(ctx,10)
            
            elif self.visitChild(ctx,11) is not None:
                value2 = self.visitChild(ctx,11)
            
            else:
                value2 = self.visitChild(ctx,12)
            Programm.defineNewVariable(name, Programm.strToType(type), value1, value2)

            if type == "OBJECT":
                PyGameHandler.add_new_object(name, value1, value2)
                PyturtleHandler.add_new_object(name, value1, value2)
                forces = {}
                forces[name] = [Force(0,1,200)]
                PyturtleHandler.add_forces(forces)
            
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

            if Programm.getVariablesTypeStr(name) == "OBJECT":
                PyGameHandler.modify_object(name, value, value2)

        return "definition"



    # [NOT IMPLEMENTED] Visit a parse tree produced by AppParser#conditionalStatement.
    def visitConditionalStatement(self, ctx:AppParser.ConditionalStatementContext):
        return self.visitChildren(ctx)


    # [NOT IMPLEMENTED] Visit a parse tree produced by AppParser#condition.
    def visitCondition(self, ctx:AppParser.ConditionContext):
        return self.visitChildren(ctx)


    # [NOT IMPLEMENTED] Visit a parse tree produced by AppParser#parallelExpression.
    def visitParallelExpression(self, ctx:AppParser.ParallelExpressionContext):
        return self.visitChildren(ctx)


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