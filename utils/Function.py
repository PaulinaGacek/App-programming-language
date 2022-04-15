from utils.Variable import *
class Function:

    def __init__(self, name: str, params=None):
        self.name = name
        self.params = params # variables
    
    def displayDetails(self):
        return "params:"