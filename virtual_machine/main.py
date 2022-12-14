import sys
from antlr4 import *
from VM import VM
DIR = "./virtual_machine/code_examples/"

if __name__ == "__main__":

    if len(sys.argv) <= 1: # no arguments
        raise Exception("File name is missing")
    else:
        filename = DIR + sys.argv[1]
        print("File name: " + filename)
        try:
            FACTORIAL = 22
            THROW = 0
            vm = VM(filename, THROW, 1024, 30)
            vm.cpu()
        except FileNotFoundError:
            print("No such file")
