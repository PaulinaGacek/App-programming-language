import math
from utils.Error import *


class Object:

    colors = [(101, 93, 138), (120, 151, 171), (216, 133, 163), (253, 206, 185)]
    NR_OF_OBJECTS = 0

    def __init__(self, name: str, x: int, y:int, radius:int):
        if radius <= 0:
            raise NegativeOrZeroRadius(radius)
        
        if x is not None and y is not None and (x - radius < 0 or y - radius < 0):
            raise WrongObjectsCoordinates(name, x,y)

        self.name = name
        self.x = x
        self.y = y
        self.radius = radius
        self.color = Object.colors[Object.NR_OF_OBJECTS % len(Object.colors)]

        Object.NR_OF_OBJECTS += 1


    '''
        Checks if given pixel (x_, y_) is inside self
        Returns true if it is inside.
    '''
    def is_pixel_inside(self, x_, y_) -> bool:
        diff_x = abs(x_ - self.x)
        diff_y = abs(y_ - self.y)
        if math.sqrt((diff_x ** 2 + diff_y ** 2)) > self.radius:
            return False

        return True