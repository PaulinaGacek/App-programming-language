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
from stack import *
from front.PyturtleHandler import PyturtleHandler
from animations import *

class VM:

    def __init__(self, filename, i_pointer: int, stack_limit: int, memory: int) -> None:
        self.instructions = []
        self.constans = [0] * memory
        self.stack = Stack_PR(30)
        self.code = open(filename, 'r')

        self.instruction_pointer = i_pointer
        self.frame_pointer = -1
        self.object_counter = 0
        self.variables = {} #idx to name
        
        self.stacklimit = stack_limit
        while True:
            line = self.code.readline()
            if line:
                for string in line.split():
                    self.instructions.append(float(string))
            else:
                break
        self.code.close()
    
    def cpu(self):
        self.evaluate()        

    def evaluate(self):
        while True:

            # fetch
            if self.instruction_pointer == len(self.instructions):
                print("END")
                break

            # decode
            print(Instruction(int(self.instructions[self.instruction_pointer])))
            command_type = int(self.instructions[self.instruction_pointer])
            self.instruction_pointer += 1
            if command_type == Instruction.HALT:
                return
            
            #### VARIABLES #####
            elif command_type == Instruction.ICONST or command_type == Instruction.FLCONST or command_type == Instruction.TCONST:
                self.stack.push(self.instructions[self.instruction_pointer])
                self.instruction_pointer+=1

            elif command_type == Instruction.OCONST:
                for i in range (1,5):
                    self.stack.push(self.instructions[self.instruction_pointer])
                    self.instruction_pointer+=1
            
            elif command_type == Instruction.FOCONST:
                for i in range (1,3):
                    self.stack.push(self.instructions[self.instruction_pointer])
                    self.instruction_pointer+=1
            
            elif command_type == Instruction.DISPLAY:
                if PyturtleHandler.win is None:
                    PyturtleHandler.instantiate_board()
            
            elif command_type == Instruction.GSTOREI:
                # store variable in given address
                idx = int(self.instructions[self.instruction_pointer])
                self.constans[idx] = float(self.stack.pop())
                self.instruction_pointer+=1

            elif command_type == Instruction.GSTOREO:
                idx = int(self.instructions[self.instruction_pointer])
                self.instruction_pointer+=1
                for i in range (0,4):
                    self.constans[idx+3-i] = float(self.stack.pop())
            
            elif command_type == Instruction.GSTOREF:
                idx = int(self.instructions[self.instruction_pointer])
                self.instruction_pointer+=1
                for i in range (0,2):
                    self.constans[idx+1-i] = float(self.stack.pop())
            
            elif command_type == Instruction.GLOADI:
                idx = int(self.instructions[self.instruction_pointer])
                self.instruction_pointer+=1
                self.stack.push(self.constans[idx])
            
            elif command_type == Instruction.GLOADO:
                idx = int(self.instructions[self.instruction_pointer])
                self.instruction_pointer+=1
                for i in range (0,4):
                    self.stack.push(self.constans[idx+i])
            
            elif command_type == Instruction.GLOADF:
                idx = int(self.instructions[self.instruction_pointer])
                self.instruction_pointer+=1
                for i in range (0,2):
                    self.stack.push(self.constans[idx+i])
            
            elif command_type == Instruction.GDRAW_OBJECT:
                # attributes get from stack
                idx =  int(self.instructions[self.instruction_pointer]) # mem address
                self.instruction_pointer+=1
                name = "obj_" + str(idx) + "_" + str(self.object_counter)
                self.object_counter+=1
                size = int(self.stack.pop())
                mass = int(self.stack.pop())
                y = int(self.stack.pop())
                x = int(self.stack.pop())

                self.variables[idx] = name
                Animations.draw_object(name, x,y,size,mass)

            elif command_type == Instruction.GAPPLY_FORCE:
                time = int(self.stack.pop())
                force_power = int(self.stack.pop())
                force_ang = self.stack.pop()
                idx = int(self.stack.pop())
                var_name = self.variables[idx]
                
                Animations.apply_force(var_name, force_ang, force_power, time)
            
            elif command_type == Instruction.PARALLEL_START:
                Animations.inside_parallel=True
            
            elif command_type == Instruction.PARALLEL_END:
                Animations.inside_parallel=False
                Animations.animate()
            
            elif command_type == Instruction.JMP:
                idx =  int(self.instructions[self.instruction_pointer])
                self.instruction_pointer = idx
            
            elif command_type == Instruction.JMP_TRUE:
                if self.stack.pop() > 0: # true
                    idx =  int(self.instructions[self.instruction_pointer])
                    self.instruction_pointer = idx
                else:
                    self.instruction_pointer += 1
            
            elif command_type == Instruction.JMP_FALSE:
                if self.stack.pop() == 0: # false
                    idx =  int(self.instructions[self.instruction_pointer])
                    self.instruction_pointer = idx
                else:
                    self.instruction_pointer += 1
            
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
                idx = int(self.instructions[self.instruction_pointer])
                self.instruction_pointer+=1
                self.stack.push(self.stack.stack[idx+self.frame_pointer])
            
            elif command_type == Instruction.PUSH_TRUE:
                self.stack.push(1)
            
            elif command_type == Instruction.PUSH_FALSE:
                self.stack.push(0)
            
            elif command_type == Instruction.AND:
                if self.stack.pop()>0 and self.stack.pop()>0:
                    self.stack.push(1)
                else:
                    self.stack.push(0)
            
            elif command_type == Instruction.OR:
                if self.stack.pop()==0 and self.stack.pop()==0:
                    self.stack.push(0)
                else:
                    self.stack.push(1)
            
            elif command_type == Instruction.XOR:
                if self.stack.pop()==0 and self.stack.pop()!=0:
                    self.stack.push(1)
                elif self.stack.pop()!=0 and self.stack.pop()==0:
                    self.stack.push(1)
                else:
                    self.stack.push(0)
            
            elif command_type == Instruction.CALL:
                addr = int(self.instructions[self.instruction_pointer])
                self.instruction_pointer+=1
                nargs = int(self.instructions[self.instruction_pointer])
                self.instruction_pointer+=1
                self.stack.push(nargs)
                self.stack.push(self.frame_pointer)
                self.stack.push(self.instruction_pointer)
                self.frame_pointer = self.stack.pointer
                self.instruction_pointer = addr
            
            elif command_type == Instruction.RET:
                rvalue = self.stack.pop()
                self.stack.pointer = self.frame_pointer
                self.instruction_pointer = self.stack.pop()
                self.frame_pointer = self.stack.pop()
                nargs = self.stack.pop()
                self.stack.pointer -= nargs
                self.stack.push(rvalue)
            else:
                raise Exception("Unknown operation code: " + int(self.instructions[self.instruction_pointer]))

            print("Constants: ", self.constans)
            print("Stack", self.stack.stack[:self.stack.pointer+1])
