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
    current_named_scope = []

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
        return int(ctx.angle.getText()), int(ctx.power.getText())

    def visitObject_type(self, ctx: AppParser.Object_typeContext):
        # returns tuple (x_cor: int, y_cor: int)
        return int(ctx.x_cor.getText()), int(ctx.y_cor.getText())

    def visitTime_type(self, ctx: AppParser.Time_typeContext):
        # returns nr of seconds: int
        value = ctx.getText()
        tab = value.split(":")

        for i in range(0, len(tab)):
            tab[i] = int(tab[i])

        return 3600 * tab[0] + 60 * tab[1] + tab[2]

    def visitApplyForce(self, ctx: AppParser.ApplyForceContext):

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

    def visitArithmeticalExpression(self, ctx: AppParser.ArithmeticalExpressionContext):

        NR_OF_CHILDREN = self.getNrOfChildren(ctx)

        if NR_OF_CHILDREN == 1:  # variable name or INT
            if type(self.getNodesChild(ctx, 0)).__name__ == "IntegerContext":
                return self.visitChildren(ctx)

            elif type(self.getNodesChild(ctx, 0)).__name__ == "VariableNameContext":
                name = self.visitChildren(ctx)
                var = Programm.getVaribaleFromProperScope(name)
                if var.type == Type.INT or var.type == Type.TIME or var.type == Type.FLOAT:
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

        name = self.visit(ctx.name_)
        type_ = self.visit(ctx.type_)

        if ctx.name_.scope_seq is not None:
            raise Error("Access operator not allowed during declaration")

        # print("Type: {}".format(type_))

        if type_ == 'INT' or type_ == 'TIME':
            value = self.visit(ctx.value_)
            if type(value) is not int:
                raise Error("Bad casting: {}".format(type(value)))
            
            Programm.defineNewVariable(name, Programm.strToType(
                type_), value, scope=Programm.scope_history.top())

        elif type_ == 'FLOAT':
            value = self.visit(ctx.value_)
            if type(value) is not float:
                raise Error("Bad casting: {}".format(type(value)))
            
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

    def visitDefinition(self, ctx: AppParser.DefinitionContext):

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

        Programm.current_scope = Programm.scope_history.top()

    def visitConditionalStatement(self, ctx: AppParser.ConditionalStatementContext):

        if self.visit(ctx.cond):
            Programm.addNewVariableScope()
            self.visit(ctx.con_body)
            Programm.deleteTopVariableScope()

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
            raise UnallowedCasting(Programm.getTypeFromNodeType(type1, name1),
                                   Programm.getTypeFromNodeType(type2, name2))
        cond_type = None
        if type1 == "VariableNameContext":
            if Programm.getVariable(name1, Programm.current_scope) is not None:
                cond_type = Programm.getVariable(
                    name1, Programm.current_scope).type
            else:
                cond_type = Programm.getVariable(name1).type
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
        return self.visitChildren(ctx)
    
    def visitElseStatement(self, ctx: AppParser.ElseStatementContext):
        return self.visitChildren(ctx)

    def visitParallelExpression(self, ctx: AppParser.ParallelExpressionContext):
        AppVisitor.inside_parallel = True
        self.visit(ctx.par_body)
        AppVisitor.inside_parallel = False
        PyturtleHandler.add_forces(AppVisitor.forces)
        AppVisitor.forces.clear()

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
        print(given_arguments)
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
        self.visit(Programm.getFunction(name).body_ctx)

        return_val = None
        if Programm.getFunction(name).return_statement is not None:
            return_val = self.visit(Programm.functions.get(name).return_ctx)
        Programm.deleteTopVariableScope()

        return return_val

    def visitFunctionDeclaration(self, ctx: AppParser.FunctionDeclarationContext):
        AppVisitor.inside_function_dec = True

        f_name = self.visit(ctx.f_name)
        if Programm.getFunction(f_name) is not None:
            raise FunctionRedefinitionError(f_name)

        f_return_type = None
        context = None
        if ctx.return_type is not None:
            f_return_type = Programm.strToType(self.visit(ctx.return_type))

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
        var = Variable(name, Programm.strToType(type), None, None)
        return name, var

    def visitFunctionParams(self, ctx: AppParser.FunctionParamsContext):
        # in use when function is called, not when declared!
        given_arguments = []  # list((name, Variable()))
        for child in ctx.children:
            if type(child).__name__ == "VariableNameContext":
                name = self.visit(child)
                # not in local scope
                var = Programm.getVaribaleFromProperScope(name)
                given_arguments.append((name, var))
            elif type(child).__name__ == "ArithmeticalExpressionContext":
                print("Arithm expr", self.visit(child))
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

    # Visit a parse tree produced by AppParser#getAngle.
    def visitGetAngle(self, ctx: AppParser.GetAngleContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by AppParser#getCoordinate.
    def visitGetCoordinate(self, ctx: AppParser.GetCoordinateContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by AppParser#getDistance.
    def visitGetDistance(self, ctx: AppParser.GetDistanceContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by AppParser#getVelocity.
    def visitGetVelocity(self, ctx: AppParser.GetVelocityContext):
        return self.visitChildren(ctx)

    def visitReturn_statement(self, ctx: AppParser.Return_statementContext):
        if AppVisitor.inside_function_dec:
            return Programm.getInstructionAsTxt(ctx)
        return self.visit(ctx.expr)


del AppParser
