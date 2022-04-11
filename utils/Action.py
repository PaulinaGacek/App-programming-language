class ActionType(Enum):
    MOVEMENT = 1

class Action:
    """
    Representation of an action
    """

    def __init__(self, type: ActionType, time):
        self.actionType = type
        self.time = time
