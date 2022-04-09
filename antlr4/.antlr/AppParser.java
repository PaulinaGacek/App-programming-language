// Generated from /home/pgacek/App/antlr4/App.g4 by ANTLR 4.8
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
		WS=32, LOWERCASELETTER=33, UPPERCASELETTER=34, NONZERODIGIT=35, ZERO=36;
	public static final int
		RULE_primaryExpression = 0, RULE_instruction = 1, RULE_signSequence = 2, 
		RULE_simpleVariableType = 3, RULE_complexVariableType = 4, RULE_variable = 5, 
		RULE_variableName = 6, RULE_functionName = 7, RULE_integer = 8, RULE_arithmeticalExpression = 9, 
		RULE_declaration = 10, RULE_definition = 11, RULE_conditionalStatement = 12, 
		RULE_condition = 13, RULE_parallelExpression = 14, RULE_loop = 15, RULE_function = 16, 
		RULE_functionBody = 17, RULE_functionArgs = 18, RULE_whiteSpace = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"primaryExpression", "instruction", "signSequence", "simpleVariableType", 
			"complexVariableType", "variable", "variableName", "functionName", "integer", 
			"arithmeticalExpression", "declaration", "definition", "conditionalStatement", 
			"condition", "parallelExpression", "loop", "function", "functionBody", 
			"functionArgs", "whiteSpace"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'_'", "'TIME'", "'INT'", "'OBJECT'", "'FORCE'", "'-'", "'+'", 
			"'/'", "'*'", "'DEFINE'", "';'", "'AS'", "','", "'SET'", "'IF'", "'('", 
			"')'", "'THEN'", "'ENDIF'", "'=='", "'>'", "'<'", "'>='", "'<='", "'!='", 
			"'PARALLEL'", "'ENDPARALLEL'", "'LOOP'", "'ENDLOOP'", "'DEFINE FUNCTION'", 
			"'ENDFUNCTION'", null, null, null, null, "'0'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "WS", "LOWERCASELETTER", 
			"UPPERCASELETTER", "NONZERODIGIT", "ZERO"
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(47); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(41);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(40);
						whiteSpace();
						}
					}

					setState(43);
					instruction();
					setState(45);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						setState(44);
						whiteSpace();
						}
						break;
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(49); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instruction);
		try {
			setState(57);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				declaration();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				definition();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 3);
				{
				setState(53);
				conditionalStatement();
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 4);
				{
				setState(54);
				parallelExpression();
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 5);
				{
				setState(55);
				loop();
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 6);
				{
				setState(56);
				function();
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

	public static class SignSequenceContext extends ParserRuleContext {
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
		public SignSequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signSequence; }
	}

	public final SignSequenceContext signSequence() throws RecognitionException {
		SignSequenceContext _localctx = new SignSequenceContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_signSequence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(59);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << LOWERCASELETTER) | (1L << UPPERCASELETTER) | (1L << NONZERODIGIT) | (1L << ZERO))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(62); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << LOWERCASELETTER) | (1L << UPPERCASELETTER) | (1L << NONZERODIGIT) | (1L << ZERO))) != 0) );
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
		enterRule(_localctx, 6, RULE_simpleVariableType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3))) != 0)) ) {
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
		enterRule(_localctx, 8, RULE_complexVariableType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(T__4);
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

	public static class VariableContext extends ParserRuleContext {
		public SimpleVariableTypeContext simpleVariableType() {
			return getRuleContext(SimpleVariableTypeContext.class,0);
		}
		public ComplexVariableTypeContext complexVariableType() {
			return getRuleContext(ComplexVariableTypeContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_variable);
		try {
			setState(70);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__2:
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				simpleVariableType();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				complexVariableType();
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

	public static class VariableNameContext extends ParserRuleContext {
		public TerminalNode LOWERCASELETTER() { return getToken(AppParser.LOWERCASELETTER, 0); }
		public SignSequenceContext signSequence() {
			return getRuleContext(SignSequenceContext.class,0);
		}
		public VariableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableName; }
	}

	public final VariableNameContext variableName() throws RecognitionException {
		VariableNameContext _localctx = new VariableNameContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_variableName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(LOWERCASELETTER);
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << LOWERCASELETTER) | (1L << UPPERCASELETTER) | (1L << NONZERODIGIT) | (1L << ZERO))) != 0)) {
				{
				setState(73);
				signSequence();
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

	public static class FunctionNameContext extends ParserRuleContext {
		public TerminalNode LOWERCASELETTER() { return getToken(AppParser.LOWERCASELETTER, 0); }
		public SignSequenceContext signSequence() {
			return getRuleContext(SignSequenceContext.class,0);
		}
		public FunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionName; }
	}

	public final FunctionNameContext functionName() throws RecognitionException {
		FunctionNameContext _localctx = new FunctionNameContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_functionName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(LOWERCASELETTER);
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << LOWERCASELETTER) | (1L << UPPERCASELETTER) | (1L << NONZERODIGIT) | (1L << ZERO))) != 0)) {
				{
				setState(77);
				signSequence();
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
		enterRule(_localctx, 16, RULE_integer);
		int _la;
		try {
			int _alt;
			setState(91);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case NONZERODIGIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(80);
					match(T__5);
					}
				}

				setState(83);
				match(NONZERODIGIT);
				setState(87);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(84);
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
					setState(89);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				}
				break;
			case ZERO:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
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

	public static class ArithmeticalExpressionContext extends ParserRuleContext {
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
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
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_arithmeticalExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(94);
			integer();
			}
			_ctx.stop = _input.LT(-1);
			setState(107);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArithmeticalExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_arithmeticalExpression);
					setState(96);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(98);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(97);
						whiteSpace();
						}
					}

					setState(100);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(102);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(101);
						whiteSpace();
						}
					}

					setState(104);
					arithmeticalExpression(3);
					}
					} 
				}
				setState(109);
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
		enterRule(_localctx, 20, RULE_declaration);
		int _la;
		try {
			setState(166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				match(T__9);
				setState(111);
				whiteSpace();
				setState(112);
				simpleVariableType();
				setState(113);
				whiteSpace();
				setState(114);
				variableName();
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
				match(T__10);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				match(T__9);
				setState(121);
				whiteSpace();
				setState(122);
				simpleVariableType();
				setState(123);
				whiteSpace();
				setState(124);
				variableName();
				setState(125);
				whiteSpace();
				setState(126);
				match(T__11);
				setState(127);
				whiteSpace();
				setState(128);
				arithmeticalExpression(0);
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(129);
					whiteSpace();
					}
				}

				setState(132);
				match(T__10);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(134);
				match(T__9);
				setState(135);
				whiteSpace();
				setState(136);
				complexVariableType();
				setState(137);
				whiteSpace();
				setState(138);
				variableName();
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(139);
					whiteSpace();
					}
				}

				setState(142);
				match(T__10);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(144);
				match(T__9);
				setState(145);
				whiteSpace();
				setState(146);
				complexVariableType();
				setState(147);
				whiteSpace();
				setState(148);
				variableName();
				setState(149);
				whiteSpace();
				setState(150);
				match(T__11);
				setState(151);
				whiteSpace();
				setState(152);
				arithmeticalExpression(0);
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(153);
					whiteSpace();
					}
				}

				setState(156);
				match(T__12);
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(157);
					whiteSpace();
					}
				}

				setState(160);
				arithmeticalExpression(0);
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(161);
					whiteSpace();
					}
				}

				setState(164);
				match(T__10);
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
		enterRule(_localctx, 22, RULE_definition);
		int _la;
		try {
			setState(194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				match(T__13);
				setState(169);
				whiteSpace();
				setState(170);
				variableName();
				setState(171);
				whiteSpace();
				setState(172);
				match(T__11);
				setState(173);
				whiteSpace();
				setState(174);
				arithmeticalExpression(0);
				setState(175);
				match(T__10);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				match(T__13);
				setState(178);
				whiteSpace();
				setState(179);
				variableName();
				setState(180);
				whiteSpace();
				setState(181);
				match(T__11);
				setState(182);
				whiteSpace();
				setState(183);
				arithmeticalExpression(0);
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(184);
					whiteSpace();
					}
				}

				setState(187);
				match(T__12);
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(188);
					whiteSpace();
					}
				}

				setState(191);
				arithmeticalExpression(0);
				setState(192);
				match(T__10);
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
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(AppParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(AppParser.WS, i);
		}
		public ConditionalStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalStatement; }
	}

	public final ConditionalStatementContext conditionalStatement() throws RecognitionException {
		ConditionalStatementContext _localctx = new ConditionalStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_conditionalStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(T__14);
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(197);
				match(WS);
				}
				}
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(203);
			match(T__15);
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(204);
				match(WS);
				}
				}
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(210);
			condition();
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(211);
				match(WS);
				}
				}
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(217);
			match(T__16);
			setState(219); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(218);
				match(WS);
				}
				}
				setState(221); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS );
			setState(223);
			match(T__17);
			setState(225); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(224);
					match(WS);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(227); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(229);
			primaryExpression();
			setState(231); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(230);
				match(WS);
				}
				}
				setState(233); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS );
			setState(235);
			match(T__18);
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(236);
				match(WS);
				}
				}
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(242);
			match(T__10);
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
		public List<TerminalNode> WS() { return getTokens(AppParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(AppParser.WS, i);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_condition);
		int _la;
		try {
			setState(340);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(244);
				variableName();
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(245);
					match(WS);
					}
					}
					setState(250);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(251);
				match(T__19);
				setState(255);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(252);
					match(WS);
					}
					}
					setState(257);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(258);
				arithmeticalExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(260);
				variableName();
				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(261);
					match(WS);
					}
					}
					setState(266);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(267);
				match(T__20);
				setState(271);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(268);
					match(WS);
					}
					}
					setState(273);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(274);
				arithmeticalExpression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(276);
				variableName();
				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(277);
					match(WS);
					}
					}
					setState(282);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(283);
				match(T__21);
				setState(287);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(284);
					match(WS);
					}
					}
					setState(289);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(290);
				arithmeticalExpression(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(292);
				variableName();
				setState(296);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(293);
					match(WS);
					}
					}
					setState(298);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(299);
				match(T__22);
				setState(303);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(300);
					match(WS);
					}
					}
					setState(305);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(306);
				arithmeticalExpression(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(308);
				variableName();
				setState(312);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(309);
					match(WS);
					}
					}
					setState(314);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(315);
				match(T__23);
				setState(319);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(316);
					match(WS);
					}
					}
					setState(321);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(322);
				arithmeticalExpression(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(324);
				variableName();
				setState(328);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(325);
					match(WS);
					}
					}
					setState(330);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(331);
				match(T__24);
				setState(335);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(332);
					match(WS);
					}
					}
					setState(337);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(338);
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
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(AppParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(AppParser.WS, i);
		}
		public ParallelExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parallelExpression; }
	}

	public final ParallelExpressionContext parallelExpression() throws RecognitionException {
		ParallelExpressionContext _localctx = new ParallelExpressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_parallelExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			match(T__25);
			setState(344); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(343);
					match(WS);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(346); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(348);
			primaryExpression();
			setState(350); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(349);
				match(WS);
				}
				}
				setState(352); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS );
			setState(354);
			match(T__26);
			setState(358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(355);
				match(WS);
				}
				}
				setState(360);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(361);
			match(T__10);
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
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public DefinitionContext definition() {
			return getRuleContext(DefinitionContext.class,0);
		}
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(AppParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(AppParser.WS, i);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_loop);
		int _la;
		try {
			int _alt;
			setState(487);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(363);
				match(T__27);
				setState(365); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(364);
					match(WS);
					}
					}
					setState(367); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WS );
				setState(369);
				match(T__15);
				setState(373);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(370);
					match(WS);
					}
					}
					setState(375);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(376);
				declaration();
				setState(380);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(377);
					match(WS);
					}
					}
					setState(382);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(383);
				condition();
				setState(387);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(384);
					match(WS);
					}
					}
					setState(389);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(390);
				match(T__10);
				setState(394);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(391);
					match(WS);
					}
					}
					setState(396);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(397);
				definition();
				setState(401);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(398);
					match(WS);
					}
					}
					setState(403);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(404);
				match(T__16);
				setState(406); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(405);
						match(WS);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(408); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(410);
				primaryExpression();
				setState(412); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(411);
					match(WS);
					}
					}
					setState(414); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WS );
				setState(416);
				match(T__28);
				setState(420);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(417);
					match(WS);
					}
					}
					setState(422);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(423);
				match(T__10);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(425);
				match(T__27);
				setState(427); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(426);
					match(WS);
					}
					}
					setState(429); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WS );
				setState(431);
				match(T__15);
				setState(435);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(432);
					match(WS);
					}
					}
					setState(437);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(438);
				match(T__10);
				setState(442);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(439);
					match(WS);
					}
					}
					setState(444);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(445);
				condition();
				setState(449);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(446);
					match(WS);
					}
					}
					setState(451);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(452);
				match(T__10);
				setState(456);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(453);
					match(WS);
					}
					}
					setState(458);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(459);
				definition();
				setState(463);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(460);
					match(WS);
					}
					}
					setState(465);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(466);
				match(T__16);
				setState(468); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(467);
						match(WS);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(470); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(472);
				primaryExpression();
				setState(474); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(473);
					match(WS);
					}
					}
					setState(476); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WS );
				setState(478);
				match(T__28);
				setState(482);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(479);
					match(WS);
					}
					}
					setState(484);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(485);
				match(T__10);
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
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public FunctionArgsContext functionArgs() {
			return getRuleContext(FunctionArgsContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(AppParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(AppParser.WS, i);
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
		enterRule(_localctx, 32, RULE_function);
		int _la;
		try {
			int _alt;
			setState(566);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(489);
				match(T__29);
				setState(491); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(490);
					match(WS);
					}
					}
					setState(493); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WS );
				setState(495);
				functionName();
				setState(496);
				match(T__15);
				setState(500);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(497);
					match(WS);
					}
					}
					setState(502);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(503);
				functionArgs();
				setState(507);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(504);
					match(WS);
					}
					}
					setState(509);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(510);
				match(T__16);
				setState(511);
				match(WS);
				setState(512);
				match(T__11);
				setState(514); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(513);
						match(WS);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(516); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(518);
				functionBody();
				setState(520); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(519);
					match(WS);
					}
					}
					setState(522); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WS );
				setState(524);
				match(T__30);
				setState(528);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(525);
					match(WS);
					}
					}
					setState(530);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(531);
				match(T__10);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(533);
				match(T__29);
				setState(535); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(534);
					match(WS);
					}
					}
					setState(537); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WS );
				setState(539);
				functionName();
				setState(541); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(540);
					match(WS);
					}
					}
					setState(543); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WS );
				setState(545);
				match(T__11);
				setState(547); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(546);
						match(WS);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(549); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(551);
				functionBody();
				setState(553); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(552);
					match(WS);
					}
					}
					setState(555); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WS );
				setState(557);
				match(T__30);
				setState(561);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(558);
					match(WS);
					}
					}
					setState(563);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(564);
				match(T__10);
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
		public List<PrimaryExpressionContext> primaryExpression() {
			return getRuleContexts(PrimaryExpressionContext.class);
		}
		public PrimaryExpressionContext primaryExpression(int i) {
			return getRuleContext(PrimaryExpressionContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(AppParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(AppParser.WS, i);
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
		enterRule(_localctx, 34, RULE_functionBody);
		int _la;
		try {
			int _alt;
			setState(594);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(568);
				primaryExpression();
				setState(572);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(569);
						match(WS);
						}
						} 
					}
					setState(574);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(575);
				primaryExpression();
				setState(577); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(576);
					match(WS);
					}
					}
					setState(579); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WS );
				setState(581);
				parallelExpression();
				setState(583); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(582);
						match(WS);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(585); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(587);
				primaryExpression();
				setState(591);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(588);
						match(WS);
						}
						} 
					}
					setState(593);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
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
		public List<TerminalNode> WS() { return getTokens(AppParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(AppParser.WS, i);
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
		enterRule(_localctx, 36, RULE_functionArgs);
		int _la;
		try {
			int _alt;
			setState(619);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(596);
				declaration();
				setState(600);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(597);
						match(WS);
						}
						} 
					}
					setState(602);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(603);
				declaration();
				setState(607);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(604);
					match(WS);
					}
					}
					setState(609);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(610);
				match(T__12);
				setState(614);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(611);
					match(WS);
					}
					}
					setState(616);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(617);
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
		enterRule(_localctx, 38, RULE_whiteSpace);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(622); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(621);
					match(WS);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(624); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
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
		case 9:
			return arithmeticalExpression_sempred((ArithmeticalExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean arithmeticalExpression_sempred(ArithmeticalExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3&\u0275\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\5\2,\n\2\3\2\3\2\5\2\60\n\2\6\2\62"+
		"\n\2\r\2\16\2\63\3\3\3\3\3\3\3\3\3\3\3\3\5\3<\n\3\3\4\6\4?\n\4\r\4\16"+
		"\4@\3\5\3\5\3\6\3\6\3\7\3\7\5\7I\n\7\3\b\3\b\5\bM\n\b\3\t\3\t\5\tQ\n\t"+
		"\3\n\5\nT\n\n\3\n\3\n\7\nX\n\n\f\n\16\n[\13\n\3\n\5\n^\n\n\3\13\3\13\3"+
		"\13\3\13\3\13\5\13e\n\13\3\13\3\13\5\13i\n\13\3\13\7\13l\n\13\f\13\16"+
		"\13o\13\13\3\f\3\f\3\f\3\f\3\f\3\f\5\fw\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\5\f\u0085\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5"+
		"\f\u008f\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u009d"+
		"\n\f\3\f\3\f\5\f\u00a1\n\f\3\f\3\f\5\f\u00a5\n\f\3\f\3\f\5\f\u00a9\n\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5"+
		"\r\u00bc\n\r\3\r\3\r\5\r\u00c0\n\r\3\r\3\r\3\r\5\r\u00c5\n\r\3\16\3\16"+
		"\7\16\u00c9\n\16\f\16\16\16\u00cc\13\16\3\16\3\16\7\16\u00d0\n\16\f\16"+
		"\16\16\u00d3\13\16\3\16\3\16\7\16\u00d7\n\16\f\16\16\16\u00da\13\16\3"+
		"\16\3\16\6\16\u00de\n\16\r\16\16\16\u00df\3\16\3\16\6\16\u00e4\n\16\r"+
		"\16\16\16\u00e5\3\16\3\16\6\16\u00ea\n\16\r\16\16\16\u00eb\3\16\3\16\7"+
		"\16\u00f0\n\16\f\16\16\16\u00f3\13\16\3\16\3\16\3\17\3\17\7\17\u00f9\n"+
		"\17\f\17\16\17\u00fc\13\17\3\17\3\17\7\17\u0100\n\17\f\17\16\17\u0103"+
		"\13\17\3\17\3\17\3\17\3\17\7\17\u0109\n\17\f\17\16\17\u010c\13\17\3\17"+
		"\3\17\7\17\u0110\n\17\f\17\16\17\u0113\13\17\3\17\3\17\3\17\3\17\7\17"+
		"\u0119\n\17\f\17\16\17\u011c\13\17\3\17\3\17\7\17\u0120\n\17\f\17\16\17"+
		"\u0123\13\17\3\17\3\17\3\17\3\17\7\17\u0129\n\17\f\17\16\17\u012c\13\17"+
		"\3\17\3\17\7\17\u0130\n\17\f\17\16\17\u0133\13\17\3\17\3\17\3\17\3\17"+
		"\7\17\u0139\n\17\f\17\16\17\u013c\13\17\3\17\3\17\7\17\u0140\n\17\f\17"+
		"\16\17\u0143\13\17\3\17\3\17\3\17\3\17\7\17\u0149\n\17\f\17\16\17\u014c"+
		"\13\17\3\17\3\17\7\17\u0150\n\17\f\17\16\17\u0153\13\17\3\17\3\17\5\17"+
		"\u0157\n\17\3\20\3\20\6\20\u015b\n\20\r\20\16\20\u015c\3\20\3\20\6\20"+
		"\u0161\n\20\r\20\16\20\u0162\3\20\3\20\7\20\u0167\n\20\f\20\16\20\u016a"+
		"\13\20\3\20\3\20\3\21\3\21\6\21\u0170\n\21\r\21\16\21\u0171\3\21\3\21"+
		"\7\21\u0176\n\21\f\21\16\21\u0179\13\21\3\21\3\21\7\21\u017d\n\21\f\21"+
		"\16\21\u0180\13\21\3\21\3\21\7\21\u0184\n\21\f\21\16\21\u0187\13\21\3"+
		"\21\3\21\7\21\u018b\n\21\f\21\16\21\u018e\13\21\3\21\3\21\7\21\u0192\n"+
		"\21\f\21\16\21\u0195\13\21\3\21\3\21\6\21\u0199\n\21\r\21\16\21\u019a"+
		"\3\21\3\21\6\21\u019f\n\21\r\21\16\21\u01a0\3\21\3\21\7\21\u01a5\n\21"+
		"\f\21\16\21\u01a8\13\21\3\21\3\21\3\21\3\21\6\21\u01ae\n\21\r\21\16\21"+
		"\u01af\3\21\3\21\7\21\u01b4\n\21\f\21\16\21\u01b7\13\21\3\21\3\21\7\21"+
		"\u01bb\n\21\f\21\16\21\u01be\13\21\3\21\3\21\7\21\u01c2\n\21\f\21\16\21"+
		"\u01c5\13\21\3\21\3\21\7\21\u01c9\n\21\f\21\16\21\u01cc\13\21\3\21\3\21"+
		"\7\21\u01d0\n\21\f\21\16\21\u01d3\13\21\3\21\3\21\6\21\u01d7\n\21\r\21"+
		"\16\21\u01d8\3\21\3\21\6\21\u01dd\n\21\r\21\16\21\u01de\3\21\3\21\7\21"+
		"\u01e3\n\21\f\21\16\21\u01e6\13\21\3\21\3\21\5\21\u01ea\n\21\3\22\3\22"+
		"\6\22\u01ee\n\22\r\22\16\22\u01ef\3\22\3\22\3\22\7\22\u01f5\n\22\f\22"+
		"\16\22\u01f8\13\22\3\22\3\22\7\22\u01fc\n\22\f\22\16\22\u01ff\13\22\3"+
		"\22\3\22\3\22\3\22\6\22\u0205\n\22\r\22\16\22\u0206\3\22\3\22\6\22\u020b"+
		"\n\22\r\22\16\22\u020c\3\22\3\22\7\22\u0211\n\22\f\22\16\22\u0214\13\22"+
		"\3\22\3\22\3\22\3\22\6\22\u021a\n\22\r\22\16\22\u021b\3\22\3\22\6\22\u0220"+
		"\n\22\r\22\16\22\u0221\3\22\3\22\6\22\u0226\n\22\r\22\16\22\u0227\3\22"+
		"\3\22\6\22\u022c\n\22\r\22\16\22\u022d\3\22\3\22\7\22\u0232\n\22\f\22"+
		"\16\22\u0235\13\22\3\22\3\22\5\22\u0239\n\22\3\23\3\23\7\23\u023d\n\23"+
		"\f\23\16\23\u0240\13\23\3\23\3\23\6\23\u0244\n\23\r\23\16\23\u0245\3\23"+
		"\3\23\6\23\u024a\n\23\r\23\16\23\u024b\3\23\3\23\7\23\u0250\n\23\f\23"+
		"\16\23\u0253\13\23\5\23\u0255\n\23\3\24\3\24\7\24\u0259\n\24\f\24\16\24"+
		"\u025c\13\24\3\24\3\24\7\24\u0260\n\24\f\24\16\24\u0263\13\24\3\24\3\24"+
		"\7\24\u0267\n\24\f\24\16\24\u026a\13\24\3\24\3\24\5\24\u026e\n\24\3\25"+
		"\6\25\u0271\n\25\r\25\16\25\u0272\3\25\2\3\24\26\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(\2\6\4\2\3\3#&\3\2\4\6\3\2%&\3\2\b\13\2\u02c2"+
		"\2\61\3\2\2\2\4;\3\2\2\2\6>\3\2\2\2\bB\3\2\2\2\nD\3\2\2\2\fH\3\2\2\2\16"+
		"J\3\2\2\2\20N\3\2\2\2\22]\3\2\2\2\24_\3\2\2\2\26\u00a8\3\2\2\2\30\u00c4"+
		"\3\2\2\2\32\u00c6\3\2\2\2\34\u0156\3\2\2\2\36\u0158\3\2\2\2 \u01e9\3\2"+
		"\2\2\"\u0238\3\2\2\2$\u0254\3\2\2\2&\u026d\3\2\2\2(\u0270\3\2\2\2*,\5"+
		"(\25\2+*\3\2\2\2+,\3\2\2\2,-\3\2\2\2-/\5\4\3\2.\60\5(\25\2/.\3\2\2\2/"+
		"\60\3\2\2\2\60\62\3\2\2\2\61+\3\2\2\2\62\63\3\2\2\2\63\61\3\2\2\2\63\64"+
		"\3\2\2\2\64\3\3\2\2\2\65<\5\26\f\2\66<\5\30\r\2\67<\5\32\16\28<\5\36\20"+
		"\29<\5 \21\2:<\5\"\22\2;\65\3\2\2\2;\66\3\2\2\2;\67\3\2\2\2;8\3\2\2\2"+
		";9\3\2\2\2;:\3\2\2\2<\5\3\2\2\2=?\t\2\2\2>=\3\2\2\2?@\3\2\2\2@>\3\2\2"+
		"\2@A\3\2\2\2A\7\3\2\2\2BC\t\3\2\2C\t\3\2\2\2DE\7\7\2\2E\13\3\2\2\2FI\5"+
		"\b\5\2GI\5\n\6\2HF\3\2\2\2HG\3\2\2\2I\r\3\2\2\2JL\7#\2\2KM\5\6\4\2LK\3"+
		"\2\2\2LM\3\2\2\2M\17\3\2\2\2NP\7#\2\2OQ\5\6\4\2PO\3\2\2\2PQ\3\2\2\2Q\21"+
		"\3\2\2\2RT\7\b\2\2SR\3\2\2\2ST\3\2\2\2TU\3\2\2\2UY\7%\2\2VX\t\4\2\2WV"+
		"\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z^\3\2\2\2[Y\3\2\2\2\\^\7&\2\2]"+
		"S\3\2\2\2]\\\3\2\2\2^\23\3\2\2\2_`\b\13\1\2`a\5\22\n\2am\3\2\2\2bd\f\4"+
		"\2\2ce\5(\25\2dc\3\2\2\2de\3\2\2\2ef\3\2\2\2fh\t\5\2\2gi\5(\25\2hg\3\2"+
		"\2\2hi\3\2\2\2ij\3\2\2\2jl\5\24\13\5kb\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3"+
		"\2\2\2n\25\3\2\2\2om\3\2\2\2pq\7\f\2\2qr\5(\25\2rs\5\b\5\2st\5(\25\2t"+
		"v\5\16\b\2uw\5(\25\2vu\3\2\2\2vw\3\2\2\2wx\3\2\2\2xy\7\r\2\2y\u00a9\3"+
		"\2\2\2z{\7\f\2\2{|\5(\25\2|}\5\b\5\2}~\5(\25\2~\177\5\16\b\2\177\u0080"+
		"\5(\25\2\u0080\u0081\7\16\2\2\u0081\u0082\5(\25\2\u0082\u0084\5\24\13"+
		"\2\u0083\u0085\5(\25\2\u0084\u0083\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086"+
		"\3\2\2\2\u0086\u0087\7\r\2\2\u0087\u00a9\3\2\2\2\u0088\u0089\7\f\2\2\u0089"+
		"\u008a\5(\25\2\u008a\u008b\5\n\6\2\u008b\u008c\5(\25\2\u008c\u008e\5\16"+
		"\b\2\u008d\u008f\5(\25\2\u008e\u008d\3\2\2\2\u008e\u008f\3\2\2\2\u008f"+
		"\u0090\3\2\2\2\u0090\u0091\7\r\2\2\u0091\u00a9\3\2\2\2\u0092\u0093\7\f"+
		"\2\2\u0093\u0094\5(\25\2\u0094\u0095\5\n\6\2\u0095\u0096\5(\25\2\u0096"+
		"\u0097\5\16\b\2\u0097\u0098\5(\25\2\u0098\u0099\7\16\2\2\u0099\u009a\5"+
		"(\25\2\u009a\u009c\5\24\13\2\u009b\u009d\5(\25\2\u009c\u009b\3\2\2\2\u009c"+
		"\u009d\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a0\7\17\2\2\u009f\u00a1\5"+
		"(\25\2\u00a0\u009f\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2"+
		"\u00a4\5\24\13\2\u00a3\u00a5\5(\25\2\u00a4\u00a3\3\2\2\2\u00a4\u00a5\3"+
		"\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\7\r\2\2\u00a7\u00a9\3\2\2\2\u00a8"+
		"p\3\2\2\2\u00a8z\3\2\2\2\u00a8\u0088\3\2\2\2\u00a8\u0092\3\2\2\2\u00a9"+
		"\27\3\2\2\2\u00aa\u00ab\7\20\2\2\u00ab\u00ac\5(\25\2\u00ac\u00ad\5\16"+
		"\b\2\u00ad\u00ae\5(\25\2\u00ae\u00af\7\16\2\2\u00af\u00b0\5(\25\2\u00b0"+
		"\u00b1\5\24\13\2\u00b1\u00b2\7\r\2\2\u00b2\u00c5\3\2\2\2\u00b3\u00b4\7"+
		"\20\2\2\u00b4\u00b5\5(\25\2\u00b5\u00b6\5\16\b\2\u00b6\u00b7\5(\25\2\u00b7"+
		"\u00b8\7\16\2\2\u00b8\u00b9\5(\25\2\u00b9\u00bb\5\24\13\2\u00ba\u00bc"+
		"\5(\25\2\u00bb\u00ba\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd"+
		"\u00bf\7\17\2\2\u00be\u00c0\5(\25\2\u00bf\u00be\3\2\2\2\u00bf\u00c0\3"+
		"\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\5\24\13\2\u00c2\u00c3\7\r\2\2\u00c3"+
		"\u00c5\3\2\2\2\u00c4\u00aa\3\2\2\2\u00c4\u00b3\3\2\2\2\u00c5\31\3\2\2"+
		"\2\u00c6\u00ca\7\21\2\2\u00c7\u00c9\7\"\2\2\u00c8\u00c7\3\2\2\2\u00c9"+
		"\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cd\3\2"+
		"\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00d1\7\22\2\2\u00ce\u00d0\7\"\2\2\u00cf"+
		"\u00ce\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2"+
		"\2\2\u00d2\u00d4\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00d8\5\34\17\2\u00d5"+
		"\u00d7\7\"\2\2\u00d6\u00d5\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d6\3\2"+
		"\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00db\3\2\2\2\u00da\u00d8\3\2\2\2\u00db"+
		"\u00dd\7\23\2\2\u00dc\u00de\7\"\2\2\u00dd\u00dc\3\2\2\2\u00de\u00df\3"+
		"\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1"+
		"\u00e3\7\24\2\2\u00e2\u00e4\7\"\2\2\u00e3\u00e2\3\2\2\2\u00e4\u00e5\3"+
		"\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7"+
		"\u00e9\5\2\2\2\u00e8\u00ea\7\"\2\2\u00e9\u00e8\3\2\2\2\u00ea\u00eb\3\2"+
		"\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed"+
		"\u00f1\7\25\2\2\u00ee\u00f0\7\"\2\2\u00ef\u00ee\3\2\2\2\u00f0\u00f3\3"+
		"\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f4\3\2\2\2\u00f3"+
		"\u00f1\3\2\2\2\u00f4\u00f5\7\r\2\2\u00f5\33\3\2\2\2\u00f6\u00fa\5\16\b"+
		"\2\u00f7\u00f9\7\"\2\2\u00f8\u00f7\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8"+
		"\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fd\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd"+
		"\u0101\7\26\2\2\u00fe\u0100\7\"\2\2\u00ff\u00fe\3\2\2\2\u0100\u0103\3"+
		"\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0104\3\2\2\2\u0103"+
		"\u0101\3\2\2\2\u0104\u0105\5\24\13\2\u0105\u0157\3\2\2\2\u0106\u010a\5"+
		"\16\b\2\u0107\u0109\7\"\2\2\u0108\u0107\3\2\2\2\u0109\u010c\3\2\2\2\u010a"+
		"\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010d\3\2\2\2\u010c\u010a\3\2"+
		"\2\2\u010d\u0111\7\27\2\2\u010e\u0110\7\"\2\2\u010f\u010e\3\2\2\2\u0110"+
		"\u0113\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0114\3\2"+
		"\2\2\u0113\u0111\3\2\2\2\u0114\u0115\5\24\13\2\u0115\u0157\3\2\2\2\u0116"+
		"\u011a\5\16\b\2\u0117\u0119\7\"\2\2\u0118\u0117\3\2\2\2\u0119\u011c\3"+
		"\2\2\2\u011a\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011d\3\2\2\2\u011c"+
		"\u011a\3\2\2\2\u011d\u0121\7\30\2\2\u011e\u0120\7\"\2\2\u011f\u011e\3"+
		"\2\2\2\u0120\u0123\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122"+
		"\u0124\3\2\2\2\u0123\u0121\3\2\2\2\u0124\u0125\5\24\13\2\u0125\u0157\3"+
		"\2\2\2\u0126\u012a\5\16\b\2\u0127\u0129\7\"\2\2\u0128\u0127\3\2\2\2\u0129"+
		"\u012c\3\2\2\2\u012a\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012d\3\2"+
		"\2\2\u012c\u012a\3\2\2\2\u012d\u0131\7\31\2\2\u012e\u0130\7\"\2\2\u012f"+
		"\u012e\3\2\2\2\u0130\u0133\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2"+
		"\2\2\u0132\u0134\3\2\2\2\u0133\u0131\3\2\2\2\u0134\u0135\5\24\13\2\u0135"+
		"\u0157\3\2\2\2\u0136\u013a\5\16\b\2\u0137\u0139\7\"\2\2\u0138\u0137\3"+
		"\2\2\2\u0139\u013c\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b"+
		"\u013d\3\2\2\2\u013c\u013a\3\2\2\2\u013d\u0141\7\32\2\2\u013e\u0140\7"+
		"\"\2\2\u013f\u013e\3\2\2\2\u0140\u0143\3\2\2\2\u0141\u013f\3\2\2\2\u0141"+
		"\u0142\3\2\2\2\u0142\u0144\3\2\2\2\u0143\u0141\3\2\2\2\u0144\u0145\5\24"+
		"\13\2\u0145\u0157\3\2\2\2\u0146\u014a\5\16\b\2\u0147\u0149\7\"\2\2\u0148"+
		"\u0147\3\2\2\2\u0149\u014c\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2"+
		"\2\2\u014b\u014d\3\2\2\2\u014c\u014a\3\2\2\2\u014d\u0151\7\33\2\2\u014e"+
		"\u0150\7\"\2\2\u014f\u014e\3\2\2\2\u0150\u0153\3\2\2\2\u0151\u014f\3\2"+
		"\2\2\u0151\u0152\3\2\2\2\u0152\u0154\3\2\2\2\u0153\u0151\3\2\2\2\u0154"+
		"\u0155\5\24\13\2\u0155\u0157\3\2\2\2\u0156\u00f6\3\2\2\2\u0156\u0106\3"+
		"\2\2\2\u0156\u0116\3\2\2\2\u0156\u0126\3\2\2\2\u0156\u0136\3\2\2\2\u0156"+
		"\u0146\3\2\2\2\u0157\35\3\2\2\2\u0158\u015a\7\34\2\2\u0159\u015b\7\"\2"+
		"\2\u015a\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015a\3\2\2\2\u015c\u015d"+
		"\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u0160\5\2\2\2\u015f\u0161\7\"\2\2\u0160"+
		"\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0160\3\2\2\2\u0162\u0163\3\2"+
		"\2\2\u0163\u0164\3\2\2\2\u0164\u0168\7\35\2\2\u0165\u0167\7\"\2\2\u0166"+
		"\u0165\3\2\2\2\u0167\u016a\3\2\2\2\u0168\u0166\3\2\2\2\u0168\u0169\3\2"+
		"\2\2\u0169\u016b\3\2\2\2\u016a\u0168\3\2\2\2\u016b\u016c\7\r\2\2\u016c"+
		"\37\3\2\2\2\u016d\u016f\7\36\2\2\u016e\u0170\7\"\2\2\u016f\u016e\3\2\2"+
		"\2\u0170\u0171\3\2\2\2\u0171\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0173"+
		"\3\2\2\2\u0173\u0177\7\22\2\2\u0174\u0176\7\"\2\2\u0175\u0174\3\2\2\2"+
		"\u0176\u0179\3\2\2\2\u0177\u0175\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u017a"+
		"\3\2\2\2\u0179\u0177\3\2\2\2\u017a\u017e\5\26\f\2\u017b\u017d\7\"\2\2"+
		"\u017c\u017b\3\2\2\2\u017d\u0180\3\2\2\2\u017e\u017c\3\2\2\2\u017e\u017f"+
		"\3\2\2\2\u017f\u0181\3\2\2\2\u0180\u017e\3\2\2\2\u0181\u0185\5\34\17\2"+
		"\u0182\u0184\7\"\2\2\u0183\u0182\3\2\2\2\u0184\u0187\3\2\2\2\u0185\u0183"+
		"\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0188\3\2\2\2\u0187\u0185\3\2\2\2\u0188"+
		"\u018c\7\r\2\2\u0189\u018b\7\"\2\2\u018a\u0189\3\2\2\2\u018b\u018e\3\2"+
		"\2\2\u018c\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018f\3\2\2\2\u018e"+
		"\u018c\3\2\2\2\u018f\u0193\5\30\r\2\u0190\u0192\7\"\2\2\u0191\u0190\3"+
		"\2\2\2\u0192\u0195\3\2\2\2\u0193\u0191\3\2\2\2\u0193\u0194\3\2\2\2\u0194"+
		"\u0196\3\2\2\2\u0195\u0193\3\2\2\2\u0196\u0198\7\23\2\2\u0197\u0199\7"+
		"\"\2\2\u0198\u0197\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u0198\3\2\2\2\u019a"+
		"\u019b\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u019e\5\2\2\2\u019d\u019f\7\""+
		"\2\2\u019e\u019d\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u019e\3\2\2\2\u01a0"+
		"\u01a1\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a6\7\37\2\2\u01a3\u01a5\7"+
		"\"\2\2\u01a4\u01a3\3\2\2\2\u01a5\u01a8\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a6"+
		"\u01a7\3\2\2\2\u01a7\u01a9\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a9\u01aa\7\r"+
		"\2\2\u01aa\u01ea\3\2\2\2\u01ab\u01ad\7\36\2\2\u01ac\u01ae\7\"\2\2\u01ad"+
		"\u01ac\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01ad\3\2\2\2\u01af\u01b0\3\2"+
		"\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01b5\7\22\2\2\u01b2\u01b4\7\"\2\2\u01b3"+
		"\u01b2\3\2\2\2\u01b4\u01b7\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b5\u01b6\3\2"+
		"\2\2\u01b6\u01b8\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b8\u01bc\7\r\2\2\u01b9"+
		"\u01bb\7\"\2\2\u01ba\u01b9\3\2\2\2\u01bb\u01be\3\2\2\2\u01bc\u01ba\3\2"+
		"\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01bf\3\2\2\2\u01be\u01bc\3\2\2\2\u01bf"+
		"\u01c3\5\34\17\2\u01c0\u01c2\7\"\2\2\u01c1\u01c0\3\2\2\2\u01c2\u01c5\3"+
		"\2\2\2\u01c3\u01c1\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4\u01c6\3\2\2\2\u01c5"+
		"\u01c3\3\2\2\2\u01c6\u01ca\7\r\2\2\u01c7\u01c9\7\"\2\2\u01c8\u01c7\3\2"+
		"\2\2\u01c9\u01cc\3\2\2\2\u01ca\u01c8\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb"+
		"\u01cd\3\2\2\2\u01cc\u01ca\3\2\2\2\u01cd\u01d1\5\30\r\2\u01ce\u01d0\7"+
		"\"\2\2\u01cf\u01ce\3\2\2\2\u01d0\u01d3\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d1"+
		"\u01d2\3\2\2\2\u01d2\u01d4\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d4\u01d6\7\23"+
		"\2\2\u01d5\u01d7\7\"\2\2\u01d6\u01d5\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8"+
		"\u01d6\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01da\3\2\2\2\u01da\u01dc\5\2"+
		"\2\2\u01db\u01dd\7\"\2\2\u01dc\u01db\3\2\2\2\u01dd\u01de\3\2\2\2\u01de"+
		"\u01dc\3\2\2\2\u01de\u01df\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0\u01e4\7\37"+
		"\2\2\u01e1\u01e3\7\"\2\2\u01e2\u01e1\3\2\2\2\u01e3\u01e6\3\2\2\2\u01e4"+
		"\u01e2\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01e7\3\2\2\2\u01e6\u01e4\3\2"+
		"\2\2\u01e7\u01e8\7\r\2\2\u01e8\u01ea\3\2\2\2\u01e9\u016d\3\2\2\2\u01e9"+
		"\u01ab\3\2\2\2\u01ea!\3\2\2\2\u01eb\u01ed\7 \2\2\u01ec\u01ee\7\"\2\2\u01ed"+
		"\u01ec\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef\u01ed\3\2\2\2\u01ef\u01f0\3\2"+
		"\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01f2\5\20\t\2\u01f2\u01f6\7\22\2\2\u01f3"+
		"\u01f5\7\"\2\2\u01f4\u01f3\3\2\2\2\u01f5\u01f8\3\2\2\2\u01f6\u01f4\3\2"+
		"\2\2\u01f6\u01f7\3\2\2\2\u01f7\u01f9\3\2\2\2\u01f8\u01f6\3\2\2\2\u01f9"+
		"\u01fd\5&\24\2\u01fa\u01fc\7\"\2\2\u01fb\u01fa\3\2\2\2\u01fc\u01ff\3\2"+
		"\2\2\u01fd\u01fb\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe\u0200\3\2\2\2\u01ff"+
		"\u01fd\3\2\2\2\u0200\u0201\7\23\2\2\u0201\u0202\7\"\2\2\u0202\u0204\7"+
		"\16\2\2\u0203\u0205\7\"\2\2\u0204\u0203\3\2\2\2\u0205\u0206\3\2\2\2\u0206"+
		"\u0204\3\2\2\2\u0206\u0207\3\2\2\2\u0207\u0208\3\2\2\2\u0208\u020a\5$"+
		"\23\2\u0209\u020b\7\"\2\2\u020a\u0209\3\2\2\2\u020b\u020c\3\2\2\2\u020c"+
		"\u020a\3\2\2\2\u020c\u020d\3\2\2\2\u020d\u020e\3\2\2\2\u020e\u0212\7!"+
		"\2\2\u020f\u0211\7\"\2\2\u0210\u020f\3\2\2\2\u0211\u0214\3\2\2\2\u0212"+
		"\u0210\3\2\2\2\u0212\u0213\3\2\2\2\u0213\u0215\3\2\2\2\u0214\u0212\3\2"+
		"\2\2\u0215\u0216\7\r\2\2\u0216\u0239\3\2\2\2\u0217\u0219\7 \2\2\u0218"+
		"\u021a\7\"\2\2\u0219\u0218\3\2\2\2\u021a\u021b\3\2\2\2\u021b\u0219\3\2"+
		"\2\2\u021b\u021c\3\2\2\2\u021c\u021d\3\2\2\2\u021d\u021f\5\20\t\2\u021e"+
		"\u0220\7\"\2\2\u021f\u021e\3\2\2\2\u0220\u0221\3\2\2\2\u0221\u021f\3\2"+
		"\2\2\u0221\u0222\3\2\2\2\u0222\u0223\3\2\2\2\u0223\u0225\7\16\2\2\u0224"+
		"\u0226\7\"\2\2\u0225\u0224\3\2\2\2\u0226\u0227\3\2\2\2\u0227\u0225\3\2"+
		"\2\2\u0227\u0228\3\2\2\2\u0228\u0229\3\2\2\2\u0229\u022b\5$\23\2\u022a"+
		"\u022c\7\"\2\2\u022b\u022a\3\2\2\2\u022c\u022d\3\2\2\2\u022d\u022b\3\2"+
		"\2\2\u022d\u022e\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u0233\7!\2\2\u0230"+
		"\u0232\7\"\2\2\u0231\u0230\3\2\2\2\u0232\u0235\3\2\2\2\u0233\u0231\3\2"+
		"\2\2\u0233\u0234\3\2\2\2\u0234\u0236\3\2\2\2\u0235\u0233\3\2\2\2\u0236"+
		"\u0237\7\r\2\2\u0237\u0239\3\2\2\2\u0238\u01eb\3\2\2\2\u0238\u0217\3\2"+
		"\2\2\u0239#\3\2\2\2\u023a\u023e\5\2\2\2\u023b\u023d\7\"\2\2\u023c\u023b"+
		"\3\2\2\2\u023d\u0240\3\2\2\2\u023e\u023c\3\2\2\2\u023e\u023f\3\2\2\2\u023f"+
		"\u0255\3\2\2\2\u0240\u023e\3\2\2\2\u0241\u0243\5\2\2\2\u0242\u0244\7\""+
		"\2\2\u0243\u0242\3\2\2\2\u0244\u0245\3\2\2\2\u0245\u0243\3\2\2\2\u0245"+
		"\u0246\3\2\2\2\u0246\u0247\3\2\2\2\u0247\u0249\5\36\20\2\u0248\u024a\7"+
		"\"\2\2\u0249\u0248\3\2\2\2\u024a\u024b\3\2\2\2\u024b\u0249\3\2\2\2\u024b"+
		"\u024c\3\2\2\2\u024c\u024d\3\2\2\2\u024d\u0251\5\2\2\2\u024e\u0250\7\""+
		"\2\2\u024f\u024e\3\2\2\2\u0250\u0253\3\2\2\2\u0251\u024f\3\2\2\2\u0251"+
		"\u0252\3\2\2\2\u0252\u0255\3\2\2\2\u0253\u0251\3\2\2\2\u0254\u023a\3\2"+
		"\2\2\u0254\u0241\3\2\2\2\u0255%\3\2\2\2\u0256\u025a\5\26\f\2\u0257\u0259"+
		"\7\"\2\2\u0258\u0257\3\2\2\2\u0259\u025c\3\2\2\2\u025a\u0258\3\2\2\2\u025a"+
		"\u025b\3\2\2\2\u025b\u026e\3\2\2\2\u025c\u025a\3\2\2\2\u025d\u0261\5\26"+
		"\f\2\u025e\u0260\7\"\2\2\u025f\u025e\3\2\2\2\u0260\u0263\3\2\2\2\u0261"+
		"\u025f\3\2\2\2\u0261\u0262\3\2\2\2\u0262\u0264\3\2\2\2\u0263\u0261\3\2"+
		"\2\2\u0264\u0268\7\17\2\2\u0265\u0267\7\"\2\2\u0266\u0265\3\2\2\2\u0267"+
		"\u026a\3\2\2\2\u0268\u0266\3\2\2\2\u0268\u0269\3\2\2\2\u0269\u026b\3\2"+
		"\2\2\u026a\u0268\3\2\2\2\u026b\u026c\5&\24\2\u026c\u026e\3\2\2\2\u026d"+
		"\u0256\3\2\2\2\u026d\u025d\3\2\2\2\u026e\'\3\2\2\2\u026f\u0271\7\"\2\2"+
		"\u0270\u026f\3\2\2\2\u0271\u0272\3\2\2\2\u0272\u0270\3\2\2\2\u0272\u0273"+
		"\3\2\2\2\u0273)\3\2\2\2Z+/\63;@HLPSY]dhmv\u0084\u008e\u009c\u00a0\u00a4"+
		"\u00a8\u00bb\u00bf\u00c4\u00ca\u00d1\u00d8\u00df\u00e5\u00eb\u00f1\u00fa"+
		"\u0101\u010a\u0111\u011a\u0121\u012a\u0131\u013a\u0141\u014a\u0151\u0156"+
		"\u015c\u0162\u0168\u0171\u0177\u017e\u0185\u018c\u0193\u019a\u01a0\u01a6"+
		"\u01af\u01b5\u01bc\u01c3\u01ca\u01d1\u01d8\u01de\u01e4\u01e9\u01ef\u01f6"+
		"\u01fd\u0206\u020c\u0212\u021b\u0221\u0227\u022d\u0233\u0238\u023e\u0245"+
		"\u024b\u0251\u0254\u025a\u0261\u0268\u026d\u0272";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}