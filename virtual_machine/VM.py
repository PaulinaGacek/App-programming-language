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
from utils.Stack import *
from front.PyturtleHandler import PyturtleHandler

class VM:

    def __init__(self, filename, i_pointer: int, stack_limit: int, memory: int) -> None:
        self.instructions = []
        self.constans = [0] * memory
        self.stack = Stack()
        self.code = open(filename, 'r')

        self.instruction_pointer = i_pointer
        self.stack_pointer = -1
        self.frame_pointer = -1
        self.memory = memory
        self.object_counter = 0
        
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
                    self.stack.push(float(commands[1]))

            elif command_type == Instruction.OCONST:
                if len(commands) < 4:
                    raise Exception("Value was not provided for object const")
                else: # x,y,mass,size
                    for i in range (1,5):
                        self.stack.push(float(commands[i]))
            
            elif command_type == Instruction.FOCONST:
                if len(commands) < 2:
                    raise Exception("Value was not provided for force const")
                else: # angle-force
                    for i in range (1,3):
                        self.stack.push(float(commands[i]))
            
            elif command_type == Instruction.DISPLAY:
                if PyturtleHandler.win is None:
                    PyturtleHandler.instantiate_board()
            
            elif command_type == Instruction.GSTOREI:
                # store variable in given address
                idx = int(commands[1]) % self.memory
                self.constans[idx] = float(self.stack.pop())

            elif command_type == Instruction.GSTOREO:
                idx = int(commands[1]) % self.memory
                for i in range (0,4):
                    self.constans[idx+3-i] = float(self.stack.pop())
            
            elif command_type == Instruction.GSTOREF:
                idx = int(commands[1]) % self.memory
                for i in range (0,2):
                    self.constans[idx+1-i] = float(self.stack.pop())
            
            elif command_type == Instruction.GLOADI:
                idx = int(commands[1]) % self.memory
                self.stack.push(self.constans[idx])
            
            elif command_type == Instruction.GLOADO:
                idx = int(commands[1])
                for i in range (0,4):
                    self.stack.push(self.constans[idx+i])
            
            elif command_type == Instruction.GLOADF:
                idx = int(commands[1])
                for i in range (0,2):
                    self.stack.push(self.constans[idx+i])
            
            elif command_type == Instruction.GDRAW_OBJECT:
                # attributes get from stack
                idx = int(commands[1]) # mem address
                name = "obj_" + str(idx) + "_" + str(self.object_counter)
                self.object_counter+=1
                size = self.stack.pop()
                mass = self.stack.pop()
                y = self.stack.pop()
                x = self.stack.pop()
                
                if not PyturtleHandler.can_object_be_drawn(x, y, int(size)):
                    raise ObjectCannotBeDrawn(name, x, y)
                PyturtleHandler.add_new_object(name, x, y,mass, int(size))

            elif command_type == Instruction.GAPPLY_FORCE:
                idx_obj = int(commands[1]) # mem address
                idx_force = int(commands[2]) # mem address
                idx_time = int(commands[3]) # mem address
            
            elif command_type == Instruction.JMP:
                if len(commands) < 2:
                    raise Exception("Value was not provided for jump")
                self.instruction_pointer = int(commands[1]) - 1
            
            elif command_type == Instruction.JMP_TRUE:
                if len(commands) < 2:
                    raise Exception("Value was not provided for jump")
                if self.stack.pop() > 0: # true
                    self.instruction_pointer = int(commands[1]) - 1
            
            elif command_type == Instruction.JMP_FALSE:
                if len(commands) < 2:
                    raise Exception("Value was not provided for jump")
                if self.stack.pop() == 0: # false
                    self.instruction_pointer = int(commands[1]) - 1
            
            elif command_type == Instruction.POP:
                self.stack.pop()
            
            elif command_type == Instruction.ADD_I:
                a = self.stack.pop()
                b = self.stack.pop()
                self.stack.push(a+b)
            
            elif command_type == Instruction.SUB_I:
                b = self.stack.pop()
                a = self.stack.pop()
                self.stack.push(a-b)
            
            elif command_type == Instruction.MULT_I:
                b = self.stack.pop()
                a = self.stack.pop()
                self.stack.push(a*b)
            
            elif command_type == Instruction.DIV_I:
                b = self.stack.pop()
                a = self.stack.pop()
                self.stack.push(a/b)
            
            elif command_type == Instruction.EQ_I:
                b = self.stack.pop()
                a = self.stack.pop()
                if a==b:
                    self.stack.push(1)
                else:
                    self.stack.push(0)

            elif command_type == Instruction.LT_I:
                b = self.stack.pop()
                a = self.stack.pop()
                if a<b:
                    self.stack.push(1)
                else:
                    self.stack.push(0)
            
            elif command_type == Instruction.LT_EQ:
                b = self.stack.pop()
                a = self.stack.pop()
                if a<=b:
                    self.stack.push(1)
                else:
                    self.stack.push(0)
            
            elif command_type == Instruction.GT_I:
                b = self.stack.pop()
                a = self.stack.pop()
                if a>b:
                    self.stack.push(1)
                else:
                    self.stack.push(0)
            
            elif command_type == Instruction.GT_EQ:
                b = self.stack.pop()
                a = self.stack.pop()
                if a>=b:
                    self.stack.push(1)
                else:
                    self.stack.push(0)
            
            elif command_type == Instruction.LLOAD_I:
                idx = int(commands[1]) % self.memory
                self.stack.push(self.stack.stack[idx+self.frame_pointer])
            
            else:
                raise Exception("Unknown operation code: " + commands[0])
            
            print("Constants: ", self.constans)
            print("Stack", self.stack.stack)
