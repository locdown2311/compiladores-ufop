// Generated from /config/workspace/igor/compiladores-elton/versao-final/src/lang/parser/LangParser.g4 by ANTLR 4.9.2

package lang.parser;
import java.util.*;
import lang.nodes.expr.*;
import lang.nodes.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, ELSE=2, NEW=3, PRINT=4, WHILE=5, RETURN=6, INT=7, FLOAT=8, CHAR=9, 
		BOOLEAN=10, VOID=11, TRUE=12, FALSE=13, NULL=14, DATA=15, READ=16, RPAREN=17, 
		LPAREN=18, LBRACE=19, RBRACE=20, LBRACK=21, RBRACK=22, SEMICOLON=23, COMMA=24, 
		DOT=25, DOUBLE_COLON=26, COLON=27, PLUS=28, MINUS=29, TIMES=30, DIVIDE=31, 
		MOD=32, LOGICAL_AND=33, LOGICAL_OR=34, LOGICAL_NOT=35, EQUALS=36, NOT_EQUALS=37, 
		LESS_THAN=38, GREATER_THAN=39, LESS_OR_EQUAL=40, GREATER_OR_EQUAL=41, 
		ATTR=42, ID=43, TYPE=44, INTLIT=45, FLOATLIT=46, CHARLIT=47, STRINGLIT=48, 
		COMMENT=49, LINE_COMMENT=50, WS=51;
	public static final int
		RULE_prog = 0, RULE_def = 1, RULE_data = 2, RULE_decl = 3, RULE_func = 4, 
		RULE_params = 5, RULE_type = 6, RULE_btype = 7, RULE_cmd = 8, RULE_block = 9, 
		RULE_ifCmd = 10, RULE_whileCmd = 11, RULE_readCmd = 12, RULE_printCmd = 13, 
		RULE_returnCmd = 14, RULE_assignCmd = 15, RULE_accessReturn = 16, RULE_funcCallCmd = 17, 
		RULE_exp = 18, RULE_logicalOrExp = 19, RULE_logicalAndExp = 20, RULE_equalityExp = 21, 
		RULE_relationalExp = 22, RULE_additiveExp = 23, RULE_multiplicativeExp = 24, 
		RULE_unaryExp = 25, RULE_primaryExp = 26, RULE_lvalue = 27, RULE_exps = 28;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "def", "data", "decl", "func", "params", "type", "btype", "cmd", 
			"block", "ifCmd", "whileCmd", "readCmd", "printCmd", "returnCmd", "assignCmd", 
			"accessReturn", "funcCallCmd", "exp", "logicalOrExp", "logicalAndExp", 
			"equalityExp", "relationalExp", "additiveExp", "multiplicativeExp", "unaryExp", 
			"primaryExp", "lvalue", "exps"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'else'", "'new'", "'print'", "'while'", "'return'", "'Int'", 
			"'Float'", "'Char'", "'Boolean'", "'Void'", "'true'", "'false'", "'null'", 
			"'data'", "'read'", "')'", "'('", "'{'", "'}'", "'['", "']'", "';'", 
			"','", "'.'", "'::'", "':'", "'+'", "'-'", "'*'", "'/'", "'%'", "'&&'", 
			"'||'", "'!'", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IF", "ELSE", "NEW", "PRINT", "WHILE", "RETURN", "INT", "FLOAT", 
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

	@Override
	public String getGrammarFileName() { return "LangParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public CProg c;
		public DefContext def;
		public List<DefContext> e = new ArrayList<DefContext>();
		public List<DefContext> def() {
			return getRuleContexts(DefContext.class);
		}
		public DefContext def(int i) {
			return getRuleContext(DefContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(58);
				((ProgContext)_localctx).def = def();
				((ProgContext)_localctx).e.add(((ProgContext)_localctx).def);
				}
				}
				setState(61); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DATA || _la==ID );
			 
			          // Inicializa o programa com as definições
			      
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefContext extends ParserRuleContext {
		public DataContext data() {
			return getRuleContext(DataContext.class,0);
		}
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public DefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def; }
	}

	public final DefContext def() throws RecognitionException {
		DefContext _localctx = new DefContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_def);
		try {
			setState(67);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DATA:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				data();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				func();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataContext extends ParserRuleContext {
		public Token TYPE;
		public TerminalNode DATA() { return getToken(LangParser.DATA, 0); }
		public TerminalNode TYPE() { return getToken(LangParser.TYPE, 0); }
		public TerminalNode LBRACE() { return getToken(LangParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(LangParser.RBRACE, 0); }
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public DataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data; }
	}

	public final DataContext data() throws RecognitionException {
		DataContext _localctx = new DataContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_data);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(DATA);
			setState(70);
			((DataContext)_localctx).TYPE = match(TYPE);
			setState(71);
			match(LBRACE);
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(72);
				decl();
				}
				}
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(78);
			match(RBRACE);

			          // Cria uma nova definição de estrutura de dados
			          System.out.println("Definindo estrutura de dados: " + (((DataContext)_localctx).TYPE!=null?((DataContext)_localctx).TYPE.getText():null));
			      
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclContext extends ParserRuleContext {
		public Token ID;
		public TypeContext type;
		public TerminalNode ID() { return getToken(LangParser.ID, 0); }
		public TerminalNode DOUBLE_COLON() { return getToken(LangParser.DOUBLE_COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(LangParser.SEMICOLON, 0); }
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			((DeclContext)_localctx).ID = match(ID);
			setState(82);
			match(DOUBLE_COLON);
			setState(83);
			((DeclContext)_localctx).type = type();
			setState(84);
			match(SEMICOLON);

			          // Adiciona a declaração de variável à estrutura
			          System.out.println("Declarando variável: " + (((DeclContext)_localctx).ID!=null?((DeclContext)_localctx).ID.getText():null) + " do tipo " + (((DeclContext)_localctx).type!=null?_input.getText(((DeclContext)_localctx).type.start,((DeclContext)_localctx).type.stop):null));
			      
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncContext extends ParserRuleContext {
		public Token ID;
		public TerminalNode ID() { return getToken(LangParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(LangParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(LangParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(LangParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(LangParser.RBRACE, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode COLON() { return getToken(LangParser.COLON, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LangParser.COMMA, i);
		}
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			((FuncContext)_localctx).ID = match(ID);
			setState(88);
			match(LPAREN);
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(89);
				params();
				}
			}

			setState(92);
			match(RPAREN);
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(93);
				match(COLON);
				setState(94);
				type();
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(95);
					match(COMMA);
					setState(96);
					type();
					}
					}
					setState(101);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(104);
			match(LBRACE);
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << PRINT) | (1L << WHILE) | (1L << RETURN) | (1L << READ) | (1L << LBRACE) | (1L << ID))) != 0)) {
				{
				{
				setState(105);
				cmd();
				}
				}
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(111);
			match(RBRACE);

			          // Cria uma nova definição de função
			          System.out.println("Definindo função: " + (((FuncContext)_localctx).ID!=null?((FuncContext)_localctx).ID.getText():null));
			      
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamsContext extends ParserRuleContext {
		public Token ID;
		public TypeContext type;
		public List<TerminalNode> ID() { return getTokens(LangParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(LangParser.ID, i);
		}
		public List<TerminalNode> DOUBLE_COLON() { return getTokens(LangParser.DOUBLE_COLON); }
		public TerminalNode DOUBLE_COLON(int i) {
			return getToken(LangParser.DOUBLE_COLON, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LangParser.COMMA, i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			((ParamsContext)_localctx).ID = match(ID);
			setState(115);
			match(DOUBLE_COLON);
			setState(116);
			((ParamsContext)_localctx).type = type();
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(117);
				match(COMMA);
				setState(118);
				((ParamsContext)_localctx).ID = match(ID);
				setState(119);
				match(DOUBLE_COLON);
				setState(120);
				((ParamsContext)_localctx).type = type();
				}
				}
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			          // Processa parâmetros da função
			          System.out.println("Parâmetros: " + (((ParamsContext)_localctx).ID!=null?((ParamsContext)_localctx).ID.getText():null) + " do tipo " + (((ParamsContext)_localctx).type!=null?_input.getText(((ParamsContext)_localctx).type.start,((ParamsContext)_localctx).type.stop):null));
			      
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public BtypeContext btype() {
			return getRuleContext(BtypeContext.class,0);
		}
		public TerminalNode LBRACK() { return getToken(LangParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(LangParser.RBRACK, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			btype();
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(129);
				match(LBRACK);
				setState(130);
				match(RBRACK);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BtypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(LangParser.INT, 0); }
		public TerminalNode CHAR() { return getToken(LangParser.CHAR, 0); }
		public TerminalNode BOOLEAN() { return getToken(LangParser.BOOLEAN, 0); }
		public TerminalNode FLOAT() { return getToken(LangParser.FLOAT, 0); }
		public TerminalNode VOID() { return getToken(LangParser.VOID, 0); }
		public TerminalNode TYPE() { return getToken(LangParser.TYPE, 0); }
		public BtypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_btype; }
	}

	public final BtypeContext btype() throws RecognitionException {
		BtypeContext _localctx = new BtypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_btype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << CHAR) | (1L << BOOLEAN) | (1L << VOID) | (1L << TYPE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IfCmdContext ifCmd() {
			return getRuleContext(IfCmdContext.class,0);
		}
		public WhileCmdContext whileCmd() {
			return getRuleContext(WhileCmdContext.class,0);
		}
		public ReadCmdContext readCmd() {
			return getRuleContext(ReadCmdContext.class,0);
		}
		public PrintCmdContext printCmd() {
			return getRuleContext(PrintCmdContext.class,0);
		}
		public ReturnCmdContext returnCmd() {
			return getRuleContext(ReturnCmdContext.class,0);
		}
		public AssignCmdContext assignCmd() {
			return getRuleContext(AssignCmdContext.class,0);
		}
		public FuncCallCmdContext funcCallCmd() {
			return getRuleContext(FuncCallCmdContext.class,0);
		}
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_cmd);
		try {
			setState(143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				ifCmd();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(137);
				whileCmd();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(138);
				readCmd();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(139);
				printCmd();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(140);
				returnCmd();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(141);
				assignCmd();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(142);
				funcCallCmd();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(LangParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(LangParser.RBRACE, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(LBRACE);
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << PRINT) | (1L << WHILE) | (1L << RETURN) | (1L << READ) | (1L << LBRACE) | (1L << ID))) != 0)) {
				{
				{
				setState(146);
				cmd();
				}
				}
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(152);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfCmdContext extends ParserRuleContext {
		public Token IF;
		public ExpContext exp;
		public CmdContext cmd;
		public Token ELSE;
		public TerminalNode IF() { return getToken(LangParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(LangParser.LPAREN, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(LangParser.RPAREN, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(LangParser.ELSE, 0); }
		public IfCmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifCmd; }
	}

	public final IfCmdContext ifCmd() throws RecognitionException {
		IfCmdContext _localctx = new IfCmdContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ifCmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			((IfCmdContext)_localctx).IF = match(IF);
			setState(155);
			match(LPAREN);
			setState(156);
			((IfCmdContext)_localctx).exp = exp();
			setState(157);
			match(RPAREN);
			setState(158);
			((IfCmdContext)_localctx).cmd = cmd();
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(159);
				((IfCmdContext)_localctx).ELSE = match(ELSE);
				setState(160);
				((IfCmdContext)_localctx).cmd = cmd();
				}
				break;
			}

			      System.out.println("IF: " + (((IfCmdContext)_localctx).IF!=null?((IfCmdContext)_localctx).IF.getText():null) + " "+(((IfCmdContext)_localctx).exp!=null?_input.getText(((IfCmdContext)_localctx).exp.start,((IfCmdContext)_localctx).exp.stop):null) +" "+ (((IfCmdContext)_localctx).ELSE!=null?((IfCmdContext)_localctx).ELSE.getText():null)+" "+(((IfCmdContext)_localctx).cmd!=null?_input.getText(((IfCmdContext)_localctx).cmd.start,((IfCmdContext)_localctx).cmd.stop):null));
			   
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileCmdContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(LangParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(LangParser.LPAREN, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(LangParser.RPAREN, 0); }
		public CmdContext cmd() {
			return getRuleContext(CmdContext.class,0);
		}
		public WhileCmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileCmd; }
	}

	public final WhileCmdContext whileCmd() throws RecognitionException {
		WhileCmdContext _localctx = new WhileCmdContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_whileCmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(WHILE);
			setState(166);
			match(LPAREN);
			setState(167);
			exp();
			setState(168);
			match(RPAREN);
			setState(169);
			cmd();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReadCmdContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(LangParser.READ, 0); }
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(LangParser.SEMICOLON, 0); }
		public ReadCmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readCmd; }
	}

	public final ReadCmdContext readCmd() throws RecognitionException {
		ReadCmdContext _localctx = new ReadCmdContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_readCmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(READ);
			setState(172);
			lvalue(0);
			setState(173);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintCmdContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(LangParser.PRINT, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(LangParser.SEMICOLON, 0); }
		public PrintCmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printCmd; }
	}

	public final PrintCmdContext printCmd() throws RecognitionException {
		PrintCmdContext _localctx = new PrintCmdContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_printCmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(PRINT);
			setState(176);
			exp();
			setState(177);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnCmdContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(LangParser.RETURN, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(LangParser.SEMICOLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(LangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LangParser.COMMA, i);
		}
		public ReturnCmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnCmd; }
	}

	public final ReturnCmdContext returnCmd() throws RecognitionException {
		ReturnCmdContext _localctx = new ReturnCmdContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_returnCmd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(RETURN);
			setState(180);
			exp();
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(181);
				match(COMMA);
				setState(182);
				exp();
				}
				}
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(188);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignCmdContext extends ParserRuleContext {
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode ATTR() { return getToken(LangParser.ATTR, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(LangParser.SEMICOLON, 0); }
		public AssignCmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignCmd; }
	}

	public final AssignCmdContext assignCmd() throws RecognitionException {
		AssignCmdContext _localctx = new AssignCmdContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_assignCmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			lvalue(0);
			setState(191);
			match(ATTR);
			setState(192);
			exp();
			setState(193);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AccessReturnContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LangParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(LangParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(LangParser.RPAREN, 0); }
		public TerminalNode LBRACK() { return getToken(LangParser.LBRACK, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(LangParser.RBRACK, 0); }
		public ExpsContext exps() {
			return getRuleContext(ExpsContext.class,0);
		}
		public AccessReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessReturn; }
	}

	public final AccessReturnContext accessReturn() throws RecognitionException {
		AccessReturnContext _localctx = new AccessReturnContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_accessReturn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(ID);
			setState(196);
			match(LPAREN);
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << MINUS) | (1L << LOGICAL_NOT) | (1L << ID) | (1L << INTLIT) | (1L << FLOATLIT) | (1L << CHARLIT) | (1L << STRINGLIT))) != 0)) {
				{
				setState(197);
				exps();
				}
			}

			setState(200);
			match(RPAREN);
			setState(201);
			match(LBRACK);
			setState(202);
			exp();
			setState(203);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncCallCmdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LangParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(LangParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(LangParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(LangParser.SEMICOLON, 0); }
		public ExpsContext exps() {
			return getRuleContext(ExpsContext.class,0);
		}
		public TerminalNode LESS_THAN() { return getToken(LangParser.LESS_THAN, 0); }
		public List<LvalueContext> lvalue() {
			return getRuleContexts(LvalueContext.class);
		}
		public LvalueContext lvalue(int i) {
			return getRuleContext(LvalueContext.class,i);
		}
		public TerminalNode GREATER_THAN() { return getToken(LangParser.GREATER_THAN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(LangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LangParser.COMMA, i);
		}
		public FuncCallCmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcCallCmd; }
	}

	public final FuncCallCmdContext funcCallCmd() throws RecognitionException {
		FuncCallCmdContext _localctx = new FuncCallCmdContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_funcCallCmd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(ID);
			setState(206);
			match(LPAREN);
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << MINUS) | (1L << LOGICAL_NOT) | (1L << ID) | (1L << INTLIT) | (1L << FLOATLIT) | (1L << CHARLIT) | (1L << STRINGLIT))) != 0)) {
				{
				setState(207);
				exps();
				}
			}

			setState(210);
			match(RPAREN);
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LESS_THAN) {
				{
				setState(211);
				match(LESS_THAN);
				setState(212);
				lvalue(0);
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(213);
					match(COMMA);
					setState(214);
					lvalue(0);
					}
					}
					setState(219);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(220);
				match(GREATER_THAN);
				}
			}

			setState(224);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpContext extends ParserRuleContext {
		public LogicalOrExpContext logicalOrExp() {
			return getRuleContext(LogicalOrExpContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			logicalOrExp();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogicalOrExpContext extends ParserRuleContext {
		public List<LogicalAndExpContext> logicalAndExp() {
			return getRuleContexts(LogicalAndExpContext.class);
		}
		public LogicalAndExpContext logicalAndExp(int i) {
			return getRuleContext(LogicalAndExpContext.class,i);
		}
		public List<TerminalNode> LOGICAL_OR() { return getTokens(LangParser.LOGICAL_OR); }
		public TerminalNode LOGICAL_OR(int i) {
			return getToken(LangParser.LOGICAL_OR, i);
		}
		public LogicalOrExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOrExp; }
	}

	public final LogicalOrExpContext logicalOrExp() throws RecognitionException {
		LogicalOrExpContext _localctx = new LogicalOrExpContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_logicalOrExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			logicalAndExp();
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LOGICAL_OR) {
				{
				{
				setState(229);
				match(LOGICAL_OR);
				setState(230);
				logicalAndExp();
				}
				}
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogicalAndExpContext extends ParserRuleContext {
		public List<EqualityExpContext> equalityExp() {
			return getRuleContexts(EqualityExpContext.class);
		}
		public EqualityExpContext equalityExp(int i) {
			return getRuleContext(EqualityExpContext.class,i);
		}
		public List<TerminalNode> LOGICAL_AND() { return getTokens(LangParser.LOGICAL_AND); }
		public TerminalNode LOGICAL_AND(int i) {
			return getToken(LangParser.LOGICAL_AND, i);
		}
		public LogicalAndExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalAndExp; }
	}

	public final LogicalAndExpContext logicalAndExp() throws RecognitionException {
		LogicalAndExpContext _localctx = new LogicalAndExpContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_logicalAndExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			equalityExp();
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LOGICAL_AND) {
				{
				{
				setState(237);
				match(LOGICAL_AND);
				setState(238);
				equalityExp();
				}
				}
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EqualityExpContext extends ParserRuleContext {
		public List<RelationalExpContext> relationalExp() {
			return getRuleContexts(RelationalExpContext.class);
		}
		public RelationalExpContext relationalExp(int i) {
			return getRuleContext(RelationalExpContext.class,i);
		}
		public List<TerminalNode> EQUALS() { return getTokens(LangParser.EQUALS); }
		public TerminalNode EQUALS(int i) {
			return getToken(LangParser.EQUALS, i);
		}
		public List<TerminalNode> NOT_EQUALS() { return getTokens(LangParser.NOT_EQUALS); }
		public TerminalNode NOT_EQUALS(int i) {
			return getToken(LangParser.NOT_EQUALS, i);
		}
		public EqualityExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExp; }
	}

	public final EqualityExpContext equalityExp() throws RecognitionException {
		EqualityExpContext _localctx = new EqualityExpContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_equalityExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			relationalExp();
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQUALS || _la==NOT_EQUALS) {
				{
				{
				setState(245);
				_la = _input.LA(1);
				if ( !(_la==EQUALS || _la==NOT_EQUALS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(246);
				relationalExp();
				}
				}
				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationalExpContext extends ParserRuleContext {
		public List<AdditiveExpContext> additiveExp() {
			return getRuleContexts(AdditiveExpContext.class);
		}
		public AdditiveExpContext additiveExp(int i) {
			return getRuleContext(AdditiveExpContext.class,i);
		}
		public List<TerminalNode> LESS_THAN() { return getTokens(LangParser.LESS_THAN); }
		public TerminalNode LESS_THAN(int i) {
			return getToken(LangParser.LESS_THAN, i);
		}
		public List<TerminalNode> GREATER_THAN() { return getTokens(LangParser.GREATER_THAN); }
		public TerminalNode GREATER_THAN(int i) {
			return getToken(LangParser.GREATER_THAN, i);
		}
		public List<TerminalNode> LESS_OR_EQUAL() { return getTokens(LangParser.LESS_OR_EQUAL); }
		public TerminalNode LESS_OR_EQUAL(int i) {
			return getToken(LangParser.LESS_OR_EQUAL, i);
		}
		public List<TerminalNode> GREATER_OR_EQUAL() { return getTokens(LangParser.GREATER_OR_EQUAL); }
		public TerminalNode GREATER_OR_EQUAL(int i) {
			return getToken(LangParser.GREATER_OR_EQUAL, i);
		}
		public RelationalExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExp; }
	}

	public final RelationalExpContext relationalExp() throws RecognitionException {
		RelationalExpContext _localctx = new RelationalExpContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_relationalExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			additiveExp();
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS_THAN) | (1L << GREATER_THAN) | (1L << LESS_OR_EQUAL) | (1L << GREATER_OR_EQUAL))) != 0)) {
				{
				{
				setState(253);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS_THAN) | (1L << GREATER_THAN) | (1L << LESS_OR_EQUAL) | (1L << GREATER_OR_EQUAL))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(254);
				additiveExp();
				}
				}
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AdditiveExpContext extends ParserRuleContext {
		public List<MultiplicativeExpContext> multiplicativeExp() {
			return getRuleContexts(MultiplicativeExpContext.class);
		}
		public MultiplicativeExpContext multiplicativeExp(int i) {
			return getRuleContext(MultiplicativeExpContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(LangParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(LangParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(LangParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(LangParser.MINUS, i);
		}
		public AdditiveExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExp; }
	}

	public final AdditiveExpContext additiveExp() throws RecognitionException {
		AdditiveExpContext _localctx = new AdditiveExpContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_additiveExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			multiplicativeExp();
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(261);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(262);
				multiplicativeExp();
				}
				}
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiplicativeExpContext extends ParserRuleContext {
		public List<UnaryExpContext> unaryExp() {
			return getRuleContexts(UnaryExpContext.class);
		}
		public UnaryExpContext unaryExp(int i) {
			return getRuleContext(UnaryExpContext.class,i);
		}
		public List<TerminalNode> TIMES() { return getTokens(LangParser.TIMES); }
		public TerminalNode TIMES(int i) {
			return getToken(LangParser.TIMES, i);
		}
		public List<TerminalNode> DIVIDE() { return getTokens(LangParser.DIVIDE); }
		public TerminalNode DIVIDE(int i) {
			return getToken(LangParser.DIVIDE, i);
		}
		public List<TerminalNode> MOD() { return getTokens(LangParser.MOD); }
		public TerminalNode MOD(int i) {
			return getToken(LangParser.MOD, i);
		}
		public MultiplicativeExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExp; }
	}

	public final MultiplicativeExpContext multiplicativeExp() throws RecognitionException {
		MultiplicativeExpContext _localctx = new MultiplicativeExpContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_multiplicativeExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			unaryExp();
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIMES) | (1L << DIVIDE) | (1L << MOD))) != 0)) {
				{
				{
				setState(269);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIMES) | (1L << DIVIDE) | (1L << MOD))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(270);
				unaryExp();
				}
				}
				setState(275);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryExpContext extends ParserRuleContext {
		public UnaryExpContext unaryExp() {
			return getRuleContext(UnaryExpContext.class,0);
		}
		public TerminalNode LOGICAL_NOT() { return getToken(LangParser.LOGICAL_NOT, 0); }
		public TerminalNode MINUS() { return getToken(LangParser.MINUS, 0); }
		public PrimaryExpContext primaryExp() {
			return getRuleContext(PrimaryExpContext.class,0);
		}
		public UnaryExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExp; }
	}

	public final UnaryExpContext unaryExp() throws RecognitionException {
		UnaryExpContext _localctx = new UnaryExpContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_unaryExp);
		int _la;
		try {
			setState(279);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
			case LOGICAL_NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(276);
				_la = _input.LA(1);
				if ( !(_la==MINUS || _la==LOGICAL_NOT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(277);
				unaryExp();
				}
				break;
			case NEW:
			case TRUE:
			case FALSE:
			case NULL:
			case LPAREN:
			case ID:
			case INTLIT:
			case FLOATLIT:
			case CHARLIT:
			case STRINGLIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(278);
				primaryExp();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryExpContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(LangParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(LangParser.FALSE, 0); }
		public TerminalNode NULL() { return getToken(LangParser.NULL, 0); }
		public TerminalNode INTLIT() { return getToken(LangParser.INTLIT, 0); }
		public TerminalNode FLOATLIT() { return getToken(LangParser.FLOATLIT, 0); }
		public TerminalNode CHARLIT() { return getToken(LangParser.CHARLIT, 0); }
		public TerminalNode STRINGLIT() { return getToken(LangParser.STRINGLIT, 0); }
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(LangParser.LPAREN, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(LangParser.RPAREN, 0); }
		public TerminalNode NEW() { return getToken(LangParser.NEW, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(LangParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(LangParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(LangParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(LangParser.RBRACK, i);
		}
		public AccessReturnContext accessReturn() {
			return getRuleContext(AccessReturnContext.class,0);
		}
		public PrimaryExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExp; }
	}

	public final PrimaryExpContext primaryExp() throws RecognitionException {
		PrimaryExpContext _localctx = new PrimaryExpContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_primaryExp);
		int _la;
		try {
			setState(305);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(281);
				match(TRUE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(282);
				match(FALSE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(283);
				match(NULL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(284);
				match(INTLIT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(285);
				match(FLOATLIT);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(286);
				match(CHARLIT);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(287);
				match(STRINGLIT);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(288);
				lvalue(0);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(289);
				match(LPAREN);
				setState(290);
				exp();
				setState(291);
				match(RPAREN);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(293);
				match(NEW);
				setState(294);
				type();
				setState(301);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(295);
					match(LBRACK);
					setState(296);
					exp();
					setState(297);
					match(RBRACK);
					}
					}
					setState(303);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(304);
				accessReturn();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LvalueContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LangParser.ID, 0); }
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode LBRACK() { return getToken(LangParser.LBRACK, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(LangParser.RBRACK, 0); }
		public TerminalNode DOT() { return getToken(LangParser.DOT, 0); }
		public LvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lvalue; }
	}

	public final LvalueContext lvalue() throws RecognitionException {
		return lvalue(0);
	}

	private LvalueContext lvalue(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LvalueContext _localctx = new LvalueContext(_ctx, _parentState);
		LvalueContext _prevctx = _localctx;
		int _startState = 54;
		enterRecursionRule(_localctx, 54, RULE_lvalue, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(308);
			match(ID);
			}
			_ctx.stop = _input.LT(-1);
			setState(320);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(318);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
						_localctx = new LvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_lvalue);
						setState(310);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(311);
						match(LBRACK);
						setState(312);
						exp();
						setState(313);
						match(RBRACK);
						}
						break;
					case 2:
						{
						_localctx = new LvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_lvalue);
						setState(315);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(316);
						match(DOT);
						setState(317);
						match(ID);
						}
						break;
					}
					} 
				}
				setState(322);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpsContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LangParser.COMMA, i);
		}
		public ExpsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exps; }
	}

	public final ExpsContext exps() throws RecognitionException {
		ExpsContext _localctx = new ExpsContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_exps);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			exp();
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(324);
				match(COMMA);
				setState(325);
				exp();
				}
				}
				setState(330);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 27:
			return lvalue_sempred((LvalueContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean lvalue_sempred(LvalueContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\65\u014e\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\6\2>\n\2\r\2\16"+
		"\2?\3\2\3\2\3\3\3\3\5\3F\n\3\3\4\3\4\3\4\3\4\7\4L\n\4\f\4\16\4O\13\4\3"+
		"\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\5\6]\n\6\3\6\3\6\3\6\3"+
		"\6\3\6\7\6d\n\6\f\6\16\6g\13\6\5\6i\n\6\3\6\3\6\7\6m\n\6\f\6\16\6p\13"+
		"\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7|\n\7\f\7\16\7\177\13\7"+
		"\3\7\3\7\3\b\3\b\3\b\5\b\u0086\n\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\5\n\u0092\n\n\3\13\3\13\7\13\u0096\n\13\f\13\16\13\u0099\13\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00a4\n\f\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3"+
		"\20\7\20\u00ba\n\20\f\20\16\20\u00bd\13\20\3\20\3\20\3\21\3\21\3\21\3"+
		"\21\3\21\3\22\3\22\3\22\5\22\u00c9\n\22\3\22\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\5\23\u00d3\n\23\3\23\3\23\3\23\3\23\3\23\7\23\u00da\n\23\f"+
		"\23\16\23\u00dd\13\23\3\23\3\23\5\23\u00e1\n\23\3\23\3\23\3\24\3\24\3"+
		"\25\3\25\3\25\7\25\u00ea\n\25\f\25\16\25\u00ed\13\25\3\26\3\26\3\26\7"+
		"\26\u00f2\n\26\f\26\16\26\u00f5\13\26\3\27\3\27\3\27\7\27\u00fa\n\27\f"+
		"\27\16\27\u00fd\13\27\3\30\3\30\3\30\7\30\u0102\n\30\f\30\16\30\u0105"+
		"\13\30\3\31\3\31\3\31\7\31\u010a\n\31\f\31\16\31\u010d\13\31\3\32\3\32"+
		"\3\32\7\32\u0112\n\32\f\32\16\32\u0115\13\32\3\33\3\33\3\33\5\33\u011a"+
		"\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\7\34\u012e\n\34\f\34\16\34\u0131\13\34\3\34"+
		"\5\34\u0134\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\7\35\u0141\n\35\f\35\16\35\u0144\13\35\3\36\3\36\3\36\7\36\u0149\n\36"+
		"\f\36\16\36\u014c\13\36\3\36\2\38\37\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:\2\b\4\2\t\r..\3\2&\'\3\2(+\3\2\36\37\3\2"+
		" \"\4\2\37\37%%\2\u015c\2=\3\2\2\2\4E\3\2\2\2\6G\3\2\2\2\bS\3\2\2\2\n"+
		"Y\3\2\2\2\ft\3\2\2\2\16\u0082\3\2\2\2\20\u0087\3\2\2\2\22\u0091\3\2\2"+
		"\2\24\u0093\3\2\2\2\26\u009c\3\2\2\2\30\u00a7\3\2\2\2\32\u00ad\3\2\2\2"+
		"\34\u00b1\3\2\2\2\36\u00b5\3\2\2\2 \u00c0\3\2\2\2\"\u00c5\3\2\2\2$\u00cf"+
		"\3\2\2\2&\u00e4\3\2\2\2(\u00e6\3\2\2\2*\u00ee\3\2\2\2,\u00f6\3\2\2\2."+
		"\u00fe\3\2\2\2\60\u0106\3\2\2\2\62\u010e\3\2\2\2\64\u0119\3\2\2\2\66\u0133"+
		"\3\2\2\28\u0135\3\2\2\2:\u0145\3\2\2\2<>\5\4\3\2=<\3\2\2\2>?\3\2\2\2?"+
		"=\3\2\2\2?@\3\2\2\2@A\3\2\2\2AB\b\2\1\2B\3\3\2\2\2CF\5\6\4\2DF\5\n\6\2"+
		"EC\3\2\2\2ED\3\2\2\2F\5\3\2\2\2GH\7\21\2\2HI\7.\2\2IM\7\25\2\2JL\5\b\5"+
		"\2KJ\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2NP\3\2\2\2OM\3\2\2\2PQ\7\26"+
		"\2\2QR\b\4\1\2R\7\3\2\2\2ST\7-\2\2TU\7\34\2\2UV\5\16\b\2VW\7\31\2\2WX"+
		"\b\5\1\2X\t\3\2\2\2YZ\7-\2\2Z\\\7\24\2\2[]\5\f\7\2\\[\3\2\2\2\\]\3\2\2"+
		"\2]^\3\2\2\2^h\7\23\2\2_`\7\35\2\2`e\5\16\b\2ab\7\32\2\2bd\5\16\b\2ca"+
		"\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2fi\3\2\2\2ge\3\2\2\2h_\3\2\2\2h"+
		"i\3\2\2\2ij\3\2\2\2jn\7\25\2\2km\5\22\n\2lk\3\2\2\2mp\3\2\2\2nl\3\2\2"+
		"\2no\3\2\2\2oq\3\2\2\2pn\3\2\2\2qr\7\26\2\2rs\b\6\1\2s\13\3\2\2\2tu\7"+
		"-\2\2uv\7\34\2\2v}\5\16\b\2wx\7\32\2\2xy\7-\2\2yz\7\34\2\2z|\5\16\b\2"+
		"{w\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\u0080\3\2\2\2\177}\3\2\2"+
		"\2\u0080\u0081\b\7\1\2\u0081\r\3\2\2\2\u0082\u0085\5\20\t\2\u0083\u0084"+
		"\7\27\2\2\u0084\u0086\7\30\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2"+
		"\u0086\17\3\2\2\2\u0087\u0088\t\2\2\2\u0088\21\3\2\2\2\u0089\u0092\5\24"+
		"\13\2\u008a\u0092\5\26\f\2\u008b\u0092\5\30\r\2\u008c\u0092\5\32\16\2"+
		"\u008d\u0092\5\34\17\2\u008e\u0092\5\36\20\2\u008f\u0092\5 \21\2\u0090"+
		"\u0092\5$\23\2\u0091\u0089\3\2\2\2\u0091\u008a\3\2\2\2\u0091\u008b\3\2"+
		"\2\2\u0091\u008c\3\2\2\2\u0091\u008d\3\2\2\2\u0091\u008e\3\2\2\2\u0091"+
		"\u008f\3\2\2\2\u0091\u0090\3\2\2\2\u0092\23\3\2\2\2\u0093\u0097\7\25\2"+
		"\2\u0094\u0096\5\22\n\2\u0095\u0094\3\2\2\2\u0096\u0099\3\2\2\2\u0097"+
		"\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009a\3\2\2\2\u0099\u0097\3\2"+
		"\2\2\u009a\u009b\7\26\2\2\u009b\25\3\2\2\2\u009c\u009d\7\3\2\2\u009d\u009e"+
		"\7\24\2\2\u009e\u009f\5&\24\2\u009f\u00a0\7\23\2\2\u00a0\u00a3\5\22\n"+
		"\2\u00a1\u00a2\7\4\2\2\u00a2\u00a4\5\22\n\2\u00a3\u00a1\3\2\2\2\u00a3"+
		"\u00a4\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\b\f\1\2\u00a6\27\3\2\2"+
		"\2\u00a7\u00a8\7\7\2\2\u00a8\u00a9\7\24\2\2\u00a9\u00aa\5&\24\2\u00aa"+
		"\u00ab\7\23\2\2\u00ab\u00ac\5\22\n\2\u00ac\31\3\2\2\2\u00ad\u00ae\7\22"+
		"\2\2\u00ae\u00af\58\35\2\u00af\u00b0\7\31\2\2\u00b0\33\3\2\2\2\u00b1\u00b2"+
		"\7\6\2\2\u00b2\u00b3\5&\24\2\u00b3\u00b4\7\31\2\2\u00b4\35\3\2\2\2\u00b5"+
		"\u00b6\7\b\2\2\u00b6\u00bb\5&\24\2\u00b7\u00b8\7\32\2\2\u00b8\u00ba\5"+
		"&\24\2\u00b9\u00b7\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb"+
		"\u00bc\3\2\2\2\u00bc\u00be\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00bf\7\31"+
		"\2\2\u00bf\37\3\2\2\2\u00c0\u00c1\58\35\2\u00c1\u00c2\7,\2\2\u00c2\u00c3"+
		"\5&\24\2\u00c3\u00c4\7\31\2\2\u00c4!\3\2\2\2\u00c5\u00c6\7-\2\2\u00c6"+
		"\u00c8\7\24\2\2\u00c7\u00c9\5:\36\2\u00c8\u00c7\3\2\2\2\u00c8\u00c9\3"+
		"\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\7\23\2\2\u00cb\u00cc\7\27\2\2\u00cc"+
		"\u00cd\5&\24\2\u00cd\u00ce\7\30\2\2\u00ce#\3\2\2\2\u00cf\u00d0\7-\2\2"+
		"\u00d0\u00d2\7\24\2\2\u00d1\u00d3\5:\36\2\u00d2\u00d1\3\2\2\2\u00d2\u00d3"+
		"\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00e0\7\23\2\2\u00d5\u00d6\7(\2\2\u00d6"+
		"\u00db\58\35\2\u00d7\u00d8\7\32\2\2\u00d8\u00da\58\35\2\u00d9\u00d7\3"+
		"\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc"+
		"\u00de\3\2\2\2\u00dd\u00db\3\2\2\2\u00de\u00df\7)\2\2\u00df\u00e1\3\2"+
		"\2\2\u00e0\u00d5\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2"+
		"\u00e3\7\31\2\2\u00e3%\3\2\2\2\u00e4\u00e5\5(\25\2\u00e5\'\3\2\2\2\u00e6"+
		"\u00eb\5*\26\2\u00e7\u00e8\7$\2\2\u00e8\u00ea\5*\26\2\u00e9\u00e7\3\2"+
		"\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec"+
		")\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee\u00f3\5,\27\2\u00ef\u00f0\7#\2\2\u00f0"+
		"\u00f2\5,\27\2\u00f1\u00ef\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2"+
		"\2\2\u00f3\u00f4\3\2\2\2\u00f4+\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00fb"+
		"\5.\30\2\u00f7\u00f8\t\3\2\2\u00f8\u00fa\5.\30\2\u00f9\u00f7\3\2\2\2\u00fa"+
		"\u00fd\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc-\3\2\2\2"+
		"\u00fd\u00fb\3\2\2\2\u00fe\u0103\5\60\31\2\u00ff\u0100\t\4\2\2\u0100\u0102"+
		"\5\60\31\2\u0101\u00ff\3\2\2\2\u0102\u0105\3\2\2\2\u0103\u0101\3\2\2\2"+
		"\u0103\u0104\3\2\2\2\u0104/\3\2\2\2\u0105\u0103\3\2\2\2\u0106\u010b\5"+
		"\62\32\2\u0107\u0108\t\5\2\2\u0108\u010a\5\62\32\2\u0109\u0107\3\2\2\2"+
		"\u010a\u010d\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c\61"+
		"\3\2\2\2\u010d\u010b\3\2\2\2\u010e\u0113\5\64\33\2\u010f\u0110\t\6\2\2"+
		"\u0110\u0112\5\64\33\2\u0111\u010f\3\2\2\2\u0112\u0115\3\2\2\2\u0113\u0111"+
		"\3\2\2\2\u0113\u0114\3\2\2\2\u0114\63\3\2\2\2\u0115\u0113\3\2\2\2\u0116"+
		"\u0117\t\7\2\2\u0117\u011a\5\64\33\2\u0118\u011a\5\66\34\2\u0119\u0116"+
		"\3\2\2\2\u0119\u0118\3\2\2\2\u011a\65\3\2\2\2\u011b\u0134\7\16\2\2\u011c"+
		"\u0134\7\17\2\2\u011d\u0134\7\20\2\2\u011e\u0134\7/\2\2\u011f\u0134\7"+
		"\60\2\2\u0120\u0134\7\61\2\2\u0121\u0134\7\62\2\2\u0122\u0134\58\35\2"+
		"\u0123\u0124\7\24\2\2\u0124\u0125\5&\24\2\u0125\u0126\7\23\2\2\u0126\u0134"+
		"\3\2\2\2\u0127\u0128\7\5\2\2\u0128\u012f\5\16\b\2\u0129\u012a\7\27\2\2"+
		"\u012a\u012b\5&\24\2\u012b\u012c\7\30\2\2\u012c\u012e\3\2\2\2\u012d\u0129"+
		"\3\2\2\2\u012e\u0131\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130"+
		"\u0134\3\2\2\2\u0131\u012f\3\2\2\2\u0132\u0134\5\"\22\2\u0133\u011b\3"+
		"\2\2\2\u0133\u011c\3\2\2\2\u0133\u011d\3\2\2\2\u0133\u011e\3\2\2\2\u0133"+
		"\u011f\3\2\2\2\u0133\u0120\3\2\2\2\u0133\u0121\3\2\2\2\u0133\u0122\3\2"+
		"\2\2\u0133\u0123\3\2\2\2\u0133\u0127\3\2\2\2\u0133\u0132\3\2\2\2\u0134"+
		"\67\3\2\2\2\u0135\u0136\b\35\1\2\u0136\u0137\7-\2\2\u0137\u0142\3\2\2"+
		"\2\u0138\u0139\f\4\2\2\u0139\u013a\7\27\2\2\u013a\u013b\5&\24\2\u013b"+
		"\u013c\7\30\2\2\u013c\u0141\3\2\2\2\u013d\u013e\f\3\2\2\u013e\u013f\7"+
		"\33\2\2\u013f\u0141\7-\2\2\u0140\u0138\3\2\2\2\u0140\u013d\3\2\2\2\u0141"+
		"\u0144\3\2\2\2\u0142\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u01439\3\2\2\2"+
		"\u0144\u0142\3\2\2\2\u0145\u014a\5&\24\2\u0146\u0147\7\32\2\2\u0147\u0149"+
		"\5&\24\2\u0148\u0146\3\2\2\2\u0149\u014c\3\2\2\2\u014a\u0148\3\2\2\2\u014a"+
		"\u014b\3\2\2\2\u014b;\3\2\2\2\u014c\u014a\3\2\2\2\37?EM\\ehn}\u0085\u0091"+
		"\u0097\u00a3\u00bb\u00c8\u00d2\u00db\u00e0\u00eb\u00f3\u00fb\u0103\u010b"+
		"\u0113\u0119\u012f\u0133\u0140\u0142\u014a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}