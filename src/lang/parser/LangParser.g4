parser grammar LangParser;

@header {
package lang.parser;
import java.util.*;
import lang.nodes.expr.*;
import lang.nodes.*;
}

options { tokenVocab=LangLexer; }

// Regras iniciais
prog: (def)*;

// Regras para definições
def: data | func;

// Definição de estrutura de dados
data: DATA TYPE LBRACE (decl)* RBRACE;

// Declaração de variável em uma estrutura de dados
decl: ID DOUBLE_COLON type SEMICOLON;

// Definição de função
func: ID LPAREN (params)? RPAREN (COLON type (COMMA type)*)? LBRACE (cmd)* RBRACE;

// Parâmetros de função
params: ID DOUBLE_COLON type (COMMA ID DOUBLE_COLON type)*;

// Tipos
type: btype (LBRACK RBRACK)?;

btype: INT
     | CHAR
     | BOOLEAN
     | FLOAT
     | TYPE;

// Comandos
cmd: block
   | ifCmd
   | whileCmd
   | readCmd
   | printCmd
   | returnCmd
   | assignCmd
   | funcCallCmd
   ;

block: LBRACE (cmd)* RBRACE;

ifCmd returns [Exp e]: 
   IF LPAREN exp RPAREN cmd (el=ELSE cmd)? {
      if ($el != null)
         System.out.println("Else encontrado");
      ;}
   ;

whileCmd: WHILE LPAREN exp RPAREN cmd;

readCmd: READ lvalue SEMICOLON;

printCmd: PRINT exp SEMICOLON;

returnCmd: RETURN exp (COMMA exp)* SEMICOLON;

assignCmd: lvalue ATTR exp SEMICOLON;

accessReturn: ID LPAREN (exps)? RPAREN LBRACK exp RBRACK;


funcCallCmd: ID LPAREN (exps)? RPAREN (LESS_THAN lvalue (COMMA lvalue)* GREATER_THAN)? SEMICOLON;

// Expressões
exp returns [Exp e]: 
   a=exp TIMES b=exp {$e = new Times($a,$b);}
   | a=exp DIVIDE b=exp {$e = new Div($a.e,$b.e);}
   | exp MOD exp {$e = new Mod($a.e,$b.e);}
   | exp PLUS exp {$e = new Plus($a.e,$b.e);}
   | exp MINUS exp {$e = new Minus($a.e,$b.e);}
   | exp LOGICAL_AND exp {$e = new And($a.e,$b.e);}
   | exp LESS_THAN exp {$e = new Lt($a.e,$b.e);} 
   | exp EQUALS exp {$e = new Eq($a.e,$b.e);}
   | exp NOT_EQUALS exp {$e = new And($a.e,$b.e);}
   | LOGICAL_NOT exp
   | MINUS exp
   | TRUE {$e = new BoolLit(true);}
   | FALSE {$e = new BoolLit(false);}
   | NULL
   | INTLIT
   | FLOATLIT
   | CHARLIT
   | lvalue
   | LPAREN exp RPAREN
   | NEW type (LBRACK exp RBRACK)*
   | accessReturn;

// Lvalue
lvalue: ID
      | lvalue LBRACK exp RBRACK
      | lvalue DOT ID;

// Lista de expressões
exps: exp (COMMA exp)*;