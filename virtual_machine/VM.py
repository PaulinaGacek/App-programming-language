from Object import *
from stack import Stack

class VM:

    def __init__(self, filename, i_pointer: int, stack_limit: int) -> None:
        self.instructions = []
        self.constans = []
        self.stack = Stack()
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
            elif command_type == Operation.ICONST:
                if len(commands) < 2:
                    raise Exception("Value was not provided for const")
                else:
                    int_val = commands[1]
                    self.constans.append(int_val)
                    self.stack.push(int_val)
            else:
                raise Exception("Unknown operation code: " + commands[0])
