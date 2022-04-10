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
	| applyForce
	;

simpleVariableType
	: 'TIME'
	| 'INT';

complexVariableType
    : 'FORCE'
    | 'OBJECT';

variableName
	: LOWERCASELETTER (LOWERCASELETTER|UPPERCASELETTER|'_'| NONZERODIGIT | ZERO)*
	;

functionName
	: LOWERCASELETTER (LOWERCASELETTER|UPPERCASELETTER|'_'| NONZERODIGIT | ZERO)*
	;

integer
	: NONZERODIGIT (NONZERODIGIT|ZERO)*
	| ZERO
	;

applyForce
    : 'APPLY' whiteSpace variableName whiteSpace 'TO' whiteSpace variableName whiteSpace 'FOR' whiteSpace (variableName|integer) whiteSpace? ';'
    ;


arithmeticalExpression
    : left=arithmeticalExpression whiteSpace? op=('+'|'-'|'/'|'*') whiteSpace? right=arithmeticalExpression
	| integer
	| variableName
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
    :   'IF' whiteSpace? '('whiteSpace? condition whiteSpace? ')' whiteSpace 'THEN' whiteSpace primaryExpression whiteSpace 'ENDIF' whiteSpace? ';'
    ;

condition
    :   variableName whiteSpace? '==' whiteSpace? arithmeticalExpression
    |   variableName whiteSpace? '>' whiteSpace? arithmeticalExpression
    |   variableName whiteSpace? '<' whiteSpace? arithmeticalExpression
    |   variableName whiteSpace? '>=' whiteSpace? arithmeticalExpression
    |   variableName whiteSpace? '<=' whiteSpace? arithmeticalExpression
    |   variableName whiteSpace? '!=' whiteSpace? arithmeticalExpression
    ;

parallelExpression
    :   'PARALLEL' whiteSpace primaryExpression whiteSpace 'ENDPARALLEL' whiteSpace? ';'
    ;

loop
    : 'LOOP' whiteSpace '(' whiteSpace? declaration whiteSpace? condition whiteSpace? ';' whiteSpace? definition whiteSpace?')'whiteSpace primaryExpression whiteSpace 'ENDLOOP' whiteSpace? ';'
    | 'LOOP' whiteSpace '('whiteSpace?';' whiteSpace? condition whiteSpace? ';' whiteSpace? definition whiteSpace?')' whiteSpace primaryExpression whiteSpace 'ENDLOOP' whiteSpace? ';'
    ;

function
    :   'DEFINE FUNCTION' whiteSpace functionName '(' whiteSpace? functionArgs whiteSpace? ')' whiteSpace 'AS' whiteSpace functionBody whiteSpace 'ENDFUNCTION' whiteSpace? ';'
    |   'DEFINE FUNCTION' whiteSpace functionName whiteSpace 'AS' whiteSpace functionBody whiteSpace 'ENDFUNCTION' whiteSpace? ';'
    ;

functionBody
    : primaryExpression whiteSpace?
    | primaryExpression whiteSpace parallelExpression whiteSpace primaryExpression whiteSpace?
    ;

functionArgs
    : declaration whiteSpace?
    | declaration whiteSpace? ',' whiteSpace? functionArgs
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
