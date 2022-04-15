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
        self.params = {} # mapps variable names to Variables()
        self.scopes = {} # mapps var names to their scopes, initialise when function is called
        self.actions = [] # actions which function makes
    
    def displayDetails(self):
        variable_names = ""
        for item in self.params.values():
            variable_names += "{" +item.name + ", " + item.getTypeString() +"}, "
        body = ""
        for action in self.actions:
            body += "\t" + action + "\n"
        return "params:" + variable_names + "\nbody: " + body