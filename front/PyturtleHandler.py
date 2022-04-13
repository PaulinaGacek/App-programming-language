from platform import python_branch
import turtle
import queue
import math
import typing


class Force:
    def __init__(self, angle: int, power: int, ticks: int):
        
        if angle < 0:
            angle += 360 * int(1 - angle/360)
        self.angle = angle - int(angle/360)  # normalised angle in degrees
        self.power = power
        self.ticks = ticks
        # add checking if values are not negative


class Ball:
    colors = [(101, 93, 138), (120, 151, 171), (216, 133, 163), (253, 206, 185)]

    def __init__(self, name, x, y, dx, dy):
        self.name = name
        self.turtle = turtle.Turtle("circle")

        self.dy = dy # current y velocity
        self.dx = dx
        self.acc_x = 0 # current x acc
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

        self.turtle.goto(self.turtle.xcor() + self.dx, self.turtle.ycor() + self.dy)
    
    '''
        Checks if given pixel (x_, y_) is inside self
        Returns true if it is inside.
    '''
    def is_pixel_inside(self, x_, y_) -> bool:
        diff_x = abs(x_ - self.x)
        diff_y = abs(y_ - self.y)
        if math.sqrt((diff_x ** 2 + diff_y ** 2)) >= PyturtleHandler.RADIUS:
            return False

        return True
    
    def get_pos_x(self) -> int:
        return self.turtle.xcor()

    def get_pos_y(self) -> int:
        return self.turtle.ycor()


class PyturtleHandler:

    HEIGHT = 400
    WIDTH = 400
    RADIUS = 11

    win = None
    color = (205, 205, 205)
    isBoardInstantiated = False

    balls = {} # mapps name to the Ball()

    @staticmethod
    def set_height(height):
        PyturtleHandler.HEIGHT = height

    @staticmethod
    def set_width(width):
        PyturtleHandler.WIDTH = width
    
    '''
        Checks if pixel (x,y) is not occupied by object, so if this pixel is available
    '''
    @staticmethod
    def is_pixel_available(x, y) -> bool:
        for obj in PyturtleHandler.balls.values():
            if obj.is_pixel_inside(x, y) is True:
                return False
        return True
    
    '''
        Checks if all points on the perimeter of new object are available.
    '''
    @staticmethod
    def can_object_be_drawn(x,y) -> bool:

        if x-PyturtleHandler.RADIUS < 0 or x+ PyturtleHandler.RADIUS > PyturtleHandler.WIDTH:
            return False
        
        if y-PyturtleHandler.RADIUS < 0 or y+PyturtleHandler.RADIUS > PyturtleHandler.HEIGHT:
            return False

        # (x_ - x)**2 + (y_ - y)**2 = RADIUS**2
        # y_ = sqrt(RADIUS**2 - (x_ - x)**2) + y
        for x_ in range (0,PyturtleHandler.RADIUS):
            x1 = x + x_
            x2 = x - x_
            y1 = math.sqrt(PyturtleHandler.RADIUS**2 - (x1 - x)**2) + y
            y2 = - math.sqrt(PyturtleHandler.RADIUS**2 - (x2-x)**2) + y

            if not PyturtleHandler.is_pixel_available(int(x1), int(y1)):
                print("Pixel: ({},{}) not available".format(x1,int(y1)))
                return False

            if not PyturtleHandler.is_pixel_available(x2, int(y2)):
                print("Pixel: ({},{}) not available".format(x2,int(y2)))
                return False

        return True

    @staticmethod
    def instantiate_board():
        PyturtleHandler.win = turtle.Screen()
        PyturtleHandler.win.colormode(255)
        PyturtleHandler.win.bgcolor("white")
        PyturtleHandler.win.title("A++")
        PyturtleHandler.win.setup(PyturtleHandler.WIDTH, PyturtleHandler.HEIGHT)
        turtle.setworldcoordinates(0, 0, PyturtleHandler.WIDTH, PyturtleHandler.HEIGHT)
        PyturtleHandler.isBoardInstantiated = True

    @staticmethod
    def add_new_object(name, x, y):
        PyturtleHandler.balls[name] = Ball(name,x,y,0,0) # should be 0,0

    @staticmethod
    def update_positions_of_all_balls():
        radius = PyturtleHandler.RADIUS
        for key, value in PyturtleHandler.balls.items():

            value.update_velocity()

            # check for a wall collision
            if value.turtle.xcor()+radius > PyturtleHandler.WIDTH or value.turtle.xcor()-radius <= 0:
                value.dx *= -1
            
            if value.turtle.ycor()+radius > PyturtleHandler.HEIGHT or value.turtle.ycor()-radius <= 0:
                value.dy *= -1

            if value.turtle.xcor() > PyturtleHandler.WIDTH - radius:
                value.turtle.goto(PyturtleHandler.WIDTH-radius*2, value.turtle.ycor())

            if value.turtle.xcor() < radius:
                value.turtle.goto(radius*2, value.turtle.ycor())

            if value.turtle.ycor() > PyturtleHandler.HEIGHT - radius:
                value.turtle.goto(value.turtle.xcor(), PyturtleHandler.HEIGHT-radius*2)

            if value.turtle.ycor() < radius:
                value.turtle.goto(value.turtle.xcor(), radius*2)

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