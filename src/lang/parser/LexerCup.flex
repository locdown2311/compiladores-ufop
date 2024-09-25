package lang.parser;
import java.lang.String;
import java_cup.runtime.Symbol;

%%
%class Lexer
%public
%unicode
%line
%column
%function nextToken
%type java_cup.runtime.Symbol
%cup

%yylexthrow Scanner.Exception
%eofval{
	return new Symbol(sym.EOF, "end-of-file");
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
    "if"                      { return  new Symbol(sym.IF,yyline + 1, yycolumn + 1, yylength(),yytext()); }
    "else"                    { return  new Symbol(sym.ELSE,yyline + 1, yycolumn + 1, yylength(),yytext()); }
    "while"                   { return  new Symbol(sym.WHILE,yyline + 1, yycolumn + 1, yylength(),yytext()); }
    "return"                  { return  new Symbol(sym.RETURN,yyline + 1, yycolumn + 1, yylength(),yytext()); }
    "int"                     { return  new Symbol(sym.INT,yyline + 1, yycolumn + 1, yylength(),yytext()); }
    "float"                   { return  new Symbol(sym.FLOAT,yyline + 1, yycolumn + 1, yylength(),yytext()); }
    "char"                    { return  new Symbol(sym.CHAR,yyline + 1, yycolumn + 1, yylength(),yytext()); }
    "boolean"                 { return  new Symbol(sym.BOOLEAN,yyline + 1, yycolumn + 1, yylength(),yytext()); }
    "void"                    { return  new Symbol(sym.VOID,yyline + 1, yycolumn + 1, yylength(),yytext()); }
    "true"                    { return  new Symbol(sym.TRUE,yyline + 1, yycolumn + 1, yylength(),yytext()); }
    "false"                   { return  new Symbol(sym.FALSE,yyline + 1, yycolumn + 1, yylength(),yytext()); }
    "null"                    { return  new Symbol(sym.NULL,yyline + 1, yycolumn + 1, yylength(),yytext()); }

    /* Separadores */
    ")"                     { return  new Symbol(sym.RPAREN,yyline + 1, yycolumn + 1, yylength(),yytext()); }
    "("                     { return  new Symbol(sym.LPAREN,yyline + 1, yycolumn + 1, yylength(),yytext()); }
    "{"                     { return  new Symbol(sym.LBRACE,yyline + 1, yycolumn + 1, yylength(),yytext()); }
    "}"                     { return  new Symbol(sym.RBRACE,yyline + 1, yycolumn + 1, yylength(),yytext()); }
    "["                     { return  new Symbol(sym.LBRACK,yyline + 1, yycolumn + 1, yylength(),yytext()); }
    "]"                     { return  new Symbol(sym.RBRACK,yyline + 1, yycolumn + 1, yylength(),yytext()); }
    ";"                     { return  new Symbol(sym.SEMICOLON,yyline + 1, yycolumn + 1, yylength(),yytext()); }
    ","                     { return  new Symbol(sym.COMMA,yyline + 1, yycolumn + 1, yylength(),yytext()); }
    "."                     { return  new Symbol(sym.DOT,yyline + 1, yycolumn + 1, yylength(),yytext()); }
    "::"                    { return  new Symbol(sym.DOUBLE_COLON, yyline + 1, yycolumn + 1, yylength(),yytext()); }
    ":"                    { return   new Symbol(sym.COLON, yyline + 1, yycolumn + 1, yylength(),yytext()); }

    /* Identificadores e tipagem */
    {Identifier}             { return  new Symbol(sym.IDENTIFIER, yyline + 1, yycolumn + 1, yylength(),yytext()); }
    {TypeName}               { return  new Symbol(sym.TYPE_NAME, yyline + 1, yycolumn + 1, yylength(),yytext()); }

    /* Literais */
    {IntegerLiteral}         { return  new Symbol(sym.INTEGER_LITERAL, yyline + 1, yycolumn + 1, yylength(),yytext()); }
    {FloatingPointLiteral}   { return  new Symbol(sym.FLOATING_POINT_LITERAL, yyline + 1, yycolumn + 1, yylength(),yytext()); }
    {CharacterLiteral}       { return  new Symbol(sym.CHARACTER_LITERAL, yyline + 1, yycolumn + 1, yylength(),yytext()); }
    {StringLiteral}         { return  new Symbol(sym.STRING_LITERAL, yyline + 1, yycolumn + 1, yylength(),yytext()); }

    /* Operadores */

    "+"                    { return new Symbol(sym.PLUS, yyline + 1, yycolumn + 1, yylength(), yytext()); }
    "-"                    { return new Symbol(sym.MINUS, yyline + 1, yycolumn + 1, yylength(), yytext()); }
    "*"                    { return new Symbol(sym.TIMES, yyline + 1, yycolumn + 1, yylength(), yytext()); }
    "/"                    { return new Symbol(sym.DIVIDE, yyline + 1, yycolumn + 1, yylength(), yytext()); }
    "%"                    { return new Symbol(sym.MOD, yyline + 1, yycolumn + 1, yylength(), yytext()); }
    "&&"                   { return new Symbol(sym.LOGICAL_AND, yyline + 1, yycolumn + 1, yylength(), yytext()); }
    "||"                   { return new Symbol(sym.LOGICAL_OR, yyline + 1, yycolumn + 1, yylength(), yytext()); }
    "!"                    { return new Symbol(sym.LOGICAL_NOT, yyline + 1, yycolumn + 1, yylength(), yytext()); }
    "=="                   { return new Symbol(sym.EQUALS, yyline + 1, yycolumn + 1, yylength(), yytext()); }
    "!="                   { return new Symbol(sym.NOT_EQUALS, yyline + 1, yycolumn + 1, yylength(), yytext()); }
    "<"                    { return new Symbol(sym.LESS_THAN, yyline + 1, yycolumn + 1, yylength(), yytext()); }
    ">"                    { return new Symbol(sym.GREATER_THAN, yyline + 1, yycolumn + 1, yylength(), yytext()); }
    "<="                   { return new Symbol(sym.LESS_OR_EQUAL, yyline + 1, yycolumn + 1, yylength(), yytext()); }
    ">="                   { return new Symbol(sym.GREATER_OR_EQUAL, yyline + 1, yycolumn + 1, yylength(), yytext()); }
    "="                    { return new Symbol(sym.ATTR, yyline + 1, yycolumn + 1, yylength(), yytext()); }
    /* Espaço em branco e comentarios */
    {WhiteSpace}           { /* ignore */ }
    {Comment}               { /* ignore */ }
    "{-"            { yybegin(COMMENT);         }

    /* Tratamento de Erros */
    <<EOF>>            { return  new Symbol(sym.EOF,null); }
}
<COMMENT>{
   "-}"     { yybegin(YYINITIAL); }
   [^"-}"]  {                     }
}
[^] { System.err.println("Lexical error: Illegal character '" + yytext() + "' at line " + (yyline+1) + ", column " + (yycolumn+1)); }
