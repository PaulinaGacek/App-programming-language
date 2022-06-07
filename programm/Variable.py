from programm.TypeUtils import *


class Variable:

    def __init__(self, name: str, type_: Type, value: int, value2=None):
        self.name = name
        self.type = type_
        self.value = value
        self.value2 = value2
    
    '''
    Returns string with variable's details
    '''
    def displayDetails(self):
        if self.value2 is None:
            return "Name: {}, Type: {}, Value: {}".format(self.name, self.getTypeString(), self.value, self.value2)
        else:
            return "Name: {}, Type: {}, Values: ({},{})".format(self.name, self.getTypeString(), self.value, self.value2)
    
    '''
    Returns self.type in the string format
    '''
    def getTypeString(self):
        if self.type == Type.TIME:
            return "TIME" 
        elif self.type == Type.INT:
            return "INT"
        elif self.type == Type.OBJECT:
            return "OBJECT"
        elif self.type == Type.FLOAT:
            return "FLOAT"
        else:
            return "FORCE"
