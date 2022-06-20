class Stack_PR:
    def __init__(self, size: int):
        self.stack = [0]*size
        self.pointer = -1
    
    def push(self, item):
        self.pointer += 1
        self.stack[self.pointer] = item
    
    def pop(self):
        value = self.stack[self.pointer]
        self.stack[self.pointer] = 0
        self.pointer -= 1
        return value
    
    def top(self):
        if len(self.stack) == 0:
            return None
        return self.stack[self.pointer]
    
    def display(self):
        print(self.stack)