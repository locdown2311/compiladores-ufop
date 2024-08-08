import java.lang.String;
import java.util.ArrayList;

%%
%class Lexer
%public
%unicode
%line
%column
%function nextToken
%type Token

LineTerminator = \r|\n|\r\n
InputCharacter = [^\r\n]

WhiteSpace = {LineTerminator} | [ \t\f]

/* Comentarios */
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

/* Operadores */
Operator = "+" | "-" | "*" | "/" | "%" | "&&" | "||" | "!" | "==" | "!=" | "<" | ">" | "<=" | ">=" | "="

/* Metodos adicionais */
%{ 
    private Token addToken(TK type, String text) {
        return new Token(yyline + 1, yycolumn + 1, type, text);
    }

    public boolean isZzAtEOF() {
        return zzAtEOF;
    }
%}

%init{

%init}

%%
<YYINITIAL>{
    /* Palavras chave */
    "if"                      { return  addToken(TK.IF,null); }
    "else"                    { return  addToken(TK.ELSE,null); }
    "while"                   { return  addToken(TK.WHILE,null); }
    "return"                  { return  addToken(TK.RETURN,null); }
    "int"                     { return  addToken(TK.INT,null); }
    "float"                   { return  addToken(TK.FLOAT,null); }
    "char"                    { return  addToken(TK.CHAR,null); }
    "boolean"                 { return  addToken(TK.BOOLEAN,null); }
    "void"                    { return  addToken(TK.VOID,null); }
    "true"                    { return  addToken(TK.TRUE,null); }
    "false"                   { return  addToken(TK.FALSE,null); }
    "null"                    { return  addToken(TK.NULL,null); }

    /* Separadores */
    ")"                     { return  addToken(TK.RPAREN,null); }
    "("                     { return  addToken(TK.LPAREN,null); }
    "{"                     { return  addToken(TK.LBRACE,null); }
    "}"                     { return  addToken(TK.RBRACE,null); }
    "["                     { return  addToken(TK.LBRACK,null); }
    "]"                     { return  addToken(TK.RBRACK,null); }
    ";"                     { return  addToken(TK.SEMICOLON,null); }
    ","                     { return  addToken(TK.COMMA,null); }
    "."                     { return  addToken(TK.DOT,null); }
    "::"                    { return  addToken(TK.DOUBLE_COLON, null); }
    ":"                    { return   addToken(TK.COLON, null); }


    /* Identificadores e tipagem */
    {Identifier}             { return  addToken(TK.IDENTIFIER, yytext()); }
    {TypeName}               { return  addToken(TK.TYPE_NAME, yytext()); }

    /* Literais */
    {IntegerLiteral}         { return  addToken(TK.INTEGER_LITERAL, yytext()); }
    {FloatingPointLiteral}   { return  addToken(TK.FLOATING_POINT_LITERAL, yytext()); }
    {CharacterLiteral}       { return  addToken(TK.CHARACTER_LITERAL, yytext()); }
    {StringLiteral}         { return  addToken(TK.STRING_LITERAL, yytext()); }

    /* Operadores */
    {Operator}               { return  addToken(TK.OPERATOR, yytext()); }

    /* Espaço em branco e comentarios */
    {WhiteSpace}           { /* ignore */ }
    {Comment}               { /* ignore */ }

    /* Tratamento de Erros */
    <<EOF>>            { return  addToken(TK.EOF,null); }
    [^] { System.err.println("Lexical error: Illegal character '" + yytext() + "' at line " + (yyline+1) + ", column " + (yycolumn+1)); }
}