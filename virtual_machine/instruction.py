from enum import IntEnum

class Instruction(IntEnum):
    HALT = 0
    ICONST = 1 # INT
    FLCONST = 2 # FLOAT
    TCONST = 3 # TIME
    OCONST = 4 # OBJECT
    FOCONST = 5 # FORCE
    DISPLAY = 6 # DISPLAY SCREEN

    GSTOREI = 7 # STORE GLOBAL INT, TIME OR FLOAT
    GSTOREO = 8 # STORE GLOBAL OBJECT
    GSTOREF = 9 # STORE GLOBAL FORCE
    GLOADI = 10 # LOAD GLOBAL INT, TIME OR FLOAT
    GLOADO = 11 # LOAD GLOBAL OBJECT
    GLOADF = 12 # LOAD GLOBAL FORCE

    GDRAW_OBJECT = 13 # DRAW OBJECT - POINTER TO MEM
    GAPPLY_FORCE = 14

    JMP = 15 # JUMP
    JMP_TRUE = 16 # JUMP IF TRUE
    JMP_FALSE = 17 # JUMP IF FALSE
    POP = 18 # POP FROM STACK

    ADD_I = 19
    SUB_I = 20
    DIV_I = 21
    MULT_I = 22
    EQ_I = 23
    LT_I = 24
    GT_I = 25
    LT_EQ = 26 # LESS THAN OR EQUAL
    GT_EQ = 27 # GREATER THAN OR EQUAL

    LLOAD_I = 28 # LOAD LOCAL INT, TIME, FLOAT
    LLOAD_O = 29 # LOAD LOCAL OBJECT
    LLOAD_F = 30 # LOAD LOCAL FORCE

    PARALLEL_START = 31 # OPENS PARALLEL BLOCK
    PARALLEL_END = 32 # CLOSES PARALLEL BLOCK
