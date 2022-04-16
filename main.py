import sys
import antlr4
import turtle
from antlr4 import *
from dist12.AppLexer import AppLexer
from dist12.AppParser import AppParser
from dist12.AppVisitor import *
from utils.Programm import Programm
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

        AppVisitor.current_state = AppVisitorState.CODE_EXECUTING
        data.strdata = Programm.deleteFunctionsDefinitions(data.__str__())
        print("WITH DELETED FUNCTION DECLARATIONS:", data)

        data.strdata = Programm.inputFunctionsDefinition(data.__str__())
        print("WITH INPUT CODE:", data)
        
        output = visitor.visit(tree)
        print(output)
        Programm.displayVariables()
        Programm.dispay_functions()
        
        if len(PyturtleHandler.balls.keys()) > 0 and PyturtleHandler.get_max_queue_len() > 0:
            PyturtleHandler.display_queues_len()
            PyturtleHandler.display_visualisation(PyturtleHandler.get_max_queue_len())
            print("display visualisation ended")

        PyturtleHandler.win.update()
