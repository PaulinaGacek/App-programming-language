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
            vm = VM(filename, -1, 1024)
            vm.cpu()
        except FileNotFoundError:
            print("No such file")
