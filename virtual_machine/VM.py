import sys
import os
myDir = os.getcwd()
sys.path.append(myDir)

from pathlib import Path
path = Path(myDir)
a=str(path.parent.absolute())

sys.path.append(a)

from Object import *
from front.PyturtleHandler import PyturtleHandler

class VM:

    def __init__(self, filename, i_pointer: int, stack_limit: int) -> None:
        self.instructions = []
        self.constans = []
        self.stack = []
        self.memory = []
        self.global_variables = [] # name - type - address in memory
        self.code = open(filename, 'r')

        self.instruction_pointer = i_pointer
        self.stack_pointer = -1
        self.frame_pointer = -1
        
        self.stacklimit = stack_limit
        while True:
            line = self.code.readline()
            if line:
                self.instructions.append(line)
            else:
                break
        self.code.close()
    
    def cpu(self):
        self.evaluate()        

    def evaluate(self):
        while True:

            # fetch
            self.instruction_pointer += 1
            if self.instruction_pointer >= len(self.instructions):
                print("Constants: ", self.constans)
                print("END")
                break
            commands = self.instructions[self.instruction_pointer].split()
            print(commands)

            # decode
            command_type = int(commands[0])
            if command_type == Operation.HALT:
                return
            
            #### VARIABLES #####
            elif command_type == Operation.ICONST or command_type == Operation.FLCONST or command_type == Operation.TCONST:
                if len(commands) < 2:
                    raise Exception("Value was not provided for const")
                else:
                    int_val = commands[1]
                    self.constans.append(int_val)
                    self.stack.append(int_val)
                    self.stack_pointer += 1

            elif command_type == Operation.OCONST:
                if len(commands) < 4:
                    raise Exception("Value was not provided for object const")
                else: # x,y,mass,size
                    for i in range (1,5):
                        int_val = commands[i]
                        self.constans.append(int_val)
                        self.stack.append(int_val)
                        self.stack_pointer += 1
            elif command_type == Operation.FOCONST:
                if len(commands) < 2:
                    raise Exception("Value was not provided for force const")
                else: # angle-force
                    for i in range (1,3):
                        int_val = commands[i]
                        self.constans.append(int_val)
                        self.stack.append(int_val)
                        self.stack_pointer += 1
            elif command_type == Operation.DISPLAY:
                if PyturtleHandler.win is None:
                    PyturtleHandler.instantiate_board()
            else:
                raise Exception("Unknown operation code: " + commands[0])
