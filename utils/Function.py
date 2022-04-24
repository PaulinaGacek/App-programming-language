from utils.Variable import *

class Function:

    def __init__(self, name: str, return_type: Type = None, return_stat = None, return_ctx = None):
        self.name = name
        self.params = [] #tuple (variable names, Variables())
        self.actions = [] # actions which function makes
        self.return_type = return_type
        self.return_statement = return_stat
        self.return_ctx = return_ctx # node to return statemaent
    
    def displayDetails(self):
        variable_names = ""
        for item in self.params:
            variable_names += "{" +item[1].name + ", " + item[1].getTypeString() +"}, "
        body = ""
        for action in self.actions:
            body += "\t" + action + "\n"
        output = "params:" + variable_names + "\nbody: " + body
        if self.return_type:
            output += "\nreturns: " + str(self.return_type) + " -> " + str(self.return_statement)
        return output
    
    def getBody(self) -> str:
        body = ""
        for action in self.actions:
            body += " "+ action + " "
        return body