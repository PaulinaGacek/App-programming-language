import turtle

class PyturtleHandler:

    HEIGHT = 400
    WIDTH = 400
    RADIUS = 20

    win = None
    color = (205, 205, 205)
    isBoardInstantiated = False

    objects = []
    balls = []
    

    def set_height(height):
        PyturtleHandler.HEIGHT = height

    def set_width(width):
        PyturtleHandler.WIDTH = width

    def instantiate_board():
        win = turtle.Screen()
        win.bgcolor("black")
        win.title("A++")
        PyturtleHandler.isBoardInstantiated = True
