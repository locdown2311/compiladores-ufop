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
		RULE_func = 5, RULE_mrets = 6, RULE_rets = 7, RULE_params = 8, RULE_type = 9, 
		RULE_btype = 10, RULE_cmdList = 11, RULE_cmd = 12, RULE_block = 13, RULE_ifCmd = 14, 
		RULE_iterateCmd = 15, RULE_readCmd = 16, RULE_printCmd = 17, RULE_returnList = 18, 
		RULE_returnCmd = 19, RULE_assignCmd = 20, RULE_funcCallCmd = 21, RULE_exp = 22, 
		RULE_logicalOrExp = 23, RULE_logicalAndExp = 24, RULE_equalityExp = 25, 
		RULE_relationalExp = 26, RULE_additiveExp = 27, RULE_multiplicativeExp = 28, 
		RULE_unaryExp = 29, RULE_primaryExp = 30, RULE_lvalue = 31, RULE_exps = 32;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "defList", "def", "data", "decl", "func", "mrets", "rets", "params", 
			"type", "btype", "cmdList", "cmd", "block", "ifCmd", "iterateCmd", "readCmd", 
			"printCmd", "returnList", "returnCmd", "assignCmd", "funcCallCmd", "exp", 
			"logicalOrExp", "logicalAndExp", "equalityExp", "relationalExp", "additiveExp", 
			"multiplicativeExp", "unaryExp", "primaryExp", "lvalue", "exps"
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
			setState(66);
			((ProgContext)_localctx).e = defList();
			 
			        List<CFuncDef> defs = ((ProgContext)_localctx).e.df != null ? ((ProgContext)_localctx).e.df : new ArrayList<>();
			        ((ProgContext)_localctx).c =  new CProg(defs.toArray(new CFuncDef[defs.size()]));
			    
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
			setState(75);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DATA:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				 ((DefListContext)_localctx).df =  new ArrayList<CFuncDef>(); 
				setState(70);
				((DefListContext)_localctx).d = def();
				setState(71);
				((DefListContext)_localctx).defList = defList();
				 _localctx.df.add(((DefListContext)_localctx).d.d); _localctx.df.addAll(((DefListContext)_localctx).defList.df); 
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				 ((DefListContext)_localctx).df =  new ArrayList<CFuncDef>(); 
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

	public static class DefContext extends ParserRuleContext {
		public CFuncDef d;
		public DataContext data;
		public FuncContext func;
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
			setState(83);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DATA:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				((DefContext)_localctx).data = data();
				((DefContext)_localctx).d =  ((DefContext)_localctx).data.d; 
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				((DefContext)_localctx).func = func();
				((DefContext)_localctx).d =  ((DefContext)_localctx).func.d; 
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
		public CFuncDef d;
		public Token typeName;
		public DeclContext decls;
		public TerminalNode DATA() { return getToken(LangParser.DATA, 0); }
		public TerminalNode LBRACE() { return getToken(LangParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(LangParser.RBRACE, 0); }
		public TerminalNode TYPE() { return getToken(LangParser.TYPE, 0); }
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
			setState(85);
			match(DATA);
			setState(86);
			((DataContext)_localctx).typeName = match(TYPE);
			setState(87);
			match(LBRACE);
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(88);
				((DataContext)_localctx).decls = decl();
				}
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(94);
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

	public static class DeclContext extends ParserRuleContext {
		public CVarDec decla;
		public Token id;
		public TypeContext t;
		public TerminalNode DOUBLE_COLON() { return getToken(LangParser.DOUBLE_COLON, 0); }
		public TerminalNode SEMICOLON() { return getToken(LangParser.SEMICOLON, 0); }
		public TerminalNode ID() { return getToken(LangParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
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
			setState(97);
			((DeclContext)_localctx).id = match(ID);
			setState(98);
			match(DOUBLE_COLON);
			setState(99);
			((DeclContext)_localctx).t = type();
			setState(100);
			match(SEMICOLON);

			          ((DeclContext)_localctx).decla =  new CVarDec((((DeclContext)_localctx).id!=null?((DeclContext)_localctx).id.getText():null), ((DeclContext)_localctx).t.t);
			      
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
		public CFuncDef d;
		public Token id;
		public ParamsContext p;
		public MretsContext mrets;
		public CmdContext cmd;
		public TerminalNode LPAREN() { return getToken(LangParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(LangParser.RPAREN, 0); }
		public TerminalNode COLON() { return getToken(LangParser.COLON, 0); }
		public MretsContext mrets() {
			return getRuleContext(MretsContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(LangParser.LBRACE, 0); }
		public CmdContext cmd() {
			return getRuleContext(CmdContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(LangParser.RBRACE, 0); }
		public TerminalNode ID() { return getToken(LangParser.ID, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
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
			setState(103);
			((FuncContext)_localctx).id = match(ID);
			setState(104);
			match(LPAREN);
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(105);
				((FuncContext)_localctx).p = params();
				}
			}

			setState(108);
			match(RPAREN);
			setState(109);
			match(COLON);
			setState(110);
			((FuncContext)_localctx).mrets = mrets();
			setState(111);
			match(LBRACE);
			setState(112);
			((FuncContext)_localctx).cmd = cmd();
			setState(113);
			match(RBRACE);

			       ((FuncContext)_localctx).d =  new CFuncDef((((FuncContext)_localctx).id!=null?((FuncContext)_localctx).id.getText():null), (CVarDec[])((FuncContext)_localctx).p.paramList.toArray(), (CType[])((FuncContext)_localctx).mrets.retList.toArray(), ((FuncContext)_localctx).cmd.c );
			    
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

	public static class MretsContext extends ParserRuleContext {
		public ArrayList<CType> retList;
		public RetsContext rets;
		public RetsContext rets() {
			return getRuleContext(RetsContext.class,0);
		}
		public MretsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mrets; }
	}

	public final MretsContext mrets() throws RecognitionException {
		MretsContext _localctx = new MretsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_mrets);
		try {
			setState(120);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
			case CHAR:
			case BOOLEAN:
			case VOID:
			case TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				((MretsContext)_localctx).rets = rets();
				 ((MretsContext)_localctx).retList =  ((MretsContext)_localctx).rets.retList; 
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				 ((MretsContext)_localctx).retList =  new ArrayList<CType>();
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

	public static class RetsContext extends ParserRuleContext {
		public ArrayList<CType> retList;
		public TypeContext type;
		public RetsContext rets;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(LangParser.COMMA, 0); }
		public RetsContext rets() {
			return getRuleContext(RetsContext.class,0);
		}
		public RetsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rets; }
	}

	public final RetsContext rets() throws RecognitionException {
		RetsContext _localctx = new RetsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_rets);
		try {
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				type();
				 ((RetsContext)_localctx).retList =  new ArrayList<CType>(); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				((RetsContext)_localctx).type = type();
				setState(126);
				match(COMMA);
				setState(127);
				((RetsContext)_localctx).rets = rets();
				 ((RetsContext)_localctx).rets.retList.add(((RetsContext)_localctx).type.t); 
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

	public static class ParamsContext extends ParserRuleContext {
		public ArrayList<CVarDec> paramList;
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
		enterRule(_localctx, 16, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((ParamsContext)_localctx).paramList =  new ArrayList<CVarDec>(); 
			setState(133);
			((ParamsContext)_localctx).ID = match(ID);
			setState(134);
			match(DOUBLE_COLON);
			setState(135);
			((ParamsContext)_localctx).type = type();
			 
			        _localctx.paramList.add(new CVarDec((((ParamsContext)_localctx).ID!=null?((ParamsContext)_localctx).ID.getText():null), ((ParamsContext)_localctx).type.t)); 
			    
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(137);
				match(COMMA);
				setState(138);
				((ParamsContext)_localctx).ID = match(ID);
				setState(139);
				match(DOUBLE_COLON);
				setState(140);
				((ParamsContext)_localctx).type = type();
				_localctx.paramList.add(new CVarDec((((ParamsContext)_localctx).ID!=null?((ParamsContext)_localctx).ID.getText():null), ((ParamsContext)_localctx).type.t));  
				}
				}
				setState(147);
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

	public static class TypeContext extends ParserRuleContext {
		public CType t;
		public BtypeContext btype;
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
		enterRule(_localctx, 18, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			((TypeContext)_localctx).btype = btype();
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(149);
				match(LBRACK);
				setState(150);
				match(RBRACK);
				}
				break;
			}

			         ((TypeContext)_localctx).t =  new CType(((TypeContext)_localctx).btype.base);
			     
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
		public CBaseType base;
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
		enterRule(_localctx, 20, RULE_btype);
		try {
			setState(167);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				match(INT);
				 ((BtypeContext)_localctx).base =  CBaseType.INT; 
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				match(CHAR);
				 ((BtypeContext)_localctx).base =  CBaseType.CHAR; 
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 3);
				{
				setState(159);
				match(BOOLEAN);
				 ((BtypeContext)_localctx).base =  CBaseType.BOOL; 
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 4);
				{
				setState(161);
				match(FLOAT);
				 ((BtypeContext)_localctx).base =  CBaseType.FLOAT; 
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 5);
				{
				setState(163);
				match(VOID);
				 ((BtypeContext)_localctx).base =  CBaseType.VOID; 
				}
				break;
			case TYPE:
				enterOuterAlt(_localctx, 6);
				{
				setState(165);
				match(TYPE);
				 ((BtypeContext)_localctx).base =  CBaseType.TYPE; 
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

	public static class CmdListContext extends ParserRuleContext {
		public ArrayList<CNode> arrc;
		public CmdContext cmd;
		public CmdListContext cmdList;
		public CmdContext cmd() {
			return getRuleContext(CmdContext.class,0);
		}
		public CmdListContext cmdList() {
			return getRuleContext(CmdListContext.class,0);
		}
		public CmdListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdList; }
	}

	public final CmdListContext cmdList() throws RecognitionException {
		CmdListContext _localctx = new CmdListContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_cmdList);
		try {
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				((CmdListContext)_localctx).cmd = cmd();
				setState(170);
				((CmdListContext)_localctx).cmdList = cmdList();
				 ((CmdListContext)_localctx).cmdList.arrc.add(((CmdListContext)_localctx).cmd.c);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				((CmdListContext)_localctx).cmd = cmd();
				 ((CmdListContext)_localctx).arrc =  new ArrayList<CNode>();
				          _localctx.arrc.add(((CmdListContext)_localctx).cmd.c);
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

	public static class CmdContext extends ParserRuleContext {
		public CNode c;
		public BlockContext block;
		public IfCmdContext ifCmd;
		public IterateCmdContext iterateCmd;
		public ReadCmdContext readCmd;
		public PrintCmdContext printCmd;
		public ReturnCmdContext returnCmd;
		public AssignCmdContext assignCmd;
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IfCmdContext ifCmd() {
			return getRuleContext(IfCmdContext.class,0);
		}
		public IterateCmdContext iterateCmd() {
			return getRuleContext(IterateCmdContext.class,0);
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
		enterRule(_localctx, 24, RULE_cmd);
		try {
			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				((CmdContext)_localctx).block = block();
				 ((CmdContext)_localctx).c =  ((CmdContext)_localctx).block.c; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				((CmdContext)_localctx).ifCmd = ifCmd();
				 ((CmdContext)_localctx).c =  ((CmdContext)_localctx).ifCmd.c; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(184);
				((CmdContext)_localctx).iterateCmd = iterateCmd();
				 ((CmdContext)_localctx).c =  ((CmdContext)_localctx).iterateCmd.c; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(187);
				((CmdContext)_localctx).readCmd = readCmd();
				 ((CmdContext)_localctx).c =  ((CmdContext)_localctx).readCmd.c; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(190);
				((CmdContext)_localctx).printCmd = printCmd();
				 ((CmdContext)_localctx).c =  ((CmdContext)_localctx).printCmd.c; 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(193);
				((CmdContext)_localctx).returnCmd = returnCmd();
				 ((CmdContext)_localctx).c =  ((CmdContext)_localctx).returnCmd.c; 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(196);
				((CmdContext)_localctx).assignCmd = assignCmd();
				 ((CmdContext)_localctx).c =  ((CmdContext)_localctx).assignCmd.c; 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(199);
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
		public CBlock c;
		public CmdListContext cmdList;
		public TerminalNode LBRACE() { return getToken(LangParser.LBRACE, 0); }
		public CmdListContext cmdList() {
			return getRuleContext(CmdListContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(LangParser.RBRACE, 0); }
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(LBRACE);
			setState(203);
			((BlockContext)_localctx).cmdList = cmdList();
			setState(204);
			match(RBRACE);

			        CNode[] temp = (CNode[]) ((BlockContext)_localctx).cmdList.arrc.toArray();
			        ((BlockContext)_localctx).c =  new CBlock(temp);
			    
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
		public CNode c;
		public ExpContext e;
		public CmdContext thenCmd;
		public Token ELSE;
		public CmdContext elseCmd;
		public TerminalNode IF() { return getToken(LangParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(LangParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(LangParser.RPAREN, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
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
		enterRule(_localctx, 28, RULE_ifCmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(IF);
			setState(208);
			match(LPAREN);
			setState(209);
			((IfCmdContext)_localctx).e = exp();
			setState(210);
			match(RPAREN);
			setState(211);
			((IfCmdContext)_localctx).thenCmd = cmd();
			setState(214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(212);
				((IfCmdContext)_localctx).ELSE = match(ELSE);
				setState(213);
				((IfCmdContext)_localctx).elseCmd = cmd();
				}
				break;
			}

			      ((IfCmdContext)_localctx).c =  new CIfthen(((IfCmdContext)_localctx).e.expr, ((IfCmdContext)_localctx).thenCmd.c, ((IfCmdContext)_localctx).ELSE != null ? ((IfCmdContext)_localctx).elseCmd.c : null);
			   
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

	public static class IterateCmdContext extends ParserRuleContext {
		public CNode c;
		public ExpContext e;
		public CmdContext body;
		public TerminalNode ITERATE() { return getToken(LangParser.ITERATE, 0); }
		public TerminalNode LPAREN() { return getToken(LangParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(LangParser.RPAREN, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public CmdContext cmd() {
			return getRuleContext(CmdContext.class,0);
		}
		public IterateCmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterateCmd; }
	}

	public final IterateCmdContext iterateCmd() throws RecognitionException {
		IterateCmdContext _localctx = new IterateCmdContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_iterateCmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(ITERATE);
			setState(219);
			match(LPAREN);
			setState(220);
			((IterateCmdContext)_localctx).e = exp();
			setState(221);
			match(RPAREN);
			setState(222);
			((IterateCmdContext)_localctx).body = cmd();

			      ((IterateCmdContext)_localctx).c =  new CLoop(((IterateCmdContext)_localctx).e.expr, ((IterateCmdContext)_localctx).body.c);
			   
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
		public CNode c;
		public LvalueContext l;
		public TerminalNode READ() { return getToken(LangParser.READ, 0); }
		public TerminalNode SEMICOLON() { return getToken(LangParser.SEMICOLON, 0); }
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public ReadCmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readCmd; }
	}

	public final ReadCmdContext readCmd() throws RecognitionException {
		ReadCmdContext _localctx = new ReadCmdContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_readCmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(READ);
			setState(226);
			((ReadCmdContext)_localctx).l = lvalue(0);
			setState(227);
			match(SEMICOLON);

			       ((ReadCmdContext)_localctx).c =  new CRead(((ReadCmdContext)_localctx).l.lval);
			   
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
		public CNode c;
		public ExpContext e;
		public TerminalNode PRINT() { return getToken(LangParser.PRINT, 0); }
		public TerminalNode SEMICOLON() { return getToken(LangParser.SEMICOLON, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public PrintCmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printCmd; }
	}

	public final PrintCmdContext printCmd() throws RecognitionException {
		PrintCmdContext _localctx = new PrintCmdContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_printCmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(PRINT);
			setState(231);
			((PrintCmdContext)_localctx).e = exp();
			setState(232);
			match(SEMICOLON);

			      ((PrintCmdContext)_localctx).c =  new Print(((PrintCmdContext)_localctx).e.expr);
			   
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

	public static class ReturnListContext extends ParserRuleContext {
		public ArrayList<Exp> arret;
		public PrimaryExpContext primaryExp;
		public ReturnListContext returnList;
		public PrimaryExpContext primaryExp() {
			return getRuleContext(PrimaryExpContext.class,0);
		}
		public ReturnListContext returnList() {
			return getRuleContext(ReturnListContext.class,0);
		}
		public ReturnListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnList; }
	}

	public final ReturnListContext returnList() throws RecognitionException {
		ReturnListContext _localctx = new ReturnListContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_returnList);
		try {
			setState(242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(235);
				((ReturnListContext)_localctx).primaryExp = primaryExp();
				setState(236);
				((ReturnListContext)_localctx).returnList = returnList();
				 ((ReturnListContext)_localctx).returnList.arret.add(((ReturnListContext)_localctx).primaryExp.expr);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(239);
				((ReturnListContext)_localctx).primaryExp = primaryExp();
				 ((ReturnListContext)_localctx).arret =  new ArrayList<Exp>();
				                 _localctx.arret.add(((ReturnListContext)_localctx).primaryExp.expr);
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

	public static class ReturnCmdContext extends ParserRuleContext {
		public CNode c;
		public ExpContext e;
		public ReturnListContext returnList;
		public TerminalNode RETURN() { return getToken(LangParser.RETURN, 0); }
		public TerminalNode SEMICOLON() { return getToken(LangParser.SEMICOLON, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(LangParser.COMMA, 0); }
		public ReturnListContext returnList() {
			return getRuleContext(ReturnListContext.class,0);
		}
		public ReturnCmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnCmd; }
	}

	public final ReturnCmdContext returnCmd() throws RecognitionException {
		ReturnCmdContext _localctx = new ReturnCmdContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_returnCmd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(RETURN);
			setState(245);
			((ReturnCmdContext)_localctx).e = exp();
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(246);
				match(COMMA);
				setState(247);
				((ReturnCmdContext)_localctx).returnList = returnList();
				}
			}

			setState(250);
			match(SEMICOLON);

			      ((ReturnCmdContext)_localctx).c =  new CRet(((ReturnCmdContext)_localctx).returnList.arret);
			   
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
		public CNode c;
		public LvalueContext l;
		public ExpContext e;
		public TerminalNode ATTR() { return getToken(LangParser.ATTR, 0); }
		public TerminalNode SEMICOLON() { return getToken(LangParser.SEMICOLON, 0); }
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public AssignCmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignCmd; }
	}

	public final AssignCmdContext assignCmd() throws RecognitionException {
		AssignCmdContext _localctx = new AssignCmdContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_assignCmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			((AssignCmdContext)_localctx).l = lvalue(0);
			setState(254);
			match(ATTR);
			setState(255);
			((AssignCmdContext)_localctx).e = exp();
			setState(256);
			match(SEMICOLON);

			        ((AssignCmdContext)_localctx).c =  new CAttr((Var)((AssignCmdContext)_localctx).l.lval, (Exp)((AssignCmdContext)_localctx).e.expr);
			    
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
		public CNode c;
		public Token id;
		public ExpsContext args;
		public LvalueContext lvalue;
		public List<LvalueContext> outArgs = new ArrayList<LvalueContext>();
		public TerminalNode LPAREN() { return getToken(LangParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(LangParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(LangParser.SEMICOLON, 0); }
		public TerminalNode ID() { return getToken(LangParser.ID, 0); }
		public TerminalNode LESS_THAN() { return getToken(LangParser.LESS_THAN, 0); }
		public TerminalNode GREATER_THAN() { return getToken(LangParser.GREATER_THAN, 0); }
		public ExpsContext exps() {
			return getRuleContext(ExpsContext.class,0);
		}
		public List<LvalueContext> lvalue() {
			return getRuleContexts(LvalueContext.class);
		}
		public LvalueContext lvalue(int i) {
			return getRuleContext(LvalueContext.class,i);
		}
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
		enterRule(_localctx, 42, RULE_funcCallCmd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			((FuncCallCmdContext)_localctx).id = match(ID);
			setState(260);
			match(LPAREN);
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << MINUS) | (1L << LOGICAL_NOT) | (1L << ID) | (1L << INTLIT) | (1L << FLOATLIT) | (1L << CHARLIT) | (1L << STRINGLIT))) != 0)) {
				{
				setState(261);
				((FuncCallCmdContext)_localctx).args = exps();
				}
			}

			setState(264);
			match(RPAREN);
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LESS_THAN) {
				{
				setState(265);
				match(LESS_THAN);
				setState(266);
				((FuncCallCmdContext)_localctx).lvalue = lvalue(0);
				((FuncCallCmdContext)_localctx).outArgs.add(((FuncCallCmdContext)_localctx).lvalue);
				setState(271);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(267);
					match(COMMA);
					setState(268);
					((FuncCallCmdContext)_localctx).lvalue = lvalue(0);
					((FuncCallCmdContext)_localctx).outArgs.add(((FuncCallCmdContext)_localctx).lvalue);
					}
					}
					setState(273);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(274);
				match(GREATER_THAN);
				}
			}

			setState(278);
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
		public Exp expr;
		public LogicalOrExpContext e;
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
		enterRule(_localctx, 44, RULE_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			((ExpContext)_localctx).e = logicalOrExp();
			 ((ExpContext)_localctx).expr =  ((ExpContext)_localctx).e.expr; 
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
		public Exp expr;
		public LogicalAndExpContext e1;
		public LogicalAndExpContext e2;
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
		enterRule(_localctx, 46, RULE_logicalOrExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			((LogicalOrExpContext)_localctx).e1 = logicalAndExp();
			 ((LogicalOrExpContext)_localctx).expr =  ((LogicalOrExpContext)_localctx).e1.expr; 
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LOGICAL_OR) {
				{
				{
				setState(286);
				match(LOGICAL_OR);
				setState(287);
				((LogicalOrExpContext)_localctx).e2 = logicalAndExp();
				 ((LogicalOrExpContext)_localctx).expr =  new Or(_localctx.expr, ((LogicalOrExpContext)_localctx).e2.expr); 
				}
				}
				setState(294);
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
		public Exp expr;
		public EqualityExpContext e1;
		public EqualityExpContext e2;
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
		enterRule(_localctx, 48, RULE_logicalAndExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			((LogicalAndExpContext)_localctx).e1 = equalityExp();
			 ((LogicalAndExpContext)_localctx).expr =  ((LogicalAndExpContext)_localctx).e1.expr; 
			setState(303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LOGICAL_AND) {
				{
				{
				setState(297);
				match(LOGICAL_AND);
				setState(298);
				((LogicalAndExpContext)_localctx).e2 = equalityExp();
				 ((LogicalAndExpContext)_localctx).expr =  new And(_localctx.expr, ((LogicalAndExpContext)_localctx).e2.expr); 
				}
				}
				setState(305);
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
		public Exp expr;
		public RelationalExpContext e1;
		public Token EQUALS;
		public RelationalExpContext e2;
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
		enterRule(_localctx, 50, RULE_equalityExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			((EqualityExpContext)_localctx).e1 = relationalExp();
			 ((EqualityExpContext)_localctx).expr =  ((EqualityExpContext)_localctx).e1.expr; 
			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQUALS || _la==NOT_EQUALS) {
				{
				{
				setState(308);
				_la = _input.LA(1);
				if ( !(_la==EQUALS || _la==NOT_EQUALS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(309);
				((EqualityExpContext)_localctx).e2 = relationalExp();
				 
				        if (((EqualityExpContext)_localctx).EQUALS != null) {
				            ((EqualityExpContext)_localctx).expr =  new Eq(_localctx.expr, ((EqualityExpContext)_localctx).e2.expr);
				        } else {
				            ((EqualityExpContext)_localctx).expr =  new Ne(_localctx.expr, ((EqualityExpContext)_localctx).e2.expr);
				        }
				     
				}
				}
				setState(316);
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
		public Exp expr;
		public AdditiveExpContext e1;
		public Token LESS_THAN;
		public Token GREATER_THAN;
		public Token LESS_OR_EQUAL;
		public AdditiveExpContext e2;
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
		enterRule(_localctx, 52, RULE_relationalExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			((RelationalExpContext)_localctx).e1 = additiveExp();
			 ((RelationalExpContext)_localctx).expr =  ((RelationalExpContext)_localctx).e1.expr; 
			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS_THAN) | (1L << GREATER_THAN) | (1L << LESS_OR_EQUAL) | (1L << GREATER_OR_EQUAL))) != 0)) {
				{
				{
				setState(319);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS_THAN) | (1L << GREATER_THAN) | (1L << LESS_OR_EQUAL) | (1L << GREATER_OR_EQUAL))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(320);
				((RelationalExpContext)_localctx).e2 = additiveExp();
				 
				        if (((RelationalExpContext)_localctx).LESS_THAN != null) {
				            ((RelationalExpContext)_localctx).expr =  new Lt(_localctx.expr, ((RelationalExpContext)_localctx).e2.expr);
				        } else if (((RelationalExpContext)_localctx).GREATER_THAN != null)  {
				            ((RelationalExpContext)_localctx).expr =  new Gt(_localctx.expr, ((RelationalExpContext)_localctx).e2.expr);
				        } else if (((RelationalExpContext)_localctx).LESS_OR_EQUAL != null)  {
				            ((RelationalExpContext)_localctx).expr =  new Loe(_localctx.expr, ((RelationalExpContext)_localctx).e2.expr);
				        } else {
				            ((RelationalExpContext)_localctx).expr =  new Goe(_localctx.expr, ((RelationalExpContext)_localctx).e2.expr);
				        }
				     
				}
				}
				setState(327);
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
		public Exp expr;
		public MultiplicativeExpContext e1;
		public Token PLUS;
		public MultiplicativeExpContext e2;
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
		enterRule(_localctx, 54, RULE_additiveExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			((AdditiveExpContext)_localctx).e1 = multiplicativeExp();
			 ((AdditiveExpContext)_localctx).expr =  ((AdditiveExpContext)_localctx).e1.expr; 
			setState(336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(330);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(331);
				((AdditiveExpContext)_localctx).e2 = multiplicativeExp();
				 
				        if (((AdditiveExpContext)_localctx).PLUS != null) {
				            ((AdditiveExpContext)_localctx).expr =  new Plus(_localctx.expr, ((AdditiveExpContext)_localctx).e2.expr);
				        } else {
				            ((AdditiveExpContext)_localctx).expr =  new Minus(_localctx.expr, ((AdditiveExpContext)_localctx).e2.expr);
				        }
				     
				}
				}
				setState(338);
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
		public Exp expr;
		public UnaryExpContext e1;
		public Token TIMES;
		public Token DIVIDE;
		public UnaryExpContext e2;
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
		enterRule(_localctx, 56, RULE_multiplicativeExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			((MultiplicativeExpContext)_localctx).e1 = unaryExp();
			 ((MultiplicativeExpContext)_localctx).expr =  ((MultiplicativeExpContext)_localctx).e1.expr; 
			setState(347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIMES) | (1L << DIVIDE) | (1L << MOD))) != 0)) {
				{
				{
				setState(341);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIMES) | (1L << DIVIDE) | (1L << MOD))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(342);
				((MultiplicativeExpContext)_localctx).e2 = unaryExp();
				 
				      if (((MultiplicativeExpContext)_localctx).TIMES != null){
				         ((MultiplicativeExpContext)_localctx).expr =  new Times(_localctx.expr, ((MultiplicativeExpContext)_localctx).e2.expr);
				      }else if (((MultiplicativeExpContext)_localctx).DIVIDE != null){
				         ((MultiplicativeExpContext)_localctx).expr =  new Div(_localctx.expr, ((MultiplicativeExpContext)_localctx).e2.expr);
				      }
				      else{
				         ((MultiplicativeExpContext)_localctx).expr =  new Mod(_localctx.expr, ((MultiplicativeExpContext)_localctx).e2.expr);
				      }
				     
				}
				}
				setState(349);
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
		public Exp expr;
		public Token LOGICAL_NOT;
		public UnaryExpContext e;
		public PrimaryExpContext primaryExp;
		public TerminalNode LOGICAL_NOT() { return getToken(LangParser.LOGICAL_NOT, 0); }
		public TerminalNode MINUS() { return getToken(LangParser.MINUS, 0); }
		public UnaryExpContext unaryExp() {
			return getRuleContext(UnaryExpContext.class,0);
		}
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
		enterRule(_localctx, 58, RULE_unaryExp);
		int _la;
		try {
			setState(357);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
			case LOGICAL_NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(350);
				_la = _input.LA(1);
				if ( !(_la==MINUS || _la==LOGICAL_NOT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(351);
				((UnaryExpContext)_localctx).e = unaryExp();
				 
				        if (((UnaryExpContext)_localctx).LOGICAL_NOT != null) {
				            ((UnaryExpContext)_localctx).expr =  new Not(((UnaryExpContext)_localctx).e.expr);
				        } else {
				            ((UnaryExpContext)_localctx).expr =  new Uminus(((UnaryExpContext)_localctx).e.expr);
				        }
				     
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
				setState(354);
				((UnaryExpContext)_localctx).primaryExp = primaryExp();
				 ((UnaryExpContext)_localctx).expr =  ((UnaryExpContext)_localctx).primaryExp.expr; 
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
		public Exp expr;
		public CNode array;
		public Token il;
		public Token fl;
		public Token cl;
		public Token sl;
		public LvalueContext lv;
		public ExpContext e;
		public TypeContext type;
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
		public TerminalNode RPAREN() { return getToken(LangParser.RPAREN, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
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
		public PrimaryExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExp; }
	}

	public final PrimaryExpContext primaryExp() throws RecognitionException {
		PrimaryExpContext _localctx = new PrimaryExpContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_primaryExp);
		int _la;
		try {
			setState(394);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(359);
				match(TRUE);
				 ((PrimaryExpContext)_localctx).expr =  new BoolLit(true); 
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(361);
				match(FALSE);
				 ((PrimaryExpContext)_localctx).expr =  new BoolLit(false); 
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 3);
				{
				setState(363);
				match(NULL);
				 ((PrimaryExpContext)_localctx).expr =  new CNull(); 
				}
				break;
			case INTLIT:
				enterOuterAlt(_localctx, 4);
				{
				setState(365);
				((PrimaryExpContext)_localctx).il = match(INTLIT);
				 ((PrimaryExpContext)_localctx).expr =  new IntLit(Integer.parseInt((((PrimaryExpContext)_localctx).il!=null?((PrimaryExpContext)_localctx).il.getText():null))); 
				}
				break;
			case FLOATLIT:
				enterOuterAlt(_localctx, 5);
				{
				setState(367);
				((PrimaryExpContext)_localctx).fl = match(FLOATLIT);
				 ((PrimaryExpContext)_localctx).expr =  new FloatLit(Float.parseFloat((((PrimaryExpContext)_localctx).fl!=null?((PrimaryExpContext)_localctx).fl.getText():null))); 
				}
				break;
			case CHARLIT:
				enterOuterAlt(_localctx, 6);
				{
				setState(369);
				((PrimaryExpContext)_localctx).cl = match(CHARLIT);
				 ((PrimaryExpContext)_localctx).expr =  new CharLit((((PrimaryExpContext)_localctx).cl!=null?((PrimaryExpContext)_localctx).cl.getText():null).charAt(0)); 
				}
				break;
			case STRINGLIT:
				enterOuterAlt(_localctx, 7);
				{
				setState(371);
				((PrimaryExpContext)_localctx).sl = match(STRINGLIT);
				 ((PrimaryExpContext)_localctx).expr =  new StringLit((((PrimaryExpContext)_localctx).sl!=null?((PrimaryExpContext)_localctx).sl.getText():null)); 
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 8);
				{
				setState(373);
				((PrimaryExpContext)_localctx).lv = lvalue(0);
				 ((PrimaryExpContext)_localctx).expr =  ((PrimaryExpContext)_localctx).lv.lval; 
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 9);
				{
				setState(376);
				match(LPAREN);
				setState(377);
				((PrimaryExpContext)_localctx).e = exp();
				setState(378);
				match(RPAREN);
				 ((PrimaryExpContext)_localctx).expr =  ((PrimaryExpContext)_localctx).e.expr; 
				}
				break;
			case NEW:
				enterOuterAlt(_localctx, 10);
				{
				setState(381);
				match(NEW);
				setState(382);
				((PrimaryExpContext)_localctx).type = type();
				setState(389);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(383);
					match(LBRACK);
					setState(384);
					((PrimaryExpContext)_localctx).e = exp();
					setState(385);
					match(RBRACK);
					}
					}
					setState(391);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				 
				      ((PrimaryExpContext)_localctx).array =  new ArrInst("temp",((PrimaryExpContext)_localctx).e.expr,((PrimaryExpContext)_localctx).type.t);
				     
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

	public static class LvalueContext extends ParserRuleContext {
		public Exp lval;
		public LvalueContext lv;
		public Token id;
		public ExpContext e;
		public TerminalNode ID() { return getToken(LangParser.ID, 0); }
		public TerminalNode LBRACK() { return getToken(LangParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(LangParser.RBRACK, 0); }
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
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
		int _startState = 62;
		enterRecursionRule(_localctx, 62, RULE_lvalue, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(397);
			((LvalueContext)_localctx).id = match(ID);
			 ((LvalueContext)_localctx).lval =  new Var((((LvalueContext)_localctx).id!=null?((LvalueContext)_localctx).id.getText():null)); 
			}
			_ctx.stop = _input.LT(-1);
			setState(412);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(410);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
						_localctx = new LvalueContext(_parentctx, _parentState);
						_localctx.lv = _prevctx;
						_localctx.lv = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_lvalue);
						setState(400);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(401);
						match(LBRACK);
						setState(402);
						((LvalueContext)_localctx).e = exp();
						setState(403);
						match(RBRACK);
						 
						                 ((LvalueContext)_localctx).lval =  new CArrayAccess(((LvalueContext)_localctx).lv.lval, ((LvalueContext)_localctx).e.expr); 
						                
						}
						break;
					case 2:
						{
						_localctx = new LvalueContext(_parentctx, _parentState);
						_localctx.lv = _prevctx;
						_localctx.lv = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_lvalue);
						setState(406);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(407);
						match(DOT);
						setState(408);
						((LvalueContext)_localctx).id = match(ID);

						                  ((LvalueContext)_localctx).lval =  new CFieldAccess(((LvalueContext)_localctx).lv.lval, (((LvalueContext)_localctx).id!=null?((LvalueContext)_localctx).id.getText():null)); 
						                 
						}
						break;
					}
					} 
				}
				setState(414);
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
		public ArrayList<Exp> exprs;
		public ExpContext exp;
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
		enterRule(_localctx, 64, RULE_exps);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((ExpsContext)_localctx).exprs =  new ArrayList<Exp>(); 
			setState(416);
			((ExpsContext)_localctx).exp = exp();
			 _localctx.exprs.add(((ExpsContext)_localctx).exp.expr); 
			setState(424);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(418);
				match(COMMA);
				setState(419);
				((ExpsContext)_localctx).exp = exp();
				 _localctx.exprs.add(((ExpsContext)_localctx).exp.expr); 
				}
				}
				setState(426);
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
		case 31:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\65\u01ae\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3N\n\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\5\4V\n\4\3\5\3\5\3\5\3\5\7\5\\\n\5\f\5\16\5_\13\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\5\7m\n\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\b\5\b{\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5"+
		"\t\u0085\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u0092\n\n"+
		"\f\n\16\n\u0095\13\n\3\13\3\13\3\13\5\13\u009a\n\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00aa\n\f\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\5\r\u00b3\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16"+
		"\u00cb\n\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\5\20\u00d9\n\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\5\24\u00f5\n\24\3\25\3\25\3\25\3\25\5\25\u00fb\n\25\3\25\3\25\3"+
		"\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\5\27\u0109\n\27\3\27"+
		"\3\27\3\27\3\27\3\27\7\27\u0110\n\27\f\27\16\27\u0113\13\27\3\27\3\27"+
		"\5\27\u0117\n\27\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\7\31\u0125\n\31\f\31\16\31\u0128\13\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\7\32\u0130\n\32\f\32\16\32\u0133\13\32\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\7\33\u013b\n\33\f\33\16\33\u013e\13\33\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\7\34\u0146\n\34\f\34\16\34\u0149\13\34\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\7\35\u0151\n\35\f\35\16\35\u0154\13\35\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\7\36\u015c\n\36\f\36\16\36\u015f\13\36\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\5\37\u0168\n\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3"+
		" \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \7 \u0186\n \f \16 \u0189\13 "+
		"\3 \3 \5 \u018d\n \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\7!\u019d"+
		"\n!\f!\16!\u01a0\13!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\7\"\u01a9\n\"\f\"\16"+
		"\"\u01ac\13\"\3\"\2\3@#\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*"+
		",.\60\62\64\668:<>@B\2\7\3\2&\'\3\2(+\3\2\36\37\3\2 \"\4\2\37\37%%\2\u01bb"+
		"\2D\3\2\2\2\4M\3\2\2\2\6U\3\2\2\2\bW\3\2\2\2\nc\3\2\2\2\fi\3\2\2\2\16"+
		"z\3\2\2\2\20\u0084\3\2\2\2\22\u0086\3\2\2\2\24\u0096\3\2\2\2\26\u00a9"+
		"\3\2\2\2\30\u00b2\3\2\2\2\32\u00ca\3\2\2\2\34\u00cc\3\2\2\2\36\u00d1\3"+
		"\2\2\2 \u00dc\3\2\2\2\"\u00e3\3\2\2\2$\u00e8\3\2\2\2&\u00f4\3\2\2\2(\u00f6"+
		"\3\2\2\2*\u00ff\3\2\2\2,\u0105\3\2\2\2.\u011b\3\2\2\2\60\u011e\3\2\2\2"+
		"\62\u0129\3\2\2\2\64\u0134\3\2\2\2\66\u013f\3\2\2\28\u014a\3\2\2\2:\u0155"+
		"\3\2\2\2<\u0167\3\2\2\2>\u018c\3\2\2\2@\u018e\3\2\2\2B\u01a1\3\2\2\2D"+
		"E\5\4\3\2EF\b\2\1\2F\3\3\2\2\2GH\b\3\1\2HI\5\6\4\2IJ\5\4\3\2JK\b\3\1\2"+
		"KN\3\2\2\2LN\b\3\1\2MG\3\2\2\2ML\3\2\2\2N\5\3\2\2\2OP\5\b\5\2PQ\b\4\1"+
		"\2QV\3\2\2\2RS\5\f\7\2ST\b\4\1\2TV\3\2\2\2UO\3\2\2\2UR\3\2\2\2V\7\3\2"+
		"\2\2WX\7\21\2\2XY\7.\2\2Y]\7\25\2\2Z\\\5\n\6\2[Z\3\2\2\2\\_\3\2\2\2]["+
		"\3\2\2\2]^\3\2\2\2^`\3\2\2\2_]\3\2\2\2`a\7\26\2\2ab\b\5\1\2b\t\3\2\2\2"+
		"cd\7-\2\2de\7\34\2\2ef\5\24\13\2fg\7\31\2\2gh\b\6\1\2h\13\3\2\2\2ij\7"+
		"-\2\2jl\7\24\2\2km\5\22\n\2lk\3\2\2\2lm\3\2\2\2mn\3\2\2\2no\7\23\2\2o"+
		"p\7\35\2\2pq\5\16\b\2qr\7\25\2\2rs\5\32\16\2st\7\26\2\2tu\b\7\1\2u\r\3"+
		"\2\2\2vw\5\20\t\2wx\b\b\1\2x{\3\2\2\2y{\b\b\1\2zv\3\2\2\2zy\3\2\2\2{\17"+
		"\3\2\2\2|}\5\24\13\2}~\b\t\1\2~\u0085\3\2\2\2\177\u0080\5\24\13\2\u0080"+
		"\u0081\7\32\2\2\u0081\u0082\5\20\t\2\u0082\u0083\b\t\1\2\u0083\u0085\3"+
		"\2\2\2\u0084|\3\2\2\2\u0084\177\3\2\2\2\u0085\21\3\2\2\2\u0086\u0087\b"+
		"\n\1\2\u0087\u0088\7-\2\2\u0088\u0089\7\34\2\2\u0089\u008a\5\24\13\2\u008a"+
		"\u0093\b\n\1\2\u008b\u008c\7\32\2\2\u008c\u008d\7-\2\2\u008d\u008e\7\34"+
		"\2\2\u008e\u008f\5\24\13\2\u008f\u0090\b\n\1\2\u0090\u0092\3\2\2\2\u0091"+
		"\u008b\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2"+
		"\2\2\u0094\23\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u0099\5\26\f\2\u0097\u0098"+
		"\7\27\2\2\u0098\u009a\7\30\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2"+
		"\u009a\u009b\3\2\2\2\u009b\u009c\b\13\1\2\u009c\25\3\2\2\2\u009d\u009e"+
		"\7\t\2\2\u009e\u00aa\b\f\1\2\u009f\u00a0\7\13\2\2\u00a0\u00aa\b\f\1\2"+
		"\u00a1\u00a2\7\f\2\2\u00a2\u00aa\b\f\1\2\u00a3\u00a4\7\n\2\2\u00a4\u00aa"+
		"\b\f\1\2\u00a5\u00a6\7\r\2\2\u00a6\u00aa\b\f\1\2\u00a7\u00a8\7.\2\2\u00a8"+
		"\u00aa\b\f\1\2\u00a9\u009d\3\2\2\2\u00a9\u009f\3\2\2\2\u00a9\u00a1\3\2"+
		"\2\2\u00a9\u00a3\3\2\2\2\u00a9\u00a5\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa"+
		"\27\3\2\2\2\u00ab\u00ac\5\32\16\2\u00ac\u00ad\5\30\r\2\u00ad\u00ae\b\r"+
		"\1\2\u00ae\u00b3\3\2\2\2\u00af\u00b0\5\32\16\2\u00b0\u00b1\b\r\1\2\u00b1"+
		"\u00b3\3\2\2\2\u00b2\u00ab\3\2\2\2\u00b2\u00af\3\2\2\2\u00b3\31\3\2\2"+
		"\2\u00b4\u00b5\5\34\17\2\u00b5\u00b6\b\16\1\2\u00b6\u00cb\3\2\2\2\u00b7"+
		"\u00b8\5\36\20\2\u00b8\u00b9\b\16\1\2\u00b9\u00cb\3\2\2\2\u00ba\u00bb"+
		"\5 \21\2\u00bb\u00bc\b\16\1\2\u00bc\u00cb\3\2\2\2\u00bd\u00be\5\"\22\2"+
		"\u00be\u00bf\b\16\1\2\u00bf\u00cb\3\2\2\2\u00c0\u00c1\5$\23\2\u00c1\u00c2"+
		"\b\16\1\2\u00c2\u00cb\3\2\2\2\u00c3\u00c4\5(\25\2\u00c4\u00c5\b\16\1\2"+
		"\u00c5\u00cb\3\2\2\2\u00c6\u00c7\5*\26\2\u00c7\u00c8\b\16\1\2\u00c8\u00cb"+
		"\3\2\2\2\u00c9\u00cb\5,\27\2\u00ca\u00b4\3\2\2\2\u00ca\u00b7\3\2\2\2\u00ca"+
		"\u00ba\3\2\2\2\u00ca\u00bd\3\2\2\2\u00ca\u00c0\3\2\2\2\u00ca\u00c3\3\2"+
		"\2\2\u00ca\u00c6\3\2\2\2\u00ca\u00c9\3\2\2\2\u00cb\33\3\2\2\2\u00cc\u00cd"+
		"\7\25\2\2\u00cd\u00ce\5\30\r\2\u00ce\u00cf\7\26\2\2\u00cf\u00d0\b\17\1"+
		"\2\u00d0\35\3\2\2\2\u00d1\u00d2\7\3\2\2\u00d2\u00d3\7\24\2\2\u00d3\u00d4"+
		"\5.\30\2\u00d4\u00d5\7\23\2\2\u00d5\u00d8\5\32\16\2\u00d6\u00d7\7\4\2"+
		"\2\u00d7\u00d9\5\32\16\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9"+
		"\u00da\3\2\2\2\u00da\u00db\b\20\1\2\u00db\37\3\2\2\2\u00dc\u00dd\7\7\2"+
		"\2\u00dd\u00de\7\24\2\2\u00de\u00df\5.\30\2\u00df\u00e0\7\23\2\2\u00e0"+
		"\u00e1\5\32\16\2\u00e1\u00e2\b\21\1\2\u00e2!\3\2\2\2\u00e3\u00e4\7\22"+
		"\2\2\u00e4\u00e5\5@!\2\u00e5\u00e6\7\31\2\2\u00e6\u00e7\b\22\1\2\u00e7"+
		"#\3\2\2\2\u00e8\u00e9\7\6\2\2\u00e9\u00ea\5.\30\2\u00ea\u00eb\7\31\2\2"+
		"\u00eb\u00ec\b\23\1\2\u00ec%\3\2\2\2\u00ed\u00ee\5> \2\u00ee\u00ef\5&"+
		"\24\2\u00ef\u00f0\b\24\1\2\u00f0\u00f5\3\2\2\2\u00f1\u00f2\5> \2\u00f2"+
		"\u00f3\b\24\1\2\u00f3\u00f5\3\2\2\2\u00f4\u00ed\3\2\2\2\u00f4\u00f1\3"+
		"\2\2\2\u00f5\'\3\2\2\2\u00f6\u00f7\7\b\2\2\u00f7\u00fa\5.\30\2\u00f8\u00f9"+
		"\7\32\2\2\u00f9\u00fb\5&\24\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2"+
		"\u00fb\u00fc\3\2\2\2\u00fc\u00fd\7\31\2\2\u00fd\u00fe\b\25\1\2\u00fe)"+
		"\3\2\2\2\u00ff\u0100\5@!\2\u0100\u0101\7,\2\2\u0101\u0102\5.\30\2\u0102"+
		"\u0103\7\31\2\2\u0103\u0104\b\26\1\2\u0104+\3\2\2\2\u0105\u0106\7-\2\2"+
		"\u0106\u0108\7\24\2\2\u0107\u0109\5B\"\2\u0108\u0107\3\2\2\2\u0108\u0109"+
		"\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u0116\7\23\2\2\u010b\u010c\7(\2\2\u010c"+
		"\u0111\5@!\2\u010d\u010e\7\32\2\2\u010e\u0110\5@!\2\u010f\u010d\3\2\2"+
		"\2\u0110\u0113\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0114"+
		"\3\2\2\2\u0113\u0111\3\2\2\2\u0114\u0115\7)\2\2\u0115\u0117\3\2\2\2\u0116"+
		"\u010b\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0119\7\31"+
		"\2\2\u0119\u011a\b\27\1\2\u011a-\3\2\2\2\u011b\u011c\5\60\31\2\u011c\u011d"+
		"\b\30\1\2\u011d/\3\2\2\2\u011e\u011f\5\62\32\2\u011f\u0126\b\31\1\2\u0120"+
		"\u0121\7$\2\2\u0121\u0122\5\62\32\2\u0122\u0123\b\31\1\2\u0123\u0125\3"+
		"\2\2\2\u0124\u0120\3\2\2\2\u0125\u0128\3\2\2\2\u0126\u0124\3\2\2\2\u0126"+
		"\u0127\3\2\2\2\u0127\61\3\2\2\2\u0128\u0126\3\2\2\2\u0129\u012a\5\64\33"+
		"\2\u012a\u0131\b\32\1\2\u012b\u012c\7#\2\2\u012c\u012d\5\64\33\2\u012d"+
		"\u012e\b\32\1\2\u012e\u0130\3\2\2\2\u012f\u012b\3\2\2\2\u0130\u0133\3"+
		"\2\2\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132\63\3\2\2\2\u0133"+
		"\u0131\3\2\2\2\u0134\u0135\5\66\34\2\u0135\u013c\b\33\1\2\u0136\u0137"+
		"\t\2\2\2\u0137\u0138\5\66\34\2\u0138\u0139\b\33\1\2\u0139\u013b\3\2\2"+
		"\2\u013a\u0136\3\2\2\2\u013b\u013e\3\2\2\2\u013c\u013a\3\2\2\2\u013c\u013d"+
		"\3\2\2\2\u013d\65\3\2\2\2\u013e\u013c\3\2\2\2\u013f\u0140\58\35\2\u0140"+
		"\u0147\b\34\1\2\u0141\u0142\t\3\2\2\u0142\u0143\58\35\2\u0143\u0144\b"+
		"\34\1\2\u0144\u0146\3\2\2\2\u0145\u0141\3\2\2\2\u0146\u0149\3\2\2\2\u0147"+
		"\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148\67\3\2\2\2\u0149\u0147\3\2\2"+
		"\2\u014a\u014b\5:\36\2\u014b\u0152\b\35\1\2\u014c\u014d\t\4\2\2\u014d"+
		"\u014e\5:\36\2\u014e\u014f\b\35\1\2\u014f\u0151\3\2\2\2\u0150\u014c\3"+
		"\2\2\2\u0151\u0154\3\2\2\2\u0152\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153"+
		"9\3\2\2\2\u0154\u0152\3\2\2\2\u0155\u0156\5<\37\2\u0156\u015d\b\36\1\2"+
		"\u0157\u0158\t\5\2\2\u0158\u0159\5<\37\2\u0159\u015a\b\36\1\2\u015a\u015c"+
		"\3\2\2\2\u015b\u0157\3\2\2\2\u015c\u015f\3\2\2\2\u015d\u015b\3\2\2\2\u015d"+
		"\u015e\3\2\2\2\u015e;\3\2\2\2\u015f\u015d\3\2\2\2\u0160\u0161\t\6\2\2"+
		"\u0161\u0162\5<\37\2\u0162\u0163\b\37\1\2\u0163\u0168\3\2\2\2\u0164\u0165"+
		"\5> \2\u0165\u0166\b\37\1\2\u0166\u0168\3\2\2\2\u0167\u0160\3\2\2\2\u0167"+
		"\u0164\3\2\2\2\u0168=\3\2\2\2\u0169\u016a\7\16\2\2\u016a\u018d\b \1\2"+
		"\u016b\u016c\7\17\2\2\u016c\u018d\b \1\2\u016d\u016e\7\20\2\2\u016e\u018d"+
		"\b \1\2\u016f\u0170\7/\2\2\u0170\u018d\b \1\2\u0171\u0172\7\60\2\2\u0172"+
		"\u018d\b \1\2\u0173\u0174\7\61\2\2\u0174\u018d\b \1\2\u0175\u0176\7\62"+
		"\2\2\u0176\u018d\b \1\2\u0177\u0178\5@!\2\u0178\u0179\b \1\2\u0179\u018d"+
		"\3\2\2\2\u017a\u017b\7\24\2\2\u017b\u017c\5.\30\2\u017c\u017d\7\23\2\2"+
		"\u017d\u017e\b \1\2\u017e\u018d\3\2\2\2\u017f\u0180\7\5\2\2\u0180\u0187"+
		"\5\24\13\2\u0181\u0182\7\27\2\2\u0182\u0183\5.\30\2\u0183\u0184\7\30\2"+
		"\2\u0184\u0186\3\2\2\2\u0185\u0181\3\2\2\2\u0186\u0189\3\2\2\2\u0187\u0185"+
		"\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u018a\3\2\2\2\u0189\u0187\3\2\2\2\u018a"+
		"\u018b\b \1\2\u018b\u018d\3\2\2\2\u018c\u0169\3\2\2\2\u018c\u016b\3\2"+
		"\2\2\u018c\u016d\3\2\2\2\u018c\u016f\3\2\2\2\u018c\u0171\3\2\2\2\u018c"+
		"\u0173\3\2\2\2\u018c\u0175\3\2\2\2\u018c\u0177\3\2\2\2\u018c\u017a\3\2"+
		"\2\2\u018c\u017f\3\2\2\2\u018d?\3\2\2\2\u018e\u018f\b!\1\2\u018f\u0190"+
		"\7-\2\2\u0190\u0191\b!\1\2\u0191\u019e\3\2\2\2\u0192\u0193\f\4\2\2\u0193"+
		"\u0194\7\27\2\2\u0194\u0195\5.\30\2\u0195\u0196\7\30\2\2\u0196\u0197\b"+
		"!\1\2\u0197\u019d\3\2\2\2\u0198\u0199\f\3\2\2\u0199\u019a\7\33\2\2\u019a"+
		"\u019b\7-\2\2\u019b\u019d\b!\1\2\u019c\u0192\3\2\2\2\u019c\u0198\3\2\2"+
		"\2\u019d\u01a0\3\2\2\2\u019e\u019c\3\2\2\2\u019e\u019f\3\2\2\2\u019fA"+
		"\3\2\2\2\u01a0\u019e\3\2\2\2\u01a1\u01a2\b\"\1\2\u01a2\u01a3\5.\30\2\u01a3"+
		"\u01aa\b\"\1\2\u01a4\u01a5\7\32\2\2\u01a5\u01a6\5.\30\2\u01a6\u01a7\b"+
		"\"\1\2\u01a7\u01a9\3\2\2\2\u01a8\u01a4\3\2\2\2\u01a9\u01ac\3\2\2\2\u01aa"+
		"\u01a8\3\2\2\2\u01aa\u01ab\3\2\2\2\u01abC\3\2\2\2\u01ac\u01aa\3\2\2\2"+
		"\37MU]lz\u0084\u0093\u0099\u00a9\u00b2\u00ca\u00d8\u00f4\u00fa\u0108\u0111"+
		"\u0116\u0126\u0131\u013c\u0147\u0152\u015d\u0167\u0187\u018c\u019c\u019e"+
		"\u01aa";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}