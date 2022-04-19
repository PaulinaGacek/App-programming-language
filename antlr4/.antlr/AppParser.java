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
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, WS=40, LOWERCASELETTER=41, UPPERCASELETTER=42, NONZERODIGIT=43, 
		ZERO=44;
	public static final int
		RULE_primaryExpression = 0, RULE_instruction = 1, RULE_variableType = 2, 
		RULE_variableName = 3, RULE_functionName = 4, RULE_integer = 5, RULE_force_type = 6, 
		RULE_object_type = 7, RULE_applyForce = 8, RULE_arithmeticalExpression = 9, 
		RULE_declaration = 10, RULE_definition = 11, RULE_conditionalStatement = 12, 
		RULE_condition = 13, RULE_conditionBody = 14, RULE_parallelExpression = 15, 
		RULE_parallelBody = 16, RULE_loop = 17, RULE_loopBody = 18, RULE_functionCall = 19, 
		RULE_functionDeclaration = 20, RULE_functionBody = 21, RULE_functionArgs = 22, 
		RULE_functionParams = 23, RULE_functionArgument = 24, RULE_whiteSpace = 25, 
		RULE_comment = 26;
	private static String[] makeRuleNames() {
		return new String[] {
			"primaryExpression", "instruction", "variableType", "variableName", "functionName", 
			"integer", "force_type", "object_type", "applyForce", "arithmeticalExpression", 
			"declaration", "definition", "conditionalStatement", "condition", "conditionBody", 
			"parallelExpression", "parallelBody", "loop", "loopBody", "functionCall", 
			"functionDeclaration", "functionBody", "functionArgs", "functionParams", 
			"functionArgument", "whiteSpace", "comment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'TIME'", "'INT'", "'FORCE'", "'OBJECT'", "'_'", "'['", "','", 
			"']'", "'('", "')'", "'APPLY'", "'TO'", "'FOR'", "'DELAY'", "';'", "'+'", 
			"'-'", "'/'", "'*'", "'DEFINE'", "'AS'", "'SET'", "'IF'", "'THEN'", "'ENDIF'", 
			"'=='", "'>'", "'<'", "'>='", "'<='", "'!='", "'PARALLEL'", "'ENDPARALLEL'", 
			"'LOOP'", "'ENDLOOP'", "'DEFINE FUNCTION'", "'ENDFUNCTION'", "'/*'", 
			"'*/'", null, null, null, null, "'0'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "WS", "LOWERCASELETTER", "UPPERCASELETTER", "NONZERODIGIT", 
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
			setState(64); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(54);
					whiteSpace();
					}
				}

				setState(59);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__35:
					{
					setState(57);
					functionDeclaration();
					}
					break;
				case T__10:
				case T__19:
				case T__21:
				case T__22:
				case T__31:
				case T__33:
				case T__37:
				case LOWERCASELETTER:
					{
					setState(58);
					instruction();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(62);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(61);
					whiteSpace();
					}
					break;
				}
				}
				}
				setState(66); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__31) | (1L << T__33) | (1L << T__35) | (1L << T__37) | (1L << WS) | (1L << LOWERCASELETTER))) != 0) );
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
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
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
			setState(76);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__19:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				declaration();
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				definition();
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 3);
				{
				setState(70);
				conditionalStatement();
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 4);
				{
				setState(71);
				parallelExpression();
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 5);
				{
				setState(72);
				loop();
				}
				break;
			case LOWERCASELETTER:
				enterOuterAlt(_localctx, 6);
				{
				setState(73);
				functionCall();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 7);
				{
				setState(74);
				applyForce();
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 8);
				{
				setState(75);
				comment();
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
			setState(78);
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
			setState(80);
			match(LOWERCASELETTER);
			setState(84);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
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
				}
				setState(86);
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
			setState(87);
			match(LOWERCASELETTER);
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << LOWERCASELETTER) | (1L << UPPERCASELETTER) | (1L << NONZERODIGIT) | (1L << ZERO))) != 0)) {
				{
				{
				setState(88);
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
				setState(93);
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
			setState(102);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NONZERODIGIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				match(NONZERODIGIT);
				setState(98);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(95);
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
					setState(100);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				}
				break;
			case ZERO:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
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
			setState(104);
			match(T__5);
			setState(105);
			((Force_typeContext)_localctx).angle = integer();
			setState(106);
			match(T__6);
			setState(107);
			((Force_typeContext)_localctx).power = integer();
			setState(108);
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
			setState(110);
			match(T__8);
			setState(111);
			((Object_typeContext)_localctx).x_cor = integer();
			setState(112);
			match(T__6);
			setState(113);
			((Object_typeContext)_localctx).y_cor = integer();
			setState(114);
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
			setState(116);
			match(T__10);
			setState(117);
			whiteSpace();
			setState(120);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOWERCASELETTER:
				{
				setState(118);
				((ApplyForceContext)_localctx).force_ = variableName();
				}
				break;
			case T__5:
				{
				setState(119);
				((ApplyForceContext)_localctx).force_val = force_type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(122);
			whiteSpace();
			setState(123);
			match(T__11);
			setState(124);
			whiteSpace();
			setState(125);
			((ApplyForceContext)_localctx).object_ = variableName();
			setState(126);
			whiteSpace();
			setState(127);
			match(T__12);
			setState(128);
			whiteSpace();
			setState(131);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOWERCASELETTER:
				{
				setState(129);
				((ApplyForceContext)_localctx).time_ = variableName();
				}
				break;
			case NONZERODIGIT:
			case ZERO:
				{
				setState(130);
				((ApplyForceContext)_localctx).time_val = integer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(133);
				whiteSpace();
				setState(134);
				match(T__13);
				setState(135);
				whiteSpace();
				setState(138);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LOWERCASELETTER:
					{
					setState(136);
					((ApplyForceContext)_localctx).delay_ = variableName();
					}
					break;
				case NONZERODIGIT:
				case ZERO:
					{
					setState(137);
					((ApplyForceContext)_localctx).delay_val_ = integer();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(142);
				whiteSpace();
				}
			}

			setState(145);
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
			setState(152);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NONZERODIGIT:
			case ZERO:
				{
				setState(148);
				integer();
				}
				break;
			case T__5:
				{
				setState(149);
				force_type();
				}
				break;
			case T__8:
				{
				setState(150);
				object_type();
				}
				break;
			case LOWERCASELETTER:
				{
				setState(151);
				variableName();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(165);
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
					setState(154);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
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
					((ArithmeticalExpressionContext)_localctx).right = arithmeticalExpression(6);
					}
					} 
				}
				setState(167);
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
			setState(168);
			match(T__19);
			setState(169);
			whiteSpace();
			setState(170);
			((DeclarationContext)_localctx).type_sim = variableType();
			setState(171);
			whiteSpace();
			setState(172);
			((DeclarationContext)_localctx).name_ = variableName();
			setState(173);
			whiteSpace();
			setState(174);
			match(T__20);
			setState(175);
			whiteSpace();
			setState(176);
			((DeclarationContext)_localctx).value_ = arithmeticalExpression(0);
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(177);
				whiteSpace();
				}
			}

			setState(180);
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
			setState(182);
			match(T__21);
			setState(183);
			whiteSpace();
			setState(184);
			((DefinitionContext)_localctx).name_ = variableName();
			setState(185);
			whiteSpace();
			setState(186);
			match(T__20);
			setState(187);
			whiteSpace();
			setState(188);
			((DefinitionContext)_localctx).value_ = arithmeticalExpression(0);
			setState(189);
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
			setState(191);
			match(T__22);
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(192);
				whiteSpace();
				}
			}

			setState(195);
			match(T__8);
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
			((ConditionalStatementContext)_localctx).cond = condition();
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(200);
				whiteSpace();
				}
			}

			setState(203);
			match(T__9);
			setState(204);
			whiteSpace();
			setState(205);
			match(T__23);
			setState(206);
			whiteSpace();
			setState(207);
			((ConditionalStatementContext)_localctx).con_body = conditionBody();
			setState(208);
			whiteSpace();
			setState(209);
			match(T__24);
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(210);
				whiteSpace();
				}
			}

			setState(213);
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
		public ArithmeticalExpressionContext left_expr;
		public VariableNameContext left_var;
		public Token op;
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
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(215);
				((ConditionContext)_localctx).left_expr = arithmeticalExpression(0);
				}
				break;
			case 2:
				{
				setState(216);
				((ConditionContext)_localctx).left_var = variableName();
				}
				break;
			}
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(219);
				whiteSpace();
				}
			}

			setState(222);
			((ConditionContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30))) != 0)) ) {
				((ConditionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(223);
				whiteSpace();
				}
			}

			setState(228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(226);
				((ConditionContext)_localctx).right_expr = arithmeticalExpression(0);
				}
				break;
			case 2:
				{
				setState(227);
				((ConditionContext)_localctx).right_var = variableName();
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
			setState(234); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(230);
				instruction();
				setState(232);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(231);
					whiteSpace();
					}
					break;
				}
				}
				}
				setState(236); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__31) | (1L << T__33) | (1L << T__37) | (1L << LOWERCASELETTER))) != 0) );
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
			setState(238);
			match(T__31);
			setState(239);
			whiteSpace();
			setState(240);
			((ParallelExpressionContext)_localctx).par_body = parallelBody();
			setState(241);
			whiteSpace();
			setState(242);
			match(T__32);
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
		public List<ApplyForceContext> applyForce() {
			return getRuleContexts(ApplyForceContext.class);
		}
		public ApplyForceContext applyForce(int i) {
			return getRuleContext(ApplyForceContext.class,i);
		}
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
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
			setState(252); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(248);
				((ParallelBodyContext)_localctx).app_force_ = applyForce();
				setState(250);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(249);
					whiteSpace();
					}
					break;
				}
				}
				}
				setState(254); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__10 );
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
			setState(256);
			match(T__33);
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
			match(T__8);
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(261);
				whiteSpace();
				}
			}

			setState(264);
			condition();
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(265);
				whiteSpace();
				}
			}

			setState(268);
			match(T__9);
			setState(269);
			whiteSpace();
			setState(270);
			((LoopContext)_localctx).l_body = loopBody();
			setState(271);
			whiteSpace();
			setState(272);
			match(T__34);
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
			setState(279); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(278);
				instruction();
				}
				}
				setState(281); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__31) | (1L << T__33) | (1L << T__37) | (1L << LOWERCASELETTER))) != 0) );
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
		public FunctionParamsContext f_args;
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public FunctionParamsContext functionParams() {
			return getRuleContext(FunctionParamsContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_functionCall);
		int _la;
		try {
			setState(309);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(283);
				((FunctionCallContext)_localctx).f_name = functionName();
				setState(284);
				match(T__8);
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
				match(T__9);
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
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(294);
				((FunctionCallContext)_localctx).f_name = functionName();
				setState(295);
				match(T__8);
				setState(297);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(296);
					whiteSpace();
					}
				}

				setState(299);
				((FunctionCallContext)_localctx).f_args = functionParams();
				setState(301);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(300);
					whiteSpace();
					}
				}

				setState(303);
				match(T__9);
				setState(305);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(304);
					whiteSpace();
					}
				}

				setState(307);
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
			setState(361);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(311);
				match(T__35);
				setState(312);
				whiteSpace();
				setState(313);
				((FunctionDeclarationContext)_localctx).f_name = functionName();
				setState(314);
				match(T__8);
				setState(316);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(315);
					whiteSpace();
					}
				}

				setState(318);
				match(T__9);
				setState(319);
				whiteSpace();
				setState(320);
				match(T__20);
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
				((FunctionDeclarationContext)_localctx).f_body = functionBody();
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
				match(T__36);
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
				match(T__14);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(334);
				match(T__35);
				setState(335);
				whiteSpace();
				setState(336);
				((FunctionDeclarationContext)_localctx).f_name = functionName();
				setState(337);
				match(T__8);
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
				((FunctionDeclarationContext)_localctx).f_args = functionArgs();
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
				match(T__9);
				setState(346);
				whiteSpace();
				setState(347);
				match(T__20);
				setState(349);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(348);
					whiteSpace();
					}
				}

				setState(351);
				((FunctionDeclarationContext)_localctx).f_body = functionBody();
				setState(353);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(352);
					whiteSpace();
					}
				}

				setState(355);
				match(T__36);
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
			setState(367); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(363);
				instruction();
				setState(365);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
				case 1:
					{
					setState(364);
					whiteSpace();
					}
					break;
				}
				}
				}
				setState(369); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__31) | (1L << T__33) | (1L << T__37) | (1L << LOWERCASELETTER))) != 0) );
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
		public List<FunctionArgumentContext> functionArgument() {
			return getRuleContexts(FunctionArgumentContext.class);
		}
		public FunctionArgumentContext functionArgument(int i) {
			return getRuleContext(FunctionArgumentContext.class,i);
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
			setState(371);
			functionArgument();
			setState(382);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(373);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(372);
						whiteSpace();
						}
					}

					setState(375);
					match(T__6);
					setState(377);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(376);
						whiteSpace();
						}
					}

					setState(379);
					functionArgument();
					}
					} 
				}
				setState(384);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
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

	public static class FunctionParamsContext extends ParserRuleContext {
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
		public FunctionParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionParams; }
	}

	public final FunctionParamsContext functionParams() throws RecognitionException {
		FunctionParamsContext _localctx = new FunctionParamsContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_functionParams);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			variableName();
			setState(396);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(387);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(386);
						whiteSpace();
						}
					}

					setState(389);
					match(T__6);
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
					variableName();
					}
					} 
				}
				setState(398);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
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

	public static class FunctionArgumentContext extends ParserRuleContext {
		public VariableTypeContext type_;
		public VariableNameContext name_;
		public WhiteSpaceContext whiteSpace() {
			return getRuleContext(WhiteSpaceContext.class,0);
		}
		public VariableTypeContext variableType() {
			return getRuleContext(VariableTypeContext.class,0);
		}
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public FunctionArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionArgument; }
	}

	public final FunctionArgumentContext functionArgument() throws RecognitionException {
		FunctionArgumentContext _localctx = new FunctionArgumentContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_functionArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			((FunctionArgumentContext)_localctx).type_ = variableType();
			setState(400);
			whiteSpace();
			setState(401);
			((FunctionArgumentContext)_localctx).name_ = variableName();
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
		enterRule(_localctx, 50, RULE_whiteSpace);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(404); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(403);
					match(WS);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(406); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
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

	public static class CommentContext extends ParserRuleContext {
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_comment);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			match(T__37);
			setState(412);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(409);
					matchWildcard();
					}
					} 
				}
				setState(414);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			}
			setState(415);
			match(T__38);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u01a4\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\5\2:\n\2\3\2\3\2\5\2>\n\2\3\2\5\2A"+
		"\n\2\6\2C\n\2\r\2\16\2D\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3O\n\3\3\4\3"+
		"\4\3\5\3\5\7\5U\n\5\f\5\16\5X\13\5\3\6\3\6\7\6\\\n\6\f\6\16\6_\13\6\3"+
		"\7\3\7\7\7c\n\7\f\7\16\7f\13\7\3\7\5\7i\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\5\n{\n\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\5\n\u0086\n\n\3\n\3\n\3\n\3\n\3\n\5\n\u008d\n\n\5\n\u008f"+
		"\n\n\3\n\5\n\u0092\n\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\5\13\u009b\n\13"+
		"\3\13\3\13\5\13\u009f\n\13\3\13\3\13\5\13\u00a3\n\13\3\13\7\13\u00a6\n"+
		"\13\f\13\16\13\u00a9\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f"+
		"\u00b5\n\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\5\16"+
		"\u00c4\n\16\3\16\3\16\5\16\u00c8\n\16\3\16\3\16\5\16\u00cc\n\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00d6\n\16\3\16\3\16\3\17\3\17"+
		"\5\17\u00dc\n\17\3\17\5\17\u00df\n\17\3\17\3\17\5\17\u00e3\n\17\3\17\3"+
		"\17\5\17\u00e7\n\17\3\20\3\20\5\20\u00eb\n\20\6\20\u00ed\n\20\r\20\16"+
		"\20\u00ee\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00f7\n\21\3\21\3\21\3\22"+
		"\3\22\5\22\u00fd\n\22\6\22\u00ff\n\22\r\22\16\22\u0100\3\23\3\23\5\23"+
		"\u0105\n\23\3\23\3\23\5\23\u0109\n\23\3\23\3\23\5\23\u010d\n\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\5\23\u0115\n\23\3\23\3\23\3\24\6\24\u011a\n\24"+
		"\r\24\16\24\u011b\3\25\3\25\3\25\5\25\u0121\n\25\3\25\3\25\5\25\u0125"+
		"\n\25\3\25\3\25\3\25\3\25\3\25\5\25\u012c\n\25\3\25\3\25\5\25\u0130\n"+
		"\25\3\25\3\25\5\25\u0134\n\25\3\25\3\25\5\25\u0138\n\25\3\26\3\26\3\26"+
		"\3\26\3\26\5\26\u013f\n\26\3\26\3\26\3\26\3\26\5\26\u0145\n\26\3\26\3"+
		"\26\5\26\u0149\n\26\3\26\3\26\5\26\u014d\n\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\5\26\u0156\n\26\3\26\3\26\5\26\u015a\n\26\3\26\3\26\3\26\3"+
		"\26\5\26\u0160\n\26\3\26\3\26\5\26\u0164\n\26\3\26\3\26\5\26\u0168\n\26"+
		"\3\26\3\26\5\26\u016c\n\26\3\27\3\27\5\27\u0170\n\27\6\27\u0172\n\27\r"+
		"\27\16\27\u0173\3\30\3\30\5\30\u0178\n\30\3\30\3\30\5\30\u017c\n\30\3"+
		"\30\7\30\u017f\n\30\f\30\16\30\u0182\13\30\3\31\3\31\5\31\u0186\n\31\3"+
		"\31\3\31\5\31\u018a\n\31\3\31\7\31\u018d\n\31\f\31\16\31\u0190\13\31\3"+
		"\32\3\32\3\32\3\32\3\33\6\33\u0197\n\33\r\33\16\33\u0198\3\34\3\34\7\34"+
		"\u019d\n\34\f\34\16\34\u01a0\13\34\3\34\3\34\3\34\3\u019e\3\24\35\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66\2\7\3\2\3\6\4"+
		"\2\7\7+.\3\2-.\3\2\22\25\3\2\34!\2\u01cf\2B\3\2\2\2\4N\3\2\2\2\6P\3\2"+
		"\2\2\bR\3\2\2\2\nY\3\2\2\2\fh\3\2\2\2\16j\3\2\2\2\20p\3\2\2\2\22v\3\2"+
		"\2\2\24\u009a\3\2\2\2\26\u00aa\3\2\2\2\30\u00b8\3\2\2\2\32\u00c1\3\2\2"+
		"\2\34\u00db\3\2\2\2\36\u00ec\3\2\2\2 \u00f0\3\2\2\2\"\u00fe\3\2\2\2$\u0102"+
		"\3\2\2\2&\u0119\3\2\2\2(\u0137\3\2\2\2*\u016b\3\2\2\2,\u0171\3\2\2\2."+
		"\u0175\3\2\2\2\60\u0183\3\2\2\2\62\u0191\3\2\2\2\64\u0196\3\2\2\2\66\u019a"+
		"\3\2\2\28:\5\64\33\298\3\2\2\29:\3\2\2\2:=\3\2\2\2;>\5*\26\2<>\5\4\3\2"+
		"=;\3\2\2\2=<\3\2\2\2>@\3\2\2\2?A\5\64\33\2@?\3\2\2\2@A\3\2\2\2AC\3\2\2"+
		"\2B9\3\2\2\2CD\3\2\2\2DB\3\2\2\2DE\3\2\2\2E\3\3\2\2\2FO\5\26\f\2GO\5\30"+
		"\r\2HO\5\32\16\2IO\5 \21\2JO\5$\23\2KO\5(\25\2LO\5\22\n\2MO\5\66\34\2"+
		"NF\3\2\2\2NG\3\2\2\2NH\3\2\2\2NI\3\2\2\2NJ\3\2\2\2NK\3\2\2\2NL\3\2\2\2"+
		"NM\3\2\2\2O\5\3\2\2\2PQ\t\2\2\2Q\7\3\2\2\2RV\7+\2\2SU\t\3\2\2TS\3\2\2"+
		"\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2W\t\3\2\2\2XV\3\2\2\2Y]\7+\2\2Z\\\t\3"+
		"\2\2[Z\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^\13\3\2\2\2_]\3\2\2\2`d"+
		"\7-\2\2ac\t\4\2\2ba\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2ei\3\2\2\2fd"+
		"\3\2\2\2gi\7.\2\2h`\3\2\2\2hg\3\2\2\2i\r\3\2\2\2jk\7\b\2\2kl\5\f\7\2l"+
		"m\7\t\2\2mn\5\f\7\2no\7\n\2\2o\17\3\2\2\2pq\7\13\2\2qr\5\f\7\2rs\7\t\2"+
		"\2st\5\f\7\2tu\7\f\2\2u\21\3\2\2\2vw\7\r\2\2wz\5\64\33\2x{\5\b\5\2y{\5"+
		"\16\b\2zx\3\2\2\2zy\3\2\2\2{|\3\2\2\2|}\5\64\33\2}~\7\16\2\2~\177\5\64"+
		"\33\2\177\u0080\5\b\5\2\u0080\u0081\5\64\33\2\u0081\u0082\7\17\2\2\u0082"+
		"\u0085\5\64\33\2\u0083\u0086\5\b\5\2\u0084\u0086\5\f\7\2\u0085\u0083\3"+
		"\2\2\2\u0085\u0084\3\2\2\2\u0086\u008e\3\2\2\2\u0087\u0088\5\64\33\2\u0088"+
		"\u0089\7\20\2\2\u0089\u008c\5\64\33\2\u008a\u008d\5\b\5\2\u008b\u008d"+
		"\5\f\7\2\u008c\u008a\3\2\2\2\u008c\u008b\3\2\2\2\u008d\u008f\3\2\2\2\u008e"+
		"\u0087\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0091\3\2\2\2\u0090\u0092\5\64"+
		"\33\2\u0091\u0090\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093\3\2\2\2\u0093"+
		"\u0094\7\21\2\2\u0094\23\3\2\2\2\u0095\u0096\b\13\1\2\u0096\u009b\5\f"+
		"\7\2\u0097\u009b\5\16\b\2\u0098\u009b\5\20\t\2\u0099\u009b\5\b\5\2\u009a"+
		"\u0095\3\2\2\2\u009a\u0097\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u0099\3\2"+
		"\2\2\u009b\u00a7\3\2\2\2\u009c\u009e\f\7\2\2\u009d\u009f\5\64\33\2\u009e"+
		"\u009d\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a2\t\5"+
		"\2\2\u00a1\u00a3\5\64\33\2\u00a2\u00a1\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3"+
		"\u00a4\3\2\2\2\u00a4\u00a6\5\24\13\b\u00a5\u009c\3\2\2\2\u00a6\u00a9\3"+
		"\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\25\3\2\2\2\u00a9"+
		"\u00a7\3\2\2\2\u00aa\u00ab\7\26\2\2\u00ab\u00ac\5\64\33\2\u00ac\u00ad"+
		"\5\6\4\2\u00ad\u00ae\5\64\33\2\u00ae\u00af\5\b\5\2\u00af\u00b0\5\64\33"+
		"\2\u00b0\u00b1\7\27\2\2\u00b1\u00b2\5\64\33\2\u00b2\u00b4\5\24\13\2\u00b3"+
		"\u00b5\5\64\33\2\u00b4\u00b3\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6\3"+
		"\2\2\2\u00b6\u00b7\7\21\2\2\u00b7\27\3\2\2\2\u00b8\u00b9\7\30\2\2\u00b9"+
		"\u00ba\5\64\33\2\u00ba\u00bb\5\b\5\2\u00bb\u00bc\5\64\33\2\u00bc\u00bd"+
		"\7\27\2\2\u00bd\u00be\5\64\33\2\u00be\u00bf\5\24\13\2\u00bf\u00c0\7\21"+
		"\2\2\u00c0\31\3\2\2\2\u00c1\u00c3\7\31\2\2\u00c2\u00c4\5\64\33\2\u00c3"+
		"\u00c2\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c7\7\13"+
		"\2\2\u00c6\u00c8\5\64\33\2\u00c7\u00c6\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8"+
		"\u00c9\3\2\2\2\u00c9\u00cb\5\34\17\2\u00ca\u00cc\5\64\33\2\u00cb\u00ca"+
		"\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00ce\7\f\2\2\u00ce"+
		"\u00cf\5\64\33\2\u00cf\u00d0\7\32\2\2\u00d0\u00d1\5\64\33\2\u00d1\u00d2"+
		"\5\36\20\2\u00d2\u00d3\5\64\33\2\u00d3\u00d5\7\33\2\2\u00d4\u00d6\5\64"+
		"\33\2\u00d5\u00d4\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7"+
		"\u00d8\7\21\2\2\u00d8\33\3\2\2\2\u00d9\u00dc\5\24\13\2\u00da\u00dc\5\b"+
		"\5\2\u00db\u00d9\3\2\2\2\u00db\u00da\3\2\2\2\u00dc\u00de\3\2\2\2\u00dd"+
		"\u00df\5\64\33\2\u00de\u00dd\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e0\3"+
		"\2\2\2\u00e0\u00e2\t\6\2\2\u00e1\u00e3\5\64\33\2\u00e2\u00e1\3\2\2\2\u00e2"+
		"\u00e3\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e7\5\24\13\2\u00e5\u00e7\5"+
		"\b\5\2\u00e6\u00e4\3\2\2\2\u00e6\u00e5\3\2\2\2\u00e7\35\3\2\2\2\u00e8"+
		"\u00ea\5\4\3\2\u00e9\u00eb\5\64\33\2\u00ea\u00e9\3\2\2\2\u00ea\u00eb\3"+
		"\2\2\2\u00eb\u00ed\3\2\2\2\u00ec\u00e8\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee"+
		"\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\37\3\2\2\2\u00f0\u00f1\7\"\2"+
		"\2\u00f1\u00f2\5\64\33\2\u00f2\u00f3\5\"\22\2\u00f3\u00f4\5\64\33\2\u00f4"+
		"\u00f6\7#\2\2\u00f5\u00f7\5\64\33\2\u00f6\u00f5\3\2\2\2\u00f6\u00f7\3"+
		"\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f9\7\21\2\2\u00f9!\3\2\2\2\u00fa\u00fc"+
		"\5\22\n\2\u00fb\u00fd\5\64\33\2\u00fc\u00fb\3\2\2\2\u00fc\u00fd\3\2\2"+
		"\2\u00fd\u00ff\3\2\2\2\u00fe\u00fa\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u00fe"+
		"\3\2\2\2\u0100\u0101\3\2\2\2\u0101#\3\2\2\2\u0102\u0104\7$\2\2\u0103\u0105"+
		"\5\64\33\2\u0104\u0103\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0106\3\2\2\2"+
		"\u0106\u0108\7\13\2\2\u0107\u0109\5\64\33\2\u0108\u0107\3\2\2\2\u0108"+
		"\u0109\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010c\5\34\17\2\u010b\u010d\5"+
		"\64\33\2\u010c\u010b\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010e\3\2\2\2\u010e"+
		"\u010f\7\f\2\2\u010f\u0110\5\64\33\2\u0110\u0111\5&\24\2\u0111\u0112\5"+
		"\64\33\2\u0112\u0114\7%\2\2\u0113\u0115\5\64\33\2\u0114\u0113\3\2\2\2"+
		"\u0114\u0115\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0117\7\21\2\2\u0117%\3"+
		"\2\2\2\u0118\u011a\5\4\3\2\u0119\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b"+
		"\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\'\3\2\2\2\u011d\u011e\5\n\6\2"+
		"\u011e\u0120\7\13\2\2\u011f\u0121\5\64\33\2\u0120\u011f\3\2\2\2\u0120"+
		"\u0121\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0124\7\f\2\2\u0123\u0125\5\64"+
		"\33\2\u0124\u0123\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0126\3\2\2\2\u0126"+
		"\u0127\7\21\2\2\u0127\u0138\3\2\2\2\u0128\u0129\5\n\6\2\u0129\u012b\7"+
		"\13\2\2\u012a\u012c\5\64\33\2\u012b\u012a\3\2\2\2\u012b\u012c\3\2\2\2"+
		"\u012c\u012d\3\2\2\2\u012d\u012f\5\60\31\2\u012e\u0130\5\64\33\2\u012f"+
		"\u012e\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0133\7\f"+
		"\2\2\u0132\u0134\5\64\33\2\u0133\u0132\3\2\2\2\u0133\u0134\3\2\2\2\u0134"+
		"\u0135\3\2\2\2\u0135\u0136\7\21\2\2\u0136\u0138\3\2\2\2\u0137\u011d\3"+
		"\2\2\2\u0137\u0128\3\2\2\2\u0138)\3\2\2\2\u0139\u013a\7&\2\2\u013a\u013b"+
		"\5\64\33\2\u013b\u013c\5\n\6\2\u013c\u013e\7\13\2\2\u013d\u013f\5\64\33"+
		"\2\u013e\u013d\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0141"+
		"\7\f\2\2\u0141\u0142\5\64\33\2\u0142\u0144\7\27\2\2\u0143\u0145\5\64\33"+
		"\2\u0144\u0143\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0148"+
		"\5,\27\2\u0147\u0149\5\64\33\2\u0148\u0147\3\2\2\2\u0148\u0149\3\2\2\2"+
		"\u0149\u014a\3\2\2\2\u014a\u014c\7\'\2\2\u014b\u014d\5\64\33\2\u014c\u014b"+
		"\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u014f\7\21\2\2"+
		"\u014f\u016c\3\2\2\2\u0150\u0151\7&\2\2\u0151\u0152\5\64\33\2\u0152\u0153"+
		"\5\n\6\2\u0153\u0155\7\13\2\2\u0154\u0156\5\64\33\2\u0155\u0154\3\2\2"+
		"\2\u0155\u0156\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0159\5.\30\2\u0158\u015a"+
		"\5\64\33\2\u0159\u0158\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015b\3\2\2\2"+
		"\u015b\u015c\7\f\2\2\u015c\u015d\5\64\33\2\u015d\u015f\7\27\2\2\u015e"+
		"\u0160\5\64\33\2\u015f\u015e\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u0161\3"+
		"\2\2\2\u0161\u0163\5,\27\2\u0162\u0164\5\64\33\2\u0163\u0162\3\2\2\2\u0163"+
		"\u0164\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0167\7\'\2\2\u0166\u0168\5\64"+
		"\33\2\u0167\u0166\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u0169\3\2\2\2\u0169"+
		"\u016a\7\21\2\2\u016a\u016c\3\2\2\2\u016b\u0139\3\2\2\2\u016b\u0150\3"+
		"\2\2\2\u016c+\3\2\2\2\u016d\u016f\5\4\3\2\u016e\u0170\5\64\33\2\u016f"+
		"\u016e\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0172\3\2\2\2\u0171\u016d\3\2"+
		"\2\2\u0172\u0173\3\2\2\2\u0173\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174"+
		"-\3\2\2\2\u0175\u0180\5\62\32\2\u0176\u0178\5\64\33\2\u0177\u0176\3\2"+
		"\2\2\u0177\u0178\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u017b\7\t\2\2\u017a"+
		"\u017c\5\64\33\2\u017b\u017a\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017d\3"+
		"\2\2\2\u017d\u017f\5\62\32\2\u017e\u0177\3\2\2\2\u017f\u0182\3\2\2\2\u0180"+
		"\u017e\3\2\2\2\u0180\u0181\3\2\2\2\u0181/\3\2\2\2\u0182\u0180\3\2\2\2"+
		"\u0183\u018e\5\b\5\2\u0184\u0186\5\64\33\2\u0185\u0184\3\2\2\2\u0185\u0186"+
		"\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u0189\7\t\2\2\u0188\u018a\5\64\33\2"+
		"\u0189\u0188\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018d"+
		"\5\b\5\2\u018c\u0185\3\2\2\2\u018d\u0190\3\2\2\2\u018e\u018c\3\2\2\2\u018e"+
		"\u018f\3\2\2\2\u018f\61\3\2\2\2\u0190\u018e\3\2\2\2\u0191\u0192\5\6\4"+
		"\2\u0192\u0193\5\64\33\2\u0193\u0194\5\b\5\2\u0194\63\3\2\2\2\u0195\u0197"+
		"\7*\2\2\u0196\u0195\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u0196\3\2\2\2\u0198"+
		"\u0199\3\2\2\2\u0199\65\3\2\2\2\u019a\u019e\7(\2\2\u019b\u019d\13\2\2"+
		"\2\u019c\u019b\3\2\2\2\u019d\u01a0\3\2\2\2\u019e\u019f\3\2\2\2\u019e\u019c"+
		"\3\2\2\2\u019f\u01a1\3\2\2\2\u01a0\u019e\3\2\2\2\u01a1\u01a2\7)\2\2\u01a2"+
		"\67\3\2\2\2A9=@DNV]dhz\u0085\u008c\u008e\u0091\u009a\u009e\u00a2\u00a7"+
		"\u00b4\u00c3\u00c7\u00cb\u00d5\u00db\u00de\u00e2\u00e6\u00ea\u00ee\u00f6"+
		"\u00fc\u0100\u0104\u0108\u010c\u0114\u011b\u0120\u0124\u012b\u012f\u0133"+
		"\u0137\u013e\u0144\u0148\u014c\u0155\u0159\u015f\u0163\u0167\u016b\u016f"+
		"\u0173\u0177\u017b\u0180\u0185\u0189\u018e\u0198\u019e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}