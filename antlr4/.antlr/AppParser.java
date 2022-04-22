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
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, WS=55, LOWERCASELETTER=56, UPPERCASELETTER=57, NONZERODIGIT=58, 
		ZERO=59;
	public static final int
		RULE_primaryExpression = 0, RULE_instruction = 1, RULE_variableType = 2, 
		RULE_variableName = 3, RULE_functionName = 4, RULE_integer = 5, RULE_float_type = 6, 
		RULE_time_type = 7, RULE_force_type = 8, RULE_object_type = 9, RULE_applyForce = 10, 
		RULE_arithmeticalExpression = 11, RULE_declaration = 12, RULE_definition = 13, 
		RULE_conditionalStatement = 14, RULE_condition = 15, RULE_conditionBody = 16, 
		RULE_parallelExpression = 17, RULE_parallelBody = 18, RULE_loop = 19, 
		RULE_loopBody = 20, RULE_functionCall = 21, RULE_functionDeclaration = 22, 
		RULE_functionBody = 23, RULE_functionArgs = 24, RULE_functionParams = 25, 
		RULE_functionArgument = 26, RULE_comment = 27, RULE_scopeName = 28, RULE_scopeSequence = 29, 
		RULE_scopeDeclaration = 30, RULE_whiteSpace = 31, RULE_getAngle = 32, 
		RULE_getCoordinate = 33, RULE_getDistance = 34, RULE_getVelocity = 35;
	private static String[] makeRuleNames() {
		return new String[] {
			"primaryExpression", "instruction", "variableType", "variableName", "functionName", 
			"integer", "float_type", "time_type", "force_type", "object_type", "applyForce", 
			"arithmeticalExpression", "declaration", "definition", "conditionalStatement", 
			"condition", "conditionBody", "parallelExpression", "parallelBody", "loop", 
			"loopBody", "functionCall", "functionDeclaration", "functionBody", "functionArgs", 
			"functionParams", "functionArgument", "comment", "scopeName", "scopeSequence", 
			"scopeDeclaration", "whiteSpace", "getAngle", "getCoordinate", "getDistance", 
			"getVelocity"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'TIME'", "'INT'", "'FORCE'", "'OBJECT'", "'FLOAT'", "'_'", "'-'", 
			"'.'", "':'", "'['", "','", "']'", "'('", "')'", "'APPLY'", "'TO'", "'FOR'", 
			"'DELAY'", "';'", "'+'", "'/'", "'*'", "'DEFINE'", "'AS'", "'SET'", "'IF'", 
			"'THEN'", "'ENDIF'", "'=='", "'>'", "'<'", "'>='", "'<='", "'!='", "'PARALLEL'", 
			"'ENDPARALLEL'", "'LOOP'", "'ENDLOOP'", "'DEFINE FUNCTION'", "'->'", 
			"'ENDFUNCTION'", "'/*'", "'*/'", "'::'", "'{'", "'}'", "'ANGLE BETWEEN'", 
			"'COORDINATE'", "'X'", "'Y'", "'OF'", "'DISTANCE BETWEEN'", "'VELOCITY'", 
			"'VALUE'", null, null, null, null, "'0'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "WS", "LOWERCASELETTER", "UPPERCASELETTER", 
			"NONZERODIGIT", "ZERO"
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
		public List<ScopeDeclarationContext> scopeDeclaration() {
			return getRuleContexts(ScopeDeclarationContext.class);
		}
		public ScopeDeclarationContext scopeDeclaration(int i) {
			return getRuleContext(ScopeDeclarationContext.class,i);
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
			setState(83); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(72);
					whiteSpace();
					}
				}

				setState(78);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(75);
					functionDeclaration();
					}
					break;
				case 2:
					{
					setState(76);
					instruction();
					}
					break;
				case 3:
					{
					setState(77);
					scopeDeclaration();
					}
					break;
				}
				setState(81);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(80);
					whiteSpace();
					}
					break;
				}
				}
				}
				setState(85); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__22) | (1L << T__24) | (1L << T__25) | (1L << T__34) | (1L << T__36) | (1L << T__38) | (1L << T__41) | (1L << WS) | (1L << LOWERCASELETTER) | (1L << UPPERCASELETTER))) != 0) );
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
			setState(95);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__22:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				declaration();
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				definition();
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 3);
				{
				setState(89);
				conditionalStatement();
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 4);
				{
				setState(90);
				parallelExpression();
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 5);
				{
				setState(91);
				loop();
				}
				break;
			case LOWERCASELETTER:
			case UPPERCASELETTER:
				enterOuterAlt(_localctx, 6);
				{
				setState(92);
				functionCall();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 7);
				{
				setState(93);
				applyForce();
				}
				break;
			case T__41:
				enterOuterAlt(_localctx, 8);
				{
				setState(94);
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
			setState(97);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4))) != 0)) ) {
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
		public ScopeSequenceContext scope_seq;
		public List<TerminalNode> LOWERCASELETTER() { return getTokens(AppParser.LOWERCASELETTER); }
		public TerminalNode LOWERCASELETTER(int i) {
			return getToken(AppParser.LOWERCASELETTER, i);
		}
		public ScopeSequenceContext scopeSequence() {
			return getRuleContext(ScopeSequenceContext.class,0);
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
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UPPERCASELETTER) {
				{
				setState(99);
				((VariableNameContext)_localctx).scope_seq = scopeSequence();
				}
			}

			setState(102);
			match(LOWERCASELETTER);
			setState(106);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(103);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << LOWERCASELETTER) | (1L << UPPERCASELETTER) | (1L << NONZERODIGIT) | (1L << ZERO))) != 0)) ) {
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
				setState(108);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
			setState(109);
			match(LOWERCASELETTER);
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << LOWERCASELETTER) | (1L << UPPERCASELETTER) | (1L << NONZERODIGIT) | (1L << ZERO))) != 0)) {
				{
				{
				setState(110);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << LOWERCASELETTER) | (1L << UPPERCASELETTER) | (1L << NONZERODIGIT) | (1L << ZERO))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(115);
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
			setState(124);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NONZERODIGIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				match(NONZERODIGIT);
				setState(120);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(117);
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
					setState(122);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				}
				}
				break;
			case ZERO:
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
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

	public static class Float_typeContext extends ParserRuleContext {
		public Token minus;
		public List<TerminalNode> NONZERODIGIT() { return getTokens(AppParser.NONZERODIGIT); }
		public TerminalNode NONZERODIGIT(int i) {
			return getToken(AppParser.NONZERODIGIT, i);
		}
		public List<TerminalNode> ZERO() { return getTokens(AppParser.ZERO); }
		public TerminalNode ZERO(int i) {
			return getToken(AppParser.ZERO, i);
		}
		public Float_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_float_type; }
	}

	public final Float_typeContext float_type() throws RecognitionException {
		Float_typeContext _localctx = new Float_typeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_float_type);
		int _la;
		try {
			int _alt;
			setState(151);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
			case NONZERODIGIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__6) {
					{
					setState(126);
					((Float_typeContext)_localctx).minus = match(T__6);
					}
				}

				setState(129);
				match(NONZERODIGIT);
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NONZERODIGIT || _la==ZERO) {
					{
					{
					setState(130);
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
					setState(135);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(136);
				match(T__7);
				setState(140);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(137);
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
					setState(142);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				}
				break;
			case ZERO:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				match(ZERO);
				setState(144);
				match(T__7);
				setState(148);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(145);
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
					setState(150);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public static class Time_typeContext extends ParserRuleContext {
		public List<TerminalNode> NONZERODIGIT() { return getTokens(AppParser.NONZERODIGIT); }
		public TerminalNode NONZERODIGIT(int i) {
			return getToken(AppParser.NONZERODIGIT, i);
		}
		public List<TerminalNode> ZERO() { return getTokens(AppParser.ZERO); }
		public TerminalNode ZERO(int i) {
			return getToken(AppParser.ZERO, i);
		}
		public Time_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time_type; }
	}

	public final Time_typeContext time_type() throws RecognitionException {
		Time_typeContext _localctx = new Time_typeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_time_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(153);
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
				setState(156); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NONZERODIGIT || _la==ZERO );
			setState(158);
			match(T__8);
			setState(159);
			_la = _input.LA(1);
			if ( !(_la==NONZERODIGIT || _la==ZERO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(160);
			_la = _input.LA(1);
			if ( !(_la==NONZERODIGIT || _la==ZERO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(161);
			match(T__8);
			setState(162);
			_la = _input.LA(1);
			if ( !(_la==NONZERODIGIT || _la==ZERO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(163);
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
		enterRule(_localctx, 16, RULE_force_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(T__9);
			setState(166);
			((Force_typeContext)_localctx).angle = integer();
			setState(167);
			match(T__10);
			setState(168);
			((Force_typeContext)_localctx).power = integer();
			setState(169);
			match(T__11);
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
		enterRule(_localctx, 18, RULE_object_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(T__12);
			setState(172);
			((Object_typeContext)_localctx).x_cor = integer();
			setState(173);
			match(T__10);
			setState(174);
			((Object_typeContext)_localctx).y_cor = integer();
			setState(175);
			match(T__13);
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
		public Time_typeContext time_type_val;
		public VariableNameContext delay_;
		public IntegerContext delay_val_;
		public Time_typeContext delay_time_type_val;
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
		public List<Time_typeContext> time_type() {
			return getRuleContexts(Time_typeContext.class);
		}
		public Time_typeContext time_type(int i) {
			return getRuleContext(Time_typeContext.class,i);
		}
		public ApplyForceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_applyForce; }
	}

	public final ApplyForceContext applyForce() throws RecognitionException {
		ApplyForceContext _localctx = new ApplyForceContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_applyForce);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(T__14);
			setState(178);
			whiteSpace();
			setState(181);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOWERCASELETTER:
			case UPPERCASELETTER:
				{
				setState(179);
				((ApplyForceContext)_localctx).force_ = variableName();
				}
				break;
			case T__9:
				{
				setState(180);
				((ApplyForceContext)_localctx).force_val = force_type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(183);
			whiteSpace();
			setState(184);
			match(T__15);
			setState(185);
			whiteSpace();
			setState(186);
			((ApplyForceContext)_localctx).object_ = variableName();
			setState(187);
			whiteSpace();
			setState(188);
			match(T__16);
			setState(189);
			whiteSpace();
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(190);
				((ApplyForceContext)_localctx).time_ = variableName();
				}
				break;
			case 2:
				{
				setState(191);
				((ApplyForceContext)_localctx).time_val = integer();
				}
				break;
			case 3:
				{
				setState(192);
				((ApplyForceContext)_localctx).time_type_val = time_type();
				}
				break;
			}
			setState(203);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(195);
				whiteSpace();
				setState(196);
				match(T__17);
				setState(197);
				whiteSpace();
				setState(201);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(198);
					((ApplyForceContext)_localctx).delay_ = variableName();
					}
					break;
				case 2:
					{
					setState(199);
					((ApplyForceContext)_localctx).delay_val_ = integer();
					}
					break;
				case 3:
					{
					setState(200);
					((ApplyForceContext)_localctx).delay_time_type_val = time_type();
					}
					break;
				}
				}
				break;
			}
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(205);
				whiteSpace();
				}
			}

			setState(208);
			match(T__18);
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
		public Float_typeContext float_type() {
			return getRuleContext(Float_typeContext.class,0);
		}
		public Force_typeContext force_type() {
			return getRuleContext(Force_typeContext.class,0);
		}
		public Object_typeContext object_type() {
			return getRuleContext(Object_typeContext.class,0);
		}
		public Time_typeContext time_type() {
			return getRuleContext(Time_typeContext.class,0);
		}
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public GetAngleContext getAngle() {
			return getRuleContext(GetAngleContext.class,0);
		}
		public GetCoordinateContext getCoordinate() {
			return getRuleContext(GetCoordinateContext.class,0);
		}
		public GetDistanceContext getDistance() {
			return getRuleContext(GetDistanceContext.class,0);
		}
		public GetVelocityContext getVelocity() {
			return getRuleContext(GetVelocityContext.class,0);
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
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_arithmeticalExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(211);
				integer();
				}
				break;
			case 2:
				{
				setState(212);
				float_type();
				}
				break;
			case 3:
				{
				setState(213);
				force_type();
				}
				break;
			case 4:
				{
				setState(214);
				object_type();
				}
				break;
			case 5:
				{
				setState(215);
				time_type();
				}
				break;
			case 6:
				{
				setState(216);
				variableName();
				}
				break;
			case 7:
				{
				setState(217);
				functionCall();
				}
				break;
			case 8:
				{
				setState(218);
				getAngle();
				}
				break;
			case 9:
				{
				setState(219);
				getCoordinate();
				}
				break;
			case 10:
				{
				setState(220);
				getDistance();
				}
				break;
			case 11:
				{
				setState(221);
				getVelocity();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(235);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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
					setState(224);
					if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
					setState(226);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(225);
						whiteSpace();
						}
					}

					setState(228);
					((ArithmeticalExpressionContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__19) | (1L << T__20) | (1L << T__21))) != 0)) ) {
						((ArithmeticalExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(230);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(229);
						whiteSpace();
						}
					}

					setState(232);
					((ArithmeticalExpressionContext)_localctx).right = arithmeticalExpression(13);
					}
					} 
				}
				setState(237);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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
		enterRule(_localctx, 24, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(T__22);
			setState(239);
			whiteSpace();
			setState(240);
			((DeclarationContext)_localctx).type_sim = variableType();
			setState(241);
			whiteSpace();
			setState(242);
			((DeclarationContext)_localctx).name_ = variableName();
			setState(243);
			whiteSpace();
			setState(244);
			match(T__23);
			setState(245);
			whiteSpace();
			setState(246);
			((DeclarationContext)_localctx).value_ = arithmeticalExpression(0);
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
			match(T__18);
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
		enterRule(_localctx, 26, RULE_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(T__24);
			setState(253);
			whiteSpace();
			setState(254);
			((DefinitionContext)_localctx).name_ = variableName();
			setState(255);
			whiteSpace();
			setState(256);
			match(T__23);
			setState(257);
			whiteSpace();
			setState(258);
			((DefinitionContext)_localctx).value_ = arithmeticalExpression(0);
			setState(259);
			match(T__18);
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
		enterRule(_localctx, 28, RULE_conditionalStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(T__25);
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(262);
				whiteSpace();
				}
			}

			setState(265);
			match(T__12);
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(266);
				whiteSpace();
				}
			}

			setState(269);
			((ConditionalStatementContext)_localctx).cond = condition();
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(270);
				whiteSpace();
				}
			}

			setState(273);
			match(T__13);
			setState(274);
			whiteSpace();
			setState(275);
			match(T__26);
			setState(276);
			whiteSpace();
			setState(277);
			((ConditionalStatementContext)_localctx).con_body = conditionBody();
			setState(278);
			whiteSpace();
			setState(279);
			match(T__27);
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(280);
				whiteSpace();
				}
			}

			setState(283);
			match(T__18);
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
		enterRule(_localctx, 30, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(285);
				((ConditionContext)_localctx).left_expr = arithmeticalExpression(0);
				}
				break;
			case 2:
				{
				setState(286);
				((ConditionContext)_localctx).left_var = variableName();
				}
				break;
			}
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
			((ConditionContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33))) != 0)) ) {
				((ConditionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(293);
				whiteSpace();
				}
			}

			setState(298);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(296);
				((ConditionContext)_localctx).right_expr = arithmeticalExpression(0);
				}
				break;
			case 2:
				{
				setState(297);
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
		enterRule(_localctx, 32, RULE_conditionBody);
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
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
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
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__22) | (1L << T__24) | (1L << T__25) | (1L << T__34) | (1L << T__36) | (1L << T__41) | (1L << LOWERCASELETTER) | (1L << UPPERCASELETTER))) != 0) );
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
		enterRule(_localctx, 34, RULE_parallelExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			match(T__34);
			setState(309);
			whiteSpace();
			setState(310);
			((ParallelExpressionContext)_localctx).par_body = parallelBody();
			setState(311);
			whiteSpace();
			setState(312);
			match(T__35);
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
			match(T__18);
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
		enterRule(_localctx, 36, RULE_parallelBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(318);
				((ParallelBodyContext)_localctx).app_force_ = applyForce();
				setState(320);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(319);
					whiteSpace();
					}
					break;
				}
				}
				}
				setState(324); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__14 );
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
		enterRule(_localctx, 38, RULE_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			match(T__36);
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(327);
				whiteSpace();
				}
			}

			setState(330);
			match(T__12);
			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(331);
				whiteSpace();
				}
			}

			setState(334);
			condition();
			setState(336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(335);
				whiteSpace();
				}
			}

			setState(338);
			match(T__13);
			setState(339);
			whiteSpace();
			setState(340);
			((LoopContext)_localctx).l_body = loopBody();
			setState(341);
			whiteSpace();
			setState(342);
			match(T__37);
			setState(344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(343);
				whiteSpace();
				}
			}

			setState(346);
			match(T__18);
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
		enterRule(_localctx, 40, RULE_loopBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(348);
				instruction();
				}
				}
				setState(351); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__22) | (1L << T__24) | (1L << T__25) | (1L << T__34) | (1L << T__36) | (1L << T__41) | (1L << LOWERCASELETTER) | (1L << UPPERCASELETTER))) != 0) );
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
		public ScopeSequenceContext scope_seq;
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
		public ScopeSequenceContext scopeSequence() {
			return getRuleContext(ScopeSequenceContext.class,0);
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
		enterRule(_localctx, 42, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UPPERCASELETTER) {
				{
				setState(353);
				((FunctionCallContext)_localctx).scope_seq = scopeSequence();
				}
			}

			setState(356);
			((FunctionCallContext)_localctx).f_name = functionName();
			setState(357);
			match(T__12);
			setState(359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(358);
				whiteSpace();
				}
			}

			setState(365);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOWERCASELETTER || _la==UPPERCASELETTER) {
				{
				setState(361);
				((FunctionCallContext)_localctx).f_args = functionParams();
				setState(363);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(362);
					whiteSpace();
					}
				}

				}
			}

			setState(367);
			match(T__13);
			setState(369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(368);
				whiteSpace();
				}
			}

			setState(371);
			match(T__18);
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
		public FunctionArgsContext f_args;
		public VariableTypeContext return_type;
		public FunctionBodyContext f_body;
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
		public VariableTypeContext variableType() {
			return getRuleContext(VariableTypeContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			match(T__38);
			setState(374);
			whiteSpace();
			setState(375);
			((FunctionDeclarationContext)_localctx).f_name = functionName();
			setState(376);
			match(T__12);
			setState(378);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(377);
				whiteSpace();
				}
				break;
			}
			setState(381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4))) != 0)) {
				{
				setState(380);
				((FunctionDeclarationContext)_localctx).f_args = functionArgs();
				}
			}

			setState(384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(383);
				whiteSpace();
				}
			}

			setState(386);
			match(T__13);
			setState(398);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(388);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(387);
					whiteSpace();
					}
				}

				setState(390);
				match(T__39);
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
				((FunctionDeclarationContext)_localctx).return_type = variableType();
				setState(396);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
				case 1:
					{
					setState(395);
					whiteSpace();
					}
					break;
				}
				}
				break;
			}
			setState(400);
			whiteSpace();
			setState(401);
			match(T__23);
			setState(403);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(402);
				whiteSpace();
				}
			}

			setState(405);
			((FunctionDeclarationContext)_localctx).f_body = functionBody();
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
			match(T__40);
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
			match(T__18);
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
		enterRule(_localctx, 46, RULE_functionBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(415);
				instruction();
				setState(417);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
				case 1:
					{
					setState(416);
					whiteSpace();
					}
					break;
				}
				}
				}
				setState(421); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__22) | (1L << T__24) | (1L << T__25) | (1L << T__34) | (1L << T__36) | (1L << T__41) | (1L << LOWERCASELETTER) | (1L << UPPERCASELETTER))) != 0) );
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
		enterRule(_localctx, 48, RULE_functionArgs);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			functionArgument();
			setState(434);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(425);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(424);
						whiteSpace();
						}
					}

					setState(427);
					match(T__10);
					setState(429);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(428);
						whiteSpace();
						}
					}

					setState(431);
					functionArgument();
					}
					} 
				}
				setState(436);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
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
		enterRule(_localctx, 50, RULE_functionParams);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			variableName();
			setState(448);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(439);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(438);
						whiteSpace();
						}
					}

					setState(441);
					match(T__10);
					setState(443);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(442);
						whiteSpace();
						}
					}

					setState(445);
					variableName();
					}
					} 
				}
				setState(450);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
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
		enterRule(_localctx, 52, RULE_functionArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			((FunctionArgumentContext)_localctx).type_ = variableType();
			setState(452);
			whiteSpace();
			setState(453);
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

	public static class CommentContext extends ParserRuleContext {
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_comment);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
			match(T__41);
			setState(459);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(456);
					matchWildcard();
					}
					} 
				}
				setState(461);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			}
			setState(462);
			match(T__42);
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

	public static class ScopeNameContext extends ParserRuleContext {
		public List<TerminalNode> UPPERCASELETTER() { return getTokens(AppParser.UPPERCASELETTER); }
		public TerminalNode UPPERCASELETTER(int i) {
			return getToken(AppParser.UPPERCASELETTER, i);
		}
		public List<TerminalNode> LOWERCASELETTER() { return getTokens(AppParser.LOWERCASELETTER); }
		public TerminalNode LOWERCASELETTER(int i) {
			return getToken(AppParser.LOWERCASELETTER, i);
		}
		public List<TerminalNode> NONZERODIGIT() { return getTokens(AppParser.NONZERODIGIT); }
		public TerminalNode NONZERODIGIT(int i) {
			return getToken(AppParser.NONZERODIGIT, i);
		}
		public List<TerminalNode> ZERO() { return getTokens(AppParser.ZERO); }
		public TerminalNode ZERO(int i) {
			return getToken(AppParser.ZERO, i);
		}
		public ScopeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scopeName; }
	}

	public final ScopeNameContext scopeName() throws RecognitionException {
		ScopeNameContext _localctx = new ScopeNameContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_scopeName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464);
			match(UPPERCASELETTER);
			setState(468);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << LOWERCASELETTER) | (1L << UPPERCASELETTER) | (1L << NONZERODIGIT) | (1L << ZERO))) != 0)) {
				{
				{
				setState(465);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << LOWERCASELETTER) | (1L << UPPERCASELETTER) | (1L << NONZERODIGIT) | (1L << ZERO))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(470);
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

	public static class ScopeSequenceContext extends ParserRuleContext {
		public List<ScopeNameContext> scopeName() {
			return getRuleContexts(ScopeNameContext.class);
		}
		public ScopeNameContext scopeName(int i) {
			return getRuleContext(ScopeNameContext.class,i);
		}
		public ScopeSequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scopeSequence; }
	}

	public final ScopeSequenceContext scopeSequence() throws RecognitionException {
		ScopeSequenceContext _localctx = new ScopeSequenceContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_scopeSequence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(471);
				scopeName();
				setState(472);
				match(T__43);
				}
				}
				setState(476); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==UPPERCASELETTER );
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

	public static class ScopeDeclarationContext extends ParserRuleContext {
		public ScopeNameContext name;
		public ScopeNameContext scopeName() {
			return getRuleContext(ScopeNameContext.class,0);
		}
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public List<ScopeDeclarationContext> scopeDeclaration() {
			return getRuleContexts(ScopeDeclarationContext.class);
		}
		public ScopeDeclarationContext scopeDeclaration(int i) {
			return getRuleContext(ScopeDeclarationContext.class,i);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public ScopeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scopeDeclaration; }
	}

	public final ScopeDeclarationContext scopeDeclaration() throws RecognitionException {
		ScopeDeclarationContext _localctx = new ScopeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_scopeDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
			((ScopeDeclarationContext)_localctx).name = scopeName();
			setState(480);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(479);
				whiteSpace();
				}
			}

			setState(482);
			match(T__44);
			setState(484);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(483);
				whiteSpace();
				}
			}

			setState(488); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(488);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case UPPERCASELETTER:
					{
					setState(486);
					scopeDeclaration();
					}
					break;
				case T__22:
					{
					setState(487);
					declaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(490); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__22 || _la==UPPERCASELETTER );
			setState(493);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(492);
				whiteSpace();
				}
			}

			setState(495);
			match(T__45);
			setState(497);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(496);
				whiteSpace();
				}
			}

			setState(499);
			match(T__18);
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
		enterRule(_localctx, 62, RULE_whiteSpace);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(502); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(501);
					match(WS);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(504); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
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

	public static class GetAngleContext extends ParserRuleContext {
		public VariableNameContext name_1;
		public Object_typeContext object_1;
		public VariableNameContext name_2;
		public Object_typeContext object_2;
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
		public List<Object_typeContext> object_type() {
			return getRuleContexts(Object_typeContext.class);
		}
		public Object_typeContext object_type(int i) {
			return getRuleContext(Object_typeContext.class,i);
		}
		public GetAngleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getAngle; }
	}

	public final GetAngleContext getAngle() throws RecognitionException {
		GetAngleContext _localctx = new GetAngleContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_getAngle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(506);
			match(T__46);
			setState(508);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(507);
				whiteSpace();
				}
			}

			setState(512);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOWERCASELETTER:
			case UPPERCASELETTER:
				{
				setState(510);
				((GetAngleContext)_localctx).name_1 = variableName();
				}
				break;
			case T__12:
				{
				setState(511);
				((GetAngleContext)_localctx).object_1 = object_type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(515);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(514);
				whiteSpace();
				}
			}

			setState(517);
			match(T__10);
			setState(519);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(518);
				whiteSpace();
				}
			}

			setState(523);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOWERCASELETTER:
			case UPPERCASELETTER:
				{
				setState(521);
				((GetAngleContext)_localctx).name_2 = variableName();
				}
				break;
			case T__12:
				{
				setState(522);
				((GetAngleContext)_localctx).object_2 = object_type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(526);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(525);
				whiteSpace();
				}
			}

			setState(528);
			match(T__18);
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

	public static class GetCoordinateContext extends ParserRuleContext {
		public Token axis;
		public VariableNameContext name_;
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public GetCoordinateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getCoordinate; }
	}

	public final GetCoordinateContext getCoordinate() throws RecognitionException {
		GetCoordinateContext _localctx = new GetCoordinateContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_getCoordinate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
			match(T__47);
			setState(532);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(531);
				whiteSpace();
				}
			}

			setState(534);
			((GetCoordinateContext)_localctx).axis = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__48 || _la==T__49) ) {
				((GetCoordinateContext)_localctx).axis = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(536);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(535);
				whiteSpace();
				}
			}

			setState(538);
			match(T__50);
			setState(540);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(539);
				whiteSpace();
				}
			}

			setState(542);
			((GetCoordinateContext)_localctx).name_ = variableName();
			setState(544);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(543);
				whiteSpace();
				}
			}

			setState(546);
			match(T__18);
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

	public static class GetDistanceContext extends ParserRuleContext {
		public VariableNameContext name_1;
		public Object_typeContext object_1;
		public VariableNameContext name_2;
		public Object_typeContext object_2;
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
		public List<Object_typeContext> object_type() {
			return getRuleContexts(Object_typeContext.class);
		}
		public Object_typeContext object_type(int i) {
			return getRuleContext(Object_typeContext.class,i);
		}
		public GetDistanceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getDistance; }
	}

	public final GetDistanceContext getDistance() throws RecognitionException {
		GetDistanceContext _localctx = new GetDistanceContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_getDistance);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(548);
			match(T__51);
			setState(550);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(549);
				whiteSpace();
				}
			}

			setState(554);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOWERCASELETTER:
			case UPPERCASELETTER:
				{
				setState(552);
				((GetDistanceContext)_localctx).name_1 = variableName();
				}
				break;
			case T__12:
				{
				setState(553);
				((GetDistanceContext)_localctx).object_1 = object_type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(557);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(556);
				whiteSpace();
				}
			}

			setState(559);
			match(T__10);
			setState(561);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(560);
				whiteSpace();
				}
			}

			setState(565);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOWERCASELETTER:
			case UPPERCASELETTER:
				{
				setState(563);
				((GetDistanceContext)_localctx).name_2 = variableName();
				}
				break;
			case T__12:
				{
				setState(564);
				((GetDistanceContext)_localctx).object_2 = object_type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(568);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(567);
				whiteSpace();
				}
			}

			setState(570);
			match(T__18);
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

	public static class GetVelocityContext extends ParserRuleContext {
		public Token axis;
		public VariableNameContext name_;
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public GetVelocityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getVelocity; }
	}

	public final GetVelocityContext getVelocity() throws RecognitionException {
		GetVelocityContext _localctx = new GetVelocityContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_getVelocity);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(572);
			match(T__52);
			setState(574);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(573);
				whiteSpace();
				}
			}

			setState(576);
			((GetVelocityContext)_localctx).axis = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__48) | (1L << T__49) | (1L << T__53))) != 0)) ) {
				((GetVelocityContext)_localctx).axis = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(578);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(577);
				whiteSpace();
				}
			}

			setState(580);
			match(T__50);
			setState(582);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(581);
				whiteSpace();
				}
			}

			setState(584);
			((GetVelocityContext)_localctx).name_ = variableName();
			setState(586);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(585);
				whiteSpace();
				}
			}

			setState(588);
			match(T__18);
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
		case 11:
			return arithmeticalExpression_sempred((ArithmeticalExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean arithmeticalExpression_sempred(ArithmeticalExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 12);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3=\u0251\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\5\2L\n\2\3\2\3\2\3\2\5\2Q\n\2\3\2\5"+
		"\2T\n\2\6\2V\n\2\r\2\16\2W\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3b\n\3\3"+
		"\4\3\4\3\5\5\5g\n\5\3\5\3\5\7\5k\n\5\f\5\16\5n\13\5\3\6\3\6\7\6r\n\6\f"+
		"\6\16\6u\13\6\3\7\3\7\7\7y\n\7\f\7\16\7|\13\7\3\7\5\7\177\n\7\3\b\5\b"+
		"\u0082\n\b\3\b\3\b\7\b\u0086\n\b\f\b\16\b\u0089\13\b\3\b\3\b\7\b\u008d"+
		"\n\b\f\b\16\b\u0090\13\b\3\b\3\b\3\b\7\b\u0095\n\b\f\b\16\b\u0098\13\b"+
		"\5\b\u009a\n\b\3\t\6\t\u009d\n\t\r\t\16\t\u009e\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\5\f\u00b8\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00c4"+
		"\n\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00cc\n\f\5\f\u00ce\n\f\3\f\5\f\u00d1"+
		"\n\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00e1"+
		"\n\r\3\r\3\r\5\r\u00e5\n\r\3\r\3\r\5\r\u00e9\n\r\3\r\7\r\u00ec\n\r\f\r"+
		"\16\r\u00ef\13\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16"+
		"\u00fb\n\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\5\20\u010a\n\20\3\20\3\20\5\20\u010e\n\20\3\20\3\20\5\20\u0112\n"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u011c\n\20\3\20\3\20"+
		"\3\21\3\21\5\21\u0122\n\21\3\21\5\21\u0125\n\21\3\21\3\21\5\21\u0129\n"+
		"\21\3\21\3\21\5\21\u012d\n\21\3\22\3\22\5\22\u0131\n\22\6\22\u0133\n\22"+
		"\r\22\16\22\u0134\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u013d\n\23\3\23\3"+
		"\23\3\24\3\24\5\24\u0143\n\24\6\24\u0145\n\24\r\24\16\24\u0146\3\25\3"+
		"\25\5\25\u014b\n\25\3\25\3\25\5\25\u014f\n\25\3\25\3\25\5\25\u0153\n\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u015b\n\25\3\25\3\25\3\26\6\26\u0160"+
		"\n\26\r\26\16\26\u0161\3\27\5\27\u0165\n\27\3\27\3\27\3\27\5\27\u016a"+
		"\n\27\3\27\3\27\5\27\u016e\n\27\5\27\u0170\n\27\3\27\3\27\5\27\u0174\n"+
		"\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\5\30\u017d\n\30\3\30\5\30\u0180"+
		"\n\30\3\30\5\30\u0183\n\30\3\30\3\30\5\30\u0187\n\30\3\30\3\30\5\30\u018b"+
		"\n\30\3\30\3\30\5\30\u018f\n\30\5\30\u0191\n\30\3\30\3\30\3\30\5\30\u0196"+
		"\n\30\3\30\3\30\5\30\u019a\n\30\3\30\3\30\5\30\u019e\n\30\3\30\3\30\3"+
		"\31\3\31\5\31\u01a4\n\31\6\31\u01a6\n\31\r\31\16\31\u01a7\3\32\3\32\5"+
		"\32\u01ac\n\32\3\32\3\32\5\32\u01b0\n\32\3\32\7\32\u01b3\n\32\f\32\16"+
		"\32\u01b6\13\32\3\33\3\33\5\33\u01ba\n\33\3\33\3\33\5\33\u01be\n\33\3"+
		"\33\7\33\u01c1\n\33\f\33\16\33\u01c4\13\33\3\34\3\34\3\34\3\34\3\35\3"+
		"\35\7\35\u01cc\n\35\f\35\16\35\u01cf\13\35\3\35\3\35\3\36\3\36\7\36\u01d5"+
		"\n\36\f\36\16\36\u01d8\13\36\3\37\3\37\3\37\6\37\u01dd\n\37\r\37\16\37"+
		"\u01de\3 \3 \5 \u01e3\n \3 \3 \5 \u01e7\n \3 \3 \6 \u01eb\n \r \16 \u01ec"+
		"\3 \5 \u01f0\n \3 \3 \5 \u01f4\n \3 \3 \3!\6!\u01f9\n!\r!\16!\u01fa\3"+
		"\"\3\"\5\"\u01ff\n\"\3\"\3\"\5\"\u0203\n\"\3\"\5\"\u0206\n\"\3\"\3\"\5"+
		"\"\u020a\n\"\3\"\3\"\5\"\u020e\n\"\3\"\5\"\u0211\n\"\3\"\3\"\3#\3#\5#"+
		"\u0217\n#\3#\3#\5#\u021b\n#\3#\3#\5#\u021f\n#\3#\3#\5#\u0223\n#\3#\3#"+
		"\3$\3$\5$\u0229\n$\3$\3$\5$\u022d\n$\3$\5$\u0230\n$\3$\3$\5$\u0234\n$"+
		"\3$\3$\5$\u0238\n$\3$\5$\u023b\n$\3$\3$\3%\3%\5%\u0241\n%\3%\3%\5%\u0245"+
		"\n%\3%\3%\5%\u0249\n%\3%\3%\5%\u024d\n%\3%\3%\3%\3\u01cd\3\30&\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFH\2\t\3\2"+
		"\3\7\4\2\b\b:=\3\2<=\4\2\t\t\26\30\3\2\37$\3\2\63\64\4\2\63\6488\2\u029f"+
		"\2U\3\2\2\2\4a\3\2\2\2\6c\3\2\2\2\bf\3\2\2\2\no\3\2\2\2\f~\3\2\2\2\16"+
		"\u0099\3\2\2\2\20\u009c\3\2\2\2\22\u00a7\3\2\2\2\24\u00ad\3\2\2\2\26\u00b3"+
		"\3\2\2\2\30\u00e0\3\2\2\2\32\u00f0\3\2\2\2\34\u00fe\3\2\2\2\36\u0107\3"+
		"\2\2\2 \u0121\3\2\2\2\"\u0132\3\2\2\2$\u0136\3\2\2\2&\u0144\3\2\2\2(\u0148"+
		"\3\2\2\2*\u015f\3\2\2\2,\u0164\3\2\2\2.\u0177\3\2\2\2\60\u01a5\3\2\2\2"+
		"\62\u01a9\3\2\2\2\64\u01b7\3\2\2\2\66\u01c5\3\2\2\28\u01c9\3\2\2\2:\u01d2"+
		"\3\2\2\2<\u01dc\3\2\2\2>\u01e0\3\2\2\2@\u01f8\3\2\2\2B\u01fc\3\2\2\2D"+
		"\u0214\3\2\2\2F\u0226\3\2\2\2H\u023e\3\2\2\2JL\5@!\2KJ\3\2\2\2KL\3\2\2"+
		"\2LP\3\2\2\2MQ\5.\30\2NQ\5\4\3\2OQ\5> \2PM\3\2\2\2PN\3\2\2\2PO\3\2\2\2"+
		"QS\3\2\2\2RT\5@!\2SR\3\2\2\2ST\3\2\2\2TV\3\2\2\2UK\3\2\2\2VW\3\2\2\2W"+
		"U\3\2\2\2WX\3\2\2\2X\3\3\2\2\2Yb\5\32\16\2Zb\5\34\17\2[b\5\36\20\2\\b"+
		"\5$\23\2]b\5(\25\2^b\5,\27\2_b\5\26\f\2`b\58\35\2aY\3\2\2\2aZ\3\2\2\2"+
		"a[\3\2\2\2a\\\3\2\2\2a]\3\2\2\2a^\3\2\2\2a_\3\2\2\2a`\3\2\2\2b\5\3\2\2"+
		"\2cd\t\2\2\2d\7\3\2\2\2eg\5<\37\2fe\3\2\2\2fg\3\2\2\2gh\3\2\2\2hl\7:\2"+
		"\2ik\t\3\2\2ji\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2m\t\3\2\2\2nl\3\2"+
		"\2\2os\7:\2\2pr\t\3\2\2qp\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2t\13\3"+
		"\2\2\2us\3\2\2\2vz\7<\2\2wy\t\4\2\2xw\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3"+
		"\2\2\2{\177\3\2\2\2|z\3\2\2\2}\177\7=\2\2~v\3\2\2\2~}\3\2\2\2\177\r\3"+
		"\2\2\2\u0080\u0082\7\t\2\2\u0081\u0080\3\2\2\2\u0081\u0082\3\2\2\2\u0082"+
		"\u0083\3\2\2\2\u0083\u0087\7<\2\2\u0084\u0086\t\4\2\2\u0085\u0084\3\2"+
		"\2\2\u0086\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088"+
		"\u008a\3\2\2\2\u0089\u0087\3\2\2\2\u008a\u008e\7\n\2\2\u008b\u008d\t\4"+
		"\2\2\u008c\u008b\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e"+
		"\u008f\3\2\2\2\u008f\u009a\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0092\7="+
		"\2\2\u0092\u0096\7\n\2\2\u0093\u0095\t\4\2\2\u0094\u0093\3\2\2\2\u0095"+
		"\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u009a\3\2"+
		"\2\2\u0098\u0096\3\2\2\2\u0099\u0081\3\2\2\2\u0099\u0091\3\2\2\2\u009a"+
		"\17\3\2\2\2\u009b\u009d\t\4\2\2\u009c\u009b\3\2\2\2\u009d\u009e\3\2\2"+
		"\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1"+
		"\7\13\2\2\u00a1\u00a2\t\4\2\2\u00a2\u00a3\t\4\2\2\u00a3\u00a4\7\13\2\2"+
		"\u00a4\u00a5\t\4\2\2\u00a5\u00a6\t\4\2\2\u00a6\21\3\2\2\2\u00a7\u00a8"+
		"\7\f\2\2\u00a8\u00a9\5\f\7\2\u00a9\u00aa\7\r\2\2\u00aa\u00ab\5\f\7\2\u00ab"+
		"\u00ac\7\16\2\2\u00ac\23\3\2\2\2\u00ad\u00ae\7\17\2\2\u00ae\u00af\5\f"+
		"\7\2\u00af\u00b0\7\r\2\2\u00b0\u00b1\5\f\7\2\u00b1\u00b2\7\20\2\2\u00b2"+
		"\25\3\2\2\2\u00b3\u00b4\7\21\2\2\u00b4\u00b7\5@!\2\u00b5\u00b8\5\b\5\2"+
		"\u00b6\u00b8\5\22\n\2\u00b7\u00b5\3\2\2\2\u00b7\u00b6\3\2\2\2\u00b8\u00b9"+
		"\3\2\2\2\u00b9\u00ba\5@!\2\u00ba\u00bb\7\22\2\2\u00bb\u00bc\5@!\2\u00bc"+
		"\u00bd\5\b\5\2\u00bd\u00be\5@!\2\u00be\u00bf\7\23\2\2\u00bf\u00c3\5@!"+
		"\2\u00c0\u00c4\5\b\5\2\u00c1\u00c4\5\f\7\2\u00c2\u00c4\5\20\t\2\u00c3"+
		"\u00c0\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c2\3\2\2\2\u00c4\u00cd\3\2"+
		"\2\2\u00c5\u00c6\5@!\2\u00c6\u00c7\7\24\2\2\u00c7\u00cb\5@!\2\u00c8\u00cc"+
		"\5\b\5\2\u00c9\u00cc\5\f\7\2\u00ca\u00cc\5\20\t\2\u00cb\u00c8\3\2\2\2"+
		"\u00cb\u00c9\3\2\2\2\u00cb\u00ca\3\2\2\2\u00cc\u00ce\3\2\2\2\u00cd\u00c5"+
		"\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00d0\3\2\2\2\u00cf\u00d1\5@!\2\u00d0"+
		"\u00cf\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d3\7\25"+
		"\2\2\u00d3\27\3\2\2\2\u00d4\u00d5\b\r\1\2\u00d5\u00e1\5\f\7\2\u00d6\u00e1"+
		"\5\16\b\2\u00d7\u00e1\5\22\n\2\u00d8\u00e1\5\24\13\2\u00d9\u00e1\5\20"+
		"\t\2\u00da\u00e1\5\b\5\2\u00db\u00e1\5,\27\2\u00dc\u00e1\5B\"\2\u00dd"+
		"\u00e1\5D#\2\u00de\u00e1\5F$\2\u00df\u00e1\5H%\2\u00e0\u00d4\3\2\2\2\u00e0"+
		"\u00d6\3\2\2\2\u00e0\u00d7\3\2\2\2\u00e0\u00d8\3\2\2\2\u00e0\u00d9\3\2"+
		"\2\2\u00e0\u00da\3\2\2\2\u00e0\u00db\3\2\2\2\u00e0\u00dc\3\2\2\2\u00e0"+
		"\u00dd\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00df\3\2\2\2\u00e1\u00ed\3\2"+
		"\2\2\u00e2\u00e4\f\16\2\2\u00e3\u00e5\5@!\2\u00e4\u00e3\3\2\2\2\u00e4"+
		"\u00e5\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e8\t\5\2\2\u00e7\u00e9\5@"+
		"!\2\u00e8\u00e7\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea"+
		"\u00ec\5\30\r\17\u00eb\u00e2\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb\3"+
		"\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\31\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0"+
		"\u00f1\7\31\2\2\u00f1\u00f2\5@!\2\u00f2\u00f3\5\6\4\2\u00f3\u00f4\5@!"+
		"\2\u00f4\u00f5\5\b\5\2\u00f5\u00f6\5@!\2\u00f6\u00f7\7\32\2\2\u00f7\u00f8"+
		"\5@!\2\u00f8\u00fa\5\30\r\2\u00f9\u00fb\5@!\2\u00fa\u00f9\3\2\2\2\u00fa"+
		"\u00fb\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd\7\25\2\2\u00fd\33\3\2\2"+
		"\2\u00fe\u00ff\7\33\2\2\u00ff\u0100\5@!\2\u0100\u0101\5\b\5\2\u0101\u0102"+
		"\5@!\2\u0102\u0103\7\32\2\2\u0103\u0104\5@!\2\u0104\u0105\5\30\r\2\u0105"+
		"\u0106\7\25\2\2\u0106\35\3\2\2\2\u0107\u0109\7\34\2\2\u0108\u010a\5@!"+
		"\2\u0109\u0108\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010d"+
		"\7\17\2\2\u010c\u010e\5@!\2\u010d\u010c\3\2\2\2\u010d\u010e\3\2\2\2\u010e"+
		"\u010f\3\2\2\2\u010f\u0111\5 \21\2\u0110\u0112\5@!\2\u0111\u0110\3\2\2"+
		"\2\u0111\u0112\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0114\7\20\2\2\u0114"+
		"\u0115\5@!\2\u0115\u0116\7\35\2\2\u0116\u0117\5@!\2\u0117\u0118\5\"\22"+
		"\2\u0118\u0119\5@!\2\u0119\u011b\7\36\2\2\u011a\u011c\5@!\2\u011b\u011a"+
		"\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011e\7\25\2\2"+
		"\u011e\37\3\2\2\2\u011f\u0122\5\30\r\2\u0120\u0122\5\b\5\2\u0121\u011f"+
		"\3\2\2\2\u0121\u0120\3\2\2\2\u0122\u0124\3\2\2\2\u0123\u0125\5@!\2\u0124"+
		"\u0123\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0128\t\6"+
		"\2\2\u0127\u0129\5@!\2\u0128\u0127\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012c"+
		"\3\2\2\2\u012a\u012d\5\30\r\2\u012b\u012d\5\b\5\2\u012c\u012a\3\2\2\2"+
		"\u012c\u012b\3\2\2\2\u012d!\3\2\2\2\u012e\u0130\5\4\3\2\u012f\u0131\5"+
		"@!\2\u0130\u012f\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0133\3\2\2\2\u0132"+
		"\u012e\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0132\3\2\2\2\u0134\u0135\3\2"+
		"\2\2\u0135#\3\2\2\2\u0136\u0137\7%\2\2\u0137\u0138\5@!\2\u0138\u0139\5"+
		"&\24\2\u0139\u013a\5@!\2\u013a\u013c\7&\2\2\u013b\u013d\5@!\2\u013c\u013b"+
		"\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u013f\7\25\2\2"+
		"\u013f%\3\2\2\2\u0140\u0142\5\26\f\2\u0141\u0143\5@!\2\u0142\u0141\3\2"+
		"\2\2\u0142\u0143\3\2\2\2\u0143\u0145\3\2\2\2\u0144\u0140\3\2\2\2\u0145"+
		"\u0146\3\2\2\2\u0146\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147\'\3\2\2\2"+
		"\u0148\u014a\7\'\2\2\u0149\u014b\5@!\2\u014a\u0149\3\2\2\2\u014a\u014b"+
		"\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014e\7\17\2\2\u014d\u014f\5@!\2\u014e"+
		"\u014d\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0152\5 "+
		"\21\2\u0151\u0153\5@!\2\u0152\u0151\3\2\2\2\u0152\u0153\3\2\2\2\u0153"+
		"\u0154\3\2\2\2\u0154\u0155\7\20\2\2\u0155\u0156\5@!\2\u0156\u0157\5*\26"+
		"\2\u0157\u0158\5@!\2\u0158\u015a\7(\2\2\u0159\u015b\5@!\2\u015a\u0159"+
		"\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015d\7\25\2\2"+
		"\u015d)\3\2\2\2\u015e\u0160\5\4\3\2\u015f\u015e\3\2\2\2\u0160\u0161\3"+
		"\2\2\2\u0161\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162+\3\2\2\2\u0163\u0165"+
		"\5<\37\2\u0164\u0163\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0166\3\2\2\2\u0166"+
		"\u0167\5\n\6\2\u0167\u0169\7\17\2\2\u0168\u016a\5@!\2\u0169\u0168\3\2"+
		"\2\2\u0169\u016a\3\2\2\2\u016a\u016f\3\2\2\2\u016b\u016d\5\64\33\2\u016c"+
		"\u016e\5@!\2\u016d\u016c\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u0170\3\2\2"+
		"\2\u016f\u016b\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u0173"+
		"\7\20\2\2\u0172\u0174\5@!\2\u0173\u0172\3\2\2\2\u0173\u0174\3\2\2\2\u0174"+
		"\u0175\3\2\2\2\u0175\u0176\7\25\2\2\u0176-\3\2\2\2\u0177\u0178\7)\2\2"+
		"\u0178\u0179\5@!\2\u0179\u017a\5\n\6\2\u017a\u017c\7\17\2\2\u017b\u017d"+
		"\5@!\2\u017c\u017b\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u017f\3\2\2\2\u017e"+
		"\u0180\5\62\32\2\u017f\u017e\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0182\3"+
		"\2\2\2\u0181\u0183\5@!\2\u0182\u0181\3\2\2\2\u0182\u0183\3\2\2\2\u0183"+
		"\u0184\3\2\2\2\u0184\u0190\7\20\2\2\u0185\u0187\5@!\2\u0186\u0185\3\2"+
		"\2\2\u0186\u0187\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u018a\7*\2\2\u0189"+
		"\u018b\5@!\2\u018a\u0189\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018c\3\2\2"+
		"\2\u018c\u018e\5\6\4\2\u018d\u018f\5@!\2\u018e\u018d\3\2\2\2\u018e\u018f"+
		"\3\2\2\2\u018f\u0191\3\2\2\2\u0190\u0186\3\2\2\2\u0190\u0191\3\2\2\2\u0191"+
		"\u0192\3\2\2\2\u0192\u0193\5@!\2\u0193\u0195\7\32\2\2\u0194\u0196\5@!"+
		"\2\u0195\u0194\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u0199"+
		"\5\60\31\2\u0198\u019a\5@!\2\u0199\u0198\3\2\2\2\u0199\u019a\3\2\2\2\u019a"+
		"\u019b\3\2\2\2\u019b\u019d\7+\2\2\u019c\u019e\5@!\2\u019d\u019c\3\2\2"+
		"\2\u019d\u019e\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a0\7\25\2\2\u01a0"+
		"/\3\2\2\2\u01a1\u01a3\5\4\3\2\u01a2\u01a4\5@!\2\u01a3\u01a2\3\2\2\2\u01a3"+
		"\u01a4\3\2\2\2\u01a4\u01a6\3\2\2\2\u01a5\u01a1\3\2\2\2\u01a6\u01a7\3\2"+
		"\2\2\u01a7\u01a5\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\61\3\2\2\2\u01a9\u01b4"+
		"\5\66\34\2\u01aa\u01ac\5@!\2\u01ab\u01aa\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac"+
		"\u01ad\3\2\2\2\u01ad\u01af\7\r\2\2\u01ae\u01b0\5@!\2\u01af\u01ae\3\2\2"+
		"\2\u01af\u01b0\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01b3\5\66\34\2\u01b2"+
		"\u01ab\3\2\2\2\u01b3\u01b6\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b4\u01b5\3\2"+
		"\2\2\u01b5\63\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b7\u01c2\5\b\5\2\u01b8\u01ba"+
		"\5@!\2\u01b9\u01b8\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb"+
		"\u01bd\7\r\2\2\u01bc\u01be\5@!\2\u01bd\u01bc\3\2\2\2\u01bd\u01be\3\2\2"+
		"\2\u01be\u01bf\3\2\2\2\u01bf\u01c1\5\b\5\2\u01c0\u01b9\3\2\2\2\u01c1\u01c4"+
		"\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\65\3\2\2\2\u01c4"+
		"\u01c2\3\2\2\2\u01c5\u01c6\5\6\4\2\u01c6\u01c7\5@!\2\u01c7\u01c8\5\b\5"+
		"\2\u01c8\67\3\2\2\2\u01c9\u01cd\7,\2\2\u01ca\u01cc\13\2\2\2\u01cb\u01ca"+
		"\3\2\2\2\u01cc\u01cf\3\2\2\2\u01cd\u01ce\3\2\2\2\u01cd\u01cb\3\2\2\2\u01ce"+
		"\u01d0\3\2\2\2\u01cf\u01cd\3\2\2\2\u01d0\u01d1\7-\2\2\u01d19\3\2\2\2\u01d2"+
		"\u01d6\7;\2\2\u01d3\u01d5\t\3\2\2\u01d4\u01d3\3\2\2\2\u01d5\u01d8\3\2"+
		"\2\2\u01d6\u01d4\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7;\3\2\2\2\u01d8\u01d6"+
		"\3\2\2\2\u01d9\u01da\5:\36\2\u01da\u01db\7.\2\2\u01db\u01dd\3\2\2\2\u01dc"+
		"\u01d9\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01dc\3\2\2\2\u01de\u01df\3\2"+
		"\2\2\u01df=\3\2\2\2\u01e0\u01e2\5:\36\2\u01e1\u01e3\5@!\2\u01e2\u01e1"+
		"\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01e6\7/\2\2\u01e5"+
		"\u01e7\5@!\2\u01e6\u01e5\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01ea\3\2\2"+
		"\2\u01e8\u01eb\5> \2\u01e9\u01eb\5\32\16\2\u01ea\u01e8\3\2\2\2\u01ea\u01e9"+
		"\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed"+
		"\u01ef\3\2\2\2\u01ee\u01f0\5@!\2\u01ef\u01ee\3\2\2\2\u01ef\u01f0\3\2\2"+
		"\2\u01f0\u01f1\3\2\2\2\u01f1\u01f3\7\60\2\2\u01f2\u01f4\5@!\2\u01f3\u01f2"+
		"\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01f6\7\25\2\2"+
		"\u01f6?\3\2\2\2\u01f7\u01f9\79\2\2\u01f8\u01f7\3\2\2\2\u01f9\u01fa\3\2"+
		"\2\2\u01fa\u01f8\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fbA\3\2\2\2\u01fc\u01fe"+
		"\7\61\2\2\u01fd\u01ff\5@!\2\u01fe\u01fd\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff"+
		"\u0202\3\2\2\2\u0200\u0203\5\b\5\2\u0201\u0203\5\24\13\2\u0202\u0200\3"+
		"\2\2\2\u0202\u0201\3\2\2\2\u0203\u0205\3\2\2\2\u0204\u0206\5@!\2\u0205"+
		"\u0204\3\2\2\2\u0205\u0206\3\2\2\2\u0206\u0207\3\2\2\2\u0207\u0209\7\r"+
		"\2\2\u0208\u020a\5@!\2\u0209\u0208\3\2\2\2\u0209\u020a\3\2\2\2\u020a\u020d"+
		"\3\2\2\2\u020b\u020e\5\b\5\2\u020c\u020e\5\24\13\2\u020d\u020b\3\2\2\2"+
		"\u020d\u020c\3\2\2\2\u020e\u0210\3\2\2\2\u020f\u0211\5@!\2\u0210\u020f"+
		"\3\2\2\2\u0210\u0211\3\2\2\2\u0211\u0212\3\2\2\2\u0212\u0213\7\25\2\2"+
		"\u0213C\3\2\2\2\u0214\u0216\7\62\2\2\u0215\u0217\5@!\2\u0216\u0215\3\2"+
		"\2\2\u0216\u0217\3\2\2\2\u0217\u0218\3\2\2\2\u0218\u021a\t\7\2\2\u0219"+
		"\u021b\5@!\2\u021a\u0219\3\2\2\2\u021a\u021b\3\2\2\2\u021b\u021c\3\2\2"+
		"\2\u021c\u021e\7\65\2\2\u021d\u021f\5@!\2\u021e\u021d\3\2\2\2\u021e\u021f"+
		"\3\2\2\2\u021f\u0220\3\2\2\2\u0220\u0222\5\b\5\2\u0221\u0223\5@!\2\u0222"+
		"\u0221\3\2\2\2\u0222\u0223\3\2\2\2\u0223\u0224\3\2\2\2\u0224\u0225\7\25"+
		"\2\2\u0225E\3\2\2\2\u0226\u0228\7\66\2\2\u0227\u0229\5@!\2\u0228\u0227"+
		"\3\2\2\2\u0228\u0229\3\2\2\2\u0229\u022c\3\2\2\2\u022a\u022d\5\b\5\2\u022b"+
		"\u022d\5\24\13\2\u022c\u022a\3\2\2\2\u022c\u022b\3\2\2\2\u022d\u022f\3"+
		"\2\2\2\u022e\u0230\5@!\2\u022f\u022e\3\2\2\2\u022f\u0230\3\2\2\2\u0230"+
		"\u0231\3\2\2\2\u0231\u0233\7\r\2\2\u0232\u0234\5@!\2\u0233\u0232\3\2\2"+
		"\2\u0233\u0234\3\2\2\2\u0234\u0237\3\2\2\2\u0235\u0238\5\b\5\2\u0236\u0238"+
		"\5\24\13\2\u0237\u0235\3\2\2\2\u0237\u0236\3\2\2\2\u0238\u023a\3\2\2\2"+
		"\u0239\u023b\5@!\2\u023a\u0239\3\2\2\2\u023a\u023b\3\2\2\2\u023b\u023c"+
		"\3\2\2\2\u023c\u023d\7\25\2\2\u023dG\3\2\2\2\u023e\u0240\7\67\2\2\u023f"+
		"\u0241\5@!\2\u0240\u023f\3\2\2\2\u0240\u0241\3\2\2\2\u0241\u0242\3\2\2"+
		"\2\u0242\u0244\t\b\2\2\u0243\u0245\5@!\2\u0244\u0243\3\2\2\2\u0244\u0245"+
		"\3\2\2\2\u0245\u0246\3\2\2\2\u0246\u0248\7\65\2\2\u0247\u0249\5@!\2\u0248"+
		"\u0247\3\2\2\2\u0248\u0249\3\2\2\2\u0249\u024a\3\2\2\2\u024a\u024c\5\b"+
		"\5\2\u024b\u024d\5@!\2\u024c\u024b\3\2\2\2\u024c\u024d\3\2\2\2\u024d\u024e"+
		"\3\2\2\2\u024e\u024f\7\25\2\2\u024fI\3\2\2\2cKPSWaflsz~\u0081\u0087\u008e"+
		"\u0096\u0099\u009e\u00b7\u00c3\u00cb\u00cd\u00d0\u00e0\u00e4\u00e8\u00ed"+
		"\u00fa\u0109\u010d\u0111\u011b\u0121\u0124\u0128\u012c\u0130\u0134\u013c"+
		"\u0142\u0146\u014a\u014e\u0152\u015a\u0161\u0164\u0169\u016d\u016f\u0173"+
		"\u017c\u017f\u0182\u0186\u018a\u018e\u0190\u0195\u0199\u019d\u01a3\u01a7"+
		"\u01ab\u01af\u01b4\u01b9\u01bd\u01c2\u01cd\u01d6\u01de\u01e2\u01e6\u01ea"+
		"\u01ec\u01ef\u01f3\u01fa\u01fe\u0202\u0205\u0209\u020d\u0210\u0216\u021a"+
		"\u021e\u0222\u0228\u022c\u022f\u0233\u0237\u023a\u0240\u0244\u0248\u024c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}