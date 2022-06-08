import math
import numpy as np
from antlr4 import *
from language_tools.AppParseTreeVisitor import AppParseTreeVisitor
from programm.Programm import Programm
from programm.Variable import *
from utils.Error import *
from programm.TypeUtils import *
from programm.Function import Function
from front.PyturtleHandler import *
import re

if __name__ is not None and "." in __name__:
    from .AppParser import AppParser
else:
    from AppParser import AppParser


# This class defines a complete generic visitor for a parse tree produced by AppParser.


class AppVisitorState(Enum):
    FUNC_DECLARATION_CHECKING = 1,
    CODE_EXECUTING = 2


class AppVisitor(AppParseTreeVisitor):
    current_state = AppVisitorState.FUNC_DECLARATION_CHECKING
    inside_function_dec = False
    inside_parallel = False
    forces = {}  # mapps object name to forces applied to it str-> List[Force]
    current_named_scope = []
    NR_OF_FRAMES = 29.10

    def visitPrimaryExpression(self, ctx: AppParser.PrimaryExpressionContext):

        # gathering info about the functions declarations
        if AppVisitor.current_state == AppVisitorState.FUNC_DECLARATION_CHECKING:
            for child in ctx.children:
                if type(child).__name__ == "FunctionDeclarationContext":
                    self.visit(child)

        elif AppVisitor.current_state == AppVisitorState.CODE_EXECUTING:
            for child in ctx.children:
                if type(child).__name__ != "FunctionDeclarationContext":
                    self.visit(child)

    def visitInstruction(self, ctx: AppParser.InstructionContext):
        if AppVisitor.inside_function_dec:
            return Programm.getInstructionAsTxt(ctx)
        else:
            return self.visitChildren(ctx)

    def visitVariableType(self, ctx: AppParser.VariableTypeContext):
        return ctx.getText()

    def visitVariableName(self, ctx: AppParser.VariableNameContext):
        return ctx.getText()

    def visitFunctionName(self, ctx: AppParser.FunctionNameContext):
        return ctx.getText()

    def visitInteger(self, ctx: AppParser.IntegerContext):
        value = ctx.getText()
        return int(value)

    def visitFloat_type(self, ctx: AppParser.Float_typeContext):
        value = ctx.getText()
        value = float(value)
        return value

    def visitForce_type(self, ctx: AppParser.Force_typeContext):
        # returns tuple (angle: int, power: int)
        angle = self.visit(ctx.angle)
        power = self.visit(ctx.power)
        return angle, power

    def visitObject_type(self, ctx: AppParser.Object_typeContext):
        # returns tuple (x_cor: int, y_cor: int)
        x_cor = int(self.visit(ctx.x_cor))
        y_cor = int(self.visit(ctx.y_cor))
        return x_cor, y_cor

    def visitTime_type(self, ctx: AppParser.Time_typeContext):
        # returns nr of seconds: int
        value = ctx.getText()
        tab = value.split(":")

        for i in range(0, len(tab)):
            tab[i] = int(tab[i])

        time_ = (3600 * tab[0] + 60 * tab[1] + tab[2]) * self.NR_OF_FRAMES

        if time_ - int(time_) >= 0.5:
            return math.ceil(time_)

        return int(time_)

    def visitApplyForce(self, ctx: AppParser.ApplyForceContext):

        object_name = self.visit(ctx.object_)
        if Programm.getVariable(object_name) is None or Programm.getVariable(object_name).value is None:
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

    def visitArithmeticalExpression(self, ctx: AppParser.ArithmeticalExpressionContext):

        NR_OF_CHILDREN = self.getNrOfChildren(ctx)
        if NR_OF_CHILDREN == 1:  # variable name or value

            if type(self.getNodesChild(ctx, 0)).__name__ == "VariableNameContext":
                name = self.visitChildren(ctx)
                var = Programm.getVaribaleFromProperScope(name)
                if var is not None and var.type == Type.INT or var.type == Type.TIME or var.type == Type.FLOAT:
                    return var.value
                else:
                    return var.value, var.value2
            else:
                return self.visitChildren(ctx)

        else:
            type1 = type(self.getNodesChild(ctx.left, 0)).__name__
            val1 = self.getNodesChild(ctx.left, 0).getText()
            type2 = type(self.getNodesChild(ctx.right, 0)).__name__
            val2 = self.getNodesChild(ctx.right, 0).getText()

            if not Programm.areTypesCompatible(type1, type2, val1, val2):
                raise Error(
                    "Arithmetical operation on different types are not allowed: {}, {} -> {},{}".format(type1, type2,
                                                                                                        val1, val2))

            artm_type = None
            if type2 == "VariableNameContext":
                artm_type = Programm.getVaribaleFromProperScope(val2).type
            elif type2 == "IntegerContext":
                artm_type = Type.INT
            elif type2 == "Float_typeContext":
                artm_type = Type.INT
            elif type2 == "Object_typeContext":
                artm_type = Type.OBJECT
            elif type2 == "Force_typeContext":
                artm_type = Type.FORCE
            elif type2 == "FunctionCallContext":
                name = self.visit(self.getNodesChild(ctx.right, 0).f_name) # function name
                artm_type = Programm.getFunction(name).return_type
            else:
                artm_type = 'ARITM_EXPR'

            if artm_type == Type.INT or artm_type == Type.TIME or artm_type == Type.FLOAT:
                l = self.visit(ctx.left)
                r = self.visit(ctx.right)

                op = ctx.op.text
                operation = {
                    '+': lambda: l + r,
                    '-': lambda: l - r,
                    '*': lambda: l * r,
                    '/': lambda: l / r,
                }
                return operation.get(op, lambda: None)()

            elif artm_type == Type.FORCE:
                return self.arithmeticalOperationForce(ctx)
            else:
                return self.visitChildren(ctx)

    def visitDeclaration(self, ctx: AppParser.DeclarationContext):

        name = self.visit(ctx.name_)
        type_ = self.visit(ctx.type_)

        if ctx.name_.scope_seq is not None:
            raise Error("Access operator not allowed during declaration")

        if type_ == 'INT' or type_ == 'TIME':
            value = self.visit(ctx.value_)
            if type(value) is not int and  type(value) is not float:
                raise Error("Bad casting: {}".format(type(value).__name__))
            if type(value) is float:
                value = int(value)
            Programm.defineNewVariable(name, TypeUtils.strToType(
                type_), value, scope=Programm.scope_history.top())

        elif type_ == 'FLOAT':
            value = self.visit(ctx.value_)
            if type(value) is int:
                value = float(value)
            elif type(value) is not float:
                raise Error("Bad casting: {}".format(type(value)))
            
            Programm.defineNewVariable(name, TypeUtils.strToType(
                type_), value, scope=Programm.scope_history.top())

        elif type_ == 'FORCE':
            value1, value2 = self.visit(ctx.value_)
            Programm.defineNewVariable(name, TypeUtils.strToType(
                type_), value1, value2, scope=Programm.scope_history.top())

        elif type_ == 'OBJECT':
            value1, value2 = self.visit(ctx.value_)
            mass = None
            size = None
            if ctx.mass_def is not None:
                mass = self.visit(ctx.mass_def)
            else:
                mass = 1

            if ctx.size_def is not None:
                size = self.visit(ctx.size_def)
                if size > PyturtleHandler.MAX_RADIUS:
                    size = PyturtleHandler.MAX_RADIUS
            else:
                size = PyturtleHandler.RADIUS

            Programm.defineNewVariable(name, TypeUtils.strToType(
                type_), value1, value2, size, scope=Programm.scope_history.top())

            
            PyturtleHandler.add_new_object(name, value1, value2, mass=mass, size=size)


    def visitDefinition(self, ctx: AppParser.DefinitionContext):

        name = self.visit(ctx.name_)
        var = Programm.getVaribaleFromProperScope(name)
        value = self.visit(ctx.value_)
        if ctx.name_.scope_seq is not None:
            scope_name = self.visit(ctx.name_.scope_seq)
            name = re.sub(scope_name, "", name)       
            scope_name = re.sub("::$", "", scope_name)
            if Programm.debug:
                print("Scope name:", scope_name, " --> name:", name)
            Programm.defineExistingVariable(name, value, scope=scope_name)
        else:
            if type(value) is tuple:
                value1 = value[0]
                value2 = value[1]
                Programm.defineExistingVariable(name, value1, value2, scope=Programm.getProperScopeWithVariable(name))
            else:
                Programm.defineExistingVariable(name, value, scope=Programm.getProperScopeWithVariable(name))

    def visitConditionalStatement(self, ctx: AppParser.ConditionalStatementContext):

        if self.visit(ctx.cond):
            Programm.addNewVariableScope()
            self.visit(ctx.con_body)
            Programm.deleteTopVariableScope()
        elif ctx.elif_stat is not None and self.visit(ctx.elif_stat.cond):
            self.visit(ctx.elif_stat)
        else:
            if ctx.else_stat is not None:
                self.visit(ctx.else_stat)
                

    def visitCondition(self, ctx: AppParser.ConditionContext):

        name1, val1, type1 = None, None, None
        if ctx.left_expr is not None:
            name1 = ctx.left_expr.getText()
            val1 = self.visit(ctx.left_expr)
            type1 = type(self.getNodesChild(ctx.left_expr, 0)).__name__
        else:
            name1 = self.visit(ctx.left_var)
            if Programm.getVariable(name1, scope=Programm.current_scope) is None:
                if Programm.getVariable(name1) is None:
                    raise UndefinedVariableReferenceError(name1)
            type1 = Programm.getVariable(name1).type
            val1 = Programm.getVariable(name1).value

        name2, val2, type2 = None, None, None
        if ctx.right_expr is not None:
            name2 = ctx.right_expr.getText()
            val2 = self.visit(ctx.right_expr)
            type2 = type(self.getNodesChild(ctx.right_expr, 0)).__name__
        else:
            name2 = self.visit(ctx.right_var)
            var2 = Programm.getVaribaleFromProperScope(name2)
            type2 = var2.type
            val2 = var2.value

        if not Programm.areTypesComparable(type1, type2, name1, name2):
            raise UnallowedCasting(Programm.getTypeFromNodeType(type1, name1),
                                   Programm.getTypeFromNodeType(type2, name2))
        cond_type = None
        var1 = Programm.getVaribaleFromProperScope(name1)
        if type1 == "VariableNameContext":
            cond_type = var1.type
        elif type1 == "IntegerContext":
            cond_type = Type.INT
        elif type1 == "Object_typeContext":
            raise OperatorNotDefininedForType(
                ctx.op.text, Programm.getTypeFromNodeType(type1))
        elif type1 == "Force_typeContext":
            raise OperatorNotDefininedForType(
                ctx.op.text, Programm.getTypeFromNodeType(type1))

        if cond_type == Type.OBJECT or cond_type == Type.FORCE:
            raise OperatorNotDefininedForType(ctx.op.text, cond_type)

        if cond_type == Type.INT or cond_type == Type.TIME:
            l = self.visit(ctx.left_expr)
            r = self.visit(ctx.right_expr)

        op = ctx.op.text
        operation = {
            '==': lambda l, r: (l == r),
            '>': lambda l, r: (l > r),
            '<': lambda l, r: (l < r),
            '>=': lambda l, r: (l >= r),
            '<=': lambda l, r: (l <= r),
            '!=': lambda l, r: (l != r),
        }

        if operation[op](l, r):
            return True

        return False

    def visitConditionBody(self, ctx: AppParser.ConditionBodyContext):
        return self.visitChildren(ctx)

    def visitElifStatement(self, ctx: AppParser.ElifStatementContext):
        Programm.addNewVariableScope()
        self.visit(ctx.con_body)
        Programm.deleteTopVariableScope()

    def visitElseStatement(self, ctx: AppParser.ElseStatementContext):
        Programm.addNewVariableScope()
        self.visit(ctx.con_body)
        Programm.deleteTopVariableScope()

    def visitParallelExpression(self, ctx: AppParser.ParallelExpressionContext):
        AppVisitor.inside_parallel = True
        self.visit(ctx.par_body)
        AppVisitor.inside_parallel = False
        PyturtleHandler.add_forces(AppVisitor.forces)
        AppVisitor.forces.clear()
        if len(PyturtleHandler.balls.keys()) > 0 and PyturtleHandler.get_max_queue_len() > 0:
            if Programm.debug:
                PyturtleHandler.display_queues_len()
            Programm.display_visualisation(PyturtleHandler.get_max_queue_len())

    def visitParallelBody(self, ctx: AppParser.ParallelBodyContext):
        return self.visitChildren(ctx)

    def visitLoop(self, ctx: AppParser.LoopContext):
        while self.visitCondition(ctx.cond):
            Programm.addNewVariableScope()
            self.visitLoopBody(ctx.l_body)
            Programm.deleteTopVariableScope()

    def visitLoopBody(self, ctx: AppParser.LoopBodyContext):
        return self.visitChildren(ctx)

    def visitFunctionCall(self, ctx: AppParser.FunctionCallContext):
        name = self.visit(ctx.f_name)
        if Programm.functions.get(name) is None:
            raise UndefinedFunctionReferenceError(name)

        declared_types = Programm.functions.get(name).params  # list[(name,Variable())]
        given_arguments = []
        if ctx.f_args is not None:  # function with arguemnts
            given_arguments = self.visit(ctx.f_args)

        # checking number of arguments:
        if len(declared_types) != len(given_arguments):
            raise WrongNumberOfArguments(name, required=len(declared_types), provided=len(given_arguments))

        # checking if arguments names are not repeated
        repeated_name = Programm.getRepeatedVariableName(declared_types)
        if repeated_name is not None:
            raise Error(
                "Function arguments cannot have the same name - {}".format(repeated_name))

        # checking types of arguments:
        for declared, given in zip(declared_types, given_arguments):
            if declared[1].type != given[1].type:
                raise UnallowedCasting(given[1].type, declared[1].type)

        # execute function body
        Programm.addNewVariableScope()
        # adding all params to scope
        for declared, given in zip(declared_types, given_arguments):
            Programm.defineNewVariable(declared[0], given[1].type, given[1].value, given[1].value2, scope=Programm.scope_history.top())
        if Programm.debug:
            Programm.displayVariables()
        self.visit(Programm.getFunction(name).body_ctx)

        return_val = None
        if Programm.getFunction(name).return_statement is not None:
            return_val = self.visit(Programm.functions.get(name).return_ctx)
        Programm.deleteTopVariableScope()

        return return_val

    def visitFunctionDeclaration(self, ctx: AppParser.FunctionDeclarationContext):
        AppVisitor.inside_function_dec = True

        if ctx.f_body is None and ctx.return_stat is None:
            raise Error("Body of the function cannot be empty")

        f_name = self.visit(ctx.f_name)
        if Programm.getFunction(f_name) is not None:
            raise FunctionRedefinitionError(f_name)

        f_return_type = None
        context = None
        if ctx.return_type is not None:
            f_return_type = TypeUtils.strToType(self.visit(ctx.return_type))

            if ctx.return_stat is None:
                raise FunctionHasToReturnSomething(f_name, f_return_type)

            context = self.visit(ctx.return_stat)

        func = Function(f_name, f_return_type, context, ctx.return_stat, ctx.f_body)
        if ctx.f_args is not None:  # function has params
            # function args returns dict of variables
            func.params = self.visit(ctx.f_args)
        # modify func
        func.actions = self.visit(ctx.f_body)
        AppVisitor.inside_function_dec = False
        Programm.addFunction(func)

    def visitFunctionBody(self, ctx: AppParser.FunctionBodyContext):
        action_list = []
        for child in ctx.children:
            if type(child).__name__ == "InstructionContext":
                action_list.append(self.visit(child))
        return action_list

    def visitFunctionArgs(self, ctx: AppParser.FunctionArgsContext):
        arguments = []
        for child in ctx.children:
            if type(child).__name__ == "FunctionArgumentContext":
                # add check whether no redefinition
                name, var = self.visit(child)
                arguments.append((name, var))
        return arguments

    def visitFunctionArgument(self, ctx: AppParser.FunctionArgumentContext):
        name = self.visit(ctx.name_)
        type = self.visit(ctx.type_)
        var = Variable(name, TypeUtils.strToType(type), None, None)
        return name, var

    def visitFunctionParams(self, ctx: AppParser.FunctionParamsContext):
        # in use when function is called, not when declared!
        given_arguments = []  # list((name, Variable()))
        for child in ctx.children:
            if type(child).__name__ == "VariableNameContext":
                name = self.visit(child)
                var = Programm.getVaribaleFromProperScope(name)
                given_arguments.append((name, var))
            elif type(child).__name__ == "ArithmeticalExpressionContext":
                name = "Var_"+str(Programm.current_scope)+"_"+str(len(Programm.local_scopes))
                if type(self.visit(child)) is not tuple:
                    val = self.visit(child)
                    type_ = TypeUtils.detectTypeFromValue(val)
                    var= Variable(name, type_, val)
                else:
                    val, val2 = self.visit(child)
                    type_ = TypeUtils.detectTypeFromValue((val,val2))
                    var= Variable(name, type_, val, val2)

                given_arguments.append((name, var))
        return given_arguments

    def visitWhiteSpace(self, ctx: AppParser.WhiteSpaceContext):
        return  # does nothing

    def visitComment(self, ctx: AppParser.CommentContext):
        return  # does nothing

    def visitScopeName(self, ctx: AppParser.ScopeNameContext):
        return ctx.getText()

    def visitScopeSequence(self, ctx: AppParser.ScopeSequenceContext):
        return ctx.getText()

    def visitScopeDeclaration(self, ctx: AppParser.ScopeDeclarationContext):
        name = self.getNodesChild(ctx, 0).getText()
        self.current_named_scope.append(name)
        Programm.addNewNamedVariableScope(name, self.current_named_scope)
        self.visitChildren(ctx)
        Programm.deleteTopVariableScope()
        self.current_named_scope.remove(name)

    def visitGetAngle(self, ctx: AppParser.GetAngleContext):
        x1, y1, x2, y2 = self.getDistancecoords(ctx)
        degree = math.atan2(y2 - y1, x2 - x1) * 180 / math.pi
        if degree < 0:
            degree += 360
        return degree

    def visitGetCoordinate(self, ctx: AppParser.GetCoordinateContext):
        text_value = ctx.axis.text
        name = self.visit(ctx.name_)
        curr_object = None
        if Programm.getVariable(name, Programm.current_scope) is None:
            if Programm.getVariable(name) is None: 
                raise UndefinedVariableReferenceError(name)
            else:
                curr_object = Programm.getVariable(name)
        else:
            curr_object = Programm.getVariable(name, Programm.current_scope)

        if curr_object.type != Type.OBJECT:
            raise TypeError("Variable is not an object")

        ball = PyturtleHandler.balls[curr_object.name]
        if text_value == "X":
            return float(ball.get_pos_x())
        elif text_value == "Y":
            return float(ball.get_pos_y())
        else:
            return 2137

    def visitGetDistance(self, ctx: AppParser.GetDistanceContext):
        x1, y1, x2, y2 = self.getDistancecoords(ctx)
        diff_x = abs(x1 - x2)
        diff_y = abs(y1 - y2)
        return math.sqrt(diff_x ** 2 + diff_y ** 2)

    def visitGetVelocity(self, ctx: AppParser.GetVelocityContext):
        text_value = ctx.axis.text
        name = self.visit(ctx.name_)
        curr_object = None
        if Programm.getVariable(name, Programm.current_scope) is None:
            if Programm.getVariable(name) is None: 
                raise UndefinedVariableReferenceError(name)
            else:
                curr_object = Programm.getVariable(name)
        else:
            curr_object = Programm.getVariable(name, Programm.current_scope)

        if curr_object.type != Type.OBJECT:
            raise TypeError("Variable is not an object")

        ball = PyturtleHandler.balls[curr_object.name]
        if text_value == "X":
            return float(ball.dx)
        elif text_value == "Y":
            return float(ball.dy)
        elif text_value == "VALUE":
            return math.sqrt(ball.dx**2 + ball.dy**2)
        else:
            return 2137

    def visitReturn_statement(self, ctx: AppParser.Return_statementContext):
        if AppVisitor.inside_function_dec:
            return Programm.getInstructionAsTxt(ctx)
        return self.visit(ctx.expr)

    def getDistancecoords(self, ctx):
        if ctx.name_1 is None:
            object1 = self.visit(ctx.object_1)
            x1 = object1[0]
            y1 = object1[1]
        else:
            name1 = self.visit(ctx.name_1)
            if Programm.getVariable(name1, Programm.current_scope) is None: 
                if Programm.getVariable(name1) is None: 
                    raise UndefinedVariableReferenceError(name1)
                else:
                    object1 = Programm.getVariable(name1)
            else:
                object1 = Programm.getVariable(name1, Programm.current_scope)
            x1 = object1.value
            y1 = object1.value2
        if ctx.name_2 is None:
            object2 = self.visit(ctx.object_2)
            x2 = object2[0]
            y2 = object2[1]
        else:
            name2 = self.visit(ctx.name_2)
            if Programm.getVariable(name2, Programm.current_scope) is None:
                if Programm.getVariable(name2) is None:
                    raise UndefinedVariableReferenceError(name2)
                else:
                    object2 = Programm.getVariable(name2)
            else:
                object2 = Programm.getVariable(name2, Programm.current_scope)
            x2 = object2.value
            y2 = object2.value2

        return x1, y1, x2, y2

    def arithmeticalOperationForce(self, ctx: AppParser.ArithmeticalExpressionContext):
        l_angle, l_power = self.visit(ctx.left)
        r_angle, r_power = self.visit(ctx.right)
        op = ctx.op.text
        not_allowed = ['*', '/']

        if op in not_allowed:
            raise OperatorNotDefininedForType(ctx.op.text, Type.FORCE)

        if op == '-':
            r_angle += 180
            r_angle = r_angle % 360

        lfx = l_power * np.cos(l_angle * np.pi / 180)
        lfy = l_power * np.sin(l_angle * np.pi / 180)
        rfx = r_power * np.cos(r_angle * np.pi / 180)
        rfy = r_power * np.sin(r_angle * np.pi / 180)

        x = lfx + rfx
        y = lfy + rfy

        angle = np.arctan(y / x) * 180 / np.pi
        power = np.sqrt(x ** 2 + y ** 2)

        if power - int(power) >= 0.5:
            power = math.ceil(power)
        else:
            power = math.floor(power)

        if angle - int(angle) >= 0.5:
            angle = math.ceil(angle)
        else:
            angle = math.floor(angle)

        return int(angle), int(power)
    
    def visitMassDefinition(self, ctx: AppParser.MassDefinitionContext):
        value = self.visit(ctx.value_)
        return int(value)

    def visitSizeDefinition(self, ctx: AppParser.SizeDefinitionContext):
        value = self.visit(ctx.value_)
        return int(value)

del AppParser
