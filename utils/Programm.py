from utils.Variable import *
from utils.Error import VariableRedefinitionError

class Programm:

    '''
    Mapps variable name to the variable object
    '''
    variables = {}

    '''
    handles: DEFINE TIME zmienna AS 100;
    '''
    @staticmethod
    def defineNewVariable(name: str, type: Type, value: int, value2=None):
        
        if Programm.variables.get(name) is not None:
            raise VariableRedefinitionError(Programm.getVariable(name))
        
        new_var = Variable(name, type, value, value2)
        Programm.variables[name] = new_var


    '''
    handles: SET zmienna AS 100;
    '''
    @staticmethod
    def defineExistingVariable(name: str, type: Type, value: int, value2=None):

        if Programm.variables.get(name) is None:
            raise Error("Variable was not declared in current scope")
        
        new_var = Variable(name, type, value, value2)
        Programm.variables[name] = new_var


    '''
    handles: DEFINE TIME zmienna;
    '''
    @staticmethod
    def declareNewVariable(name: str, type: Type):
        
        if Programm.getVariable(name) is not None:
            raise VariableRedefinitionError(Programm.getVariable(name))
        
        new_var = Variable(name, type, None, None)
        Programm.variables[name] = new_var
    

    @staticmethod
    def displayVariables():
        if len(Programm.variables) == 0:
            print("There are no declared variables")
            return

        for key, value in Programm.variables.items():
            print("Name: {} -> details: {}".format(key,value.displayDetails()))


    def strToType(type: str):
        if type == "TIME":
            return Type.TIME
        elif type == "INT":
            return Type.INT
        elif type == "OBJECT":
            return Type.OBJECT
        else:
            return Type.FORCE


    def typeToStr(type: Type):
        if type == Type.TIME:
            return "TIME" 
        elif type == Type.INT:
            return "INT"
        elif type == Type.OBJECT:
            return "OBJECT"
        else:
            return "FORCE"


    def getVariable(name: str):
        return Programm.variables.get(name)