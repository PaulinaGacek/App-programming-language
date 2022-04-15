from utils.Variable import *
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
        return "params:" + variable_names