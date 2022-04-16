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
    scope_history = Stack() # empty stack of following scopes
    functions = {} # maps name to Function()
    current_scope = None
    '''
    Handles declaration with definition, e.g. DEFINE TIME zmienna AS 100;
    Creates variable and puts it into variables dict or raises exception
    if variable was already defined.
    '''
    @staticmethod
    def defineNewVariable(name: str, type: Type, value: int, value2=None, scope=None):
        
        if scope is None: # scope is gloabal
            # variable exists in global scope
            if Programm.variables.get(name) is not None:
                raise VariableRedefinitionError(name, Programm.typeToStr(type))
            
            # drawn object would collide with different object
            if type == Type.OBJECT and not PyturtleHandler.can_object_be_drawn(value, value2):
                raise ObjectCannotBeDrawn(name, value, value2)
            
            new_var = Variable(name, type, value, value2)
            Programm.variables[name] = new_var
        
        else: # scope is local
            if Programm.local_scopes[scope].get(name) is not None:
                raise VariableRedefinitionError(name, Programm.typeToStr(type))
            
            # drawn object would collide with different object
            if type == Type.OBJECT and not PyturtleHandler.can_object_be_drawn(value, value2):
                raise ObjectCannotBeDrawn(name, value, value2)
            
            new_var = Variable(name, type, value, value2)
            Programm.local_scopes[scope][name] = new_var



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

        else: # scope is local
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
                print("     Name: {} -> details: {}".format(key,value.displayDetails()))
        
        if Programm.scope_history.getSize() == 0:
            print( "There are no local variables declared")
        else:
            id = 0
            for scope in Programm.local_scopes:
                print("Local scope nr {}".format(id))
                id += 1
                for key, value in scope.items():
                    print("     Name: {} -> details: {}".format(key,value.displayDetails()))

    @staticmethod
    def dispay_functions():
        if len(Programm.functions.keys()) == 0:
            print("There are no functions declared")
        else:
            print("Users functions:")
            for key, value in Programm.functions.items():
                print("     Name: {} -> details: {}".format(key,value.displayDetails()))


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
        return None


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
    def areTypesCompatible(type1, type2, value1, value2) -> bool:
        if type1 == "ArithmeticalExpressionContext" or type2 == "ArithmeticalExpressionContext":
            return True

        if type1 == "VariableNameContext":
            if Programm.variables[value1].type == Type.INT:
                type1 = "IntegerContext"
            elif Programm.variables[value1].type == Type.TIME:
                type1 = "IntegerContext"
            elif Programm.variables[value1].type == Type.OBJECT:
                type1 = "Force_typeContext"
            elif Programm.variables[value1].type == Type.FORCE:
                type1 = "Object_typeContext"
        
        if type2 == "VariableNameContext":
            if Programm.variables[value2].type == Type.INT:
                type2 = "IntegerContext"
            elif Programm.variables[value2].type == Type.TIME:
                type2 = "IntegerContext"
            elif Programm.variables[value2].type == Type.OBJECT:
                type2 = "Force_typeContext"
            elif Programm.variables[value2].type == Type.FORCE:
                type2 = "Object_typeContext"
        
        if type1 == type2:
            return True

        return False
    
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
            data = re.sub("DEFINE FUNCTION .+ ENDFUNCTION;","",data)
            idx = data.find('DEFINE FUNCTION')
        return data

    @staticmethod
    def inputFunctionsDefinition(data: str) -> str:
        # functions = {} # maps name to Function()
        for name, function in Programm.functions.items():
            start_idx = data.find(name+"(")
            while start_idx != -1:
                variables = {} # maps name in call to name in declaration
                arg_list = Programm.getArguments(data, name)
                if len(arg_list) != len(function.params):
                    raise WrongNumberOfArguments(name, len(function.params), len(arg_list))

                for idx in range(0,len(arg_list)):
                    '''
                    if Programm.getVariable(arg_list[idx], scope=Programm.current_scope) is None:
                        if Programm.getVariable(arg_list[idx]) is None:
                            raise UndefinedVariableReferenceError(arg_list[idx])
                        if Programm.getVariable(arg_list[idx]).type != function.params[idx][1].type:
                            raise UnallowedCasting(Programm.getVariable(arg_list[idx]).getTypeString(), 
                                function.params[idx][1].getTypeString())
                    else:
                        if Programm.getVariable(arg_list[idx], Programm.current_scope).type != function.params[idx][1].type:
                            raise UnallowedCasting(Programm.getVariable(arg_list[idx], Programm.current_scope).getTypeString(), 
                                function.params[idx][1].getTypeString())
                    '''
                    variables[function.params[idx][0]] = arg_list[idx] # mapps name in func dec to real name
                
                # replace all accurance of name(args); with function body
                f_body =  Programm.getFbodyWithInputedArgs(function.getBody(), variables)
                data = re.sub(name+"\( *(([a-z])([a-z]|[A-Z]|[0-9])* *(, *([a-z])([a-z]|[A-Z]|[0-9])* *)*)?\);", f_body, data)
                start_idx = data.find(name+"(")
        return data
    
    '''
    It gets string as 'funckja1(zmienna1, zmienna2)' and return list of parameters: ['zmienna1', 'zmienna2']
    If function has no parameters it returns empty list
    '''
    @staticmethod
    def getArguments(data: str, func_name: str):
        list = []
        str = re.search(func_name+"\( *(([a-z])([a-z]|[A-Z]|[0-9])* *(, *([a-z])([a-z]|[A-Z]|[0-9])* *)*)?\);",data).group(0)
        print("string:", str)
        str = re.sub(func_name+"\(", "", str)
        str = re.sub("\);", "", str)
        str = str.replace(" ", "")
        if str != "":
            list = str.rsplit(",")
        print(list)
        return list
    
    @staticmethod
    def getFbodyWithInputedArgs(f_body: str, variables):
        for key, value in variables.items():
            f_body = f_body.replace(key, value)
        f_body = "IF (1==1) THEN " + f_body + "ENDIF;"
        return f_body