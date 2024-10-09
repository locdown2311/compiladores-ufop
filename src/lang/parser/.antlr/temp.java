// Generated from /config/workspace/igor/compiladores-elton/versao-final/src/lang/parser/temp.g4 by ANTLR 4.9.2

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
public class temp extends Parser {
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
	public static final int
		RULE_prog = 0, RULE_defList = 1, RULE_def = 2, RULE_data = 3, RULE_decl = 4, 
		RULE_func = 5, RULE_params = 6, RULE_type = 7, RULE_btype = 8, RULE_cmd = 9, 
		RULE_block = 10, RULE_ifCmd = 11, RULE_whileCmd = 12, RULE_readCmd = 13, 
		RULE_printCmd = 14, RULE_returnCmd = 15, RULE_assignCmd = 16, RULE_accessReturn = 17, 
		RULE_funcCallCmd = 18, RULE_exp = 19, RULE_logicalOrExp = 20, RULE_logicalAndExp = 21, 
		RULE_equalityExp = 22, RULE_relationalExp = 23, RULE_additiveExp = 24, 
		RULE_multiplicativeExp = 25, RULE_unaryExp = 26, RULE_primaryExp = 27, 
		RULE_lvalue = 28, RULE_exps = 29;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "defList", "def", "data", "decl", "func", "params", "type", "btype", 
			"cmd", "block", "ifCmd", "whileCmd", "readCmd", "printCmd", "returnCmd", 
			"assignCmd", "accessReturn", "funcCallCmd", "exp", "logicalOrExp", "logicalAndExp", 
			"equalityExp", "relationalExp", "additiveExp", "multiplicativeExp", "unaryExp", 
			"primaryExp", "lvalue", "exps"
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

