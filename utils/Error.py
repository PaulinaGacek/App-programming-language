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

class FunctionRedefinitionError(Exception):
    """ Raised when user tries to declare again existing function
    
    Attributes:
        name: str -- name of the existing function which is tried to be redefined
        type: str -- type of existing function
        message -- explanation of the error
    """
    
    def __init__(self, name: str, message=None):
        self.name = name
        self.message = "Redefinition of existing function {}".format(self.name)
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


class UndefinedFunctionReferenceError(Exception):
    """ Raised when user tries to define not existing function
    
    Attributes:
        name -- name of not existing function which is tried to be defined
        message -- explanation of the error
    """
    
    def __init__(self, name: str, message=None):
        self.name = name
        self.message = "Undefined reference to function {}".format(name)
        super().__init__(self.message)

    def __str__(self):
        return self.message


class ParameterError(Exception):
    """ 
    
    Attributes:
        message -- explanation of the error
    """
    
    def __init__(self, message=None):
        if message is None:
            self.message = "Second parameter is null"
        super().__init__(self.message)

    def __str__(self):
        return self.message


class NegativeOrZeroRadius(Exception):
    """ Raised when Object with radius <= 0 is to be created

    Attributes:
        radius -- radius
        message -- explanation of the error
    """

    def __init__(self, radius: int, message=None):
        self.message = "Wrong radius {} -> it has to be positive".format(radius)
        super().__init__(self.message)

    def __str__(self):
        return self.message

class WrongObjectsCoordinates(Exception):
    """ Raised when Object is to be created with negative coordinates or coordinates which
        implies being out of board

    Attributes:
        name -- object's name
        radius -- radius
        message -- explanation of the error
    """

    def __init__(self, name: str, x: int, y: int, message=None):
        if message is None:
            self.message = "Wrong coordinates {},{} for object {}".format(x,y,name)
        super().__init__(self.message)

    def __str__(self):
        return self.message


class ObjectCannotBeDrawn(Exception):
    def __init__(self, name: str, x: int, y: int, message=None):
        if message is None:
            self.message = "Object {} cannot be drawn at ({},{})".format(name,x,y)
        super().__init__(self.message)

    def __str__(self):
        return self.message


class Error(Exception):
    def __init__(self, message):
        self.message = message
        super().__init__(self.message)

    def __str__(self):
        return self.message


class WrongNumberOfArguments(Exception):
    """ 
    Attributes:
        name -- object's name
        required -- nr of required args
        privided -- nr of provided args
        message -- explanation of the error
    """

    def __init__(self, name: str, required: int, provided: int, message=None):
        if message is None:
            self.message = "Wrong nr of arguments given to function {} -> {} required but {} were provided".format(name, required, provided)
        super().__init__(self.message)

    def __str__(self):
        return self.message


class UnallowedCasting(Exception):

    def __init__(self, type1, type2, message=None):
        if message is None:
            self.message = "Unallowed casting from {} to {}".format(type1, type2)
        super().__init__(self.message)

    def __str__(self):
        return self.message

class OperatorNotDefininedForType(Exception):

    def __init__(self, operator, type, message=None):
        if message is None:
            self.message = "Operator {} is not defined for {}".format(operator, type)
        super().__init__(self.message)

    def __str__(self):
        return self.message

class FunctionHasToReturnSomething(Exception):

    def __init__(self, function, type, message=None):
        if message is None:
            self.message = "Function {} has to return {}".format(function, type)
        super().__init__(self.message)

    def __str__(self):
        return self.message