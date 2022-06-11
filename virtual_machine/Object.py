from enum import Enum, IntEnum

class VariableType(Enum):
    INT = 1
    TIME = 2
    FLOAT = 3
    FORCE = 4
    OBJECT = 5

class VariableValue:
    def __init__(self, type: VariableType, value) -> None:
        self.type = type
        self.value = value

class Operation(IntEnum):
    HALT = 0
    ICONST = 1 # INT
    FLCONST = 2 # FLOAT
    OCONST = 3 # OBJECT
    TCONST = 4 # TIME
    FOCONST = 5 # FORCE