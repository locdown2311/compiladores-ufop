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
		RULE_func = 5, RULE_params = 6, RULE_type = 7, RULE_btype = 8, RULE_cmd = 9, 
		RULE_block = 10, RULE_ifCmd = 11, RULE_iterateCmd = 12, RULE_readCmd = 13, 
		RULE_printCmd = 14, RULE_returnCmd = 15, RULE_assignCmd = 16, RULE_funcCallCmd = 17, 
		RULE_exp = 18, RULE_logicalOrExp = 19, RULE_logicalAndExp = 20, RULE_equalityExp = 21, 
		RULE_relationalExp = 22, RULE_additiveExp = 23, RULE_multiplicativeExp = 24, 
		RULE_unaryExp = 25, RULE_primaryExp = 26, RULE_lvalue = 27, RULE_exps = 28;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "defList", "def", "data", "decl", "func", "params", "type", "btype", 
			"cmd", "block", "ifCmd", "iterateCmd", "readCmd", "printCmd", "returnCmd", 
			"assignCmd", "funcCallCmd", "exp", "logicalOrExp", "logicalAndExp", "equalityExp", 
			"relationalExp", "additiveExp", "multiplicativeExp", "unaryExp", "primaryExp", 
			"lvalue", "exps"
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
			setState(58);
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
			setState(68);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				((DefListContext)_localctx).d = def();
				setState(62);
				((DefListContext)_localctx).defList = defList();
				((DefListContext)_localctx).defList.df.add( ((DefListContext)_localctx).d.d);  
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
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
			setState(76);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DATA:
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				((DefContext)_localctx).data = data();
				((DefContext)_localctx).d =  ((DefContext)_localctx).data.d; 
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
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
			setState(78);
			match(DATA);
			setState(79);
			((DataContext)_localctx).typeName = match(TYPE);
			setState(80);
			match(LBRACE);
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(81);
				((DataContext)_localctx).decls = decl();
				}
				}
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(87);
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
			setState(90);
			((DeclContext)_localctx).id = match(ID);
			setState(91);
			match(DOUBLE_COLON);
			setState(92);
			((DeclContext)_localctx).t = type();
			setState(93);
			match(SEMICOLON);

			          System.out.println("Declarando variável: " + (((DeclContext)_localctx).id!=null?((DeclContext)_localctx).id.getText():null) + " do tipo " + ((DeclContext)_localctx).t.t);
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
		public TypeContext type;
		public List<TypeContext> retTypes = new ArrayList<TypeContext>();
		public CmdContext cmd;
		public List<CmdContext> cmds = new ArrayList<CmdContext>();
		public TerminalNode LPAREN() { return getToken(LangParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(LangParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(LangParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(LangParser.RBRACE, 0); }
		public TerminalNode ID() { return getToken(LangParser.ID, 0); }
		public TerminalNode COLON() { return getToken(LangParser.COLON, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
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
		enterRule(_localctx, 10, RULE_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			((FuncContext)_localctx).id = match(ID);
			setState(97);
			match(LPAREN);
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(98);
				((FuncContext)_localctx).p = params();
				}
			}

			setState(101);
			match(RPAREN);
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(102);
				match(COLON);
				setState(103);
				((FuncContext)_localctx).type = type();
				((FuncContext)_localctx).retTypes.add(((FuncContext)_localctx).type);
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(104);
					match(COMMA);
					setState(105);
					((FuncContext)_localctx).type = type();
					((FuncContext)_localctx).retTypes.add(((FuncContext)_localctx).type);
					}
					}
					setState(110);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(113);
			match(LBRACE);
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << PRINT) | (1L << ITERATE) | (1L << RETURN) | (1L << READ) | (1L << LBRACE) | (1L << ID))) != 0)) {
				{
				{
				setState(114);
				((FuncContext)_localctx).cmd = cmd();
				((FuncContext)_localctx).cmds.add(((FuncContext)_localctx).cmd);
				}
				}
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(120);
			match(RBRACE);

			          List<CNode> commandList = new ArrayList<>();
			          if (((FuncContext)_localctx).cmds != null) {
			              commandList.addAll(((FuncContext)_localctx).cmds);
			          }
			          CType[] returnTypes = (((FuncContext)_localctx).retTypes != null) ? ((FuncContext)_localctx).retTypes.toArray(new CType[0]) : new CType[0];
			          CVarDec[] paramsArray = (((FuncContext)_localctx).p.paramList != null) ? ((FuncContext)_localctx).p.paramList.toArray(new CVarDec[0]) : new CVarDec[0];
			          
			          ((FuncContext)_localctx).d =  new CFuncDef((((FuncContext)_localctx).id!=null?((FuncContext)_localctx).id.getText():null), paramsArray, returnTypes, new CBlock(commandList.toArray(new CNode[0])));      
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
		enterRule(_localctx, 12, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((ParamsContext)_localctx).paramList =  new ArrayList<CVarDec>(); 
			setState(124);
			((ParamsContext)_localctx).ID = match(ID);
			setState(125);
			match(DOUBLE_COLON);
			setState(126);
			((ParamsContext)_localctx).type = type();
			 _localctx.paramList.add(new CVarDec((((ParamsContext)_localctx).ID!=null?((ParamsContext)_localctx).ID.getText():null), ((ParamsContext)_localctx).type.t)); 
			setState(136);
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
				 _localctx.paramList.add(new CVarDec((((ParamsContext)_localctx).ID!=null?((ParamsContext)_localctx).ID.getText():null), ((ParamsContext)_localctx).type.t)); 
				}
				}
				setState(138);
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
		enterRule(_localctx, 14, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			((TypeContext)_localctx).btype = btype();
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
		enterRule(_localctx, 16, RULE_btype);
		try {
			setState(158);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				match(INT);
				 ((BtypeContext)_localctx).base =  CBaseType.INT; 
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				match(CHAR);
				 ((BtypeContext)_localctx).base =  CBaseType.CHAR; 
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 3);
				{
				setState(150);
				match(BOOLEAN);
				 ((BtypeContext)_localctx).base =  CBaseType.BOOL; 
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 4);
				{
				setState(152);
				match(FLOAT);
				 ((BtypeContext)_localctx).base =  CBaseType.FLOAT; 
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 5);
				{
				setState(154);
				match(VOID);
				 ((BtypeContext)_localctx).base =  CBaseType.VOID; 
				}
				break;
			case TYPE:
				enterOuterAlt(_localctx, 6);
				{
				setState(156);
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
		enterRule(_localctx, 18, RULE_cmd);
		try {
			setState(182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				((CmdContext)_localctx).block = block();
				 ((CmdContext)_localctx).c =  new CBlock(((CmdContext)_localctx).block.rcmds); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				((CmdContext)_localctx).ifCmd = ifCmd();
				 ((CmdContext)_localctx).c =  ((CmdContext)_localctx).ifCmd.c; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(166);
				((CmdContext)_localctx).iterateCmd = iterateCmd();
				 ((CmdContext)_localctx).c =  ((CmdContext)_localctx).iterateCmd.c; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(169);
				((CmdContext)_localctx).readCmd = readCmd();
				 ((CmdContext)_localctx).c =  ((CmdContext)_localctx).readCmd.c; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(172);
				((CmdContext)_localctx).printCmd = printCmd();
				 ((CmdContext)_localctx).c =  ((CmdContext)_localctx).printCmd.c; 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(175);
				((CmdContext)_localctx).returnCmd = returnCmd();
				 ((CmdContext)_localctx).c =  ((CmdContext)_localctx).returnCmd.c; 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(178);
				((CmdContext)_localctx).assignCmd = assignCmd();
				 ((CmdContext)_localctx).c =  ((CmdContext)_localctx).assignCmd.c; 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(181);
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
		public CNode[] rcmds;
		public CmdContext cmd;
		public List<CmdContext> cmds = new ArrayList<CmdContext>();
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
		enterRule(_localctx, 20, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(LBRACE);
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << PRINT) | (1L << ITERATE) | (1L << RETURN) | (1L << READ) | (1L << LBRACE) | (1L << ID))) != 0)) {
				{
				{
				setState(185);
				((BlockContext)_localctx).cmd = cmd();
				((BlockContext)_localctx).cmds.add(((BlockContext)_localctx).cmd);
				}
				}
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(191);
			match(RBRACE);

			      ((BlockContext)_localctx).rcmds =  ((BlockContext)_localctx).cmds.toArray(new CNode[((BlockContext)_localctx).cmds.size()]);
			   
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
		enterRule(_localctx, 22, RULE_ifCmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(IF);
			setState(195);
			match(LPAREN);
			setState(196);
			((IfCmdContext)_localctx).e = exp();
			setState(197);
			match(RPAREN);
			setState(198);
			((IfCmdContext)_localctx).thenCmd = cmd();
			setState(201);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(199);
				((IfCmdContext)_localctx).ELSE = match(ELSE);
				setState(200);
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
		enterRule(_localctx, 24, RULE_iterateCmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(ITERATE);
			setState(206);
			match(LPAREN);
			setState(207);
			((IterateCmdContext)_localctx).e = exp();
			setState(208);
			match(RPAREN);
			setState(209);
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
		enterRule(_localctx, 26, RULE_readCmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(READ);
			setState(213);
			((ReadCmdContext)_localctx).l = lvalue(0);
			setState(214);
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
		enterRule(_localctx, 28, RULE_printCmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(PRINT);
			setState(218);
			((PrintCmdContext)_localctx).e = exp();
			setState(219);
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

	public static class ReturnCmdContext extends ParserRuleContext {
		public CNode c;
		public ExpContext e;
		public ExpContext exp;
		public List<ExpContext> es = new ArrayList<ExpContext>();
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
	}

	public final ReturnCmdContext returnCmd() throws RecognitionException {
		ReturnCmdContext _localctx = new ReturnCmdContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_returnCmd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(RETURN);
			setState(223);
			((ReturnCmdContext)_localctx).e = exp();
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(224);
				match(COMMA);
				setState(225);
				((ReturnCmdContext)_localctx).exp = exp();
				((ReturnCmdContext)_localctx).es.add(((ReturnCmdContext)_localctx).exp);
				}
				}
				setState(230);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(231);
			match(SEMICOLON);

			      List<Exp> exprList = new ArrayList<>();
			      exprList.add(((ReturnCmdContext)_localctx).e.expr);
			      
			      if (((ReturnCmdContext)_localctx).es != null) {
			          for (Exp exp : ((ReturnCmdContext)_localctx).es) {
			              exprList.add(exp);
			          }
			      }
			      
			      ((ReturnCmdContext)_localctx).c =  new CRet(exprList.toArray(new Exp[0]));
			   
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
		enterRule(_localctx, 32, RULE_assignCmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			((AssignCmdContext)_localctx).l = lvalue(0);
			setState(235);
			match(ATTR);
			setState(236);
			((AssignCmdContext)_localctx).e = exp();
			setState(237);
			match(SEMICOLON);

			      ((AssignCmdContext)_localctx).c =  new CAttr(((AssignCmdContext)_localctx).l.lval, ((AssignCmdContext)_localctx).e.expr);
			   
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
		enterRule(_localctx, 34, RULE_funcCallCmd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			((FuncCallCmdContext)_localctx).id = match(ID);
			setState(241);
			match(LPAREN);
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << LPAREN) | (1L << MINUS) | (1L << LOGICAL_NOT) | (1L << ID) | (1L << INTLIT) | (1L << FLOATLIT) | (1L << CHARLIT) | (1L << STRINGLIT))) != 0)) {
				{
				setState(242);
				((FuncCallCmdContext)_localctx).args = exps();
				}
			}

			setState(245);
			match(RPAREN);
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LESS_THAN) {
				{
				setState(246);
				match(LESS_THAN);
				setState(247);
				((FuncCallCmdContext)_localctx).lvalue = lvalue(0);
				((FuncCallCmdContext)_localctx).outArgs.add(((FuncCallCmdContext)_localctx).lvalue);
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(248);
					match(COMMA);
					setState(249);
					((FuncCallCmdContext)_localctx).lvalue = lvalue(0);
					((FuncCallCmdContext)_localctx).outArgs.add(((FuncCallCmdContext)_localctx).lvalue);
					}
					}
					setState(254);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(255);
				match(GREATER_THAN);
				}
			}

			setState(259);
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
		enterRule(_localctx, 36, RULE_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
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
		enterRule(_localctx, 38, RULE_logicalOrExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			((LogicalOrExpContext)_localctx).e1 = logicalAndExp();
			 ((LogicalOrExpContext)_localctx).expr =  ((LogicalOrExpContext)_localctx).e1.expr; 
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LOGICAL_OR) {
				{
				{
				setState(267);
				match(LOGICAL_OR);
				setState(268);
				((LogicalOrExpContext)_localctx).e2 = logicalAndExp();
				 ((LogicalOrExpContext)_localctx).expr =  new Or(_localctx.expr, ((LogicalOrExpContext)_localctx).e2.expr); 
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
		enterRule(_localctx, 40, RULE_logicalAndExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			((LogicalAndExpContext)_localctx).e1 = equalityExp();
			 ((LogicalAndExpContext)_localctx).expr =  ((LogicalAndExpContext)_localctx).e1.expr; 
			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LOGICAL_AND) {
				{
				{
				setState(278);
				match(LOGICAL_AND);
				setState(279);
				((LogicalAndExpContext)_localctx).e2 = equalityExp();
				 ((LogicalAndExpContext)_localctx).expr =  new And(_localctx.expr, ((LogicalAndExpContext)_localctx).e2.expr); 
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
		enterRule(_localctx, 42, RULE_equalityExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			((EqualityExpContext)_localctx).e1 = relationalExp();
			 ((EqualityExpContext)_localctx).expr =  ((EqualityExpContext)_localctx).e1.expr; 
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQUALS || _la==NOT_EQUALS) {
				{
				{
				setState(289);
				_la = _input.LA(1);
				if ( !(_la==EQUALS || _la==NOT_EQUALS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(290);
				((EqualityExpContext)_localctx).e2 = relationalExp();
				 
				        if (((EqualityExpContext)_localctx).EQUALS != null) {
				            ((EqualityExpContext)_localctx).expr =  new Eq(_localctx.expr, ((EqualityExpContext)_localctx).e2.expr);
				        } else {
				            ((EqualityExpContext)_localctx).expr =  new Ne(_localctx.expr, ((EqualityExpContext)_localctx).e2.expr);
				        }
				     
				}
				}
				setState(297);
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
		enterRule(_localctx, 44, RULE_relationalExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			((RelationalExpContext)_localctx).e1 = additiveExp();
			 ((RelationalExpContext)_localctx).expr =  ((RelationalExpContext)_localctx).e1.expr; 
			setState(306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS_THAN) | (1L << GREATER_THAN) | (1L << LESS_OR_EQUAL) | (1L << GREATER_OR_EQUAL))) != 0)) {
				{
				{
				setState(300);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS_THAN) | (1L << GREATER_THAN) | (1L << LESS_OR_EQUAL) | (1L << GREATER_OR_EQUAL))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(301);
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
				setState(308);
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
		enterRule(_localctx, 46, RULE_additiveExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			((AdditiveExpContext)_localctx).e1 = multiplicativeExp();
			 ((AdditiveExpContext)_localctx).expr =  ((AdditiveExpContext)_localctx).e1.expr; 
			setState(317);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(311);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(312);
				((AdditiveExpContext)_localctx).e2 = multiplicativeExp();
				 
				        if (((AdditiveExpContext)_localctx).PLUS != null) {
				            ((AdditiveExpContext)_localctx).expr =  new Plus(_localctx.expr, ((AdditiveExpContext)_localctx).e2.expr);
				        } else {
				            ((AdditiveExpContext)_localctx).expr =  new Minus(_localctx.expr, ((AdditiveExpContext)_localctx).e2.expr);
				        }
				     
				}
				}
				setState(319);
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
		enterRule(_localctx, 48, RULE_multiplicativeExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			((MultiplicativeExpContext)_localctx).e1 = unaryExp();
			 ((MultiplicativeExpContext)_localctx).expr =  ((MultiplicativeExpContext)_localctx).e1.expr; 
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIMES) | (1L << DIVIDE) | (1L << MOD))) != 0)) {
				{
				{
				setState(322);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIMES) | (1L << DIVIDE) | (1L << MOD))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(323);
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
		enterRule(_localctx, 50, RULE_unaryExp);
		int _la;
		try {
			setState(338);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
			case LOGICAL_NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(331);
				_la = _input.LA(1);
				if ( !(_la==MINUS || _la==LOGICAL_NOT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(332);
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
				setState(335);
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
		public Token il;
		public Token fl;
		public Token cl;
		public Token sl;
		public LvalueContext lv;
		public ExpContext e;
		public TypeContext t;
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
		enterRule(_localctx, 52, RULE_primaryExp);
		int _la;
		try {
			setState(375);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(340);
				match(TRUE);
				 ((PrimaryExpContext)_localctx).expr =  new BoolLit(true); 
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(342);
				match(FALSE);
				 ((PrimaryExpContext)_localctx).expr =  new BoolLit(false); 
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 3);
				{
				setState(344);
				match(NULL);
				 ((PrimaryExpContext)_localctx).expr =  new CNull(); 
				}
				break;
			case INTLIT:
				enterOuterAlt(_localctx, 4);
				{
				setState(346);
				((PrimaryExpContext)_localctx).il = match(INTLIT);
				 ((PrimaryExpContext)_localctx).expr =  new IntLit(Integer.parseInt((((PrimaryExpContext)_localctx).il!=null?((PrimaryExpContext)_localctx).il.getText():null))); 
				}
				break;
			case FLOATLIT:
				enterOuterAlt(_localctx, 5);
				{
				setState(348);
				((PrimaryExpContext)_localctx).fl = match(FLOATLIT);
				 ((PrimaryExpContext)_localctx).expr =  new FloatLit(Float.parseFloat((((PrimaryExpContext)_localctx).fl!=null?((PrimaryExpContext)_localctx).fl.getText():null))); 
				}
				break;
			case CHARLIT:
				enterOuterAlt(_localctx, 6);
				{
				setState(350);
				((PrimaryExpContext)_localctx).cl = match(CHARLIT);
				 ((PrimaryExpContext)_localctx).expr =  new CharLit((((PrimaryExpContext)_localctx).cl!=null?((PrimaryExpContext)_localctx).cl.getText():null).charAt(0)); 
				}
				break;
			case STRINGLIT:
				enterOuterAlt(_localctx, 7);
				{
				setState(352);
				((PrimaryExpContext)_localctx).sl = match(STRINGLIT);
				 ((PrimaryExpContext)_localctx).expr =  new StringLit((((PrimaryExpContext)_localctx).sl!=null?((PrimaryExpContext)_localctx).sl.getText():null)); 
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 8);
				{
				setState(354);
				((PrimaryExpContext)_localctx).lv = lvalue(0);
				 ((PrimaryExpContext)_localctx).expr =  ((PrimaryExpContext)_localctx).lv.lval; 
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 9);
				{
				setState(357);
				match(LPAREN);
				setState(358);
				((PrimaryExpContext)_localctx).e = exp();
				setState(359);
				match(RPAREN);
				 ((PrimaryExpContext)_localctx).expr =  ((PrimaryExpContext)_localctx).e.expr; 
				}
				break;
			case NEW:
				enterOuterAlt(_localctx, 10);
				{
				setState(362);
				match(NEW);
				setState(363);
				((PrimaryExpContext)_localctx).t = type();
				setState(370);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(364);
					match(LBRACK);
					setState(365);
					((PrimaryExpContext)_localctx).e = exp();
					setState(366);
					match(RBRACK);
					}
					}
					setState(372);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				 
				      
				     
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
		int _startState = 54;
		enterRecursionRule(_localctx, 54, RULE_lvalue, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(378);
			((LvalueContext)_localctx).id = match(ID);
			 ((LvalueContext)_localctx).lval =  new Var((((LvalueContext)_localctx).id!=null?((LvalueContext)_localctx).id.getText():null)); 
			}
			_ctx.stop = _input.LT(-1);
			setState(393);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(391);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
						_localctx = new LvalueContext(_parentctx, _parentState);
						_localctx.lv = _prevctx;
						_localctx.lv = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_lvalue);
						setState(381);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(382);
						match(LBRACK);
						setState(383);
						((LvalueContext)_localctx).e = exp();
						setState(384);
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
						setState(387);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(388);
						match(DOT);
						setState(389);
						((LvalueContext)_localctx).id = match(ID);
						 ((LvalueContext)_localctx).lval =  new CFieldAccess(((LvalueContext)_localctx).lv.lval, (((LvalueContext)_localctx).id!=null?((LvalueContext)_localctx).id.getText():null)); 
						}
						break;
					}
					} 
				}
				setState(395);
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
		enterRule(_localctx, 56, RULE_exps);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((ExpsContext)_localctx).exprs =  new ArrayList<Exp>(); 
			setState(397);
			((ExpsContext)_localctx).exp = exp();
			 _localctx.exprs.add(((ExpsContext)_localctx).exp.expr); 
			setState(405);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(399);
				match(COMMA);
				setState(400);
				((ExpsContext)_localctx).exp = exp();
				 _localctx.exprs.add(((ExpsContext)_localctx).exp.expr); 
				}
				}
				setState(407);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\65\u019b\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\5\3G\n\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4O\n\4\3\5\3\5"+
		"\3\5\3\5\7\5U\n\5\f\5\16\5X\13\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\5\7f\n\7\3\7\3\7\3\7\3\7\3\7\7\7m\n\7\f\7\16\7p\13\7\5\7r\n"+
		"\7\3\7\3\7\7\7v\n\7\f\7\16\7y\13\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\7\b\u0089\n\b\f\b\16\b\u008c\13\b\3\t\3\t\3\t\5\t"+
		"\u0091\n\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n"+
		"\u00a1\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00b9\n\13\3\f"+
		"\3\f\7\f\u00bd\n\f\f\f\16\f\u00c0\13\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\5\r\u00cc\n\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\7\21"+
		"\u00e5\n\21\f\21\16\21\u00e8\13\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\5\23\u00f6\n\23\3\23\3\23\3\23\3\23\3\23\7\23"+
		"\u00fd\n\23\f\23\16\23\u0100\13\23\3\23\3\23\5\23\u0104\n\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u0112\n\25\f\25"+
		"\16\25\u0115\13\25\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u011d\n\26\f\26"+
		"\16\26\u0120\13\26\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u0128\n\27\f\27"+
		"\16\27\u012b\13\27\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u0133\n\30\f\30"+
		"\16\30\u0136\13\30\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u013e\n\31\f\31"+
		"\16\31\u0141\13\31\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u0149\n\32\f\32"+
		"\16\32\u014c\13\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0155\n\33"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\7\34\u0173\n\34\f\34\16\34\u0176\13\34\3\34\3\34\5\34\u017a\n\34\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\7\35"+
		"\u018a\n\35\f\35\16\35\u018d\13\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\7\36\u0196\n\36\f\36\16\36\u0199\13\36\3\36\2\38\37\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:\2\7\3\2&\'\3\2(+\3\2\36\37"+
		"\3\2 \"\4\2\37\37%%\2\u01ac\2<\3\2\2\2\4F\3\2\2\2\6N\3\2\2\2\bP\3\2\2"+
		"\2\n\\\3\2\2\2\fb\3\2\2\2\16}\3\2\2\2\20\u008d\3\2\2\2\22\u00a0\3\2\2"+
		"\2\24\u00b8\3\2\2\2\26\u00ba\3\2\2\2\30\u00c4\3\2\2\2\32\u00cf\3\2\2\2"+
		"\34\u00d6\3\2\2\2\36\u00db\3\2\2\2 \u00e0\3\2\2\2\"\u00ec\3\2\2\2$\u00f2"+
		"\3\2\2\2&\u0108\3\2\2\2(\u010b\3\2\2\2*\u0116\3\2\2\2,\u0121\3\2\2\2."+
		"\u012c\3\2\2\2\60\u0137\3\2\2\2\62\u0142\3\2\2\2\64\u0154\3\2\2\2\66\u0179"+
		"\3\2\2\28\u017b\3\2\2\2:\u018e\3\2\2\2<=\5\4\3\2=>\b\2\1\2>\3\3\2\2\2"+
		"?@\5\6\4\2@A\5\4\3\2AB\b\3\1\2BG\3\2\2\2CD\5\6\4\2DE\b\3\1\2EG\3\2\2\2"+
		"F?\3\2\2\2FC\3\2\2\2G\5\3\2\2\2HI\5\b\5\2IJ\b\4\1\2JO\3\2\2\2KL\5\f\7"+
		"\2LM\b\4\1\2MO\3\2\2\2NH\3\2\2\2NK\3\2\2\2O\7\3\2\2\2PQ\7\21\2\2QR\7."+
		"\2\2RV\7\25\2\2SU\5\n\6\2TS\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2WY\3"+
		"\2\2\2XV\3\2\2\2YZ\7\26\2\2Z[\b\5\1\2[\t\3\2\2\2\\]\7-\2\2]^\7\34\2\2"+
		"^_\5\20\t\2_`\7\31\2\2`a\b\6\1\2a\13\3\2\2\2bc\7-\2\2ce\7\24\2\2df\5\16"+
		"\b\2ed\3\2\2\2ef\3\2\2\2fg\3\2\2\2gq\7\23\2\2hi\7\35\2\2in\5\20\t\2jk"+
		"\7\32\2\2km\5\20\t\2lj\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2or\3\2\2\2"+
		"pn\3\2\2\2qh\3\2\2\2qr\3\2\2\2rs\3\2\2\2sw\7\25\2\2tv\5\24\13\2ut\3\2"+
		"\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2xz\3\2\2\2yw\3\2\2\2z{\7\26\2\2{|\b"+
		"\7\1\2|\r\3\2\2\2}~\b\b\1\2~\177\7-\2\2\177\u0080\7\34\2\2\u0080\u0081"+
		"\5\20\t\2\u0081\u008a\b\b\1\2\u0082\u0083\7\32\2\2\u0083\u0084\7-\2\2"+
		"\u0084\u0085\7\34\2\2\u0085\u0086\5\20\t\2\u0086\u0087\b\b\1\2\u0087\u0089"+
		"\3\2\2\2\u0088\u0082\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a"+
		"\u008b\3\2\2\2\u008b\17\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u0090\5\22\n"+
		"\2\u008e\u008f\7\27\2\2\u008f\u0091\7\30\2\2\u0090\u008e\3\2\2\2\u0090"+
		"\u0091\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093\b\t\1\2\u0093\21\3\2\2"+
		"\2\u0094\u0095\7\t\2\2\u0095\u00a1\b\n\1\2\u0096\u0097\7\13\2\2\u0097"+
		"\u00a1\b\n\1\2\u0098\u0099\7\f\2\2\u0099\u00a1\b\n\1\2\u009a\u009b\7\n"+
		"\2\2\u009b\u00a1\b\n\1\2\u009c\u009d\7\r\2\2\u009d\u00a1\b\n\1\2\u009e"+
		"\u009f\7.\2\2\u009f\u00a1\b\n\1\2\u00a0\u0094\3\2\2\2\u00a0\u0096\3\2"+
		"\2\2\u00a0\u0098\3\2\2\2\u00a0\u009a\3\2\2\2\u00a0\u009c\3\2\2\2\u00a0"+
		"\u009e\3\2\2\2\u00a1\23\3\2\2\2\u00a2\u00a3\5\26\f\2\u00a3\u00a4\b\13"+
		"\1\2\u00a4\u00b9\3\2\2\2\u00a5\u00a6\5\30\r\2\u00a6\u00a7\b\13\1\2\u00a7"+
		"\u00b9\3\2\2\2\u00a8\u00a9\5\32\16\2\u00a9\u00aa\b\13\1\2\u00aa\u00b9"+
		"\3\2\2\2\u00ab\u00ac\5\34\17\2\u00ac\u00ad\b\13\1\2\u00ad\u00b9\3\2\2"+
		"\2\u00ae\u00af\5\36\20\2\u00af\u00b0\b\13\1\2\u00b0\u00b9\3\2\2\2\u00b1"+
		"\u00b2\5 \21\2\u00b2\u00b3\b\13\1\2\u00b3\u00b9\3\2\2\2\u00b4\u00b5\5"+
		"\"\22\2\u00b5\u00b6\b\13\1\2\u00b6\u00b9\3\2\2\2\u00b7\u00b9\5$\23\2\u00b8"+
		"\u00a2\3\2\2\2\u00b8\u00a5\3\2\2\2\u00b8\u00a8\3\2\2\2\u00b8\u00ab\3\2"+
		"\2\2\u00b8\u00ae\3\2\2\2\u00b8\u00b1\3\2\2\2\u00b8\u00b4\3\2\2\2\u00b8"+
		"\u00b7\3\2\2\2\u00b9\25\3\2\2\2\u00ba\u00be\7\25\2\2\u00bb\u00bd\5\24"+
		"\13\2\u00bc\u00bb\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be\u00bc\3\2\2\2\u00be"+
		"\u00bf\3\2\2\2\u00bf\u00c1\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1\u00c2\7\26"+
		"\2\2\u00c2\u00c3\b\f\1\2\u00c3\27\3\2\2\2\u00c4\u00c5\7\3\2\2\u00c5\u00c6"+
		"\7\24\2\2\u00c6\u00c7\5&\24\2\u00c7\u00c8\7\23\2\2\u00c8\u00cb\5\24\13"+
		"\2\u00c9\u00ca\7\4\2\2\u00ca\u00cc\5\24\13\2\u00cb\u00c9\3\2\2\2\u00cb"+
		"\u00cc\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00ce\b\r\1\2\u00ce\31\3\2\2"+
		"\2\u00cf\u00d0\7\7\2\2\u00d0\u00d1\7\24\2\2\u00d1\u00d2\5&\24\2\u00d2"+
		"\u00d3\7\23\2\2\u00d3\u00d4\5\24\13\2\u00d4\u00d5\b\16\1\2\u00d5\33\3"+
		"\2\2\2\u00d6\u00d7\7\22\2\2\u00d7\u00d8\58\35\2\u00d8\u00d9\7\31\2\2\u00d9"+
		"\u00da\b\17\1\2\u00da\35\3\2\2\2\u00db\u00dc\7\6\2\2\u00dc\u00dd\5&\24"+
		"\2\u00dd\u00de\7\31\2\2\u00de\u00df\b\20\1\2\u00df\37\3\2\2\2\u00e0\u00e1"+
		"\7\b\2\2\u00e1\u00e6\5&\24\2\u00e2\u00e3\7\32\2\2\u00e3\u00e5\5&\24\2"+
		"\u00e4\u00e2\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7"+
		"\3\2\2\2\u00e7\u00e9\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9\u00ea\7\31\2\2"+
		"\u00ea\u00eb\b\21\1\2\u00eb!\3\2\2\2\u00ec\u00ed\58\35\2\u00ed\u00ee\7"+
		",\2\2\u00ee\u00ef\5&\24\2\u00ef\u00f0\7\31\2\2\u00f0\u00f1\b\22\1\2\u00f1"+
		"#\3\2\2\2\u00f2\u00f3\7-\2\2\u00f3\u00f5\7\24\2\2\u00f4\u00f6\5:\36\2"+
		"\u00f5\u00f4\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u0103"+
		"\7\23\2\2\u00f8\u00f9\7(\2\2\u00f9\u00fe\58\35\2\u00fa\u00fb\7\32\2\2"+
		"\u00fb\u00fd\58\35\2\u00fc\u00fa\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u00fc"+
		"\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0101\3\2\2\2\u0100\u00fe\3\2\2\2\u0101"+
		"\u0102\7)\2\2\u0102\u0104\3\2\2\2\u0103\u00f8\3\2\2\2\u0103\u0104\3\2"+
		"\2\2\u0104\u0105\3\2\2\2\u0105\u0106\7\31\2\2\u0106\u0107\b\23\1\2\u0107"+
		"%\3\2\2\2\u0108\u0109\5(\25\2\u0109\u010a\b\24\1\2\u010a\'\3\2\2\2\u010b"+
		"\u010c\5*\26\2\u010c\u0113\b\25\1\2\u010d\u010e\7$\2\2\u010e\u010f\5*"+
		"\26\2\u010f\u0110\b\25\1\2\u0110\u0112\3\2\2\2\u0111\u010d\3\2\2\2\u0112"+
		"\u0115\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114)\3\2\2\2"+
		"\u0115\u0113\3\2\2\2\u0116\u0117\5,\27\2\u0117\u011e\b\26\1\2\u0118\u0119"+
		"\7#\2\2\u0119\u011a\5,\27\2\u011a\u011b\b\26\1\2\u011b\u011d\3\2\2\2\u011c"+
		"\u0118\3\2\2\2\u011d\u0120\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2"+
		"\2\2\u011f+\3\2\2\2\u0120\u011e\3\2\2\2\u0121\u0122\5.\30\2\u0122\u0129"+
		"\b\27\1\2\u0123\u0124\t\2\2\2\u0124\u0125\5.\30\2\u0125\u0126\b\27\1\2"+
		"\u0126\u0128\3\2\2\2\u0127\u0123\3\2\2\2\u0128\u012b\3\2\2\2\u0129\u0127"+
		"\3\2\2\2\u0129\u012a\3\2\2\2\u012a-\3\2\2\2\u012b\u0129\3\2\2\2\u012c"+
		"\u012d\5\60\31\2\u012d\u0134\b\30\1\2\u012e\u012f\t\3\2\2\u012f\u0130"+
		"\5\60\31\2\u0130\u0131\b\30\1\2\u0131\u0133\3\2\2\2\u0132\u012e\3\2\2"+
		"\2\u0133\u0136\3\2\2\2\u0134\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135/"+
		"\3\2\2\2\u0136\u0134\3\2\2\2\u0137\u0138\5\62\32\2\u0138\u013f\b\31\1"+
		"\2\u0139\u013a\t\4\2\2\u013a\u013b\5\62\32\2\u013b\u013c\b\31\1\2\u013c"+
		"\u013e\3\2\2\2\u013d\u0139\3\2\2\2\u013e\u0141\3\2\2\2\u013f\u013d\3\2"+
		"\2\2\u013f\u0140\3\2\2\2\u0140\61\3\2\2\2\u0141\u013f\3\2\2\2\u0142\u0143"+
		"\5\64\33\2\u0143\u014a\b\32\1\2\u0144\u0145\t\5\2\2\u0145\u0146\5\64\33"+
		"\2\u0146\u0147\b\32\1\2\u0147\u0149\3\2\2\2\u0148\u0144\3\2\2\2\u0149"+
		"\u014c\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b\63\3\2\2"+
		"\2\u014c\u014a\3\2\2\2\u014d\u014e\t\6\2\2\u014e\u014f\5\64\33\2\u014f"+
		"\u0150\b\33\1\2\u0150\u0155\3\2\2\2\u0151\u0152\5\66\34\2\u0152\u0153"+
		"\b\33\1\2\u0153\u0155\3\2\2\2\u0154\u014d\3\2\2\2\u0154\u0151\3\2\2\2"+
		"\u0155\65\3\2\2\2\u0156\u0157\7\16\2\2\u0157\u017a\b\34\1\2\u0158\u0159"+
		"\7\17\2\2\u0159\u017a\b\34\1\2\u015a\u015b\7\20\2\2\u015b\u017a\b\34\1"+
		"\2\u015c\u015d\7/\2\2\u015d\u017a\b\34\1\2\u015e\u015f\7\60\2\2\u015f"+
		"\u017a\b\34\1\2\u0160\u0161\7\61\2\2\u0161\u017a\b\34\1\2\u0162\u0163"+
		"\7\62\2\2\u0163\u017a\b\34\1\2\u0164\u0165\58\35\2\u0165\u0166\b\34\1"+
		"\2\u0166\u017a\3\2\2\2\u0167\u0168\7\24\2\2\u0168\u0169\5&\24\2\u0169"+
		"\u016a\7\23\2\2\u016a\u016b\b\34\1\2\u016b\u017a\3\2\2\2\u016c\u016d\7"+
		"\5\2\2\u016d\u0174\5\20\t\2\u016e\u016f\7\27\2\2\u016f\u0170\5&\24\2\u0170"+
		"\u0171\7\30\2\2\u0171\u0173\3\2\2\2\u0172\u016e\3\2\2\2\u0173\u0176\3"+
		"\2\2\2\u0174\u0172\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0177\3\2\2\2\u0176"+
		"\u0174\3\2\2\2\u0177\u0178\b\34\1\2\u0178\u017a\3\2\2\2\u0179\u0156\3"+
		"\2\2\2\u0179\u0158\3\2\2\2\u0179\u015a\3\2\2\2\u0179\u015c\3\2\2\2\u0179"+
		"\u015e\3\2\2\2\u0179\u0160\3\2\2\2\u0179\u0162\3\2\2\2\u0179\u0164\3\2"+
		"\2\2\u0179\u0167\3\2\2\2\u0179\u016c\3\2\2\2\u017a\67\3\2\2\2\u017b\u017c"+
		"\b\35\1\2\u017c\u017d\7-\2\2\u017d\u017e\b\35\1\2\u017e\u018b\3\2\2\2"+
		"\u017f\u0180\f\4\2\2\u0180\u0181\7\27\2\2\u0181\u0182\5&\24\2\u0182\u0183"+
		"\7\30\2\2\u0183\u0184\b\35\1\2\u0184\u018a\3\2\2\2\u0185\u0186\f\3\2\2"+
		"\u0186\u0187\7\33\2\2\u0187\u0188\7-\2\2\u0188\u018a\b\35\1\2\u0189\u017f"+
		"\3\2\2\2\u0189\u0185\3\2\2\2\u018a\u018d\3\2\2\2\u018b\u0189\3\2\2\2\u018b"+
		"\u018c\3\2\2\2\u018c9\3\2\2\2\u018d\u018b\3\2\2\2\u018e\u018f\b\36\1\2"+
		"\u018f\u0190\5&\24\2\u0190\u0197\b\36\1\2\u0191\u0192\7\32\2\2\u0192\u0193"+
		"\5&\24\2\u0193\u0194\b\36\1\2\u0194\u0196\3\2\2\2\u0195\u0191\3\2\2\2"+
		"\u0196\u0199\3\2\2\2\u0197\u0195\3\2\2\2\u0197\u0198\3\2\2\2\u0198;\3"+
		"\2\2\2\u0199\u0197\3\2\2\2\37FNVenqw\u008a\u0090\u00a0\u00b8\u00be\u00cb"+
		"\u00e6\u00f5\u00fe\u0103\u0113\u011e\u0129\u0134\u013f\u014a\u0154\u0174"+
		"\u0179\u0189\u018b\u0197";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}