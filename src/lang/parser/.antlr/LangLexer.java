// Generated from /config/workspace/igor/compiladores-elton/versao-final/src/lang/parser/LangLexer.g4 by ANTLR 4.9.2

package lang.parser;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, ELSE=2, NEW=3, PRINT=4, ITERATE=5, RETURN=6, INT=7, FLOAT=8, CHAR=9, 
		BOOLEAN=10, VOID=11, TRUE=12, FALSE=13, NULL=14, DATA=15, READ=16, RPAREN=17, 
		LPAREN=18, LBRACE=19, RBRACE=20, LBRACK=21, RBRACK=22, SEMICOLON=23, COMMA=24, 
		DOT=25, DOUBLE_COLON=26, COLON=27, PLUS=28, MINUS=29, TIMES=30, DIVIDE=31, 
		MOD=32, LOGICAL_AND=33, LOGICAL_OR=34, LOGICAL_NOT=35, EQUALS=36, NOT_EQUALS=37, 
		LESS_THAN=38, GREATER_THAN=39, LESS_OR_EQUAL=40, GREATER_OR_EQUAL=41, 
		ATTR=42, ID=43, TYPE=44, INTLIT=45, FLOATLIT=46, CHARLIT=47, STRINGLIT=48, 
		COMMENT=49, LINE_COMMENT=50, WS=51;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"IF", "ELSE", "NEW", "PRINT", "ITERATE", "RETURN", "INT", "FLOAT", "CHAR", 
			"BOOLEAN", "VOID", "TRUE", "FALSE", "NULL", "DATA", "READ", "RPAREN", 
			"LPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMICOLON", "COMMA", 
			"DOT", "DOUBLE_COLON", "COLON", "PLUS", "MINUS", "TIMES", "DIVIDE", "MOD", 
			"LOGICAL_AND", "LOGICAL_OR", "LOGICAL_NOT", "EQUALS", "NOT_EQUALS", "LESS_THAN", 
			"GREATER_THAN", "LESS_OR_EQUAL", "GREATER_OR_EQUAL", "ATTR", "ID", "TYPE", 
			"INTLIT", "FLOATLIT", "CHARLIT", "STRINGLIT", "COMMENT", "LINE_COMMENT", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'else'", "'new'", "'print'", "'iterate'", "'return'", 
			"'Int'", "'Float'", "'Char'", "'Boolean'", "'Void'", "'true'", "'false'", 
			"'null'", "'data'", "'read'", "')'", "'('", "'{'", "'}'", "'['", "']'", 
			"';'", "','", "'.'", "'::'", "':'", "'+'", "'-'", "'*'", "'/'", "'%'", 
			"'&&'", "'||'", "'!'", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", 
			"'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IF", "ELSE", "NEW", "PRINT", "ITERATE", "RETURN", "INT", "FLOAT", 
			"CHAR", "BOOLEAN", "VOID", "TRUE", "FALSE", "NULL", "DATA", "READ", "RPAREN", 
			"LPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMICOLON", "COMMA", 
			"DOT", "DOUBLE_COLON", "COLON", "PLUS", "MINUS", "TIMES", "DIVIDE", "MOD", 
			"LOGICAL_AND", "LOGICAL_OR", "LOGICAL_NOT", "EQUALS", "NOT_EQUALS", "LESS_THAN", 
			"GREATER_THAN", "LESS_OR_EQUAL", "GREATER_OR_EQUAL", "ATTR", "ID", "TYPE", 
			"INTLIT", "FLOATLIT", "CHARLIT", "STRINGLIT", "COMMENT", "LINE_COMMENT", 
			"WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public LangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LangLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\65\u0154\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3"+
		"\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3"+
		"\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3"+
		"\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"\3#\3#\3"+
		"#\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3(\3(\3)\3)\3)\3*\3*\3*\3+\3+\3,\3,"+
		"\7,\u00fe\n,\f,\16,\u0101\13,\3-\3-\7-\u0105\n-\f-\16-\u0108\13-\3.\3"+
		".\3.\7.\u010d\n.\f.\16.\u0110\13.\5.\u0112\n.\3/\7/\u0115\n/\f/\16/\u0118"+
		"\13/\3/\3/\6/\u011c\n/\r/\16/\u011d\3\60\3\60\3\60\3\60\5\60\u0124\n\60"+
		"\3\60\3\60\3\61\3\61\3\61\3\61\7\61\u012c\n\61\f\61\16\61\u012f\13\61"+
		"\3\61\3\61\3\62\3\62\3\62\3\62\7\62\u0137\n\62\f\62\16\62\u013a\13\62"+
		"\3\62\3\62\3\62\5\62\u013f\n\62\3\62\3\62\3\63\3\63\3\63\3\63\7\63\u0147"+
		"\n\63\f\63\16\63\u014a\13\63\3\63\3\63\3\64\6\64\u014f\n\64\r\64\16\64"+
		"\u0150\3\64\3\64\3\u0138\2\65\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61"+
		"a\62c\63e\64g\65\3\2\r\3\2c|\6\2\62;C\\aac|\3\2C\\\3\2\63;\3\2\62;\6\2"+
		"\f\f\17\17))^^\b\2))^^ddppttvv\6\2\f\f\17\17$$^^\b\2$$^^ddppttvv\4\2\f"+
		"\f\17\17\5\2\13\f\16\17\"\"\2\u0160\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2"+
		"\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2"+
		"\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2["+
		"\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2"+
		"\2\2\3i\3\2\2\2\5l\3\2\2\2\7q\3\2\2\2\tu\3\2\2\2\13{\3\2\2\2\r\u0083\3"+
		"\2\2\2\17\u008a\3\2\2\2\21\u008e\3\2\2\2\23\u0094\3\2\2\2\25\u0099\3\2"+
		"\2\2\27\u00a1\3\2\2\2\31\u00a6\3\2\2\2\33\u00ab\3\2\2\2\35\u00b1\3\2\2"+
		"\2\37\u00b6\3\2\2\2!\u00bb\3\2\2\2#\u00c0\3\2\2\2%\u00c2\3\2\2\2\'\u00c4"+
		"\3\2\2\2)\u00c6\3\2\2\2+\u00c8\3\2\2\2-\u00ca\3\2\2\2/\u00cc\3\2\2\2\61"+
		"\u00ce\3\2\2\2\63\u00d0\3\2\2\2\65\u00d2\3\2\2\2\67\u00d5\3\2\2\29\u00d7"+
		"\3\2\2\2;\u00d9\3\2\2\2=\u00db\3\2\2\2?\u00dd\3\2\2\2A\u00df\3\2\2\2C"+
		"\u00e1\3\2\2\2E\u00e4\3\2\2\2G\u00e7\3\2\2\2I\u00e9\3\2\2\2K\u00ec\3\2"+
		"\2\2M\u00ef\3\2\2\2O\u00f1\3\2\2\2Q\u00f3\3\2\2\2S\u00f6\3\2\2\2U\u00f9"+
		"\3\2\2\2W\u00fb\3\2\2\2Y\u0102\3\2\2\2[\u0111\3\2\2\2]\u0116\3\2\2\2_"+
		"\u011f\3\2\2\2a\u0127\3\2\2\2c\u0132\3\2\2\2e\u0142\3\2\2\2g\u014e\3\2"+
		"\2\2ij\7k\2\2jk\7h\2\2k\4\3\2\2\2lm\7g\2\2mn\7n\2\2no\7u\2\2op\7g\2\2"+
		"p\6\3\2\2\2qr\7p\2\2rs\7g\2\2st\7y\2\2t\b\3\2\2\2uv\7r\2\2vw\7t\2\2wx"+
		"\7k\2\2xy\7p\2\2yz\7v\2\2z\n\3\2\2\2{|\7k\2\2|}\7v\2\2}~\7g\2\2~\177\7"+
		"t\2\2\177\u0080\7c\2\2\u0080\u0081\7v\2\2\u0081\u0082\7g\2\2\u0082\f\3"+
		"\2\2\2\u0083\u0084\7t\2\2\u0084\u0085\7g\2\2\u0085\u0086\7v\2\2\u0086"+
		"\u0087\7w\2\2\u0087\u0088\7t\2\2\u0088\u0089\7p\2\2\u0089\16\3\2\2\2\u008a"+
		"\u008b\7K\2\2\u008b\u008c\7p\2\2\u008c\u008d\7v\2\2\u008d\20\3\2\2\2\u008e"+
		"\u008f\7H\2\2\u008f\u0090\7n\2\2\u0090\u0091\7q\2\2\u0091\u0092\7c\2\2"+
		"\u0092\u0093\7v\2\2\u0093\22\3\2\2\2\u0094\u0095\7E\2\2\u0095\u0096\7"+
		"j\2\2\u0096\u0097\7c\2\2\u0097\u0098\7t\2\2\u0098\24\3\2\2\2\u0099\u009a"+
		"\7D\2\2\u009a\u009b\7q\2\2\u009b\u009c\7q\2\2\u009c\u009d\7n\2\2\u009d"+
		"\u009e\7g\2\2\u009e\u009f\7c\2\2\u009f\u00a0\7p\2\2\u00a0\26\3\2\2\2\u00a1"+
		"\u00a2\7X\2\2\u00a2\u00a3\7q\2\2\u00a3\u00a4\7k\2\2\u00a4\u00a5\7f\2\2"+
		"\u00a5\30\3\2\2\2\u00a6\u00a7\7v\2\2\u00a7\u00a8\7t\2\2\u00a8\u00a9\7"+
		"w\2\2\u00a9\u00aa\7g\2\2\u00aa\32\3\2\2\2\u00ab\u00ac\7h\2\2\u00ac\u00ad"+
		"\7c\2\2\u00ad\u00ae\7n\2\2\u00ae\u00af\7u\2\2\u00af\u00b0\7g\2\2\u00b0"+
		"\34\3\2\2\2\u00b1\u00b2\7p\2\2\u00b2\u00b3\7w\2\2\u00b3\u00b4\7n\2\2\u00b4"+
		"\u00b5\7n\2\2\u00b5\36\3\2\2\2\u00b6\u00b7\7f\2\2\u00b7\u00b8\7c\2\2\u00b8"+
		"\u00b9\7v\2\2\u00b9\u00ba\7c\2\2\u00ba \3\2\2\2\u00bb\u00bc\7t\2\2\u00bc"+
		"\u00bd\7g\2\2\u00bd\u00be\7c\2\2\u00be\u00bf\7f\2\2\u00bf\"\3\2\2\2\u00c0"+
		"\u00c1\7+\2\2\u00c1$\3\2\2\2\u00c2\u00c3\7*\2\2\u00c3&\3\2\2\2\u00c4\u00c5"+
		"\7}\2\2\u00c5(\3\2\2\2\u00c6\u00c7\7\177\2\2\u00c7*\3\2\2\2\u00c8\u00c9"+
		"\7]\2\2\u00c9,\3\2\2\2\u00ca\u00cb\7_\2\2\u00cb.\3\2\2\2\u00cc\u00cd\7"+
		"=\2\2\u00cd\60\3\2\2\2\u00ce\u00cf\7.\2\2\u00cf\62\3\2\2\2\u00d0\u00d1"+
		"\7\60\2\2\u00d1\64\3\2\2\2\u00d2\u00d3\7<\2\2\u00d3\u00d4\7<\2\2\u00d4"+
		"\66\3\2\2\2\u00d5\u00d6\7<\2\2\u00d68\3\2\2\2\u00d7\u00d8\7-\2\2\u00d8"+
		":\3\2\2\2\u00d9\u00da\7/\2\2\u00da<\3\2\2\2\u00db\u00dc\7,\2\2\u00dc>"+
		"\3\2\2\2\u00dd\u00de\7\61\2\2\u00de@\3\2\2\2\u00df\u00e0\7\'\2\2\u00e0"+
		"B\3\2\2\2\u00e1\u00e2\7(\2\2\u00e2\u00e3\7(\2\2\u00e3D\3\2\2\2\u00e4\u00e5"+
		"\7~\2\2\u00e5\u00e6\7~\2\2\u00e6F\3\2\2\2\u00e7\u00e8\7#\2\2\u00e8H\3"+
		"\2\2\2\u00e9\u00ea\7?\2\2\u00ea\u00eb\7?\2\2\u00ebJ\3\2\2\2\u00ec\u00ed"+
		"\7#\2\2\u00ed\u00ee\7?\2\2\u00eeL\3\2\2\2\u00ef\u00f0\7>\2\2\u00f0N\3"+
		"\2\2\2\u00f1\u00f2\7@\2\2\u00f2P\3\2\2\2\u00f3\u00f4\7>\2\2\u00f4\u00f5"+
		"\7?\2\2\u00f5R\3\2\2\2\u00f6\u00f7\7@\2\2\u00f7\u00f8\7?\2\2\u00f8T\3"+
		"\2\2\2\u00f9\u00fa\7?\2\2\u00faV\3\2\2\2\u00fb\u00ff\t\2\2\2\u00fc\u00fe"+
		"\t\3\2\2\u00fd\u00fc\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff"+
		"\u0100\3\2\2\2\u0100X\3\2\2\2\u0101\u00ff\3\2\2\2\u0102\u0106\t\4\2\2"+
		"\u0103\u0105\t\3\2\2\u0104\u0103\3\2\2\2\u0105\u0108\3\2\2\2\u0106\u0104"+
		"\3\2\2\2\u0106\u0107\3\2\2\2\u0107Z\3\2\2\2\u0108\u0106\3\2\2\2\u0109"+
		"\u0112\7\62\2\2\u010a\u010e\t\5\2\2\u010b\u010d\t\6\2\2\u010c\u010b\3"+
		"\2\2\2\u010d\u0110\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f"+
		"\u0112\3\2\2\2\u0110\u010e\3\2\2\2\u0111\u0109\3\2\2\2\u0111\u010a\3\2"+
		"\2\2\u0112\\\3\2\2\2\u0113\u0115\t\6\2\2\u0114\u0113\3\2\2\2\u0115\u0118"+
		"\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0119\3\2\2\2\u0118"+
		"\u0116\3\2\2\2\u0119\u011b\7\60\2\2\u011a\u011c\t\6\2\2\u011b\u011a\3"+
		"\2\2\2\u011c\u011d\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e"+
		"^\3\2\2\2\u011f\u0123\7)\2\2\u0120\u0124\n\7\2\2\u0121\u0122\7^\2\2\u0122"+
		"\u0124\t\b\2\2\u0123\u0120\3\2\2\2\u0123\u0121\3\2\2\2\u0124\u0125\3\2"+
		"\2\2\u0125\u0126\7)\2\2\u0126`\3\2\2\2\u0127\u012d\7$\2\2\u0128\u012c"+
		"\n\t\2\2\u0129\u012a\7^\2\2\u012a\u012c\t\n\2\2\u012b\u0128\3\2\2\2\u012b"+
		"\u0129\3\2\2\2\u012c\u012f\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012e\3\2"+
		"\2\2\u012e\u0130\3\2\2\2\u012f\u012d\3\2\2\2\u0130\u0131\7$\2\2\u0131"+
		"b\3\2\2\2\u0132\u0133\7}\2\2\u0133\u0134\7/\2\2\u0134\u0138\3\2\2\2\u0135"+
		"\u0137\13\2\2\2\u0136\u0135\3\2\2\2\u0137\u013a\3\2\2\2\u0138\u0139\3"+
		"\2\2\2\u0138\u0136\3\2\2\2\u0139\u013e\3\2\2\2\u013a\u0138\3\2\2\2\u013b"+
		"\u013c\7/\2\2\u013c\u013f\7\177\2\2\u013d\u013f\7\2\2\3\u013e\u013b\3"+
		"\2\2\2\u013e\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0141\b\62\2\2\u0141"+
		"d\3\2\2\2\u0142\u0143\7/\2\2\u0143\u0144\7/\2\2\u0144\u0148\3\2\2\2\u0145"+
		"\u0147\n\13\2\2\u0146\u0145\3\2\2\2\u0147\u014a\3\2\2\2\u0148\u0146\3"+
		"\2\2\2\u0148\u0149\3\2\2\2\u0149\u014b\3\2\2\2\u014a\u0148\3\2\2\2\u014b"+
		"\u014c\b\63\2\2\u014cf\3\2\2\2\u014d\u014f\t\f\2\2\u014e\u014d\3\2\2\2"+
		"\u014f\u0150\3\2\2\2\u0150\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0152"+
		"\3\2\2\2\u0152\u0153\b\64\2\2\u0153h\3\2\2\2\20\2\u00ff\u0106\u010e\u0111"+
		"\u0116\u011d\u0123\u012b\u012d\u0138\u013e\u0148\u0150\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}