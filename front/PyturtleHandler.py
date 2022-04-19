import turtle
import queue
import math
import numpy as np
import time


class Force:
    def __init__(self, angle: int, power: int, ticks: int, delay: int = 0):
        if angle < 0:
            angle += 360 * int(1 - angle / 360)
        self.angle = angle - int(angle / 360)  # normalised angle in degrees
        self.power = power
        self.ticks = ticks
        self.delay = delay
        # print("New force with angle {}, power {}, ticks {}, delay {}".format(self.angle, power, ticks, delay))
        # add checking if values are not negative


class Ball:
    colors = [(101, 93, 138), (120, 151, 171),
              (216, 133, 163), (253, 206, 185)]
    FACTOR = 5

    def __init__(self, name, x, y, dx, dy):
        self.name = name
        self.turtle = turtle.Turtle("circle")

        self.dy = dy  # current y velocity
        self.dx = dx
        self.acc_x = 0  # current x acc
        self.acc_y = 0

        self.turtle.hideturtle()
        self.turtle.penup()
        self.turtle.goto(x, y)
        self.turtle.color(
            Ball.colors[len(PyturtleHandler.balls.keys()) % len(Ball.colors)])
        self.turtle.showturtle()

        self.event_queue = queue.Queue()
        self.queue_size = 0

    def update_velocity(self):
        if self.queue_size <= 0:
            print("Queue is empty!!!")
        force = self.event_queue.get()
        self.queue_size -= 1
        self.acc_x = math.cos(force.angle * math.pi /
                              180) * force.power/Ball.FACTOR
        self.acc_y = math.sin(force.angle * math.pi /
                              180) * force.power/Ball.FACTOR

        self.dy += self.acc_y
        self.dx += self.acc_x

        self.turtle.goto(self.turtle.xcor() + self.dx,
                         self.turtle.ycor() + self.dy)

    '''
        Checks if given pixel (x_, y_) is inside self
        Returns true if it is inside.
    '''

    def is_pixel_inside(self, x_, y_) -> bool:
        diff_x = abs(x_ - self.turtle.xcor())
        diff_y = abs(y_ - self.turtle.ycor())
        z = math.sqrt((diff_x ** 2 + diff_y ** 2))
        z_ = int(z)
        if z - z_ >= 0.5:
            z = math.ceil(z)
        else:
            z = math.ceil(z)
        if z > PyturtleHandler.RADIUS:
            return False

        return True

    def get_pos_x(self):
        return self.turtle.xcor()

    def get_pos_y(self):
        return self.turtle.ycor()


