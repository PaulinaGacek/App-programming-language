from variable import *

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
            raise Error("Redefinition of the variable")
        
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
    def declareNewVariable(name: str, type: Type, value: int, value2=None):
        
        if Programm.variables.get(name) is not None:
            raise Error("Redefinition of the variable")
        
        Programm.variables[name] = None