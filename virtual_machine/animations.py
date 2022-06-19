from programm.Programm import *

from front.PyturtleHandler import *

class Animations:
    def __init__(self) -> None:
        pass

    def apply_force(self, object_name: str, angle, power, time, delay=0):
        if Programm.getVaribaleFromProperScope(object_name) is None:
            raise UndefinedVariableReferenceError(object_name)
        force_ = Force(angle, power, time, delay)