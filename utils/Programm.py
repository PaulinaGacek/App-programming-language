from utils.Variable import *
from utils.Error import *
from front.PyturtleHandler import Force, PyturtleHandler

class Programm:

    '''
    Keeps global variables, mapps variable name to the variable object
    '''
    variables = {}

    '''
    Keeps global variables of force type, mapps name to the force object
    '''
    forces = {}

    '''
    Handles declaration with definition, e.g. DEFINE TIME zmienna AS 100;
    Creates variable and puts it into variables dict or raises exception
    if variable was already defined.
    '''
    @staticmethod
    def defineNewVariable(name: str, type: Type, value: int, value2=None):
        
        if Programm.variables.get(name) is not None:
            raise VariableRedefinitionError(name, Programm.typeToStr(type))
        
        if type == Type.OBJECT and not PyturtleHandler.can_object_be_drawn(value, value2):
            raise ObjectCannotBeDrawn(name, value, value2)
        elif type == Type.OBJECT:
            print("Object can be drawn")
        
        new_var = Variable(name, type, value, value2)
        Programm.variables[name] = new_var


    '''
    Handles definition of declared object, e.g. SET zmienna AS 100;
    It sets value of the variable as given nr or raises exception 
    if variable was not previously defined.
    '''
    @staticmethod
    def defineExistingVariable(name: str, value: int, value2=None):

        if Programm.variables.get(name) is None:
            raise UndefinedVariableReferenceError(name)
        
        print("Value 2: {}".format(value2))
        Programm.variables[name].value = value
        Programm.variables[name].value2 = value2
        


    '''
    Handles declaration without definition, e.g. DEFINE TIME zmienna;
    Creates variable with no value and puts it into variables dict or raises exception
    if variable was already defined.
    '''
    @staticmethod
    def declareNewVariable(name: str, type: Type):
        
        if Programm.getVariable(name) is not None:
            raise VariableRedefinitionError(name, Programm.typeToStr(type))
        
        new_var = Variable(name, type, None, None)
        Programm.variables[name] = new_var
    

    '''
    Prints the content of variables dict.
    '''
    @staticmethod
    def displayVariables():
        if len(Programm.variables) == 0:
            print("There are no declared variables")
            return
            
        print("Global variables:")
        for key, value in Programm.variables.items():
            print("Name: {} -> details: {}".format(key,value.displayDetails()))


    '''
    Converts given string to Type object
    '''
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
    def getVariable(name: str):
        return Programm.variables.get(name)
    
    '''
    Returns type of the Variable object with given name
    '''
    def getVariablesTypeStr(name: str):
        return Programm.typeToStr(Programm.variables.get(name).type)
    