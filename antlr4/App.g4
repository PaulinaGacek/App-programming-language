grammar App;

primaryExpression
	: (whiteSpace? (functionDeclaration|instruction) whiteSpace?)+
	;

instruction
	: declaration
	| definition
	| conditionalStatement
	| parallelExpression
	| loop
	| functionCall
	| applyForce
	| comment
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
    :   'IF' whiteSpace? '('whiteSpace? cond=condition whiteSpace? ')' whiteSpace 'THEN' whiteSpace con_body=conditionBody whiteSpace 'ENDIF' whiteSpace? ';'
    ;

condition
    :   (left_expr=arithmeticalExpression|left_var=variableName) whiteSpace? 
		op=('=='|'>' |'<' |'>=' |'<=' |'!=')
		whiteSpace? (right_expr=arithmeticalExpression|right_var=variableName)
    ;

conditionBody: (instruction whiteSpace?)+ ;

parallelExpression
    :   'PARALLEL' whiteSpace  par_body=parallelBody whiteSpace 'ENDPARALLEL' whiteSpace? ';'
    ;

parallelBody: (app_force_=applyForce whiteSpace?)+ ;

loop
    : 'LOOP' whiteSpace? '(' whiteSpace? condition whiteSpace?')'whiteSpace l_body=loopBody whiteSpace 'ENDLOOP' whiteSpace? ';'
    ;

loopBody: instruction+ ;

functionCall
	:  f_name=functionName '(' whiteSpace? ')' whiteSpace? ';'
	|  f_name=functionName '(' whiteSpace? f_args=functionParams whiteSpace? ')'whiteSpace? ';'
	;

functionDeclaration
	: 'DEFINE FUNCTION' whiteSpace f_name=functionName '(' whiteSpace? ')' whiteSpace 'AS'  whiteSpace? f_body=functionBody  whiteSpace? 'ENDFUNCTION' whiteSpace? ';'
	| 'DEFINE FUNCTION' whiteSpace f_name=functionName '('whiteSpace? f_args=functionArgs whiteSpace? ')' whiteSpace 'AS'  whiteSpace? f_body=functionBody  whiteSpace? 'ENDFUNCTION' whiteSpace? ';'
	;

functionBody
    : (instruction whiteSpace?)+
	;

functionArgs
    : functionArgument (whiteSpace? ',' whiteSpace? functionArgument)*
    ;

functionParams
	: variableName (whiteSpace? ',' whiteSpace? variableName)*
	;

functionArgument: type_=variableType whiteSpace name_=variableName;

whiteSpace
	: WS+;

comment
	: '/*' .*? '*/';

WS
	: '\n'
	| ' '
	| '\t'
	| '\r'
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
