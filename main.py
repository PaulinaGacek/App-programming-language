import sys
from antlr4 import *
from language_tools.AppLexer import AppLexer
from language_tools.AppParser import AppParser
from language_tools.AppVisitor import *
from language_tools.AppErrorListener import *
from programm.Programm import Programm
from front.PyturtleHandler import PyturtleHandler
from virtual_machine.VMVisitor import VMVisitor


def interprateInput(data):
    # lexer
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
    
    AppVisitor.current_state = AppVisitorState.FUNC_DECLARATION_CHECKING
    visitor = AppVisitor()
    output = visitor.visit(tree)

    data = InputStream(data.__str__())
    # lexer
    lexer = AppLexer(data)
    stream = CommonTokenStream(lexer)
    # parser
    parser = AppParser(stream)
    tree = parser.primaryExpression()

    if not Programm.vm_conversion:
        # evaluator
        AppVisitor.current_state = AppVisitorState.CODE_EXECUTING
        visitor = AppVisitor()
        output = visitor.visit(tree)

        if Programm.debug:
            Programm.displayVariables()
            Programm.dispay_functions()

        PyturtleHandler.win.update()
    else:
        visitor = VMVisitor()
        output = visitor.visit(tree)

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
