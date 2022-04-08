import sys
import antlr4
from antlr4 import *
from dist2.AppLexer import AppLexer
from dist2.AppParser import AppParser
from dist2.AppVisitor import AppVisitor

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
        visitor = AppVisitor()
        output = visitor.visit(tree)
        print(output)