class Instruction:
    counter = 0

    def __init__(self, name: str, args: int=0) -> None:
        self.name = name
        self.args = args
        self.idx = Instruction.counter
        Instruction.counter += 1

instructions = [
    Instruction("HALT"),
    Instruction("ICONST", 1)
]