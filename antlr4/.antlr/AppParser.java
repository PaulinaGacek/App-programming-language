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
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, WS=38, LOWERCASELETTER=39, 
		UPPERCASELETTER=40, NONZERODIGIT=41, ZERO=42;
	public static final int
		RULE_primaryExpression = 0, RULE_instruction = 1, RULE_variableType = 2, 
		RULE_variableName = 3, RULE_functionName = 4, RULE_integer = 5, RULE_force_type = 6, 
		RULE_object_type = 7, RULE_applyForce = 8, RULE_arithmeticalExpression = 9, 
		RULE_declaration = 10, RULE_definition = 11, RULE_conditionalStatement = 12, 
		RULE_condition = 13, RULE_parallelExpression = 14, RULE_loop = 15, RULE_function = 16, 
		RULE_functionBody = 17, RULE_functionArgs = 18, RULE_whiteSpace = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"primaryExpression", "instruction", "variableType", "variableName", "functionName", 
			"integer", "force_type", "object_type", "applyForce", "arithmeticalExpression", 
			"declaration", "definition", "conditionalStatement", "condition", "parallelExpression", 
			"loop", "function", "functionBody", "functionArgs", "whiteSpace"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'TIME'", "'INT'", "'FORCE'", "'OBJECT'", "'_'", "'['", "','", 
			"']'", "'('", "')'", "'APPLY'", "'TO'", "'FOR'", "'DELAY'", "';'", "'+'", 
			"'-'", "'/'", "'*'", "'DEFINE'", "'AS'", "'SET'", "'IF'", "'THEN'", "'ENDIF'", 
			"'=='", "'>'", "'<'", "'>='", "'<='", "'!='", "'PARALLEL'", "'ENDPARALLEL'", 
			"'LOOP'", "'ENDLOOP'", "'DEFINE FUNCTION'", "'ENDFUNCTION'", null, null, 
			null, null, "'0'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "WS", "LOWERCASELETTER", "UPPERCASELETTER", "NONZERODIGIT", 
			"ZERO"
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
			setState(47); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
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
				setState(49); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__31) | (1L << T__33) | (1L << T__35) | (1L << WS))) != 0) );
			}
		}
		catch (RecognitionException re) {
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
			setState(58);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__19:
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				declaration();
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				definition();
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 3);
				{
				setState(53);
				conditionalStatement();
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 4);
				{
				setState(54);
				parallelExpression();
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 5);
				{
				setState(55);
				loop();
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 6);
				{
				setState(56);
				function();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 7);
				{
				setState(57);
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

	public static class VariableTypeContext extends ParserRuleContext {
		public VariableTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableType; }
	}

	public final VariableTypeContext variableType() throws RecognitionException {
		VariableTypeContext _localctx = new VariableTypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_variableType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3))) != 0)) ) {
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
		enterRule(_localctx, 6, RULE_variableName);
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
		enterRule(_localctx, 8, RULE_functionName);
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
		enterRule(_localctx, 10, RULE_integer);
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

	public static class Force_typeContext extends ParserRuleContext {
		public IntegerContext angle;
		public IntegerContext power;
		public List<IntegerContext> integer() {
			return getRuleContexts(IntegerContext.class);
		}
		public IntegerContext integer(int i) {
			return getRuleContext(IntegerContext.class,i);
		}
		public Force_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_force_type; }
	}

	public final Force_typeContext force_type() throws RecognitionException {
		Force_typeContext _localctx = new Force_typeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_force_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(T__5);
			setState(87);
			((Force_typeContext)_localctx).angle = integer();
			setState(88);
			match(T__6);
			setState(89);
			((Force_typeContext)_localctx).power = integer();
			setState(90);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Object_typeContext extends ParserRuleContext {
		public IntegerContext x_cor;
		public IntegerContext y_cor;
		public List<IntegerContext> integer() {
			return getRuleContexts(IntegerContext.class);
		}
		public IntegerContext integer(int i) {
			return getRuleContext(IntegerContext.class,i);
		}
		public Object_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object_type; }
	}

	public final Object_typeContext object_type() throws RecognitionException {
		Object_typeContext _localctx = new Object_typeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_object_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(T__8);
			setState(93);
			((Object_typeContext)_localctx).x_cor = integer();
			setState(94);
			match(T__6);
			setState(95);
			((Object_typeContext)_localctx).y_cor = integer();
			setState(96);
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

	public static class ApplyForceContext extends ParserRuleContext {
		public VariableNameContext force_;
		public Force_typeContext force_val;
		public VariableNameContext object_;
		public VariableNameContext time_;
		public IntegerContext time_val;
		public VariableNameContext delay_;
		public IntegerContext delay_val_;
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
		public Force_typeContext force_type() {
			return getRuleContext(Force_typeContext.class,0);
		}
		public List<IntegerContext> integer() {
			return getRuleContexts(IntegerContext.class);
		}
		public IntegerContext integer(int i) {
			return getRuleContext(IntegerContext.class,i);
		}
		public ApplyForceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_applyForce; }
	}

	public final ApplyForceContext applyForce() throws RecognitionException {
		ApplyForceContext _localctx = new ApplyForceContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_applyForce);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(T__10);
			setState(99);
			whiteSpace();
			setState(102);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOWERCASELETTER:
				{
				setState(100);
				((ApplyForceContext)_localctx).force_ = variableName();
				}
				break;
			case T__5:
				{
				setState(101);
				((ApplyForceContext)_localctx).force_val = force_type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(104);
			whiteSpace();
			setState(105);
			match(T__11);
			setState(106);
			whiteSpace();
			setState(107);
			((ApplyForceContext)_localctx).object_ = variableName();
			setState(108);
			whiteSpace();
			setState(109);
			match(T__12);
			setState(110);
			whiteSpace();
			setState(113);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOWERCASELETTER:
				{
				setState(111);
				((ApplyForceContext)_localctx).time_ = variableName();
				}
				break;
			case NONZERODIGIT:
			case ZERO:
				{
				setState(112);
				((ApplyForceContext)_localctx).time_val = integer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(115);
				whiteSpace();
				setState(116);
				match(T__13);
				setState(117);
				whiteSpace();
				setState(120);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LOWERCASELETTER:
					{
					setState(118);
					((ApplyForceContext)_localctx).delay_ = variableName();
					}
					break;
				case NONZERODIGIT:
				case ZERO:
					{
					setState(119);
					((ApplyForceContext)_localctx).delay_val_ = integer();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(124);
				whiteSpace();
				}
			}

			setState(127);
			match(T__14);
			}
		}
		catch (RecognitionException re) {
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
		public Force_typeContext force_type() {
			return getRuleContext(Force_typeContext.class,0);
		}
		public Object_typeContext object_type() {
			return getRuleContext(Object_typeContext.class,0);
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
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_arithmeticalExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NONZERODIGIT:
			case ZERO:
				{
				setState(130);
				integer();
				}
				break;
			case T__5:
				{
				setState(131);
				force_type();
				}
				break;
			case T__8:
				{
				setState(132);
				object_type();
				}
				break;
			case LOWERCASELETTER:
				{
				setState(133);
				variableName();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(147);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
					setState(136);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
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
					((ArithmeticalExpressionContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18))) != 0)) ) {
						((ArithmeticalExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(142);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(141);
						whiteSpace();
						}
					}

					setState(144);
					((ArithmeticalExpressionContext)_localctx).right = arithmeticalExpression(6);
					}
					} 
				}
				setState(149);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
		public VariableTypeContext type_sim;
		public VariableNameContext name_;
		public ArithmeticalExpressionContext value_;
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public VariableTypeContext variableType() {
			return getRuleContext(VariableTypeContext.class,0);
		}
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public ArithmeticalExpressionContext arithmeticalExpression() {
			return getRuleContext(ArithmeticalExpressionContext.class,0);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(T__19);
			setState(151);
			whiteSpace();
			setState(152);
			((DeclarationContext)_localctx).type_sim = variableType();
			setState(153);
			whiteSpace();
			setState(154);
			((DeclarationContext)_localctx).name_ = variableName();
			setState(155);
			whiteSpace();
			setState(156);
			match(T__20);
			setState(157);
			whiteSpace();
			setState(158);
			((DeclarationContext)_localctx).value_ = arithmeticalExpression(0);
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
			match(T__14);
			}
		}
		catch (RecognitionException re) {
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
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public ArithmeticalExpressionContext arithmeticalExpression() {
			return getRuleContext(ArithmeticalExpressionContext.class,0);
		}
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(T__21);
			setState(165);
			whiteSpace();
			setState(166);
			((DefinitionContext)_localctx).name_ = variableName();
			setState(167);
			whiteSpace();
			setState(168);
			match(T__20);
			setState(169);
			whiteSpace();
			setState(170);
			((DefinitionContext)_localctx).value_ = arithmeticalExpression(0);
			setState(171);
			match(T__14);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 24, RULE_conditionalStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(T__22);
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(174);
				whiteSpace();
				}
			}

			setState(177);
			match(T__8);
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(178);
				whiteSpace();
				}
			}

			setState(181);
			condition();
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
			match(T__9);
			setState(186);
			whiteSpace();
			setState(187);
			match(T__23);
			setState(188);
			whiteSpace();
			setState(190); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(189);
				instruction();
				}
				}
				setState(192); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__31) | (1L << T__33) | (1L << T__35))) != 0) );
			setState(194);
			whiteSpace();
			setState(195);
			match(T__24);
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(196);
				whiteSpace();
				}
			}

			setState(199);
			match(T__14);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 26, RULE_condition);
		int _la;
		try {
			setState(261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(201);
				variableName();
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(202);
					whiteSpace();
					}
				}

				setState(205);
				match(T__25);
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(206);
					whiteSpace();
					}
				}

				setState(209);
				arithmeticalExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				variableName();
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(212);
					whiteSpace();
					}
				}

				setState(215);
				match(T__26);
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(216);
					whiteSpace();
					}
				}

				setState(219);
				arithmeticalExpression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(221);
				variableName();
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(222);
					whiteSpace();
					}
				}

				setState(225);
				match(T__27);
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(226);
					whiteSpace();
					}
				}

				setState(229);
				arithmeticalExpression(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(231);
				variableName();
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(232);
					whiteSpace();
					}
				}

				setState(235);
				match(T__28);
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(236);
					whiteSpace();
					}
				}

				setState(239);
				arithmeticalExpression(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(241);
				variableName();
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(242);
					whiteSpace();
					}
				}

				setState(245);
				match(T__29);
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(246);
					whiteSpace();
					}
				}

				setState(249);
				arithmeticalExpression(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(251);
				variableName();
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(252);
					whiteSpace();
					}
				}

				setState(255);
				match(T__30);
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(256);
					whiteSpace();
					}
				}

				setState(259);
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
		enterRule(_localctx, 28, RULE_parallelExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(T__31);
			setState(264);
			whiteSpace();
			setState(267); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(267);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__10:
					{
					setState(265);
					((ParallelExpressionContext)_localctx).app_force_ = applyForce();
					}
					break;
				case T__31:
					{
					setState(266);
					((ParallelExpressionContext)_localctx).parallel_ = parallelExpression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(269); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__10 || _la==T__31 );
			setState(271);
			whiteSpace();
			setState(272);
			match(T__32);
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
			match(T__14);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 30, RULE_loop);
		int _la;
		try {
			setState(350);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(278);
				match(T__33);
				setState(279);
				whiteSpace();
				setState(280);
				match(T__8);
				setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(281);
					whiteSpace();
					}
				}

				setState(284);
				declaration();
				setState(286);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(285);
					whiteSpace();
					}
				}

				setState(288);
				condition();
				setState(290);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(289);
					whiteSpace();
					}
				}

				setState(292);
				match(T__14);
				setState(294);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(293);
					whiteSpace();
					}
				}

				setState(296);
				definition();
				setState(298);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(297);
					whiteSpace();
					}
				}

				setState(300);
				match(T__9);
				setState(301);
				whiteSpace();
				setState(303); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(302);
					instruction();
					}
					}
					setState(305); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__31) | (1L << T__33) | (1L << T__35))) != 0) );
				setState(307);
				whiteSpace();
				setState(308);
				match(T__34);
				setState(310);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(309);
					whiteSpace();
					}
				}

				setState(312);
				match(T__14);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(314);
				match(T__33);
				setState(315);
				whiteSpace();
				setState(316);
				match(T__8);
				setState(318);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(317);
					whiteSpace();
					}
				}

				setState(320);
				match(T__14);
				setState(322);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(321);
					whiteSpace();
					}
				}

				setState(324);
				condition();
				setState(326);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(325);
					whiteSpace();
					}
				}

				setState(328);
				match(T__14);
				setState(330);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(329);
					whiteSpace();
					}
				}

				setState(332);
				definition();
				setState(334);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(333);
					whiteSpace();
					}
				}

				setState(336);
				match(T__9);
				setState(337);
				whiteSpace();
				setState(339); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(338);
					instruction();
					}
					}
					setState(341); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__31) | (1L << T__33) | (1L << T__35))) != 0) );
				setState(343);
				whiteSpace();
				setState(344);
				match(T__34);
				setState(346);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(345);
					whiteSpace();
					}
				}

				setState(348);
				match(T__14);
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
		enterRule(_localctx, 32, RULE_function);
		int _la;
		try {
			setState(389);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(352);
				match(T__35);
				setState(353);
				whiteSpace();
				setState(354);
				functionName();
				setState(355);
				match(T__8);
				setState(357);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(356);
					whiteSpace();
					}
				}

				setState(359);
				functionArgs();
				setState(361);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(360);
					whiteSpace();
					}
				}

				setState(363);
				match(T__9);
				setState(364);
				whiteSpace();
				setState(365);
				match(T__20);
				setState(366);
				whiteSpace();
				setState(367);
				functionBody();
				setState(368);
				whiteSpace();
				setState(369);
				match(T__36);
				setState(371);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(370);
					whiteSpace();
					}
				}

				setState(373);
				match(T__14);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(375);
				match(T__35);
				setState(376);
				whiteSpace();
				setState(377);
				functionName();
				setState(378);
				whiteSpace();
				setState(379);
				match(T__20);
				setState(380);
				whiteSpace();
				setState(381);
				functionBody();
				setState(382);
				whiteSpace();
				setState(383);
				match(T__36);
				setState(385);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(384);
					whiteSpace();
					}
				}

				setState(387);
				match(T__14);
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
		enterRule(_localctx, 34, RULE_functionBody);
		int _la;
		try {
			setState(415);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(392); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(391);
					instruction();
					}
					}
					setState(394); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__31) | (1L << T__33) | (1L << T__35))) != 0) );
				setState(397);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
				case 1:
					{
					setState(396);
					whiteSpace();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(400); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(399);
					instruction();
					}
					}
					setState(402); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__31) | (1L << T__33) | (1L << T__35))) != 0) );
				setState(404);
				whiteSpace();
				setState(405);
				parallelExpression();
				setState(406);
				whiteSpace();
				setState(408); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(407);
					instruction();
					}
					}
					setState(410); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__31) | (1L << T__33) | (1L << T__35))) != 0) );
				setState(413);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
				case 1:
					{
					setState(412);
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
		enterRule(_localctx, 36, RULE_functionArgs);
		int _la;
		try {
			setState(431);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(417);
				declaration();
				setState(419);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
				case 1:
					{
					setState(418);
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
				declaration();
				setState(423);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(422);
					whiteSpace();
					}
				}

				setState(425);
				match(T__6);
				setState(427);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(426);
					whiteSpace();
					}
				}

				setState(429);
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
			setState(434); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(433);
					match(WS);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(436); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
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
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,\u01b9\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\5\2,\n\2\3\2\3\2\5\2\60\n\2\6\2\62"+
		"\n\2\r\2\16\2\63\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3=\n\3\3\4\3\4\3\5\3\5"+
		"\7\5C\n\5\f\5\16\5F\13\5\3\6\3\6\7\6J\n\6\f\6\16\6M\13\6\3\7\3\7\7\7Q"+
		"\n\7\f\7\16\7T\13\7\3\7\5\7W\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\5\ni\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\5\nt\n\n\3\n\3\n\3\n\3\n\3\n\5\n{\n\n\5\n}\n\n\3\n\5\n\u0080\n\n\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\3\13\5\13\u0089\n\13\3\13\3\13\5\13\u008d\n"+
		"\13\3\13\3\13\5\13\u0091\n\13\3\13\7\13\u0094\n\13\f\13\16\13\u0097\13"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00a3\n\f\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\5\16\u00b2\n\16\3\16\3\16\5"+
		"\16\u00b6\n\16\3\16\3\16\5\16\u00ba\n\16\3\16\3\16\3\16\3\16\3\16\6\16"+
		"\u00c1\n\16\r\16\16\16\u00c2\3\16\3\16\3\16\5\16\u00c8\n\16\3\16\3\16"+
		"\3\17\3\17\5\17\u00ce\n\17\3\17\3\17\5\17\u00d2\n\17\3\17\3\17\3\17\3"+
		"\17\5\17\u00d8\n\17\3\17\3\17\5\17\u00dc\n\17\3\17\3\17\3\17\3\17\5\17"+
		"\u00e2\n\17\3\17\3\17\5\17\u00e6\n\17\3\17\3\17\3\17\3\17\5\17\u00ec\n"+
		"\17\3\17\3\17\5\17\u00f0\n\17\3\17\3\17\3\17\3\17\5\17\u00f6\n\17\3\17"+
		"\3\17\5\17\u00fa\n\17\3\17\3\17\3\17\3\17\5\17\u0100\n\17\3\17\3\17\5"+
		"\17\u0104\n\17\3\17\3\17\5\17\u0108\n\17\3\20\3\20\3\20\3\20\6\20\u010e"+
		"\n\20\r\20\16\20\u010f\3\20\3\20\3\20\5\20\u0115\n\20\3\20\3\20\3\21\3"+
		"\21\3\21\3\21\5\21\u011d\n\21\3\21\3\21\5\21\u0121\n\21\3\21\3\21\5\21"+
		"\u0125\n\21\3\21\3\21\5\21\u0129\n\21\3\21\3\21\5\21\u012d\n\21\3\21\3"+
		"\21\3\21\6\21\u0132\n\21\r\21\16\21\u0133\3\21\3\21\3\21\5\21\u0139\n"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0141\n\21\3\21\3\21\5\21\u0145"+
		"\n\21\3\21\3\21\5\21\u0149\n\21\3\21\3\21\5\21\u014d\n\21\3\21\3\21\5"+
		"\21\u0151\n\21\3\21\3\21\3\21\6\21\u0156\n\21\r\21\16\21\u0157\3\21\3"+
		"\21\3\21\5\21\u015d\n\21\3\21\3\21\5\21\u0161\n\21\3\22\3\22\3\22\3\22"+
		"\3\22\5\22\u0168\n\22\3\22\3\22\5\22\u016c\n\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\5\22\u0176\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\5\22\u0184\n\22\3\22\3\22\5\22\u0188\n\22\3"+
		"\23\6\23\u018b\n\23\r\23\16\23\u018c\3\23\5\23\u0190\n\23\3\23\6\23\u0193"+
		"\n\23\r\23\16\23\u0194\3\23\3\23\3\23\3\23\6\23\u019b\n\23\r\23\16\23"+
		"\u019c\3\23\5\23\u01a0\n\23\5\23\u01a2\n\23\3\24\3\24\5\24\u01a6\n\24"+
		"\3\24\3\24\5\24\u01aa\n\24\3\24\3\24\5\24\u01ae\n\24\3\24\3\24\5\24\u01b2"+
		"\n\24\3\25\6\25\u01b5\n\25\r\25\16\25\u01b6\3\25\2\3\24\26\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(\2\6\3\2\3\6\4\2\7\7),\3\2+,\3\2\22\25"+
		"\2\u01f5\2\61\3\2\2\2\4<\3\2\2\2\6>\3\2\2\2\b@\3\2\2\2\nG\3\2\2\2\fV\3"+
		"\2\2\2\16X\3\2\2\2\20^\3\2\2\2\22d\3\2\2\2\24\u0088\3\2\2\2\26\u0098\3"+
		"\2\2\2\30\u00a6\3\2\2\2\32\u00af\3\2\2\2\34\u0107\3\2\2\2\36\u0109\3\2"+
		"\2\2 \u0160\3\2\2\2\"\u0187\3\2\2\2$\u01a1\3\2\2\2&\u01b1\3\2\2\2(\u01b4"+
		"\3\2\2\2*,\5(\25\2+*\3\2\2\2+,\3\2\2\2,-\3\2\2\2-/\5\4\3\2.\60\5(\25\2"+
		"/.\3\2\2\2/\60\3\2\2\2\60\62\3\2\2\2\61+\3\2\2\2\62\63\3\2\2\2\63\61\3"+
		"\2\2\2\63\64\3\2\2\2\64\3\3\2\2\2\65=\5\26\f\2\66=\5\30\r\2\67=\5\32\16"+
		"\28=\5\36\20\29=\5 \21\2:=\5\"\22\2;=\5\22\n\2<\65\3\2\2\2<\66\3\2\2\2"+
		"<\67\3\2\2\2<8\3\2\2\2<9\3\2\2\2<:\3\2\2\2<;\3\2\2\2=\5\3\2\2\2>?\t\2"+
		"\2\2?\7\3\2\2\2@D\7)\2\2AC\t\3\2\2BA\3\2\2\2CF\3\2\2\2DB\3\2\2\2DE\3\2"+
		"\2\2E\t\3\2\2\2FD\3\2\2\2GK\7)\2\2HJ\t\3\2\2IH\3\2\2\2JM\3\2\2\2KI\3\2"+
		"\2\2KL\3\2\2\2L\13\3\2\2\2MK\3\2\2\2NR\7+\2\2OQ\t\4\2\2PO\3\2\2\2QT\3"+
		"\2\2\2RP\3\2\2\2RS\3\2\2\2SW\3\2\2\2TR\3\2\2\2UW\7,\2\2VN\3\2\2\2VU\3"+
		"\2\2\2W\r\3\2\2\2XY\7\b\2\2YZ\5\f\7\2Z[\7\t\2\2[\\\5\f\7\2\\]\7\n\2\2"+
		"]\17\3\2\2\2^_\7\13\2\2_`\5\f\7\2`a\7\t\2\2ab\5\f\7\2bc\7\f\2\2c\21\3"+
		"\2\2\2de\7\r\2\2eh\5(\25\2fi\5\b\5\2gi\5\16\b\2hf\3\2\2\2hg\3\2\2\2ij"+
		"\3\2\2\2jk\5(\25\2kl\7\16\2\2lm\5(\25\2mn\5\b\5\2no\5(\25\2op\7\17\2\2"+
		"ps\5(\25\2qt\5\b\5\2rt\5\f\7\2sq\3\2\2\2sr\3\2\2\2t|\3\2\2\2uv\5(\25\2"+
		"vw\7\20\2\2wz\5(\25\2x{\5\b\5\2y{\5\f\7\2zx\3\2\2\2zy\3\2\2\2{}\3\2\2"+
		"\2|u\3\2\2\2|}\3\2\2\2}\177\3\2\2\2~\u0080\5(\25\2\177~\3\2\2\2\177\u0080"+
		"\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\7\21\2\2\u0082\23\3\2\2\2\u0083"+
		"\u0084\b\13\1\2\u0084\u0089\5\f\7\2\u0085\u0089\5\16\b\2\u0086\u0089\5"+
		"\20\t\2\u0087\u0089\5\b\5\2\u0088\u0083\3\2\2\2\u0088\u0085\3\2\2\2\u0088"+
		"\u0086\3\2\2\2\u0088\u0087\3\2\2\2\u0089\u0095\3\2\2\2\u008a\u008c\f\7"+
		"\2\2\u008b\u008d\5(\25\2\u008c\u008b\3\2\2\2\u008c\u008d\3\2\2\2\u008d"+
		"\u008e\3\2\2\2\u008e\u0090\t\5\2\2\u008f\u0091\5(\25\2\u0090\u008f\3\2"+
		"\2\2\u0090\u0091\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0094\5\24\13\b\u0093"+
		"\u008a\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2"+
		"\2\2\u0096\25\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u0099\7\26\2\2\u0099\u009a"+
		"\5(\25\2\u009a\u009b\5\6\4\2\u009b\u009c\5(\25\2\u009c\u009d\5\b\5\2\u009d"+
		"\u009e\5(\25\2\u009e\u009f\7\27\2\2\u009f\u00a0\5(\25\2\u00a0\u00a2\5"+
		"\24\13\2\u00a1\u00a3\5(\25\2\u00a2\u00a1\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3"+
		"\u00a4\3\2\2\2\u00a4\u00a5\7\21\2\2\u00a5\27\3\2\2\2\u00a6\u00a7\7\30"+
		"\2\2\u00a7\u00a8\5(\25\2\u00a8\u00a9\5\b\5\2\u00a9\u00aa\5(\25\2\u00aa"+
		"\u00ab\7\27\2\2\u00ab\u00ac\5(\25\2\u00ac\u00ad\5\24\13\2\u00ad\u00ae"+
		"\7\21\2\2\u00ae\31\3\2\2\2\u00af\u00b1\7\31\2\2\u00b0\u00b2\5(\25\2\u00b1"+
		"\u00b0\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b5\7\13"+
		"\2\2\u00b4\u00b6\5(\25\2\u00b5\u00b4\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6"+
		"\u00b7\3\2\2\2\u00b7\u00b9\5\34\17\2\u00b8\u00ba\5(\25\2\u00b9\u00b8\3"+
		"\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\7\f\2\2\u00bc"+
		"\u00bd\5(\25\2\u00bd\u00be\7\32\2\2\u00be\u00c0\5(\25\2\u00bf\u00c1\5"+
		"\4\3\2\u00c0\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2"+
		"\u00c3\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\5(\25\2\u00c5\u00c7\7\33"+
		"\2\2\u00c6\u00c8\5(\25\2\u00c7\u00c6\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8"+
		"\u00c9\3\2\2\2\u00c9\u00ca\7\21\2\2\u00ca\33\3\2\2\2\u00cb\u00cd\5\b\5"+
		"\2\u00cc\u00ce\5(\25\2\u00cd\u00cc\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf"+
		"\3\2\2\2\u00cf\u00d1\7\34\2\2\u00d0\u00d2\5(\25\2\u00d1\u00d0\3\2\2\2"+
		"\u00d1\u00d2\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\5\24\13\2\u00d4\u0108"+
		"\3\2\2\2\u00d5\u00d7\5\b\5\2\u00d6\u00d8\5(\25\2\u00d7\u00d6\3\2\2\2\u00d7"+
		"\u00d8\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00db\7\35\2\2\u00da\u00dc\5"+
		"(\25\2\u00db\u00da\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd"+
		"\u00de\5\24\13\2\u00de\u0108\3\2\2\2\u00df\u00e1\5\b\5\2\u00e0\u00e2\5"+
		"(\25\2\u00e1\u00e0\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3"+
		"\u00e5\7\36\2\2\u00e4\u00e6\5(\25\2\u00e5\u00e4\3\2\2\2\u00e5\u00e6\3"+
		"\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e8\5\24\13\2\u00e8\u0108\3\2\2\2\u00e9"+
		"\u00eb\5\b\5\2\u00ea\u00ec\5(\25\2\u00eb\u00ea\3\2\2\2\u00eb\u00ec\3\2"+
		"\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ef\7\37\2\2\u00ee\u00f0\5(\25\2\u00ef"+
		"\u00ee\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f2\5\24"+
		"\13\2\u00f2\u0108\3\2\2\2\u00f3\u00f5\5\b\5\2\u00f4\u00f6\5(\25\2\u00f5"+
		"\u00f4\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f9\7 "+
		"\2\2\u00f8\u00fa\5(\25\2\u00f9\u00f8\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa"+
		"\u00fb\3\2\2\2\u00fb\u00fc\5\24\13\2\u00fc\u0108\3\2\2\2\u00fd\u00ff\5"+
		"\b\5\2\u00fe\u0100\5(\25\2\u00ff\u00fe\3\2\2\2\u00ff\u0100\3\2\2\2\u0100"+
		"\u0101\3\2\2\2\u0101\u0103\7!\2\2\u0102\u0104\5(\25\2\u0103\u0102\3\2"+
		"\2\2\u0103\u0104\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0106\5\24\13\2\u0106"+
		"\u0108\3\2\2\2\u0107\u00cb\3\2\2\2\u0107\u00d5\3\2\2\2\u0107\u00df\3\2"+
		"\2\2\u0107\u00e9\3\2\2\2\u0107\u00f3\3\2\2\2\u0107\u00fd\3\2\2\2\u0108"+
		"\35\3\2\2\2\u0109\u010a\7\"\2\2\u010a\u010d\5(\25\2\u010b\u010e\5\22\n"+
		"\2\u010c\u010e\5\36\20\2\u010d\u010b\3\2\2\2\u010d\u010c\3\2\2\2\u010e"+
		"\u010f\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0111\3\2"+
		"\2\2\u0111\u0112\5(\25\2\u0112\u0114\7#\2\2\u0113\u0115\5(\25\2\u0114"+
		"\u0113\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0117\7\21"+
		"\2\2\u0117\37\3\2\2\2\u0118\u0119\7$\2\2\u0119\u011a\5(\25\2\u011a\u011c"+
		"\7\13\2\2\u011b\u011d\5(\25\2\u011c\u011b\3\2\2\2\u011c\u011d\3\2\2\2"+
		"\u011d\u011e\3\2\2\2\u011e\u0120\5\26\f\2\u011f\u0121\5(\25\2\u0120\u011f"+
		"\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0124\5\34\17\2"+
		"\u0123\u0125\5(\25\2\u0124\u0123\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0126"+
		"\3\2\2\2\u0126\u0128\7\21\2\2\u0127\u0129\5(\25\2\u0128\u0127\3\2\2\2"+
		"\u0128\u0129\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012c\5\30\r\2\u012b\u012d"+
		"\5(\25\2\u012c\u012b\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012e\3\2\2\2\u012e"+
		"\u012f\7\f\2\2\u012f\u0131\5(\25\2\u0130\u0132\5\4\3\2\u0131\u0130\3\2"+
		"\2\2\u0132\u0133\3\2\2\2\u0133\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134"+
		"\u0135\3\2\2\2\u0135\u0136\5(\25\2\u0136\u0138\7%\2\2\u0137\u0139\5(\25"+
		"\2\u0138\u0137\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013b"+
		"\7\21\2\2\u013b\u0161\3\2\2\2\u013c\u013d\7$\2\2\u013d\u013e\5(\25\2\u013e"+
		"\u0140\7\13\2\2\u013f\u0141\5(\25\2\u0140\u013f\3\2\2\2\u0140\u0141\3"+
		"\2\2\2\u0141\u0142\3\2\2\2\u0142\u0144\7\21\2\2\u0143\u0145\5(\25\2\u0144"+
		"\u0143\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0148\5\34"+
		"\17\2\u0147\u0149\5(\25\2\u0148\u0147\3\2\2\2\u0148\u0149\3\2\2\2\u0149"+
		"\u014a\3\2\2\2\u014a\u014c\7\21\2\2\u014b\u014d\5(\25\2\u014c\u014b\3"+
		"\2\2\2\u014c\u014d\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u0150\5\30\r\2\u014f"+
		"\u0151\5(\25\2\u0150\u014f\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0152\3\2"+
		"\2\2\u0152\u0153\7\f\2\2\u0153\u0155\5(\25\2\u0154\u0156\5\4\3\2\u0155"+
		"\u0154\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0155\3\2\2\2\u0157\u0158\3\2"+
		"\2\2\u0158\u0159\3\2\2\2\u0159\u015a\5(\25\2\u015a\u015c\7%\2\2\u015b"+
		"\u015d\5(\25\2\u015c\u015b\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015e\3\2"+
		"\2\2\u015e\u015f\7\21\2\2\u015f\u0161\3\2\2\2\u0160\u0118\3\2\2\2\u0160"+
		"\u013c\3\2\2\2\u0161!\3\2\2\2\u0162\u0163\7&\2\2\u0163\u0164\5(\25\2\u0164"+
		"\u0165\5\n\6\2\u0165\u0167\7\13\2\2\u0166\u0168\5(\25\2\u0167\u0166\3"+
		"\2\2\2\u0167\u0168\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u016b\5&\24\2\u016a"+
		"\u016c\5(\25\2\u016b\u016a\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016d\3\2"+
		"\2\2\u016d\u016e\7\f\2\2\u016e\u016f\5(\25\2\u016f\u0170\7\27\2\2\u0170"+
		"\u0171\5(\25\2\u0171\u0172\5$\23\2\u0172\u0173\5(\25\2\u0173\u0175\7\'"+
		"\2\2\u0174\u0176\5(\25\2\u0175\u0174\3\2\2\2\u0175\u0176\3\2\2\2\u0176"+
		"\u0177\3\2\2\2\u0177\u0178\7\21\2\2\u0178\u0188\3\2\2\2\u0179\u017a\7"+
		"&\2\2\u017a\u017b\5(\25\2\u017b\u017c\5\n\6\2\u017c\u017d\5(\25\2\u017d"+
		"\u017e\7\27\2\2\u017e\u017f\5(\25\2\u017f\u0180\5$\23\2\u0180\u0181\5"+
		"(\25\2\u0181\u0183\7\'\2\2\u0182\u0184\5(\25\2\u0183\u0182\3\2\2\2\u0183"+
		"\u0184\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0186\7\21\2\2\u0186\u0188\3"+
		"\2\2\2\u0187\u0162\3\2\2\2\u0187\u0179\3\2\2\2\u0188#\3\2\2\2\u0189\u018b"+
		"\5\4\3\2\u018a\u0189\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018a\3\2\2\2\u018c"+
		"\u018d\3\2\2\2\u018d\u018f\3\2\2\2\u018e\u0190\5(\25\2\u018f\u018e\3\2"+
		"\2\2\u018f\u0190\3\2\2\2\u0190\u01a2\3\2\2\2\u0191\u0193\5\4\3\2\u0192"+
		"\u0191\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u0192\3\2\2\2\u0194\u0195\3\2"+
		"\2\2\u0195\u0196\3\2\2\2\u0196\u0197\5(\25\2\u0197\u0198\5\36\20\2\u0198"+
		"\u019a\5(\25\2\u0199\u019b\5\4\3\2\u019a\u0199\3\2\2\2\u019b\u019c\3\2"+
		"\2\2\u019c\u019a\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u019f\3\2\2\2\u019e"+
		"\u01a0\5(\25\2\u019f\u019e\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a2\3\2"+
		"\2\2\u01a1\u018a\3\2\2\2\u01a1\u0192\3\2\2\2\u01a2%\3\2\2\2\u01a3\u01a5"+
		"\5\26\f\2\u01a4\u01a6\5(\25\2\u01a5\u01a4\3\2\2\2\u01a5\u01a6\3\2\2\2"+
		"\u01a6\u01b2\3\2\2\2\u01a7\u01a9\5\26\f\2\u01a8\u01aa\5(\25\2\u01a9\u01a8"+
		"\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01ad\7\t\2\2\u01ac"+
		"\u01ae\5(\25\2\u01ad\u01ac\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01af\3\2"+
		"\2\2\u01af\u01b0\5&\24\2\u01b0\u01b2\3\2\2\2\u01b1\u01a3\3\2\2\2\u01b1"+
		"\u01a7\3\2\2\2\u01b2\'\3\2\2\2\u01b3\u01b5\7(\2\2\u01b4\u01b3\3\2\2\2"+
		"\u01b5\u01b6\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7)\3"+
		"\2\2\2H+/\63<DKRVhsz|\177\u0088\u008c\u0090\u0095\u00a2\u00b1\u00b5\u00b9"+
		"\u00c2\u00c7\u00cd\u00d1\u00d7\u00db\u00e1\u00e5\u00eb\u00ef\u00f5\u00f9"+
		"\u00ff\u0103\u0107\u010d\u010f\u0114\u011c\u0120\u0124\u0128\u012c\u0133"+
		"\u0138\u0140\u0144\u0148\u014c\u0150\u0157\u015c\u0160\u0167\u016b\u0175"+
		"\u0183\u0187\u018c\u018f\u0194\u019c\u019f\u01a1\u01a5\u01a9\u01ad\u01b1"+
		"\u01b6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}