from enum import Enum
from utils.Error import *

class Type(Enum):
    TIME = 1
    INT = 2
    OBJECT = 3
    FORCE = 4

class Variable:

    def __init__(self, name: str, type: Type, value: int, value2=None):
        self.name = name
        self.type = type
        self.value = value
        self.value2 = value2
    
    def displayDetails(self):
        if self.value2 is None:
            return "Name: {}, Type: {}, Value: {}".format(self.name, self.getTypeString(), self.value, self.value2)
        else:
            return "Name: {}, Type: {}, Values: ({},{})".format(self.name, self.getTypeString(), self.value, self.value2)
    
    def getTypeString(self):
        if self.type == Type.TIME:
            return "TIME" 
        elif self.type == Type.INT:
            return "INT"
        elif self.type == Type.OBJECT:
            return "OBJECT"
        else:
            return "FORCE"
