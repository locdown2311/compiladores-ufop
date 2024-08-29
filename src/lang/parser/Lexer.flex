package lang.parser;
import java.lang.String;

import beaver.Symbol;
import beaver.Scanner;
%%
%class Lexer
%public
%unicode
%line
%column
%extends Scanner
%function nextToken
%type Symbol

%yylexthrow Scanner.Exception
%eofval{
	return new Symbol(Terminals.EOF, "end-of-file");
%eofval}


LineTerminator = \r|\n|\r\n
InputCharacter = [^\r\n]

WhiteSpace = {LineTerminator} | [ \t\f]

/* Comentarios (Melhorar formato de bloco, um bloco de comentario aberto por exemplo) */
Comment = "{-" [^-] ~"-}" | "--" {InputCharacter}* {LineTerminator}?

/* Identificadores */
Identifier = [a-z][a-zA-Z0-9_]*

/* Tipagem */
TypeName = [A-Z][a-zA-Z0-9_]*

/* Inteiro Literal */
IntegerLiteral = 0 | [1-9][0-9]*

/* Flutuante literal */
FloatingPointLiteral = [0-9]* "." [0-9]+

/* Char literal */
CharacterLiteral = "'" ( [^\r\n'\\] | "\\" [nrtb'\\] )  "'"

/* String literals */
StringLiteral = "\"" ( [^\r\n"\\] | "\\" [nrtb"\\] )* "\""

/* Metodos adicionais */
%{ 

%}

%state COMMENT


