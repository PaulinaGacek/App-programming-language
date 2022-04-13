// Generated from /home/pgacek/App2.0/antlr4/App.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AppParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, WS=36, LOWERCASELETTER=37, UPPERCASELETTER=38, 
		NONZERODIGIT=39, ZERO=40;
	public static final int
		RULE_primaryExpression = 0, RULE_instruction = 1, RULE_simpleVariableType = 2, 
		RULE_complexVariableType = 3, RULE_variableName = 4, RULE_functionName = 5, 
		RULE_integer = 6, RULE_applyForce = 7, RULE_arithmeticalExpression = 8, 
		RULE_declaration = 9, RULE_definition = 10, RULE_conditionalStatement = 11, 
		RULE_condition = 12, RULE_parallelExpression = 13, RULE_loop = 14, RULE_function = 15, 
		RULE_functionBody = 16, RULE_functionArgs = 17, RULE_whiteSpace = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"primaryExpression", "instruction", "simpleVariableType", "complexVariableType", 
			"variableName", "functionName", "integer", "applyForce", "arithmeticalExpression", 
			"declaration", "definition", "conditionalStatement", "condition", "parallelExpression", 
			"loop", "function", "functionBody", "functionArgs", "whiteSpace"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'TIME'", "'INT'", "'FORCE'", "'OBJECT'", "'_'", "'APPLY'", "'TO'", 
			"'FOR'", "'DELAY'", "';'", "'+'", "'-'", "'/'", "'*'", "'DEFINE'", "'AS'", 
			"','", "'SET'", "'IF'", "'('", "')'", "'THEN'", "'ENDIF'", "'=='", "'>'", 
			"'<'", "'>='", "'<='", "'!='", "'PARALLEL'", "'ENDPARALLEL'", "'LOOP'", 
			"'ENDLOOP'", "'DEFINE FUNCTION'", "'ENDFUNCTION'", null, null, null, 
			null, "'0'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"WS", "LOWERCASELETTER", "UPPERCASELETTER", "NONZERODIGIT", "ZERO"
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
	public String getGrammarFileName() { return "App.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AppParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_primaryExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(38);
					whiteSpace();
					}
				}

				setState(41);
				instruction();
				setState(43);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(42);
					whiteSpace();
					}
					break;
				}
				}
				}
				setState(47); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__14) | (1L << T__17) | (1L << T__18) | (1L << T__29) | (1L << T__31) | (1L << T__33) | (1L << WS))) != 0) );
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

	public static class InstructionContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public DefinitionContext definition() {
			return getRuleContext(DefinitionContext.class,0);
		}
		public ConditionalStatementContext conditionalStatement() {
			return getRuleContext(ConditionalStatementContext.class,0);
		}
		public ParallelExpressionContext parallelExpression() {
			return getRuleContext(ParallelExpressionContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public ApplyForceContext applyForce() {
			return getRuleContext(ApplyForceContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instruction);
		try {
			setState(56);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(49);
				declaration();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				definition();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 3);
				{
				setState(51);
				conditionalStatement();
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 4);
				{
				setState(52);
				parallelExpression();
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 5);
				{
				setState(53);
				loop();
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 6);
				{
				setState(54);
				function();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 7);
				{
				setState(55);
				applyForce();
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

	public static class SimpleVariableTypeContext extends ParserRuleContext {
		public SimpleVariableTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleVariableType; }
	}

	public final SimpleVariableTypeContext simpleVariableType() throws RecognitionException {
		SimpleVariableTypeContext _localctx = new SimpleVariableTypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_simpleVariableType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==T__1) ) {
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

	public static class ComplexVariableTypeContext extends ParserRuleContext {
		public ComplexVariableTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexVariableType; }
	}

	public final ComplexVariableTypeContext complexVariableType() throws RecognitionException {
		ComplexVariableTypeContext _localctx = new ComplexVariableTypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_complexVariableType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			_la = _input.LA(1);
			if ( !(_la==T__2 || _la==T__3) ) {
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

	public static class VariableNameContext extends ParserRuleContext {
		public List<TerminalNode> LOWERCASELETTER() { return getTokens(AppParser.LOWERCASELETTER); }
		public TerminalNode LOWERCASELETTER(int i) {
			return getToken(AppParser.LOWERCASELETTER, i);
		}
		public List<TerminalNode> UPPERCASELETTER() { return getTokens(AppParser.UPPERCASELETTER); }
		public TerminalNode UPPERCASELETTER(int i) {
			return getToken(AppParser.UPPERCASELETTER, i);
		}
		public List<TerminalNode> NONZERODIGIT() { return getTokens(AppParser.NONZERODIGIT); }
		public TerminalNode NONZERODIGIT(int i) {
			return getToken(AppParser.NONZERODIGIT, i);
		}
		public List<TerminalNode> ZERO() { return getTokens(AppParser.ZERO); }
		public TerminalNode ZERO(int i) {
			return getToken(AppParser.ZERO, i);
		}
		public VariableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableName; }
	}

	public final VariableNameContext variableName() throws RecognitionException {
		VariableNameContext _localctx = new VariableNameContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variableName);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(LOWERCASELETTER);
			setState(66);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(63);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << LOWERCASELETTER) | (1L << UPPERCASELETTER) | (1L << NONZERODIGIT) | (1L << ZERO))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(68);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class FunctionNameContext extends ParserRuleContext {
		public List<TerminalNode> LOWERCASELETTER() { return getTokens(AppParser.LOWERCASELETTER); }
		public TerminalNode LOWERCASELETTER(int i) {
			return getToken(AppParser.LOWERCASELETTER, i);
		}
		public List<TerminalNode> UPPERCASELETTER() { return getTokens(AppParser.UPPERCASELETTER); }
		public TerminalNode UPPERCASELETTER(int i) {
			return getToken(AppParser.UPPERCASELETTER, i);
		}
		public List<TerminalNode> NONZERODIGIT() { return getTokens(AppParser.NONZERODIGIT); }
		public TerminalNode NONZERODIGIT(int i) {
			return getToken(AppParser.NONZERODIGIT, i);
		}
		public List<TerminalNode> ZERO() { return getTokens(AppParser.ZERO); }
		public TerminalNode ZERO(int i) {
			return getToken(AppParser.ZERO, i);
		}
		public FunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionName; }
	}

	public final FunctionNameContext functionName() throws RecognitionException {
		FunctionNameContext _localctx = new FunctionNameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_functionName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(LOWERCASELETTER);
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << LOWERCASELETTER) | (1L << UPPERCASELETTER) | (1L << NONZERODIGIT) | (1L << ZERO))) != 0)) {
				{
				{
				setState(70);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << LOWERCASELETTER) | (1L << UPPERCASELETTER) | (1L << NONZERODIGIT) | (1L << ZERO))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(75);
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

	public static class IntegerContext extends ParserRuleContext {
		public List<TerminalNode> NONZERODIGIT() { return getTokens(AppParser.NONZERODIGIT); }
		public TerminalNode NONZERODIGIT(int i) {
			return getToken(AppParser.NONZERODIGIT, i);
		}
		public List<TerminalNode> ZERO() { return getTokens(AppParser.ZERO); }
		public TerminalNode ZERO(int i) {
			return getToken(AppParser.ZERO, i);
		}
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_integer);
		int _la;
		try {
			int _alt;
			setState(84);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NONZERODIGIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				match(NONZERODIGIT);
				setState(80);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(77);
						_la = _input.LA(1);
						if ( !(_la==NONZERODIGIT || _la==ZERO) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						} 
					}
					setState(82);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				}
				}
				break;
			case ZERO:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				match(ZERO);
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

	public static class ApplyForceContext extends ParserRuleContext {
		public VariableNameContext force_;
		public VariableNameContext object_;
		public VariableNameContext time_;
		public VariableNameContext delay_;
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public List<VariableNameContext> variableName() {
			return getRuleContexts(VariableNameContext.class);
		}
		public VariableNameContext variableName(int i) {
			return getRuleContext(VariableNameContext.class,i);
		}
		public ApplyForceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_applyForce; }
	}

	public final ApplyForceContext applyForce() throws RecognitionException {
		ApplyForceContext _localctx = new ApplyForceContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_applyForce);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(T__5);
			setState(87);
			whiteSpace();
			setState(88);
			((ApplyForceContext)_localctx).force_ = variableName();
			setState(89);
			whiteSpace();
			setState(90);
			match(T__6);
			setState(91);
			whiteSpace();
			setState(92);
			((ApplyForceContext)_localctx).object_ = variableName();
			setState(93);
			whiteSpace();
			setState(94);
			match(T__7);
			setState(95);
			whiteSpace();
			setState(96);
			((ApplyForceContext)_localctx).time_ = variableName();
			setState(102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(97);
				whiteSpace();
				setState(98);
				match(T__8);
				setState(99);
				whiteSpace();
				setState(100);
				((ApplyForceContext)_localctx).delay_ = variableName();
				}
				break;
			}
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(104);
				whiteSpace();
				}
			}

			setState(107);
			match(T__9);
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

	public static class ArithmeticalExpressionContext extends ParserRuleContext {
		public ArithmeticalExpressionContext left;
		public Token op;
		public ArithmeticalExpressionContext right;
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public List<ArithmeticalExpressionContext> arithmeticalExpression() {
			return getRuleContexts(ArithmeticalExpressionContext.class);
		}
		public ArithmeticalExpressionContext arithmeticalExpression(int i) {
			return getRuleContext(ArithmeticalExpressionContext.class,i);
		}
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public ArithmeticalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticalExpression; }
	}

	public final ArithmeticalExpressionContext arithmeticalExpression() throws RecognitionException {
		return arithmeticalExpression(0);
	}

	private ArithmeticalExpressionContext arithmeticalExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArithmeticalExpressionContext _localctx = new ArithmeticalExpressionContext(_ctx, _parentState);
		ArithmeticalExpressionContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_arithmeticalExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NONZERODIGIT:
			case ZERO:
				{
				setState(110);
				integer();
				}
				break;
			case LOWERCASELETTER:
				{
				setState(111);
				variableName();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(125);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArithmeticalExpressionContext(_parentctx, _parentState);
					_localctx.left = _prevctx;
					_localctx.left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_arithmeticalExpression);
					setState(114);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(116);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(115);
						whiteSpace();
						}
					}

					setState(118);
					((ArithmeticalExpressionContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13))) != 0)) ) {
						((ArithmeticalExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(120);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(119);
						whiteSpace();
						}
					}

					setState(122);
					((ArithmeticalExpressionContext)_localctx).right = arithmeticalExpression(4);
					}
					} 
				}
				setState(127);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public static class DeclarationContext extends ParserRuleContext {
		public SimpleVariableTypeContext type_sim;
		public VariableNameContext name_;
		public ArithmeticalExpressionContext value_;
		public ComplexVariableTypeContext type_com;
		public ArithmeticalExpressionContext value1_;
		public ArithmeticalExpressionContext value2_;
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public SimpleVariableTypeContext simpleVariableType() {
			return getRuleContext(SimpleVariableTypeContext.class,0);
		}
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public List<ArithmeticalExpressionContext> arithmeticalExpression() {
			return getRuleContexts(ArithmeticalExpressionContext.class);
		}
		public ArithmeticalExpressionContext arithmeticalExpression(int i) {
			return getRuleContext(ArithmeticalExpressionContext.class,i);
		}
		public ComplexVariableTypeContext complexVariableType() {
			return getRuleContext(ComplexVariableTypeContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_declaration);
		int _la;
		try {
			setState(164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				match(T__14);
				setState(129);
				whiteSpace();
				setState(130);
				((DeclarationContext)_localctx).type_sim = simpleVariableType();
				setState(131);
				whiteSpace();
				setState(132);
				((DeclarationContext)_localctx).name_ = variableName();
				setState(133);
				whiteSpace();
				setState(134);
				match(T__15);
				setState(135);
				whiteSpace();
				setState(136);
				((DeclarationContext)_localctx).value_ = arithmeticalExpression(0);
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(137);
					whiteSpace();
					}
				}

				setState(140);
				match(T__9);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				match(T__14);
				setState(143);
				whiteSpace();
				setState(144);
				((DeclarationContext)_localctx).type_com = complexVariableType();
				setState(145);
				whiteSpace();
				setState(146);
				((DeclarationContext)_localctx).name_ = variableName();
				setState(147);
				whiteSpace();
				setState(148);
				match(T__15);
				setState(149);
				whiteSpace();
				setState(150);
				((DeclarationContext)_localctx).value1_ = arithmeticalExpression(0);
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(151);
					whiteSpace();
					}
				}

				setState(154);
				match(T__16);
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(155);
					whiteSpace();
					}
				}

				setState(158);
				((DeclarationContext)_localctx).value2_ = arithmeticalExpression(0);
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(159);
					whiteSpace();
					}
				}

				setState(162);
				match(T__9);
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

	public static class DefinitionContext extends ParserRuleContext {
		public VariableNameContext name_;
		public ArithmeticalExpressionContext value_;
		public ArithmeticalExpressionContext value1_;
		public ArithmeticalExpressionContext value2_;
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public List<ArithmeticalExpressionContext> arithmeticalExpression() {
			return getRuleContexts(ArithmeticalExpressionContext.class);
		}
		public ArithmeticalExpressionContext arithmeticalExpression(int i) {
			return getRuleContext(ArithmeticalExpressionContext.class,i);
		}
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_definition);
		int _la;
		try {
			setState(192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				match(T__17);
				setState(167);
				whiteSpace();
				setState(168);
				((DefinitionContext)_localctx).name_ = variableName();
				setState(169);
				whiteSpace();
				setState(170);
				match(T__15);
				setState(171);
				whiteSpace();
				setState(172);
				((DefinitionContext)_localctx).value_ = arithmeticalExpression(0);
				setState(173);
				match(T__9);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				match(T__17);
				setState(176);
				whiteSpace();
				setState(177);
				((DefinitionContext)_localctx).name_ = variableName();
				setState(178);
				whiteSpace();
				setState(179);
				match(T__15);
				setState(180);
				whiteSpace();
				setState(181);
				((DefinitionContext)_localctx).value1_ = arithmeticalExpression(0);
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(182);
					whiteSpace();
					}
				}

				setState(185);
				match(T__16);
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(186);
					whiteSpace();
					}
				}

				setState(189);
				((DefinitionContext)_localctx).value2_ = arithmeticalExpression(0);
				setState(190);
				match(T__9);
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

	public static class ConditionalStatementContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public ConditionalStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalStatement; }
	}

	public final ConditionalStatementContext conditionalStatement() throws RecognitionException {
		ConditionalStatementContext _localctx = new ConditionalStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_conditionalStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(T__18);
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(195);
				whiteSpace();
				}
			}

			setState(198);
			match(T__19);
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(199);
				whiteSpace();
				}
			}

			setState(202);
			condition();
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(203);
				whiteSpace();
				}
			}

			setState(206);
			match(T__20);
			setState(207);
			whiteSpace();
			setState(208);
			match(T__21);
			setState(209);
			whiteSpace();
			setState(211); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(210);
				instruction();
				}
				}
				setState(213); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__14) | (1L << T__17) | (1L << T__18) | (1L << T__29) | (1L << T__31) | (1L << T__33))) != 0) );
			setState(215);
			whiteSpace();
			setState(216);
			match(T__22);
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(217);
				whiteSpace();
				}
			}

			setState(220);
			match(T__9);
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

	public static class ConditionContext extends ParserRuleContext {
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public ArithmeticalExpressionContext arithmeticalExpression() {
			return getRuleContext(ArithmeticalExpressionContext.class,0);
		}
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_condition);
		int _la;
		try {
			setState(282);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				variableName();
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(223);
					whiteSpace();
					}
				}

				setState(226);
				match(T__23);
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(227);
					whiteSpace();
					}
				}

				setState(230);
				arithmeticalExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(232);
				variableName();
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(233);
					whiteSpace();
					}
				}

				setState(236);
				match(T__24);
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(237);
					whiteSpace();
					}
				}

				setState(240);
				arithmeticalExpression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(242);
				variableName();
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(243);
					whiteSpace();
					}
				}

				setState(246);
				match(T__25);
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(247);
					whiteSpace();
					}
				}

				setState(250);
				arithmeticalExpression(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(252);
				variableName();
				setState(254);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(253);
					whiteSpace();
					}
				}

				setState(256);
				match(T__26);
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(257);
					whiteSpace();
					}
				}

				setState(260);
				arithmeticalExpression(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(262);
				variableName();
				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(263);
					whiteSpace();
					}
				}

				setState(266);
				match(T__27);
				setState(268);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(267);
					whiteSpace();
					}
				}

				setState(270);
				arithmeticalExpression(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(272);
				variableName();
				setState(274);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(273);
					whiteSpace();
					}
				}

				setState(276);
				match(T__28);
				setState(278);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(277);
					whiteSpace();
					}
				}

				setState(280);
				arithmeticalExpression(0);
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

	public static class ParallelExpressionContext extends ParserRuleContext {
		public ApplyForceContext app_force_;
		public ParallelExpressionContext parallel_;
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public List<ApplyForceContext> applyForce() {
			return getRuleContexts(ApplyForceContext.class);
		}
		public ApplyForceContext applyForce(int i) {
			return getRuleContext(ApplyForceContext.class,i);
		}
		public List<ParallelExpressionContext> parallelExpression() {
			return getRuleContexts(ParallelExpressionContext.class);
		}
		public ParallelExpressionContext parallelExpression(int i) {
			return getRuleContext(ParallelExpressionContext.class,i);
		}
		public ParallelExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parallelExpression; }
	}

	public final ParallelExpressionContext parallelExpression() throws RecognitionException {
		ParallelExpressionContext _localctx = new ParallelExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_parallelExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(T__29);
			setState(285);
			whiteSpace();
			setState(288); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(288);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__5:
					{
					setState(286);
					((ParallelExpressionContext)_localctx).app_force_ = applyForce();
					}
					break;
				case T__29:
					{
					setState(287);
					((ParallelExpressionContext)_localctx).parallel_ = parallelExpression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(290); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__5 || _la==T__29 );
			setState(292);
			whiteSpace();
			setState(293);
			match(T__30);
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(294);
				whiteSpace();
				}
			}

			setState(297);
			match(T__9);
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

	public static class LoopContext extends ParserRuleContext {
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public DefinitionContext definition() {
			return getRuleContext(DefinitionContext.class,0);
		}
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_loop);
		int _la;
		try {
			setState(371);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(299);
				match(T__31);
				setState(300);
				whiteSpace();
				setState(301);
				match(T__19);
				setState(303);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(302);
					whiteSpace();
					}
				}

				setState(305);
				declaration();
				setState(307);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(306);
					whiteSpace();
					}
				}

				setState(309);
				condition();
				setState(311);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(310);
					whiteSpace();
					}
				}

				setState(313);
				match(T__9);
				setState(315);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(314);
					whiteSpace();
					}
				}

				setState(317);
				definition();
				setState(319);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(318);
					whiteSpace();
					}
				}

				setState(321);
				match(T__20);
				setState(322);
				whiteSpace();
				setState(324); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(323);
					instruction();
					}
					}
					setState(326); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__14) | (1L << T__17) | (1L << T__18) | (1L << T__29) | (1L << T__31) | (1L << T__33))) != 0) );
				setState(328);
				whiteSpace();
				setState(329);
				match(T__32);
				setState(331);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(330);
					whiteSpace();
					}
				}

				setState(333);
				match(T__9);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(335);
				match(T__31);
				setState(336);
				whiteSpace();
				setState(337);
				match(T__19);
				setState(339);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(338);
					whiteSpace();
					}
				}

				setState(341);
				match(T__9);
				setState(343);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(342);
					whiteSpace();
					}
				}

				setState(345);
				condition();
				setState(347);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(346);
					whiteSpace();
					}
				}

				setState(349);
				match(T__9);
				setState(351);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(350);
					whiteSpace();
					}
				}

				setState(353);
				definition();
				setState(355);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(354);
					whiteSpace();
					}
				}

				setState(357);
				match(T__20);
				setState(358);
				whiteSpace();
				setState(360); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(359);
					instruction();
					}
					}
					setState(362); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__14) | (1L << T__17) | (1L << T__18) | (1L << T__29) | (1L << T__31) | (1L << T__33))) != 0) );
				setState(364);
				whiteSpace();
				setState(365);
				match(T__32);
				setState(367);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(366);
					whiteSpace();
					}
				}

				setState(369);
				match(T__9);
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

	public static class FunctionContext extends ParserRuleContext {
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public FunctionArgsContext functionArgs() {
			return getRuleContext(FunctionArgsContext.class,0);
		}
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_function);
		int _la;
		try {
			setState(410);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(373);
				match(T__33);
				setState(374);
				whiteSpace();
				setState(375);
				functionName();
				setState(376);
				match(T__19);
				setState(378);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(377);
					whiteSpace();
					}
				}

				setState(380);
				functionArgs();
				setState(382);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(381);
					whiteSpace();
					}
				}

				setState(384);
				match(T__20);
				setState(385);
				whiteSpace();
				setState(386);
				match(T__15);
				setState(387);
				whiteSpace();
				setState(388);
				functionBody();
				setState(389);
				whiteSpace();
				setState(390);
				match(T__34);
				setState(392);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(391);
					whiteSpace();
					}
				}

				setState(394);
				match(T__9);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(396);
				match(T__33);
				setState(397);
				whiteSpace();
				setState(398);
				functionName();
				setState(399);
				whiteSpace();
				setState(400);
				match(T__15);
				setState(401);
				whiteSpace();
				setState(402);
				functionBody();
				setState(403);
				whiteSpace();
				setState(404);
				match(T__34);
				setState(406);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(405);
					whiteSpace();
					}
				}

				setState(408);
				match(T__9);
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

	public static class FunctionBodyContext extends ParserRuleContext {
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public ParallelExpressionContext parallelExpression() {
			return getRuleContext(ParallelExpressionContext.class,0);
		}
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_functionBody);
		int _la;
		try {
			setState(436);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(413); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(412);
					instruction();
					}
					}
					setState(415); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__14) | (1L << T__17) | (1L << T__18) | (1L << T__29) | (1L << T__31) | (1L << T__33))) != 0) );
				setState(418);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
				case 1:
					{
					setState(417);
					whiteSpace();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(421); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(420);
					instruction();
					}
					}
					setState(423); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__14) | (1L << T__17) | (1L << T__18) | (1L << T__29) | (1L << T__31) | (1L << T__33))) != 0) );
				setState(425);
				whiteSpace();
				setState(426);
				parallelExpression();
				setState(427);
				whiteSpace();
				setState(429); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(428);
					instruction();
					}
					}
					setState(431); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__14) | (1L << T__17) | (1L << T__18) | (1L << T__29) | (1L << T__31) | (1L << T__33))) != 0) );
				setState(434);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
				case 1:
					{
					setState(433);
					whiteSpace();
					}
					break;
				}
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

	public static class FunctionArgsContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public FunctionArgsContext functionArgs() {
			return getRuleContext(FunctionArgsContext.class,0);
		}
		public FunctionArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionArgs; }
	}

	public final FunctionArgsContext functionArgs() throws RecognitionException {
		FunctionArgsContext _localctx = new FunctionArgsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_functionArgs);
		int _la;
		try {
			setState(452);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(438);
				declaration();
				setState(440);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
				case 1:
					{
					setState(439);
					whiteSpace();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(442);
				declaration();
				setState(444);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(443);
					whiteSpace();
					}
				}

				setState(446);
				match(T__16);
				setState(448);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(447);
					whiteSpace();
					}
				}

				setState(450);
				functionArgs();
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

	public static class WhiteSpaceContext extends ParserRuleContext {
		public List<TerminalNode> WS() { return getTokens(AppParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(AppParser.WS, i);
		}
		public WhiteSpaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whiteSpace; }
	}

	public final WhiteSpaceContext whiteSpace() throws RecognitionException {
		WhiteSpaceContext _localctx = new WhiteSpaceContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_whiteSpace);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(455); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(454);
					match(WS);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(457); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
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
		case 8:
			return arithmeticalExpression_sempred((ArithmeticalExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean arithmeticalExpression_sempred(ArithmeticalExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3*\u01ce\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\5\2*\n\2\3\2\3\2\5\2.\n\2\6\2\60\n\2\r\2\16\2"+
		"\61\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3;\n\3\3\4\3\4\3\5\3\5\3\6\3\6\7\6C"+
		"\n\6\f\6\16\6F\13\6\3\7\3\7\7\7J\n\7\f\7\16\7M\13\7\3\b\3\b\7\bQ\n\b\f"+
		"\b\16\bT\13\b\3\b\5\bW\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\5\ti\n\t\3\t\5\tl\n\t\3\t\3\t\3\n\3\n\3\n\5\ns\n"+
		"\n\3\n\3\n\5\nw\n\n\3\n\3\n\5\n{\n\n\3\n\7\n~\n\n\f\n\16\n\u0081\13\n"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u008d\n\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u009b\n\13"+
		"\3\13\3\13\5\13\u009f\n\13\3\13\3\13\5\13\u00a3\n\13\3\13\3\13\5\13\u00a7"+
		"\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\5\f\u00ba\n\f\3\f\3\f\5\f\u00be\n\f\3\f\3\f\3\f\5\f\u00c3\n\f\3\r"+
		"\3\r\5\r\u00c7\n\r\3\r\3\r\5\r\u00cb\n\r\3\r\3\r\5\r\u00cf\n\r\3\r\3\r"+
		"\3\r\3\r\3\r\6\r\u00d6\n\r\r\r\16\r\u00d7\3\r\3\r\3\r\5\r\u00dd\n\r\3"+
		"\r\3\r\3\16\3\16\5\16\u00e3\n\16\3\16\3\16\5\16\u00e7\n\16\3\16\3\16\3"+
		"\16\3\16\5\16\u00ed\n\16\3\16\3\16\5\16\u00f1\n\16\3\16\3\16\3\16\3\16"+
		"\5\16\u00f7\n\16\3\16\3\16\5\16\u00fb\n\16\3\16\3\16\3\16\3\16\5\16\u0101"+
		"\n\16\3\16\3\16\5\16\u0105\n\16\3\16\3\16\3\16\3\16\5\16\u010b\n\16\3"+
		"\16\3\16\5\16\u010f\n\16\3\16\3\16\3\16\3\16\5\16\u0115\n\16\3\16\3\16"+
		"\5\16\u0119\n\16\3\16\3\16\5\16\u011d\n\16\3\17\3\17\3\17\3\17\6\17\u0123"+
		"\n\17\r\17\16\17\u0124\3\17\3\17\3\17\5\17\u012a\n\17\3\17\3\17\3\20\3"+
		"\20\3\20\3\20\5\20\u0132\n\20\3\20\3\20\5\20\u0136\n\20\3\20\3\20\5\20"+
		"\u013a\n\20\3\20\3\20\5\20\u013e\n\20\3\20\3\20\5\20\u0142\n\20\3\20\3"+
		"\20\3\20\6\20\u0147\n\20\r\20\16\20\u0148\3\20\3\20\3\20\5\20\u014e\n"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0156\n\20\3\20\3\20\5\20\u015a"+
		"\n\20\3\20\3\20\5\20\u015e\n\20\3\20\3\20\5\20\u0162\n\20\3\20\3\20\5"+
		"\20\u0166\n\20\3\20\3\20\3\20\6\20\u016b\n\20\r\20\16\20\u016c\3\20\3"+
		"\20\3\20\5\20\u0172\n\20\3\20\3\20\5\20\u0176\n\20\3\21\3\21\3\21\3\21"+
		"\3\21\5\21\u017d\n\21\3\21\3\21\5\21\u0181\n\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\5\21\u018b\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\5\21\u0199\n\21\3\21\3\21\5\21\u019d\n\21\3"+
		"\22\6\22\u01a0\n\22\r\22\16\22\u01a1\3\22\5\22\u01a5\n\22\3\22\6\22\u01a8"+
		"\n\22\r\22\16\22\u01a9\3\22\3\22\3\22\3\22\6\22\u01b0\n\22\r\22\16\22"+
		"\u01b1\3\22\5\22\u01b5\n\22\5\22\u01b7\n\22\3\23\3\23\5\23\u01bb\n\23"+
		"\3\23\3\23\5\23\u01bf\n\23\3\23\3\23\5\23\u01c3\n\23\3\23\3\23\5\23\u01c7"+
		"\n\23\3\24\6\24\u01ca\n\24\r\24\16\24\u01cb\3\24\2\3\22\25\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&\2\7\3\2\3\4\3\2\5\6\4\2\7\7\'*\3\2)*"+
		"\3\2\r\20\2\u020d\2/\3\2\2\2\4:\3\2\2\2\6<\3\2\2\2\b>\3\2\2\2\n@\3\2\2"+
		"\2\fG\3\2\2\2\16V\3\2\2\2\20X\3\2\2\2\22r\3\2\2\2\24\u00a6\3\2\2\2\26"+
		"\u00c2\3\2\2\2\30\u00c4\3\2\2\2\32\u011c\3\2\2\2\34\u011e\3\2\2\2\36\u0175"+
		"\3\2\2\2 \u019c\3\2\2\2\"\u01b6\3\2\2\2$\u01c6\3\2\2\2&\u01c9\3\2\2\2"+
		"(*\5&\24\2)(\3\2\2\2)*\3\2\2\2*+\3\2\2\2+-\5\4\3\2,.\5&\24\2-,\3\2\2\2"+
		"-.\3\2\2\2.\60\3\2\2\2/)\3\2\2\2\60\61\3\2\2\2\61/\3\2\2\2\61\62\3\2\2"+
		"\2\62\3\3\2\2\2\63;\5\24\13\2\64;\5\26\f\2\65;\5\30\r\2\66;\5\34\17\2"+
		"\67;\5\36\20\28;\5 \21\29;\5\20\t\2:\63\3\2\2\2:\64\3\2\2\2:\65\3\2\2"+
		"\2:\66\3\2\2\2:\67\3\2\2\2:8\3\2\2\2:9\3\2\2\2;\5\3\2\2\2<=\t\2\2\2=\7"+
		"\3\2\2\2>?\t\3\2\2?\t\3\2\2\2@D\7\'\2\2AC\t\4\2\2BA\3\2\2\2CF\3\2\2\2"+
		"DB\3\2\2\2DE\3\2\2\2E\13\3\2\2\2FD\3\2\2\2GK\7\'\2\2HJ\t\4\2\2IH\3\2\2"+
		"\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2L\r\3\2\2\2MK\3\2\2\2NR\7)\2\2OQ\t\5\2"+
		"\2PO\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2SW\3\2\2\2TR\3\2\2\2UW\7*\2"+
		"\2VN\3\2\2\2VU\3\2\2\2W\17\3\2\2\2XY\7\b\2\2YZ\5&\24\2Z[\5\n\6\2[\\\5"+
		"&\24\2\\]\7\t\2\2]^\5&\24\2^_\5\n\6\2_`\5&\24\2`a\7\n\2\2ab\5&\24\2bh"+
		"\5\n\6\2cd\5&\24\2de\7\13\2\2ef\5&\24\2fg\5\n\6\2gi\3\2\2\2hc\3\2\2\2"+
		"hi\3\2\2\2ik\3\2\2\2jl\5&\24\2kj\3\2\2\2kl\3\2\2\2lm\3\2\2\2mn\7\f\2\2"+
		"n\21\3\2\2\2op\b\n\1\2ps\5\16\b\2qs\5\n\6\2ro\3\2\2\2rq\3\2\2\2s\177\3"+
		"\2\2\2tv\f\5\2\2uw\5&\24\2vu\3\2\2\2vw\3\2\2\2wx\3\2\2\2xz\t\6\2\2y{\5"+
		"&\24\2zy\3\2\2\2z{\3\2\2\2{|\3\2\2\2|~\5\22\n\6}t\3\2\2\2~\u0081\3\2\2"+
		"\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\23\3\2\2\2\u0081\177\3\2\2\2\u0082"+
		"\u0083\7\21\2\2\u0083\u0084\5&\24\2\u0084\u0085\5\6\4\2\u0085\u0086\5"+
		"&\24\2\u0086\u0087\5\n\6\2\u0087\u0088\5&\24\2\u0088\u0089\7\22\2\2\u0089"+
		"\u008a\5&\24\2\u008a\u008c\5\22\n\2\u008b\u008d\5&\24\2\u008c\u008b\3"+
		"\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\7\f\2\2\u008f"+
		"\u00a7\3\2\2\2\u0090\u0091\7\21\2\2\u0091\u0092\5&\24\2\u0092\u0093\5"+
		"\b\5\2\u0093\u0094\5&\24\2\u0094\u0095\5\n\6\2\u0095\u0096\5&\24\2\u0096"+
		"\u0097\7\22\2\2\u0097\u0098\5&\24\2\u0098\u009a\5\22\n\2\u0099\u009b\5"+
		"&\24\2\u009a\u0099\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c\3\2\2\2\u009c"+
		"\u009e\7\23\2\2\u009d\u009f\5&\24\2\u009e\u009d\3\2\2\2\u009e\u009f\3"+
		"\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a2\5\22\n\2\u00a1\u00a3\5&\24\2\u00a2"+
		"\u00a1\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\7\f"+
		"\2\2\u00a5\u00a7\3\2\2\2\u00a6\u0082\3\2\2\2\u00a6\u0090\3\2\2\2\u00a7"+
		"\25\3\2\2\2\u00a8\u00a9\7\24\2\2\u00a9\u00aa\5&\24\2\u00aa\u00ab\5\n\6"+
		"\2\u00ab\u00ac\5&\24\2\u00ac\u00ad\7\22\2\2\u00ad\u00ae\5&\24\2\u00ae"+
		"\u00af\5\22\n\2\u00af\u00b0\7\f\2\2\u00b0\u00c3\3\2\2\2\u00b1\u00b2\7"+
		"\24\2\2\u00b2\u00b3\5&\24\2\u00b3\u00b4\5\n\6\2\u00b4\u00b5\5&\24\2\u00b5"+
		"\u00b6\7\22\2\2\u00b6\u00b7\5&\24\2\u00b7\u00b9\5\22\n\2\u00b8\u00ba\5"+
		"&\24\2\u00b9\u00b8\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb"+
		"\u00bd\7\23\2\2\u00bc\u00be\5&\24\2\u00bd\u00bc\3\2\2\2\u00bd\u00be\3"+
		"\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\5\22\n\2\u00c0\u00c1\7\f\2\2\u00c1"+
		"\u00c3\3\2\2\2\u00c2\u00a8\3\2\2\2\u00c2\u00b1\3\2\2\2\u00c3\27\3\2\2"+
		"\2\u00c4\u00c6\7\25\2\2\u00c5\u00c7\5&\24\2\u00c6\u00c5\3\2\2\2\u00c6"+
		"\u00c7\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00ca\7\26\2\2\u00c9\u00cb\5"+
		"&\24\2\u00ca\u00c9\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc"+
		"\u00ce\5\32\16\2\u00cd\u00cf\5&\24\2\u00ce\u00cd\3\2\2\2\u00ce\u00cf\3"+
		"\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\7\27\2\2\u00d1\u00d2\5&\24\2\u00d2"+
		"\u00d3\7\30\2\2\u00d3\u00d5\5&\24\2\u00d4\u00d6\5\4\3\2\u00d5\u00d4\3"+
		"\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8"+
		"\u00d9\3\2\2\2\u00d9\u00da\5&\24\2\u00da\u00dc\7\31\2\2\u00db\u00dd\5"+
		"&\24\2\u00dc\u00db\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de\3\2\2\2\u00de"+
		"\u00df\7\f\2\2\u00df\31\3\2\2\2\u00e0\u00e2\5\n\6\2\u00e1\u00e3\5&\24"+
		"\2\u00e2\u00e1\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e6"+
		"\7\32\2\2\u00e5\u00e7\5&\24\2\u00e6\u00e5\3\2\2\2\u00e6\u00e7\3\2\2\2"+
		"\u00e7\u00e8\3\2\2\2\u00e8\u00e9\5\22\n\2\u00e9\u011d\3\2\2\2\u00ea\u00ec"+
		"\5\n\6\2\u00eb\u00ed\5&\24\2\u00ec\u00eb\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed"+
		"\u00ee\3\2\2\2\u00ee\u00f0\7\33\2\2\u00ef\u00f1\5&\24\2\u00f0\u00ef\3"+
		"\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\5\22\n\2\u00f3"+
		"\u011d\3\2\2\2\u00f4\u00f6\5\n\6\2\u00f5\u00f7\5&\24\2\u00f6\u00f5\3\2"+
		"\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00fa\7\34\2\2\u00f9"+
		"\u00fb\5&\24\2\u00fa\u00f9\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\3\2"+
		"\2\2\u00fc\u00fd\5\22\n\2\u00fd\u011d\3\2\2\2\u00fe\u0100\5\n\6\2\u00ff"+
		"\u0101\5&\24\2\u0100\u00ff\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0102\3\2"+
		"\2\2\u0102\u0104\7\35\2\2\u0103\u0105\5&\24\2\u0104\u0103\3\2\2\2\u0104"+
		"\u0105\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0107\5\22\n\2\u0107\u011d\3"+
		"\2\2\2\u0108\u010a\5\n\6\2\u0109\u010b\5&\24\2\u010a\u0109\3\2\2\2\u010a"+
		"\u010b\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010e\7\36\2\2\u010d\u010f\5"+
		"&\24\2\u010e\u010d\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0110\3\2\2\2\u0110"+
		"\u0111\5\22\n\2\u0111\u011d\3\2\2\2\u0112\u0114\5\n\6\2\u0113\u0115\5"+
		"&\24\2\u0114\u0113\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0116\3\2\2\2\u0116"+
		"\u0118\7\37\2\2\u0117\u0119\5&\24\2\u0118\u0117\3\2\2\2\u0118\u0119\3"+
		"\2\2\2\u0119\u011a\3\2\2\2\u011a\u011b\5\22\n\2\u011b\u011d\3\2\2\2\u011c"+
		"\u00e0\3\2\2\2\u011c\u00ea\3\2\2\2\u011c\u00f4\3\2\2\2\u011c\u00fe\3\2"+
		"\2\2\u011c\u0108\3\2\2\2\u011c\u0112\3\2\2\2\u011d\33\3\2\2\2\u011e\u011f"+
		"\7 \2\2\u011f\u0122\5&\24\2\u0120\u0123\5\20\t\2\u0121\u0123\5\34\17\2"+
		"\u0122\u0120\3\2\2\2\u0122\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0122"+
		"\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0127\5&\24\2\u0127"+
		"\u0129\7!\2\2\u0128\u012a\5&\24\2\u0129\u0128\3\2\2\2\u0129\u012a\3\2"+
		"\2\2\u012a\u012b\3\2\2\2\u012b\u012c\7\f\2\2\u012c\35\3\2\2\2\u012d\u012e"+
		"\7\"\2\2\u012e\u012f\5&\24\2\u012f\u0131\7\26\2\2\u0130\u0132\5&\24\2"+
		"\u0131\u0130\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0135"+
		"\5\24\13\2\u0134\u0136\5&\24\2\u0135\u0134\3\2\2\2\u0135\u0136\3\2\2\2"+
		"\u0136\u0137\3\2\2\2\u0137\u0139\5\32\16\2\u0138\u013a\5&\24\2\u0139\u0138"+
		"\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013d\7\f\2\2\u013c"+
		"\u013e\5&\24\2\u013d\u013c\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u013f\3\2"+
		"\2\2\u013f\u0141\5\26\f\2\u0140\u0142\5&\24\2\u0141\u0140\3\2\2\2\u0141"+
		"\u0142\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0144\7\27\2\2\u0144\u0146\5"+
		"&\24\2\u0145\u0147\5\4\3\2\u0146\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148"+
		"\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014b\5&"+
		"\24\2\u014b\u014d\7#\2\2\u014c\u014e\5&\24\2\u014d\u014c\3\2\2\2\u014d"+
		"\u014e\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0150\7\f\2\2\u0150\u0176\3\2"+
		"\2\2\u0151\u0152\7\"\2\2\u0152\u0153\5&\24\2\u0153\u0155\7\26\2\2\u0154"+
		"\u0156\5&\24\2\u0155\u0154\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0157\3\2"+
		"\2\2\u0157\u0159\7\f\2\2\u0158\u015a\5&\24\2\u0159\u0158\3\2\2\2\u0159"+
		"\u015a\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u015d\5\32\16\2\u015c\u015e\5"+
		"&\24\2\u015d\u015c\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u015f\3\2\2\2\u015f"+
		"\u0161\7\f\2\2\u0160\u0162\5&\24\2\u0161\u0160\3\2\2\2\u0161\u0162\3\2"+
		"\2\2\u0162\u0163\3\2\2\2\u0163\u0165\5\26\f\2\u0164\u0166\5&\24\2\u0165"+
		"\u0164\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0168\7\27"+
		"\2\2\u0168\u016a\5&\24\2\u0169\u016b\5\4\3\2\u016a\u0169\3\2\2\2\u016b"+
		"\u016c\3\2\2\2\u016c\u016a\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u016e\3\2"+
		"\2\2\u016e\u016f\5&\24\2\u016f\u0171\7#\2\2\u0170\u0172\5&\24\2\u0171"+
		"\u0170\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0174\7\f"+
		"\2\2\u0174\u0176\3\2\2\2\u0175\u012d\3\2\2\2\u0175\u0151\3\2\2\2\u0176"+
		"\37\3\2\2\2\u0177\u0178\7$\2\2\u0178\u0179\5&\24\2\u0179\u017a\5\f\7\2"+
		"\u017a\u017c\7\26\2\2\u017b\u017d\5&\24\2\u017c\u017b\3\2\2\2\u017c\u017d"+
		"\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u0180\5$\23\2\u017f\u0181\5&\24\2\u0180"+
		"\u017f\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0183\7\27"+
		"\2\2\u0183\u0184\5&\24\2\u0184\u0185\7\22\2\2\u0185\u0186\5&\24\2\u0186"+
		"\u0187\5\"\22\2\u0187\u0188\5&\24\2\u0188\u018a\7%\2\2\u0189\u018b\5&"+
		"\24\2\u018a\u0189\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018c\3\2\2\2\u018c"+
		"\u018d\7\f\2\2\u018d\u019d\3\2\2\2\u018e\u018f\7$\2\2\u018f\u0190\5&\24"+
		"\2\u0190\u0191\5\f\7\2\u0191\u0192\5&\24\2\u0192\u0193\7\22\2\2\u0193"+
		"\u0194\5&\24\2\u0194\u0195\5\"\22\2\u0195\u0196\5&\24\2\u0196\u0198\7"+
		"%\2\2\u0197\u0199\5&\24\2\u0198\u0197\3\2\2\2\u0198\u0199\3\2\2\2\u0199"+
		"\u019a\3\2\2\2\u019a\u019b\7\f\2\2\u019b\u019d\3\2\2\2\u019c\u0177\3\2"+
		"\2\2\u019c\u018e\3\2\2\2\u019d!\3\2\2\2\u019e\u01a0\5\4\3\2\u019f\u019e"+
		"\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u019f\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2"+
		"\u01a4\3\2\2\2\u01a3\u01a5\5&\24\2\u01a4\u01a3\3\2\2\2\u01a4\u01a5\3\2"+
		"\2\2\u01a5\u01b7\3\2\2\2\u01a6\u01a8\5\4\3\2\u01a7\u01a6\3\2\2\2\u01a8"+
		"\u01a9\3\2\2\2\u01a9\u01a7\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ab\3\2"+
		"\2\2\u01ab\u01ac\5&\24\2\u01ac\u01ad\5\34\17\2\u01ad\u01af\5&\24\2\u01ae"+
		"\u01b0\5\4\3\2\u01af\u01ae\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01af\3\2"+
		"\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b4\3\2\2\2\u01b3\u01b5\5&\24\2\u01b4"+
		"\u01b3\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b7\3\2\2\2\u01b6\u019f\3\2"+
		"\2\2\u01b6\u01a7\3\2\2\2\u01b7#\3\2\2\2\u01b8\u01ba\5\24\13\2\u01b9\u01bb"+
		"\5&\24\2\u01ba\u01b9\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01c7\3\2\2\2\u01bc"+
		"\u01be\5\24\13\2\u01bd\u01bf\5&\24\2\u01be\u01bd\3\2\2\2\u01be\u01bf\3"+
		"\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c2\7\23\2\2\u01c1\u01c3\5&\24\2\u01c2"+
		"\u01c1\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4\u01c5\5$"+
		"\23\2\u01c5\u01c7\3\2\2\2\u01c6\u01b8\3\2\2\2\u01c6\u01bc\3\2\2\2\u01c7"+
		"%\3\2\2\2\u01c8\u01ca\7&\2\2\u01c9\u01c8\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb"+
		"\u01c9\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\'\3\2\2\2L)-\61:DKRVhkrvz\177"+
		"\u008c\u009a\u009e\u00a2\u00a6\u00b9\u00bd\u00c2\u00c6\u00ca\u00ce\u00d7"+
		"\u00dc\u00e2\u00e6\u00ec\u00f0\u00f6\u00fa\u0100\u0104\u010a\u010e\u0114"+
		"\u0118\u011c\u0122\u0124\u0129\u0131\u0135\u0139\u013d\u0141\u0148\u014d"+
		"\u0155\u0159\u015d\u0161\u0165\u016c\u0171\u0175\u017c\u0180\u018a\u0198"+
		"\u019c\u01a1\u01a4\u01a9\u01b1\u01b4\u01b6\u01ba\u01be\u01c2\u01c6\u01cb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}