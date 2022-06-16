from enum import Enum, IntEnum

class VariableType(Enum):
    INT = 1 # 1 cell
    TIME = 2 # 1 cell
    FLOAT = 3 # 1 cell
    FORCE = 4 # 2 cells
    OBJECT = 5 # 4 cells - x,y,mass,size

class VariableValue:
    def __init__(self, type: VariableType, value) -> None:
        self.type = type
        self.value = value

class Operation(IntEnum):
    HALT = 0
    ICONST = 1 # INT
    FLCONST = 2 # FLOAT
    TCONST = 3 # TIME
    OCONST = 4 # OBJECT
    FOCONST = 5 # FORCE
    DISPLAY = 6 # DISPLAY SCREEN