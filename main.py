import sys
import antlr4
from antlr4 import *
from dist5.AppLexer import AppLexer
from dist5.AppParser import AppParser
from dist5.AppVisitor import AppVisitor
from utils.Programm import Programm

if __name__ == "__main__":
    while True:
        data = InputStream(input(">>> "))
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
        Programm.displayVariables()