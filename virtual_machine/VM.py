from asyncio import constants
import sys
import os
myDir = os.getcwd()
sys.path.append(myDir)

from pathlib import Path
path = Path(myDir)
a=str(path.parent.absolute())

sys.path.append(a)

from Object import *
from instruction import *
from utils.Error import *
from front.PyturtleHandler import PyturtleHandler

class VM:

    def __init__(self, filename, i_pointer: int, stack_limit: int) -> None:
        self.instructions = []
        self.constans = []
        self.stack = []
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
                print("END")
                break
            commands = self.instructions[self.instruction_pointer].split()
            print(commands)

            # decode
            command_type = int(commands[0])
            if command_type == Instruction.HALT:
                return
            
            #### VARIABLES #####
            elif command_type == Instruction.ICONST or command_type == Instruction.FLCONST or command_type == Instruction.TCONST:
                if len(commands) < 2:
                    raise Exception("Value was not provided for const")
                else:
                    int_val = float(commands[1])
                    self.stack.append(int_val)
                    self.stack_pointer += 1

            elif command_type == Instruction.OCONST:
                if len(commands) < 4:
                    raise Exception("Value was not provided for object const")
                else: # x,y,mass,size
                    for i in range (1,5):
                        int_val = float(commands[i])
                        self.stack.append(int_val)
                        self.stack_pointer += 1
            
            elif command_type == Instruction.FOCONST:
                if len(commands) < 2:
                    raise Exception("Value was not provided for force const")
                else: # angle-force
                    for i in range (1,3):
                        int_val = float(commands[i])
                        self.stack.append(int_val)
                        self.stack_pointer += 1
            
            elif command_type == Instruction.DISPLAY:
                if PyturtleHandler.win is None:
                    PyturtleHandler.instantiate_board()
            
            elif command_type == Instruction.GSTOREI:
                idx = int(commands[1])
                while len(self.constans) <= idx:
                    self.constans.append(0)
                value = self.stack[self.stack_pointer]
                self.constans[idx] = float(value)
                self.stack.remove(value)
                self.stack_pointer -= 1

            elif command_type == Instruction.GSTOREO:
                idx = int(commands[1])
                while len(self.constans) <= idx + 3:
                    self.constans.append(0)
                for i in range (0,4):
                    value = self.stack[self.stack_pointer]
                    self.constans[idx+3-i] = float(value)
                    self.stack.remove(value)
                    self.stack_pointer -= 1
            
            elif command_type == Instruction.GSTOREF:
                idx = int(commands[1])
                while len(self.constans) <= idx + 1:
                    self.constans.append(0)
                for i in range (0,2):
                    value = self.stack[self.stack_pointer]
                    self.constans[idx+1-i] = float(value)
                    self.stack.remove(value)
                    self.stack_pointer -= 1
            
            elif command_type == Instruction.GLOADI:
                idx = int(commands[1])
                value = self.constans[idx] 
                self.stack.append(value)
                self.stack_pointer += 1
            
            elif command_type == Instruction.GLOADO:
                idx = int(commands[1])
                for i in range (0,4):
                    value = self.constans[idx+i] 
                    self.stack.append(value)
                    self.stack_pointer += 1
            
            elif command_type == Instruction.GLOADF:
                idx = int(commands[1])
                for i in range (0,2):
                    value = self.constans[idx+i] 
                    self.stack.append(value)
                    self.stack_pointer += 1
            
            elif command_type == Instruction.GDRAW_OBJECT:
                if len(commands) < 2:
                    raise Exception("Value was not provided for object drawing")
                idx = int(commands[1])
                name = "obj_"+str(idx)
                x = self.constans[idx]
                y = self.constans[idx + 1]
                mass = self.constans[idx+2]
                size = self.constans[idx+3]
                
                if not PyturtleHandler.can_object_be_drawn(x, y, int(size)):
                    raise ObjectCannotBeDrawn(name, x, y)
                PyturtleHandler.add_new_object(name, x, y,mass, int(size))

            else:
                raise Exception("Unknown operation code: " + commands[0])
            
            print("Constants: ", self.constans)
            print("Stack: ", self.stack)
