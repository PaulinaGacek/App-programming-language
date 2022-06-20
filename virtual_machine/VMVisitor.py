from language_tools.AppVisitor import *
from language_tools.AppParser import AppParser

class VMVisitor(AppParseTreeVisitor):
    def __init__(self) -> None:
        variables_addresses = {} # name to address
        memory_end_ptr = 0
        super().__init__()

    def addVariable(self, name:str, address):
        self.variables_addresses[name] = address
    
    def getVariableAddress(self, name: str):
        return self.variables_addresses.get(name)
    
    def visitPrimaryExpression(self, ctx: AppParser.PrimaryExpressionContext):
        return self.visitChildren(ctx)

    def visitInstruction(self, ctx: AppParser.InstructionContext):
        self.visitChildren(ctx)
    
    def visitApplyForce(self, ctx: AppParser.ApplyForceContext):

        object_name = self.visit(ctx.object_)
        if Programm.getVaribaleFromProperScope(object_name) is None:
            raise UndefinedVariableReferenceError(object_name)

        angle = None
        power = None
        if ctx.force_ is not None:  # force is variable
            force_name = self.visit(ctx.force_)
            force_var = Programm.getVaribaleFromProperScope(force_name)
            angle = force_var.value
            power = force_var.value2

        else:  # force is value
            angle, power = self.visit(ctx.force_val)

        time_val = None
        if ctx.time_ is not None:
            time_name = self.visit(ctx.time_)
            time_var = Programm.getVaribaleFromProperScope(time_name)
            time_val = time_var.value
        elif ctx.time_val is not None:
            time_val = self.visit(ctx.time_val)
        else:
            time_val = self.visit(ctx.time_type_val)
        delay = 0
        if ctx.delay_:
            delay = self.visit(ctx.delay_)
        elif ctx.delay_val_:
            delay = self.visit(ctx.delay_val_)

        force_ = Force(angle, power, time_val, delay)

        if AppVisitor.forces.get(object_name) is None:
            AppVisitor.forces[object_name] = [force_]
        else:
            AppVisitor.forces[object_name].append(force_)

        if not AppVisitor.inside_parallel:  # not in parallel block
            PyturtleHandler.add_forces(AppVisitor.forces)
            AppVisitor.forces.clear()

            if len(PyturtleHandler.balls.keys()) > 0 and PyturtleHandler.get_max_queue_len() > 0:
                if Programm.debug:
                    PyturtleHandler.display_queues_len()
                Programm.display_visualisation(PyturtleHandler.get_max_queue_len())