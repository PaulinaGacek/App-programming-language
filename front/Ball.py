import turtle
import queue
import math


class Ball:
    counter = 0
    colors = [(101, 93, 138), (120, 151, 171),
              (216, 133, 163), (253, 206, 185)]
    FACTOR = 5
    RADIUS = 10

    def __init__(self, name, x, y, dx, dy, mass, size):
        self.name = name
        self.turtle = turtle.Turtle("circle")
        self.mass = mass
        self.size = size

        self.dy = dy  # current y velocity
        self.dx = dx
        self.acc_x = 0  # current x acc
        self.acc_y = 0

        self.next_pos_x = x
        self.next_pos_y = y

        self.turtle.hideturtle()
        self.turtle.penup()
        self.turtle.goto(x, y)
        self.turtle.color(
            Ball.colors[Ball.counter % len(Ball.colors)])
        self.turtle.shapesize(self.size / Ball.RADIUS)
        self.turtle.showturtle()

        self.event_queue = queue.Queue()
        self.queue_size = 0
        Ball.counter += 1  # number of created balls
    
    def update_acceleration(self):
        if self.queue_size <= 0:
            print("Queue is empty!!!")
        force = self.event_queue.get()
        self.queue_size -= 1

        self.acc_x = math.cos(force.angle * math.pi / 180) * force.power/Ball.FACTOR / self.mass
        self.acc_y = math.sin(force.angle * math.pi / 180) * force.power/Ball.FACTOR / self.mass

    def move_to_next_pos(self):
        self.turtle.goto(self.next_pos_x, self.next_pos_y)

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
        if z > self.size:
            return False

        return True

    def get_pos_x(self):
        return self.turtle.xcor()

    def get_pos_y(self):
        return self.turtle.ycor()
    
    def get_next_pos_x(self):
        return self.next_pos_x
    
    def get_next_pos_y(self):
        return self.next_pos_y
    
    def get_radius(self):
        return self.size
