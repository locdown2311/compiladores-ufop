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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitDef(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitData(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitDecl(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitFunc(this);
			else return visitor.visitChildren(this);
		}
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8796093612146L) != 0)) {
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitBtype(this);
			else return visitor.visitChildren(this);
		}
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
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 17592186048384L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitCmd(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8796093612146L) != 0)) {
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitIfCmd(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitWhileCmd(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitReadCmd(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitPrintCmd(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitReturnCmd(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitAssignCmd(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitAccessReturn(this);
			else return visitor.visitChildren(this);
		}
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
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 536596571254792L) != 0)) {
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitFuncCallCmd(this);
			else return visitor.visitChildren(this);
		}
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
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 536596571254792L) != 0)) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpContext extends ParserRuleContext {
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitLogicalOrExp(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitLogicalAndExp(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitEqualityExp(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitRelationalExp(this);
			else return visitor.visitChildren(this);
		}
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4123168604160L) != 0)) {
				{
				{
				setState(253);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4123168604160L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitAdditiveExp(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitMultiplicativeExp(this);
			else return visitor.visitChildren(this);
		}
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7516192768L) != 0)) {
				{
				{
				setState(269);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7516192768L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitUnaryExp(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitPrimaryExp(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitExps(this);
			else return visitor.visitChildren(this);
		}
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
		"\u0004\u00013\u014c\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0001\u0000\u0004\u0000<\b\u0000\u000b\u0000"+
		"\f\u0000=\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0003\u0001"+
		"D\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002"+
		"J\b\u0002\n\u0002\f\u0002M\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004[\b\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004b\b\u0004"+
		"\n\u0004\f\u0004e\t\u0004\u0003\u0004g\b\u0004\u0001\u0004\u0001\u0004"+
		"\u0005\u0004k\b\u0004\n\u0004\f\u0004n\t\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0005\u0005z\b\u0005\n\u0005\f\u0005}\t\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"\u0084\b\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u0090\b\b\u0001\t\u0001\t\u0005"+
		"\t\u0094\b\t\n\t\f\t\u0097\t\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00a2\b\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u00b8\b\u000e\n\u000e"+
		"\f\u000e\u00bb\t\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0003\u0010\u00c7\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00d1\b\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011"+
		"\u00d8\b\u0011\n\u0011\f\u0011\u00db\t\u0011\u0001\u0011\u0001\u0011\u0003"+
		"\u0011\u00df\b\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u00e8\b\u0013\n\u0013\f\u0013"+
		"\u00eb\t\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u00f0\b"+
		"\u0014\n\u0014\f\u0014\u00f3\t\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0005\u0015\u00f8\b\u0015\n\u0015\f\u0015\u00fb\t\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0005\u0016\u0100\b\u0016\n\u0016\f\u0016\u0103\t\u0016"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u0108\b\u0017\n\u0017"+
		"\f\u0017\u010b\t\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018"+
		"\u0110\b\u0018\n\u0018\f\u0018\u0113\t\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0003\u0019\u0118\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u012c\b\u001a\n\u001a\f\u001a"+
		"\u012f\t\u001a\u0001\u001a\u0003\u001a\u0132\b\u001a\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u013f\b\u001b\n"+
		"\u001b\f\u001b\u0142\t\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0005"+
		"\u001c\u0147\b\u001c\n\u001c\f\u001c\u014a\t\u001c\u0001\u001c\u0000\u0001"+
		"6\u001d\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.02468\u0000\u0006\u0002\u0000\u0007\u000b,"+
		",\u0001\u0000$%\u0001\u0000&)\u0001\u0000\u001c\u001d\u0001\u0000\u001e"+
		" \u0002\u0000\u001d\u001d##\u015a\u0000;\u0001\u0000\u0000\u0000\u0002"+
		"C\u0001\u0000\u0000\u0000\u0004E\u0001\u0000\u0000\u0000\u0006Q\u0001"+
		"\u0000\u0000\u0000\bW\u0001\u0000\u0000\u0000\nr\u0001\u0000\u0000\u0000"+
		"\f\u0080\u0001\u0000\u0000\u0000\u000e\u0085\u0001\u0000\u0000\u0000\u0010"+
		"\u008f\u0001\u0000\u0000\u0000\u0012\u0091\u0001\u0000\u0000\u0000\u0014"+
		"\u009a\u0001\u0000\u0000\u0000\u0016\u00a5\u0001\u0000\u0000\u0000\u0018"+
		"\u00ab\u0001\u0000\u0000\u0000\u001a\u00af\u0001\u0000\u0000\u0000\u001c"+
		"\u00b3\u0001\u0000\u0000\u0000\u001e\u00be\u0001\u0000\u0000\u0000 \u00c3"+
		"\u0001\u0000\u0000\u0000\"\u00cd\u0001\u0000\u0000\u0000$\u00e2\u0001"+
		"\u0000\u0000\u0000&\u00e4\u0001\u0000\u0000\u0000(\u00ec\u0001\u0000\u0000"+
		"\u0000*\u00f4\u0001\u0000\u0000\u0000,\u00fc\u0001\u0000\u0000\u0000."+
		"\u0104\u0001\u0000\u0000\u00000\u010c\u0001\u0000\u0000\u00002\u0117\u0001"+
		"\u0000\u0000\u00004\u0131\u0001\u0000\u0000\u00006\u0133\u0001\u0000\u0000"+
		"\u00008\u0143\u0001\u0000\u0000\u0000:<\u0003\u0002\u0001\u0000;:\u0001"+
		"\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000"+
		"=>\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?@\u0006\u0000\uffff"+
		"\uffff\u0000@\u0001\u0001\u0000\u0000\u0000AD\u0003\u0004\u0002\u0000"+
		"BD\u0003\b\u0004\u0000CA\u0001\u0000\u0000\u0000CB\u0001\u0000\u0000\u0000"+
		"D\u0003\u0001\u0000\u0000\u0000EF\u0005\u000f\u0000\u0000FG\u0005,\u0000"+
		"\u0000GK\u0005\u0013\u0000\u0000HJ\u0003\u0006\u0003\u0000IH\u0001\u0000"+
		"\u0000\u0000JM\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000KL\u0001"+
		"\u0000\u0000\u0000LN\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000"+
		"NO\u0005\u0014\u0000\u0000OP\u0006\u0002\uffff\uffff\u0000P\u0005\u0001"+
		"\u0000\u0000\u0000QR\u0005+\u0000\u0000RS\u0005\u001a\u0000\u0000ST\u0003"+
		"\f\u0006\u0000TU\u0005\u0017\u0000\u0000UV\u0006\u0003\uffff\uffff\u0000"+
		"V\u0007\u0001\u0000\u0000\u0000WX\u0005+\u0000\u0000XZ\u0005\u0012\u0000"+
		"\u0000Y[\u0003\n\u0005\u0000ZY\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000"+
		"\u0000[\\\u0001\u0000\u0000\u0000\\f\u0005\u0011\u0000\u0000]^\u0005\u001b"+
		"\u0000\u0000^c\u0003\f\u0006\u0000_`\u0005\u0018\u0000\u0000`b\u0003\f"+
		"\u0006\u0000a_\u0001\u0000\u0000\u0000be\u0001\u0000\u0000\u0000ca\u0001"+
		"\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000dg\u0001\u0000\u0000\u0000"+
		"ec\u0001\u0000\u0000\u0000f]\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000"+
		"\u0000gh\u0001\u0000\u0000\u0000hl\u0005\u0013\u0000\u0000ik\u0003\u0010"+
		"\b\u0000ji\u0001\u0000\u0000\u0000kn\u0001\u0000\u0000\u0000lj\u0001\u0000"+
		"\u0000\u0000lm\u0001\u0000\u0000\u0000mo\u0001\u0000\u0000\u0000nl\u0001"+
		"\u0000\u0000\u0000op\u0005\u0014\u0000\u0000pq\u0006\u0004\uffff\uffff"+
		"\u0000q\t\u0001\u0000\u0000\u0000rs\u0005+\u0000\u0000st\u0005\u001a\u0000"+
		"\u0000t{\u0003\f\u0006\u0000uv\u0005\u0018\u0000\u0000vw\u0005+\u0000"+
		"\u0000wx\u0005\u001a\u0000\u0000xz\u0003\f\u0006\u0000yu\u0001\u0000\u0000"+
		"\u0000z}\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000{|\u0001\u0000"+
		"\u0000\u0000|~\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000~\u007f"+
		"\u0006\u0005\uffff\uffff\u0000\u007f\u000b\u0001\u0000\u0000\u0000\u0080"+
		"\u0083\u0003\u000e\u0007\u0000\u0081\u0082\u0005\u0015\u0000\u0000\u0082"+
		"\u0084\u0005\u0016\u0000\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0083"+
		"\u0084\u0001\u0000\u0000\u0000\u0084\r\u0001\u0000\u0000\u0000\u0085\u0086"+
		"\u0007\u0000\u0000\u0000\u0086\u000f\u0001\u0000\u0000\u0000\u0087\u0090"+
		"\u0003\u0012\t\u0000\u0088\u0090\u0003\u0014\n\u0000\u0089\u0090\u0003"+
		"\u0016\u000b\u0000\u008a\u0090\u0003\u0018\f\u0000\u008b\u0090\u0003\u001a"+
		"\r\u0000\u008c\u0090\u0003\u001c\u000e\u0000\u008d\u0090\u0003\u001e\u000f"+
		"\u0000\u008e\u0090\u0003\"\u0011\u0000\u008f\u0087\u0001\u0000\u0000\u0000"+
		"\u008f\u0088\u0001\u0000\u0000\u0000\u008f\u0089\u0001\u0000\u0000\u0000"+
		"\u008f\u008a\u0001\u0000\u0000\u0000\u008f\u008b\u0001\u0000\u0000\u0000"+
		"\u008f\u008c\u0001\u0000\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000"+
		"\u008f\u008e\u0001\u0000\u0000\u0000\u0090\u0011\u0001\u0000\u0000\u0000"+
		"\u0091\u0095\u0005\u0013\u0000\u0000\u0092\u0094\u0003\u0010\b\u0000\u0093"+
		"\u0092\u0001\u0000\u0000\u0000\u0094\u0097\u0001\u0000\u0000\u0000\u0095"+
		"\u0093\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000\u0000\u0000\u0096"+
		"\u0098\u0001\u0000\u0000\u0000\u0097\u0095\u0001\u0000\u0000\u0000\u0098"+
		"\u0099\u0005\u0014\u0000\u0000\u0099\u0013\u0001\u0000\u0000\u0000\u009a"+
		"\u009b\u0005\u0001\u0000\u0000\u009b\u009c\u0005\u0012\u0000\u0000\u009c"+
		"\u009d\u0003$\u0012\u0000\u009d\u009e\u0005\u0011\u0000\u0000\u009e\u00a1"+
		"\u0003\u0010\b\u0000\u009f\u00a0\u0005\u0002\u0000\u0000\u00a0\u00a2\u0003"+
		"\u0010\b\u0000\u00a1\u009f\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000"+
		"\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3\u00a4\u0006\n\uffff"+
		"\uffff\u0000\u00a4\u0015\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005\u0005"+
		"\u0000\u0000\u00a6\u00a7\u0005\u0012\u0000\u0000\u00a7\u00a8\u0003$\u0012"+
		"\u0000\u00a8\u00a9\u0005\u0011\u0000\u0000\u00a9\u00aa\u0003\u0010\b\u0000"+
		"\u00aa\u0017\u0001\u0000\u0000\u0000\u00ab\u00ac\u0005\u0010\u0000\u0000"+
		"\u00ac\u00ad\u00036\u001b\u0000\u00ad\u00ae\u0005\u0017\u0000\u0000\u00ae"+
		"\u0019\u0001\u0000\u0000\u0000\u00af\u00b0\u0005\u0004\u0000\u0000\u00b0"+
		"\u00b1\u0003$\u0012\u0000\u00b1\u00b2\u0005\u0017\u0000\u0000\u00b2\u001b"+
		"\u0001\u0000\u0000\u0000\u00b3\u00b4\u0005\u0006\u0000\u0000\u00b4\u00b9"+
		"\u0003$\u0012\u0000\u00b5\u00b6\u0005\u0018\u0000\u0000\u00b6\u00b8\u0003"+
		"$\u0012\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b8\u00bb\u0001\u0000"+
		"\u0000\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000"+
		"\u0000\u0000\u00ba\u00bc\u0001\u0000\u0000\u0000\u00bb\u00b9\u0001\u0000"+
		"\u0000\u0000\u00bc\u00bd\u0005\u0017\u0000\u0000\u00bd\u001d\u0001\u0000"+
		"\u0000\u0000\u00be\u00bf\u00036\u001b\u0000\u00bf\u00c0\u0005*\u0000\u0000"+
		"\u00c0\u00c1\u0003$\u0012\u0000\u00c1\u00c2\u0005\u0017\u0000\u0000\u00c2"+
		"\u001f\u0001\u0000\u0000\u0000\u00c3\u00c4\u0005+\u0000\u0000\u00c4\u00c6"+
		"\u0005\u0012\u0000\u0000\u00c5\u00c7\u00038\u001c\u0000\u00c6\u00c5\u0001"+
		"\u0000\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001"+
		"\u0000\u0000\u0000\u00c8\u00c9\u0005\u0011\u0000\u0000\u00c9\u00ca\u0005"+
		"\u0015\u0000\u0000\u00ca\u00cb\u0003$\u0012\u0000\u00cb\u00cc\u0005\u0016"+
		"\u0000\u0000\u00cc!\u0001\u0000\u0000\u0000\u00cd\u00ce\u0005+\u0000\u0000"+
		"\u00ce\u00d0\u0005\u0012\u0000\u0000\u00cf\u00d1\u00038\u001c\u0000\u00d0"+
		"\u00cf\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1"+
		"\u00d2\u0001\u0000\u0000\u0000\u00d2\u00de\u0005\u0011\u0000\u0000\u00d3"+
		"\u00d4\u0005&\u0000\u0000\u00d4\u00d9\u00036\u001b\u0000\u00d5\u00d6\u0005"+
		"\u0018\u0000\u0000\u00d6\u00d8\u00036\u001b\u0000\u00d7\u00d5\u0001\u0000"+
		"\u0000\u0000\u00d8\u00db\u0001\u0000\u0000\u0000\u00d9\u00d7\u0001\u0000"+
		"\u0000\u0000\u00d9\u00da\u0001\u0000\u0000\u0000\u00da\u00dc\u0001\u0000"+
		"\u0000\u0000\u00db\u00d9\u0001\u0000\u0000\u0000\u00dc\u00dd\u0005\'\u0000"+
		"\u0000\u00dd\u00df\u0001\u0000\u0000\u0000\u00de\u00d3\u0001\u0000\u0000"+
		"\u0000\u00de\u00df\u0001\u0000\u0000\u0000\u00df\u00e0\u0001\u0000\u0000"+
		"\u0000\u00e0\u00e1\u0005\u0017\u0000\u0000\u00e1#\u0001\u0000\u0000\u0000"+
		"\u00e2\u00e3\u0003&\u0013\u0000\u00e3%\u0001\u0000\u0000\u0000\u00e4\u00e9"+
		"\u0003(\u0014\u0000\u00e5\u00e6\u0005\"\u0000\u0000\u00e6\u00e8\u0003"+
		"(\u0014\u0000\u00e7\u00e5\u0001\u0000\u0000\u0000\u00e8\u00eb\u0001\u0000"+
		"\u0000\u0000\u00e9\u00e7\u0001\u0000\u0000\u0000\u00e9\u00ea\u0001\u0000"+
		"\u0000\u0000\u00ea\'\u0001\u0000\u0000\u0000\u00eb\u00e9\u0001\u0000\u0000"+
		"\u0000\u00ec\u00f1\u0003*\u0015\u0000\u00ed\u00ee\u0005!\u0000\u0000\u00ee"+
		"\u00f0\u0003*\u0015\u0000\u00ef\u00ed\u0001\u0000\u0000\u0000\u00f0\u00f3"+
		"\u0001\u0000\u0000\u0000\u00f1\u00ef\u0001\u0000\u0000\u0000\u00f1\u00f2"+
		"\u0001\u0000\u0000\u0000\u00f2)\u0001\u0000\u0000\u0000\u00f3\u00f1\u0001"+
		"\u0000\u0000\u0000\u00f4\u00f9\u0003,\u0016\u0000\u00f5\u00f6\u0007\u0001"+
		"\u0000\u0000\u00f6\u00f8\u0003,\u0016\u0000\u00f7\u00f5\u0001\u0000\u0000"+
		"\u0000\u00f8\u00fb\u0001\u0000\u0000\u0000\u00f9\u00f7\u0001\u0000\u0000"+
		"\u0000\u00f9\u00fa\u0001\u0000\u0000\u0000\u00fa+\u0001\u0000\u0000\u0000"+
		"\u00fb\u00f9\u0001\u0000\u0000\u0000\u00fc\u0101\u0003.\u0017\u0000\u00fd"+
		"\u00fe\u0007\u0002\u0000\u0000\u00fe\u0100\u0003.\u0017\u0000\u00ff\u00fd"+
		"\u0001\u0000\u0000\u0000\u0100\u0103\u0001\u0000\u0000\u0000\u0101\u00ff"+
		"\u0001\u0000\u0000\u0000\u0101\u0102\u0001\u0000\u0000\u0000\u0102-\u0001"+
		"\u0000\u0000\u0000\u0103\u0101\u0001\u0000\u0000\u0000\u0104\u0109\u0003"+
		"0\u0018\u0000\u0105\u0106\u0007\u0003\u0000\u0000\u0106\u0108\u00030\u0018"+
		"\u0000\u0107\u0105\u0001\u0000\u0000\u0000\u0108\u010b\u0001\u0000\u0000"+
		"\u0000\u0109\u0107\u0001\u0000\u0000\u0000\u0109\u010a\u0001\u0000\u0000"+
		"\u0000\u010a/\u0001\u0000\u0000\u0000\u010b\u0109\u0001\u0000\u0000\u0000"+
		"\u010c\u0111\u00032\u0019\u0000\u010d\u010e\u0007\u0004\u0000\u0000\u010e"+
		"\u0110\u00032\u0019\u0000\u010f\u010d\u0001\u0000\u0000\u0000\u0110\u0113"+
		"\u0001\u0000\u0000\u0000\u0111\u010f\u0001\u0000\u0000\u0000\u0111\u0112"+
		"\u0001\u0000\u0000\u0000\u01121\u0001\u0000\u0000\u0000\u0113\u0111\u0001"+
		"\u0000\u0000\u0000\u0114\u0115\u0007\u0005\u0000\u0000\u0115\u0118\u0003"+
		"2\u0019\u0000\u0116\u0118\u00034\u001a\u0000\u0117\u0114\u0001\u0000\u0000"+
		"\u0000\u0117\u0116\u0001\u0000\u0000\u0000\u01183\u0001\u0000\u0000\u0000"+
		"\u0119\u0132\u0005\f\u0000\u0000\u011a\u0132\u0005\r\u0000\u0000\u011b"+
		"\u0132\u0005\u000e\u0000\u0000\u011c\u0132\u0005-\u0000\u0000\u011d\u0132"+
		"\u0005.\u0000\u0000\u011e\u0132\u0005/\u0000\u0000\u011f\u0132\u00050"+
		"\u0000\u0000\u0120\u0132\u00036\u001b\u0000\u0121\u0122\u0005\u0012\u0000"+
		"\u0000\u0122\u0123\u0003$\u0012\u0000\u0123\u0124\u0005\u0011\u0000\u0000"+
		"\u0124\u0132\u0001\u0000\u0000\u0000\u0125\u0126\u0005\u0003\u0000\u0000"+
		"\u0126\u012d\u0003\f\u0006\u0000\u0127\u0128\u0005\u0015\u0000\u0000\u0128"+
		"\u0129\u0003$\u0012\u0000\u0129\u012a\u0005\u0016\u0000\u0000\u012a\u012c"+
		"\u0001\u0000\u0000\u0000\u012b\u0127\u0001\u0000\u0000\u0000\u012c\u012f"+
		"\u0001\u0000\u0000\u0000\u012d\u012b\u0001\u0000\u0000\u0000\u012d\u012e"+
		"\u0001\u0000\u0000\u0000\u012e\u0132\u0001\u0000\u0000\u0000\u012f\u012d"+
		"\u0001\u0000\u0000\u0000\u0130\u0132\u0003 \u0010\u0000\u0131\u0119\u0001"+
		"\u0000\u0000\u0000\u0131\u011a\u0001\u0000\u0000\u0000\u0131\u011b\u0001"+
		"\u0000\u0000\u0000\u0131\u011c\u0001\u0000\u0000\u0000\u0131\u011d\u0001"+
		"\u0000\u0000\u0000\u0131\u011e\u0001\u0000\u0000\u0000\u0131\u011f\u0001"+
		"\u0000\u0000\u0000\u0131\u0120\u0001\u0000\u0000\u0000\u0131\u0121\u0001"+
		"\u0000\u0000\u0000\u0131\u0125\u0001\u0000\u0000\u0000\u0131\u0130\u0001"+
		"\u0000\u0000\u0000\u01325\u0001\u0000\u0000\u0000\u0133\u0134\u0006\u001b"+
		"\uffff\uffff\u0000\u0134\u0135\u0005+\u0000\u0000\u0135\u0140\u0001\u0000"+
		"\u0000\u0000\u0136\u0137\n\u0002\u0000\u0000\u0137\u0138\u0005\u0015\u0000"+
		"\u0000\u0138\u0139\u0003$\u0012\u0000\u0139\u013a\u0005\u0016\u0000\u0000"+
		"\u013a\u013f\u0001\u0000\u0000\u0000\u013b\u013c\n\u0001\u0000\u0000\u013c"+
		"\u013d\u0005\u0019\u0000\u0000\u013d\u013f\u0005+\u0000\u0000\u013e\u0136"+
		"\u0001\u0000\u0000\u0000\u013e\u013b\u0001\u0000\u0000\u0000\u013f\u0142"+
		"\u0001\u0000\u0000\u0000\u0140\u013e\u0001\u0000\u0000\u0000\u0140\u0141"+
		"\u0001\u0000\u0000\u0000\u01417\u0001\u0000\u0000\u0000\u0142\u0140\u0001"+
		"\u0000\u0000\u0000\u0143\u0148\u0003$\u0012\u0000\u0144\u0145\u0005\u0018"+
		"\u0000\u0000\u0145\u0147\u0003$\u0012\u0000\u0146\u0144\u0001\u0000\u0000"+
		"\u0000\u0147\u014a\u0001\u0000\u0000\u0000\u0148\u0146\u0001\u0000\u0000"+
		"\u0000\u0148\u0149\u0001\u0000\u0000\u0000\u01499\u0001\u0000\u0000\u0000"+
		"\u014a\u0148\u0001\u0000\u0000\u0000\u001d=CKZcfl{\u0083\u008f\u0095\u00a1"+
		"\u00b9\u00c6\u00d0\u00d9\u00de\u00e9\u00f1\u00f9\u0101\u0109\u0111\u0117"+
		"\u012d\u0131\u013e\u0140\u0148";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}