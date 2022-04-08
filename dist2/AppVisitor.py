# Generated from ./antlr4/App.g4 by ANTLR 4.9.2
from antlr4 import *
from utils.AppParseTreeVisitor import AppParseTreeVisitor
if __name__ is not None and "." in __name__:
    from .AppParser import AppParser
else:
    from AppParser import AppParser

# This class defines a complete generic visitor for a parse tree produced by AppParser.

class AppVisitor(AppParseTreeVisitor):

    # Visit a parse tree produced by AppParser#primaryExpression.
    def visitPrimaryExpression(self, ctx:AppParser.PrimaryExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by AppParser#instruction.
    def visitInstruction(self, ctx:AppParser.InstructionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by AppParser#signSequence.
    def visitSignSequence(self, ctx:AppParser.SignSequenceContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by AppParser#simpleVariableType.
    def visitSimpleVariableType(self, ctx:AppParser.SimpleVariableTypeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by AppParser#complexVariableType.
    def visitComplexVariableType(self, ctx:AppParser.ComplexVariableTypeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by AppParser#variable.
    def visitVariable(self, ctx:AppParser.VariableContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by AppParser#variableName.
    def visitVariableName(self, ctx:AppParser.VariableNameContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by AppParser#functionName.
    def visitFunctionName(self, ctx:AppParser.FunctionNameContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by AppParser#integer.
    def visitInteger(self, ctx:AppParser.IntegerContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by AppParser#arithmeticalExpression.
    def visitArithmeticalExpression(self, ctx:AppParser.ArithmeticalExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by AppParser#declaration.
    def visitDeclaration(self, ctx:AppParser.DeclarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by AppParser#definition.
    def visitDefinition(self, ctx:AppParser.DefinitionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by AppParser#conditionalStatement.
    def visitConditionalStatement(self, ctx:AppParser.ConditionalStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by AppParser#condition.
    def visitCondition(self, ctx:AppParser.ConditionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by AppParser#instructions.
    def visitInstructions(self, ctx:AppParser.InstructionsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by AppParser#parallelExpression.
    def visitParallelExpression(self, ctx:AppParser.ParallelExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by AppParser#loop.
    def visitLoop(self, ctx:AppParser.LoopContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by AppParser#function.
    def visitFunction(self, ctx:AppParser.FunctionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by AppParser#functionBody.
    def visitFunctionBody(self, ctx:AppParser.FunctionBodyContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by AppParser#functionArgs.
    def visitFunctionArgs(self, ctx:AppParser.FunctionArgsContext):
        return self.visitChildren(ctx)



del AppParser