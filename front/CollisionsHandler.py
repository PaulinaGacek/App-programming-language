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
                    print("vertical collision")
                    value.dy *= -1
                if self.is_horizontall_wall_collision(value):
                    value.dx *= -1
                    print("horizontal collision")

                for value_ in balls_copy.values():
                    if self.is_balls_collision_in_next_tick(value, value_):
                        self.change_next_tick_velocity(value, value_)

    def is_balls_collision_in_next_tick(self, object1: Ball, object2: Ball) -> bool:
        x1, y1 = object1.get_next_pos_x(), object1.get_next_pos_y()
        x2, y2 = object2.get_next_pos_x(), object2.get_next_pos_y()
        size1, size2 = object1.size, object2.size

        if (math.sqrt((x1 - x2)**2 + (y1 - y2)**2) < (size1 + size2)):
            # print("Collision between {}({},{}) and {}({},{})".format(object1.name,x1,y1,object2.name,x2,y2))
            return True

        return False
    
    def change_next_tick_velocity(self, object1: Ball, object2: Ball):

        r1 = np.array((object1.get_next_pos_x(), object1.get_next_pos_y()))
        r2 = np.array((object2.get_next_pos_x(), object2.get_next_pos_y()))
        d = np.linalg.norm(r1 - r2) ** 2
        v1 = np.array((object1.dx, object1.dy))
        v2 = np.array((object2.dx, object2.dy))


        u1 = v1 - np.dot(v1 - v2, r1 - r2) / d * (r1 - r2)
        u2 = v2 - np.dot(v2 - v1, r2 - r1) / d * (r2 - r1)

        # print("Object {}: v1:{},{} -> v2:{},{}".format(object1.name,object1.dx, object1.dy, u1[0], u1[1]))
        # print("Object {}: v1:{},{} -> v2:{},{}".format(object2.name,object2.dx, object2.dy, u2[0], u2[1]))
        object1.dx = u1[0]
        object1.dy = u1[1]
        object2.dx = u2[0]
        object2.dy = u2[1]
        # CollisionHandler.escape_collision(object1, object2)
    
    def is_vertical_wall_collision(self, ball: Ball):
        if ball.get_next_pos_y() + ball.get_radius() > self.height:
            print("upper wall ->"+ball.name)
            return True
        if ball.get_next_pos_y() - ball.get_radius() < 0:
            print("bottom wall->"+ball.name)
            return True
    
    def is_horizontall_wall_collision(self, ball: Ball):
        return ball.get_next_pos_x() + ball.get_radius() > self.width or ball.get_next_pos_x() - ball.get_radius() <= 0