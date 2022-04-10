import pygame
from typing import List
from front.Object import Object

class PyGameHandler:

    HEIGHT = 400
    WIDTH = 400
    RADIUS = 30

    win = None
    color = (255, 255, 255)
    isBoardInstantiated = False

    objects: List[Object]
    

    def set_height(height):
        PyGameHandler.HEIGHT = height

    def set_width(width):
        PyGameHandler.WIDTH = width

    '''
        Checks if pixel (x,y) is not occupied by object, so if this pixel is available
    '''
    def is_pixel_available(x, y) -> bool:

        for obj in self.objects:
            if obj.is_pixel_inside(x, y) is True:
                return False
            else:
                return True

    '''
        Checks if all points on the perimeter of new object are available.
    '''
    def can_object_be_draw(x,y) -> bool:

        if x-PyGameHandler.RADIUS < 0 or x+ PyGameHandler.RADIUS > PyGameHandler.WIDTH:
            return false
        
        if y-PyGameHandler.RADIUS < 0 or y+PyGameHandler.RADIUS > PyGameHandler.HEIGHT:
            return false
        
        # (x_ - x)**2 + (y_ - y)**2 = RADIUS**2
        # y_ = sqrt(RADIUS**2 - (x_ - x)**2) + y
        for x_ in range (0,PyGameHandler.RADIUS):
            x1 = x + x_
            x2 = x - x_
            y1 = sqrt(PyGameHandler.RADIUS**2 - (x_ - x)**2) + y
            y2 = - sqrt(PyGameHandler.RADIUS**2 - (x_ - x)**2) + y

            if not PyGameHandler.is_pixel_available(x1, y1) or not PyGameHandler.is_pixel_available(x2, y2):
                return False
        
        return True


    '''
        Draws new object on the board and puts it into the set.
        Center of new object is in (x,y), RADIUS is standaralised for all objects
    '''
    def draw_new_object(name, x, y):

        object_ = Object(name, x, y, PyGameHandler.RADIUS)
        objects.append(object_)
        # draw object on the board
    

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
    
    def move_object(object_, x, y):
        pass