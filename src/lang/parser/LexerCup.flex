package lang.parser;
import java.lang.String;
import java_cup.runtime.*;

%%
%class Lexer
%public
%unicode
%line
%column
%cup



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
    private Symbol symbol(int type) {
        return new Symbol(type, yyline, yycolumn);
    }

    private Symbol symbol(int type, Object value) {
        return new Symbol(type, yyline, yycolumn, value);
    }
%}

%state COMMENT


%%
<YYINITIAL>{
    /* Palavras chave */
    "if"                      { return  new Symbol(Sym.IF,yytext()); }
    "else"                    { return  new Symbol(Sym.ELSE,yytext()); }
    "while"                   { return  new Symbol(Sym.WHILE,yytext()); }
    "return"                  { return  new Symbol(Sym.RETURN,yytext()); }
    "int"                     { return  new Symbol(Sym.INT,yytext()); }
    "float"                   { return  new Symbol(Sym.FLOAT,yytext()); }
    "char"                    { return  new Symbol(Sym.CHAR,yytext()); }
    "boolean"                 { return  new Symbol(Sym.BOOL,yytext()); }
    "void"                    { return  new Symbol(Sym.VOID,yytext()); }
    "true"                    { return  new Symbol(Sym.TRUE,yytext()); }
    "false"                   { return  new Symbol(Sym.FALSE,yytext()); }
    "null"                    { return  new Symbol(Sym.NULL,yytext()); }
    "new"                    { return   new Symbol(Sym.NEW, yytext()); }


    /* Separadores */
    ")"                     { return  new Symbol(Sym.RPAREN,yytext()); }
    "("                     { return  new Symbol(Sym.LPAREN,yytext()); }
    "{"                     { return  new Symbol(Sym.LBRACE,yytext()); }
    "}"                     { return  new Symbol(Sym.RBRACE,yytext()); }
    "["                     { return  new Symbol(Sym.LBRACKET,yytext()); }
    "]"                     { return  new Symbol(Sym.RBRACKET,yytext()); }
    ";"                     { return  new Symbol(Sym.SEMICOLON,yytext()); }
    ","                     { return  new Symbol(Sym.COMMA,yytext()); }
    "."                     { return  new Symbol(Sym.DOT,yytext()); }
    "::"                    { return  new Symbol(Sym.DOUBLECOLON, yytext()); }
    ":"                    { return   new Symbol(Sym.COLON, yytext()); }

    /* Identificadores e tipagem */
    {Identifier}             { return  new Symbol(Sym.ID, yytext()); }
    {TypeName}               { return  new Symbol(Sym.TYPE_NAME, yytext()); }

    /* Literais */
    {IntegerLiteral}         { return  new Symbol(Sym.INTEGER_LITERAL, yytext()); }
    {FloatingPointLiteral}   { return  new Symbol(Sym.FLOAT_LITERAL, yytext()); }
    {CharacterLiteral}       { return  new Symbol(Sym.CHAR_LITERAL, yytext()); }
    {StringLiteral}         { return  new Symbol(Sym.STRING_LITERAL, yytext()); }

    /* Operadores */

    "+"                    { return new Symbol(Sym.PLUS,  yytext()); }
    "-"                    { return new Symbol(Sym.MINUS,  yytext()); }
    "*"                    { return new Symbol(Sym.TIMES,  yytext()); }
    "/"                    { return new Symbol(Sym.DIVIDE,  yytext()); }
    "%"                    { return new Symbol(Sym.MOD,  yytext()); }
    "&&"                   { return new Symbol(Sym.LOGICAL_AND,  yytext()); }
    "||"                   { return new Symbol(Sym.LOGICAL_OR,  yytext()); }
    "!"                    { return new Symbol(Sym.LOGICAL_NOT,  yytext()); }
    "=="                   { return new Symbol(Sym.EQUALS,  yytext()); }
    "!="                   { return new Symbol(Sym.NOT_EQUALS,  yytext()); }
    "<"                    { return new Symbol(Sym.LESS_THAN,  yytext()); }
    ">"                    { return new Symbol(Sym.GREATER_THAN,  yytext()); }
    "<="                   { return new Symbol(Sym.LESS_OR_EQUAL,  yytext()); }
    ">="                   { return new Symbol(Sym.GREATER_OR_EQUAL,  yytext()); }
    "="                    { return new Symbol(Sym.ATTR,  yytext()); }
    /* Espaço em branco e comentarios */
    {WhiteSpace}           { /* ignore */ }
    {Comment}               { /* ignore */ }
    "{-"            { yybegin(COMMENT);         }

    /* Tratamento de Erros */
    <<EOF>>            { return  new Symbol(Sym.EOF,null); }
}
<COMMENT>{
   "-}"     { yybegin(YYINITIAL); }
   [^"-}"]  {                     }
}
[^] { System.err.println("Lexical error: Illegal character '" + yytext() + "' at line " + (yyline+1) + ", column " + (yycolumn+1)); }
