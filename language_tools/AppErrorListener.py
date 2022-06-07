from antlr4.error.ErrorListener import ErrorListener


class AppErrorListener(ErrorListener):

    def __init__(self):
        super(AppErrorListener, self).__init__()

    def syntaxError(self, recognizer, offending_symbol, line, column, msg, e):
        raise Exception("Syntax error at line " + str(line) + ":" + str(column) + ": " + msg)
