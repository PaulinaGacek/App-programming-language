import math
import numpy as np

from front.Ball import Ball

class CollisionHandler:

    def __init__(self, ticks, height, width):
        self.VIRTUAL_TICKS = ticks
        self.height = height
        self.width = width

    '''
    Updates ball positions and velocities
    '''
    def calculate_next_balls_pos(self, balls_dict):

        for tick in range(0,self.VIRTUAL_TICKS):
            # update next positions and velocities
            for ball in balls_dict.values():
                ball.dx += ball.acc_x/self.VIRTUAL_TICKS
                ball.next_pos_x += ball.dx/self.VIRTUAL_TICKS
                ball.dy += ball.acc_y/self.VIRTUAL_TICKS
                ball.next_pos_y += ball.dy/self.VIRTUAL_TICKS
            
            balls_copy = balls_dict.copy()

            for key, value in balls_dict.items():
                balls_copy.pop(key)  # don't check collision with itself
                if self.is_vertical_wall_collision(value):
                    value.dy *= -1
                if self.is_horizontall_wall_collision(value):
                    value.dx *= -1

                for value_ in balls_copy.values():
                    if self.is_balls_collision_in_next_tick(value, value_):
                        self.change_next_tick_velocity(value, value_)

    def is_balls_collision_in_next_tick(self, object1: Ball, object2: Ball) -> bool:
        x1, y1 = object1.get_next_pos_x(), object1.get_next_pos_y()
        x2, y2 = object2.get_next_pos_x(), object2.get_next_pos_y()
        size1, size2 = object1.size, object2.size

        if (math.sqrt((x1 - x2)**2 + (y1 - y2)**2) < (size1 + size2)):
            return True

        return False
    
    def change_next_tick_velocity(self, ball1: Ball, ball2: Ball):

        r1 = np.array((ball1.get_next_pos_x(), ball1.get_next_pos_y()))
        r2 = np.array((ball2.get_next_pos_x(), ball2.get_next_pos_y()))
        d = np.linalg.norm(r1 - r2) ** 2
        v1 = np.array((ball1.dx, ball1.dy))
        v2 = np.array((ball2.dx, ball2.dy))


        u1 = v1 - np.dot(v1 - v2, r1 - r2) / d * (r1 - r2)
        u2 = v2 - np.dot(v2 - v1, r2 - r1) / d * (r2 - r1)

        ball1.dx = u1[0]
        ball1.dy = u1[1]
        ball2.dx = u2[0]
        ball2.dy = u2[1]
        self.escape_collision(ball1, ball2)
    
    '''
    When velocities are too small there were cases when balls couldn't escape from collision situation in one iteration, so they were
    keeping to collide and in some cases they even became one ball. This method prevents from these situation - it makes sure that 
    ball will escape collision state in one iteration
    '''

    def escape_collision(self, object1: Ball, object2: Ball):
        # sitaution after collision
        after_x_1, after_y_1 = object1.get_next_pos_x() + object1.dx, object1.get_next_pos_y() + object1.dy
        after_x_2, after_y_2 = object2.get_next_pos_x() + object2.dx, object2.get_next_pos_y() + object2.dy

        # checking if after one iteration they will escape collision state
        while (math.sqrt((after_x_1 - after_x_2)**2 + (after_y_1 - after_y_2)**2) < (object1.size + object2.size)):

            if object1.dx < object2.dx and object1.dx > 0.5:
                object1.next_pos_x += object1.dx
            else:
                object2.next_pos_x += object2.dx
            
            if object1.dy < object2.dy and object1.dy > 0.5:
                object1.next_pos_y += object1.dy
            else:
                object2.next_pos_y += object2.dy

            after_x_1, after_y_1 = object1.get_next_pos_x() + object1.dx, object1.get_next_pos_y() + object1.dy
            after_x_2, after_y_2 = object2.get_next_pos_x() + object2.dx, object2.get_next_pos_y() + object2.dy

    
    def is_vertical_wall_collision(self, ball: Ball):
        return ball.get_next_pos_y() + ball.get_radius() > self.height or ball.get_next_pos_y() - ball.get_radius() < 0
    
    def is_horizontall_wall_collision(self, ball: Ball):
        return ball.get_next_pos_x() + ball.get_radius() > self.width or ball.get_next_pos_x() - ball.get_radius() <= 0