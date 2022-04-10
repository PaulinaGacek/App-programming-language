# Generated from ./antlr4/App.g4 by ANTLR 4.9.2
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .AppParser import AppParser
else:
    from AppParser import AppParser

# This class defines a complete listener for a parse tree produced by AppParser.
class AppListener(ParseTreeListener):

    # Enter a parse tree produced by AppParser#primaryExpression.
    def enterPrimaryExpression(self, ctx:AppParser.PrimaryExpressionContext):
        pass

    # Exit a parse tree produced by AppParser#primaryExpression.
    def exitPrimaryExpression(self, ctx:AppParser.PrimaryExpressionContext):
        pass


    # Enter a parse tree produced by AppParser#instruction.
    def enterInstruction(self, ctx:AppParser.InstructionContext):
        pass

    # Exit a parse tree produced by AppParser#instruction.
    def exitInstruction(self, ctx:AppParser.InstructionContext):
        pass


    # Enter a parse tree produced by AppParser#simpleVariableType.
    def enterSimpleVariableType(self, ctx:AppParser.SimpleVariableTypeContext):
        pass

    # Exit a parse tree produced by AppParser#simpleVariableType.
    def exitSimpleVariableType(self, ctx:AppParser.SimpleVariableTypeContext):
        pass


    # Enter a parse tree produced by AppParser#complexVariableType.
    def enterComplexVariableType(self, ctx:AppParser.ComplexVariableTypeContext):
        pass

    # Exit a parse tree produced by AppParser#complexVariableType.
    def exitComplexVariableType(self, ctx:AppParser.ComplexVariableTypeContext):
        pass


    # Enter a parse tree produced by AppParser#variable.
    def enterVariable(self, ctx:AppParser.VariableContext):
        pass

    # Exit a parse tree produced by AppParser#variable.
    def exitVariable(self, ctx:AppParser.VariableContext):
        pass


    # Enter a parse tree produced by AppParser#variableName.
    def enterVariableName(self, ctx:AppParser.VariableNameContext):
        pass

    # Exit a parse tree produced by AppParser#variableName.
    def exitVariableName(self, ctx:AppParser.VariableNameContext):
        pass


    # Enter a parse tree produced by AppParser#functionName.
    def enterFunctionName(self, ctx:AppParser.FunctionNameContext):
        pass

    # Exit a parse tree produced by AppParser#functionName.
    def exitFunctionName(self, ctx:AppParser.FunctionNameContext):
        pass


    # Enter a parse tree produced by AppParser#integer.
    def enterInteger(self, ctx:AppParser.IntegerContext):
        pass

    # Exit a parse tree produced by AppParser#integer.
    def exitInteger(self, ctx:AppParser.IntegerContext):
        pass


    # Enter a parse tree produced by AppParser#arithmeticalExpression.
    def enterArithmeticalExpression(self, ctx:AppParser.ArithmeticalExpressionContext):
        pass

    # Exit a parse tree produced by AppParser#arithmeticalExpression.
    def exitArithmeticalExpression(self, ctx:AppParser.ArithmeticalExpressionContext):
        pass


    # Enter a parse tree produced by AppParser#declaration.
    def enterDeclaration(self, ctx:AppParser.DeclarationContext):
        pass

    # Exit a parse tree produced by AppParser#declaration.
    def exitDeclaration(self, ctx:AppParser.DeclarationContext):
        pass


    # Enter a parse tree produced by AppParser#definition.
    def enterDefinition(self, ctx:AppParser.DefinitionContext):
        pass

    # Exit a parse tree produced by AppParser#definition.
    def exitDefinition(self, ctx:AppParser.DefinitionContext):
        pass


    # Enter a parse tree produced by AppParser#conditionalStatement.
    def enterConditionalStatement(self, ctx:AppParser.ConditionalStatementContext):
        pass

    # Exit a parse tree produced by AppParser#conditionalStatement.
    def exitConditionalStatement(self, ctx:AppParser.ConditionalStatementContext):
        pass


    # Enter a parse tree produced by AppParser#condition.
    def enterCondition(self, ctx:AppParser.ConditionContext):
        pass

    # Exit a parse tree produced by AppParser#condition.
    def exitCondition(self, ctx:AppParser.ConditionContext):
        pass


    # Enter a parse tree produced by AppParser#parallelExpression.
    def enterParallelExpression(self, ctx:AppParser.ParallelExpressionContext):
        pass

    # Exit a parse tree produced by AppParser#parallelExpression.
    def exitParallelExpression(self, ctx:AppParser.ParallelExpressionContext):
        pass


    # Enter a parse tree produced by AppParser#loop.
    def enterLoop(self, ctx:AppParser.LoopContext):
        pass

    # Exit a parse tree produced by AppParser#loop.
    def exitLoop(self, ctx:AppParser.LoopContext):
        pass


    # Enter a parse tree produced by AppParser#function.
    def enterFunction(self, ctx:AppParser.FunctionContext):
        pass

    # Exit a parse tree produced by AppParser#function.
    def exitFunction(self, ctx:AppParser.FunctionContext):
        pass


    # Enter a parse tree produced by AppParser#functionBody.
    def enterFunctionBody(self, ctx:AppParser.FunctionBodyContext):
        pass

    # Exit a parse tree produced by AppParser#functionBody.
    def exitFunctionBody(self, ctx:AppParser.FunctionBodyContext):
        pass


    # Enter a parse tree produced by AppParser#functionArgs.
    def enterFunctionArgs(self, ctx:AppParser.FunctionArgsContext):
        pass

    # Exit a parse tree produced by AppParser#functionArgs.
    def exitFunctionArgs(self, ctx:AppParser.FunctionArgsContext):
        pass


    # Enter a parse tree produced by AppParser#whiteSpace.
    def enterWhiteSpace(self, ctx:AppParser.WhiteSpaceContext):
        pass

    # Exit a parse tree produced by AppParser#whiteSpace.
    def exitWhiteSpace(self, ctx:AppParser.WhiteSpaceContext):
        pass



del AppParser