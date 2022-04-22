grammar App;

primaryExpression
	: (whiteSpace? (functionDeclaration|instruction|scopeDeclaration) whiteSpace?)+
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
    | 'OBJECT'
	| 'FLOAT' 
	;

variableName
	: scope_seq=scopeSequence? LOWERCASELETTER (LOWERCASELETTER|UPPERCASELETTER|'_'| NONZERODIGIT | ZERO)*
	;

functionName
	: LOWERCASELETTER (LOWERCASELETTER|UPPERCASELETTER|'_'| NONZERODIGIT | ZERO)*
	;

integer
	: NONZERODIGIT (NONZERODIGIT|ZERO)*
	| ZERO
	;

float_type
	: (minus='-')? NONZERODIGIT (NONZERODIGIT|ZERO)* '.' (NONZERODIGIT|ZERO)*
	| ZERO '.' (NONZERODIGIT|ZERO)*
	;

time_type
	: integer':'integer':'integer':';

force_type: '['angle=integer ',' power=integer ']';

object_type: '('x_cor=integer ',' y_cor=integer ')';

applyForce
    : 'APPLY' whiteSpace (force_=variableName|force_val=force_type) whiteSpace 
		'TO' whiteSpace object_=variableName whiteSpace 
		'FOR' whiteSpace (time_=variableName|time_val=integer|time_type_val=time_type) 
		(whiteSpace 'DELAY' whiteSpace (delay_=variableName|delay_val_=integer|delay_time_type_val=time_type))? whiteSpace? ';'
    ;


arithmeticalExpression
    : left=arithmeticalExpression whiteSpace? op=('+'|'-'|'/'|'*') whiteSpace? right=arithmeticalExpression
	| integer
	| float_type
	| force_type
	| object_type
	| time_type
	| variableName
	| functionCall
	| getAngle
	| getCoordinate
	| getDistance
	| getVelocity
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
	:   scope_seq=scopeSequence? f_name=functionName '(' whiteSpace? (f_args=functionParams whiteSpace?)? ')' whiteSpace? ';'
	;

functionDeclaration
	: 'DEFINE FUNCTION' whiteSpace f_name=functionName '(' whiteSpace? f_args=functionArgs? whiteSpace? ')' (whiteSpace? '->' whiteSpace? return_type=variableType whiteSpace?)? whiteSpace 'AS'  whiteSpace? f_body=functionBody  whiteSpace? 'ENDFUNCTION' whiteSpace? ';'
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

comment
	: '/*' .*? '*/';

scopeName
	: UPPERCASELETTER (LOWERCASELETTER|UPPERCASELETTER|'_'| NONZERODIGIT | ZERO)*;

scopeSequence
	: (scopeName'::')+;

scopeDeclaration
	: name=scopeName whiteSpace? '{' whiteSpace? (scopeDeclaration|declaration)+ whiteSpace?'}'whiteSpace? ';' ;

whiteSpace
	: WS+;

getAngle
	: 'ANGLE BETWEEN' whiteSpace? (name_1=variableName|object_1=object_type) whiteSpace? ',' whiteSpace? (name_2=variableName|object_2=object_type) whiteSpace? ';';

getCoordinate
	: 'COORDINATE' whiteSpace? axis=('X'|'Y') whiteSpace? 'OF' whiteSpace? name_=variableName whiteSpace? ';';

getDistance
	: 'DISTANCE BETWEEN' whiteSpace? (name_1=variableName|object_1=object_type) whiteSpace? ',' whiteSpace? (name_2=variableName|object_2=object_type) whiteSpace? ';';

getVelocity
	: 'VELOCITY' whiteSpace? axis=('X'|'Y'|'VALUE') whiteSpace? 'OF' whiteSpace? name_=variableName whiteSpace? ';';

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
