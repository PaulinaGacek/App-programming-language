from utils.Variable import *
from utils.Error import *
from utils.Stack import *
from front.PyturtleHandler import Force, PyturtleHandler

class Programm:

    '''
    Keeps global variables, mapps variable name to the variable object
    '''
    variables = {}
    local_scopes = []
    scope_history = Stack() # empty stack of following scopes
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
