import math
from utils.Error import *


class Object:

    def __init__(self, name: str, x: int, y:int, radius:int):
        self.name = name
        self.x = x
        self.y = y
        self.radius = radius

        if radius <= 0:
            raise NegativeOrZeroRadius(radius)
        
        if x - radius < 0 or y - radius < 0:
            raise WrongObjectsCoordinates(name, x,y)


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