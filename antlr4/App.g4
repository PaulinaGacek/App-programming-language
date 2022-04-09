grammar App;

primaryExpression
	: (whiteSpace? instruction whiteSpace?)+
	;

instruction
	: declaration
	| definition
	| conditionalStatement
	| parallelExpression
	| loop
	| function
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

integer
	: '-'? NONZERODIGIT (NONZERODIGIT|ZERO)*
	| ZERO
	;


arithmeticalExpression
    : arithmeticalExpression whiteSpace? ('+'|'-'|'/'|'*') whiteSpace? arithmeticalExpression
	| integer
    ;

declaration
	:   'DEFINE' whiteSpace simpleVariableType whiteSpace variableName whiteSpace? ';'
	|   'DEFINE' whiteSpace simpleVariableType whiteSpace variableName whiteSpace 'AS' whiteSpace arithmeticalExpression whiteSpace? ';'
	|   'DEFINE' whiteSpace complexVariableType whiteSpace variableName whiteSpace? ';'
	|   'DEFINE' whiteSpace complexVariableType whiteSpace variableName whiteSpace 'AS' 
		whiteSpace arithmeticalExpression whiteSpace? ',' whiteSpace? arithmeticalExpression whiteSpace? ';'
	;

definition
	:   'SET' whiteSpace variableName whiteSpace 'AS' whiteSpace arithmeticalExpression ';'
	|   'SET' whiteSpace variableName whiteSpace 'AS' whiteSpace arithmeticalExpression whiteSpace? 
		',' whiteSpace? arithmeticalExpression ';'
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

whiteSpace
	: WS+;

WS
	: '\n'
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
