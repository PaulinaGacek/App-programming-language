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

    PyGameHandler.instantiate_board()
    PyturtleHandler.instantiate_board()

    exit = False
    while not exit:
        for event in pygame.event.get():
                if event.type == pygame.QUIT:
                    exit = True

        pygame.display.update()

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
        PyGameHandler.display_all_objects()
        PyGameHandler.draw_all_objects()
        pygame.display.update()

    pygame.display.update()