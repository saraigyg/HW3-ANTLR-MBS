grammar TinyScript;

program
	:	functionDefinition* main functionDefinition*
	;

functionDefinition
    :   returnType
        functionName
        LPAREN (functionParameter (COMMA functionParameter)*)? RPAREN
        LCURLY statement* RCURLY
    ;
returnType: VOID | ID;
functionName: ID;

functionParameter
    :   parameterType parameterName
    ;
parameterType: ID;
parameterName: ID;

main: MAIN LCURLY statement* RCURLY;

statement
	:	variableDeclaration
	|	assignmentStatement
	|   whileStatement
	|	ifStatement
	|   functionCall EOS
	|   returnStatement
	;

variableDeclaration
	:	(VAR | typeName) varName (ASSIGN expression)? EOS
	;
typeName: ID;
varName: ID;

assignmentStatement
	:   varName ASSIGN expression EOS
	;

whileStatement
    :   WHILE LPAREN condition RPAREN LCURLY statement* RCURLY
    ;
condition: expression;

ifStatement
	: 	IF LPAREN condition RPAREN LCURLY statement* RCURLY elseStatement?
	;
elseStatement
    :   ELSE (ifStatement | LCURLY statement* RCURLY)
    ;

functionCall
    :   functionTarget LPAREN parameterList? RPAREN
    ;
functionTarget: ID;

parameterList
    :   (expression (COMMA expression)*)
    ;

returnStatement
    :   RETURN expression EOS
    ;

expression
    :   primary                                             #primaryExpression
        | expression mulDivOp expression                    #mulDivExpression
        | expression addSubOp expression                    #addSubExpression
        | expression logicalOp expression                   #logicalExpression
    ;

addSubOp
    : PLUS | MINUS
    ;
mulDivOp
    : MUL | DIV
    ;
logicalOp
    : GTE | LTE | GT | LT | EQ | NEQ
    ;

primary
	: parenthesizedExpression
    | functionCall
    | literalExpression
    ;

parenthesizedExpression
    :   LPAREN expression RPAREN
    ;

literalExpression
    : nullLiteral
    | intLiteral
    | stringLiteral
    | boolLiteral
    | varRef
    ;
varRef: ID;
nullLiteral : NULL;
intLiteral : MINUS? INT;
stringLiteral: STRING;
boolLiteral: TRUE | FALSE;

LPAREN: '(';
RPAREN: ')';
LCURLY: '{';
RCURLY: '}';
EOS: ';';
COMMA: ',';

EQ: '==';
NEQ: '!=';
NEG: '!';
LT: '<';
GT: '>';
LTE: '<=';
GTE: '>=';

ASSIGN: '=';
PLUS: '+';
MINUS: '-';
MUL: '*';
DIV: '/';

IF: 'if';
ELSE: 'else';
WHILE: 'while';
VAR: 'var';
MAIN: 'main';
RETURN: 'return';
VOID: 'void';

NULL : 'null';
TRUE: 'true';
FALSE: 'false';
STRING: '"' (~[\r\n"])* '"';
INT: [0-9]+;

ID:	[a-zA-Z][a-zA-Z0-9_]*;
WS: (' '| '\t' | '\n' | '\r') -> skip;
COMMENT: '/*' .*? '*/' -> skip;
LINE_COMMENT: '//' ~[\r\n]* -> skip;