class PyturtleHandler:
    HEIGHT = 400
    WIDTH = 400
    RADIUS = 11
    TIME_DELAY = 0  # in secs

    win = None
    color = (205, 205, 205)
    isBoardInstantiated = False

    balls = {}  # mapps name to the Ball()

    @staticmethod
    def set_height(height):
        PyturtleHandler.HEIGHT = height

    @staticmethod
    def set_width(width):
        PyturtleHandler.WIDTH = width

    @staticmethod
    def atan2(y, x):
        if x == 0 and y == 0:
            return 0
        return math.atan2(y, x) * 180 / math.pi

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
    def can_object_be_drawn(x, y) -> bool:

        if x - PyturtleHandler.RADIUS < 0 or x + PyturtleHandler.RADIUS > PyturtleHandler.WIDTH:
            return False

        if y - PyturtleHandler.RADIUS < 0 or y + PyturtleHandler.RADIUS > PyturtleHandler.HEIGHT:
            return False

        # (x_ - x)**2 + (y_ - y)**2 = RADIUS**2
        # y_ = sqrt(RADIUS**2 - (x_ - x)**2) + y
        for x_ in range(0, PyturtleHandler.RADIUS + 1):
            x1 = x + x_
            x2 = x - x_
            y1 = math.sqrt(PyturtleHandler.RADIUS ** 2 - (x1 - x) ** 2) + y
            y2 = - math.sqrt(PyturtleHandler.RADIUS ** 2 - (x1 - x) ** 2) + y
            y3 = math.sqrt(PyturtleHandler.RADIUS ** 2 - (x2 - x) ** 2) + y
            y4 = - math.sqrt(PyturtleHandler.RADIUS ** 2 - (x2 - x) ** 2) + y

            if not PyturtleHandler.is_pixel_available(int(x1), int(y1)) \
                    or not PyturtleHandler.is_pixel_available(int(x1), int(y2)):
                print("Pixel: ({},{}) not available".format(x1, int(y1)))
                return False

            if not PyturtleHandler.is_pixel_available(x2, int(y3)) \
                    or not PyturtleHandler.is_pixel_available(int(x2), int(y4)):
                print("Pixel: ({},{}) not available".format(x2, int(y3)))
                return False

        return True

    '''
        Checks if pixel (x,y) is not occupied by any other object then that one which name was given,
         so if this pixel is accessible
    '''

    @staticmethod
    def is_pixel_accessible(x, y, name):
        balls_copy = PyturtleHandler.balls.copy()
        balls_copy.pop(name)  # don't check collision with itself

        for obj in balls_copy.values():
            if obj.is_pixel_inside(x, y) is True:
                print("{} has collission with {}".format(name, obj.name))
                return [False, obj]
        return [True, None]

    """
    Returns there is a collistion between object1 and object2 - if the distance between the centers of two objects is less than the sum of their radii.
    """

    @staticmethod
    def is_balls_collision(object1: Ball, object2: Ball) -> bool:
        x1, y1 = object1.get_pos_x(), object1.get_pos_y()
        x2, y2 = object2.get_pos_x(), object2.get_pos_y()

        if (math.sqrt((x1 - x2)**2 + (y1 - y2)**2) < 2 * PyturtleHandler.RADIUS):
            print("Collision between {}({},{}) and {}({},{})".format(object1.name,x1,y1,object2.name,x2,y2))
            return True

        return False

    @staticmethod
    def instantiate_board():
        PyturtleHandler.win = turtle.Screen()
        PyturtleHandler.win.colormode(255)
        PyturtleHandler.win.bgcolor("white")
        PyturtleHandler.win.title("A++")
        PyturtleHandler.win.setup(
            PyturtleHandler.WIDTH, PyturtleHandler.HEIGHT)
        turtle.setworldcoordinates(
            0, 0, PyturtleHandler.WIDTH, PyturtleHandler.HEIGHT)
        PyturtleHandler.isBoardInstantiated = True

    @staticmethod
    def add_new_object(name, x, y):
        PyturtleHandler.balls[name] = Ball(name, x, y, 0, 0)

    @staticmethod
    def update_positions_of_all_balls():
        radius = PyturtleHandler.RADIUS

        balls_copy = PyturtleHandler.balls.copy()

        for key, value in PyturtleHandler.balls.items():

            value.update_velocity()

            # check for a wall collision
            if value.turtle.xcor() + radius > PyturtleHandler.WIDTH or value.turtle.xcor() - radius <= 0:
                value.dx *= -1

            if value.turtle.ycor() + radius > PyturtleHandler.HEIGHT or value.turtle.ycor() - radius <= 0:
                value.dy *= -1

            if value.turtle.xcor() > PyturtleHandler.WIDTH - radius:
                value.turtle.goto(PyturtleHandler.WIDTH -
                                  radius * 2, value.turtle.ycor())

            if value.turtle.xcor() < radius:
                value.turtle.goto(radius * 2, value.turtle.ycor())

            if value.turtle.ycor() > PyturtleHandler.HEIGHT - radius:
                value.turtle.goto(value.turtle.xcor(),
                                  PyturtleHandler.HEIGHT - radius * 2)

            if value.turtle.ycor() < radius:
                value.turtle.goto(value.turtle.xcor(), radius * 2)

            # check collision with other ball
            balls_copy.pop(key)  # don't check collision with itself
            for value_ in balls_copy.values():
                if PyturtleHandler.is_balls_collision(value, value_):
                    PyturtleHandler.change_velocity(value, value_)

    """
    Updates velocities of object1 and object2 to simulate their ellastic collision
    """

    @staticmethod
    def change_velocity(object1, object2):

        r1 = np.array((object1.get_pos_x(), object1.get_pos_y()))
        r2 = np.array((object2.get_pos_x(), object2.get_pos_x()))
        d = np.linalg.norm(r1 - r2) ** 2
        v1 = np.array((object1.dx, object1.dy))
        v2 = np.array((object2.dx, object2.dy))

        u1 = v1 - np.dot(v1 - v2, r1 - r2) / d * (r1 - r2)
        u2 = v2 - np.dot(v2 - v1, r2 - r1) / d * (r2 - r1)

        print("Object {}: v1:{},{} -> v2:{},{}".format(object1.name,
              object1.dx, object1.dy, u1[0], u1[1]))
        print("Object {}: v1:{},{} -> v2:{},{}".format(object2.name,
              object2.dx, object2.dy, u2[0], u2[1]))
        object1.dx = u1[0]
        object1.dy = u1[1]
        object2.dx = u2[0]
        object2.dy = u2[1]
        PyturtleHandler.escape_collision(object1,object2)

    @staticmethod
    def display_visualisation(period: int):
        if period <= 0:
            return

        for i in range(0, period):
            PyturtleHandler.update_positions_of_all_balls()
            time.sleep(PyturtleHandler.TIME_DELAY)
            PyturtleHandler.win.update()

    @staticmethod
    def force_superposition(forces: list):
        ret_forces = []
        max_length = 0
        for force in forces:
            max_length = max(max_length, force.ticks+force.delay)
        for i in range(max_length):
            current_forces = []
            super_power = 0
            super_angle = 0
            for force in forces:
                if force.ticks == 0:
                    continue
                if force.delay > 0:
                    force.delay -= 1
                    continue
                else:
                    current_forces.append(force)
                    force.ticks -= 1
            for force in current_forces:
                temp_power = math.sqrt(super_power ** 2 + force.power ** 2 - 2 * super_power * force.power * math.cos(
                    (force.angle - super_angle)) * math.pi / 180)
                temp_angle = super_angle + PyturtleHandler.atan2(
                    force.power *
                    math.sin((force.angle - super_angle) * math.pi / 180),
                    super_power + force.power * math.cos((force.angle - super_angle) * math.pi / 180))
                super_power = temp_power
                super_angle = temp_angle
            ret_forces.append(Force(super_angle, super_power, 1))
        return ret_forces

    @staticmethod
    def add_forces(forces: dict):
        # forces - dict() name -> List[Force]
        for key in PyturtleHandler.balls.keys():
            if key in forces.keys():
                output_queue = PyturtleHandler.force_superposition(forces[key])
                for item in output_queue:
                    PyturtleHandler.balls[key].event_queue.put(item)
                    PyturtleHandler.balls[key].queue_size += 1
        max_length = PyturtleHandler.get_max_queue_len()
        for ball in PyturtleHandler.balls.values():
            if ball.queue_size < max_length:
                for i in range(max_length - ball.queue_size):
                    ball.event_queue.put(Force(0, 0, 1))
                    ball.queue_size += 1

    @staticmethod
    def get_max_queue_len() -> int:
        return max([ball.queue_size for ball in PyturtleHandler.balls.values()])

    @staticmethod
    def display_queues_len():
        for key, value in PyturtleHandler.balls.items():
            print("Name:{}, Queue len: {}".format(key, value.queue_size))
    
    '''
    When velocities are too small there were cases when balls couldn't escape from collision situation in one iteration, so they were
    keeping to collide and in some cases they even became one ball. This method prevents from these situation - it makes sure that 
    ball will escape collision state in one iteration
    '''
    @staticmethod
    def escape_collision(object1: Ball, object2: Ball):
        
        # sitaution after collision
        after_x_1, after_y_1 = object1.get_pos_x() + object1.dx, object1.get_pos_y() + object1.dy
        after_x_2, after_y_2 = object2.get_pos_x() + object2.dx, object2.get_pos_y() + object2.dy

        # checking if after one iteration they will escape collision state
        while (math.sqrt((after_x_1 - after_x_2)**2 + (after_y_1 - after_y_2)**2) < 2 * PyturtleHandler.RADIUS):

            object1.turtle.goto(object1.get_pos_x() + object1.dx, object1.get_pos_y() + object1.dy)
            object2.turtle.goto(object2.get_pos_x() + object2.dx, object2.get_pos_y() + object2.dy)

            after_x_1, after_y_1 = object1.get_pos_x() + object1.dx, object1.get_pos_y() + object1.dy
            after_x_2, after_y_2 = object2.get_pos_x() + object2.dx, object2.get_pos_y() + object2.dy


