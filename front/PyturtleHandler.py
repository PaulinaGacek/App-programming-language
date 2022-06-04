import turtle
import math
from front.Ball import Ball
from front.CollisionsHandler import CollisionHandler

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


class PyturtleHandler:
    HEIGHT = 400
    WIDTH = 400
    RADIUS = 10
    TIME_DELAY = 0  # in secs
    MAX_RADIUS = 100
    collisionHandler = None

    win = None
    color = (205, 205, 205)

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
    def can_object_be_drawn(x, y, size) -> bool:

        if x - size < 0 or x + size > PyturtleHandler.WIDTH:
            return False

        if y - size < 0 or y + size > PyturtleHandler.HEIGHT:
            return False

        # (x_ - x)**2 + (y_ - y)**2 = RADIUS**2
        # y_ = sqrt(RADIUS**2 - (x_ - x)**2) + y
        for x_ in range(0, size + 1):
            x1 = x + x_
            x2 = x - x_
            y1 = math.sqrt(size ** 2 - (x1 - x) ** 2) + y
            y2 = - math.sqrt(size ** 2 - (x1 - x) ** 2) + y
            y3 = math.sqrt(size ** 2 - (x2 - x) ** 2) + y
            y4 = - math.sqrt(size ** 2 - (x2 - x) ** 2) + y

            if not PyturtleHandler.is_pixel_available(int(x1), int(y1)) \
                    or not PyturtleHandler.is_pixel_available(int(x1), int(y2)):
                print("Pixel: ({},{}) not available".format(x1, int(y1)))
                return False

            if not PyturtleHandler.is_pixel_available(x2, int(y3)) \
                    or not PyturtleHandler.is_pixel_available(int(x2), int(y4)):
                print("Pixel: ({},{}) not available".format(x2, int(y3)))
                return False

        return True

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
        PyturtleHandler.collisionHandler = CollisionHandler(10, PyturtleHandler.HEIGHT, PyturtleHandler.WIDTH)

    @staticmethod
    def add_new_object(name, x, y, mass, size):
        PyturtleHandler.balls[name] = Ball(name, x, y, 0, 0, mass, size)

    @staticmethod
    def update_positions_of_all_balls():

        for value in PyturtleHandler.balls.values():
            value.update_acceleration()
        
        PyturtleHandler.collisionHandler.calculate_next_balls_pos(PyturtleHandler.balls)

        for value in PyturtleHandler.balls.values():
            value.move_to_next_pos()

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
