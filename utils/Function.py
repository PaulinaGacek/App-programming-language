from utils.Variable import *

class Function:

    def __init__(self, name: str, return_type: Type = None):
        self.name = name
        self.params = [] #tuple (variable names, Variables())
        self.actions = [] # actions which function makes
        self.return_type = return_type
        self.return_value
    
    def displayDetails(self):
        variable_names = ""
        for item in self.params:
            variable_names += "{" +item[1].name + ", " + item[1].getTypeString() +"}, "
        body = ""
        for action in self.actions:
            body += "\t" + action + "\n"
        return "params:" + variable_names + "\nbody: " + body + "\nreturns: " + str(self.return_type)
    
    def getBody(self) -> str:
        body = ""
        for action in self.actions:
            body += " "+ action + " "
        return body