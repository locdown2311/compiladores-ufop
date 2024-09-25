lexer grammar LangLexer;
@header{
package lang.parser;
}

// Palavras chave
IF: 'if';
ELSE: 'else';
NEW: 'new';
PRINT: 'print';
WHILE: 'while';
RETURN: 'return';
INT: 'Int';
FLOAT: 'Float';
CHAR: 'Char';
BOOLEAN: 'Boolean';
VOID: 'void';
TRUE: 'true';
FALSE: 'false';
NULL: 'null';
DATA: 'data';
READ: 'read';

// Separadores
RPAREN: ')';
LPAREN: '(';
LBRACE: '{';
RBRACE: '}';
LBRACK: '[';
RBRACK: ']';
SEMICOLON: ';';
COMMA: ',';
DOT: '.';
DOUBLE_COLON: '::';
COLON: ':';

// Operadores
PLUS: '+';
MINUS: '-';
TIMES: '*';
DIVIDE: '/';
MOD: '%';
LOGICAL_AND: '&&';
LOGICAL_OR: '||';
LOGICAL_NOT: '!';
EQUALS: '==';
NOT_EQUALS: '!=';
LESS_THAN: '<';
GREATER_THAN: '>';
LESS_OR_EQUAL: '<=';
GREATER_OR_EQUAL: '>=';
ATTR: '=';

// Identificadores e tipagem
ID: [a-z][a-zA-Z0-9_]*;
TYPE: [A-Z][a-zA-Z0-9_]*;

// Literais
INTLIT: '0' | [1-9][0-9]*;
FLOATLIT: [0-9]* '.' [0-9]+;
CHARLIT: '\'' ( ~[\r\n'\\] | '\\' [nrtb'\\] ) '\'';
STRINGLIT: '"' ( ~[\r\n"\\] | '\\' [nrtb"\\] )* '"';

// Comentarios

COMMENT: '{-' .*? ('-}' | EOF) -> skip;
LINE_COMMENT : '--' ~[\r\n]*    -> skip;


// Espaços em branco
WS: [ \t\f\r\n]+ -> skip;