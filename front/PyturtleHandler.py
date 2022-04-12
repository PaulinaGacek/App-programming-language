from platform import python_branch
import turtle
import queue
import math
import typing


class Force:
    def __init__(self, angle: int, power: int, ticks: int):
        self.angle = angle % 360  # normalised angle in degrees
        self.power = power
        self.ticks = ticks
        # add checking if values are not negative


class Ball:
    colors = [(101, 93, 138), (120, 151, 171), (216, 133, 163), (253, 206, 185)]

    def __init__(self, name, x, y, dx, dy):
        self.name = name
        self.turtle = turtle.Turtle("circle")
        self.dy = dy 
        self.dx = dx
        self.acc_x = 0
        self.acc_y = 0

        self.turtle.hideturtle()
        self.turtle.penup()
        self.turtle.goto(x,y)
        self.turtle.color(Ball.colors[len(PyturtleHandler.balls.keys()) % len(Ball.colors)])
        self.turtle.showturtle()

        self.event_queue = queue.Queue()
        self.queue_size = 0
    
    def update_velocity(self):
        if self.queue_size <= 0:
            print("Queue is empty!!!")
        force = self.event_queue.get()
        self.queue_size -= 1
        self.acc_x = math.cos(force.angle * math.pi/180)*force.power
        self.acc_y = math.sin(force.angle * math.pi/180)*force.power

        self.dy += self.acc_y
        self.dx += self.acc_x

        # self.turtle.goto(self.turtle.xcor() + self.dx, self.turtle.ycor() + self.dy)
        self.turtle.sety(self.turtle.ycor() + self.dy)
        self.turtle.setx(self.turtle.xcor() + self.dx)


class PyturtleHandler:

    HEIGHT = 400
    WIDTH = 400
    RADIUS = 10

    win = None
    color = (205, 205, 205)
    isBoardInstantiated = False

    objects = []
    balls = {} # mapps name to the Ball()

    @staticmethod
    def set_height(height):
        PyturtleHandler.HEIGHT = height

    @staticmethod
    def set_width(width):
        PyturtleHandler.WIDTH = width

    @staticmethod
    def instantiate_board():
        PyturtleHandler.win = turtle.Screen()
        PyturtleHandler.win.colormode(255)
        PyturtleHandler.win.bgcolor("white")
        PyturtleHandler.win.title("A++")
        turtle.setworldcoordinates(0, 0, PyturtleHandler.WIDTH, PyturtleHandler.HEIGHT)
        PyturtleHandler.isBoardInstantiated = True

    @staticmethod
    def add_new_object(name, x, y):
        PyturtleHandler.balls[name] = Ball(name,x,y,0,0) # should be 0,0

    @staticmethod
    def update_positions_of_all_balls():
        for key, value in PyturtleHandler.balls.items():

            value.update_velocity()

            # check for a wall collision
            if value.turtle.xcor()+5 > PyturtleHandler.WIDTH or value.turtle.xcor()-5 <= 0:
                value.dx *= -1
            
            if value.turtle.ycor()+5 > PyturtleHandler.HEIGHT or value.turtle.ycor()-5 <= 0:
                value.dy *= -1

            if value.turtle.xcor() > PyturtleHandler.WIDTH:
                value.turtle.goto(PyturtleHandler.WIDTH-10, value.turtle.ycor())
            if value.turtle.xcor() < 0:
                value.turtle.goto(10, value.turtle.ycor())
            if value.turtle.ycor() > PyturtleHandler.HEIGHT:
                value.turtle.goto(value.turtle.xcor(), PyturtleHandler.HEIGHT-10)
            if value.turtle.ycor() < 0:
                value.turtle.goto(value.turtle.xcor(), 10)

    @staticmethod
    def display_visualisation(period: int):
        if period <= 0:
            return 
        
        for i in range(0,period): # maybe should be from 0
            PyturtleHandler.update_positions_of_all_balls()
            PyturtleHandler.win.update()

    @staticmethod
    def force_superposition(forces: list):
        ret_forces = []
        max_length = 0
        for force in forces:
            max_length = max(max_length, force.ticks)
        for i in range(max_length):
            current_forces = []
            super_force_x = 0
            super_force_y = 0
            for force in forces:
                if force.ticks==0:
                    continue
                else:
                    current_forces.append(force)
                    force.ticks-=1
            for force in current_forces:
                super_force_x += math.cos(force.angle * math.pi/180)*force.power
                super_force_y += math.sin(force.angle * math.pi/180)*force.power
            super_angle = math.atan(super_force_y/super_force_x)*180/math.pi
            super_power = math.sqrt(super_force_y**2 + super_force_x**2)
            ret_forces.append(Force(super_angle, super_power, 1))
        return ret_forces

    @staticmethod
    def add_forces(forces: dict):
        # forces - dict() name -> List[Force]
        max_length = 0
        for key, values in forces.items():
            for force in values:
                max_length = max(max_length, force.ticks)

        for key in PyturtleHandler.balls.keys():
            if key in forces.keys():
                output_queue = PyturtleHandler.force_superposition(forces[key])
                for item in output_queue:
                    PyturtleHandler.balls[key].event_queue.put(item)
                    PyturtleHandler.balls[key].queue_size += 1

        for ball in PyturtleHandler.balls.values():
            if ball.queue_size < max_length:
                for i in range(max_length - ball.queue_size):
                    ball.event_queue.put(Force(0,0,1))
                    ball.queue_size += 1

    @staticmethod
    def get_max_queue_len() -> int:
        max = 0
        for key, value in PyturtleHandler.balls.items():
            if value.queue_size > max:
                max = value.queue_size
        
        return max
    
    @staticmethod
    def display_queues_len():
        for key, value in PyturtleHandler.balls.items():
            print("Name:{}, Queue len: {}".format(key, value.queue_size))