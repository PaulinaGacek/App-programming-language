from enum import Enum

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
        self.value2 = None
        if type==Type.FORCE:
            self.value2 = value2
            if value2 is None or type(value) is not int:
                raise TypeError("Second parameter of force variable is not int")
    
    def displayDetails(self):
        return "Name:{}".format(self.name)
