import sys
import antlr4
import pygame
from antlr4 import *
from dist5.AppLexer import AppLexer
from dist5.AppParser import AppParser
from dist5.AppVisitor import AppVisitor
from utils.Programm import Programm
from front.PygameHandler import PyGameHandler

if __name__ == "__main__":

    PyGameHandler.instantiate_board()
    exit = False
    while not exit:
        PyGameHandler.fill_board_with_color()
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
        pygame.display.update()
        
    pygame.display.update()