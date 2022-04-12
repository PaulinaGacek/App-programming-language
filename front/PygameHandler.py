import pygame
import math
from typing import List
from front.Object import Object
from utils.Error import *

class PyGameHandler:

    HEIGHT = 400
    WIDTH = 400
    RADIUS = 20

    win = None
    color = (255, 255, 255)
    isBoardInstantiated = False

    objects = []
    

    def set_height(height):
        PyGameHandler.HEIGHT = height

    def set_width(width):
        PyGameHandler.WIDTH = width

    '''
        Checks if pixel (x,y) is not occupied by object, so if this pixel is available
    '''
    def is_pixel_available(x, y) -> bool:

        for obj in PyGameHandler.objects:
            if obj.is_pixel_inside(x, y) is True:
                return False
        return True

    '''
        Checks if all points on the perimeter of new object are available.
    '''
    def can_object_be_drawn(x,y) -> bool:

        if x-PyGameHandler.RADIUS < 0 or x+ PyGameHandler.RADIUS > PyGameHandler.WIDTH:
            return False
        
        if y-PyGameHandler.RADIUS < 0 or y+PyGameHandler.RADIUS > PyGameHandler.HEIGHT:
            return False
        
        ''''
        # (x_ - x)**2 + (y_ - y)**2 = RADIUS**2
        # y_ = sqrt(RADIUS**2 - (x_ - x)**2) + y
        for x_ in range (0,PyGameHandler.RADIUS):
            x1 = x + x_
            x2 = x - x_
            y1 = math.sqrt(PyGameHandler.RADIUS**2 - (x1 - x)**2) + y
            y2 = - math.sqrt(PyGameHandler.RADIUS**2 - (x2-x)**2) + y

            if not PyGameHandler.is_pixel_available(int(x1), int(y1)):
                print("Pixel: ({},{}) not available".format(x1,int(y1)))
                return False

            if not PyGameHandler.is_pixel_available(x2, int(y2)):
                print("Pixel: ({},{}) not available".format(x2,int(y2)))
                return False
        '''
        return True


    '''
        Creates new object and puts it into the set.
        Center of new object is in (x,y), RADIUS is standaralised for all objects.
    '''
    def add_new_object(name, x, y):

        if x is not None and not PyGameHandler.can_object_be_drawn(x,y):
            raise ObjectCannotBeDrawn(name,x,y)

        object_ = Object(name, x, y, PyGameHandler.RADIUS)
        PyGameHandler.objects.append(object_)
    

    '''
        Used with 'SET' command to modify parameters of the object. 
        Do not use it to move existing objects!
    '''
    def modify_object(name, x, y):
        for obj in PyGameHandler.objects:

            if obj.name == name:
                print("Name: {}, x:{}, y:{}".format(obj.name, x, y))
                if obj.x is None and not PyGameHandler.can_object_be_drawn(x,y):
                    raise ObjectCannotBeDrawn(name,x,y)

                obj.x = x
                obj.y = y
                break

        
    def draw_all_objects():
        PyGameHandler.fill_board_with_color()
        for obj in PyGameHandler.objects:
            if obj.x is not None:
                pygame.draw.circle(PyGameHandler.win, obj.color, (obj.x, obj.y), PyGameHandler.RADIUS)
        
        pygame.display.update()

    def instantiate_board():
        pygame.init()
        PyGameHandler.win = pygame.display.set_mode((PyGameHandler.WIDTH, PyGameHandler.HEIGHT))
        pygame.display.set_caption("A++")
        PyGameHandler.win.fill(PyGameHandler.color)
        PyGameHandler.isBoardInstantiated = True
    
    def fill_board_with_color():
        PyGameHandler.win.fill(PyGameHandler.color)

    def close_board():
        PyGameHandler.isBoardInstantiated = False
        # close board

    def display_all_objects():
        if len(PyGameHandler.objects)==0:
            print("No variables of OBJECT type")
        else:
            print("Variables of OBJECT type")
            for obj in PyGameHandler.objects:
                print("Name: {}, coordinates:({},{})".format(obj.name, obj.x, obj.y))
        
    def move_object(object_, x, y):
        pass