	@Override
	public String getGrammarFileName() { return "temp.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public temp(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public CProg c;
		public DefListContext e;
		public DefListContext defList() {
			return getRuleContext(DefListContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			((ProgContext)_localctx).e = defList();
			 ((ProgContext)_localctx).c =  new CProg((CFuncDef[])((ProgContext)_localctx).e.df.toArray());
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

	public static class DefListContext extends ParserRuleContext {
		public ArrayList<CFuncDef> df;
		public DefContext d;
		public DefListContext defList;
		public DefContext def;
		public DefListContext defList() {
			return getRuleContext(DefListContext.class,0);
		}
		public DefContext def() {
			return getRuleContext(DefContext.class,0);
		}
		public DefListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defList; }
	}

	public final DefListContext defList() throws RecognitionException {
		DefListContext _localctx = new DefListContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_defList);
		try {
			setState(70);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				((DefListContext)_localctx).d = def();
				setState(64);
				((DefListContext)_localctx).defList = defList();
				((DefListContext)_localctx).defList.df.add( ((DefListContext)_localctx).d.d);  
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				((DefListContext)_localctx).def = def();
				 ((DefListContext)_localctx).df =  new ArrayList<CFuncDef>();
				                        _localctx.df.add(((DefListContext)_localctx).def.d);
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

	public static class DefContext extends ParserRuleContext {
		public CFuncDef d;
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
		enterRule(_localctx, 4, RULE_def);
		try {
			setState(78);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DATA:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				data();
				 ((DefContext)_localctx).d =  new CFuncDef("fstub", new CVarDec[0], null, null); 
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				func();
				 ((DefContext)_localctx).d =  new CFuncDef("fstub", new CVarDec[0], null, null); 
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
		public TerminalNode DATA() { return getToken(temp.DATA, 0); }
		public TerminalNode TYPE() { return getToken(temp.TYPE, 0); }
		public TerminalNode LBRACE() { return getToken(temp.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(temp.RBRACE, 0); }
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
		enterRule(_localctx, 6, RULE_data);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(DATA);
			setState(81);
			((DataContext)_localctx).TYPE = match(TYPE);
			setState(82);
			match(LBRACE);
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(83);
				decl();
				}
				}
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(89);
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
		public TerminalNode ID() { return getToken(temp.ID, 0); }
		public TerminalNode DOUBLE_COLON() { return getToken(temp.DOUBLE_COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(temp.SEMICOLON, 0); }
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			((DeclContext)_localctx).ID = match(ID);
			setState(93);
			match(DOUBLE_COLON);
			setState(94);
			((DeclContext)_localctx).type = type();
			setState(95);
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
		public TerminalNode ID() { return getToken(temp.ID, 0); }
		public TerminalNode LPAREN() { return getToken(temp.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(temp.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(temp.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(temp.RBRACE, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode COLON() { return getToken(temp.COLON, 0); }
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
		public List<TerminalNode> COMMA() { return getTokens(temp.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(temp.COMMA, i);
		}
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			((FuncContext)_localctx).ID = match(ID);
			setState(99);
			match(LPAREN);
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(100);
				params();
				}
			}

			setState(103);
			match(RPAREN);
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(104);
				match(COLON);
				setState(105);
				type();
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(106);
					match(COMMA);
					setState(107);
					type();
					}
					}
					setState(112);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(115);
			match(LBRACE);
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << PRINT) | (1L << ITERATE) | (1L << RETURN) | (1L << READ) | (1L << LBRACE) | (1L << ID))) != 0)) {
				{
				{
				setState(116);
				cmd();
				}
				}
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(122);
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
		public List<TerminalNode> ID() { return getTokens(temp.ID); }
		public TerminalNode ID(int i) {
			return getToken(temp.ID, i);
		}
		public List<TerminalNode> DOUBLE_COLON() { return getTokens(temp.DOUBLE_COLON); }
		public TerminalNode DOUBLE_COLON(int i) {
			return getToken(temp.DOUBLE_COLON, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(temp.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(temp.COMMA, i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			((ParamsContext)_localctx).ID = match(ID);
			setState(126);
			match(DOUBLE_COLON);
			setState(127);
			((ParamsContext)_localctx).type = type();
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(128);
				match(COMMA);
				setState(129);
				((ParamsContext)_localctx).ID = match(ID);
				setState(130);
				match(DOUBLE_COLON);
				setState(131);
				((ParamsContext)_localctx).type = type();
				}
				}
				setState(136);
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
		public TerminalNode LBRACK() { return getToken(temp.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(temp.RBRACK, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			btype();
			setState(142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(140);
				match(LBRACK);
				setState(141);
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
		public TerminalNode INT() { return getToken(temp.INT, 0); }
		public TerminalNode CHAR() { return getToken(temp.CHAR, 0); }
		public TerminalNode BOOLEAN() { return getToken(temp.BOOLEAN, 0); }
		public TerminalNode FLOAT() { return getToken(temp.FLOAT, 0); }
		public TerminalNode VOID() { return getToken(temp.VOID, 0); }
		public TerminalNode TYPE() { return getToken(temp.TYPE, 0); }
		public BtypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_btype; }
	}

	public final BtypeContext btype() throws RecognitionException {
		BtypeContext _localctx = new BtypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_btype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
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
		enterRule(_localctx, 18, RULE_cmd);
		try {
			setState(154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				ifCmd();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(148);
				whileCmd();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(149);
				readCmd();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(150);
				printCmd();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(151);
				returnCmd();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(152);
				assignCmd();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(153);
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
		public TerminalNode LBRACE() { return getToken(temp.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(temp.RBRACE, 0); }
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
		enterRule(_localctx, 20, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(LBRACE);
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << PRINT) | (1L << ITERATE) | (1L << RETURN) | (1L << READ) | (1L << LBRACE) | (1L << ID))) != 0)) {
				{
				{
				setState(157);
				cmd();
				}
				}
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(163);
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
		public TerminalNode IF() { return getToken(temp.IF, 0); }
		public TerminalNode LPAREN() { return getToken(temp.LPAREN, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(temp.RPAREN, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(temp.ELSE, 0); }
		public IfCmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifCmd; }
	}

	public final IfCmdContext ifCmd() throws RecognitionException {
		IfCmdContext _localctx = new IfCmdContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_ifCmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			((IfCmdContext)_localctx).IF = match(IF);
			setState(166);
			match(LPAREN);
			setState(167);
			((IfCmdContext)_localctx).exp = exp();
			setState(168);
			match(RPAREN);
			setState(169);
			((IfCmdContext)_localctx).cmd = cmd();
			setState(172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(170);
				((IfCmdContext)_localctx).ELSE = match(ELSE);
				setState(171);
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
		public TerminalNode ITERATE() { return getToken(temp.ITERATE, 0); }
		public TerminalNode LPAREN() { return getToken(temp.LPAREN, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(temp.RPAREN, 0); }
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
		enterRule(_localctx, 24, RULE_whileCmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(ITERATE);
			setState(177);
			match(LPAREN);
			setState(178);
			exp();
			setState(179);
			match(RPAREN);
			setState(180);
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
		public TerminalNode READ() { return getToken(temp.READ, 0); }
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(temp.SEMICOLON, 0); }
		public ReadCmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readCmd; }
	}

	public final ReadCmdContext readCmd() throws RecognitionException {
		ReadCmdContext _localctx = new ReadCmdContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_readCmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(READ);
			setState(183);
			lvalue(0);
			setState(184);
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
		public TerminalNode PRINT() { return getToken(temp.PRINT, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(temp.SEMICOLON, 0); }
		public PrintCmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printCmd; }
	}

	public final PrintCmdContext printCmd() throws RecognitionException {
		PrintCmdContext _localctx = new PrintCmdContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_printCmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(PRINT);
			setState(187);
			exp();
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

	public static class ReturnCmdContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(temp.RETURN, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(temp.SEMICOLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(temp.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(temp.COMMA, i);
		}
		public ReturnCmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnCmd; }
	}

	public final ReturnCmdContext returnCmd() throws RecognitionException {
		ReturnCmdContext _localctx = new ReturnCmdContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_returnCmd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(RETURN);
			setState(191);
			exp();
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(192);
				match(COMMA);
				setState(193);
				exp();
				}
				}
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(199);
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
		public TerminalNode ATTR() { return getToken(temp.ATTR, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(temp.SEMICOLON, 0); }
		public AssignCmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignCmd; }
	}

	public final AssignCmdContext assignCmd() throws RecognitionException {
		AssignCmdContext _localctx = new AssignCmdContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_assignCmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			lvalue(0);
			setState(202);
			match(ATTR);
			setState(203);
			exp();
			setState(204);
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
		public TerminalNode ID() { return getToken(temp.ID, 0); }
		public TerminalNode LPAREN() { return getToken(temp.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(temp.RPAREN, 0); }
		public TerminalNode LBRACK() { return getToken(temp.LBRACK, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(temp.RBRACK, 0); }
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
		enterRule(_localctx, 34, RULE_accessReturn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(ID);
			setState(207);
			match(LPAREN);
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << MINUS) | (1L << LOGICAL_NOT) | (1L << ID) | (1L << INTLIT) | (1L << FLOATLIT) | (1L << CHARLIT) | (1L << STRINGLIT))) != 0)) {
				{
				setState(208);
				exps();
				}
			}

			setState(211);
			match(RPAREN);
			setState(212);
			match(LBRACK);
			setState(213);
			exp();
			setState(214);
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
		public TerminalNode ID() { return getToken(temp.ID, 0); }
		public TerminalNode LPAREN() { return getToken(temp.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(temp.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(temp.SEMICOLON, 0); }
		public ExpsContext exps() {
			return getRuleContext(ExpsContext.class,0);
		}
		public TerminalNode LESS_THAN() { return getToken(temp.LESS_THAN, 0); }
		public List<LvalueContext> lvalue() {
			return getRuleContexts(LvalueContext.class);
		}
		public LvalueContext lvalue(int i) {
			return getRuleContext(LvalueContext.class,i);
		}
		public TerminalNode GREATER_THAN() { return getToken(temp.GREATER_THAN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(temp.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(temp.COMMA, i);
		}
		public FuncCallCmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcCallCmd; }
	}

	public final FuncCallCmdContext funcCallCmd() throws RecognitionException {
		FuncCallCmdContext _localctx = new FuncCallCmdContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_funcCallCmd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(ID);
			setState(217);
			match(LPAREN);
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << MINUS) | (1L << LOGICAL_NOT) | (1L << ID) | (1L << INTLIT) | (1L << FLOATLIT) | (1L << CHARLIT) | (1L << STRINGLIT))) != 0)) {
				{
				setState(218);
				exps();
				}
			}

			setState(221);
			match(RPAREN);
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LESS_THAN) {
				{
				setState(222);
				match(LESS_THAN);
				setState(223);
				lvalue(0);
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(224);
					match(COMMA);
					setState(225);
					lvalue(0);
					}
					}
					setState(230);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(231);
				match(GREATER_THAN);
				}
			}

			setState(235);
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
		enterRule(_localctx, 38, RULE_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
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
		public List<TerminalNode> LOGICAL_OR() { return getTokens(temp.LOGICAL_OR); }
		public TerminalNode LOGICAL_OR(int i) {
			return getToken(temp.LOGICAL_OR, i);
		}
		public LogicalOrExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOrExp; }
	}

	public final LogicalOrExpContext logicalOrExp() throws RecognitionException {
		LogicalOrExpContext _localctx = new LogicalOrExpContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_logicalOrExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			logicalAndExp();
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LOGICAL_OR) {
				{
				{
				setState(240);
				match(LOGICAL_OR);
				setState(241);
				logicalAndExp();
				}
				}
				setState(246);
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
		public List<TerminalNode> LOGICAL_AND() { return getTokens(temp.LOGICAL_AND); }
		public TerminalNode LOGICAL_AND(int i) {
			return getToken(temp.LOGICAL_AND, i);
		}
		public LogicalAndExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalAndExp; }
	}

