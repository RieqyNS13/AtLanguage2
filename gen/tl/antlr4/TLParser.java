// Generated from D:/gay/Java/tiny-language-antlr4/src/main/antlr4/tl/antlr4\TL.g4 by ANTLR 4.7
package tl.antlr4;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AtBegin=1, AtEnd=2, Println=3, Print=4, Input=5, Assert=6, Size=7, Def=8, 
		If=9, Else=10, Return=11, For=12, While=13, To=14, Do=15, End=16, In=17, 
		Null=18, Or=19, And=20, Equals=21, NEquals=22, GTEquals=23, LTEquals=24, 
		Pow=25, Excl=26, GT=27, LT=28, Add=29, Subtract=30, Multiply=31, Divide=32, 
		Modulus=33, OBrace=34, CBrace=35, OBracket=36, CBracket=37, OParen=38, 
		CParen=39, SColon=40, Assign=41, Comma=42, QMark=43, Colon=44, Bool=45, 
		Number=46, Identifier=47, String=48, Comment=49, Space=50;
	public static final int
		RULE_parse = 0, RULE_block = 1, RULE_statement = 2, RULE_assignment = 3, 
		RULE_functionCall = 4, RULE_ifStatement = 5, RULE_ifStat = 6, RULE_elseIfStat = 7, 
		RULE_elseStat = 8, RULE_functionDecl = 9, RULE_forStatement = 10, RULE_whileStatement = 11, 
		RULE_idList = 12, RULE_exprList = 13, RULE_expression = 14, RULE_list = 15, 
		RULE_indexes = 16;
	public static final String[] ruleNames = {
		"parse", "block", "statement", "assignment", "functionCall", "ifStatement", 
		"ifStat", "elseIfStat", "elseStat", "functionDecl", "forStatement", "whileStatement", 
		"idList", "exprList", "expression", "list", "indexes"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'AtBegin'", "'AtEnd'", null, null, "'input'", "'assert'", "'size'", 
		"'def'", "'if'", "'else'", "'return'", "'for'", "'while'", "'to'", "'do'", 
		"'end'", "'in'", "'null'", "'||'", "'&&'", "'=='", "'!='", "'>='", "'<='", 
		"'^'", "'!'", "'>'", "'<'", "'+'", "'-'", "'*'", "'/'", "'%'", "'{'", 
		"'}'", "'['", "']'", "'('", "')'", "';'", "'='", "','", "'?'", "':'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "AtBegin", "AtEnd", "Println", "Print", "Input", "Assert", "Size", 
		"Def", "If", "Else", "Return", "For", "While", "To", "Do", "End", "In", 
		"Null", "Or", "And", "Equals", "NEquals", "GTEquals", "LTEquals", "Pow", 
		"Excl", "GT", "LT", "Add", "Subtract", "Multiply", "Divide", "Modulus", 
		"OBrace", "CBrace", "OBracket", "CBracket", "OParen", "CParen", "SColon", 
		"Assign", "Comma", "QMark", "Colon", "Bool", "Number", "Identifier", "String", 
		"Comment", "Space"
	};
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
	public String getGrammarFileName() { return "TL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ParseContext extends ParserRuleContext {
		public TerminalNode AtBegin() { return getToken(TLParser.AtBegin, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode AtEnd() { return getToken(TLParser.AtEnd, 0); }
		public TerminalNode EOF() { return getToken(TLParser.EOF, 0); }
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitParse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(AtBegin);
			setState(35);
			block();
			setState(36);
			match(AtEnd);
			setState(37);
			match(EOF);
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
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<FunctionDeclContext> functionDecl() {
			return getRuleContexts(FunctionDeclContext.class);
		}
		public FunctionDeclContext functionDecl(int i) {
			return getRuleContext(FunctionDeclContext.class,i);
		}
		public TerminalNode Return() { return getToken(TLParser.Return, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Println) | (1L << Print) | (1L << Assert) | (1L << Size) | (1L << Def) | (1L << If) | (1L << For) | (1L << While) | (1L << Identifier))) != 0)) {
				{
				setState(41);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Println:
				case Print:
				case Assert:
				case Size:
				case If:
				case For:
				case While:
				case Identifier:
					{
					setState(39);
					statement();
					}
					break;
				case Def:
					{
					setState(40);
					functionDecl();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Return) {
				{
				setState(46);
				match(Return);
				setState(47);
				expression(0);
				setState(48);
				match(SColon);
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

	public static class StatementContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(61);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				assignment();
				setState(53);
				match(SColon);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				functionCall();
				setState(56);
				match(SColon);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(58);
				ifStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(59);
				forStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(60);
				whileStatement();
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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TLParser.Identifier, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IndexesContext indexes() {
			return getRuleContext(IndexesContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(Identifier);
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OBracket) {
				{
				setState(64);
				indexes();
				}
			}

			setState(67);
			match(Assign);
			setState(68);
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

	public static class FunctionCallContext extends ParserRuleContext {
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
	 
		public FunctionCallContext() { }
		public void copyFrom(FunctionCallContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssertFunctionCallContext extends FunctionCallContext {
		public TerminalNode Assert() { return getToken(TLParser.Assert, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssertFunctionCallContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterAssertFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitAssertFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitAssertFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SizeFunctionCallContext extends FunctionCallContext {
		public TerminalNode Size() { return getToken(TLParser.Size, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SizeFunctionCallContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterSizeFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitSizeFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitSizeFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintlnFunctionCallContext extends FunctionCallContext {
		public TerminalNode Println() { return getToken(TLParser.Println, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintlnFunctionCallContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterPrintlnFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitPrintlnFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitPrintlnFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdentifierFunctionCallContext extends FunctionCallContext {
		public TerminalNode Identifier() { return getToken(TLParser.Identifier, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public IdentifierFunctionCallContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterIdentifierFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitIdentifierFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitIdentifierFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintFunctionCallContext extends FunctionCallContext {
		public TerminalNode Print() { return getToken(TLParser.Print, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintFunctionCallContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterPrintFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitPrintFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitPrintFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_functionCall);
		int _la;
		try {
			setState(97);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				_localctx = new IdentifierFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				match(Identifier);
				setState(71);
				match(OParen);
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Println) | (1L << Print) | (1L << Input) | (1L << Assert) | (1L << Size) | (1L << Null) | (1L << Excl) | (1L << Subtract) | (1L << OBracket) | (1L << OParen) | (1L << Bool) | (1L << Number) | (1L << Identifier) | (1L << String))) != 0)) {
					{
					setState(72);
					exprList();
					}
				}

				setState(75);
				match(CParen);
				}
				break;
			case Println:
				_localctx = new PrintlnFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				match(Println);
				setState(77);
				match(OParen);
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Println) | (1L << Print) | (1L << Input) | (1L << Assert) | (1L << Size) | (1L << Null) | (1L << Excl) | (1L << Subtract) | (1L << OBracket) | (1L << OParen) | (1L << Bool) | (1L << Number) | (1L << Identifier) | (1L << String))) != 0)) {
					{
					setState(78);
					expression(0);
					}
				}

				setState(81);
				match(CParen);
				}
				break;
			case Print:
				_localctx = new PrintFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(82);
				match(Print);
				setState(83);
				match(OParen);
				setState(84);
				expression(0);
				setState(85);
				match(CParen);
				}
				break;
			case Assert:
				_localctx = new AssertFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(87);
				match(Assert);
				setState(88);
				match(OParen);
				setState(89);
				expression(0);
				setState(90);
				match(CParen);
				}
				break;
			case Size:
				_localctx = new SizeFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(92);
				match(Size);
				setState(93);
				match(OParen);
				setState(94);
				expression(0);
				setState(95);
				match(CParen);
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

	public static class IfStatementContext extends ParserRuleContext {
		public IfStatContext ifStat() {
			return getRuleContext(IfStatContext.class,0);
		}
		public TerminalNode End() { return getToken(TLParser.End, 0); }
		public List<ElseIfStatContext> elseIfStat() {
			return getRuleContexts(ElseIfStatContext.class);
		}
		public ElseIfStatContext elseIfStat(int i) {
			return getRuleContext(ElseIfStatContext.class,i);
		}
		public ElseStatContext elseStat() {
			return getRuleContext(ElseStatContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ifStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			ifStat();
			setState(103);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(100);
					elseIfStat();
					}
					} 
				}
				setState(105);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Else) {
				{
				setState(106);
				elseStat();
				}
			}

			setState(109);
			match(End);
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

	public static class IfStatContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(TLParser.If, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Do() { return getToken(TLParser.Do, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IfStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterIfStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitIfStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitIfStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatContext ifStat() throws RecognitionException {
		IfStatContext _localctx = new IfStatContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ifStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(If);
			setState(112);
			expression(0);
			setState(113);
			match(Do);
			setState(114);
			block();
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

	public static class ElseIfStatContext extends ParserRuleContext {
		public TerminalNode Else() { return getToken(TLParser.Else, 0); }
		public TerminalNode If() { return getToken(TLParser.If, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Do() { return getToken(TLParser.Do, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElseIfStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIfStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterElseIfStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitElseIfStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitElseIfStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseIfStatContext elseIfStat() throws RecognitionException {
		ElseIfStatContext _localctx = new ElseIfStatContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_elseIfStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(Else);
			setState(117);
			match(If);
			setState(118);
			expression(0);
			setState(119);
			match(Do);
			setState(120);
			block();
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

	public static class ElseStatContext extends ParserRuleContext {
		public TerminalNode Else() { return getToken(TLParser.Else, 0); }
		public TerminalNode Do() { return getToken(TLParser.Do, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElseStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterElseStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitElseStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitElseStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseStatContext elseStat() throws RecognitionException {
		ElseStatContext _localctx = new ElseStatContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_elseStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(Else);
			setState(123);
			match(Do);
			setState(124);
			block();
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

	public static class FunctionDeclContext extends ParserRuleContext {
		public TerminalNode Def() { return getToken(TLParser.Def, 0); }
		public TerminalNode Identifier() { return getToken(TLParser.Identifier, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode End() { return getToken(TLParser.End, 0); }
		public IdListContext idList() {
			return getRuleContext(IdListContext.class,0);
		}
		public FunctionDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterFunctionDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitFunctionDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitFunctionDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclContext functionDecl() throws RecognitionException {
		FunctionDeclContext _localctx = new FunctionDeclContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_functionDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(Def);
			setState(127);
			match(Identifier);
			setState(128);
			match(OParen);
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(129);
				idList();
				}
			}

			setState(132);
			match(CParen);
			setState(133);
			block();
			setState(134);
			match(End);
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

	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode For() { return getToken(TLParser.For, 0); }
		public TerminalNode Identifier() { return getToken(TLParser.Identifier, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode To() { return getToken(TLParser.To, 0); }
		public TerminalNode Do() { return getToken(TLParser.Do, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode End() { return getToken(TLParser.End, 0); }
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(For);
			setState(137);
			match(Identifier);
			setState(138);
			match(Assign);
			setState(139);
			expression(0);
			setState(140);
			match(To);
			setState(141);
			expression(0);
			setState(142);
			match(Do);
			setState(143);
			block();
			setState(144);
			match(End);
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

	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode While() { return getToken(TLParser.While, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Do() { return getToken(TLParser.Do, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode End() { return getToken(TLParser.End, 0); }
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(While);
			setState(147);
			expression(0);
			setState(148);
			match(Do);
			setState(149);
			block();
			setState(150);
			match(End);
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

	public static class IdListContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(TLParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(TLParser.Identifier, i);
		}
		public IdListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterIdList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitIdList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitIdList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdListContext idList() throws RecognitionException {
		IdListContext _localctx = new IdListContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_idList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(Identifier);
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(153);
				match(Comma);
				setState(154);
				match(Identifier);
				}
				}
				setState(159);
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

	public static class ExprListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterExprList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitExprList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitExprList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprListContext exprList() throws RecognitionException {
		ExprListContext _localctx = new ExprListContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_exprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			expression(0);
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(161);
				match(Comma);
				setState(162);
				expression(0);
				}
				}
				setState(167);
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
	public static class BoolExpressionContext extends ExpressionContext {
		public TerminalNode Bool() { return getToken(TLParser.Bool, 0); }
		public BoolExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterBoolExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitBoolExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitBoolExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberExpressionContext extends ExpressionContext {
		public TerminalNode Number() { return getToken(TLParser.Number, 0); }
		public NumberExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterNumberExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitNumberExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitNumberExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdentifierExpressionContext extends ExpressionContext {
		public TerminalNode Identifier() { return getToken(TLParser.Identifier, 0); }
		public IndexesContext indexes() {
			return getRuleContext(IndexesContext.class,0);
		}
		public IdentifierExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterIdentifierExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitIdentifierExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitIdentifierExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NotExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitNotExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitNotExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public OrExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryMinusExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UnaryMinusExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterUnaryMinusExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitUnaryMinusExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitUnaryMinusExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PowerExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public PowerExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterPowerExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitPowerExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitPowerExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqExpressionContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public EqExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterEqExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitEqExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitEqExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AndExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode In() { return getToken(TLParser.In, 0); }
		public InExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterInExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitInExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitInExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringExpressionContext extends ExpressionContext {
		public TerminalNode String() { return getToken(TLParser.String, 0); }
		public IndexesContext indexes() {
			return getRuleContext(IndexesContext.class,0);
		}
		public StringExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterStringExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitStringExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitStringExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressionExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IndexesContext indexes() {
			return getRuleContext(IndexesContext.class,0);
		}
		public ExpressionExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterExpressionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitExpressionExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitExpressionExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddExpressionContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AddExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterAddExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitAddExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitAddExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CompExpressionContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public CompExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterCompExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitCompExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitCompExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NullExpressionContext extends ExpressionContext {
		public TerminalNode Null() { return getToken(TLParser.Null, 0); }
		public NullExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterNullExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitNullExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitNullExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallExpressionContext extends ExpressionContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public IndexesContext indexes() {
			return getRuleContext(IndexesContext.class,0);
		}
		public FunctionCallExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterFunctionCallExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitFunctionCallExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitFunctionCallExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultExpressionContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MultExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterMultExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitMultExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitMultExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ListExpressionContext extends ExpressionContext {
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public IndexesContext indexes() {
			return getRuleContext(IndexesContext.class,0);
		}
		public ListExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterListExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitListExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitListExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TernaryExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TernaryExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterTernaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitTernaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitTernaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InputExpressionContext extends ExpressionContext {
		public TerminalNode Input() { return getToken(TLParser.Input, 0); }
		public TerminalNode String() { return getToken(TLParser.String, 0); }
		public InputExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterInputExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitInputExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitInputExpression(this);
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
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				_localctx = new UnaryMinusExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(169);
				match(Subtract);
				setState(170);
				expression(20);
				}
				break;
			case 2:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(171);
				match(Excl);
				setState(172);
				expression(19);
				}
				break;
			case 3:
				{
				_localctx = new NumberExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(173);
				match(Number);
				}
				break;
			case 4:
				{
				_localctx = new BoolExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(174);
				match(Bool);
				}
				break;
			case 5:
				{
				_localctx = new NullExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(175);
				match(Null);
				}
				break;
			case 6:
				{
				_localctx = new FunctionCallExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(176);
				functionCall();
				setState(178);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(177);
					indexes();
					}
					break;
				}
				}
				break;
			case 7:
				{
				_localctx = new ListExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(180);
				list();
				setState(182);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(181);
					indexes();
					}
					break;
				}
				}
				break;
			case 8:
				{
				_localctx = new IdentifierExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(184);
				match(Identifier);
				setState(186);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(185);
					indexes();
					}
					break;
				}
				}
				break;
			case 9:
				{
				_localctx = new StringExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(188);
				match(String);
				setState(190);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(189);
					indexes();
					}
					break;
				}
				}
				break;
			case 10:
				{
				_localctx = new ExpressionExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(192);
				match(OParen);
				setState(193);
				expression(0);
				setState(194);
				match(CParen);
				setState(196);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(195);
					indexes();
					}
					break;
				}
				}
				break;
			case 11:
				{
				_localctx = new InputExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(198);
				match(Input);
				setState(199);
				match(OParen);
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==String) {
					{
					setState(200);
					match(String);
					}
				}

				setState(203);
				match(CParen);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(238);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(236);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new PowerExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(206);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(207);
						match(Pow);
						setState(208);
						expression(18);
						}
						break;
					case 2:
						{
						_localctx = new MultExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(209);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(210);
						((MultExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Multiply) | (1L << Divide) | (1L << Modulus))) != 0)) ) {
							((MultExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(211);
						expression(18);
						}
						break;
					case 3:
						{
						_localctx = new AddExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(212);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(213);
						((AddExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==Add || _la==Subtract) ) {
							((AddExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(214);
						expression(17);
						}
						break;
					case 4:
						{
						_localctx = new CompExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(215);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(216);
						((CompExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GTEquals) | (1L << LTEquals) | (1L << GT) | (1L << LT))) != 0)) ) {
							((CompExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(217);
						expression(16);
						}
						break;
					case 5:
						{
						_localctx = new EqExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(218);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(219);
						((EqExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==Equals || _la==NEquals) ) {
							((EqExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(220);
						expression(15);
						}
						break;
					case 6:
						{
						_localctx = new AndExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(221);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(222);
						match(And);
						setState(223);
						expression(14);
						}
						break;
					case 7:
						{
						_localctx = new OrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(224);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(225);
						match(Or);
						setState(226);
						expression(13);
						}
						break;
					case 8:
						{
						_localctx = new TernaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(227);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(228);
						match(QMark);
						setState(229);
						expression(0);
						setState(230);
						match(Colon);
						setState(231);
						expression(12);
						}
						break;
					case 9:
						{
						_localctx = new InExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(233);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(234);
						match(In);
						setState(235);
						expression(11);
						}
						break;
					}
					} 
				}
				setState(240);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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

	public static class ListContext extends ParserRuleContext {
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(OBracket);
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Println) | (1L << Print) | (1L << Input) | (1L << Assert) | (1L << Size) | (1L << Null) | (1L << Excl) | (1L << Subtract) | (1L << OBracket) | (1L << OParen) | (1L << Bool) | (1L << Number) | (1L << Identifier) | (1L << String))) != 0)) {
				{
				setState(242);
				exprList();
				}
			}

			setState(245);
			match(CBracket);
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

	public static class IndexesContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public IndexesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterIndexes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitIndexes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitIndexes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexesContext indexes() throws RecognitionException {
		IndexesContext _localctx = new IndexesContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_indexes);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(251); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(247);
					match(OBracket);
					setState(248);
					expression(0);
					setState(249);
					match(CBracket);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(253); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		case 14:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 18);
		case 1:
			return precpred(_ctx, 17);
		case 2:
			return precpred(_ctx, 16);
		case 3:
			return precpred(_ctx, 15);
		case 4:
			return precpred(_ctx, 14);
		case 5:
			return precpred(_ctx, 13);
		case 6:
			return precpred(_ctx, 12);
		case 7:
			return precpred(_ctx, 11);
		case 8:
			return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\64\u0102\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\3\2\3\2\3\3\3\3\7\3,\n\3\f\3\16\3/\13\3\3\3\3\3\3\3\3\3\5"+
		"\3\65\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4@\n\4\3\5\3\5\5\5D\n"+
		"\5\3\5\3\5\3\5\3\6\3\6\3\6\5\6L\n\6\3\6\3\6\3\6\3\6\5\6R\n\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6d\n\6\3\7\3"+
		"\7\7\7h\n\7\f\7\16\7k\13\7\3\7\5\7n\n\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\5\13\u0085"+
		"\n\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\7\16\u009e\n\16\f\16\16\16\u00a1\13"+
		"\16\3\17\3\17\3\17\7\17\u00a6\n\17\f\17\16\17\u00a9\13\17\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00b5\n\20\3\20\3\20\5\20"+
		"\u00b9\n\20\3\20\3\20\5\20\u00bd\n\20\3\20\3\20\5\20\u00c1\n\20\3\20\3"+
		"\20\3\20\3\20\5\20\u00c7\n\20\3\20\3\20\3\20\5\20\u00cc\n\20\3\20\5\20"+
		"\u00cf\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\7\20\u00ef\n\20\f\20\16\20\u00f2\13\20\3\21\3\21"+
		"\5\21\u00f6\n\21\3\21\3\21\3\22\3\22\3\22\3\22\6\22\u00fe\n\22\r\22\16"+
		"\22\u00ff\3\22\2\3\36\23\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\6"+
		"\3\2!#\3\2\37 \4\2\31\32\35\36\3\2\27\30\2\u011e\2$\3\2\2\2\4-\3\2\2\2"+
		"\6?\3\2\2\2\bA\3\2\2\2\nc\3\2\2\2\fe\3\2\2\2\16q\3\2\2\2\20v\3\2\2\2\22"+
		"|\3\2\2\2\24\u0080\3\2\2\2\26\u008a\3\2\2\2\30\u0094\3\2\2\2\32\u009a"+
		"\3\2\2\2\34\u00a2\3\2\2\2\36\u00ce\3\2\2\2 \u00f3\3\2\2\2\"\u00fd\3\2"+
		"\2\2$%\7\3\2\2%&\5\4\3\2&\'\7\4\2\2\'(\7\2\2\3(\3\3\2\2\2),\5\6\4\2*,"+
		"\5\24\13\2+)\3\2\2\2+*\3\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\64\3\2\2"+
		"\2/-\3\2\2\2\60\61\7\r\2\2\61\62\5\36\20\2\62\63\7*\2\2\63\65\3\2\2\2"+
		"\64\60\3\2\2\2\64\65\3\2\2\2\65\5\3\2\2\2\66\67\5\b\5\2\678\7*\2\28@\3"+
		"\2\2\29:\5\n\6\2:;\7*\2\2;@\3\2\2\2<@\5\f\7\2=@\5\26\f\2>@\5\30\r\2?\66"+
		"\3\2\2\2?9\3\2\2\2?<\3\2\2\2?=\3\2\2\2?>\3\2\2\2@\7\3\2\2\2AC\7\61\2\2"+
		"BD\5\"\22\2CB\3\2\2\2CD\3\2\2\2DE\3\2\2\2EF\7+\2\2FG\5\36\20\2G\t\3\2"+
		"\2\2HI\7\61\2\2IK\7(\2\2JL\5\34\17\2KJ\3\2\2\2KL\3\2\2\2LM\3\2\2\2Md\7"+
		")\2\2NO\7\5\2\2OQ\7(\2\2PR\5\36\20\2QP\3\2\2\2QR\3\2\2\2RS\3\2\2\2Sd\7"+
		")\2\2TU\7\6\2\2UV\7(\2\2VW\5\36\20\2WX\7)\2\2Xd\3\2\2\2YZ\7\b\2\2Z[\7"+
		"(\2\2[\\\5\36\20\2\\]\7)\2\2]d\3\2\2\2^_\7\t\2\2_`\7(\2\2`a\5\36\20\2"+
		"ab\7)\2\2bd\3\2\2\2cH\3\2\2\2cN\3\2\2\2cT\3\2\2\2cY\3\2\2\2c^\3\2\2\2"+
		"d\13\3\2\2\2ei\5\16\b\2fh\5\20\t\2gf\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2"+
		"\2\2jm\3\2\2\2ki\3\2\2\2ln\5\22\n\2ml\3\2\2\2mn\3\2\2\2no\3\2\2\2op\7"+
		"\22\2\2p\r\3\2\2\2qr\7\13\2\2rs\5\36\20\2st\7\21\2\2tu\5\4\3\2u\17\3\2"+
		"\2\2vw\7\f\2\2wx\7\13\2\2xy\5\36\20\2yz\7\21\2\2z{\5\4\3\2{\21\3\2\2\2"+
		"|}\7\f\2\2}~\7\21\2\2~\177\5\4\3\2\177\23\3\2\2\2\u0080\u0081\7\n\2\2"+
		"\u0081\u0082\7\61\2\2\u0082\u0084\7(\2\2\u0083\u0085\5\32\16\2\u0084\u0083"+
		"\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\7)\2\2\u0087"+
		"\u0088\5\4\3\2\u0088\u0089\7\22\2\2\u0089\25\3\2\2\2\u008a\u008b\7\16"+
		"\2\2\u008b\u008c\7\61\2\2\u008c\u008d\7+\2\2\u008d\u008e\5\36\20\2\u008e"+
		"\u008f\7\20\2\2\u008f\u0090\5\36\20\2\u0090\u0091\7\21\2\2\u0091\u0092"+
		"\5\4\3\2\u0092\u0093\7\22\2\2\u0093\27\3\2\2\2\u0094\u0095\7\17\2\2\u0095"+
		"\u0096\5\36\20\2\u0096\u0097\7\21\2\2\u0097\u0098\5\4\3\2\u0098\u0099"+
		"\7\22\2\2\u0099\31\3\2\2\2\u009a\u009f\7\61\2\2\u009b\u009c\7,\2\2\u009c"+
		"\u009e\7\61\2\2\u009d\u009b\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3"+
		"\2\2\2\u009f\u00a0\3\2\2\2\u00a0\33\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2"+
		"\u00a7\5\36\20\2\u00a3\u00a4\7,\2\2\u00a4\u00a6\5\36\20\2\u00a5\u00a3"+
		"\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8"+
		"\35\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa\u00ab\b\20\1\2\u00ab\u00ac\7 \2"+
		"\2\u00ac\u00cf\5\36\20\26\u00ad\u00ae\7\34\2\2\u00ae\u00cf\5\36\20\25"+
		"\u00af\u00cf\7\60\2\2\u00b0\u00cf\7/\2\2\u00b1\u00cf\7\24\2\2\u00b2\u00b4"+
		"\5\n\6\2\u00b3\u00b5\5\"\22\2\u00b4\u00b3\3\2\2\2\u00b4\u00b5\3\2\2\2"+
		"\u00b5\u00cf\3\2\2\2\u00b6\u00b8\5 \21\2\u00b7\u00b9\5\"\22\2\u00b8\u00b7"+
		"\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00cf\3\2\2\2\u00ba\u00bc\7\61\2\2"+
		"\u00bb\u00bd\5\"\22\2\u00bc\u00bb\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00cf"+
		"\3\2\2\2\u00be\u00c0\7\62\2\2\u00bf\u00c1\5\"\22\2\u00c0\u00bf\3\2\2\2"+
		"\u00c0\u00c1\3\2\2\2\u00c1\u00cf\3\2\2\2\u00c2\u00c3\7(\2\2\u00c3\u00c4"+
		"\5\36\20\2\u00c4\u00c6\7)\2\2\u00c5\u00c7\5\"\22\2\u00c6\u00c5\3\2\2\2"+
		"\u00c6\u00c7\3\2\2\2\u00c7\u00cf\3\2\2\2\u00c8\u00c9\7\7\2\2\u00c9\u00cb"+
		"\7(\2\2\u00ca\u00cc\7\62\2\2\u00cb\u00ca\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc"+
		"\u00cd\3\2\2\2\u00cd\u00cf\7)\2\2\u00ce\u00aa\3\2\2\2\u00ce\u00ad\3\2"+
		"\2\2\u00ce\u00af\3\2\2\2\u00ce\u00b0\3\2\2\2\u00ce\u00b1\3\2\2\2\u00ce"+
		"\u00b2\3\2\2\2\u00ce\u00b6\3\2\2\2\u00ce\u00ba\3\2\2\2\u00ce\u00be\3\2"+
		"\2\2\u00ce\u00c2\3\2\2\2\u00ce\u00c8\3\2\2\2\u00cf\u00f0\3\2\2\2\u00d0"+
		"\u00d1\f\24\2\2\u00d1\u00d2\7\33\2\2\u00d2\u00ef\5\36\20\24\u00d3\u00d4"+
		"\f\23\2\2\u00d4\u00d5\t\2\2\2\u00d5\u00ef\5\36\20\24\u00d6\u00d7\f\22"+
		"\2\2\u00d7\u00d8\t\3\2\2\u00d8\u00ef\5\36\20\23\u00d9\u00da\f\21\2\2\u00da"+
		"\u00db\t\4\2\2\u00db\u00ef\5\36\20\22\u00dc\u00dd\f\20\2\2\u00dd\u00de"+
		"\t\5\2\2\u00de\u00ef\5\36\20\21\u00df\u00e0\f\17\2\2\u00e0\u00e1\7\26"+
		"\2\2\u00e1\u00ef\5\36\20\20\u00e2\u00e3\f\16\2\2\u00e3\u00e4\7\25\2\2"+
		"\u00e4\u00ef\5\36\20\17\u00e5\u00e6\f\r\2\2\u00e6\u00e7\7-\2\2\u00e7\u00e8"+
		"\5\36\20\2\u00e8\u00e9\7.\2\2\u00e9\u00ea\5\36\20\16\u00ea\u00ef\3\2\2"+
		"\2\u00eb\u00ec\f\f\2\2\u00ec\u00ed\7\23\2\2\u00ed\u00ef\5\36\20\r\u00ee"+
		"\u00d0\3\2\2\2\u00ee\u00d3\3\2\2\2\u00ee\u00d6\3\2\2\2\u00ee\u00d9\3\2"+
		"\2\2\u00ee\u00dc\3\2\2\2\u00ee\u00df\3\2\2\2\u00ee\u00e2\3\2\2\2\u00ee"+
		"\u00e5\3\2\2\2\u00ee\u00eb\3\2\2\2\u00ef\u00f2\3\2\2\2\u00f0\u00ee\3\2"+
		"\2\2\u00f0\u00f1\3\2\2\2\u00f1\37\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3\u00f5"+
		"\7&\2\2\u00f4\u00f6\5\34\17\2\u00f5\u00f4\3\2\2\2\u00f5\u00f6\3\2\2\2"+
		"\u00f6\u00f7\3\2\2\2\u00f7\u00f8\7\'\2\2\u00f8!\3\2\2\2\u00f9\u00fa\7"+
		"&\2\2\u00fa\u00fb\5\36\20\2\u00fb\u00fc\7\'\2\2\u00fc\u00fe\3\2\2\2\u00fd"+
		"\u00f9\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2"+
		"\2\2\u0100#\3\2\2\2\32+-\64?CKQcim\u0084\u009f\u00a7\u00b4\u00b8\u00bc"+
		"\u00c0\u00c6\u00cb\u00ce\u00ee\u00f0\u00f5\u00ff";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}