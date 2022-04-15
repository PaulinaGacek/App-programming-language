from utils.Variable import *
class Function:

    def __init__(self, name: str, params=[]):
        self.name = name
        self.params = params # variables
    
    def displayDetails(self):
        variable_names = ""
        for item in self.params:
            variable_names += item.name + ", "
        return "params:" + variable_names