	public final LogicalAndExpContext logicalAndExp() throws RecognitionException {
		LogicalAndExpContext _localctx = new LogicalAndExpContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_logicalAndExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			equalityExp();
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LOGICAL_AND) {
				{
				{
				setState(248);
				match(LOGICAL_AND);
				setState(249);
				equalityExp();
				}
				}
				setState(254);
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
		public List<TerminalNode> EQUALS() { return getTokens(temp.EQUALS); }
		public TerminalNode EQUALS(int i) {
			return getToken(temp.EQUALS, i);
		}
		public List<TerminalNode> NOT_EQUALS() { return getTokens(temp.NOT_EQUALS); }
		public TerminalNode NOT_EQUALS(int i) {
			return getToken(temp.NOT_EQUALS, i);
		}
		public EqualityExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExp; }
	}

	public final EqualityExpContext equalityExp() throws RecognitionException {
		EqualityExpContext _localctx = new EqualityExpContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_equalityExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			relationalExp();
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQUALS || _la==NOT_EQUALS) {
				{
				{
				setState(256);
				_la = _input.LA(1);
				if ( !(_la==EQUALS || _la==NOT_EQUALS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(257);
				relationalExp();
				}
				}
				setState(262);
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
		public List<TerminalNode> LESS_THAN() { return getTokens(temp.LESS_THAN); }
		public TerminalNode LESS_THAN(int i) {
			return getToken(temp.LESS_THAN, i);
		}
		public List<TerminalNode> GREATER_THAN() { return getTokens(temp.GREATER_THAN); }
		public TerminalNode GREATER_THAN(int i) {
			return getToken(temp.GREATER_THAN, i);
		}
		public List<TerminalNode> LESS_OR_EQUAL() { return getTokens(temp.LESS_OR_EQUAL); }
		public TerminalNode LESS_OR_EQUAL(int i) {
			return getToken(temp.LESS_OR_EQUAL, i);
		}
		public List<TerminalNode> GREATER_OR_EQUAL() { return getTokens(temp.GREATER_OR_EQUAL); }
		public TerminalNode GREATER_OR_EQUAL(int i) {
			return getToken(temp.GREATER_OR_EQUAL, i);
		}
		public RelationalExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExp; }
	}

	public final RelationalExpContext relationalExp() throws RecognitionException {
		RelationalExpContext _localctx = new RelationalExpContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_relationalExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			additiveExp();
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS_THAN) | (1L << GREATER_THAN) | (1L << LESS_OR_EQUAL) | (1L << GREATER_OR_EQUAL))) != 0)) {
				{
				{
				setState(264);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS_THAN) | (1L << GREATER_THAN) | (1L << LESS_OR_EQUAL) | (1L << GREATER_OR_EQUAL))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(265);
				additiveExp();
				}
				}
				setState(270);
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
		public List<TerminalNode> PLUS() { return getTokens(temp.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(temp.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(temp.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(temp.MINUS, i);
		}
		public AdditiveExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExp; }
	}

	public final AdditiveExpContext additiveExp() throws RecognitionException {
		AdditiveExpContext _localctx = new AdditiveExpContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_additiveExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			multiplicativeExp();
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(272);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(273);
				multiplicativeExp();
				}
				}
				setState(278);
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
		public List<TerminalNode> TIMES() { return getTokens(temp.TIMES); }
		public TerminalNode TIMES(int i) {
			return getToken(temp.TIMES, i);
		}
		public List<TerminalNode> DIVIDE() { return getTokens(temp.DIVIDE); }
		public TerminalNode DIVIDE(int i) {
			return getToken(temp.DIVIDE, i);
		}
		public List<TerminalNode> MOD() { return getTokens(temp.MOD); }
		public TerminalNode MOD(int i) {
			return getToken(temp.MOD, i);
		}
		public MultiplicativeExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExp; }
	}

	public final MultiplicativeExpContext multiplicativeExp() throws RecognitionException {
		MultiplicativeExpContext _localctx = new MultiplicativeExpContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_multiplicativeExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			unaryExp();
			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIMES) | (1L << DIVIDE) | (1L << MOD))) != 0)) {
				{
				{
				setState(280);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIMES) | (1L << DIVIDE) | (1L << MOD))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(281);
				unaryExp();
				}
				}
				setState(286);
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
		public TerminalNode LOGICAL_NOT() { return getToken(temp.LOGICAL_NOT, 0); }
		public TerminalNode MINUS() { return getToken(temp.MINUS, 0); }
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
		enterRule(_localctx, 52, RULE_unaryExp);
		int _la;
		try {
			setState(290);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
			case LOGICAL_NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(287);
				_la = _input.LA(1);
				if ( !(_la==MINUS || _la==LOGICAL_NOT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(288);
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
				setState(289);
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
		public TerminalNode TRUE() { return getToken(temp.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(temp.FALSE, 0); }
		public TerminalNode NULL() { return getToken(temp.NULL, 0); }
		public TerminalNode INTLIT() { return getToken(temp.INTLIT, 0); }
		public TerminalNode FLOATLIT() { return getToken(temp.FLOATLIT, 0); }
		public TerminalNode CHARLIT() { return getToken(temp.CHARLIT, 0); }
		public TerminalNode STRINGLIT() { return getToken(temp.STRINGLIT, 0); }
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(temp.LPAREN, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(temp.RPAREN, 0); }
		public TerminalNode NEW() { return getToken(temp.NEW, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(temp.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(temp.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(temp.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(temp.RBRACK, i);
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
		enterRule(_localctx, 54, RULE_primaryExp);
		int _la;
		try {
			setState(316);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(292);
				match(TRUE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(293);
				match(FALSE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(294);
				match(NULL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(295);
				match(INTLIT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(296);
				match(FLOATLIT);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(297);
				match(CHARLIT);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(298);
				match(STRINGLIT);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(299);
				lvalue(0);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(300);
				match(LPAREN);
				setState(301);
				exp();
				setState(302);
				match(RPAREN);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(304);
				match(NEW);
				setState(305);
				type();
				setState(312);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(306);
					match(LBRACK);
					setState(307);
					exp();
					setState(308);
					match(RBRACK);
					}
					}
					setState(314);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(315);
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
		public TerminalNode ID() { return getToken(temp.ID, 0); }
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode LBRACK() { return getToken(temp.LBRACK, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(temp.RBRACK, 0); }
		public TerminalNode DOT() { return getToken(temp.DOT, 0); }
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
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_lvalue, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(319);
			match(ID);
			}
			_ctx.stop = _input.LT(-1);
			setState(331);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(329);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
						_localctx = new LvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_lvalue);
						setState(321);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(322);
						match(LBRACK);
						setState(323);
						exp();
						setState(324);
						match(RBRACK);
						}
						break;
					case 2:
						{
						_localctx = new LvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_lvalue);
						setState(326);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(327);
						match(DOT);
						setState(328);
						match(ID);
						}
						break;
					}
					} 
				}
				setState(333);
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
		public List<TerminalNode> COMMA() { return getTokens(temp.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(temp.COMMA, i);
		}
		public ExpsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exps; }
	}

	public final ExpsContext exps() throws RecognitionException {
		ExpsContext _localctx = new ExpsContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_exps);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			exp();
			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(335);
				match(COMMA);
				setState(336);
				exp();
				}
				}
				setState(341);
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
		case 28:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\65\u0159\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3I\n\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4Q\n"+
		"\4\3\5\3\5\3\5\3\5\7\5W\n\5\f\5\16\5Z\13\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\5\7h\n\7\3\7\3\7\3\7\3\7\3\7\7\7o\n\7\f\7\16\7r\13"+
		"\7\5\7t\n\7\3\7\3\7\7\7x\n\7\f\7\16\7{\13\7\3\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\7\b\u0087\n\b\f\b\16\b\u008a\13\b\3\b\3\b\3\t\3\t\3\t\5"+
		"\t\u0091\n\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u009d"+
		"\n\13\3\f\3\f\7\f\u00a1\n\f\f\f\16\f\u00a4\13\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\5\r\u00af\n\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\7\21\u00c5\n\21"+
		"\f\21\16\21\u00c8\13\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3"+
		"\23\5\23\u00d4\n\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\5\24\u00de"+
		"\n\24\3\24\3\24\3\24\3\24\3\24\7\24\u00e5\n\24\f\24\16\24\u00e8\13\24"+
		"\3\24\3\24\5\24\u00ec\n\24\3\24\3\24\3\25\3\25\3\26\3\26\3\26\7\26\u00f5"+
		"\n\26\f\26\16\26\u00f8\13\26\3\27\3\27\3\27\7\27\u00fd\n\27\f\27\16\27"+
		"\u0100\13\27\3\30\3\30\3\30\7\30\u0105\n\30\f\30\16\30\u0108\13\30\3\31"+
		"\3\31\3\31\7\31\u010d\n\31\f\31\16\31\u0110\13\31\3\32\3\32\3\32\7\32"+
		"\u0115\n\32\f\32\16\32\u0118\13\32\3\33\3\33\3\33\7\33\u011d\n\33\f\33"+
		"\16\33\u0120\13\33\3\34\3\34\3\34\5\34\u0125\n\34\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\7\35\u0139\n\35\f\35\16\35\u013c\13\35\3\35\5\35\u013f\n\35\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u014c\n\36\f\36\16"+
		"\36\u014f\13\36\3\37\3\37\3\37\7\37\u0154\n\37\f\37\16\37\u0157\13\37"+
		"\3\37\2\3: \2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<\2\b\4\2\t\r..\3\2&\'\3\2(+\3\2\36\37\3\2 \"\4\2\37\37%%\2\u0166\2"+
		">\3\2\2\2\4H\3\2\2\2\6P\3\2\2\2\bR\3\2\2\2\n^\3\2\2\2\fd\3\2\2\2\16\177"+
		"\3\2\2\2\20\u008d\3\2\2\2\22\u0092\3\2\2\2\24\u009c\3\2\2\2\26\u009e\3"+
		"\2\2\2\30\u00a7\3\2\2\2\32\u00b2\3\2\2\2\34\u00b8\3\2\2\2\36\u00bc\3\2"+
		"\2\2 \u00c0\3\2\2\2\"\u00cb\3\2\2\2$\u00d0\3\2\2\2&\u00da\3\2\2\2(\u00ef"+
		"\3\2\2\2*\u00f1\3\2\2\2,\u00f9\3\2\2\2.\u0101\3\2\2\2\60\u0109\3\2\2\2"+
		"\62\u0111\3\2\2\2\64\u0119\3\2\2\2\66\u0124\3\2\2\28\u013e\3\2\2\2:\u0140"+
		"\3\2\2\2<\u0150\3\2\2\2>?\5\4\3\2?@\b\2\1\2@\3\3\2\2\2AB\5\6\4\2BC\5\4"+
		"\3\2CD\b\3\1\2DI\3\2\2\2EF\5\6\4\2FG\b\3\1\2GI\3\2\2\2HA\3\2\2\2HE\3\2"+
		"\2\2I\5\3\2\2\2JK\5\b\5\2KL\b\4\1\2LQ\3\2\2\2MN\5\f\7\2NO\b\4\1\2OQ\3"+
		"\2\2\2PJ\3\2\2\2PM\3\2\2\2Q\7\3\2\2\2RS\7\21\2\2ST\7.\2\2TX\7\25\2\2U"+
		"W\5\n\6\2VU\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y[\3\2\2\2ZX\3\2\2\2"+
		"[\\\7\26\2\2\\]\b\5\1\2]\t\3\2\2\2^_\7-\2\2_`\7\34\2\2`a\5\20\t\2ab\7"+
		"\31\2\2bc\b\6\1\2c\13\3\2\2\2de\7-\2\2eg\7\24\2\2fh\5\16\b\2gf\3\2\2\2"+
		"gh\3\2\2\2hi\3\2\2\2is\7\23\2\2jk\7\35\2\2kp\5\20\t\2lm\7\32\2\2mo\5\20"+
		"\t\2nl\3\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2qt\3\2\2\2rp\3\2\2\2sj\3\2"+
		"\2\2st\3\2\2\2tu\3\2\2\2uy\7\25\2\2vx\5\24\13\2wv\3\2\2\2x{\3\2\2\2yw"+
		"\3\2\2\2yz\3\2\2\2z|\3\2\2\2{y\3\2\2\2|}\7\26\2\2}~\b\7\1\2~\r\3\2\2\2"+
		"\177\u0080\7-\2\2\u0080\u0081\7\34\2\2\u0081\u0088\5\20\t\2\u0082\u0083"+
		"\7\32\2\2\u0083\u0084\7-\2\2\u0084\u0085\7\34\2\2\u0085\u0087\5\20\t\2"+
		"\u0086\u0082\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089"+
		"\3\2\2\2\u0089\u008b\3\2\2\2\u008a\u0088\3\2\2\2\u008b\u008c\b\b\1\2\u008c"+
		"\17\3\2\2\2\u008d\u0090\5\22\n\2\u008e\u008f\7\27\2\2\u008f\u0091\7\30"+
		"\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\21\3\2\2\2\u0092\u0093"+
		"\t\2\2\2\u0093\23\3\2\2\2\u0094\u009d\5\26\f\2\u0095\u009d\5\30\r\2\u0096"+
		"\u009d\5\32\16\2\u0097\u009d\5\34\17\2\u0098\u009d\5\36\20\2\u0099\u009d"+
		"\5 \21\2\u009a\u009d\5\"\22\2\u009b\u009d\5&\24\2\u009c\u0094\3\2\2\2"+
		"\u009c\u0095\3\2\2\2\u009c\u0096\3\2\2\2\u009c\u0097\3\2\2\2\u009c\u0098"+
		"\3\2\2\2\u009c\u0099\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009b\3\2\2\2\u009d"+
		"\25\3\2\2\2\u009e\u00a2\7\25\2\2\u009f\u00a1\5\24\13\2\u00a0\u009f\3\2"+
		"\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3"+
		"\u00a5\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a6\7\26\2\2\u00a6\27\3\2\2"+
		"\2\u00a7\u00a8\7\3\2\2\u00a8\u00a9\7\24\2\2\u00a9\u00aa\5(\25\2\u00aa"+
		"\u00ab\7\23\2\2\u00ab\u00ae\5\24\13\2\u00ac\u00ad\7\4\2\2\u00ad\u00af"+
		"\5\24\13\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\3\2\2\2"+
		"\u00b0\u00b1\b\r\1\2\u00b1\31\3\2\2\2\u00b2\u00b3\7\7\2\2\u00b3\u00b4"+
		"\7\24\2\2\u00b4\u00b5\5(\25\2\u00b5\u00b6\7\23\2\2\u00b6\u00b7\5\24\13"+
		"\2\u00b7\33\3\2\2\2\u00b8\u00b9\7\22\2\2\u00b9\u00ba\5:\36\2\u00ba\u00bb"+
		"\7\31\2\2\u00bb\35\3\2\2\2\u00bc\u00bd\7\6\2\2\u00bd\u00be\5(\25\2\u00be"+
		"\u00bf\7\31\2\2\u00bf\37\3\2\2\2\u00c0\u00c1\7\b\2\2\u00c1\u00c6\5(\25"+
		"\2\u00c2\u00c3\7\32\2\2\u00c3\u00c5\5(\25\2\u00c4\u00c2\3\2\2\2\u00c5"+
		"\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c9\3\2"+
		"\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00ca\7\31\2\2\u00ca!\3\2\2\2\u00cb\u00cc"+
		"\5:\36\2\u00cc\u00cd\7,\2\2\u00cd\u00ce\5(\25\2\u00ce\u00cf\7\31\2\2\u00cf"+
		"#\3\2\2\2\u00d0\u00d1\7-\2\2\u00d1\u00d3\7\24\2\2\u00d2\u00d4\5<\37\2"+
		"\u00d3\u00d2\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6"+
		"\7\23\2\2\u00d6\u00d7\7\27\2\2\u00d7\u00d8\5(\25\2\u00d8\u00d9\7\30\2"+
		"\2\u00d9%\3\2\2\2\u00da\u00db\7-\2\2\u00db\u00dd\7\24\2\2\u00dc\u00de"+
		"\5<\37\2\u00dd\u00dc\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00df\3\2\2\2\u00df"+
		"\u00eb\7\23\2\2\u00e0\u00e1\7(\2\2\u00e1\u00e6\5:\36\2\u00e2\u00e3\7\32"+
		"\2\2\u00e3\u00e5\5:\36\2\u00e4\u00e2\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6"+
		"\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e9\3\2\2\2\u00e8\u00e6\3\2"+
		"\2\2\u00e9\u00ea\7)\2\2\u00ea\u00ec\3\2\2\2\u00eb\u00e0\3\2\2\2\u00eb"+
		"\u00ec\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ee\7\31\2\2\u00ee\'\3\2\2"+
		"\2\u00ef\u00f0\5*\26\2\u00f0)\3\2\2\2\u00f1\u00f6\5,\27\2\u00f2\u00f3"+
		"\7$\2\2\u00f3\u00f5\5,\27\2\u00f4\u00f2\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6"+
		"\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7+\3\2\2\2\u00f8\u00f6\3\2\2\2"+
		"\u00f9\u00fe\5.\30\2\u00fa\u00fb\7#\2\2\u00fb\u00fd\5.\30\2\u00fc\u00fa"+
		"\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff"+
		"-\3\2\2\2\u0100\u00fe\3\2\2\2\u0101\u0106\5\60\31\2\u0102\u0103\t\3\2"+
		"\2\u0103\u0105\5\60\31\2\u0104\u0102\3\2\2\2\u0105\u0108\3\2\2\2\u0106"+
		"\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107/\3\2\2\2\u0108\u0106\3\2\2\2"+
		"\u0109\u010e\5\62\32\2\u010a\u010b\t\4\2\2\u010b\u010d\5\62\32\2\u010c"+
		"\u010a\3\2\2\2\u010d\u0110\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2"+
		"\2\2\u010f\61\3\2\2\2\u0110\u010e\3\2\2\2\u0111\u0116\5\64\33\2\u0112"+
		"\u0113\t\5\2\2\u0113\u0115\5\64\33\2\u0114\u0112\3\2\2\2\u0115\u0118\3"+
		"\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117\63\3\2\2\2\u0118"+
		"\u0116\3\2\2\2\u0119\u011e\5\66\34\2\u011a\u011b\t\6\2\2\u011b\u011d\5"+
		"\66\34\2\u011c\u011a\3\2\2\2\u011d\u0120\3\2\2\2\u011e\u011c\3\2\2\2\u011e"+
		"\u011f\3\2\2\2\u011f\65\3\2\2\2\u0120\u011e\3\2\2\2\u0121\u0122\t\7\2"+
		"\2\u0122\u0125\5\66\34\2\u0123\u0125\58\35\2\u0124\u0121\3\2\2\2\u0124"+
		"\u0123\3\2\2\2\u0125\67\3\2\2\2\u0126\u013f\7\16\2\2\u0127\u013f\7\17"+
		"\2\2\u0128\u013f\7\20\2\2\u0129\u013f\7/\2\2\u012a\u013f\7\60\2\2\u012b"+
		"\u013f\7\61\2\2\u012c\u013f\7\62\2\2\u012d\u013f\5:\36\2\u012e\u012f\7"+
		"\24\2\2\u012f\u0130\5(\25\2\u0130\u0131\7\23\2\2\u0131\u013f\3\2\2\2\u0132"+
		"\u0133\7\5\2\2\u0133\u013a\5\20\t\2\u0134\u0135\7\27\2\2\u0135\u0136\5"+
		"(\25\2\u0136\u0137\7\30\2\2\u0137\u0139\3\2\2\2\u0138\u0134\3\2\2\2\u0139"+
		"\u013c\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013f\3\2"+
		"\2\2\u013c\u013a\3\2\2\2\u013d\u013f\5$\23\2\u013e\u0126\3\2\2\2\u013e"+
		"\u0127\3\2\2\2\u013e\u0128\3\2\2\2\u013e\u0129\3\2\2\2\u013e\u012a\3\2"+
		"\2\2\u013e\u012b\3\2\2\2\u013e\u012c\3\2\2\2\u013e\u012d\3\2\2\2\u013e"+
		"\u012e\3\2\2\2\u013e\u0132\3\2\2\2\u013e\u013d\3\2\2\2\u013f9\3\2\2\2"+
		"\u0140\u0141\b\36\1\2\u0141\u0142\7-\2\2\u0142\u014d\3\2\2\2\u0143\u0144"+
		"\f\4\2\2\u0144\u0145\7\27\2\2\u0145\u0146\5(\25\2\u0146\u0147\7\30\2\2"+
		"\u0147\u014c\3\2\2\2\u0148\u0149\f\3\2\2\u0149\u014a\7\33\2\2\u014a\u014c"+
		"\7-\2\2\u014b\u0143\3\2\2\2\u014b\u0148\3\2\2\2\u014c\u014f\3\2\2\2\u014d"+
		"\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e;\3\2\2\2\u014f\u014d\3\2\2\2"+
		"\u0150\u0155\5(\25\2\u0151\u0152\7\32\2\2\u0152\u0154\5(\25\2\u0153\u0151"+
		"\3\2\2\2\u0154\u0157\3\2\2\2\u0155\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156"+
		"=\3\2\2\2\u0157\u0155\3\2\2\2\37HPXgpsy\u0088\u0090\u009c\u00a2\u00ae"+
		"\u00c6\u00d3\u00dd\u00e6\u00eb\u00f6\u00fe\u0106\u010e\u0116\u011e\u0124"+
		"\u013a\u013e\u014b\u014d\u0155";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}