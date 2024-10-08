package lang.parser;
import java.lang.String;
import java_cup.runtime.*;

%%
%class LexerCup
%public
%unicode
%line
%column
%cupsym Sym
%cup

%eofval{
	return symbol(Sym.EOF, "end-of-file");
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
    "if"                      { return  symbol(Sym.IF,yytext()); }
    "else"                    { return  symbol(Sym.ELSE,yytext()); }
    "while"                   { return  symbol(Sym.WHILE,yytext()); }
    "return"                  { return  symbol(Sym.RETURN,yytext()); }
    "Int"                     { return  symbol(Sym.INT,yytext()); }
    "Float"                   { return  symbol(Sym.FLOAT,yytext()); }
    "Char"                    { return  symbol(Sym.CHAR,yytext()); }
    "Bool"                 { return  symbol(Sym.BOOL,yytext()); }
    "Void"                    { return  symbol(Sym.VOID,yytext()); }
    "true"                    { return  symbol(Sym.TRUE,yytext()); }
    "false"                   { return  symbol(Sym.FALSE,yytext()); }
    "null"                    { return  symbol(Sym.NULL,yytext()); }
    "new"                    { return   symbol(Sym.NEW, yytext()); }
    "data"                    { return   symbol(Sym.DATA, yytext()); }
    "read"                    { return   symbol(Sym.READ, yytext()); }
    "print"                    { return   symbol(Sym.PRINT, yytext()); }


    /* Separadores */
    ")"                     { return  symbol(Sym.RPAREN,yytext()); }
    "("                     { return  symbol(Sym.LPAREN,yytext()); }
    "{"                     { return  symbol(Sym.LBRACE,yytext()); }
    "}"                     { return  symbol(Sym.RBRACE,yytext()); }
    "["                     { return  symbol(Sym.LBRACKET,yytext()); }
    "]"                     { return  symbol(Sym.RBRACKET,yytext()); }
    ";"                     { return  symbol(Sym.SEMICOLON,yytext()); }
    ","                     { return  symbol(Sym.COMMA,yytext()); }
    "."                     { return  symbol(Sym.DOT,yytext()); }
    "::"                    { return  symbol(Sym.DOUBLECOLON, yytext()); }
    ":"                    { return   symbol(Sym.COLON, yytext()); }

    /* Identificadores e tipagem */
    {Identifier}             { return  symbol(Sym.ID, yytext()); }
    {TypeName}               { return  symbol(Sym.TYPE_NAME, yytext()); }

    /* Literais */
    {IntegerLiteral}         { return  symbol(Sym.INTEGER_LITERAL, yytext()); }
    {FloatingPointLiteral}   { return  symbol(Sym.FLOAT_LITERAL, yytext()); }
    {CharacterLiteral}       { return  symbol(Sym.CHAR_LITERAL, yytext()); }
    {StringLiteral}         { return  symbol(Sym.STRING_LITERAL, yytext()); }

    /* Operadores */

    "+"                    { return symbol(Sym.PLUS,  yytext()); }
    "-"                    { return symbol(Sym.MINUS,  yytext()); }
    "*"                    { return symbol(Sym.TIMES,  yytext()); }
    "/"                    { return symbol(Sym.DIVIDE,  yytext()); }
    "%"                    { return symbol(Sym.MOD,  yytext()); }
    "&&"                   { return symbol(Sym.LOGICAL_AND,  yytext()); }
    "||"                   { return symbol(Sym.LOGICAL_OR,  yytext()); }
    "!"                    { return symbol(Sym.LOGICAL_NOT,  yytext()); }
    "=="                   { return symbol(Sym.EQUALS,  yytext()); }
    "!="                   { return symbol(Sym.NOT_EQUALS,  yytext()); }
    "<"                    { return symbol(Sym.LESS_THAN,  yytext()); }
    ">"                    { return symbol(Sym.GREATER_THAN,  yytext()); }
    "<="                   { return symbol(Sym.LESS_OR_EQUAL,  yytext()); }
    ">="                   { return symbol(Sym.GREATER_OR_EQUAL,  yytext()); }
    "="                    { return symbol(Sym.ATTR,  yytext()); }
    /* Espaço em branco e comentarios */
    {WhiteSpace}           { /* ignore */ }
    {Comment}               { /* ignore */ }
    "{-"            { yybegin(COMMENT);         }
}
<COMMENT>{
   "-}"     { yybegin(YYINITIAL); }
   [^"-}"]  {                     }
}
[^] { System.err.println("Lexical error: Illegal character '" + yytext() + "' at line " + (yyline+1) + ", column " + (yycolumn+1)); }
