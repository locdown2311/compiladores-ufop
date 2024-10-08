package lang.parser;

/**
 * This class lists terminals used by the
 * grammar specified in "lang.grammar".
 */
public class Terminals {
	static public final short EOF = 0;
	static public final short ID = 1;
	static public final short LPAREN = 2;
	static public final short NEW = 3;
	static public final short LOGICAL_NOT = 4;
	static public final short MINUS_UNARY = 5;
	static public final short TRUE = 6;
	static public final short FALSE = 7;
	static public final short NULL = 8;
	static public final short INTEGER_LITERAL = 9;
	static public final short FLOAT_LITERAL = 10;
	static public final short CHAR_LITERAL = 11;
	static public final short STRING_LITERAL = 12;
	static public final short RPAREN = 13;
	static public final short LOGICAL_AND = 14;
	static public final short LOGICAL_OR = 15;
	static public final short LBRACKET = 16;
	static public final short SEMICOLON = 17;
	static public final short LBRACE = 18;
	static public final short RBRACE = 19;
	static public final short PLUS = 20;
	static public final short MINUS = 21;
	static public final short RBRACKET = 22;
	static public final short TYPE_NAME = 23;
	static public final short IF = 24;
	static public final short WHILE = 25;
	static public final short RETURN = 26;
	static public final short READ = 27;
	static public final short PRINT = 28;
	static public final short DOT = 29;
	static public final short INT = 30;
	static public final short CHAR = 31;
	static public final short BOOL = 32;
	static public final short FLOAT = 33;
	static public final short VOID = 34;
	static public final short COMMA = 35;
	static public final short DOUBLECOLON = 36;
	static public final short TIMES = 37;
	static public final short DIVIDE = 38;
	static public final short MOD = 39;
	static public final short LESS_THAN = 40;
	static public final short DATA = 41;
	static public final short GREATER_THAN = 42;
	static public final short COLON = 43;
	static public final short ATTR = 44;
	static public final short ELSE = 45;
	static public final short EQUALS = 46;
	static public final short NOT_EQUALS = 47;
	static public final short GREATER_OR_EQUAL = 48;
	static public final short LESS_OR_EQUAL = 49;

	static public final String[] NAMES = {
		"EOF",
		"ID",
		"LPAREN",
		"NEW",
		"LOGICAL_NOT",
		"MINUS_UNARY",
		"TRUE",
		"FALSE",
		"NULL",
		"INTEGER_LITERAL",
		"FLOAT_LITERAL",
		"CHAR_LITERAL",
		"STRING_LITERAL",
		"RPAREN",
		"LOGICAL_AND",
		"LOGICAL_OR",
		"LBRACKET",
		"SEMICOLON",
		"LBRACE",
		"RBRACE",
		"PLUS",
		"MINUS",
		"RBRACKET",
		"TYPE_NAME",
		"IF",
		"WHILE",
		"RETURN",
		"READ",
		"PRINT",
		"DOT",
		"INT",
		"CHAR",
		"BOOL",
		"FLOAT",
		"VOID",
		"COMMA",
		"DOUBLECOLON",
		"TIMES",
		"DIVIDE",
		"MOD",
		"LESS_THAN",
		"DATA",
		"GREATER_THAN",
		"COLON",
		"ATTR",
		"ELSE",
		"EQUALS",
		"NOT_EQUALS",
		"GREATER_OR_EQUAL",
		"LESS_OR_EQUAL"
	};
}
