grammar imp;

pgm: modules+;

modules: ('eq' ID '=' LBRACKET)? body (RBRACKET)?;

body: ('var' ID (COMMA ID)* SEMICOLON)? stmt+;

stmt: ID EQUALS aexpr SEMICOLON?
| stmt SEMICOLON stmt 
| LBRACKET stmt SEMICOLON stmt RBRACKET
| 'if' bexpr 'then' stmt 'else' stmt
| 'if' LBRACKET bexpr RBRACKET 'then' LBRACKET stmt RBRACKET 'else' LBRACKET stmt RBRACKET
| 'if' LBRACKET bexpr RBRACKET 'then' LBRACKET stmt RBRACKET 'else' stmt
| 'if' bexpr 'then' stmt 'else' LBRACKET stmt RBRACKET
| 'while' bexpr 'do' stmt		
| 'while' LBRACKET bexpr RBRACKET 'do' stmt			
| 'while' bexpr 'do' LBRACKET stmt RBRACKET
| 'while' LBRACKET bexpr RBRACKET 'do' LBRACKET stmt RBRACKET	
| ID SEMICOLON?
| 'skip'
;

bexpr: BOOL
| aexpr EQUALORLESS aexpr
| LBRACKET aexpr EQUALORLESS aexpr RBRACKET 
| 'not' bexpr
| 'not' LBRACKET bexpr RBRACKET
| bexpr 'and' bexpr;

aexpr: INT
| '-'INT
| LBRACKET '-'INT RBRACKET 
| ID 
| aexpr PLUS aexpr
| LBRACKET aexpr PLUS aexpr RBRACKET
| aexpr DIV aexpr
| LBRACKET aexpr DIV aexpr RBRACKET;

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