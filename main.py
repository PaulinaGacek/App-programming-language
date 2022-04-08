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
        return int(value)


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