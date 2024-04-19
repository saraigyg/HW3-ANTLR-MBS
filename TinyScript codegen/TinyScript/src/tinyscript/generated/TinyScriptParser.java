// Generated from E:/Egyetem/Modellalapu Szoftverfejlesztes/2024/Gyak/GY02/TinyScript oktatói/TinyScript/src/tinyscript/TinyScript.g4 by ANTLR 4.13.1
package tinyscript.generated;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class TinyScriptParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LPAREN=1, RPAREN=2, LCURLY=3, RCURLY=4, EOS=5, COMMA=6, EQ=7, NEQ=8, NEG=9, 
		LT=10, GT=11, LTE=12, GTE=13, ASSIGN=14, PLUS=15, MINUS=16, MUL=17, DIV=18, 
		IF=19, ELSE=20, WHILE=21, VAR=22, MAIN=23, RETURN=24, VOID=25, NULL=26, 
		TRUE=27, FALSE=28, STRING=29, INT=30, ID=31, WS=32, COMMENT=33, LINE_COMMENT=34;
	public static final int
		RULE_program = 0, RULE_functionDefinition = 1, RULE_returnType = 2, RULE_functionName = 3, 
		RULE_functionParameter = 4, RULE_parameterType = 5, RULE_parameterName = 6, 
		RULE_main = 7, RULE_statement = 8, RULE_variableDeclaration = 9, RULE_typeName = 10, 
		RULE_varName = 11, RULE_assignmentStatement = 12, RULE_whileStatement = 13, 
		RULE_condition = 14, RULE_ifStatement = 15, RULE_elseStatement = 16, RULE_functionCall = 17, 
		RULE_functionTarget = 18, RULE_parameterList = 19, RULE_returnStatement = 20, 
		RULE_expression = 21, RULE_addSubOp = 22, RULE_mulDivOp = 23, RULE_logicalOp = 24, 
		RULE_primary = 25, RULE_parenthesizedExpression = 26, RULE_literalExpression = 27, 
		RULE_varRef = 28, RULE_nullLiteral = 29, RULE_intLiteral = 30, RULE_stringLiteral = 31, 
		RULE_boolLiteral = 32;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "functionDefinition", "returnType", "functionName", "functionParameter", 
			"parameterType", "parameterName", "main", "statement", "variableDeclaration", 
			"typeName", "varName", "assignmentStatement", "whileStatement", "condition", 
			"ifStatement", "elseStatement", "functionCall", "functionTarget", "parameterList", 
			"returnStatement", "expression", "addSubOp", "mulDivOp", "logicalOp", 
			"primary", "parenthesizedExpression", "literalExpression", "varRef", 
			"nullLiteral", "intLiteral", "stringLiteral", "boolLiteral"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", "';'", "','", "'=='", "'!='", "'!'", 
			"'<'", "'>'", "'<='", "'>='", "'='", "'+'", "'-'", "'*'", "'/'", "'if'", 
			"'else'", "'while'", "'var'", "'main'", "'return'", "'void'", "'null'", 
			"'true'", "'false'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LPAREN", "RPAREN", "LCURLY", "RCURLY", "EOS", "COMMA", "EQ", "NEQ", 
			"NEG", "LT", "GT", "LTE", "GTE", "ASSIGN", "PLUS", "MINUS", "MUL", "DIV", 
			"IF", "ELSE", "WHILE", "VAR", "MAIN", "RETURN", "VOID", "NULL", "TRUE", 
			"FALSE", "STRING", "INT", "ID", "WS", "COMMENT", "LINE_COMMENT"
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
	public String getGrammarFileName() { return "TinyScript.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TinyScriptParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public List<FunctionDefinitionContext> functionDefinition() {
			return getRuleContexts(FunctionDefinitionContext.class);
		}
		public FunctionDefinitionContext functionDefinition(int i) {
			return getRuleContext(FunctionDefinitionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyScriptListener ) ((TinyScriptListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyScriptListener ) ((TinyScriptListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyScriptVisitor ) return ((TinyScriptVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VOID || _la==ID) {
				{
				{
				setState(66);
				functionDefinition();
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(72);
			main();
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VOID || _la==ID) {
				{
				{
				setState(73);
				functionDefinition();
				}
				}
				setState(78);
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
	public static class FunctionDefinitionContext extends ParserRuleContext {
		public ReturnTypeContext returnType() {
			return getRuleContext(ReturnTypeContext.class,0);
		}
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(TinyScriptParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(TinyScriptParser.RPAREN, 0); }
		public TerminalNode LCURLY() { return getToken(TinyScriptParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(TinyScriptParser.RCURLY, 0); }
		public List<FunctionParameterContext> functionParameter() {
			return getRuleContexts(FunctionParameterContext.class);
		}
		public FunctionParameterContext functionParameter(int i) {
			return getRuleContext(FunctionParameterContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TinyScriptParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TinyScriptParser.COMMA, i);
		}
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyScriptListener ) ((TinyScriptListener)listener).enterFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyScriptListener ) ((TinyScriptListener)listener).exitFunctionDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyScriptVisitor ) return ((TinyScriptVisitor<? extends T>)visitor).visitFunctionDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_functionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			returnType();
			setState(80);
			functionName();
			setState(81);
			match(LPAREN);
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(82);
				functionParameter();
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(83);
					match(COMMA);
					setState(84);
					functionParameter();
					}
					}
					setState(89);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(92);
			match(RPAREN);
			setState(93);
			match(LCURLY);
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2171076608L) != 0)) {
				{
				{
				setState(94);
				statement();
				}
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(100);
			match(RCURLY);
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
	public static class ReturnTypeContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(TinyScriptParser.VOID, 0); }
		public TerminalNode ID() { return getToken(TinyScriptParser.ID, 0); }
		public ReturnTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyScriptListener ) ((TinyScriptListener)listener).enterReturnType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyScriptListener ) ((TinyScriptListener)listener).exitReturnType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyScriptVisitor ) return ((TinyScriptVisitor<? extends T>)visitor).visitReturnType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnTypeContext returnType() throws RecognitionException {
		ReturnTypeContext _localctx = new ReturnTypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_returnType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			_la = _input.LA(1);
			if ( !(_la==VOID || _la==ID) ) {
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
	public static class FunctionNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TinyScriptParser.ID, 0); }
		public FunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyScriptListener ) ((TinyScriptListener)listener).enterFunctionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyScriptListener ) ((TinyScriptListener)listener).exitFunctionName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyScriptVisitor ) return ((TinyScriptVisitor<? extends T>)visitor).visitFunctionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionNameContext functionName() throws RecognitionException {
		FunctionNameContext _localctx = new FunctionNameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_functionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(ID);
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
	public static class FunctionParameterContext extends ParserRuleContext {
		public ParameterTypeContext parameterType() {
			return getRuleContext(ParameterTypeContext.class,0);
		}
		public ParameterNameContext parameterName() {
			return getRuleContext(ParameterNameContext.class,0);
		}
		public FunctionParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyScriptListener ) ((TinyScriptListener)listener).enterFunctionParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyScriptListener ) ((TinyScriptListener)listener).exitFunctionParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyScriptVisitor ) return ((TinyScriptVisitor<? extends T>)visitor).visitFunctionParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionParameterContext functionParameter() throws RecognitionException {
		FunctionParameterContext _localctx = new FunctionParameterContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_functionParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			parameterType();
			setState(107);
			parameterName();
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
	public static class ParameterTypeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TinyScriptParser.ID, 0); }
		public ParameterTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyScriptListener ) ((TinyScriptListener)listener).enterParameterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyScriptListener ) ((TinyScriptListener)listener).exitParameterType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyScriptVisitor ) return ((TinyScriptVisitor<? extends T>)visitor).visitParameterType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterTypeContext parameterType() throws RecognitionException {
		ParameterTypeContext _localctx = new ParameterTypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_parameterType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(ID);
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
	public static class ParameterNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TinyScriptParser.ID, 0); }
		public ParameterNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyScriptListener ) ((TinyScriptListener)listener).enterParameterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyScriptListener ) ((TinyScriptListener)listener).exitParameterName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyScriptVisitor ) return ((TinyScriptVisitor<? extends T>)visitor).visitParameterName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterNameContext parameterName() throws RecognitionException {
		ParameterNameContext _localctx = new ParameterNameContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_parameterName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(ID);
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
	public static class MainContext extends ParserRuleContext {
		public TerminalNode MAIN() { return getToken(TinyScriptParser.MAIN, 0); }
		public TerminalNode LCURLY() { return getToken(TinyScriptParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(TinyScriptParser.RCURLY, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyScriptListener ) ((TinyScriptListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyScriptListener ) ((TinyScriptListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyScriptVisitor ) return ((TinyScriptVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(MAIN);
			setState(114);
			match(LCURLY);
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2171076608L) != 0)) {
				{
				{
				setState(115);
				statement();
				}
				}
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(121);
			match(RCURLY);
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
	public static class StatementContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public AssignmentStatementContext assignmentStatement() {
			return getRuleContext(AssignmentStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode EOS() { return getToken(TinyScriptParser.EOS, 0); }
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyScriptListener ) ((TinyScriptListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyScriptListener ) ((TinyScriptListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyScriptVisitor ) return ((TinyScriptVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_statement);
		try {
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				variableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				assignmentStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(125);
				whileStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(126);
				ifStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(127);
				functionCall();
				setState(128);
				match(EOS);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(130);
				returnStatement();
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
	public static class VariableDeclarationContext extends ParserRuleContext {
		public VarNameContext varName() {
			return getRuleContext(VarNameContext.class,0);
		}
		public TerminalNode EOS() { return getToken(TinyScriptParser.EOS, 0); }
		public TerminalNode VAR() { return getToken(TinyScriptParser.VAR, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(TinyScriptParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyScriptListener ) ((TinyScriptListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyScriptListener ) ((TinyScriptListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyScriptVisitor ) return ((TinyScriptVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				{
				setState(133);
				match(VAR);
				}
				break;
			case ID:
				{
				setState(134);
				typeName();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(137);
			varName();
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(138);
				match(ASSIGN);
				setState(139);
				expression(0);
				}
			}

			setState(142);
			match(EOS);
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
	public static class TypeNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TinyScriptParser.ID, 0); }
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyScriptListener ) ((TinyScriptListener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyScriptListener ) ((TinyScriptListener)listener).exitTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyScriptVisitor ) return ((TinyScriptVisitor<? extends T>)visitor).visitTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_typeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(ID);
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
	public static class VarNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TinyScriptParser.ID, 0); }
		public VarNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyScriptListener ) ((TinyScriptListener)listener).enterVarName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyScriptListener ) ((TinyScriptListener)listener).exitVarName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyScriptVisitor ) return ((TinyScriptVisitor<? extends T>)visitor).visitVarName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarNameContext varName() throws RecognitionException {
		VarNameContext _localctx = new VarNameContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_varName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(ID);
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
	public static class AssignmentStatementContext extends ParserRuleContext {
		public VarNameContext varName() {
			return getRuleContext(VarNameContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(TinyScriptParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode EOS() { return getToken(TinyScriptParser.EOS, 0); }
		public AssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyScriptListener ) ((TinyScriptListener)listener).enterAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyScriptListener ) ((TinyScriptListener)listener).exitAssignmentStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyScriptVisitor ) return ((TinyScriptVisitor<? extends T>)visitor).visitAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentStatementContext assignmentStatement() throws RecognitionException {
		AssignmentStatementContext _localctx = new AssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_assignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			varName();
			setState(149);
			match(ASSIGN);
			setState(150);
			expression(0);
			setState(151);
			match(EOS);
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
	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(TinyScriptParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(TinyScriptParser.LPAREN, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(TinyScriptParser.RPAREN, 0); }
		public TerminalNode LCURLY() { return getToken(TinyScriptParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(TinyScriptParser.RCURLY, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyScriptListener ) ((TinyScriptListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyScriptListener ) ((TinyScriptListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyScriptVisitor ) return ((TinyScriptVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_whileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(WHILE);
			setState(154);
			match(LPAREN);
			setState(155);
			condition();
			setState(156);
			match(RPAREN);
			setState(157);
			match(LCURLY);
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2171076608L) != 0)) {
				{
				{
				setState(158);
				statement();
				}
				}
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(164);
			match(RCURLY);
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
	public static class ConditionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyScriptListener ) ((TinyScriptListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyScriptListener ) ((TinyScriptListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyScriptVisitor ) return ((TinyScriptVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			expression(0);
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
	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(TinyScriptParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(TinyScriptParser.LPAREN, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(TinyScriptParser.RPAREN, 0); }
		public TerminalNode LCURLY() { return getToken(TinyScriptParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(TinyScriptParser.RCURLY, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ElseStatementContext elseStatement() {
			return getRuleContext(ElseStatementContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyScriptListener ) ((TinyScriptListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyScriptListener ) ((TinyScriptListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyScriptVisitor ) return ((TinyScriptVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(IF);
			setState(169);
			match(LPAREN);
			setState(170);
			condition();
			setState(171);
			match(RPAREN);
			setState(172);
			match(LCURLY);
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2171076608L) != 0)) {
				{
				{
				setState(173);
				statement();
				}
				}
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(179);
			match(RCURLY);
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(180);
				elseStatement();
				}
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
	public static class ElseStatementContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(TinyScriptParser.ELSE, 0); }
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public TerminalNode LCURLY() { return getToken(TinyScriptParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(TinyScriptParser.RCURLY, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyScriptListener ) ((TinyScriptListener)listener).enterElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyScriptListener ) ((TinyScriptListener)listener).exitElseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyScriptVisitor ) return ((TinyScriptVisitor<? extends T>)visitor).visitElseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseStatementContext elseStatement() throws RecognitionException {
		ElseStatementContext _localctx = new ElseStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_elseStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(ELSE);
			setState(193);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				{
				setState(184);
				ifStatement();
				}
				break;
			case LCURLY:
				{
				setState(185);
				match(LCURLY);
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2171076608L) != 0)) {
					{
					{
					setState(186);
					statement();
					}
					}
					setState(191);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(192);
				match(RCURLY);
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
	public static class FunctionCallContext extends ParserRuleContext {
		public FunctionTargetContext functionTarget() {
			return getRuleContext(FunctionTargetContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(TinyScriptParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(TinyScriptParser.RPAREN, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyScriptListener ) ((TinyScriptListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyScriptListener ) ((TinyScriptListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyScriptVisitor ) return ((TinyScriptVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			functionTarget();
			setState(196);
			match(LPAREN);
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4227923970L) != 0)) {
				{
				setState(197);
				parameterList();
				}
			}

			setState(200);
			match(RPAREN);
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
	public static class FunctionTargetContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TinyScriptParser.ID, 0); }
		public FunctionTargetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionTarget; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyScriptListener ) ((TinyScriptListener)listener).enterFunctionTarget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyScriptListener ) ((TinyScriptListener)listener).exitFunctionTarget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyScriptVisitor ) return ((TinyScriptVisitor<? extends T>)visitor).visitFunctionTarget(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionTargetContext functionTarget() throws RecognitionException {
		FunctionTargetContext _localctx = new FunctionTargetContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_functionTarget);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(ID);
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
	public static class ParameterListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TinyScriptParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TinyScriptParser.COMMA, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyScriptListener ) ((TinyScriptListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyScriptListener ) ((TinyScriptListener)listener).exitParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyScriptVisitor ) return ((TinyScriptVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(204);
			expression(0);
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(205);
				match(COMMA);
				setState(206);
				expression(0);
				}
				}
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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
	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(TinyScriptParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode EOS() { return getToken(TinyScriptParser.EOS, 0); }
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyScriptListener ) ((TinyScriptListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyScriptListener ) ((TinyScriptListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyScriptVisitor ) return ((TinyScriptVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(RETURN);
			setState(213);
			expression(0);
			setState(214);
			match(EOS);
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
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryExpressionContext extends ExpressionContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public PrimaryExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyScriptListener ) ((TinyScriptListener)listener).enterPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyScriptListener ) ((TinyScriptListener)listener).exitPrimaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyScriptVisitor ) return ((TinyScriptVisitor<? extends T>)visitor).visitPrimaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MulDivExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MulDivOpContext mulDivOp() {
			return getRuleContext(MulDivOpContext.class,0);
		}
		public MulDivExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyScriptListener ) ((TinyScriptListener)listener).enterMulDivExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyScriptListener ) ((TinyScriptListener)listener).exitMulDivExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyScriptVisitor ) return ((TinyScriptVisitor<? extends T>)visitor).visitMulDivExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddSubExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AddSubOpContext addSubOp() {
			return getRuleContext(AddSubOpContext.class,0);
		}
		public AddSubExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyScriptListener ) ((TinyScriptListener)listener).enterAddSubExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyScriptListener ) ((TinyScriptListener)listener).exitAddSubExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyScriptVisitor ) return ((TinyScriptVisitor<? extends T>)visitor).visitAddSubExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicalExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public LogicalOpContext logicalOp() {
			return getRuleContext(LogicalOpContext.class,0);
		}
		public LogicalExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyScriptListener ) ((TinyScriptListener)listener).enterLogicalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyScriptListener ) ((TinyScriptListener)listener).exitLogicalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyScriptVisitor ) return ((TinyScriptVisitor<? extends T>)visitor).visitLogicalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PrimaryExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(217);
			primary();
			}
			_ctx.stop = _input.LT(-1);
			setState(233);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(231);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(219);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(220);
						mulDivOp();
						setState(221);
						expression(4);
						}
						break;
					case 2:
						{
						_localctx = new AddSubExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(223);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(224);
						addSubOp();
						setState(225);
						expression(3);
						}
						break;
					case 3:
						{
						_localctx = new LogicalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(227);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(228);
						logicalOp();
						setState(229);
						expression(2);
						}
						break;
					}
					} 
				}
				setState(235);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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
	public static class AddSubOpContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(TinyScriptParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(TinyScriptParser.MINUS, 0); }
		public AddSubOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addSubOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyScriptListener ) ((TinyScriptListener)listener).enterAddSubOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyScriptListener ) ((TinyScriptListener)listener).exitAddSubOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyScriptVisitor ) return ((TinyScriptVisitor<? extends T>)visitor).visitAddSubOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddSubOpContext addSubOp() throws RecognitionException {
		AddSubOpContext _localctx = new AddSubOpContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_addSubOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
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
	public static class MulDivOpContext extends ParserRuleContext {
		public TerminalNode MUL() { return getToken(TinyScriptParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(TinyScriptParser.DIV, 0); }
		public MulDivOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulDivOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyScriptListener ) ((TinyScriptListener)listener).enterMulDivOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyScriptListener ) ((TinyScriptListener)listener).exitMulDivOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyScriptVisitor ) return ((TinyScriptVisitor<? extends T>)visitor).visitMulDivOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MulDivOpContext mulDivOp() throws RecognitionException {
		MulDivOpContext _localctx = new MulDivOpContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_mulDivOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			_la = _input.LA(1);
			if ( !(_la==MUL || _la==DIV) ) {
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
	public static class LogicalOpContext extends ParserRuleContext {
		public TerminalNode GTE() { return getToken(TinyScriptParser.GTE, 0); }
		public TerminalNode LTE() { return getToken(TinyScriptParser.LTE, 0); }
		public TerminalNode GT() { return getToken(TinyScriptParser.GT, 0); }
		public TerminalNode LT() { return getToken(TinyScriptParser.LT, 0); }
		public TerminalNode EQ() { return getToken(TinyScriptParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(TinyScriptParser.NEQ, 0); }
		public LogicalOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyScriptListener ) ((TinyScriptListener)listener).enterLogicalOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyScriptListener ) ((TinyScriptListener)listener).exitLogicalOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyScriptVisitor ) return ((TinyScriptVisitor<? extends T>)visitor).visitLogicalOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalOpContext logicalOp() throws RecognitionException {
		LogicalOpContext _localctx = new LogicalOpContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_logicalOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 15744L) != 0)) ) {
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
	public static class PrimaryContext extends ParserRuleContext {
		public ParenthesizedExpressionContext parenthesizedExpression() {
			return getRuleContext(ParenthesizedExpressionContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public LiteralExpressionContext literalExpression() {
			return getRuleContext(LiteralExpressionContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyScriptListener ) ((TinyScriptListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyScriptListener ) ((TinyScriptListener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyScriptVisitor ) return ((TinyScriptVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_primary);
		try {
			setState(245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				parenthesizedExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(243);
				functionCall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(244);
				literalExpression();
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
	public static class ParenthesizedExpressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(TinyScriptParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(TinyScriptParser.RPAREN, 0); }
		public ParenthesizedExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parenthesizedExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyScriptListener ) ((TinyScriptListener)listener).enterParenthesizedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyScriptListener ) ((TinyScriptListener)listener).exitParenthesizedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyScriptVisitor ) return ((TinyScriptVisitor<? extends T>)visitor).visitParenthesizedExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParenthesizedExpressionContext parenthesizedExpression() throws RecognitionException {
		ParenthesizedExpressionContext _localctx = new ParenthesizedExpressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_parenthesizedExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(LPAREN);
			setState(248);
			expression(0);
			setState(249);
			match(RPAREN);
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
	public static class LiteralExpressionContext extends ParserRuleContext {
		public NullLiteralContext nullLiteral() {
			return getRuleContext(NullLiteralContext.class,0);
		}
		public IntLiteralContext intLiteral() {
			return getRuleContext(IntLiteralContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public BoolLiteralContext boolLiteral() {
			return getRuleContext(BoolLiteralContext.class,0);
		}
		public VarRefContext varRef() {
			return getRuleContext(VarRefContext.class,0);
		}
		public LiteralExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyScriptListener ) ((TinyScriptListener)listener).enterLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyScriptListener ) ((TinyScriptListener)listener).exitLiteralExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyScriptVisitor ) return ((TinyScriptVisitor<? extends T>)visitor).visitLiteralExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralExpressionContext literalExpression() throws RecognitionException {
		LiteralExpressionContext _localctx = new LiteralExpressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_literalExpression);
		try {
			setState(256);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NULL:
				enterOuterAlt(_localctx, 1);
				{
				setState(251);
				nullLiteral();
				}
				break;
			case MINUS:
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(252);
				intLiteral();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(253);
				stringLiteral();
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 4);
				{
				setState(254);
				boolLiteral();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 5);
				{
				setState(255);
				varRef();
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
	public static class VarRefContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TinyScriptParser.ID, 0); }
		public VarRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyScriptListener ) ((TinyScriptListener)listener).enterVarRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyScriptListener ) ((TinyScriptListener)listener).exitVarRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyScriptVisitor ) return ((TinyScriptVisitor<? extends T>)visitor).visitVarRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarRefContext varRef() throws RecognitionException {
		VarRefContext _localctx = new VarRefContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_varRef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(ID);
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
	public static class NullLiteralContext extends ParserRuleContext {
		public TerminalNode NULL() { return getToken(TinyScriptParser.NULL, 0); }
		public NullLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyScriptListener ) ((TinyScriptListener)listener).enterNullLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyScriptListener ) ((TinyScriptListener)listener).exitNullLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyScriptVisitor ) return ((TinyScriptVisitor<? extends T>)visitor).visitNullLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NullLiteralContext nullLiteral() throws RecognitionException {
		NullLiteralContext _localctx = new NullLiteralContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_nullLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(NULL);
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
	public static class IntLiteralContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(TinyScriptParser.INT, 0); }
		public TerminalNode MINUS() { return getToken(TinyScriptParser.MINUS, 0); }
		public IntLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyScriptListener ) ((TinyScriptListener)listener).enterIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyScriptListener ) ((TinyScriptListener)listener).exitIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyScriptVisitor ) return ((TinyScriptVisitor<? extends T>)visitor).visitIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntLiteralContext intLiteral() throws RecognitionException {
		IntLiteralContext _localctx = new IntLiteralContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_intLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(262);
				match(MINUS);
				}
			}

			setState(265);
			match(INT);
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
	public static class StringLiteralContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(TinyScriptParser.STRING, 0); }
		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyScriptListener ) ((TinyScriptListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyScriptListener ) ((TinyScriptListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyScriptVisitor ) return ((TinyScriptVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringLiteralContext stringLiteral() throws RecognitionException {
		StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_stringLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(STRING);
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
	public static class BoolLiteralContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(TinyScriptParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(TinyScriptParser.FALSE, 0); }
		public BoolLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyScriptListener ) ((TinyScriptListener)listener).enterBoolLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyScriptListener ) ((TinyScriptListener)listener).exitBoolLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyScriptVisitor ) return ((TinyScriptVisitor<? extends T>)visitor).visitBoolLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolLiteralContext boolLiteral() throws RecognitionException {
		BoolLiteralContext _localctx = new BoolLiteralContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_boolLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 21:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\"\u0110\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0001\u0000\u0005\u0000D\b\u0000"+
		"\n\u0000\f\u0000G\t\u0000\u0001\u0000\u0001\u0000\u0005\u0000K\b\u0000"+
		"\n\u0000\f\u0000N\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0005\u0001V\b\u0001\n\u0001\f\u0001Y\t\u0001"+
		"\u0003\u0001[\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001"+
		"`\b\u0001\n\u0001\f\u0001c\t\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0005\u0007u\b\u0007\n\u0007\f\u0007x\t\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0003\b\u0084\b\b\u0001\t\u0001\t\u0003\t\u0088\b\t\u0001\t\u0001\t"+
		"\u0001\t\u0003\t\u008d\b\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0005\r\u00a0\b\r\n\r\f\r\u00a3\t\r\u0001\r"+
		"\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u00af\b\u000f\n\u000f\f\u000f"+
		"\u00b2\t\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00b6\b\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u00bc\b\u0010\n"+
		"\u0010\f\u0010\u00bf\t\u0010\u0001\u0010\u0003\u0010\u00c2\b\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00c7\b\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0005"+
		"\u0013\u00d0\b\u0013\n\u0013\f\u0013\u00d3\t\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015"+
		"\u00e8\b\u0015\n\u0015\f\u0015\u00eb\t\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0003\u0019\u00f6\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003"+
		"\u001b\u0101\b\u001b\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001"+
		"\u001e\u0003\u001e\u0108\b\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001"+
		"\u001f\u0001 \u0001 \u0001 \u0000\u0001*!\u0000\u0002\u0004\u0006\b\n"+
		"\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.0246"+
		"8:<>@\u0000\u0005\u0002\u0000\u0019\u0019\u001f\u001f\u0001\u0000\u000f"+
		"\u0010\u0001\u0000\u0011\u0012\u0002\u0000\u0007\b\n\r\u0001\u0000\u001b"+
		"\u001c\u010c\u0000E\u0001\u0000\u0000\u0000\u0002O\u0001\u0000\u0000\u0000"+
		"\u0004f\u0001\u0000\u0000\u0000\u0006h\u0001\u0000\u0000\u0000\bj\u0001"+
		"\u0000\u0000\u0000\nm\u0001\u0000\u0000\u0000\fo\u0001\u0000\u0000\u0000"+
		"\u000eq\u0001\u0000\u0000\u0000\u0010\u0083\u0001\u0000\u0000\u0000\u0012"+
		"\u0087\u0001\u0000\u0000\u0000\u0014\u0090\u0001\u0000\u0000\u0000\u0016"+
		"\u0092\u0001\u0000\u0000\u0000\u0018\u0094\u0001\u0000\u0000\u0000\u001a"+
		"\u0099\u0001\u0000\u0000\u0000\u001c\u00a6\u0001\u0000\u0000\u0000\u001e"+
		"\u00a8\u0001\u0000\u0000\u0000 \u00b7\u0001\u0000\u0000\u0000\"\u00c3"+
		"\u0001\u0000\u0000\u0000$\u00ca\u0001\u0000\u0000\u0000&\u00cc\u0001\u0000"+
		"\u0000\u0000(\u00d4\u0001\u0000\u0000\u0000*\u00d8\u0001\u0000\u0000\u0000"+
		",\u00ec\u0001\u0000\u0000\u0000.\u00ee\u0001\u0000\u0000\u00000\u00f0"+
		"\u0001\u0000\u0000\u00002\u00f5\u0001\u0000\u0000\u00004\u00f7\u0001\u0000"+
		"\u0000\u00006\u0100\u0001\u0000\u0000\u00008\u0102\u0001\u0000\u0000\u0000"+
		":\u0104\u0001\u0000\u0000\u0000<\u0107\u0001\u0000\u0000\u0000>\u010b"+
		"\u0001\u0000\u0000\u0000@\u010d\u0001\u0000\u0000\u0000BD\u0003\u0002"+
		"\u0001\u0000CB\u0001\u0000\u0000\u0000DG\u0001\u0000\u0000\u0000EC\u0001"+
		"\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000FH\u0001\u0000\u0000\u0000"+
		"GE\u0001\u0000\u0000\u0000HL\u0003\u000e\u0007\u0000IK\u0003\u0002\u0001"+
		"\u0000JI\u0001\u0000\u0000\u0000KN\u0001\u0000\u0000\u0000LJ\u0001\u0000"+
		"\u0000\u0000LM\u0001\u0000\u0000\u0000M\u0001\u0001\u0000\u0000\u0000"+
		"NL\u0001\u0000\u0000\u0000OP\u0003\u0004\u0002\u0000PQ\u0003\u0006\u0003"+
		"\u0000QZ\u0005\u0001\u0000\u0000RW\u0003\b\u0004\u0000ST\u0005\u0006\u0000"+
		"\u0000TV\u0003\b\u0004\u0000US\u0001\u0000\u0000\u0000VY\u0001\u0000\u0000"+
		"\u0000WU\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000X[\u0001\u0000"+
		"\u0000\u0000YW\u0001\u0000\u0000\u0000ZR\u0001\u0000\u0000\u0000Z[\u0001"+
		"\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\]\u0005\u0002\u0000\u0000"+
		"]a\u0005\u0003\u0000\u0000^`\u0003\u0010\b\u0000_^\u0001\u0000\u0000\u0000"+
		"`c\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000"+
		"\u0000bd\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000de\u0005\u0004"+
		"\u0000\u0000e\u0003\u0001\u0000\u0000\u0000fg\u0007\u0000\u0000\u0000"+
		"g\u0005\u0001\u0000\u0000\u0000hi\u0005\u001f\u0000\u0000i\u0007\u0001"+
		"\u0000\u0000\u0000jk\u0003\n\u0005\u0000kl\u0003\f\u0006\u0000l\t\u0001"+
		"\u0000\u0000\u0000mn\u0005\u001f\u0000\u0000n\u000b\u0001\u0000\u0000"+
		"\u0000op\u0005\u001f\u0000\u0000p\r\u0001\u0000\u0000\u0000qr\u0005\u0017"+
		"\u0000\u0000rv\u0005\u0003\u0000\u0000su\u0003\u0010\b\u0000ts\u0001\u0000"+
		"\u0000\u0000ux\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000vw\u0001"+
		"\u0000\u0000\u0000wy\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000"+
		"yz\u0005\u0004\u0000\u0000z\u000f\u0001\u0000\u0000\u0000{\u0084\u0003"+
		"\u0012\t\u0000|\u0084\u0003\u0018\f\u0000}\u0084\u0003\u001a\r\u0000~"+
		"\u0084\u0003\u001e\u000f\u0000\u007f\u0080\u0003\"\u0011\u0000\u0080\u0081"+
		"\u0005\u0005\u0000\u0000\u0081\u0084\u0001\u0000\u0000\u0000\u0082\u0084"+
		"\u0003(\u0014\u0000\u0083{\u0001\u0000\u0000\u0000\u0083|\u0001\u0000"+
		"\u0000\u0000\u0083}\u0001\u0000\u0000\u0000\u0083~\u0001\u0000\u0000\u0000"+
		"\u0083\u007f\u0001\u0000\u0000\u0000\u0083\u0082\u0001\u0000\u0000\u0000"+
		"\u0084\u0011\u0001\u0000\u0000\u0000\u0085\u0088\u0005\u0016\u0000\u0000"+
		"\u0086\u0088\u0003\u0014\n\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0087"+
		"\u0086\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089"+
		"\u008c\u0003\u0016\u000b\u0000\u008a\u008b\u0005\u000e\u0000\u0000\u008b"+
		"\u008d\u0003*\u0015\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008c\u008d"+
		"\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u008f"+
		"\u0005\u0005\u0000\u0000\u008f\u0013\u0001\u0000\u0000\u0000\u0090\u0091"+
		"\u0005\u001f\u0000\u0000\u0091\u0015\u0001\u0000\u0000\u0000\u0092\u0093"+
		"\u0005\u001f\u0000\u0000\u0093\u0017\u0001\u0000\u0000\u0000\u0094\u0095"+
		"\u0003\u0016\u000b\u0000\u0095\u0096\u0005\u000e\u0000\u0000\u0096\u0097"+
		"\u0003*\u0015\u0000\u0097\u0098\u0005\u0005\u0000\u0000\u0098\u0019\u0001"+
		"\u0000\u0000\u0000\u0099\u009a\u0005\u0015\u0000\u0000\u009a\u009b\u0005"+
		"\u0001\u0000\u0000\u009b\u009c\u0003\u001c\u000e\u0000\u009c\u009d\u0005"+
		"\u0002\u0000\u0000\u009d\u00a1\u0005\u0003\u0000\u0000\u009e\u00a0\u0003"+
		"\u0010\b\u0000\u009f\u009e\u0001\u0000\u0000\u0000\u00a0\u00a3\u0001\u0000"+
		"\u0000\u0000\u00a1\u009f\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000"+
		"\u0000\u0000\u00a2\u00a4\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000"+
		"\u0000\u0000\u00a4\u00a5\u0005\u0004\u0000\u0000\u00a5\u001b\u0001\u0000"+
		"\u0000\u0000\u00a6\u00a7\u0003*\u0015\u0000\u00a7\u001d\u0001\u0000\u0000"+
		"\u0000\u00a8\u00a9\u0005\u0013\u0000\u0000\u00a9\u00aa\u0005\u0001\u0000"+
		"\u0000\u00aa\u00ab\u0003\u001c\u000e\u0000\u00ab\u00ac\u0005\u0002\u0000"+
		"\u0000\u00ac\u00b0\u0005\u0003\u0000\u0000\u00ad\u00af\u0003\u0010\b\u0000"+
		"\u00ae\u00ad\u0001\u0000\u0000\u0000\u00af\u00b2\u0001\u0000\u0000\u0000"+
		"\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000"+
		"\u00b1\u00b3\u0001\u0000\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000"+
		"\u00b3\u00b5\u0005\u0004\u0000\u0000\u00b4\u00b6\u0003 \u0010\u0000\u00b5"+
		"\u00b4\u0001\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6"+
		"\u001f\u0001\u0000\u0000\u0000\u00b7\u00c1\u0005\u0014\u0000\u0000\u00b8"+
		"\u00c2\u0003\u001e\u000f\u0000\u00b9\u00bd\u0005\u0003\u0000\u0000\u00ba"+
		"\u00bc\u0003\u0010\b\u0000\u00bb\u00ba\u0001\u0000\u0000\u0000\u00bc\u00bf"+
		"\u0001\u0000\u0000\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000\u00bd\u00be"+
		"\u0001\u0000\u0000\u0000\u00be\u00c0\u0001\u0000\u0000\u0000\u00bf\u00bd"+
		"\u0001\u0000\u0000\u0000\u00c0\u00c2\u0005\u0004\u0000\u0000\u00c1\u00b8"+
		"\u0001\u0000\u0000\u0000\u00c1\u00b9\u0001\u0000\u0000\u0000\u00c2!\u0001"+
		"\u0000\u0000\u0000\u00c3\u00c4\u0003$\u0012\u0000\u00c4\u00c6\u0005\u0001"+
		"\u0000\u0000\u00c5\u00c7\u0003&\u0013\u0000\u00c6\u00c5\u0001\u0000\u0000"+
		"\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000"+
		"\u0000\u00c8\u00c9\u0005\u0002\u0000\u0000\u00c9#\u0001\u0000\u0000\u0000"+
		"\u00ca\u00cb\u0005\u001f\u0000\u0000\u00cb%\u0001\u0000\u0000\u0000\u00cc"+
		"\u00d1\u0003*\u0015\u0000\u00cd\u00ce\u0005\u0006\u0000\u0000\u00ce\u00d0"+
		"\u0003*\u0015\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000\u00d0\u00d3\u0001"+
		"\u0000\u0000\u0000\u00d1\u00cf\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001"+
		"\u0000\u0000\u0000\u00d2\'\u0001\u0000\u0000\u0000\u00d3\u00d1\u0001\u0000"+
		"\u0000\u0000\u00d4\u00d5\u0005\u0018\u0000\u0000\u00d5\u00d6\u0003*\u0015"+
		"\u0000\u00d6\u00d7\u0005\u0005\u0000\u0000\u00d7)\u0001\u0000\u0000\u0000"+
		"\u00d8\u00d9\u0006\u0015\uffff\uffff\u0000\u00d9\u00da\u00032\u0019\u0000"+
		"\u00da\u00e9\u0001\u0000\u0000\u0000\u00db\u00dc\n\u0003\u0000\u0000\u00dc"+
		"\u00dd\u0003.\u0017\u0000\u00dd\u00de\u0003*\u0015\u0004\u00de\u00e8\u0001"+
		"\u0000\u0000\u0000\u00df\u00e0\n\u0002\u0000\u0000\u00e0\u00e1\u0003,"+
		"\u0016\u0000\u00e1\u00e2\u0003*\u0015\u0003\u00e2\u00e8\u0001\u0000\u0000"+
		"\u0000\u00e3\u00e4\n\u0001\u0000\u0000\u00e4\u00e5\u00030\u0018\u0000"+
		"\u00e5\u00e6\u0003*\u0015\u0002\u00e6\u00e8\u0001\u0000\u0000\u0000\u00e7"+
		"\u00db\u0001\u0000\u0000\u0000\u00e7\u00df\u0001\u0000\u0000\u0000\u00e7"+
		"\u00e3\u0001\u0000\u0000\u0000\u00e8\u00eb\u0001\u0000\u0000\u0000\u00e9"+
		"\u00e7\u0001\u0000\u0000\u0000\u00e9\u00ea\u0001\u0000\u0000\u0000\u00ea"+
		"+\u0001\u0000\u0000\u0000\u00eb\u00e9\u0001\u0000\u0000\u0000\u00ec\u00ed"+
		"\u0007\u0001\u0000\u0000\u00ed-\u0001\u0000\u0000\u0000\u00ee\u00ef\u0007"+
		"\u0002\u0000\u0000\u00ef/\u0001\u0000\u0000\u0000\u00f0\u00f1\u0007\u0003"+
		"\u0000\u0000\u00f11\u0001\u0000\u0000\u0000\u00f2\u00f6\u00034\u001a\u0000"+
		"\u00f3\u00f6\u0003\"\u0011\u0000\u00f4\u00f6\u00036\u001b\u0000\u00f5"+
		"\u00f2\u0001\u0000\u0000\u0000\u00f5\u00f3\u0001\u0000\u0000\u0000\u00f5"+
		"\u00f4\u0001\u0000\u0000\u0000\u00f63\u0001\u0000\u0000\u0000\u00f7\u00f8"+
		"\u0005\u0001\u0000\u0000\u00f8\u00f9\u0003*\u0015\u0000\u00f9\u00fa\u0005"+
		"\u0002\u0000\u0000\u00fa5\u0001\u0000\u0000\u0000\u00fb\u0101\u0003:\u001d"+
		"\u0000\u00fc\u0101\u0003<\u001e\u0000\u00fd\u0101\u0003>\u001f\u0000\u00fe"+
		"\u0101\u0003@ \u0000\u00ff\u0101\u00038\u001c\u0000\u0100\u00fb\u0001"+
		"\u0000\u0000\u0000\u0100\u00fc\u0001\u0000\u0000\u0000\u0100\u00fd\u0001"+
		"\u0000\u0000\u0000\u0100\u00fe\u0001\u0000\u0000\u0000\u0100\u00ff\u0001"+
		"\u0000\u0000\u0000\u01017\u0001\u0000\u0000\u0000\u0102\u0103\u0005\u001f"+
		"\u0000\u0000\u01039\u0001\u0000\u0000\u0000\u0104\u0105\u0005\u001a\u0000"+
		"\u0000\u0105;\u0001\u0000\u0000\u0000\u0106\u0108\u0005\u0010\u0000\u0000"+
		"\u0107\u0106\u0001\u0000\u0000\u0000\u0107\u0108\u0001\u0000\u0000\u0000"+
		"\u0108\u0109\u0001\u0000\u0000\u0000\u0109\u010a\u0005\u001e\u0000\u0000"+
		"\u010a=\u0001\u0000\u0000\u0000\u010b\u010c\u0005\u001d\u0000\u0000\u010c"+
		"?\u0001\u0000\u0000\u0000\u010d\u010e\u0007\u0004\u0000\u0000\u010eA\u0001"+
		"\u0000\u0000\u0000\u0015ELWZav\u0083\u0087\u008c\u00a1\u00b0\u00b5\u00bd"+
		"\u00c1\u00c6\u00d1\u00e7\u00e9\u00f5\u0100\u0107";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}