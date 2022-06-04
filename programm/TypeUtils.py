from enum import Enum


class Type(Enum):
    TIME = 1
    INT = 2
    OBJECT = 3
    FORCE = 4
    FLOAT = 5


class TypeUtils:

    """
    Converts given string to Type object
    """
    @staticmethod
    def strToType(type_: str):
        if type_ == "TIME":
            return Type.TIME
        elif type_ == "INT":
            return Type.INT
        elif type_ == "OBJECT":
            return Type.OBJECT
        elif type_ == "FLOAT":
            return Type.FLOAT
        else:
            return Type.FORCE

    '''
    Converts Type object to string
    '''
    @staticmethod
    def typeToStr(type_: Type):
        if type_ == Type.TIME:
            return "TIME"
        elif type_ == Type.INT:
            return "INT"
        elif type_ == Type.OBJECT:
            return "OBJECT"
        elif type_ == Type.FORCE:
            return "FORCE"
        elif type_ == Type.FLOAT:
            return "FLOAT"
        return None

    @staticmethod
    def detectTypeFromValue(value):
        # nie skonczone
        if type(value) is int:
            return Type.INT
        if type(value) is float:
            return Type.FLOAT
        else:
            return Type.FORCE
    
    @staticmethod 
    def getTypeFromContext(context):
        if type(context) is int:
            return Type.INT
        if type(context) is float:
            return Type.FLOAT
        # add checking FORCE, OBJECT, TIME
