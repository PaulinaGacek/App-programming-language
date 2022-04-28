from utils.Variable import *
from utils.Error import *
from utils.Stack import *
from utils.Function import *
from front.PyturtleHandler import Force, PyturtleHandler
import re


class Programm:

    '''
    Keeps global variables, mapps variable name to the variable object
    '''
    variables = {}
    local_scopes = []
    scope_history = Stack()  # empty stack of following scopes
    functions = {}  # maps name to Function()
    current_scope = None

    named_scopes = {}
    scope_name_to_idx = {} # mapps scope's name to its idx
    '''
    Handles declaration with definition, e.g. DEFINE TIME zmienna AS 100;
    Creates variable and puts it into variables dict or raises exception
    if variable was already defined.
    '''
    @staticmethod
    def defineNewVariable(name: str, type_: Type, value: int, value2=None, scope=None):
        if scope is None:  # scope is global
            # variable exists in global scope
            if Programm.variables.get(name) is not None:
                raise VariableRedefinitionError(name, Programm.typeToStr(type_))

            # drawn object would collide with different object
            if type_ == Type.OBJECT and not PyturtleHandler.can_object_be_drawn(value, value2):
                raise ObjectCannotBeDrawn(name, value, value2)

            new_var = Variable(name, type_, value, value2)
            Programm.variables[name] = new_var

        else:  # scope is local
            if type(scope) is int and Programm.local_scopes[scope].get(name) is not None:
                raise VariableRedefinitionError(name, Programm.typeToStr(type_))
            if type(scope) is str and Programm.named_scopes[scope].get(name) is not None:
                raise VariableRedefinitionError(name, Programm.typeToStr(type_))  

            # drawn object would collide with different object
            if type == Type.OBJECT and not PyturtleHandler.can_object_be_drawn(value, value2):
                raise ObjectCannotBeDrawn(name, value, value2)

            new_var = Variable(name, type_, value, value2)
            if type(scope) is int: 
                Programm.local_scopes[scope][name] = new_var
            else:
                Programm.named_scopes[scope][name] = new_var

    '''
    Handles definition of declared object, e.g. SET zmienna AS 100;
    It sets value of the variable as given nr or raises exception
    if variable was not previously defined.
    '''
    @staticmethod
    def defineExistingVariable(name: str, value: int, value2=None, scope=None):

        if scope is None:
            if Programm.variables.get(name) is None:
                raise UndefinedVariableReferenceError(name)

            Programm.variables[name].value = value
            Programm.variables[name].value2 = value2

        else:  # scope is local
            if Programm.local_scopes[scope].get(name) is None:
                raise UndefinedVariableReferenceError(name)

            Programm.local_scopes[scope][name].value = value
            Programm.local_scopes[scope][name].value2 = value2

    '''
    Prints the content of variables dict.
    '''
    @staticmethod
    def displayVariables():
        if len(Programm.variables) == 0:
            print("There are no global variables declared")

        else:
            print("Global variables:")
            for key, value in Programm.variables.items():
                print("     Name: {} -> details: {}".format(key,
                      value.displayDetails()))

        if Programm.scope_history.getSize() == 0:
            print("There are no local variables declared")
        else:
            for scope in Programm.scope_history.stack:
                print("Local scope nr {}".format(scope))
                if type(scope) is str:
                    for key, value in Programm.named_scopes[scope].items():
                        print("     Name: {} -> details: {}".format(key,value.displayDetails()))
                else:
                    for key, value in Programm.local_scopes[scope].items():
                        print("     Name: {} -> details: {}".format(key,value.displayDetails()))
        print("---- Named scopes -----")
        if len(Programm.named_scopes) > 0:
            for name, scope in Programm.named_scopes.items():
                print("Named scope: {}".format(name))
                for key, value in scope.items():
                        print("     Name: {} -> details: {}".format(key,value.displayDetails()))
        print("---------------------------------------------------")

    @staticmethod
    def dispay_functions():
        if len(Programm.functions.keys()) == 0:
            print("There are no functions declared")
        else:
            print("Users functions:")
            for key, value in Programm.functions.items():
                print("     Name: {} -> details: {}".format(key, value.displayDetails()))
                print("********")

    '''
    Converts given string to Type object
    '''
    @staticmethod
    def strToType(type: str):
        if type == "TIME":
            return Type.TIME
        elif type == "INT":
            return Type.INT
        elif type == "OBJECT":
            return Type.OBJECT
        elif type == "FLOAT":
            return Type.FLOAT
        else:
            return Type.FORCE

    '''
    Converts Type object to string
    '''
    @staticmethod
    def typeToStr(type: Type):
        if type == Type.TIME:
            return "TIME"
        elif type == Type.INT:
            return "INT"
        elif type == Type.OBJECT:
            return "OBJECT"
        elif type == Type.FORCE:
            return "FORCE"
        elif type == Type.FLOAT:
            return "FLOAT"
        return None

    @staticmethod
    def detectTypeFromValue(value):
        # nie skonczone
        if type(value) is int:
            return Type.INT
        if type(value) is float:
            return Type.FLOAT
        else:
            return Type.FORCE

    '''
    Returns Variable object with given name
    '''
    @staticmethod
    def getVariable(name: str, scope=None):
        if scope is None:
            return Programm.variables.get(name)
        else:
            return Programm.local_scopes[scope].get(name)
    
    @staticmethod
    def getVaribaleFromProperScope(name: str):
        size = Programm.scope_history.getSize()
        for i in range (0,size):
            if Programm.local_scopes[size-1-i].get(name) is not None:
                return Programm.local_scopes[size-1-i].get(name)
        if Programm.variables.get(name) is not None:
            return Programm.variables.get(name)
        return UndefinedVariableReferenceError(name)
    
    @staticmethod
    def getProperScopeWithVariable(name: str):
        size = Programm.scope_history.getSize()
        for i in range (0,size):
            if Programm.local_scopes[size-1-i].get(name) is not None:
                return size-1-i
        if Programm.variables.get(name) is not None:
            return None
        return UndefinedVariableReferenceError(name)

    @staticmethod
    def areTypesCompatible(type1, type2, name1, name2) -> bool:
        # unfinished - checks only situation when both args are variable names
        if type1 == "ArithmeticalExpressionContext" or type2 == "ArithmeticalExpressionContext" or type1 == "FunctionCallContext" or type2 == "FunctionCallContext":
            return True
    
        if type1 == "VariableNameContext" and type2 == "VariableNameContext":
            if Programm.getVaribaleFromProperScope(name1).type != Programm.getVaribaleFromProperScope(name2).type:
                return False
            return True
        
        if (type1 == "IntegerContext" or type2 != "Float_typeContext") and type2 != "IntegerContext" and type2 != "Float_typeContext":
            return False

        return True

    @staticmethod
    def areTypesComparable(type1, type2, name1, name2) -> bool:
        if type1 == "ArithmeticalExpressionContext" or type2 == "ArithmeticalExpressionContext":
            return True
        # print("type1: {}, type2: {}".format(type1, type2))
        if type1 == "VariableNameContext":
            if Programm.getVaribaleFromProperScope(name1).type == Type.INT:
                type1 = "IntegerContext"
            elif Programm.getVaribaleFromProperScope(name1).type == Type.TIME:
                type1 = "TimeContext"
            elif Programm.getVaribaleFromProperScope(name1).type == Type.FORCE:
                type1 = "Force_typeContext"
            elif Programm.getVaribaleFromProperScope(name1).type == Type.OBJECT:
                type1 = "Object_typeContext"

        if type2 == "VariableNameContext":
            if Programm.getVaribaleFromProperScope(name2).type == Type.INT:
                type2 = "IntegerContext"
            elif Programm.getVaribaleFromProperScope(name2).type == Type.TIME:
                type2 = "TimeContext"
            elif Programm.getVaribaleFromProperScope(name2).type == Type.FORCE:
                type2 = "Force_typeContext"
            elif Programm.getVaribaleFromProperScope(name2).type == Type.OBJECT:
                type2 = "Object_typeContext"
        # print("type1: {}, type2: {}".format(type1, type2))

        if type1 == type2:
            return True

        return False

    @staticmethod
    def getTypeFromNodeType(node_type: str, name: str = None):
        if node_type == "VariableNameContext":
            return Programm.variables[name].type
        if node_type == "IntegerContext":
            return Type.INT
        if node_type == "Object_typeContext":
            return Type.OBJECT
        if node_type == "Force_typeContext":
            return Type.FORCE
    
    @staticmethod 
    def getTypeFromContext(context):
        if type(context) is int:
            return Type.INT
        if type(context) is float:
            return Type.FLOAT
        # add checking FORCE, OBJECT, TIME

    '''
        Returns Function() object with given name
    '''
    @staticmethod
    def getFunction(name: str):
        return Programm.functions.get(name)

    @staticmethod
    def addFunction(function):
        Programm.functions[function.name] = function

    '''
        Returns instruction as a string
    '''
    @staticmethod
    def getInstructionAsTxt(ctx):
        output = ""
        for child in ctx.children:
            output += child.getText()
        return output

    @staticmethod
    def deleteFunctionsDefinitions(data: str) -> str:
        idx = data.find('DEFINE FUNCTION')
        while idx != -1:
            data = re.sub("DEFINE FUNCTION .+ ENDFUNCTION;", "", data)
            idx = data.find('DEFINE FUNCTION')
        data = re.sub(";;", ";", data)
        return data

    @staticmethod
    def inputFunctionsDefinition(data: str) -> str:
        # functions = {} # maps name to Function()
        for name, function in Programm.functions.items():
            start_idx = data.find(name+"(")
            while start_idx != -1:
                variables = {}  # maps name in call to name in declaration
                arg_list = Programm.getArguments(data, name)
                if len(arg_list) != len(function.params):
                    raise WrongNumberOfArguments(
                        name, len(function.params), len(arg_list))

                for idx in range(0, len(arg_list)):
                    '''
                    if Programm.getVariable(arg_list[idx], scope=Programm.current_scope) is None:
                        if Programm.getVariable(arg_list[idx]) is None:
                            raise UndefinedVariableReferenceError(
                                arg_list[idx])
                        if Programm.getVariable(arg_list[idx]).type != function.params[idx][1].type:
                            raise UnallowedCasting(Programm.getVariable(arg_list[idx]).getTypeString(),
                                function.params[idx][1].getTypeString())
                    else:
                        if Programm.getVariable(arg_list[idx], Programm.current_scope).type != function.params[idx][1].type:
                            raise UnallowedCasting(Programm.getVariable(arg_list[idx], Programm.current_scope).getTypeString(),
                                function.params[idx][1].getTypeString())
                    '''
                    variables[function.params[idx][0]
                        ] = arg_list[idx]  # mapps name in func dec to real name

                # replace all accurance of name(args); with function body
                f_body = Programm.getFbodyWithInputedArgs(
                    function.getBody(), variables)
                func_header = re.search(
                    name+"\( *(([a-z])([a-z]|[A-Z]|[0-9])* *(, *([a-z])([a-z]|[A-Z]|[0-9])* *)*)?\);", data).group(0)
                data = re.sub(
                    name+"\( *(([a-z])([a-z]|[A-Z]|[0-9])* *(, *([a-z])([a-z]|[A-Z]|[0-9])* *)*)?\);", func_header + f_body, data)

                start_idx = data.find(name+"(", start_idx+1)
        return data

    '''
    It gets string as 'funckja1(zmienna1, zmienna2)' and return list of parameters: ['zmienna1', 'zmienna2']
    If function has no parameters it returns empty list
    '''
    @staticmethod
    def getArguments(data: str, func_name: str):
        list = []
        str = re.search(
            func_name+"\( *(([a-z])([a-z]|[A-Z]|[0-9])* *(, *([a-z])([a-z]|[A-Z]|[0-9])* *)*)?\);", data).group(0)
        str = re.sub(func_name+"\(", "", str)
        str = re.sub("\);;", "", str)
        str = re.sub("\);", "", str)
        str = str.replace(" ", "")
        if str != "":
            list = str.rsplit(",")
        return list

    @staticmethod
    def getFbodyWithInputedArgs(f_body: str, variables):
        for key, value in variables.items():
            f_body = f_body.replace(key, value)
        f_body = "IF (1==1) THEN " + f_body + "ENDIF;"
        return f_body

    @staticmethod
    def getRepeatedVariableName(variables):
        # variables -> list((str, Variable()))
        variable_set = set()
        for item in variables:
            if item[0] in variable_set:
                return item[0]
            variable_set.add(item[0])
        return None

    @staticmethod
    def updateObjectsPositionsInVariableSet():
        for name, obj in Programm.variables.items():
            if obj.type == Type.OBJECT:
                obj.value = int(PyturtleHandler.balls.get(name).get_pos_x())
                obj.value2 = int(PyturtleHandler.balls.get(name).get_pos_y())

    @staticmethod
    def addNewVariableScope():
        id = Programm.scope_history.getSize()
        Programm.scope_history.push(id)

        if len(Programm.local_scopes) <= id:
            local_variables = {}
            Programm.local_scopes.append(local_variables)
 
        Programm.current_scope = Programm.scope_history.top()
        print("New variable scope was added, local_scopes_len: {}, scope_history_len: {}, scope_top: {}".format(len(Programm.local_scopes),Programm.scope_history.getSize(), Programm.scope_history.top()))
    
    @staticmethod
    def deleteTopVariableScope():
        Programm.displayVariables()
        # Programm.local_scopes.remove(Programm.local_scopes[Programm.scope_history.top()])
        if type(Programm.scope_history.top()) is int:
            Programm.local_scopes[Programm.scope_history.top()].clear()
        Programm.scope_history.pop()
        print("Top scope was deleted, local_scopes_len: {}, scope_history_len: {}, scope_top: {}".format(len(Programm.local_scopes),Programm.scope_history.getSize(), Programm.scope_history.top()))
    
    @staticmethod
    def addNewNamedVariableScope(name: str, previos_scopes):
        full_name = ""
        if len(previos_scopes) == 1:
            full_name = name
        else:
            for idx in range (0, len(previos_scopes)-1):
                full_name += previos_scopes[idx] + "::"
            full_name += name
        if Programm.scope_name_to_idx.get(full_name) is None: # new name
            id = len(Programm.named_scopes)
            Programm.scope_name_to_idx[full_name] = id
            local_variables = {}
            Programm.named_scopes[full_name] = local_variables
        
        Programm.scope_history.push(full_name)
        Programm.current_scope = Programm.scope_history.top()