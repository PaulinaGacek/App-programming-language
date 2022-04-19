import sys
from antlr4 import *
from dist14.AppLexer import AppLexer
from dist14.AppParser import AppParser
from dist14.AppVisitor import *
from utils.AppErrorListener import *
from utils.Programm import Programm
from front.PyturtleHandler import PyturtleHandler


def interprateInput(data):
    # lexer
    AppVisitor.current_state = AppVisitorState.FUNC_DECLARATION_CHECKING
    lexer = AppLexer(data)
    stream = CommonTokenStream(lexer)
    # parser
    parser = AppParser(stream)
    parser.addErrorListener(AppErrorListener())  # add error listener
    try:
        tree = parser.primaryExpression()
    except Exception as e:
        print(e)
        return

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

    Programm.updateObjectsPositionsInVariableSet()
    Programm.displayVariables()
    Programm.dispay_functions()

    if len(PyturtleHandler.balls.keys()) > 0 and PyturtleHandler.get_max_queue_len() > 0:
        PyturtleHandler.display_queues_len()
        PyturtleHandler.display_visualisation(
            PyturtleHandler.get_max_queue_len())
        print("display visualisation ended")

    PyturtleHandler.win.update()

DIR = "examples/"


if __name__ == "__main__":

    PyturtleHandler.instantiate_board()

    if len(sys.argv) == 1: # no arguments
        while True:
            data = InputStream(input(">>> "))
            interprateInput(data)
    elif len(sys.argv) > 1:
        file = DIR + sys.argv[1]
        data = FileStream(file, encoding='utf-8')
        interprateInput(data)
