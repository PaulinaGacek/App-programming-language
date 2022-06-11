import sys
from antlr4 import *
from language_tools.AppLexer import AppLexer
from language_tools.AppParser import AppParser
from language_tools.AppVisitor import *
from language_tools.AppErrorListener import *
from programm.Programm import Programm
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
    data = InputStream(data.__str__())
    # lexer
    lexer = AppLexer(data)
    stream = CommonTokenStream(lexer)
    # parser
    parser = AppParser(stream)
    tree = parser.primaryExpression()
    # evaluator
    visitor = AppVisitor()
    output = visitor.visit(tree)
    if Programm.debug:
        Programm.displayVariables()
        Programm.dispay_functions()

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
        for idx in range(2, len(sys.argv)):
            if sys.argv[idx] == '-debug' or sys.argv[idx] == '-d':
                Programm.enable_debug()
            elif sys.argv[idx] == '-vm':
                Programm.enable_vm()
            else:
                raise Exception("Improper flag")
        data = FileStream(file, encoding='utf-8')
        interprateInput(data)
