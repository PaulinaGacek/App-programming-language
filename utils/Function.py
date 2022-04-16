from distutils.debug import DEBUG
from utils.Variable import *
class ActionType(Enum):
    DECLARATION = 1,
    DEFINITION = 2,
    CONDITIONAL_STATEMENT = 3,
    PARALLEL = 4;

class Action:

    def __init__(self, type: ActionType):
        self.type = type


class Function:

    def __init__(self, name: str):
        self.name = name
        self.params = [] #tuple (variable names, Variables())
        self.actions = [] # actions which function makes
    
    def displayDetails(self):
        variable_names = ""
        for item in self.params:
            variable_names += "{" +item[1].name + ", " + item[1].getTypeString() +"}, "
        body = ""
        for action in self.actions:
            body += "\t" + action + "\n"
        return "params:" + variable_names + "\nbody: " + body
    
    def getBody(self) -> str:
        body = ""
        for action in self.actions:
            body += " "+ action + " "
        return body