class VariableRedefinitionError(Exception):
    """ Raised when user tries to declare again existing variable
    
    Attributes:
        name: str -- name of the existing variable which is tried to be redefined
        type: str -- type of existing variable
        message -- explanation of the error
    """
    
    def __init__(self, name: str, type: str, message=None):
        self.name = name
        self.type = type
        self.message = "Redefinition of existing variable {} of type {}".format(self.name, self.type)
        super().__init__(self.message)

    def __str__(self):
        return self.message


class UndefinedVariableReferenceError(Exception):
    """ Raised when user tries to define not existing variable
    
    Attributes:
        name -- name of not existing variable which is tried to be defined
        message -- explanation of the error
    """
    
    def __init__(self, name: str, message=None):
        self.name = name
        self.message = "Undefined reference to variable {}".format(name)
        super().__init__(self.message)

    def __str__(self):
        return self.message

class ParameterError(Exception):
    """ Raised when user tries to define not existing variable
    
    Attributes:
        message -- explanation of the error
    """
    
    def __init__(self, message=None):
        self.message = "Second parameter is null"
        super().__init__(self.message)

    def __str__(self):
        return self.message