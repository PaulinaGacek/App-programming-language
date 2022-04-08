// Gramatyka ANTRL

grammar App;

primaryExpression
	: (WS* instruction WS*)+
	;

instruction
	: declaration
	| definition
	| conditionalStatement
	| parallelExpression
	| loop
	| function
	;


digitSequence
	: (NONZERODIGIT | ZERO)+
	;

naturalNumber
	: (NONZERODIGIT | ZERO)
	| NONZERODIGIT digitSequence
	;

integer
	: '-' NONZERODIGIT (digitSequence)?
	| naturalNumber
	;

signSequence
	: (LOWERCASELETTER|UPPERCASELETTER|'_'| NONZERODIGIT | ZERO)+
	;

simpleVariableType
	: 'TIME'
	| 'INT'
	| 'OBJECT'
	;

complexVariableType: 'FORCE';

variable
	: simpleVariableType
	| complexVariableType
	;

variableName
	: LOWERCASELETTER signSequence?
	;

functionName
	: LOWERCASELETTER signSequence?
	;
arithmeticSymbol
    : integer
    | variableName
    ;
    
arithmeticalExpression
    : (multiplicativeExpression|additiveExpression)+
    ;

multiplicativeExpression
    :   additiveExpression WS* (WS*('*'|'/') WS* additiveExpression WS*)*
    ;

additiveExpression
    :   arithmeticSymbol WS* (WS*('+'|'-') WS* multiplicativeExpression WS*)*
    ;

declaration
	:   'DEFINE' WS+ simpleVariableType WS+ variableName WS* ';'
	|   'DEFINE' WS+ simpleVariableType WS+ variableName WS+ 'AS' WS+ arithmeticalExpression WS* ';'
	|   'DEFINE' WS+ complexVariableType WS+ variableName WS* ';'
	|   'DEFINE' WS+ complexVariableType WS+ variableName WS+ 'AS' WS+ arithmeticalExpression WS* ','
	     WS* arithmeticalExpression WS*';'
	;

definition
	:   'SET' WS+ variableName WS+ 'AS' WS+ arithmeticalExpression ';'
	|   'SET' WS+ variableName WS+ 'AS' WS+ arithmeticalExpression WS+ ',' WS+ arithmeticalExpression ';'
	;

conditionalStatement
    :   'IF' WS* '('WS* condition WS* ')' WS+ 'THEN' WS+ primaryExpression WS+ 'ENDIF' WS* ';'
    ;

condition
    :   variableName WS* '==' WS* arithmeticalExpression
    |   variableName WS* '>' WS* arithmeticalExpression
    |   variableName WS* '<' WS* arithmeticalExpression
    |   variableName WS* '>=' WS* arithmeticalExpression
    |   variableName WS* '<=' WS* arithmeticalExpression
    |   variableName WS* '!=' WS* arithmeticalExpression
    ;

instructions
    :   WS+
    |   declaration WS+ instructions WS*
    |   declaration WS+ instructions WS*
    |   loop WS+ instructions WS*
    |   conditionalStatement WS+ instructions WS*
    ;

parallelExpression
    :   'PARALLEL' WS+ primaryExpression WS+ 'ENDPARALLEL' WS* ';'
    ;

loop
    : 'LOOP' WS+ '(' WS* declaration WS* condition WS* ';' WS* definition WS*')'WS+ primaryExpression WS+ 'ENDLOOP' WS* ';'
    | 'LOOP' WS+ '('WS*';' WS* condition WS* ';' WS* definition WS*')' WS+ primaryExpression WS+ 'ENDLOOP' WS* ';'
    ;

function
    :   'DEFINE FUNCTION' WS+ functionName '(' WS* functionArgs WS* ')' WS 'AS' WS+ functionBody WS+ 'ENDFUNCTION' WS* ';'
    |   'DEFINE FUNCTION' WS+ functionName WS+ 'AS' WS+ functionBody WS+ 'ENDFUNCTION' WS* ';'
    ;

functionBody
    : primaryExpression WS*
    | primaryExpression WS+ parallelExpression WS+ primaryExpression WS*
    ;

functionArgs
    : declaration WS*
    | declaration WS* ',' WS* functionArgs
    ;

WS
	:
	'\n'
	| ' '
	| '\t'
	;

LOWERCASELETTER
	: [a-z]
	;

UPPERCASELETTER
	:[A-Z]
	;

NONZERODIGIT
	: [1-9]
	;

ZERO 
    : '0'
    ;
