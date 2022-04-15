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
		RULE_condition = 13, RULE_conditionBody = 14, RULE_parallelExpression = 15, 
		RULE_parallelBody = 16, RULE_loop = 17, RULE_loopBody = 18, RULE_functionCall = 19, 
		RULE_functionDeclaration = 20, RULE_functionBody = 21, RULE_functionArgs = 22, 
		RULE_whiteSpace = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"primaryExpression", "instruction", "variableType", "variableName", "functionName", 
			"integer", "force_type", "object_type", "applyForce", "arithmeticalExpression", 
			"declaration", "definition", "conditionalStatement", "condition", "conditionBody", 
			"parallelExpression", "parallelBody", "loop", "loopBody", "functionCall", 
			"functionDeclaration", "functionBody", "functionArgs", "whiteSpace"
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
		public List<FunctionDeclarationContext> functionDeclaration() {
			return getRuleContexts(FunctionDeclarationContext.class);
		}
		public FunctionDeclarationContext functionDeclaration(int i) {
			return getRuleContext(FunctionDeclarationContext.class,i);
		}
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
			setState(58); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(48);
					whiteSpace();
					}
				}

				setState(53);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__35:
					{
					setState(51);
					functionDeclaration();
					}
					break;
				case T__10:
				case T__19:
				case T__21:
				case T__22:
				case T__31:
				case T__33:
				case LOWERCASELETTER:
					{
					setState(52);
					instruction();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(56);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(55);
					whiteSpace();
					}
					break;
				}
				}
				}
				setState(60); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__31) | (1L << T__33) | (1L << T__35) | (1L << WS) | (1L << LOWERCASELETTER))) != 0) );
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
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
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
			setState(69);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__19:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				declaration();
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				definition();
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 3);
				{
				setState(64);
				conditionalStatement();
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 4);
				{
				setState(65);
				parallelExpression();
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 5);
				{
				setState(66);
				loop();
				}
				break;
			case LOWERCASELETTER:
				enterOuterAlt(_localctx, 6);
				{
				setState(67);
				functionCall();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 7);
				{
				setState(68);
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
			setState(71);
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
			setState(73);
			match(LOWERCASELETTER);
			setState(77);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(74);
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
				setState(79);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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
			setState(80);
			match(LOWERCASELETTER);
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << LOWERCASELETTER) | (1L << UPPERCASELETTER) | (1L << NONZERODIGIT) | (1L << ZERO))) != 0)) {
				{
				{
				setState(81);
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
				setState(86);
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
			setState(95);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NONZERODIGIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				match(NONZERODIGIT);
				setState(91);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(88);
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
					setState(93);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				}
				break;
			case ZERO:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
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
			setState(97);
			match(T__5);
			setState(98);
			((Force_typeContext)_localctx).angle = integer();
			setState(99);
			match(T__6);
			setState(100);
			((Force_typeContext)_localctx).power = integer();
			setState(101);
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
			setState(103);
			match(T__8);
			setState(104);
			((Object_typeContext)_localctx).x_cor = integer();
			setState(105);
			match(T__6);
			setState(106);
			((Object_typeContext)_localctx).y_cor = integer();
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
			setState(109);
			match(T__10);
			setState(110);
			whiteSpace();
			setState(113);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOWERCASELETTER:
				{
				setState(111);
				((ApplyForceContext)_localctx).force_ = variableName();
				}
				break;
			case T__5:
				{
				setState(112);
				((ApplyForceContext)_localctx).force_val = force_type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(115);
			whiteSpace();
			setState(116);
			match(T__11);
			setState(117);
			whiteSpace();
			setState(118);
			((ApplyForceContext)_localctx).object_ = variableName();
			setState(119);
			whiteSpace();
			setState(120);
			match(T__12);
			setState(121);
			whiteSpace();
			setState(124);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOWERCASELETTER:
				{
				setState(122);
				((ApplyForceContext)_localctx).time_ = variableName();
				}
				break;
			case NONZERODIGIT:
			case ZERO:
				{
				setState(123);
				((ApplyForceContext)_localctx).time_val = integer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(126);
				whiteSpace();
				setState(127);
				match(T__13);
				setState(128);
				whiteSpace();
				setState(131);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LOWERCASELETTER:
					{
					setState(129);
					((ApplyForceContext)_localctx).delay_ = variableName();
					}
					break;
				case NONZERODIGIT:
				case ZERO:
					{
					setState(130);
					((ApplyForceContext)_localctx).delay_val_ = integer();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(135);
				whiteSpace();
				}
			}

			setState(138);
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
			setState(145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NONZERODIGIT:
			case ZERO:
				{
				setState(141);
				integer();
				}
				break;
			case T__5:
				{
				setState(142);
				force_type();
				}
				break;
			case T__8:
				{
				setState(143);
				object_type();
				}
				break;
			case LOWERCASELETTER:
				{
				setState(144);
				variableName();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(158);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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
					setState(147);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(149);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(148);
						whiteSpace();
						}
					}

					setState(151);
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
					setState(153);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(152);
						whiteSpace();
						}
					}

					setState(155);
					((ArithmeticalExpressionContext)_localctx).right = arithmeticalExpression(6);
					}
					} 
				}
				setState(160);
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
			setState(161);
			match(T__19);
			setState(162);
			whiteSpace();
			setState(163);
			((DeclarationContext)_localctx).type_sim = variableType();
			setState(164);
			whiteSpace();
			setState(165);
			((DeclarationContext)_localctx).name_ = variableName();
			setState(166);
			whiteSpace();
			setState(167);
			match(T__20);
			setState(168);
			whiteSpace();
			setState(169);
			((DeclarationContext)_localctx).value_ = arithmeticalExpression(0);
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(170);
				whiteSpace();
				}
			}

			setState(173);
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
			setState(175);
			match(T__21);
			setState(176);
			whiteSpace();
			setState(177);
			((DefinitionContext)_localctx).name_ = variableName();
			setState(178);
			whiteSpace();
			setState(179);
			match(T__20);
			setState(180);
			whiteSpace();
			setState(181);
			((DefinitionContext)_localctx).value_ = arithmeticalExpression(0);
			setState(182);
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
		public ConditionContext cond;
		public ConditionBodyContext con_body;
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public ConditionBodyContext conditionBody() {
			return getRuleContext(ConditionBodyContext.class,0);
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
			setState(184);
			match(T__22);
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(185);
				whiteSpace();
				}
			}

			setState(188);
			match(T__8);
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(189);
				whiteSpace();
				}
			}

			setState(192);
			((ConditionalStatementContext)_localctx).cond = condition();
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(193);
				whiteSpace();
				}
			}

			setState(196);
			match(T__9);
			setState(197);
			whiteSpace();
			setState(198);
			match(T__23);
			setState(199);
			whiteSpace();
			setState(200);
			((ConditionalStatementContext)_localctx).con_body = conditionBody();
			setState(201);
			whiteSpace();
			setState(202);
			match(T__24);
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
		public ArithmeticalExpressionContext left_wxpr;
		public VariableNameContext left_var;
		public ArithmeticalExpressionContext right_expr;
		public VariableNameContext right_var;
		public List<ArithmeticalExpressionContext> arithmeticalExpression() {
			return getRuleContexts(ArithmeticalExpressionContext.class);
		}
		public ArithmeticalExpressionContext arithmeticalExpression(int i) {
			return getRuleContext(ArithmeticalExpressionContext.class,i);
		}
		public List<VariableNameContext> variableName() {
			return getRuleContexts(VariableNameContext.class);
		}
		public VariableNameContext variableName(int i) {
			return getRuleContext(VariableNameContext.class,i);
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
			setState(298);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(208);
					((ConditionContext)_localctx).left_wxpr = arithmeticalExpression(0);
					}
					break;
				case 2:
					{
					setState(209);
					((ConditionContext)_localctx).left_var = variableName();
					}
					break;
				}
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
				match(T__25);
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(216);
					whiteSpace();
					}
				}

				setState(221);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(219);
					((ConditionContext)_localctx).right_expr = arithmeticalExpression(0);
					}
					break;
				case 2:
					{
					setState(220);
					((ConditionContext)_localctx).right_var = variableName();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(225);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(223);
					((ConditionContext)_localctx).left_wxpr = arithmeticalExpression(0);
					}
					break;
				case 2:
					{
					setState(224);
					((ConditionContext)_localctx).left_var = variableName();
					}
					break;
				}
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
				match(T__26);
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(231);
					whiteSpace();
					}
				}

				setState(236);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(234);
					((ConditionContext)_localctx).right_expr = arithmeticalExpression(0);
					}
					break;
				case 2:
					{
					setState(235);
					((ConditionContext)_localctx).right_var = variableName();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(240);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(238);
					((ConditionContext)_localctx).left_wxpr = arithmeticalExpression(0);
					}
					break;
				case 2:
					{
					setState(239);
					((ConditionContext)_localctx).left_var = variableName();
					}
					break;
				}
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
				match(T__27);
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(246);
					whiteSpace();
					}
				}

				setState(251);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(249);
					((ConditionContext)_localctx).right_expr = arithmeticalExpression(0);
					}
					break;
				case 2:
					{
					setState(250);
					((ConditionContext)_localctx).right_var = variableName();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(255);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(253);
					((ConditionContext)_localctx).left_wxpr = arithmeticalExpression(0);
					}
					break;
				case 2:
					{
					setState(254);
					((ConditionContext)_localctx).left_var = variableName();
					}
					break;
				}
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
				match(T__28);
				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(261);
					whiteSpace();
					}
				}

				setState(266);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(264);
					((ConditionContext)_localctx).right_expr = arithmeticalExpression(0);
					}
					break;
				case 2:
					{
					setState(265);
					((ConditionContext)_localctx).right_var = variableName();
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(270);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(268);
					((ConditionContext)_localctx).left_wxpr = arithmeticalExpression(0);
					}
					break;
				case 2:
					{
					setState(269);
					((ConditionContext)_localctx).left_var = variableName();
					}
					break;
				}
				setState(273);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(272);
					whiteSpace();
					}
				}

				setState(275);
				match(T__29);
				setState(277);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(276);
					whiteSpace();
					}
				}

				setState(281);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(279);
					((ConditionContext)_localctx).right_expr = arithmeticalExpression(0);
					}
					break;
				case 2:
					{
					setState(280);
					((ConditionContext)_localctx).right_var = variableName();
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(285);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
				case 1:
					{
					setState(283);
					((ConditionContext)_localctx).left_wxpr = arithmeticalExpression(0);
					}
					break;
				case 2:
					{
					setState(284);
					((ConditionContext)_localctx).left_var = variableName();
					}
					break;
				}
				setState(288);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(287);
					whiteSpace();
					}
				}

				setState(290);
				match(T__30);
				setState(292);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(291);
					whiteSpace();
					}
				}

				setState(296);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
				case 1:
					{
					setState(294);
					((ConditionContext)_localctx).right_expr = arithmeticalExpression(0);
					}
					break;
				case 2:
					{
					setState(295);
					((ConditionContext)_localctx).right_var = variableName();
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

	public static class ConditionBodyContext extends ParserRuleContext {
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
		public ConditionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionBody; }
	}

	public final ConditionBodyContext conditionBody() throws RecognitionException {
		ConditionBodyContext _localctx = new ConditionBodyContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_conditionBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(300);
				instruction();
				setState(302);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(301);
					whiteSpace();
					}
					break;
				}
				}
				}
				setState(306); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__31) | (1L << T__33) | (1L << LOWERCASELETTER))) != 0) );
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
		public ParallelBodyContext par_body;
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public ParallelBodyContext parallelBody() {
			return getRuleContext(ParallelBodyContext.class,0);
		}
		public ParallelExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parallelExpression; }
	}

	public final ParallelExpressionContext parallelExpression() throws RecognitionException {
		ParallelExpressionContext _localctx = new ParallelExpressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_parallelExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			match(T__31);
			setState(309);
			whiteSpace();
			setState(310);
			((ParallelExpressionContext)_localctx).par_body = parallelBody();
			setState(311);
			whiteSpace();
			setState(312);
			match(T__32);
			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(313);
				whiteSpace();
				}
			}

			setState(316);
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

	public static class ParallelBodyContext extends ParserRuleContext {
		public ApplyForceContext app_force_;
		public ParallelExpressionContext parallel_;
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
		public ParallelBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parallelBody; }
	}

	public final ParallelBodyContext parallelBody() throws RecognitionException {
		ParallelBodyContext _localctx = new ParallelBodyContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_parallelBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(320);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__10:
					{
					setState(318);
					((ParallelBodyContext)_localctx).app_force_ = applyForce();
					}
					break;
				case T__31:
					{
					setState(319);
					((ParallelBodyContext)_localctx).parallel_ = parallelExpression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(322); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__10 || _la==T__31 );
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
		public LoopBodyContext l_body;
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public LoopBodyContext loopBody() {
			return getRuleContext(LoopBodyContext.class,0);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(T__33);
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
			match(T__8);
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
			condition();
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
			setState(338);
			((LoopContext)_localctx).l_body = loopBody();
			setState(339);
			whiteSpace();
			setState(340);
			match(T__34);
			setState(342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(341);
				whiteSpace();
				}
			}

			setState(344);
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

	public static class LoopBodyContext extends ParserRuleContext {
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public LoopBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopBody; }
	}

	public final LoopBodyContext loopBody() throws RecognitionException {
		LoopBodyContext _localctx = new LoopBodyContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_loopBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(346);
				instruction();
				}
				}
				setState(349); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__31) | (1L << T__33) | (1L << LOWERCASELETTER))) != 0) );
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
		public FunctionNameContext f_name;
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			((FunctionCallContext)_localctx).f_name = functionName();
			setState(352);
			match(T__8);
			setState(353);
			match(T__9);
			setState(354);
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

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public FunctionNameContext f_name;
		public FunctionBodyContext f_body;
		public FunctionArgsContext f_args;
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public FunctionArgsContext functionArgs() {
			return getRuleContext(FunctionArgsContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_functionDeclaration);
		int _la;
		try {
			setState(395);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(356);
				match(T__35);
				setState(357);
				((FunctionDeclarationContext)_localctx).f_name = functionName();
				setState(358);
				match(T__8);
				setState(359);
				match(T__9);
				setState(360);
				match(T__20);
				setState(362);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(361);
					whiteSpace();
					}
				}

				setState(364);
				((FunctionDeclarationContext)_localctx).f_body = functionBody();
				setState(365);
				whiteSpace();
				setState(366);
				match(T__36);
				setState(368);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(367);
					whiteSpace();
					}
				}

				setState(370);
				match(T__14);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(372);
				match(T__35);
				setState(373);
				((FunctionDeclarationContext)_localctx).f_name = functionName();
				setState(374);
				match(T__8);
				setState(376);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(375);
					whiteSpace();
					}
				}

				setState(378);
				((FunctionDeclarationContext)_localctx).f_args = functionArgs();
				setState(380);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(379);
					whiteSpace();
					}
				}

				setState(382);
				match(T__9);
				setState(383);
				match(T__20);
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
				((FunctionDeclarationContext)_localctx).f_body = functionBody();
				setState(388);
				whiteSpace();
				setState(389);
				match(T__36);
				setState(391);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(390);
					whiteSpace();
					}
				}

				setState(393);
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
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_functionBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(397);
				instruction();
				setState(399);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
				case 1:
					{
					setState(398);
					whiteSpace();
					}
					break;
				}
				}
				}
				setState(403); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__31) | (1L << T__33) | (1L << LOWERCASELETTER))) != 0) );
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
		public List<VariableNameContext> variableName() {
			return getRuleContexts(VariableNameContext.class);
		}
		public VariableNameContext variableName(int i) {
			return getRuleContext(VariableNameContext.class,i);
		}
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public FunctionArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionArgs; }
	}

	public final FunctionArgsContext functionArgs() throws RecognitionException {
		FunctionArgsContext _localctx = new FunctionArgsContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_functionArgs);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			variableName();
			setState(416);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(407);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(406);
						whiteSpace();
						}
					}

					setState(409);
					match(T__6);
					setState(411);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(410);
						whiteSpace();
						}
					}

					setState(413);
					variableName();
					}
					} 
				}
				setState(418);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
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
		enterRule(_localctx, 46, RULE_whiteSpace);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(420); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(419);
					match(WS);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(422); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,\u01ab\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\5\2\64\n\2\3\2\3\2\5\28\n\2\3\2\5\2;\n\2\6\2=\n\2\r\2\16\2>\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\5\3H\n\3\3\4\3\4\3\5\3\5\7\5N\n\5\f\5\16\5Q\13"+
		"\5\3\6\3\6\7\6U\n\6\f\6\16\6X\13\6\3\7\3\7\7\7\\\n\7\f\7\16\7_\13\7\3"+
		"\7\5\7b\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\5\nt\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\177\n\n\3\n\3"+
		"\n\3\n\3\n\3\n\5\n\u0086\n\n\5\n\u0088\n\n\3\n\5\n\u008b\n\n\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\3\13\5\13\u0094\n\13\3\13\3\13\5\13\u0098\n\13\3\13"+
		"\3\13\5\13\u009c\n\13\3\13\7\13\u009f\n\13\f\13\16\13\u00a2\13\13\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00ae\n\f\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\5\16\u00bd\n\16\3\16\3\16\5\16\u00c1"+
		"\n\16\3\16\3\16\5\16\u00c5\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\5\16\u00cf\n\16\3\16\3\16\3\17\3\17\5\17\u00d5\n\17\3\17\5\17\u00d8\n"+
		"\17\3\17\3\17\5\17\u00dc\n\17\3\17\3\17\5\17\u00e0\n\17\3\17\3\17\5\17"+
		"\u00e4\n\17\3\17\5\17\u00e7\n\17\3\17\3\17\5\17\u00eb\n\17\3\17\3\17\5"+
		"\17\u00ef\n\17\3\17\3\17\5\17\u00f3\n\17\3\17\5\17\u00f6\n\17\3\17\3\17"+
		"\5\17\u00fa\n\17\3\17\3\17\5\17\u00fe\n\17\3\17\3\17\5\17\u0102\n\17\3"+
		"\17\5\17\u0105\n\17\3\17\3\17\5\17\u0109\n\17\3\17\3\17\5\17\u010d\n\17"+
		"\3\17\3\17\5\17\u0111\n\17\3\17\5\17\u0114\n\17\3\17\3\17\5\17\u0118\n"+
		"\17\3\17\3\17\5\17\u011c\n\17\3\17\3\17\5\17\u0120\n\17\3\17\5\17\u0123"+
		"\n\17\3\17\3\17\5\17\u0127\n\17\3\17\3\17\5\17\u012b\n\17\5\17\u012d\n"+
		"\17\3\20\3\20\5\20\u0131\n\20\6\20\u0133\n\20\r\20\16\20\u0134\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\5\21\u013d\n\21\3\21\3\21\3\22\3\22\6\22\u0143"+
		"\n\22\r\22\16\22\u0144\3\23\3\23\5\23\u0149\n\23\3\23\3\23\5\23\u014d"+
		"\n\23\3\23\3\23\5\23\u0151\n\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0159"+
		"\n\23\3\23\3\23\3\24\6\24\u015e\n\24\r\24\16\24\u015f\3\25\3\25\3\25\3"+
		"\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u016d\n\26\3\26\3\26\3\26"+
		"\3\26\5\26\u0173\n\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u017b\n\26\3"+
		"\26\3\26\5\26\u017f\n\26\3\26\3\26\3\26\5\26\u0184\n\26\3\26\3\26\3\26"+
		"\3\26\5\26\u018a\n\26\3\26\3\26\5\26\u018e\n\26\3\27\3\27\5\27\u0192\n"+
		"\27\6\27\u0194\n\27\r\27\16\27\u0195\3\30\3\30\5\30\u019a\n\30\3\30\3"+
		"\30\5\30\u019e\n\30\3\30\7\30\u01a1\n\30\f\30\16\30\u01a4\13\30\3\31\6"+
		"\31\u01a7\n\31\r\31\16\31\u01a8\3\31\2\3\24\32\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\2\6\3\2\3\6\4\2\7\7),\3\2+,\3\2\22\25\2\u01e4"+
		"\2<\3\2\2\2\4G\3\2\2\2\6I\3\2\2\2\bK\3\2\2\2\nR\3\2\2\2\fa\3\2\2\2\16"+
		"c\3\2\2\2\20i\3\2\2\2\22o\3\2\2\2\24\u0093\3\2\2\2\26\u00a3\3\2\2\2\30"+
		"\u00b1\3\2\2\2\32\u00ba\3\2\2\2\34\u012c\3\2\2\2\36\u0132\3\2\2\2 \u0136"+
		"\3\2\2\2\"\u0142\3\2\2\2$\u0146\3\2\2\2&\u015d\3\2\2\2(\u0161\3\2\2\2"+
		"*\u018d\3\2\2\2,\u0193\3\2\2\2.\u0197\3\2\2\2\60\u01a6\3\2\2\2\62\64\5"+
		"\60\31\2\63\62\3\2\2\2\63\64\3\2\2\2\64\67\3\2\2\2\658\5*\26\2\668\5\4"+
		"\3\2\67\65\3\2\2\2\67\66\3\2\2\28:\3\2\2\29;\5\60\31\2:9\3\2\2\2:;\3\2"+
		"\2\2;=\3\2\2\2<\63\3\2\2\2=>\3\2\2\2><\3\2\2\2>?\3\2\2\2?\3\3\2\2\2@H"+
		"\5\26\f\2AH\5\30\r\2BH\5\32\16\2CH\5 \21\2DH\5$\23\2EH\5(\25\2FH\5\22"+
		"\n\2G@\3\2\2\2GA\3\2\2\2GB\3\2\2\2GC\3\2\2\2GD\3\2\2\2GE\3\2\2\2GF\3\2"+
		"\2\2H\5\3\2\2\2IJ\t\2\2\2J\7\3\2\2\2KO\7)\2\2LN\t\3\2\2ML\3\2\2\2NQ\3"+
		"\2\2\2OM\3\2\2\2OP\3\2\2\2P\t\3\2\2\2QO\3\2\2\2RV\7)\2\2SU\t\3\2\2TS\3"+
		"\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2W\13\3\2\2\2XV\3\2\2\2Y]\7+\2\2Z\\"+
		"\t\4\2\2[Z\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^b\3\2\2\2_]\3\2\2\2"+
		"`b\7,\2\2aY\3\2\2\2a`\3\2\2\2b\r\3\2\2\2cd\7\b\2\2de\5\f\7\2ef\7\t\2\2"+
		"fg\5\f\7\2gh\7\n\2\2h\17\3\2\2\2ij\7\13\2\2jk\5\f\7\2kl\7\t\2\2lm\5\f"+
		"\7\2mn\7\f\2\2n\21\3\2\2\2op\7\r\2\2ps\5\60\31\2qt\5\b\5\2rt\5\16\b\2"+
		"sq\3\2\2\2sr\3\2\2\2tu\3\2\2\2uv\5\60\31\2vw\7\16\2\2wx\5\60\31\2xy\5"+
		"\b\5\2yz\5\60\31\2z{\7\17\2\2{~\5\60\31\2|\177\5\b\5\2}\177\5\f\7\2~|"+
		"\3\2\2\2~}\3\2\2\2\177\u0087\3\2\2\2\u0080\u0081\5\60\31\2\u0081\u0082"+
		"\7\20\2\2\u0082\u0085\5\60\31\2\u0083\u0086\5\b\5\2\u0084\u0086\5\f\7"+
		"\2\u0085\u0083\3\2\2\2\u0085\u0084\3\2\2\2\u0086\u0088\3\2\2\2\u0087\u0080"+
		"\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008a\3\2\2\2\u0089\u008b\5\60\31\2"+
		"\u008a\u0089\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d"+
		"\7\21\2\2\u008d\23\3\2\2\2\u008e\u008f\b\13\1\2\u008f\u0094\5\f\7\2\u0090"+
		"\u0094\5\16\b\2\u0091\u0094\5\20\t\2\u0092\u0094\5\b\5\2\u0093\u008e\3"+
		"\2\2\2\u0093\u0090\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0092\3\2\2\2\u0094"+
		"\u00a0\3\2\2\2\u0095\u0097\f\7\2\2\u0096\u0098\5\60\31\2\u0097\u0096\3"+
		"\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009b\t\5\2\2\u009a"+
		"\u009c\5\60\31\2\u009b\u009a\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d\3"+
		"\2\2\2\u009d\u009f\5\24\13\b\u009e\u0095\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0"+
		"\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\25\3\2\2\2\u00a2\u00a0\3\2\2"+
		"\2\u00a3\u00a4\7\26\2\2\u00a4\u00a5\5\60\31\2\u00a5\u00a6\5\6\4\2\u00a6"+
		"\u00a7\5\60\31\2\u00a7\u00a8\5\b\5\2\u00a8\u00a9\5\60\31\2\u00a9\u00aa"+
		"\7\27\2\2\u00aa\u00ab\5\60\31\2\u00ab\u00ad\5\24\13\2\u00ac\u00ae\5\60"+
		"\31\2\u00ad\u00ac\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af\3\2\2\2\u00af"+
		"\u00b0\7\21\2\2\u00b0\27\3\2\2\2\u00b1\u00b2\7\30\2\2\u00b2\u00b3\5\60"+
		"\31\2\u00b3\u00b4\5\b\5\2\u00b4\u00b5\5\60\31\2\u00b5\u00b6\7\27\2\2\u00b6"+
		"\u00b7\5\60\31\2\u00b7\u00b8\5\24\13\2\u00b8\u00b9\7\21\2\2\u00b9\31\3"+
		"\2\2\2\u00ba\u00bc\7\31\2\2\u00bb\u00bd\5\60\31\2\u00bc\u00bb\3\2\2\2"+
		"\u00bc\u00bd\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c0\7\13\2\2\u00bf\u00c1"+
		"\5\60\31\2\u00c0\u00bf\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\3\2\2\2"+
		"\u00c2\u00c4\5\34\17\2\u00c3\u00c5\5\60\31\2\u00c4\u00c3\3\2\2\2\u00c4"+
		"\u00c5\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\7\f\2\2\u00c7\u00c8\5\60"+
		"\31\2\u00c8\u00c9\7\32\2\2\u00c9\u00ca\5\60\31\2\u00ca\u00cb\5\36\20\2"+
		"\u00cb\u00cc\5\60\31\2\u00cc\u00ce\7\33\2\2\u00cd\u00cf\5\60\31\2\u00ce"+
		"\u00cd\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\7\21"+
		"\2\2\u00d1\33\3\2\2\2\u00d2\u00d5\5\24\13\2\u00d3\u00d5\5\b\5\2\u00d4"+
		"\u00d2\3\2\2\2\u00d4\u00d3\3\2\2\2\u00d5\u00d7\3\2\2\2\u00d6\u00d8\5\60"+
		"\31\2\u00d7\u00d6\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9"+
		"\u00db\7\34\2\2\u00da\u00dc\5\60\31\2\u00db\u00da\3\2\2\2\u00db\u00dc"+
		"\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00e0\5\24\13\2\u00de\u00e0\5\b\5\2"+
		"\u00df\u00dd\3\2\2\2\u00df\u00de\3\2\2\2\u00e0\u012d\3\2\2\2\u00e1\u00e4"+
		"\5\24\13\2\u00e2\u00e4\5\b\5\2\u00e3\u00e1\3\2\2\2\u00e3\u00e2\3\2\2\2"+
		"\u00e4\u00e6\3\2\2\2\u00e5\u00e7\5\60\31\2\u00e6\u00e5\3\2\2\2\u00e6\u00e7"+
		"\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00ea\7\35\2\2\u00e9\u00eb\5\60\31"+
		"\2\u00ea\u00e9\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ef"+
		"\5\24\13\2\u00ed\u00ef\5\b\5\2\u00ee\u00ec\3\2\2\2\u00ee\u00ed\3\2\2\2"+
		"\u00ef\u012d\3\2\2\2\u00f0\u00f3\5\24\13\2\u00f1\u00f3\5\b\5\2\u00f2\u00f0"+
		"\3\2\2\2\u00f2\u00f1\3\2\2\2\u00f3\u00f5\3\2\2\2\u00f4\u00f6\5\60\31\2"+
		"\u00f5\u00f4\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f9"+
		"\7\36\2\2\u00f8\u00fa\5\60\31\2\u00f9\u00f8\3\2\2\2\u00f9\u00fa\3\2\2"+
		"\2\u00fa\u00fd\3\2\2\2\u00fb\u00fe\5\24\13\2\u00fc\u00fe\5\b\5\2\u00fd"+
		"\u00fb\3\2\2\2\u00fd\u00fc\3\2\2\2\u00fe\u012d\3\2\2\2\u00ff\u0102\5\24"+
		"\13\2\u0100\u0102\5\b\5\2\u0101\u00ff\3\2\2\2\u0101\u0100\3\2\2\2\u0102"+
		"\u0104\3\2\2\2\u0103\u0105\5\60\31\2\u0104\u0103\3\2\2\2\u0104\u0105\3"+
		"\2\2\2\u0105\u0106\3\2\2\2\u0106\u0108\7\37\2\2\u0107\u0109\5\60\31\2"+
		"\u0108\u0107\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010c\3\2\2\2\u010a\u010d"+
		"\5\24\13\2\u010b\u010d\5\b\5\2\u010c\u010a\3\2\2\2\u010c\u010b\3\2\2\2"+
		"\u010d\u012d\3\2\2\2\u010e\u0111\5\24\13\2\u010f\u0111\5\b\5\2\u0110\u010e"+
		"\3\2\2\2\u0110\u010f\3\2\2\2\u0111\u0113\3\2\2\2\u0112\u0114\5\60\31\2"+
		"\u0113\u0112\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0117"+
		"\7 \2\2\u0116\u0118\5\60\31\2\u0117\u0116\3\2\2\2\u0117\u0118\3\2\2\2"+
		"\u0118\u011b\3\2\2\2\u0119\u011c\5\24\13\2\u011a\u011c\5\b\5\2\u011b\u0119"+
		"\3\2\2\2\u011b\u011a\3\2\2\2\u011c\u012d\3\2\2\2\u011d\u0120\5\24\13\2"+
		"\u011e\u0120\5\b\5\2\u011f\u011d\3\2\2\2\u011f\u011e\3\2\2\2\u0120\u0122"+
		"\3\2\2\2\u0121\u0123\5\60\31\2\u0122\u0121\3\2\2\2\u0122\u0123\3\2\2\2"+
		"\u0123\u0124\3\2\2\2\u0124\u0126\7!\2\2\u0125\u0127\5\60\31\2\u0126\u0125"+
		"\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u012a\3\2\2\2\u0128\u012b\5\24\13\2"+
		"\u0129\u012b\5\b\5\2\u012a\u0128\3\2\2\2\u012a\u0129\3\2\2\2\u012b\u012d"+
		"\3\2\2\2\u012c\u00d4\3\2\2\2\u012c\u00e3\3\2\2\2\u012c\u00f2\3\2\2\2\u012c"+
		"\u0101\3\2\2\2\u012c\u0110\3\2\2\2\u012c\u011f\3\2\2\2\u012d\35\3\2\2"+
		"\2\u012e\u0130\5\4\3\2\u012f\u0131\5\60\31\2\u0130\u012f\3\2\2\2\u0130"+
		"\u0131\3\2\2\2\u0131\u0133\3\2\2\2\u0132\u012e\3\2\2\2\u0133\u0134\3\2"+
		"\2\2\u0134\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135\37\3\2\2\2\u0136\u0137"+
		"\7\"\2\2\u0137\u0138\5\60\31\2\u0138\u0139\5\"\22\2\u0139\u013a\5\60\31"+
		"\2\u013a\u013c\7#\2\2\u013b\u013d\5\60\31\2\u013c\u013b\3\2\2\2\u013c"+
		"\u013d\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u013f\7\21\2\2\u013f!\3\2\2\2"+
		"\u0140\u0143\5\22\n\2\u0141\u0143\5 \21\2\u0142\u0140\3\2\2\2\u0142\u0141"+
		"\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0142\3\2\2\2\u0144\u0145\3\2\2\2\u0145"+
		"#\3\2\2\2\u0146\u0148\7$\2\2\u0147\u0149\5\60\31\2\u0148\u0147\3\2\2\2"+
		"\u0148\u0149\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014c\7\13\2\2\u014b\u014d"+
		"\5\60\31\2\u014c\u014b\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014e\3\2\2\2"+
		"\u014e\u0150\5\34\17\2\u014f\u0151\5\60\31\2\u0150\u014f\3\2\2\2\u0150"+
		"\u0151\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0153\7\f\2\2\u0153\u0154\5\60"+
		"\31\2\u0154\u0155\5&\24\2\u0155\u0156\5\60\31\2\u0156\u0158\7%\2\2\u0157"+
		"\u0159\5\60\31\2\u0158\u0157\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015a\3"+
		"\2\2\2\u015a\u015b\7\21\2\2\u015b%\3\2\2\2\u015c\u015e\5\4\3\2\u015d\u015c"+
		"\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u015d\3\2\2\2\u015f\u0160\3\2\2\2\u0160"+
		"\'\3\2\2\2\u0161\u0162\5\n\6\2\u0162\u0163\7\13\2\2\u0163\u0164\7\f\2"+
		"\2\u0164\u0165\7\21\2\2\u0165)\3\2\2\2\u0166\u0167\7&\2\2\u0167\u0168"+
		"\5\n\6\2\u0168\u0169\7\13\2\2\u0169\u016a\7\f\2\2\u016a\u016c\7\27\2\2"+
		"\u016b\u016d\5\60\31\2\u016c\u016b\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u016e"+
		"\3\2\2\2\u016e\u016f\5,\27\2\u016f\u0170\5\60\31\2\u0170\u0172\7\'\2\2"+
		"\u0171\u0173\5\60\31\2\u0172\u0171\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0174"+
		"\3\2\2\2\u0174\u0175\7\21\2\2\u0175\u018e\3\2\2\2\u0176\u0177\7&\2\2\u0177"+
		"\u0178\5\n\6\2\u0178\u017a\7\13\2\2\u0179\u017b\5\60\31\2\u017a\u0179"+
		"\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017e\5.\30\2\u017d"+
		"\u017f\5\60\31\2\u017e\u017d\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0180\3"+
		"\2\2\2\u0180\u0181\7\f\2\2\u0181\u0183\7\27\2\2\u0182\u0184\5\60\31\2"+
		"\u0183\u0182\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0186"+
		"\5,\27\2\u0186\u0187\5\60\31\2\u0187\u0189\7\'\2\2\u0188\u018a\5\60\31"+
		"\2\u0189\u0188\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018c"+
		"\7\21\2\2\u018c\u018e\3\2\2\2\u018d\u0166\3\2\2\2\u018d\u0176\3\2\2\2"+
		"\u018e+\3\2\2\2\u018f\u0191\5\4\3\2\u0190\u0192\5\60\31\2\u0191\u0190"+
		"\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0194\3\2\2\2\u0193\u018f\3\2\2\2\u0194"+
		"\u0195\3\2\2\2\u0195\u0193\3\2\2\2\u0195\u0196\3\2\2\2\u0196-\3\2\2\2"+
		"\u0197\u01a2\5\b\5\2\u0198\u019a\5\60\31\2\u0199\u0198\3\2\2\2\u0199\u019a"+
		"\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u019d\7\t\2\2\u019c\u019e\5\60\31\2"+
		"\u019d\u019c\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a1"+
		"\5\b\5\2\u01a0\u0199\3\2\2\2\u01a1\u01a4\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a2"+
		"\u01a3\3\2\2\2\u01a3/\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a5\u01a7\7(\2\2\u01a6"+
		"\u01a5\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a8\u01a9\3\2"+
		"\2\2\u01a9\61\3\2\2\2I\63\67:>GOV]as~\u0085\u0087\u008a\u0093\u0097\u009b"+
		"\u00a0\u00ad\u00bc\u00c0\u00c4\u00ce\u00d4\u00d7\u00db\u00df\u00e3\u00e6"+
		"\u00ea\u00ee\u00f2\u00f5\u00f9\u00fd\u0101\u0104\u0108\u010c\u0110\u0113"+
		"\u0117\u011b\u011f\u0122\u0126\u012a\u012c\u0130\u0134\u013c\u0142\u0144"+
		"\u0148\u014c\u0150\u0158\u015f\u016c\u0172\u017a\u017e\u0183\u0189\u018d"+
		"\u0191\u0195\u0199\u019d\u01a2\u01a8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}