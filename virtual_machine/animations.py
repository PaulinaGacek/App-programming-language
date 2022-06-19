from programm.Programm import *
from front.PyturtleHandler import *

class Animations:
    inside_parallel = False

    def apply_force(object_name: str, angle, power, time, delay=0):
        if Programm.getVaribaleFromProperScope(object_name) is None:
            raise UndefinedVariableReferenceError(object_name)
        force_ = Force(angle, power, time, delay)

        if Programm.forces.get(object_name) is None:
            Programm.forces[object_name] = [force_]
        else:
            Programm.forces[object_name].append(force_)

        if not Animations.inside_parallel:  # not in parallel block
            Animations.animate()
    
    def draw_object(name, x, y, size, mass):
        if not PyturtleHandler.can_object_be_drawn(x, y, int(size)):
            raise ObjectCannotBeDrawn(name, x, y)
        PyturtleHandler.add_new_object(name, x, y,mass, int(size))

        new_var = Variable(name, Type.OBJECT, x, y)
        Programm.variables[name] = new_var
    
    def animate():
        PyturtleHandler.add_forces(Programm.forces)
        Programm.forces.clear()
        if len(PyturtleHandler.balls.keys()) > 0 and PyturtleHandler.get_max_queue_len() > 0:
                if Programm.debug:
                    PyturtleHandler.display_queues_len()
                Programm.display_visualisation(PyturtleHandler.get_max_queue_len())
