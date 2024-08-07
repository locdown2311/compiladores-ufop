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

    private static java.util.ArrayList<Token> tokens;

    public static java.util.ArrayList<Token> getTokens() {
        return tokens;
    }
 
    private void addToken(TK type, String text) {
        tokens.add(new Token(yyline + 1, yycolumn + 1, type, text));
    }

    public boolean isZzAtEOF() {
        return zzAtEOF;
    }
%}

%init{
    tokens = new java.util.ArrayList<>();
%init}

%%
<YYINITIAL>{
    /* Palavras chave */
    "if"                      { addToken(TK.IF,null); }
    "else"                    { addToken(TK.ELSE,null); }
    "while"                   { addToken(TK.WHILE,null); }
    "return"                  { addToken(TK.RETURN,null); }
    "int"                     { addToken(TK.INT,null); }
    "float"                   { addToken(TK.FLOAT,null); }
    "char"                    { addToken(TK.CHAR,null); }
    "boolean"                 { addToken(TK.BOOLEAN,null); }
    "void"                    { addToken(TK.VOID,null); }
    "true"                    { addToken(TK.TRUE,null); }
    "false"                   { addToken(TK.FALSE,null); }
    "null"                    { addToken(TK.NULL,null); }

    /* Separadores */
    ")"                     { addToken(TK.RPAREN,null); }
    "("                     { addToken(TK.LPAREN,null); }
    "{"                     { addToken(TK.LBRACE,null); }
    "}"                     { addToken(TK.RBRACE,null); }
    "["                     { addToken(TK.LBRACK,null); }
    "]"                     { addToken(TK.RBRACK,null); }
    ";"                     { addToken(TK.SEMICOLON,null); }
    ","                     { addToken(TK.COMMA,null); }
    "."                     { addToken(TK.DOT,null); }
    "::"                    { addToken(TK.DOUBLE_COLON, null); }
    ":"                    { addToken(TK.COLON, null); }


    /* Identificadores e tipagem */
    {Identifier}             { addToken(TK.IDENTIFIER, yytext()); }
    {TypeName}               { addToken(TK.TYPE_NAME, yytext()); }

    /* Literais */
    {IntegerLiteral}         { addToken(TK.INTEGER_LITERAL, yytext()); }
    {FloatingPointLiteral}   { addToken(TK.FLOATING_POINT_LITERAL, yytext()); }
    {CharacterLiteral}       { addToken(TK.CHARACTER_LITERAL, yytext()); }
    {StringLiteral}         { addToken(TK.STRING_LITERAL, yytext()); }

    /* Operadores */
    {Operator}               { addToken(TK.OPERATOR, yytext()); }

    /* Espaço em branco e comentarios */
    {WhiteSpace}           { /* ignore */ }
    {Comment}               { /* ignore */ }

    /* Tratamento de Erros */
    <<EOF>>            { return new Token(yyline,yycolumn,TK.EOF,null); }
    [^] { System.err.println("Lexical error: Illegal character '" + yytext() + "' at line " + (yyline+1) + ", column " + (yycolumn+1)); }
}