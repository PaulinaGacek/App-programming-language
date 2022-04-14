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

variableType
	: 'TIME'
	| 'INT'
    | 'FORCE'
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

force_type: '['angle=integer ',' power=integer ']';

object_type: '('x_cor=integer ',' y_cor=integer ')';

applyForce
    : 'APPLY' whiteSpace (force_=variableName|force_val=force_type) whiteSpace 
		'TO' whiteSpace object_=variableName whiteSpace 
		'FOR' whiteSpace (time_=variableName|time_val=integer) 
		(whiteSpace 'DELAY' whiteSpace (delay_=variableName|delay_val_=integer))? whiteSpace? ';'
    ;


arithmeticalExpression
    : left=arithmeticalExpression whiteSpace? op=('+'|'-'|'/'|'*') whiteSpace? right=arithmeticalExpression
	| integer
	| force_type
	| object_type
	| variableName
    ;

declaration
	:   'DEFINE' whiteSpace type_sim=variableType whiteSpace name_=variableName whiteSpace 'AS' whiteSpace value_=arithmeticalExpression whiteSpace? ';'
	;

definition
	:   'SET' whiteSpace name_=variableName whiteSpace 'AS' whiteSpace value_=arithmeticalExpression ';'
	;

conditionalStatement
    :   'IF' whiteSpace? '('whiteSpace? condition whiteSpace? ')' whiteSpace 'THEN' whiteSpace instruction+ whiteSpace 'ENDIF' whiteSpace? ';'
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
    :   'PARALLEL' whiteSpace (app_force_=applyForce|parallel_=parallelExpression)+ whiteSpace 'ENDPARALLEL' whiteSpace? ';'
    ;

loop
    : 'LOOP' whiteSpace '(' whiteSpace? declaration whiteSpace? condition whiteSpace? ';' whiteSpace? definition whiteSpace?')'whiteSpace instruction+ whiteSpace 'ENDLOOP' whiteSpace? ';'
    | 'LOOP' whiteSpace '('whiteSpace?';' whiteSpace? condition whiteSpace? ';' whiteSpace? definition whiteSpace?')' whiteSpace instruction+ whiteSpace 'ENDLOOP' whiteSpace? ';'
    ;

function
    :   'DEFINE FUNCTION' whiteSpace functionName '(' whiteSpace? functionArgs whiteSpace? ')' whiteSpace 'AS' whiteSpace functionBody whiteSpace 'ENDFUNCTION' whiteSpace? ';'
    |   'DEFINE FUNCTION' whiteSpace functionName whiteSpace 'AS' whiteSpace functionBody whiteSpace 'ENDFUNCTION' whiteSpace? ';'
    ;

functionBody
    : instruction+ whiteSpace?
    | instruction+ whiteSpace parallelExpression whiteSpace instruction+ whiteSpace?
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
