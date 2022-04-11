import sys
import antlr4
import pygame
from antlr4 import *
from dist7.AppLexer import AppLexer
from dist7.AppParser import AppParser
from dist7.AppVisitor import AppVisitor
from utils.Programm import Programm
from front.PygameHandler import PyGameHandler
from front.PyturtleHandler import PyturtleHandler

if __name__ == "__main__":

    PyturtleHandler.instantiate_board()

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

        PyturtleHandler.display_visualisation(100)
        PyturtleHandler.update_positions_of_all_balls()
        PyturtleHandler.win.update()