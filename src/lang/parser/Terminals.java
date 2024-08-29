package lang.parser;

/**
 * This class lists terminals used by the
 * grammar specified in "lang.grammar".
 */
public class Terminals {
	static public final short EOF = 0;
	static public final short ID = 1;
	static public final short LPAREN = 2;
	static public final short LIT_INT = 3;
	static public final short LIT_FLOAT = 4;
	static public final short TRUE = 5;
	static public final short FALSE = 6;
	static public final short TIMES = 7;
	static public final short DIV = 8;
	static public final short MOD = 9;
	static public final short PLUS = 10;
	static public final short MINUS = 11;
	static public final short RPAREN = 12;
	static public final short NOT = 13;
	static public final short TYPE = 14;
	static public final short LBRACE = 15;
	static public final short AND = 16;
	static public final short COLON = 17;
	static public final short SEMI = 18;
	static public final short RBRACE = 19;
	static public final short MKARR = 20;
	static public final short QUESTION = 21;
	static public final short LSB = 22;
	static public final short RSB = 23;
	static public final short PRINT = 24;
	static public final short RET = 25;
	static public final short COMMA = 26;
	static public final short ATTR = 27;
	static public final short LT = 28;
	static public final short EQ = 29;

	static public final String[] NAMES = {
		"EOF",
		"ID",
		"LPAREN",
		"LIT_INT",
		"LIT_FLOAT",
		"TRUE",
		"FALSE",
		"TIMES",
		"DIV",
		"MOD",
		"PLUS",
		"MINUS",
		"RPAREN",
		"NOT",
		"TYPE",
		"LBRACE",
		"AND",
		"COLON",
		"SEMI",
		"RBRACE",
		"MKARR",
		"QUESTION",
		"LSB",
		"RSB",
		"PRINT",
		"RET",
		"COMMA",
		"ATTR",
		"LT",
		"EQ"
	};
}
