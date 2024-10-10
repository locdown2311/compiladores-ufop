// Generated from lang/parser/LangParser.g4 by ANTLR 4.13.2

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

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class LangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

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
		RULE_prog = 0, RULE_defList = 1, RULE_def = 2, RULE_data = 3, RULE_decls = 4, 
		RULE_decl = 5, RULE_func = 6, RULE_mrets = 7, RULE_rets = 8, RULE_params = 9, 
		RULE_type = 10, RULE_btype = 11, RULE_cmdList = 12, RULE_cmdRest = 13, 
		RULE_cmd = 14, RULE_block = 15, RULE_ifCmd = 16, RULE_iterateCmd = 17, 
		RULE_readCmd = 18, RULE_printCmd = 19, RULE_returnCmd = 20, RULE_assignCmd = 21, 
		RULE_funcCallCmd = 22, RULE_exp = 23, RULE_logicalOrExp = 24, RULE_logicalAndExp = 25, 
		RULE_equalityExp = 26, RULE_relationalExp = 27, RULE_additiveExp = 28, 
		RULE_multiplicativeExp = 29, RULE_unaryExp = 30, RULE_primaryExp = 31, 
		RULE_lvalue = 32, RULE_exps = 33;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "defList", "def", "data", "decls", "decl", "func", "mrets", "rets", 
			"params", "type", "btype", "cmdList", "cmdRest", "cmd", "block", "ifCmd", 
			"iterateCmd", "readCmd", "printCmd", "returnCmd", "assignCmd", "funcCallCmd", 
			"exp", "logicalOrExp", "logicalAndExp", "equalityExp", "relationalExp", 
			"additiveExp", "multiplicativeExp", "unaryExp", "primaryExp", "lvalue", 
			"exps"
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			((ProgContext)_localctx).e = defList();
			 
			        List<CFuncDef> defs = ((ProgContext)_localctx).e.df != null ? ((ProgContext)_localctx).e.df : new ArrayList<CFuncDef>();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DefListContext extends ParserRuleContext {
		public ArrayList<CFuncDef> df;
		public DefContext d;
		public List<DefContext> def() {
			return getRuleContexts(DefContext.class);
		}
		public DefContext def(int i) {
			return getRuleContext(DefContext.class,i);
		}
		public DefListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitDefList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefListContext defList() throws RecognitionException {
		DefListContext _localctx = new DefListContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_defList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((DefListContext)_localctx).df =  new ArrayList<CFuncDef>(); 
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DATA || _la==ID) {
				{
				{
				setState(72);
				((DefListContext)_localctx).d = def();
				 _localctx.df.add(((DefListContext)_localctx).d.d); 
				}
				}
				setState(79);
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefContext def() throws RecognitionException {
		DefContext _localctx = new DefContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_def);
		try {
			setState(86);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DATA:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				((DefContext)_localctx).data = data();
				((DefContext)_localctx).d =  ((DefContext)_localctx).data.d; 
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DataContext extends ParserRuleContext {
		public CFuncDef d;
		public Token typeName;
		public DeclsContext dec;
		public DeclsContext decls;
		public TerminalNode DATA() { return getToken(LangParser.DATA, 0); }
		public TerminalNode LBRACE() { return getToken(LangParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(LangParser.RBRACE, 0); }
		public TerminalNode TYPE() { return getToken(LangParser.TYPE, 0); }
		public DeclsContext decls() {
			return getRuleContext(DeclsContext.class,0);
		}
		public DataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitData(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataContext data() throws RecognitionException {
		DataContext _localctx = new DataContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_data);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(DATA);
			setState(89);
			((DataContext)_localctx).typeName = match(TYPE);
			setState(90);
			match(LBRACE);
			setState(91);
			((DataContext)_localctx).dec = ((DataContext)_localctx).decls = decls();
			setState(92);
			match(RBRACE);

			        ((DataContext)_localctx).d =  new CData((((DataContext)_localctx).typeName!=null?((DataContext)_localctx).typeName.getText():null), ((DataContext)_localctx).decls.list);
			    
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclsContext extends ParserRuleContext {
		public List<CVarDec> list;
		public DeclContext decl;
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public DeclsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decls; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitDecls(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclsContext decls() throws RecognitionException {
		DeclsContext _localctx = new DeclsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_decls);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((DeclsContext)_localctx).list =  new ArrayList<CVarDec>(); 
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(96);
				((DeclsContext)_localctx).decl = decl();
				 _localctx.list.add(((DeclsContext)_localctx).decl.decla); 
				}
				}
				setState(103);
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			((DeclContext)_localctx).id = match(ID);
			setState(105);
			match(DOUBLE_COLON);
			setState(106);
			((DeclContext)_localctx).t = type();
			setState(107);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FuncContext extends ParserRuleContext {
		public CFuncDef d;
		public Token id;
		public ParamsContext p;
		public MretsContext mrets;
		public CmdListContext cmdList;
		public TerminalNode LPAREN() { return getToken(LangParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(LangParser.RPAREN, 0); }
		public TerminalNode COLON() { return getToken(LangParser.COLON, 0); }
		public MretsContext mrets() {
			return getRuleContext(MretsContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(LangParser.LBRACE, 0); }
		public CmdListContext cmdList() {
			return getRuleContext(CmdListContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			((FuncContext)_localctx).id = match(ID);
			setState(111);
			match(LPAREN);
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(112);
				((FuncContext)_localctx).p = params();
				}
			}

			setState(115);
			match(RPAREN);
			setState(116);
			match(COLON);
			setState(117);
			((FuncContext)_localctx).mrets = mrets();
			setState(118);
			match(LBRACE);
			setState(119);
			((FuncContext)_localctx).cmdList = cmdList();
			setState(120);
			match(RBRACE);

			        ((FuncContext)_localctx).d =  new CFuncDef((((FuncContext)_localctx).id!=null?((FuncContext)_localctx).id.getText():null), (CVarDec[])((FuncContext)_localctx).p.paramList.toArray(new CVarDec[0]), (CType[])((FuncContext)_localctx).mrets.retList.toArray(new CType[0]), new CBlock(((FuncContext)_localctx).cmdList.arrc.toArray(new CNode[0])));
			    
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitMrets(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MretsContext mrets() throws RecognitionException {
		MretsContext _localctx = new MretsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_mrets);
		try {
			setState(128);
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
				 ((MretsContext)_localctx).retList =  new ArrayList<CType>(); 
				setState(124);
				((MretsContext)_localctx).rets = rets();
				 _localctx.retList.addAll(((MretsContext)_localctx).rets.retList); 
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				 /* já inicializado como vazio */ 
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

	@SuppressWarnings("CheckReturnValue")
	public static class RetsContext extends ParserRuleContext {
		public ArrayList<CType> retList;
		public TypeContext type;
		public RetsContext next;
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitRets(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RetsContext rets() throws RecognitionException {
		RetsContext _localctx = new RetsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_rets);
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((RetsContext)_localctx).retList =  new ArrayList<CType>(); 
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(131);
				((RetsContext)_localctx).type = type();
				 _localctx.retList.add(((RetsContext)_localctx).type.t); 
				}
				break;
			case 2:
				{
				setState(134);
				((RetsContext)_localctx).type = type();
				setState(135);
				match(COMMA);
				setState(136);
				((RetsContext)_localctx).next = rets();
				 
				        _localctx.retList.add(((RetsContext)_localctx).type.t);
				        _localctx.retList.addAll(((RetsContext)_localctx).next.retList);
				    
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((ParamsContext)_localctx).paramList =  new ArrayList<CVarDec>(); 
			setState(142);
			((ParamsContext)_localctx).ID = match(ID);
			setState(143);
			match(DOUBLE_COLON);
			setState(144);
			((ParamsContext)_localctx).type = type();
			 
			        _localctx.paramList.add(new CVarDec((((ParamsContext)_localctx).ID!=null?((ParamsContext)_localctx).ID.getText():null), ((ParamsContext)_localctx).type.t)); 
			    
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(146);
				match(COMMA);
				setState(147);
				((ParamsContext)_localctx).ID = match(ID);
				setState(148);
				match(DOUBLE_COLON);
				setState(149);
				((ParamsContext)_localctx).type = type();
				_localctx.paramList.add(new CVarDec((((ParamsContext)_localctx).ID!=null?((ParamsContext)_localctx).ID.getText():null), ((ParamsContext)_localctx).type.t));  
				}
				}
				setState(156);
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			((TypeContext)_localctx).btype = btype();
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(158);
				match(LBRACK);
				setState(159);
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitBtype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BtypeContext btype() throws RecognitionException {
		BtypeContext _localctx = new BtypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_btype);
		try {
			setState(176);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				match(INT);
				 ((BtypeContext)_localctx).base =  CBaseType.INT; 
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				match(CHAR);
				 ((BtypeContext)_localctx).base =  CBaseType.CHAR; 
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 3);
				{
				setState(168);
				match(BOOLEAN);
				 ((BtypeContext)_localctx).base =  CBaseType.BOOL; 
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 4);
				{
				setState(170);
				match(FLOAT);
				 ((BtypeContext)_localctx).base =  CBaseType.FLOAT; 
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 5);
				{
				setState(172);
				match(VOID);
				 ((BtypeContext)_localctx).base =  CBaseType.VOID; 
				}
				break;
			case TYPE:
				enterOuterAlt(_localctx, 6);
				{
				setState(174);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CmdListContext extends ParserRuleContext {
		public ArrayList<CNode> arrc;
		public CmdContext cmd;
		public CmdRestContext cmdRest;
		public CmdContext cmd() {
			return getRuleContext(CmdContext.class,0);
		}
		public CmdRestContext cmdRest() {
			return getRuleContext(CmdRestContext.class,0);
		}
		public CmdListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitCmdList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdListContext cmdList() throws RecognitionException {
		CmdListContext _localctx = new CmdListContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_cmdList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((CmdListContext)_localctx).arrc =  new ArrayList<CNode>(); 
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(179);
				((CmdListContext)_localctx).cmd = cmd();
				setState(180);
				((CmdListContext)_localctx).cmdRest = cmdRest();
				 _localctx.arrc.add(((CmdListContext)_localctx).cmd.c); _localctx.arrc.addAll(((CmdListContext)_localctx).cmdRest.arrv); 
				}
				break;
			case 2:
				{
				setState(183);
				((CmdListContext)_localctx).cmd = cmd();
				 _localctx.arrc.add(((CmdListContext)_localctx).cmd.c); 
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

	@SuppressWarnings("CheckReturnValue")
	public static class CmdRestContext extends ParserRuleContext {
		public ArrayList<CNode> arrv;
		public CmdContext cmd;
		public CmdRestContext cmdRest;
		public CmdContext cmd() {
			return getRuleContext(CmdContext.class,0);
		}
		public CmdRestContext cmdRest() {
			return getRuleContext(CmdRestContext.class,0);
		}
		public CmdRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdRest; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitCmdRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdRestContext cmdRest() throws RecognitionException {
		CmdRestContext _localctx = new CmdRestContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_cmdRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((CmdRestContext)_localctx).arrv =  new ArrayList<CNode>(); 
			setState(194);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
			case PRINT:
			case ITERATE:
			case RETURN:
			case READ:
			case LBRACE:
			case ID:
				{
				setState(189);
				((CmdRestContext)_localctx).cmd = cmd();
				setState(190);
				((CmdRestContext)_localctx).cmdRest = cmdRest();
				 _localctx.arrv.add(((CmdRestContext)_localctx).cmd.c); _localctx.arrv.addAll(((CmdRestContext)_localctx).cmdRest.arrv); 
				}
				break;
			case RBRACE:
				{
				 /* Nada a fazer, lista pronta */ 
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CmdContext extends ParserRuleContext {
		public CNode c;
		public BlockContext block;
		public IfCmdContext ifCmd;
		public IterateCmdContext iterateCmd;
		public ReadCmdContext readCmd;
		public PrintCmdContext printCmd;
		public ReturnCmdContext returnCmd;
		public AssignCmdContext assignCmd;
		public FuncCallCmdContext funcCallCmd;
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitCmd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_cmd);
		try {
			setState(220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				((CmdContext)_localctx).block = block();
				 ((CmdContext)_localctx).c =  ((CmdContext)_localctx).block.c; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(199);
				((CmdContext)_localctx).ifCmd = ifCmd();
				 ((CmdContext)_localctx).c =  ((CmdContext)_localctx).ifCmd.c; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(202);
				((CmdContext)_localctx).iterateCmd = iterateCmd();
				 ((CmdContext)_localctx).c =  ((CmdContext)_localctx).iterateCmd.c; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(205);
				((CmdContext)_localctx).readCmd = readCmd();
				 ((CmdContext)_localctx).c =  ((CmdContext)_localctx).readCmd.c; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(208);
				((CmdContext)_localctx).printCmd = printCmd();
				 ((CmdContext)_localctx).c =  ((CmdContext)_localctx).printCmd.c; 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(211);
				((CmdContext)_localctx).returnCmd = returnCmd();
				 ((CmdContext)_localctx).c =  ((CmdContext)_localctx).returnCmd.c; 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(214);
				((CmdContext)_localctx).assignCmd = assignCmd();
				 ((CmdContext)_localctx).c =  ((CmdContext)_localctx).assignCmd.c; 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(217);
				((CmdContext)_localctx).funcCallCmd = funcCallCmd();
				((CmdContext)_localctx).c =  ((CmdContext)_localctx).funcCallCmd.c;
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(LBRACE);
			setState(223);
			((BlockContext)_localctx).cmdList = cmdList();
			setState(224);
			match(RBRACE);

			        CNode[] temp = ((BlockContext)_localctx).cmdList.arrc.toArray(new CNode[0]);
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitIfCmd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfCmdContext ifCmd() throws RecognitionException {
		IfCmdContext _localctx = new IfCmdContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_ifCmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(IF);
			setState(228);
			match(LPAREN);
			setState(229);
			((IfCmdContext)_localctx).e = exp();
			setState(230);
			match(RPAREN);
			setState(231);
			((IfCmdContext)_localctx).thenCmd = cmd();
			setState(234);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(232);
				((IfCmdContext)_localctx).ELSE = match(ELSE);
				setState(233);
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitIterateCmd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IterateCmdContext iterateCmd() throws RecognitionException {
		IterateCmdContext _localctx = new IterateCmdContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_iterateCmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(ITERATE);
			setState(239);
			match(LPAREN);
			setState(240);
			((IterateCmdContext)_localctx).e = exp();
			setState(241);
			match(RPAREN);
			setState(242);
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitReadCmd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadCmdContext readCmd() throws RecognitionException {
		ReadCmdContext _localctx = new ReadCmdContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_readCmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(READ);
			setState(246);
			((ReadCmdContext)_localctx).l = lvalue(0);
			setState(247);
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitPrintCmd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintCmdContext printCmd() throws RecognitionException {
		PrintCmdContext _localctx = new PrintCmdContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_printCmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(PRINT);
			setState(251);
			((PrintCmdContext)_localctx).e = exp();
			setState(252);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnCmdContext extends ParserRuleContext {
		public CNode c;
		public ExpContext e;
		public ExpContext e2;
		public TerminalNode RETURN() { return getToken(LangParser.RETURN, 0); }
		public TerminalNode SEMICOLON() { return getToken(LangParser.SEMICOLON, 0); }
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
		public ReturnCmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnCmd; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitReturnCmd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnCmdContext returnCmd() throws RecognitionException {
		ReturnCmdContext _localctx = new ReturnCmdContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_returnCmd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ArrayList<Exp> es = new ArrayList<>(); 
			setState(256);
			match(RETURN);
			setState(257);
			((ReturnCmdContext)_localctx).e = exp();
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(258);
				match(COMMA);
				setState(259);
				((ReturnCmdContext)_localctx).e2 = exp();
				 es.add(((ReturnCmdContext)_localctx).e2.expr); 
				}
				}
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(267);
			match(SEMICOLON);

			        es.add(0, ((ReturnCmdContext)_localctx).e.expr);
			        ((ReturnCmdContext)_localctx).c =  new CRet(es);
			    
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignCmdContext extends ParserRuleContext {
		public CNode c;
		public Token simpleVar;
		public ExpContext e;
		public LvalueContext complexVar;
		public TerminalNode ATTR() { return getToken(LangParser.ATTR, 0); }
		public TerminalNode SEMICOLON() { return getToken(LangParser.SEMICOLON, 0); }
		public TerminalNode ID() { return getToken(LangParser.ID, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public AssignCmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignCmd; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitAssignCmd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignCmdContext assignCmd() throws RecognitionException {
		AssignCmdContext _localctx = new AssignCmdContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_assignCmd);
		try {
			setState(282);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
				((AssignCmdContext)_localctx).simpleVar = match(ID);
				setState(271);
				match(ATTR);
				setState(272);
				((AssignCmdContext)_localctx).e = exp();
				setState(273);
				match(SEMICOLON);

				        ((AssignCmdContext)_localctx).c =  new CAttr(new Var((((AssignCmdContext)_localctx).simpleVar!=null?((AssignCmdContext)_localctx).simpleVar.getText():null)), (Exp)((AssignCmdContext)_localctx).e.expr);
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(276);
				((AssignCmdContext)_localctx).complexVar = lvalue(0);
				setState(277);
				match(ATTR);
				setState(278);
				((AssignCmdContext)_localctx).e = exp();
				setState(279);
				match(SEMICOLON);

				        ((AssignCmdContext)_localctx).c =  new CAttr(((AssignCmdContext)_localctx).complexVar.lval, (Exp)((AssignCmdContext)_localctx).e.expr);
				    
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

	@SuppressWarnings("CheckReturnValue")
	public static class FuncCallCmdContext extends ParserRuleContext {
		public CNode c;
		public Token id;
		public ExpsContext args;
		public LvalueContext l;
		public LvalueContext l2;
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitFuncCallCmd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncCallCmdContext funcCallCmd() throws RecognitionException {
		FuncCallCmdContext _localctx = new FuncCallCmdContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_funcCallCmd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ArrayList<Exp> outArgsList = new ArrayList<>(); 
			setState(285);
			((FuncCallCmdContext)_localctx).id = match(ID);
			setState(286);
			match(LPAREN);
			setState(288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 536596571254792L) != 0)) {
				{
				setState(287);
				((FuncCallCmdContext)_localctx).args = exps();
				}
			}

			setState(290);
			match(RPAREN);
			setState(305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LESS_THAN) {
				{
				setState(291);
				match(LESS_THAN);
				setState(292);
				((FuncCallCmdContext)_localctx).l = lvalue(0);
				 outArgsList.add(((FuncCallCmdContext)_localctx).l.lval); 
				setState(300);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(294);
					match(COMMA);
					setState(295);
					((FuncCallCmdContext)_localctx).l2 = lvalue(0);
					 outArgsList.add(((FuncCallCmdContext)_localctx).l2.lval); 
					}
					}
					setState(302);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(303);
				match(GREATER_THAN);
				}
			}

			setState(307);
			match(SEMICOLON);

			        Exp[] argArray = ((((FuncCallCmdContext)_localctx).args!=null?_input.getText(((FuncCallCmdContext)_localctx).args.start,((FuncCallCmdContext)_localctx).args.stop):null) != null) ? ((FuncCallCmdContext)_localctx).args.exprs.toArray(new Exp[0]) : new Exp[0];
			        ((FuncCallCmdContext)_localctx).c =  new Call((((FuncCallCmdContext)_localctx).id!=null?((FuncCallCmdContext)_localctx).id.getText():null), argArray);
			    
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitLogicalOrExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalOrExpContext logicalOrExp() throws RecognitionException {
		LogicalOrExpContext _localctx = new LogicalOrExpContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_logicalOrExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			((LogicalOrExpContext)_localctx).e1 = logicalAndExp();
			 ((LogicalOrExpContext)_localctx).expr =  ((LogicalOrExpContext)_localctx).e1.expr; 
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LOGICAL_OR) {
				{
				{
				setState(315);
				match(LOGICAL_OR);
				setState(316);
				((LogicalOrExpContext)_localctx).e2 = logicalAndExp();
				 ((LogicalOrExpContext)_localctx).expr =  new Or(_localctx.expr, ((LogicalOrExpContext)_localctx).e2.expr); 
				}
				}
				setState(323);
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitLogicalAndExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalAndExpContext logicalAndExp() throws RecognitionException {
		LogicalAndExpContext _localctx = new LogicalAndExpContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_logicalAndExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			((LogicalAndExpContext)_localctx).e1 = equalityExp();
			 ((LogicalAndExpContext)_localctx).expr =  ((LogicalAndExpContext)_localctx).e1.expr; 
			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LOGICAL_AND) {
				{
				{
				setState(326);
				match(LOGICAL_AND);
				setState(327);
				((LogicalAndExpContext)_localctx).e2 = equalityExp();
				 ((LogicalAndExpContext)_localctx).expr =  new And(_localctx.expr, ((LogicalAndExpContext)_localctx).e2.expr); 
				}
				}
				setState(334);
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitEqualityExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityExpContext equalityExp() throws RecognitionException {
		EqualityExpContext _localctx = new EqualityExpContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_equalityExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			((EqualityExpContext)_localctx).e1 = relationalExp();
			 ((EqualityExpContext)_localctx).expr =  ((EqualityExpContext)_localctx).e1.expr; 
			setState(343);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQUALS || _la==NOT_EQUALS) {
				{
				{
				setState(337);
				_la = _input.LA(1);
				if ( !(_la==EQUALS || _la==NOT_EQUALS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(338);
				((EqualityExpContext)_localctx).e2 = relationalExp();
				 
				        if (((EqualityExpContext)_localctx).EQUALS != null) {
				            ((EqualityExpContext)_localctx).expr =  new Eq(_localctx.expr, ((EqualityExpContext)_localctx).e2.expr);
				        } else {
				            ((EqualityExpContext)_localctx).expr =  new Ne(_localctx.expr, ((EqualityExpContext)_localctx).e2.expr);
				        }
				     
				}
				}
				setState(345);
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitRelationalExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalExpContext relationalExp() throws RecognitionException {
		RelationalExpContext _localctx = new RelationalExpContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_relationalExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			((RelationalExpContext)_localctx).e1 = additiveExp();
			 ((RelationalExpContext)_localctx).expr =  ((RelationalExpContext)_localctx).e1.expr; 
			setState(354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4123168604160L) != 0)) {
				{
				{
				setState(348);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4123168604160L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(349);
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
				setState(356);
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitAdditiveExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExpContext additiveExp() throws RecognitionException {
		AdditiveExpContext _localctx = new AdditiveExpContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_additiveExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			((AdditiveExpContext)_localctx).e1 = multiplicativeExp();
			 ((AdditiveExpContext)_localctx).expr =  ((AdditiveExpContext)_localctx).e1.expr; 
			setState(365);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(359);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(360);
				((AdditiveExpContext)_localctx).e2 = multiplicativeExp();
				 
				        if (((AdditiveExpContext)_localctx).PLUS != null) {
				            ((AdditiveExpContext)_localctx).expr =  new Plus(_localctx.expr, ((AdditiveExpContext)_localctx).e2.expr);
				        } else {
				            ((AdditiveExpContext)_localctx).expr =  new Minus(_localctx.expr, ((AdditiveExpContext)_localctx).e2.expr);
				        }
				     
				}
				}
				setState(367);
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitMultiplicativeExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExpContext multiplicativeExp() throws RecognitionException {
		MultiplicativeExpContext _localctx = new MultiplicativeExpContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_multiplicativeExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			((MultiplicativeExpContext)_localctx).e1 = unaryExp();
			 ((MultiplicativeExpContext)_localctx).expr =  ((MultiplicativeExpContext)_localctx).e1.expr; 
			setState(376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7516192768L) != 0)) {
				{
				{
				setState(370);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7516192768L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(371);
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
				setState(378);
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitUnaryExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpContext unaryExp() throws RecognitionException {
		UnaryExpContext _localctx = new UnaryExpContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_unaryExp);
		int _la;
		try {
			setState(386);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
			case LOGICAL_NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(379);
				_la = _input.LA(1);
				if ( !(_la==MINUS || _la==LOGICAL_NOT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(380);
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
				setState(383);
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitPrimaryExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpContext primaryExp() throws RecognitionException {
		PrimaryExpContext _localctx = new PrimaryExpContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_primaryExp);
		int _la;
		try {
			setState(423);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(388);
				match(TRUE);
				 ((PrimaryExpContext)_localctx).expr =  new BoolLit(true); 
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(390);
				match(FALSE);
				 ((PrimaryExpContext)_localctx).expr =  new BoolLit(false); 
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 3);
				{
				setState(392);
				match(NULL);
				 ((PrimaryExpContext)_localctx).expr =  new CNull(); 
				}
				break;
			case INTLIT:
				enterOuterAlt(_localctx, 4);
				{
				setState(394);
				((PrimaryExpContext)_localctx).il = match(INTLIT);
				 ((PrimaryExpContext)_localctx).expr =  new IntLit(Integer.parseInt((((PrimaryExpContext)_localctx).il!=null?((PrimaryExpContext)_localctx).il.getText():null))); 
				}
				break;
			case FLOATLIT:
				enterOuterAlt(_localctx, 5);
				{
				setState(396);
				((PrimaryExpContext)_localctx).fl = match(FLOATLIT);
				 ((PrimaryExpContext)_localctx).expr =  new FloatLit(Float.parseFloat((((PrimaryExpContext)_localctx).fl!=null?((PrimaryExpContext)_localctx).fl.getText():null))); 
				}
				break;
			case CHARLIT:
				enterOuterAlt(_localctx, 6);
				{
				setState(398);
				((PrimaryExpContext)_localctx).cl = match(CHARLIT);
				 ((PrimaryExpContext)_localctx).expr =  new CharLit((((PrimaryExpContext)_localctx).cl!=null?((PrimaryExpContext)_localctx).cl.getText():null).charAt(0)); 
				}
				break;
			case STRINGLIT:
				enterOuterAlt(_localctx, 7);
				{
				setState(400);
				((PrimaryExpContext)_localctx).sl = match(STRINGLIT);
				 ((PrimaryExpContext)_localctx).expr =  new StringLit((((PrimaryExpContext)_localctx).sl!=null?((PrimaryExpContext)_localctx).sl.getText():null)); 
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 8);
				{
				setState(402);
				((PrimaryExpContext)_localctx).lv = lvalue(0);
				 ((PrimaryExpContext)_localctx).expr =  ((PrimaryExpContext)_localctx).lv.lval; 
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 9);
				{
				setState(405);
				match(LPAREN);
				setState(406);
				((PrimaryExpContext)_localctx).e = exp();
				setState(407);
				match(RPAREN);
				 ((PrimaryExpContext)_localctx).expr =  ((PrimaryExpContext)_localctx).e.expr; 
				}
				break;
			case NEW:
				enterOuterAlt(_localctx, 10);
				{
				setState(410);
				match(NEW);
				setState(411);
				((PrimaryExpContext)_localctx).type = type();
				setState(418);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(412);
					match(LBRACK);
					setState(413);
					((PrimaryExpContext)_localctx).e = exp();
					setState(414);
					match(RBRACK);
					}
					}
					setState(420);
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitLvalue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LvalueContext lvalue() throws RecognitionException {
		return lvalue(0);
	}

	private LvalueContext lvalue(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LvalueContext _localctx = new LvalueContext(_ctx, _parentState);
		LvalueContext _prevctx = _localctx;
		int _startState = 64;
		enterRecursionRule(_localctx, 64, RULE_lvalue, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(426);
			((LvalueContext)_localctx).id = match(ID);
			 ((LvalueContext)_localctx).lval =  new Var((((LvalueContext)_localctx).id!=null?((LvalueContext)_localctx).id.getText():null)); 
			}
			_ctx.stop = _input.LT(-1);
			setState(441);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(439);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
					case 1:
						{
						_localctx = new LvalueContext(_parentctx, _parentState);
						_localctx.lv = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_lvalue);
						setState(429);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(430);
						match(LBRACK);
						setState(431);
						((LvalueContext)_localctx).e = exp();
						setState(432);
						match(RBRACK);
						 
						                 ((LvalueContext)_localctx).lval =  new CArrayAccess(((LvalueContext)_localctx).lv.lval, ((LvalueContext)_localctx).e.expr); 
						                
						}
						break;
					case 2:
						{
						_localctx = new LvalueContext(_parentctx, _parentState);
						_localctx.lv = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_lvalue);
						setState(435);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(436);
						match(DOT);
						setState(437);
						((LvalueContext)_localctx).id = match(ID);

						                  ((LvalueContext)_localctx).lval =  new CFieldAccess(((LvalueContext)_localctx).lv.lval, (((LvalueContext)_localctx).id!=null?((LvalueContext)_localctx).id.getText():null)); 
						                 
						}
						break;
					}
					} 
				}
				setState(443);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitExps(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpsContext exps() throws RecognitionException {
		ExpsContext _localctx = new ExpsContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_exps);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((ExpsContext)_localctx).exprs =  new ArrayList<Exp>(); 
			setState(445);
			((ExpsContext)_localctx).exp = exp();
			 _localctx.exprs.add(((ExpsContext)_localctx).exp.expr); 
			setState(453);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(447);
				match(COMMA);
				setState(448);
				((ExpsContext)_localctx).exp = exp();
				 _localctx.exprs.add(((ExpsContext)_localctx).exp.expr); 
				}
				}
				setState(455);
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
		case 32:
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
		"\u0004\u00013\u01c9\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005"+
		"\u0001L\b\u0001\n\u0001\f\u0001O\t\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002W\b\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004d\b"+
		"\u0004\n\u0004\f\u0004g\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006r\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0081\b\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u008c"+
		"\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0005\t\u0099\b\t\n\t\f\t\u009c\t\t\u0001\n\u0001\n"+
		"\u0001\n\u0003\n\u00a1\b\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00b1\b\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00bb"+
		"\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00c3\b\r"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0003\u000e\u00dd\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0003\u0010\u00eb\b\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0005\u0014\u0107\b\u0014\n\u0014\f\u0014\u010a\t\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0003\u0015\u011b\b\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0003\u0016\u0121\b\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0005"+
		"\u0016\u012b\b\u0016\n\u0016\f\u0016\u012e\t\u0016\u0001\u0016\u0001\u0016"+
		"\u0003\u0016\u0132\b\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0005\u0018\u0140\b\u0018\n\u0018\f\u0018\u0143"+
		"\t\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0005\u0019\u014b\b\u0019\n\u0019\f\u0019\u014e\t\u0019\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a"+
		"\u0156\b\u001a\n\u001a\f\u001a\u0159\t\u001a\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u0161\b\u001b\n"+
		"\u001b\f\u001b\u0164\t\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u016c\b\u001c\n\u001c\f\u001c"+
		"\u016f\t\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0005\u001d\u0177\b\u001d\n\u001d\f\u001d\u017a\t\u001d\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0003\u001e\u0183\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0005\u001f\u01a1\b\u001f\n\u001f\f\u001f\u01a4\t\u001f\u0001\u001f"+
		"\u0001\u001f\u0003\u001f\u01a8\b\u001f\u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0005"+
		" \u01b8\b \n \f \u01bb\t \u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0005!\u01c4\b!\n!\f!\u01c7\t!\u0001!\u0000\u0001@\"\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,.02468:<>@B\u0000\u0005\u0001\u0000$%\u0001\u0000&)\u0001\u0000\u001c"+
		"\u001d\u0001\u0000\u001e \u0002\u0000\u001d\u001d##\u01d6\u0000D\u0001"+
		"\u0000\u0000\u0000\u0002G\u0001\u0000\u0000\u0000\u0004V\u0001\u0000\u0000"+
		"\u0000\u0006X\u0001\u0000\u0000\u0000\b_\u0001\u0000\u0000\u0000\nh\u0001"+
		"\u0000\u0000\u0000\fn\u0001\u0000\u0000\u0000\u000e\u0080\u0001\u0000"+
		"\u0000\u0000\u0010\u0082\u0001\u0000\u0000\u0000\u0012\u008d\u0001\u0000"+
		"\u0000\u0000\u0014\u009d\u0001\u0000\u0000\u0000\u0016\u00b0\u0001\u0000"+
		"\u0000\u0000\u0018\u00b2\u0001\u0000\u0000\u0000\u001a\u00bc\u0001\u0000"+
		"\u0000\u0000\u001c\u00dc\u0001\u0000\u0000\u0000\u001e\u00de\u0001\u0000"+
		"\u0000\u0000 \u00e3\u0001\u0000\u0000\u0000\"\u00ee\u0001\u0000\u0000"+
		"\u0000$\u00f5\u0001\u0000\u0000\u0000&\u00fa\u0001\u0000\u0000\u0000("+
		"\u00ff\u0001\u0000\u0000\u0000*\u011a\u0001\u0000\u0000\u0000,\u011c\u0001"+
		"\u0000\u0000\u0000.\u0136\u0001\u0000\u0000\u00000\u0139\u0001\u0000\u0000"+
		"\u00002\u0144\u0001\u0000\u0000\u00004\u014f\u0001\u0000\u0000\u00006"+
		"\u015a\u0001\u0000\u0000\u00008\u0165\u0001\u0000\u0000\u0000:\u0170\u0001"+
		"\u0000\u0000\u0000<\u0182\u0001\u0000\u0000\u0000>\u01a7\u0001\u0000\u0000"+
		"\u0000@\u01a9\u0001\u0000\u0000\u0000B\u01bc\u0001\u0000\u0000\u0000D"+
		"E\u0003\u0002\u0001\u0000EF\u0006\u0000\uffff\uffff\u0000F\u0001\u0001"+
		"\u0000\u0000\u0000GM\u0006\u0001\uffff\uffff\u0000HI\u0003\u0004\u0002"+
		"\u0000IJ\u0006\u0001\uffff\uffff\u0000JL\u0001\u0000\u0000\u0000KH\u0001"+
		"\u0000\u0000\u0000LO\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000"+
		"MN\u0001\u0000\u0000\u0000N\u0003\u0001\u0000\u0000\u0000OM\u0001\u0000"+
		"\u0000\u0000PQ\u0003\u0006\u0003\u0000QR\u0006\u0002\uffff\uffff\u0000"+
		"RW\u0001\u0000\u0000\u0000ST\u0003\f\u0006\u0000TU\u0006\u0002\uffff\uffff"+
		"\u0000UW\u0001\u0000\u0000\u0000VP\u0001\u0000\u0000\u0000VS\u0001\u0000"+
		"\u0000\u0000W\u0005\u0001\u0000\u0000\u0000XY\u0005\u000f\u0000\u0000"+
		"YZ\u0005,\u0000\u0000Z[\u0005\u0013\u0000\u0000[\\\u0003\b\u0004\u0000"+
		"\\]\u0005\u0014\u0000\u0000]^\u0006\u0003\uffff\uffff\u0000^\u0007\u0001"+
		"\u0000\u0000\u0000_e\u0006\u0004\uffff\uffff\u0000`a\u0003\n\u0005\u0000"+
		"ab\u0006\u0004\uffff\uffff\u0000bd\u0001\u0000\u0000\u0000c`\u0001\u0000"+
		"\u0000\u0000dg\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000ef\u0001"+
		"\u0000\u0000\u0000f\t\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000"+
		"hi\u0005+\u0000\u0000ij\u0005\u001a\u0000\u0000jk\u0003\u0014\n\u0000"+
		"kl\u0005\u0017\u0000\u0000lm\u0006\u0005\uffff\uffff\u0000m\u000b\u0001"+
		"\u0000\u0000\u0000no\u0005+\u0000\u0000oq\u0005\u0012\u0000\u0000pr\u0003"+
		"\u0012\t\u0000qp\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000rs\u0001"+
		"\u0000\u0000\u0000st\u0005\u0011\u0000\u0000tu\u0005\u001b\u0000\u0000"+
		"uv\u0003\u000e\u0007\u0000vw\u0005\u0013\u0000\u0000wx\u0003\u0018\f\u0000"+
		"xy\u0005\u0014\u0000\u0000yz\u0006\u0006\uffff\uffff\u0000z\r\u0001\u0000"+
		"\u0000\u0000{|\u0006\u0007\uffff\uffff\u0000|}\u0003\u0010\b\u0000}~\u0006"+
		"\u0007\uffff\uffff\u0000~\u0081\u0001\u0000\u0000\u0000\u007f\u0081\u0006"+
		"\u0007\uffff\uffff\u0000\u0080{\u0001\u0000\u0000\u0000\u0080\u007f\u0001"+
		"\u0000\u0000\u0000\u0081\u000f\u0001\u0000\u0000\u0000\u0082\u008b\u0006"+
		"\b\uffff\uffff\u0000\u0083\u0084\u0003\u0014\n\u0000\u0084\u0085\u0006"+
		"\b\uffff\uffff\u0000\u0085\u008c\u0001\u0000\u0000\u0000\u0086\u0087\u0003"+
		"\u0014\n\u0000\u0087\u0088\u0005\u0018\u0000\u0000\u0088\u0089\u0003\u0010"+
		"\b\u0000\u0089\u008a\u0006\b\uffff\uffff\u0000\u008a\u008c\u0001\u0000"+
		"\u0000\u0000\u008b\u0083\u0001\u0000\u0000\u0000\u008b\u0086\u0001\u0000"+
		"\u0000\u0000\u008c\u0011\u0001\u0000\u0000\u0000\u008d\u008e\u0006\t\uffff"+
		"\uffff\u0000\u008e\u008f\u0005+\u0000\u0000\u008f\u0090\u0005\u001a\u0000"+
		"\u0000\u0090\u0091\u0003\u0014\n\u0000\u0091\u009a\u0006\t\uffff\uffff"+
		"\u0000\u0092\u0093\u0005\u0018\u0000\u0000\u0093\u0094\u0005+\u0000\u0000"+
		"\u0094\u0095\u0005\u001a\u0000\u0000\u0095\u0096\u0003\u0014\n\u0000\u0096"+
		"\u0097\u0006\t\uffff\uffff\u0000\u0097\u0099\u0001\u0000\u0000\u0000\u0098"+
		"\u0092\u0001\u0000\u0000\u0000\u0099\u009c\u0001\u0000\u0000\u0000\u009a"+
		"\u0098\u0001\u0000\u0000\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b"+
		"\u0013\u0001\u0000\u0000\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009d"+
		"\u00a0\u0003\u0016\u000b\u0000\u009e\u009f\u0005\u0015\u0000\u0000\u009f"+
		"\u00a1\u0005\u0016\u0000\u0000\u00a0\u009e\u0001\u0000\u0000\u0000\u00a0"+
		"\u00a1\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2"+
		"\u00a3\u0006\n\uffff\uffff\u0000\u00a3\u0015\u0001\u0000\u0000\u0000\u00a4"+
		"\u00a5\u0005\u0007\u0000\u0000\u00a5\u00b1\u0006\u000b\uffff\uffff\u0000"+
		"\u00a6\u00a7\u0005\t\u0000\u0000\u00a7\u00b1\u0006\u000b\uffff\uffff\u0000"+
		"\u00a8\u00a9\u0005\n\u0000\u0000\u00a9\u00b1\u0006\u000b\uffff\uffff\u0000"+
		"\u00aa\u00ab\u0005\b\u0000\u0000\u00ab\u00b1\u0006\u000b\uffff\uffff\u0000"+
		"\u00ac\u00ad\u0005\u000b\u0000\u0000\u00ad\u00b1\u0006\u000b\uffff\uffff"+
		"\u0000\u00ae\u00af\u0005,\u0000\u0000\u00af\u00b1\u0006\u000b\uffff\uffff"+
		"\u0000\u00b0\u00a4\u0001\u0000\u0000\u0000\u00b0\u00a6\u0001\u0000\u0000"+
		"\u0000\u00b0\u00a8\u0001\u0000\u0000\u0000\u00b0\u00aa\u0001\u0000\u0000"+
		"\u0000\u00b0\u00ac\u0001\u0000\u0000\u0000\u00b0\u00ae\u0001\u0000\u0000"+
		"\u0000\u00b1\u0017\u0001\u0000\u0000\u0000\u00b2\u00ba\u0006\f\uffff\uffff"+
		"\u0000\u00b3\u00b4\u0003\u001c\u000e\u0000\u00b4\u00b5\u0003\u001a\r\u0000"+
		"\u00b5\u00b6\u0006\f\uffff\uffff\u0000\u00b6\u00bb\u0001\u0000\u0000\u0000"+
		"\u00b7\u00b8\u0003\u001c\u000e\u0000\u00b8\u00b9\u0006\f\uffff\uffff\u0000"+
		"\u00b9\u00bb\u0001\u0000\u0000\u0000\u00ba\u00b3\u0001\u0000\u0000\u0000"+
		"\u00ba\u00b7\u0001\u0000\u0000\u0000\u00bb\u0019\u0001\u0000\u0000\u0000"+
		"\u00bc\u00c2\u0006\r\uffff\uffff\u0000\u00bd\u00be\u0003\u001c\u000e\u0000"+
		"\u00be\u00bf\u0003\u001a\r\u0000\u00bf\u00c0\u0006\r\uffff\uffff\u0000"+
		"\u00c0\u00c3\u0001\u0000\u0000\u0000\u00c1\u00c3\u0006\r\uffff\uffff\u0000"+
		"\u00c2\u00bd\u0001\u0000\u0000\u0000\u00c2\u00c1\u0001\u0000\u0000\u0000"+
		"\u00c3\u001b\u0001\u0000\u0000\u0000\u00c4\u00c5\u0003\u001e\u000f\u0000"+
		"\u00c5\u00c6\u0006\u000e\uffff\uffff\u0000\u00c6\u00dd\u0001\u0000\u0000"+
		"\u0000\u00c7\u00c8\u0003 \u0010\u0000\u00c8\u00c9\u0006\u000e\uffff\uffff"+
		"\u0000\u00c9\u00dd\u0001\u0000\u0000\u0000\u00ca\u00cb\u0003\"\u0011\u0000"+
		"\u00cb\u00cc\u0006\u000e\uffff\uffff\u0000\u00cc\u00dd\u0001\u0000\u0000"+
		"\u0000\u00cd\u00ce\u0003$\u0012\u0000\u00ce\u00cf\u0006\u000e\uffff\uffff"+
		"\u0000\u00cf\u00dd\u0001\u0000\u0000\u0000\u00d0\u00d1\u0003&\u0013\u0000"+
		"\u00d1\u00d2\u0006\u000e\uffff\uffff\u0000\u00d2\u00dd\u0001\u0000\u0000"+
		"\u0000\u00d3\u00d4\u0003(\u0014\u0000\u00d4\u00d5\u0006\u000e\uffff\uffff"+
		"\u0000\u00d5\u00dd\u0001\u0000\u0000\u0000\u00d6\u00d7\u0003*\u0015\u0000"+
		"\u00d7\u00d8\u0006\u000e\uffff\uffff\u0000\u00d8\u00dd\u0001\u0000\u0000"+
		"\u0000\u00d9\u00da\u0003,\u0016\u0000\u00da\u00db\u0006\u000e\uffff\uffff"+
		"\u0000\u00db\u00dd\u0001\u0000\u0000\u0000\u00dc\u00c4\u0001\u0000\u0000"+
		"\u0000\u00dc\u00c7\u0001\u0000\u0000\u0000\u00dc\u00ca\u0001\u0000\u0000"+
		"\u0000\u00dc\u00cd\u0001\u0000\u0000\u0000\u00dc\u00d0\u0001\u0000\u0000"+
		"\u0000\u00dc\u00d3\u0001\u0000\u0000\u0000\u00dc\u00d6\u0001\u0000\u0000"+
		"\u0000\u00dc\u00d9\u0001\u0000\u0000\u0000\u00dd\u001d\u0001\u0000\u0000"+
		"\u0000\u00de\u00df\u0005\u0013\u0000\u0000\u00df\u00e0\u0003\u0018\f\u0000"+
		"\u00e0\u00e1\u0005\u0014\u0000\u0000\u00e1\u00e2\u0006\u000f\uffff\uffff"+
		"\u0000\u00e2\u001f\u0001\u0000\u0000\u0000\u00e3\u00e4\u0005\u0001\u0000"+
		"\u0000\u00e4\u00e5\u0005\u0012\u0000\u0000\u00e5\u00e6\u0003.\u0017\u0000"+
		"\u00e6\u00e7\u0005\u0011\u0000\u0000\u00e7\u00ea\u0003\u001c\u000e\u0000"+
		"\u00e8\u00e9\u0005\u0002\u0000\u0000\u00e9\u00eb\u0003\u001c\u000e\u0000"+
		"\u00ea\u00e8\u0001\u0000\u0000\u0000\u00ea\u00eb\u0001\u0000\u0000\u0000"+
		"\u00eb\u00ec\u0001\u0000\u0000\u0000\u00ec\u00ed\u0006\u0010\uffff\uffff"+
		"\u0000\u00ed!\u0001\u0000\u0000\u0000\u00ee\u00ef\u0005\u0005\u0000\u0000"+
		"\u00ef\u00f0\u0005\u0012\u0000\u0000\u00f0\u00f1\u0003.\u0017\u0000\u00f1"+
		"\u00f2\u0005\u0011\u0000\u0000\u00f2\u00f3\u0003\u001c\u000e\u0000\u00f3"+
		"\u00f4\u0006\u0011\uffff\uffff\u0000\u00f4#\u0001\u0000\u0000\u0000\u00f5"+
		"\u00f6\u0005\u0010\u0000\u0000\u00f6\u00f7\u0003@ \u0000\u00f7\u00f8\u0005"+
		"\u0017\u0000\u0000\u00f8\u00f9\u0006\u0012\uffff\uffff\u0000\u00f9%\u0001"+
		"\u0000\u0000\u0000\u00fa\u00fb\u0005\u0004\u0000\u0000\u00fb\u00fc\u0003"+
		".\u0017\u0000\u00fc\u00fd\u0005\u0017\u0000\u0000\u00fd\u00fe\u0006\u0013"+
		"\uffff\uffff\u0000\u00fe\'\u0001\u0000\u0000\u0000\u00ff\u0100\u0006\u0014"+
		"\uffff\uffff\u0000\u0100\u0101\u0005\u0006\u0000\u0000\u0101\u0108\u0003"+
		".\u0017\u0000\u0102\u0103\u0005\u0018\u0000\u0000\u0103\u0104\u0003.\u0017"+
		"\u0000\u0104\u0105\u0006\u0014\uffff\uffff\u0000\u0105\u0107\u0001\u0000"+
		"\u0000\u0000\u0106\u0102\u0001\u0000\u0000\u0000\u0107\u010a\u0001\u0000"+
		"\u0000\u0000\u0108\u0106\u0001\u0000\u0000\u0000\u0108\u0109\u0001\u0000"+
		"\u0000\u0000\u0109\u010b\u0001\u0000\u0000\u0000\u010a\u0108\u0001\u0000"+
		"\u0000\u0000\u010b\u010c\u0005\u0017\u0000\u0000\u010c\u010d\u0006\u0014"+
		"\uffff\uffff\u0000\u010d)\u0001\u0000\u0000\u0000\u010e\u010f\u0005+\u0000"+
		"\u0000\u010f\u0110\u0005*\u0000\u0000\u0110\u0111\u0003.\u0017\u0000\u0111"+
		"\u0112\u0005\u0017\u0000\u0000\u0112\u0113\u0006\u0015\uffff\uffff\u0000"+
		"\u0113\u011b\u0001\u0000\u0000\u0000\u0114\u0115\u0003@ \u0000\u0115\u0116"+
		"\u0005*\u0000\u0000\u0116\u0117\u0003.\u0017\u0000\u0117\u0118\u0005\u0017"+
		"\u0000\u0000\u0118\u0119\u0006\u0015\uffff\uffff\u0000\u0119\u011b\u0001"+
		"\u0000\u0000\u0000\u011a\u010e\u0001\u0000\u0000\u0000\u011a\u0114\u0001"+
		"\u0000\u0000\u0000\u011b+\u0001\u0000\u0000\u0000\u011c\u011d\u0006\u0016"+
		"\uffff\uffff\u0000\u011d\u011e\u0005+\u0000\u0000\u011e\u0120\u0005\u0012"+
		"\u0000\u0000\u011f\u0121\u0003B!\u0000\u0120\u011f\u0001\u0000\u0000\u0000"+
		"\u0120\u0121\u0001\u0000\u0000\u0000\u0121\u0122\u0001\u0000\u0000\u0000"+
		"\u0122\u0131\u0005\u0011\u0000\u0000\u0123\u0124\u0005&\u0000\u0000\u0124"+
		"\u0125\u0003@ \u0000\u0125\u012c\u0006\u0016\uffff\uffff\u0000\u0126\u0127"+
		"\u0005\u0018\u0000\u0000\u0127\u0128\u0003@ \u0000\u0128\u0129\u0006\u0016"+
		"\uffff\uffff\u0000\u0129\u012b\u0001\u0000\u0000\u0000\u012a\u0126\u0001"+
		"\u0000\u0000\u0000\u012b\u012e\u0001\u0000\u0000\u0000\u012c\u012a\u0001"+
		"\u0000\u0000\u0000\u012c\u012d\u0001\u0000\u0000\u0000\u012d\u012f\u0001"+
		"\u0000\u0000\u0000\u012e\u012c\u0001\u0000\u0000\u0000\u012f\u0130\u0005"+
		"\'\u0000\u0000\u0130\u0132\u0001\u0000\u0000\u0000\u0131\u0123\u0001\u0000"+
		"\u0000\u0000\u0131\u0132\u0001\u0000\u0000\u0000\u0132\u0133\u0001\u0000"+
		"\u0000\u0000\u0133\u0134\u0005\u0017\u0000\u0000\u0134\u0135\u0006\u0016"+
		"\uffff\uffff\u0000\u0135-\u0001\u0000\u0000\u0000\u0136\u0137\u00030\u0018"+
		"\u0000\u0137\u0138\u0006\u0017\uffff\uffff\u0000\u0138/\u0001\u0000\u0000"+
		"\u0000\u0139\u013a\u00032\u0019\u0000\u013a\u0141\u0006\u0018\uffff\uffff"+
		"\u0000\u013b\u013c\u0005\"\u0000\u0000\u013c\u013d\u00032\u0019\u0000"+
		"\u013d\u013e\u0006\u0018\uffff\uffff\u0000\u013e\u0140\u0001\u0000\u0000"+
		"\u0000\u013f\u013b\u0001\u0000\u0000\u0000\u0140\u0143\u0001\u0000\u0000"+
		"\u0000\u0141\u013f\u0001\u0000\u0000\u0000\u0141\u0142\u0001\u0000\u0000"+
		"\u0000\u01421\u0001\u0000\u0000\u0000\u0143\u0141\u0001\u0000\u0000\u0000"+
		"\u0144\u0145\u00034\u001a\u0000\u0145\u014c\u0006\u0019\uffff\uffff\u0000"+
		"\u0146\u0147\u0005!\u0000\u0000\u0147\u0148\u00034\u001a\u0000\u0148\u0149"+
		"\u0006\u0019\uffff\uffff\u0000\u0149\u014b\u0001\u0000\u0000\u0000\u014a"+
		"\u0146\u0001\u0000\u0000\u0000\u014b\u014e\u0001\u0000\u0000\u0000\u014c"+
		"\u014a\u0001\u0000\u0000\u0000\u014c\u014d\u0001\u0000\u0000\u0000\u014d"+
		"3\u0001\u0000\u0000\u0000\u014e\u014c\u0001\u0000\u0000\u0000\u014f\u0150"+
		"\u00036\u001b\u0000\u0150\u0157\u0006\u001a\uffff\uffff\u0000\u0151\u0152"+
		"\u0007\u0000\u0000\u0000\u0152\u0153\u00036\u001b\u0000\u0153\u0154\u0006"+
		"\u001a\uffff\uffff\u0000\u0154\u0156\u0001\u0000\u0000\u0000\u0155\u0151"+
		"\u0001\u0000\u0000\u0000\u0156\u0159\u0001\u0000\u0000\u0000\u0157\u0155"+
		"\u0001\u0000\u0000\u0000\u0157\u0158\u0001\u0000\u0000\u0000\u01585\u0001"+
		"\u0000\u0000\u0000\u0159\u0157\u0001\u0000\u0000\u0000\u015a\u015b\u0003"+
		"8\u001c\u0000\u015b\u0162\u0006\u001b\uffff\uffff\u0000\u015c\u015d\u0007"+
		"\u0001\u0000\u0000\u015d\u015e\u00038\u001c\u0000\u015e\u015f\u0006\u001b"+
		"\uffff\uffff\u0000\u015f\u0161\u0001\u0000\u0000\u0000\u0160\u015c\u0001"+
		"\u0000\u0000\u0000\u0161\u0164\u0001\u0000\u0000\u0000\u0162\u0160\u0001"+
		"\u0000\u0000\u0000\u0162\u0163\u0001\u0000\u0000\u0000\u01637\u0001\u0000"+
		"\u0000\u0000\u0164\u0162\u0001\u0000\u0000\u0000\u0165\u0166\u0003:\u001d"+
		"\u0000\u0166\u016d\u0006\u001c\uffff\uffff\u0000\u0167\u0168\u0007\u0002"+
		"\u0000\u0000\u0168\u0169\u0003:\u001d\u0000\u0169\u016a\u0006\u001c\uffff"+
		"\uffff\u0000\u016a\u016c\u0001\u0000\u0000\u0000\u016b\u0167\u0001\u0000"+
		"\u0000\u0000\u016c\u016f\u0001\u0000\u0000\u0000\u016d\u016b\u0001\u0000"+
		"\u0000\u0000\u016d\u016e\u0001\u0000\u0000\u0000\u016e9\u0001\u0000\u0000"+
		"\u0000\u016f\u016d\u0001\u0000\u0000\u0000\u0170\u0171\u0003<\u001e\u0000"+
		"\u0171\u0178\u0006\u001d\uffff\uffff\u0000\u0172\u0173\u0007\u0003\u0000"+
		"\u0000\u0173\u0174\u0003<\u001e\u0000\u0174\u0175\u0006\u001d\uffff\uffff"+
		"\u0000\u0175\u0177\u0001\u0000\u0000\u0000\u0176\u0172\u0001\u0000\u0000"+
		"\u0000\u0177\u017a\u0001\u0000\u0000\u0000\u0178\u0176\u0001\u0000\u0000"+
		"\u0000\u0178\u0179\u0001\u0000\u0000\u0000\u0179;\u0001\u0000\u0000\u0000"+
		"\u017a\u0178\u0001\u0000\u0000\u0000\u017b\u017c\u0007\u0004\u0000\u0000"+
		"\u017c\u017d\u0003<\u001e\u0000\u017d\u017e\u0006\u001e\uffff\uffff\u0000"+
		"\u017e\u0183\u0001\u0000\u0000\u0000\u017f\u0180\u0003>\u001f\u0000\u0180"+
		"\u0181\u0006\u001e\uffff\uffff\u0000\u0181\u0183\u0001\u0000\u0000\u0000"+
		"\u0182\u017b\u0001\u0000\u0000\u0000\u0182\u017f\u0001\u0000\u0000\u0000"+
		"\u0183=\u0001\u0000\u0000\u0000\u0184\u0185\u0005\f\u0000\u0000\u0185"+
		"\u01a8\u0006\u001f\uffff\uffff\u0000\u0186\u0187\u0005\r\u0000\u0000\u0187"+
		"\u01a8\u0006\u001f\uffff\uffff\u0000\u0188\u0189\u0005\u000e\u0000\u0000"+
		"\u0189\u01a8\u0006\u001f\uffff\uffff\u0000\u018a\u018b\u0005-\u0000\u0000"+
		"\u018b\u01a8\u0006\u001f\uffff\uffff\u0000\u018c\u018d\u0005.\u0000\u0000"+
		"\u018d\u01a8\u0006\u001f\uffff\uffff\u0000\u018e\u018f\u0005/\u0000\u0000"+
		"\u018f\u01a8\u0006\u001f\uffff\uffff\u0000\u0190\u0191\u00050\u0000\u0000"+
		"\u0191\u01a8\u0006\u001f\uffff\uffff\u0000\u0192\u0193\u0003@ \u0000\u0193"+
		"\u0194\u0006\u001f\uffff\uffff\u0000\u0194\u01a8\u0001\u0000\u0000\u0000"+
		"\u0195\u0196\u0005\u0012\u0000\u0000\u0196\u0197\u0003.\u0017\u0000\u0197"+
		"\u0198\u0005\u0011\u0000\u0000\u0198\u0199\u0006\u001f\uffff\uffff\u0000"+
		"\u0199\u01a8\u0001\u0000\u0000\u0000\u019a\u019b\u0005\u0003\u0000\u0000"+
		"\u019b\u01a2\u0003\u0014\n\u0000\u019c\u019d\u0005\u0015\u0000\u0000\u019d"+
		"\u019e\u0003.\u0017\u0000\u019e\u019f\u0005\u0016\u0000\u0000\u019f\u01a1"+
		"\u0001\u0000\u0000\u0000\u01a0\u019c\u0001\u0000\u0000\u0000\u01a1\u01a4"+
		"\u0001\u0000\u0000\u0000\u01a2\u01a0\u0001\u0000\u0000\u0000\u01a2\u01a3"+
		"\u0001\u0000\u0000\u0000\u01a3\u01a5\u0001\u0000\u0000\u0000\u01a4\u01a2"+
		"\u0001\u0000\u0000\u0000\u01a5\u01a6\u0006\u001f\uffff\uffff\u0000\u01a6"+
		"\u01a8\u0001\u0000\u0000\u0000\u01a7\u0184\u0001\u0000\u0000\u0000\u01a7"+
		"\u0186\u0001\u0000\u0000\u0000\u01a7\u0188\u0001\u0000\u0000\u0000\u01a7"+
		"\u018a\u0001\u0000\u0000\u0000\u01a7\u018c\u0001\u0000\u0000\u0000\u01a7"+
		"\u018e\u0001\u0000\u0000\u0000\u01a7\u0190\u0001\u0000\u0000\u0000\u01a7"+
		"\u0192\u0001\u0000\u0000\u0000\u01a7\u0195\u0001\u0000\u0000\u0000\u01a7"+
		"\u019a\u0001\u0000\u0000\u0000\u01a8?\u0001\u0000\u0000\u0000\u01a9\u01aa"+
		"\u0006 \uffff\uffff\u0000\u01aa\u01ab\u0005+\u0000\u0000\u01ab\u01ac\u0006"+
		" \uffff\uffff\u0000\u01ac\u01b9\u0001\u0000\u0000\u0000\u01ad\u01ae\n"+
		"\u0002\u0000\u0000\u01ae\u01af\u0005\u0015\u0000\u0000\u01af\u01b0\u0003"+
		".\u0017\u0000\u01b0\u01b1\u0005\u0016\u0000\u0000\u01b1\u01b2\u0006 \uffff"+
		"\uffff\u0000\u01b2\u01b8\u0001\u0000\u0000\u0000\u01b3\u01b4\n\u0001\u0000"+
		"\u0000\u01b4\u01b5\u0005\u0019\u0000\u0000\u01b5\u01b6\u0005+\u0000\u0000"+
		"\u01b6\u01b8\u0006 \uffff\uffff\u0000\u01b7\u01ad\u0001\u0000\u0000\u0000"+
		"\u01b7\u01b3\u0001\u0000\u0000\u0000\u01b8\u01bb\u0001\u0000\u0000\u0000"+
		"\u01b9\u01b7\u0001\u0000\u0000\u0000\u01b9\u01ba\u0001\u0000\u0000\u0000"+
		"\u01baA\u0001\u0000\u0000\u0000\u01bb\u01b9\u0001\u0000\u0000\u0000\u01bc"+
		"\u01bd\u0006!\uffff\uffff\u0000\u01bd\u01be\u0003.\u0017\u0000\u01be\u01c5"+
		"\u0006!\uffff\uffff\u0000\u01bf\u01c0\u0005\u0018\u0000\u0000\u01c0\u01c1"+
		"\u0003.\u0017\u0000\u01c1\u01c2\u0006!\uffff\uffff\u0000\u01c2\u01c4\u0001"+
		"\u0000\u0000\u0000\u01c3\u01bf\u0001\u0000\u0000\u0000\u01c4\u01c7\u0001"+
		"\u0000\u0000\u0000\u01c5\u01c3\u0001\u0000\u0000\u0000\u01c5\u01c6\u0001"+
		"\u0000\u0000\u0000\u01c6C\u0001\u0000\u0000\u0000\u01c7\u01c5\u0001\u0000"+
		"\u0000\u0000\u001eMVeq\u0080\u008b\u009a\u00a0\u00b0\u00ba\u00c2\u00dc"+
		"\u00ea\u0108\u011a\u0120\u012c\u0131\u0141\u014c\u0157\u0162\u016d\u0178"+
		"\u0182\u01a2\u01a7\u01b7\u01b9\u01c5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}