import sys
import antlr4
import turtle
from antlr4 import *
from dist14.AppLexer import AppLexer
from dist14.AppParser import AppParser
from dist14.AppVisitor import *
from dist14.AppErrorListener import *
from utils.Programm import Programm
from front.PyturtleHandler import PyturtleHandler

if __name__ == "__main__":

    PyturtleHandler.instantiate_board()

    while True: 
        AppVisitor.current_state = AppVisitorState.FUNC_DECLARATION_CHECKING
        data = InputStream(input(">>> "))
        # lexer
        lexer = AppLexer(data)
        stream = CommonTokenStream(lexer)
        # parser
        parser = AppParser(stream)
        parser.addErrorListener(AppErrorListener()) # add error listener
        tree = parser.primaryExpression()
        # evaluator
        visitor = AppVisitor()
        output = visitor.visit(tree)

        AppVisitor.current_state = AppVisitorState.CODE_EXECUTING
        new_data = Programm.deleteFunctionsDefinitions(data.__str__())
        print("WITH DELETED FUNCTION DECLARATIONS:", new_data)
        new_data = Programm.inputFunctionsDefinition(new_data)
        print("WITH INPUT CODE:", new_data)
        
        data = InputStream(new_data)
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
        Programm.dispay_functions()
        
        if len(PyturtleHandler.balls.keys()) > 0 and PyturtleHandler.get_max_queue_len() > 0:
            PyturtleHandler.display_queues_len()
            PyturtleHandler.display_visualisation(PyturtleHandler.get_max_queue_len())
            print("display visualisation ended")

        PyturtleHandler.win.update()