%%
<YYINITIAL>{
    /* Palavras chave */
    "if"                      { return  new Symbol(Terminals.IF,yyline + 1, yycolumn + 1, yylength(),yytext()); }
    "else"                    { return  new Symbol(Terminals.ELSE,yyline + 1, yycolumn + 1, yylength(),yytext()); }
    "while"                   { return  new Symbol(Terminals.WHILE,yyline + 1, yycolumn + 1, yylength(),yytext()); }
    "return"                  { return  new Symbol(Terminals.RETURN,yyline + 1, yycolumn + 1, yylength(),yytext()); }
    "int"                     { return  new Symbol(Terminals.INT,yyline + 1, yycolumn + 1, yylength(),yytext()); }
    "float"                   { return  new Symbol(Terminals.FLOAT,yyline + 1, yycolumn + 1, yylength(),yytext()); }
    "char"                    { return  new Symbol(Terminals.CHAR,yyline + 1, yycolumn + 1, yylength(),yytext()); }
    "boolean"                 { return  new Symbol(Terminals.BOOLEAN,yyline + 1, yycolumn + 1, yylength(),yytext()); }
    "void"                    { return  new Symbol(Terminals.VOID,yyline + 1, yycolumn + 1, yylength(),yytext()); }
    "true"                    { return  new Symbol(Terminals.TRUE,yyline + 1, yycolumn + 1, yylength(),yytext()); }
    "false"                   { return  new Symbol(Terminals.FALSE,yyline + 1, yycolumn + 1, yylength(),yytext()); }
    "null"                    { return  new Symbol(Terminals.NULL,yyline + 1, yycolumn + 1, yylength(),yytext()); }

    /* Separadores */
    ")"                     { return  new Symbol(Terminals.RPAREN,yyline + 1, yycolumn + 1, yylength(),yytext()); }
    "("                     { return  new Symbol(Terminals.LPAREN,yyline + 1, yycolumn + 1, yylength(),yytext()); }
    "{"                     { return  new Symbol(Terminals.LBRACE,yyline + 1, yycolumn + 1, yylength(),yytext()); }
    "}"                     { return  new Symbol(Terminals.RBRACE,yyline + 1, yycolumn + 1, yylength(),yytext()); }
    "["                     { return  new Symbol(Terminals.LBRACK,yyline + 1, yycolumn + 1, yylength(),yytext()); }
    "]"                     { return  new Symbol(Terminals.RBRACK,yyline + 1, yycolumn + 1, yylength(),yytext()); }
    ";"                     { return  new Symbol(Terminals.SEMICOLON,yyline + 1, yycolumn + 1, yylength(),yytext()); }
    ","                     { return  new Symbol(Terminals.COMMA,yyline + 1, yycolumn + 1, yylength(),yytext()); }
    "."                     { return  new Symbol(Terminals.DOT,yyline + 1, yycolumn + 1, yylength(),yytext()); }
    "::"                    { return  new Symbol(Terminals.DOUBLE_COLON, yyline + 1, yycolumn + 1, yylength(),yytext()); }
    ":"                    { return   new Symbol(Terminals.COLON, yyline + 1, yycolumn + 1, yylength(),yytext()); }


    

    /* Identificadores e tipagem */
    {Identifier}             { return  new Symbol(Terminals.IDENTIFIER, yyline + 1, yycolumn + 1, yylength(),yytext()); }
    {TypeName}               { return  new Symbol(Terminals.TYPE_NAME, yyline + 1, yycolumn + 1, yylength(),yytext()); }

    /* Literais */
    {IntegerLiteral}         { return  new Symbol(Terminals.INTEGER_LITERAL, yyline + 1, yycolumn + 1, yylength(),yytext()); }
    {FloatingPointLiteral}   { return  new Symbol(Terminals.FLOATING_POINT_LITERAL, yyline + 1, yycolumn + 1, yylength(),yytext()); }
    {CharacterLiteral}       { return  new Symbol(Terminals.CHARACTER_LITERAL, yyline + 1, yycolumn + 1, yylength(),yytext()); }
    {StringLiteral}         { return  new Symbol(Terminals.STRING_LITERAL, yyline + 1, yycolumn + 1, yylength(),yytext()); }

    /* Operadores */

    "+"                    { return new Symbol(Terminals.PLUS, yyline + 1, yycolumn + 1, yylength(), yytext()); }
    "-"                    { return new Symbol(Terminals.MINUS, yyline + 1, yycolumn + 1, yylength(), yytext()); }
    "*"                    { return new Symbol(Terminals.TIMES, yyline + 1, yycolumn + 1, yylength(), yytext()); }
    "/"                    { return new Symbol(Terminals.DIVIDE, yyline + 1, yycolumn + 1, yylength(), yytext()); }
    "%"                    { return new Symbol(Terminals.MOD, yyline + 1, yycolumn + 1, yylength(), yytext()); }
    "&&"                   { return new Symbol(Terminals.LOGICAL_AND, yyline + 1, yycolumn + 1, yylength(), yytext()); }
    "||"                   { return new Symbol(Terminals.LOGICAL_OR, yyline + 1, yycolumn + 1, yylength(), yytext()); }
    "!"                    { return new Symbol(Terminals.LOGICAL_NOT, yyline + 1, yycolumn + 1, yylength(), yytext()); }
    "=="                   { return new Symbol(Terminals.EQUALS, yyline + 1, yycolumn + 1, yylength(), yytext()); }
    "!="                   { return new Symbol(Terminals.NOT_EQUALS, yyline + 1, yycolumn + 1, yylength(), yytext()); }
    "<"                    { return new Symbol(Terminals.LESS_THAN, yyline + 1, yycolumn + 1, yylength(), yytext()); }
    ">"                    { return new Symbol(Terminals.GREATER_THAN, yyline + 1, yycolumn + 1, yylength(), yytext()); }
    "<="                   { return new Symbol(Terminals.LESS_OR_EQUAL, yyline + 1, yycolumn + 1, yylength(), yytext()); }
    ">="                   { return new Symbol(Terminals.GREATER_OR_EQUAL, yyline + 1, yycolumn + 1, yylength(), yytext()); }
    "="                    { return new Symbol(Terminals.ATTR, yyline + 1, yycolumn + 1, yylength(), yytext()); }
    /* Espaço em branco e comentarios */
    {WhiteSpace}           { /* ignore */ }
    {Comment}               { /* ignore */ }
    "{-"            { yybegin(COMMENT);         }

    /* Tratamento de Erros */
    <<EOF>>            { return  new Symbol(Terminals.EOF,null); }
}
<COMMENT>{
   "-}"     { yybegin(YYINITIAL); }
   [^"-}"]  {                     }
}
[^] { System.err.println("Lexical error: Illegal character '" + yytext() + "' at line " + (yyline+1) + ", column " + (yycolumn+1)); }
