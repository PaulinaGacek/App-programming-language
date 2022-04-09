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
        return ctx.getText()


    # Visit a parse tree produced by AppParser#complexVariableType.
    def visitComplexVariableType(self, ctx:AppParser.ComplexVariableTypeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by AppParser#variable.
    def visitVariable(self, ctx:AppParser.VariableContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by AppParser#variableName.
    def visitVariableName(self, ctx:AppParser.VariableNameContext):
        return ctx.getText()


    # Visit a parse tree produced by AppParser#functionName.
    def visitFunctionName(self, ctx:AppParser.FunctionNameContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by AppParser#integer.
    def visitInteger(self, ctx:AppParser.IntegerContext):
        value = ctx.getText()
        # print("integer: ", int(value))
        return int(value)


    # Visit a parse tree produced by AppParser#arithmeticalExpression.
    def visitArithmeticalExpression(self, ctx:AppParser.ArithmeticalExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by AppParser#declaration.
    def visitDeclaration(self, ctx:AppParser.DeclarationContext):
        return self.visitChildren(ctx)


    '''
    example: https://www.antlr.org/api/Java/org/antlr/v4/runtime/tree/ParseTreeVisitor.html
    '''
    # Visit a parse tree produced by AppParser#declaration.
    def visitDeclaration(self, ctx:AppParser.DeclarationContext):
        NR_OF_CHILDREN = self.getNrOfChildren(ctx)
        print("Nr of children: ", NR_OF_CHILDREN)

        if NR_OF_CHILDREN is None:
            return
        
        if NR_OF_CHILDREN >= 6 and NR_OF_CHILDREN <= 7:
            # DEFINE TIME t; or DEFINE TIME t ; or ComplexType
            print("Type: ", self.visitChild(ctx,2))
            print("Name: ", self.visitChild(ctx,4))
        
        if NR_OF_CHILDREN >= 10 and NR_OF_CHILDREN <=11:
            # DEFINE TIME t AS 20; or DEFINE TIME t AS 20 ;
            print("Type: ", self.visitChild(ctx,2))
            print("Name: ", self.visitChild(ctx,4))
            print("Value: ", self.visitChild(ctx,8))
        
        else:
            # DEFINITION and declaration of complex type
            print("Type: ", self.visitChild(ctx,2))
            print("Name: ", self.visitChild(ctx,4))
            print("Value 1: ", self.visitChild(ctx,8))
            if self.visitChild(ctx,10) is not None:
                print("Value 2: ", self.visitChild(ctx,10))
            
            elif self.visitChild(ctx,11) is not None:
                print("Value 2: ", self.visitChild(ctx,11))
            
            else:
                print("Value 2: ", self.visitChild(ctx,12))

        return "declaration"


    # Visit a parse tree produced by AppParser#conditionalStatement.
    def visitConditionalStatement(self, ctx:AppParser.ConditionalStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by AppParser#condition.
    def visitCondition(self, ctx:AppParser.ConditionContext):
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


    # Visit a parse tree produced by AppParser#whiteSpace.
    def visitWhiteSpace(self, ctx:AppParser.WhiteSpaceContext):
        return self.visitChildren(ctx)



del AppParser