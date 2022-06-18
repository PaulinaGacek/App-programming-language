class Stack:
    def __init__(self):
        self.stack = []
    
    def push(self, item):
        self.stack.append(item)
    
    def pop(self):
        if len(self.stack) == 0:
            return None
        return self.stack.pop(-1)
    
    def top(self):
        if len(self.stack) == 0:
            return None
        return self.stack[-1]
    
    def getSize(self):
        return len(self.stack)
    
    def display(self):
        print(self.stack)