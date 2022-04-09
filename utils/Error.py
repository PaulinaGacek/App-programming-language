from utils.Variable import *
class Error(Exception):
    """Base class for other exceptions"""
    pass

class VariableRedefinitionError(Exception):
    """ Raised when users tries to define again existing variable
    
    Attributes:
        variable -- existing variable which is tried to be redefined
        message -- explanation of the error
    """
    
    def __init__(self, variable: Variable, 
    message=None):
        self.variable = variable
        self.message = "Redefinition of existing variable {} of type {}".format(variable.name, variable.getTypeString())
        super().__init__(self.message)

    def __str__(self):
        return self.message