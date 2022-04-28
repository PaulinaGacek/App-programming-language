from enum import Enum

class Type(Enum):
    TIME = 1
    INT = 2
    OBJECT = 3
    FORCE = 4
    FLOAT = 5

class TypeUtils:
    '''
    Converts given string to Type object
    '''
    @staticmethod
    def strToType(type: str):
        if type == "TIME":
            return Type.TIME
        elif type == "INT":
            return Type.INT
        elif type == "OBJECT":
            return Type.OBJECT
        elif type == "FLOAT":
            return Type.FLOAT
        else:
            return Type.FORCE

    '''
    Converts Type object to string
    '''
    @staticmethod
    def typeToStr(type: Type):
        if type == Type.TIME:
            return "TIME"
        elif type == Type.INT:
            return "INT"
        elif type == Type.OBJECT:
            return "OBJECT"
        elif type == Type.FORCE:
            return "FORCE"
        elif type == Type.FLOAT:
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
    
    