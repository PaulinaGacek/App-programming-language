import sys
import antlr4
from antlr4 import *
from dist.AppLexer import AppLexer
from dist.AppParser import AppParser
from dist.AppVisitor import AppVisitor

def get_username():
    return "el padrino don fosforo"

class MyVisitor(AppVisitor):
    def visitDigitSequence(self, ctx):
        value = ctx.getText()
        int(value)
        return int(value)

    def visitNaturalNumber(self, ctx):
        value = ctx.getText()
        int("natural: ",value)
        return int(value)

    def visitInteger(self, ctx):
        value = ctx.getText()
        print("integer: ", int(value))
        return int(value)
    
    # https://www.antlr.org/api/Java/org/antlr/v4/runtime/tree/ParseTreeVisitor.html
    def visitDeclaration(self, ctx):
        print("Declaration nr of children: ", self.getNrOfChildren(ctx))
        print("Variable type: ", self.getNodesChild(ctx, 1), self.getNodesChild(ctx, 1))
        self.visitChild(ctx,8)
        # return self.visitChildren(ctx)


if __name__ == "__main__":
    while True:
        data =  InputStream(input(">>> "))
        # lexer
        lexer = AppLexer(data)
        stream = CommonTokenStream(lexer)
        # parser
        parser = AppParser(stream)
        tree = parser.primaryExpression()
        # evaluator
        visitor = MyVisitor()
        output = visitor.visit(tree)
        print(output)