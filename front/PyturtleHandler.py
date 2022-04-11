import turtle

class Ball:

    def __init__(self, name, x, y, dx, dy):
        self.name = name
        self.turtle = turtle.Turtle("circle")
        self.dy = dy
        self.dx = dx

        self.turtle.penup()
        self.turtle.goto(x,y)
        self.turtle.color("blue")

class PyturtleHandler:

    HEIGHT = 400
    WIDTH = 400
    RADIUS = 20

    win = None
    color = (205, 205, 205)
    isBoardInstantiated = False

    objects = []
    balls = {} # mapps name to the Turtle()
    

    def set_height(height):
        PyturtleHandler.HEIGHT = height

    def set_width(width):
        PyturtleHandler.WIDTH = width

    def instantiate_board():
        PyturtleHandler.win = turtle.Screen()
        PyturtleHandler.win.bgcolor("white")
        PyturtleHandler.win.title("A++")
        turtle.setworldcoordinates(0, 0, PyturtleHandler.WIDTH, PyturtleHandler.HEIGHT)
        PyturtleHandler.isBoardInstantiated = True
    
    def add_new_object(name, x, y):
        PyturtleHandler.balls[name] = Ball(name,x,y,1,1)
    
    def update_positions_of_all_balls():
        for key, value in PyturtleHandler.balls.items():
            value.turtle.sety(value.turtle.ycor() + value.dy)
            value.turtle.setx(value.turtle.xcor() + value.dx)

            # check for a wall collision
            if value.turtle.xcor() > PyturtleHandler.WIDTH or value.turtle.xcor() == 0:
                value.dx *= -1
            
            if value.turtle.ycor() > PyturtleHandler.HEIGHT or value.turtle.ycor() == 0:
                value.dy *= -1
    
    def display_visualisation(period: int):
        if period <= 0:
            return 
        for i in range(1,period):
            PyturtleHandler.update_positions_of_all_balls()
            PyturtleHandler.win.update()
            