parser grammar LangParser;

@header {
package lang.parser;
import java.util.*;
import lang.nodes.expr.*;
import lang.nodes.*;
}

options { tokenVocab=LangLexer; }

// Regras iniciais
prog returns [CProg c]: 
      e+=def+ { 
          // Inicializa o programa com as definições
      }
      ;

// Regras para definições
def: data | func;

// Definição de estrutura de dados
data: 
      DATA TYPE LBRACE decl* RBRACE {
          // Cria uma nova definição de estrutura de dados
          System.out.println("Definindo estrutura de dados: " + $TYPE.text);
      }
      ;

// Declaração de variável em uma estrutura de dados
decl: ID DOUBLE_COLON type SEMICOLON {
          // Adiciona a declaração de variável à estrutura
          System.out.println("Declarando variável: " + $ID.text + " do tipo " + $type.text);
      }
      ;

// Definição de função
func: ID LPAREN (params)? RPAREN (COLON type (COMMA type)*)? LBRACE (cmd)* RBRACE {
          // Cria uma nova definição de função
          System.out.println("Definindo função: " + $ID.text);
      }
      ;

// Parâmetros de função
params: ID DOUBLE_COLON type (COMMA ID DOUBLE_COLON type)* {
          // Processa parâmetros da função
          System.out.println("Parâmetros: " + $ID.text + " do tipo " + $type.text);
      }
      ;

// Tipos
type: btype (LBRACK RBRACK)?;

// Tipos básicos
btype: INT
     | CHAR
     | BOOLEAN
     | FLOAT
     | VOID
     | TYPE;

// Comandos
cmd : block
   | ifCmd
   | whileCmd
   | readCmd
   | printCmd
   | returnCmd
   | assignCmd
   | funcCallCmd
   ;

block: LBRACE (cmd)* RBRACE;

ifCmd : 
   IF LPAREN exp RPAREN cmd (ELSE cmd)? {
      System.out.println("IF: " + $IF.text + " "+$exp.text +" "+ $ELSE.text+" "+$cmd.text);
   }
   ;

whileCmd: WHILE LPAREN exp RPAREN cmd;

readCmd: READ lvalue SEMICOLON;

printCmd: PRINT exp SEMICOLON;

returnCmd: RETURN exp (COMMA exp)* SEMICOLON;

assignCmd: lvalue ATTR exp SEMICOLON;

accessReturn: ID LPAREN (exps)? RPAREN LBRACK exp RBRACK;

funcCallCmd: ID LPAREN (exps)? RPAREN (LESS_THAN lvalue (COMMA lvalue)* GREATER_THAN)? SEMICOLON;

exp : logicalOrExp;

logicalOrExp
   : logicalAndExp (LOGICAL_OR logicalAndExp)*
   ;

logicalAndExp
   : equalityExp (LOGICAL_AND equalityExp)*
   ;

equalityExp
   : relationalExp ((EQUALS | NOT_EQUALS) relationalExp)*
   ;

relationalExp
   : additiveExp ((LESS_THAN | GREATER_THAN | LESS_OR_EQUAL | GREATER_OR_EQUAL) additiveExp)*
   ;

additiveExp
   : multiplicativeExp ((PLUS | MINUS) multiplicativeExp)*
   ;

multiplicativeExp
   : unaryExp ((TIMES | DIVIDE | MOD) unaryExp)*
   ;

unaryExp
   : (LOGICAL_NOT | MINUS) unaryExp
   | primaryExp
   ;

primaryExp
   : TRUE
   | FALSE
   | NULL
   | INTLIT
   | FLOATLIT
   | CHARLIT
   | STRINGLIT
   | lvalue
   | LPAREN exp RPAREN
   | NEW type (LBRACK exp RBRACK)*
   | accessReturn
   ;

// Lvalue
lvalue: ID
      | lvalue LBRACK exp RBRACK
      | lvalue DOT ID;

// Lista de expressões
exps: exp (COMMA exp)*;