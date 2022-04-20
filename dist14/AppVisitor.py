from re import T
from antlr4 import *
from utils.AppParseTreeVisitor import AppParseTreeVisitor
from utils.Programm import Programm
from utils.Variable import *
from utils.Error import *
from utils.Function import Function
from front.PyturtleHandler import *
import itertools
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

    def visitForce_type(self, ctx: AppParser.Force_typeContext):
        # print("Angle:{}, power: {}".format(ctx.angle.getText(), ctx.power.getText()))
        return int(ctx.angle.getText()), int(ctx.power.getText())

    def visitObject_type(self, ctx: AppParser.Object_typeContext):
        return int(ctx.x_cor.getText()), int(ctx.y_cor.getText())

    def visitApplyForce(self, ctx: AppParser.ApplyForceContext):
        NR_OF_CHILDREN = self.getNrOfChildren(ctx)
        if NR_OF_CHILDREN < 11:
            return
        if ctx.object_ is None or (ctx.force_ is None and ctx.force_val is None) or (ctx.time_ is None and ctx.time_val is None):
            return

        if not AppVisitor.inside_function_dec:

            object_name = self.visit(ctx.object_)
            if Programm.getVariable(object_name) is None or Programm.getVariable(object_name).value is None:
                raise UndefinedVariableReferenceError(object_name)

            angle = None
            power = None
            if ctx.force_ is not None:  # force is variable
                force_name = self.visit(ctx.force_)
                if Programm.getVariable(force_name) is None or Programm.getVariable(force_name).value is None:
                    raise UndefinedVariableReferenceError(force_name)
                angle = Programm.getVariable(force_name).value
                power = Programm.getVariable(force_name).value2

            else:  # force is value
                angle, power = self.visit(ctx.force_val)

            time_val = None
            if ctx.time_ is not None:
                time_name = self.visit(ctx.time_)
                if Programm.getVariable(time_name) is None or Programm.getVariable(time_name).value is None:
                    raise UndefinedVariableReferenceError(time_name)
                time_val = Programm.getVariable(time_name).value
            else:
                time_val = self.visit(ctx.time_val)

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
        else:
            return Programm.getInstructionAsTxt(ctx)

    def visitArithmeticalExpression(self, ctx: AppParser.ArithmeticalExpressionContext):
        NR_OF_CHILDREN = self.getNrOfChildren(ctx)

        if NR_OF_CHILDREN == 1:  # variable name or INT
            if type(self.getNodesChild(ctx, 0)).__name__ == "IntegerContext":
                return self.visitChildren(ctx)

            elif type(self.getNodesChild(ctx, 0)).__name__ == "VariableNameContext":
                name = self.visitChildren(ctx)

                if Programm.getVariable(name, Programm.current_scope) is None:
                    if Programm.getVariable(name) is None:
                        raise UndefinedVariableReferenceError(name)

                if Programm.getVariable(name, Programm.current_scope).type == Type.INT or Programm.getVariable(name, Programm.current_scope).type == Type.TIME:
                    return Programm.getVariable(name, Programm.current_scope).value
            else:
                return self.visitChildren(ctx)

        else:
            type1 = type(self.getNodesChild(ctx.left, 0)).__name__
            val1 = self.getNodesChild(ctx.left, 0).getText()
            type2 = type(self.getNodesChild(ctx.right, 0)).__name__
            val2 = self.getNodesChild(ctx.right, 0).getText()

            if not Programm.areTypesCompatible(type1, type2, val1, val2):
                raise Error(
                    "Arithmetical operation on different types are not allowed: {}, {} -> {},{}".format(type1, type2, val1, val2))

            artm_type = None
            if type1 == "VariableNameContext":
                artm_type = Programm.getVariable(
                    val1, Programm.current_scope).type
            elif type1 == "IntegerContext":
                artm_type = Type.INT
            elif type1 == "Object_typeContext":
                artm_type = Type.OBJECT
            elif type1 == "Force_typeContext":
                artm_type = Type.FORCE
            else:
                artm_type = 'ARITM_EXPR'

            # print("Artm type: {}".format(artm_type))

            if artm_type == Type.INT or artm_type == Type.TIME:
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
                l_angle, l_power = self.visit(ctx.left)
                r_angle, r_power = self.visit(ctx.right)
                print("Operation on forces left:[{},{}], right:[{},{}]".format(
                    l_angle, l_power, r_angle, r_power))

                op = ctx.op.text
                # caculate output force and return

            elif artm_type == Type.OBJECT:
                print("Operation on objects")

            else:
                return self.visitChildren(ctx)

    def visitDeclaration(self, ctx: AppParser.DeclarationContext):

        if ctx.name_ is None or ctx.type_sim is None or ctx.value_ is None:
            return

        if not AppVisitor.inside_function_dec:

            name = self.visit(ctx.name_)
            type_ = self.visit(ctx.type_sim)

            # print("Type: {}".format(type_))

            if type_ == 'INT' or type_ == 'TIME':
                if type(self.visit(ctx.value_)) is not int:
                    raise Error("Bad casting: {}".format(
                        type(self.visit(ctx.value_))))
                value = self.visit(ctx.value_)
                Programm.defineNewVariable(name, Programm.strToType(
                    type_), value, scope=Programm.scope_history.top())

            elif type_ == 'FORCE':
                value1, value2 = self.visit(ctx.value_)
                Programm.defineNewVariable(name, Programm.strToType(
                    type_), value1, value2, scope=Programm.scope_history.top())

            elif type_ == 'OBJECT':
                value1, value2 = self.visit(ctx.value_)
                Programm.defineNewVariable(name, Programm.strToType(
                    type_), value1, value2, scope=Programm.scope_history.top())
                PyturtleHandler.add_new_object(name, value1, value2)

        else:  # in function declaration
            return Programm.getInstructionAsTxt(ctx)

    def visitDefinition(self, ctx: AppParser.DefinitionContext):

        if ctx.name_ is None or (ctx.value_ is None and (ctx.value1_ is None or ctx.value2_ is None)):
            return

        if not AppVisitor.inside_function_dec:

            name = self.visit(ctx.name_)
            if Programm.getVariable(name, Programm.scope_history.top()) is None and Programm.getVariable(name) is None:
                raise UndefinedVariableReferenceError(name)

            Programm.current_scope = None
            if Programm.getVariable(name, Programm.scope_history.top()) is not None:
                Programm.current_scope = Programm.scope_history.top()

            type = Programm.getVariable(name, Programm.current_scope).type

            if ctx.value_ is not None:  # simple type
                value = self.visit(ctx.value_)
                Programm.defineExistingVariable(
                    name, value, scope=Programm.current_scope)

            else:  # complex type
                value1 = self.visit(ctx.value1_)
                value2 = self.visit(ctx.value2_)

                Programm.defineExistingVariable(
                    name, value1, value2, Programm.current_scope)

            Programm.current_scope = Programm.scope_history.top()

        else:
            return Programm.getInstructionAsTxt(ctx)

    def visitConditionalStatement(self, ctx: AppParser.ConditionalStatementContext):

        if not AppVisitor.inside_function_dec:
            if self.visit(ctx.cond):
                id = Programm.scope_history.getSize()
                Programm.scope_history.push(id)

                if len(Programm.local_scopes) <= id:
                    local_variables = {}
                    # adding new variable scope
                    Programm.local_scopes.append(local_variables)

                Programm.current_scope = Programm.scope_history.top()
                self.visit(ctx.con_body)
                Programm.displayVariables()
                # deleting local variables
                Programm.local_scopes[Programm.scope_history.top()].clear()
                scope = Programm.scope_history.pop()

        else:
            return Programm.getInstructionAsTxt(ctx)


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
        # print("Name1: {}, type1: {}, val1: {}".format(name1, type1, val1))
        
        name2, val2, type2 = None, None, None
        if ctx.right_expr is not None:
            name2 = ctx.right_expr.getText()
            val2 = self.visit(ctx.right_expr)
            type2 = type(self.getNodesChild(ctx.right_expr, 0)).__name__
        else:
            name2 = self.visit(ctx.right_var)
            if Programm.getVariable(name2, scope=Programm.current_scope) is None:
                if Programm.getVariable(name2) is None:
                    raise UndefinedVariableReferenceError(name2)
            type2 = Programm.getVariable(name2).type
            val2 = Programm.getVariable(name2).value
        # print("Name2: {}, type2: {}, val2: {}".format(name2, type2, val2))

        if not Programm.areTypesComparable(type1, type2, name1, name2):
            raise UnallowedCasting(Programm.getTypeFromNodeType(type1, name1), Programm.getTypeFromNodeType(type2, name2))
        cond_type = None
        if type1 == "VariableNameContext":
            if Programm.getVariable(name1, Programm.current_scope) is not None:
                cond_type = Programm.getVariable(name1, Programm.current_scope).type
            else:
                cond_type = Programm.getVariable(name1).type
        elif type1 == "IntegerContext":
            cond_type = Type.INT
        elif type1 == "Object_typeContext":
            raise OperatorNotDefininedForType(ctx.op.text, Programm.getTypeFromNodeType(type1))
        elif type1 == "Force_typeContext":
            raise OperatorNotDefininedForType(ctx.op.text, Programm.getTypeFromNodeType(type1))

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

    def visitParallelExpression(self, ctx: AppParser.ParallelExpressionContext):
        print("Parallel")
        AppVisitor.inside_parallel = True
        self.visit(ctx.par_body)
        AppVisitor.inside_parallel = False
        PyturtleHandler.add_forces(AppVisitor.forces)
        AppVisitor.forces.clear()

    def visitParallelBody(self, ctx: AppParser.ParallelBodyContext):
        return self.visitChildren(ctx)

    # [NOT IMPLEMENTED] Visit a parse tree produced by AppParser#loop.
    def visitLoop(self, ctx: AppParser.LoopContext):
        return self.visitChildren(ctx)

    # [NOT IMPLEMENTED] Visit a parse tree produced by AppParser#loopBody.
    def visitLoopBody(self, ctx: AppParser.LoopBodyContext):
        return self.visitChildren(ctx)

    def visitFunctionCall(self, ctx: AppParser.FunctionCallContext):
        name = self.visit(ctx.f_name)
        if Programm.functions.get(name) is None:
            raise UndefinedFunctionReferenceError(name)
        else:
            # check whether arguments are of the correct type
            declared_types = Programm.functions.get(
                name).params  # list[(name,Variable())]
            given_arguments = []
            if ctx.f_args is not None:  # function with arguemnts
                given_arguments = self.visit(ctx.f_args)

            # checking number of arguments:
            if len(declared_types) != len(given_arguments):
                raise WrongNumberOfArguments(
                    len(declared_types), len(given_arguments))

            repeated_name = Programm.getRepeatedVariableName(declared_types)
            if repeated_name is not None:
                raise Error(
                    "Function arguments cannot have the same name - {}".format(repeated_name))

            repeated_name = Programm.getRepeatedVariableName(given_arguments)
            if repeated_name is not None:
                raise Error(
                    "Function arguments cannot have the same name - {}".format(repeated_name))

            # checking types of arguments:
            for declared, given in zip(declared_types, given_arguments):
                if declared[1].type != given[1].type:
                    raise UnallowedCasting(given[1].type, declared[1].type)

    def visitFunctionDeclaration(self, ctx: AppParser.FunctionDeclarationContext):

        f_name = self.visit(ctx.f_name)

        if Programm.getFunction(f_name) is not None:
            raise FunctionRedefinitionError(f_name)

        func = Function(f_name)
        if ctx.f_args is not None:  # function has params
            # function args returns dict of variables
            func.params = self.visit(ctx.f_args)
        # modify func
        func.actions = self.visit(ctx.f_body)
        Programm.addFunction(func)

    def visitFunctionBody(self, ctx: AppParser.FunctionBodyContext):
        AppVisitor.inside_function_dec = True
        action_list = []
        for child in ctx.children:
            if type(child).__name__ == "InstructionContext":
                action_list.append(self.visit(child))
        AppVisitor.inside_function_dec = False
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
        var = Variable(name, Programm.strToType(type), None, None)
        return name, var

    def visitFunctionParams(self, ctx: AppParser.FunctionParamsContext):
        # in use when function is called, not when declared!
        given_arguments = []  # list((name, Variable()))
        for child in ctx.children:
            if type(child).__name__ == "VariableNameContext":
                name = self.visit(child)
                # not in local scope
                if Programm.getVariable(name, scope=Programm.current_scope) is None:
                    if Programm.getVariable(name) is None:  # not in global scope
                        raise UndefinedVariableReferenceError(name)
                    else:  # declared in global scope
                        given_arguments.append(
                            (name, Programm.getVariable(name)))
                else:  # in local
                    given_arguments.append(
                        (name, Programm.getVariable(name, scope=Programm.current_scope)))
        return given_arguments

    # Visit a parse tree produced by AppParser#whiteSpace.
    def visitWhiteSpace(self, ctx: AppParser.WhiteSpaceContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by AppParser#comment.
    def visitComment(self, ctx: AppParser.CommentContext):
        print("comment")
        return  # does nothing


del AppParser
