grammar imp;

pgm: ('var' ID (COMMA ID)* SEMICOLON)? stmt;

stmt: ID EQUALS aexpr
| stmt SEMICOLON stmt 
| 'if' bexpr 'then' stmt 'else' stmt
| 'while' bexpr 'do' stmt		
|				
;

bexpr: BOOL
| aexpr EQUALORLESS aexpr
| 'not' bexpr
| bexpr 'and' bexpr;

aexpr: INT
| ID 
| aexpr PLUS aexpr
| aexpr DIV aexpr;

COMMA: ',';
SEMICOLON: ';';
LBRACKET: '(';
RBRACKET: ')';
EQUALS: ':=';
PLUS: '+';
DIV: '/';
EQUALORLESS: '<=';
INT: [0-9]+;
BOOL: 'True' | 'False';
ID: [a-zA-z]+;
WS:         [ \t\r\n]+ -> skip;