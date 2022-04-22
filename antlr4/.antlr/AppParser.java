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
		public List<IntegerContext> integer() {
			return getRuleContexts(IntegerContext.class);
		}
		public IntegerContext integer(int i) {
			return getRuleContext(IntegerContext.class,i);
		}
		public Time_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time_type; }
	}

	public final Time_typeContext time_type() throws RecognitionException {
		Time_typeContext _localctx = new Time_typeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_time_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			integer();
			setState(154);
			match(T__8);
			setState(155);
			integer();
			setState(156);
			match(T__8);
			setState(157);
			integer();
			setState(158);
			match(T__8);
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
			setState(160);
			match(T__9);
			setState(161);
			((Force_typeContext)_localctx).angle = integer();
			setState(162);
			match(T__10);
			setState(163);
			((Force_typeContext)_localctx).power = integer();
			setState(164);
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
			setState(166);
			match(T__12);
			setState(167);
			((Object_typeContext)_localctx).x_cor = integer();
			setState(168);
			match(T__10);
			setState(169);
			((Object_typeContext)_localctx).y_cor = integer();
			setState(170);
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
			setState(172);
			match(T__14);
			setState(173);
			whiteSpace();
			setState(176);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOWERCASELETTER:
			case UPPERCASELETTER:
				{
				setState(174);
				((ApplyForceContext)_localctx).force_ = variableName();
				}
				break;
			case T__9:
				{
				setState(175);
				((ApplyForceContext)_localctx).force_val = force_type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(178);
			whiteSpace();
			setState(179);
			match(T__15);
			setState(180);
			whiteSpace();
			setState(181);
			((ApplyForceContext)_localctx).object_ = variableName();
			setState(182);
			whiteSpace();
			setState(183);
			match(T__16);
			setState(184);
			whiteSpace();
			setState(188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(185);
				((ApplyForceContext)_localctx).time_ = variableName();
				}
				break;
			case 2:
				{
				setState(186);
				((ApplyForceContext)_localctx).time_val = integer();
				}
				break;
			case 3:
				{
				setState(187);
				((ApplyForceContext)_localctx).time_type_val = time_type();
				}
				break;
			}
			setState(198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(190);
				whiteSpace();
				setState(191);
				match(T__17);
				setState(192);
				whiteSpace();
				setState(196);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(193);
					((ApplyForceContext)_localctx).delay_ = variableName();
					}
					break;
				case 2:
					{
					setState(194);
					((ApplyForceContext)_localctx).delay_val_ = integer();
					}
					break;
				case 3:
					{
					setState(195);
					((ApplyForceContext)_localctx).delay_time_type_val = time_type();
					}
					break;
				}
				}
				break;
			}
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
			setState(217);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(206);
				integer();
				}
				break;
			case 2:
				{
				setState(207);
				float_type();
				}
				break;
			case 3:
				{
				setState(208);
				force_type();
				}
				break;
			case 4:
				{
				setState(209);
				object_type();
				}
				break;
			case 5:
				{
				setState(210);
				time_type();
				}
				break;
			case 6:
				{
				setState(211);
				variableName();
				}
				break;
			case 7:
				{
				setState(212);
				functionCall();
				}
				break;
			case 8:
				{
				setState(213);
				getAngle();
				}
				break;
			case 9:
				{
				setState(214);
				getCoordinate();
				}
				break;
			case 10:
				{
				setState(215);
				getDistance();
				}
				break;
			case 11:
				{
				setState(216);
				getVelocity();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(230);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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
					setState(219);
					if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
					setState(221);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(220);
						whiteSpace();
						}
					}

					setState(223);
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
					setState(225);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(224);
						whiteSpace();
						}
					}

					setState(227);
					((ArithmeticalExpressionContext)_localctx).right = arithmeticalExpression(13);
					}
					} 
				}
				setState(232);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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
			setState(233);
			match(T__22);
			setState(234);
			whiteSpace();
			setState(235);
			((DeclarationContext)_localctx).type_sim = variableType();
			setState(236);
			whiteSpace();
			setState(237);
			((DeclarationContext)_localctx).name_ = variableName();
			setState(238);
			whiteSpace();
			setState(239);
			match(T__23);
			setState(240);
			whiteSpace();
			setState(241);
			((DeclarationContext)_localctx).value_ = arithmeticalExpression(0);
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
			setState(247);
			match(T__24);
			setState(248);
			whiteSpace();
			setState(249);
			((DefinitionContext)_localctx).name_ = variableName();
			setState(250);
			whiteSpace();
			setState(251);
			match(T__23);
			setState(252);
			whiteSpace();
			setState(253);
			((DefinitionContext)_localctx).value_ = arithmeticalExpression(0);
			setState(254);
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
			setState(256);
			match(T__25);
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
			match(T__12);
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
			((ConditionalStatementContext)_localctx).cond = condition();
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
			match(T__13);
			setState(269);
			whiteSpace();
			setState(270);
			match(T__26);
			setState(271);
			whiteSpace();
			setState(272);
			((ConditionalStatementContext)_localctx).con_body = conditionBody();
			setState(273);
			whiteSpace();
			setState(274);
			match(T__27);
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(275);
				whiteSpace();
				}
			}

			setState(278);
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
			setState(282);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(280);
				((ConditionContext)_localctx).left_expr = arithmeticalExpression(0);
				}
				break;
			case 2:
				{
				setState(281);
				((ConditionContext)_localctx).left_var = variableName();
				}
				break;
			}
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(284);
				whiteSpace();
				}
			}

			setState(287);
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
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(288);
				whiteSpace();
				}
			}

			setState(293);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(291);
				((ConditionContext)_localctx).right_expr = arithmeticalExpression(0);
				}
				break;
			case 2:
				{
				setState(292);
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
			setState(299); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(295);
				instruction();
				setState(297);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(296);
					whiteSpace();
					}
					break;
				}
				}
				}
				setState(301); 
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
			setState(303);
			match(T__34);
			setState(304);
			whiteSpace();
			setState(305);
			((ParallelExpressionContext)_localctx).par_body = parallelBody();
			setState(306);
			whiteSpace();
			setState(307);
			match(T__35);
			setState(309);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(308);
				whiteSpace();
				}
			}

			setState(311);
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
			setState(317); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(313);
				((ParallelBodyContext)_localctx).app_force_ = applyForce();
				setState(315);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(314);
					whiteSpace();
					}
					break;
				}
				}
				}
				setState(319); 
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
			setState(321);
			match(T__36);
			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(322);
				whiteSpace();
				}
			}

			setState(325);
			match(T__12);
			setState(327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(326);
				whiteSpace();
				}
			}

			setState(329);
			condition();
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
			match(T__13);
			setState(334);
			whiteSpace();
			setState(335);
			((LoopContext)_localctx).l_body = loopBody();
			setState(336);
			whiteSpace();
			setState(337);
			match(T__37);
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
			setState(344); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(343);
				instruction();
				}
				}
				setState(346); 
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
			setState(349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UPPERCASELETTER) {
				{
				setState(348);
				((FunctionCallContext)_localctx).scope_seq = scopeSequence();
				}
			}

			setState(351);
			((FunctionCallContext)_localctx).f_name = functionName();
			setState(352);
			match(T__12);
			setState(354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(353);
				whiteSpace();
				}
			}

			setState(360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOWERCASELETTER || _la==UPPERCASELETTER) {
				{
				setState(356);
				((FunctionCallContext)_localctx).f_args = functionParams();
				setState(358);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(357);
					whiteSpace();
					}
				}

				}
			}

			setState(362);
			match(T__13);
			setState(364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(363);
				whiteSpace();
				}
			}

			setState(366);
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
			setState(368);
			match(T__38);
			setState(369);
			whiteSpace();
			setState(370);
			((FunctionDeclarationContext)_localctx).f_name = functionName();
			setState(371);
			match(T__12);
			setState(373);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(372);
				whiteSpace();
				}
				break;
			}
			setState(376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4))) != 0)) {
				{
				setState(375);
				((FunctionDeclarationContext)_localctx).f_args = functionArgs();
				}
			}

			setState(379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(378);
				whiteSpace();
				}
			}

			setState(381);
			match(T__13);
			setState(393);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(383);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(382);
					whiteSpace();
					}
				}

				setState(385);
				match(T__39);
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
				((FunctionDeclarationContext)_localctx).return_type = variableType();
				setState(391);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
				case 1:
					{
					setState(390);
					whiteSpace();
					}
					break;
				}
				}
				break;
			}
			setState(395);
			whiteSpace();
			setState(396);
			match(T__23);
			setState(398);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(397);
				whiteSpace();
				}
			}

			setState(400);
			((FunctionDeclarationContext)_localctx).f_body = functionBody();
			setState(402);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(401);
				whiteSpace();
				}
			}

			setState(404);
			match(T__40);
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
			setState(414); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(410);
				instruction();
				setState(412);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
				case 1:
					{
					setState(411);
					whiteSpace();
					}
					break;
				}
				}
				}
				setState(416); 
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
			setState(418);
			functionArgument();
			setState(429);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(420);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(419);
						whiteSpace();
						}
					}

					setState(422);
					match(T__10);
					setState(424);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(423);
						whiteSpace();
						}
					}

					setState(426);
					functionArgument();
					}
					} 
				}
				setState(431);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
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
			setState(432);
			variableName();
			setState(443);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(434);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(433);
						whiteSpace();
						}
					}

					setState(436);
					match(T__10);
					setState(438);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(437);
						whiteSpace();
						}
					}

					setState(440);
					variableName();
					}
					} 
				}
				setState(445);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
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
			setState(446);
			((FunctionArgumentContext)_localctx).type_ = variableType();
			setState(447);
			whiteSpace();
			setState(448);
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
			setState(450);
			match(T__41);
			setState(454);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(451);
					matchWildcard();
					}
					} 
				}
				setState(456);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			}
			setState(457);
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
			setState(459);
			match(UPPERCASELETTER);
			setState(463);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << LOWERCASELETTER) | (1L << UPPERCASELETTER) | (1L << NONZERODIGIT) | (1L << ZERO))) != 0)) {
				{
				{
				setState(460);
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
				setState(465);
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
			setState(469); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(466);
				scopeName();
				setState(467);
				match(T__43);
				}
				}
				setState(471); 
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
			setState(473);
			((ScopeDeclarationContext)_localctx).name = scopeName();
			setState(475);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(474);
				whiteSpace();
				}
			}

			setState(477);
			match(T__44);
			setState(479);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(478);
				whiteSpace();
				}
			}

			setState(483); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(483);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case UPPERCASELETTER:
					{
					setState(481);
					scopeDeclaration();
					}
					break;
				case T__22:
					{
					setState(482);
					declaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(485); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__22 || _la==UPPERCASELETTER );
			setState(488);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(487);
				whiteSpace();
				}
			}

			setState(490);
			match(T__45);
			setState(492);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(491);
				whiteSpace();
				}
			}

			setState(494);
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
			setState(497); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(496);
					match(WS);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(499); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
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
			setState(501);
			match(T__46);
			setState(503);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(502);
				whiteSpace();
				}
			}

			setState(507);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOWERCASELETTER:
			case UPPERCASELETTER:
				{
				setState(505);
				((GetAngleContext)_localctx).name_1 = variableName();
				}
				break;
			case T__12:
				{
				setState(506);
				((GetAngleContext)_localctx).object_1 = object_type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(510);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(509);
				whiteSpace();
				}
			}

			setState(512);
			match(T__10);
			setState(514);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(513);
				whiteSpace();
				}
			}

			setState(518);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOWERCASELETTER:
			case UPPERCASELETTER:
				{
				setState(516);
				((GetAngleContext)_localctx).name_2 = variableName();
				}
				break;
			case T__12:
				{
				setState(517);
				((GetAngleContext)_localctx).object_2 = object_type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(521);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(520);
				whiteSpace();
				}
			}

			setState(523);
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
			setState(525);
			match(T__47);
			setState(527);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(526);
				whiteSpace();
				}
			}

			setState(529);
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
			setState(531);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(530);
				whiteSpace();
				}
			}

			setState(533);
			match(T__50);
			setState(535);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(534);
				whiteSpace();
				}
			}

			setState(537);
			((GetCoordinateContext)_localctx).name_ = variableName();
			setState(539);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(538);
				whiteSpace();
				}
			}

			setState(541);
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
			setState(543);
			match(T__51);
			setState(545);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(544);
				whiteSpace();
				}
			}

			setState(549);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOWERCASELETTER:
			case UPPERCASELETTER:
				{
				setState(547);
				((GetDistanceContext)_localctx).name_1 = variableName();
				}
				break;
			case T__12:
				{
				setState(548);
				((GetDistanceContext)_localctx).object_1 = object_type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(552);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(551);
				whiteSpace();
				}
			}

			setState(554);
			match(T__10);
			setState(556);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(555);
				whiteSpace();
				}
			}

			setState(560);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOWERCASELETTER:
			case UPPERCASELETTER:
				{
				setState(558);
				((GetDistanceContext)_localctx).name_2 = variableName();
				}
				break;
			case T__12:
				{
				setState(559);
				((GetDistanceContext)_localctx).object_2 = object_type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(563);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(562);
				whiteSpace();
				}
			}

			setState(565);
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
			setState(567);
			match(T__52);
			setState(569);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(568);
				whiteSpace();
				}
			}

			setState(571);
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
			setState(573);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(572);
				whiteSpace();
				}
			}

			setState(575);
			match(T__50);
			setState(577);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(576);
				whiteSpace();
				}
			}

			setState(579);
			((GetVelocityContext)_localctx).name_ = variableName();
			setState(581);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(580);
				whiteSpace();
				}
			}

			setState(583);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3=\u024c\4\2\t\2\4"+
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
		"\5\b\u009a\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\5\f\u00b3\n\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00bf\n\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00c7"+
		"\n\f\5\f\u00c9\n\f\3\f\5\f\u00cc\n\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\5\r\u00dc\n\r\3\r\3\r\5\r\u00e0\n\r\3\r\3\r\5\r"+
		"\u00e4\n\r\3\r\7\r\u00e7\n\r\f\r\16\r\u00ea\13\r\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\5\16\u00f6\n\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\5\20\u0105\n\20\3\20\3\20\5\20"+
		"\u0109\n\20\3\20\3\20\5\20\u010d\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\5\20\u0117\n\20\3\20\3\20\3\21\3\21\5\21\u011d\n\21\3\21\5\21"+
		"\u0120\n\21\3\21\3\21\5\21\u0124\n\21\3\21\3\21\5\21\u0128\n\21\3\22\3"+
		"\22\5\22\u012c\n\22\6\22\u012e\n\22\r\22\16\22\u012f\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\5\23\u0138\n\23\3\23\3\23\3\24\3\24\5\24\u013e\n\24\6\24"+
		"\u0140\n\24\r\24\16\24\u0141\3\25\3\25\5\25\u0146\n\25\3\25\3\25\5\25"+
		"\u014a\n\25\3\25\3\25\5\25\u014e\n\25\3\25\3\25\3\25\3\25\3\25\3\25\5"+
		"\25\u0156\n\25\3\25\3\25\3\26\6\26\u015b\n\26\r\26\16\26\u015c\3\27\5"+
		"\27\u0160\n\27\3\27\3\27\3\27\5\27\u0165\n\27\3\27\3\27\5\27\u0169\n\27"+
		"\5\27\u016b\n\27\3\27\3\27\5\27\u016f\n\27\3\27\3\27\3\30\3\30\3\30\3"+
		"\30\3\30\5\30\u0178\n\30\3\30\5\30\u017b\n\30\3\30\5\30\u017e\n\30\3\30"+
		"\3\30\5\30\u0182\n\30\3\30\3\30\5\30\u0186\n\30\3\30\3\30\5\30\u018a\n"+
		"\30\5\30\u018c\n\30\3\30\3\30\3\30\5\30\u0191\n\30\3\30\3\30\5\30\u0195"+
		"\n\30\3\30\3\30\5\30\u0199\n\30\3\30\3\30\3\31\3\31\5\31\u019f\n\31\6"+
		"\31\u01a1\n\31\r\31\16\31\u01a2\3\32\3\32\5\32\u01a7\n\32\3\32\3\32\5"+
		"\32\u01ab\n\32\3\32\7\32\u01ae\n\32\f\32\16\32\u01b1\13\32\3\33\3\33\5"+
		"\33\u01b5\n\33\3\33\3\33\5\33\u01b9\n\33\3\33\7\33\u01bc\n\33\f\33\16"+
		"\33\u01bf\13\33\3\34\3\34\3\34\3\34\3\35\3\35\7\35\u01c7\n\35\f\35\16"+
		"\35\u01ca\13\35\3\35\3\35\3\36\3\36\7\36\u01d0\n\36\f\36\16\36\u01d3\13"+
		"\36\3\37\3\37\3\37\6\37\u01d8\n\37\r\37\16\37\u01d9\3 \3 \5 \u01de\n "+
		"\3 \3 \5 \u01e2\n \3 \3 \6 \u01e6\n \r \16 \u01e7\3 \5 \u01eb\n \3 \3"+
		" \5 \u01ef\n \3 \3 \3!\6!\u01f4\n!\r!\16!\u01f5\3\"\3\"\5\"\u01fa\n\""+
		"\3\"\3\"\5\"\u01fe\n\"\3\"\5\"\u0201\n\"\3\"\3\"\5\"\u0205\n\"\3\"\3\""+
		"\5\"\u0209\n\"\3\"\5\"\u020c\n\"\3\"\3\"\3#\3#\5#\u0212\n#\3#\3#\5#\u0216"+
		"\n#\3#\3#\5#\u021a\n#\3#\3#\5#\u021e\n#\3#\3#\3$\3$\5$\u0224\n$\3$\3$"+
		"\5$\u0228\n$\3$\5$\u022b\n$\3$\3$\5$\u022f\n$\3$\3$\5$\u0233\n$\3$\5$"+
		"\u0236\n$\3$\3$\3%\3%\5%\u023c\n%\3%\3%\5%\u0240\n%\3%\3%\5%\u0244\n%"+
		"\3%\3%\5%\u0248\n%\3%\3%\3%\3\u01c8\3\30&\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFH\2\t\3\2\3\7\4\2\b\b:=\3\2<=\4"+
		"\2\t\t\26\30\3\2\37$\3\2\63\64\4\2\63\6488\2\u0299\2U\3\2\2\2\4a\3\2\2"+
		"\2\6c\3\2\2\2\bf\3\2\2\2\no\3\2\2\2\f~\3\2\2\2\16\u0099\3\2\2\2\20\u009b"+
		"\3\2\2\2\22\u00a2\3\2\2\2\24\u00a8\3\2\2\2\26\u00ae\3\2\2\2\30\u00db\3"+
		"\2\2\2\32\u00eb\3\2\2\2\34\u00f9\3\2\2\2\36\u0102\3\2\2\2 \u011c\3\2\2"+
		"\2\"\u012d\3\2\2\2$\u0131\3\2\2\2&\u013f\3\2\2\2(\u0143\3\2\2\2*\u015a"+
		"\3\2\2\2,\u015f\3\2\2\2.\u0172\3\2\2\2\60\u01a0\3\2\2\2\62\u01a4\3\2\2"+
		"\2\64\u01b2\3\2\2\2\66\u01c0\3\2\2\28\u01c4\3\2\2\2:\u01cd\3\2\2\2<\u01d7"+
		"\3\2\2\2>\u01db\3\2\2\2@\u01f3\3\2\2\2B\u01f7\3\2\2\2D\u020f\3\2\2\2F"+
		"\u0221\3\2\2\2H\u0239\3\2\2\2JL\5@!\2KJ\3\2\2\2KL\3\2\2\2LP\3\2\2\2MQ"+
		"\5.\30\2NQ\5\4\3\2OQ\5> \2PM\3\2\2\2PN\3\2\2\2PO\3\2\2\2QS\3\2\2\2RT\5"+
		"@!\2SR\3\2\2\2ST\3\2\2\2TV\3\2\2\2UK\3\2\2\2VW\3\2\2\2WU\3\2\2\2WX\3\2"+
		"\2\2X\3\3\2\2\2Yb\5\32\16\2Zb\5\34\17\2[b\5\36\20\2\\b\5$\23\2]b\5(\25"+
		"\2^b\5,\27\2_b\5\26\f\2`b\58\35\2aY\3\2\2\2aZ\3\2\2\2a[\3\2\2\2a\\\3\2"+
		"\2\2a]\3\2\2\2a^\3\2\2\2a_\3\2\2\2a`\3\2\2\2b\5\3\2\2\2cd\t\2\2\2d\7\3"+
		"\2\2\2eg\5<\37\2fe\3\2\2\2fg\3\2\2\2gh\3\2\2\2hl\7:\2\2ik\t\3\2\2ji\3"+
		"\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2m\t\3\2\2\2nl\3\2\2\2os\7:\2\2pr\t"+
		"\3\2\2qp\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2t\13\3\2\2\2us\3\2\2\2v"+
		"z\7<\2\2wy\t\4\2\2xw\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{\177\3\2\2"+
		"\2|z\3\2\2\2}\177\7=\2\2~v\3\2\2\2~}\3\2\2\2\177\r\3\2\2\2\u0080\u0082"+
		"\7\t\2\2\u0081\u0080\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\3\2\2\2\u0083"+
		"\u0087\7<\2\2\u0084\u0086\t\4\2\2\u0085\u0084\3\2\2\2\u0086\u0089\3\2"+
		"\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008a\3\2\2\2\u0089"+
		"\u0087\3\2\2\2\u008a\u008e\7\n\2\2\u008b\u008d\t\4\2\2\u008c\u008b\3\2"+
		"\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f"+
		"\u009a\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0092\7=\2\2\u0092\u0096\7\n"+
		"\2\2\u0093\u0095\t\4\2\2\u0094\u0093\3\2\2\2\u0095\u0098\3\2\2\2\u0096"+
		"\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u0096\3\2"+
		"\2\2\u0099\u0081\3\2\2\2\u0099\u0091\3\2\2\2\u009a\17\3\2\2\2\u009b\u009c"+
		"\5\f\7\2\u009c\u009d\7\13\2\2\u009d\u009e\5\f\7\2\u009e\u009f\7\13\2\2"+
		"\u009f\u00a0\5\f\7\2\u00a0\u00a1\7\13\2\2\u00a1\21\3\2\2\2\u00a2\u00a3"+
		"\7\f\2\2\u00a3\u00a4\5\f\7\2\u00a4\u00a5\7\r\2\2\u00a5\u00a6\5\f\7\2\u00a6"+
		"\u00a7\7\16\2\2\u00a7\23\3\2\2\2\u00a8\u00a9\7\17\2\2\u00a9\u00aa\5\f"+
		"\7\2\u00aa\u00ab\7\r\2\2\u00ab\u00ac\5\f\7\2\u00ac\u00ad\7\20\2\2\u00ad"+
		"\25\3\2\2\2\u00ae\u00af\7\21\2\2\u00af\u00b2\5@!\2\u00b0\u00b3\5\b\5\2"+
		"\u00b1\u00b3\5\22\n\2\u00b2\u00b0\3\2\2\2\u00b2\u00b1\3\2\2\2\u00b3\u00b4"+
		"\3\2\2\2\u00b4\u00b5\5@!\2\u00b5\u00b6\7\22\2\2\u00b6\u00b7\5@!\2\u00b7"+
		"\u00b8\5\b\5\2\u00b8\u00b9\5@!\2\u00b9\u00ba\7\23\2\2\u00ba\u00be\5@!"+
		"\2\u00bb\u00bf\5\b\5\2\u00bc\u00bf\5\f\7\2\u00bd\u00bf\5\20\t\2\u00be"+
		"\u00bb\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bd\3\2\2\2\u00bf\u00c8\3\2"+
		"\2\2\u00c0\u00c1\5@!\2\u00c1\u00c2\7\24\2\2\u00c2\u00c6\5@!\2\u00c3\u00c7"+
		"\5\b\5\2\u00c4\u00c7\5\f\7\2\u00c5\u00c7\5\20\t\2\u00c6\u00c3\3\2\2\2"+
		"\u00c6\u00c4\3\2\2\2\u00c6\u00c5\3\2\2\2\u00c7\u00c9\3\2\2\2\u00c8\u00c0"+
		"\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00cb\3\2\2\2\u00ca\u00cc\5@!\2\u00cb"+
		"\u00ca\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00ce\7\25"+
		"\2\2\u00ce\27\3\2\2\2\u00cf\u00d0\b\r\1\2\u00d0\u00dc\5\f\7\2\u00d1\u00dc"+
		"\5\16\b\2\u00d2\u00dc\5\22\n\2\u00d3\u00dc\5\24\13\2\u00d4\u00dc\5\20"+
		"\t\2\u00d5\u00dc\5\b\5\2\u00d6\u00dc\5,\27\2\u00d7\u00dc\5B\"\2\u00d8"+
		"\u00dc\5D#\2\u00d9\u00dc\5F$\2\u00da\u00dc\5H%\2\u00db\u00cf\3\2\2\2\u00db"+
		"\u00d1\3\2\2\2\u00db\u00d2\3\2\2\2\u00db\u00d3\3\2\2\2\u00db\u00d4\3\2"+
		"\2\2\u00db\u00d5\3\2\2\2\u00db\u00d6\3\2\2\2\u00db\u00d7\3\2\2\2\u00db"+
		"\u00d8\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00da\3\2\2\2\u00dc\u00e8\3\2"+
		"\2\2\u00dd\u00df\f\16\2\2\u00de\u00e0\5@!\2\u00df\u00de\3\2\2\2\u00df"+
		"\u00e0\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e3\t\5\2\2\u00e2\u00e4\5@"+
		"!\2\u00e3\u00e2\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5"+
		"\u00e7\5\30\r\17\u00e6\u00dd\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6\3"+
		"\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\31\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb"+
		"\u00ec\7\31\2\2\u00ec\u00ed\5@!\2\u00ed\u00ee\5\6\4\2\u00ee\u00ef\5@!"+
		"\2\u00ef\u00f0\5\b\5\2\u00f0\u00f1\5@!\2\u00f1\u00f2\7\32\2\2\u00f2\u00f3"+
		"\5@!\2\u00f3\u00f5\5\30\r\2\u00f4\u00f6\5@!\2\u00f5\u00f4\3\2\2\2\u00f5"+
		"\u00f6\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f8\7\25\2\2\u00f8\33\3\2\2"+
		"\2\u00f9\u00fa\7\33\2\2\u00fa\u00fb\5@!\2\u00fb\u00fc\5\b\5\2\u00fc\u00fd"+
		"\5@!\2\u00fd\u00fe\7\32\2\2\u00fe\u00ff\5@!\2\u00ff\u0100\5\30\r\2\u0100"+
		"\u0101\7\25\2\2\u0101\35\3\2\2\2\u0102\u0104\7\34\2\2\u0103\u0105\5@!"+
		"\2\u0104\u0103\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0108"+
		"\7\17\2\2\u0107\u0109\5@!\2\u0108\u0107\3\2\2\2\u0108\u0109\3\2\2\2\u0109"+
		"\u010a\3\2\2\2\u010a\u010c\5 \21\2\u010b\u010d\5@!\2\u010c\u010b\3\2\2"+
		"\2\u010c\u010d\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010f\7\20\2\2\u010f"+
		"\u0110\5@!\2\u0110\u0111\7\35\2\2\u0111\u0112\5@!\2\u0112\u0113\5\"\22"+
		"\2\u0113\u0114\5@!\2\u0114\u0116\7\36\2\2\u0115\u0117\5@!\2\u0116\u0115"+
		"\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0119\7\25\2\2"+
		"\u0119\37\3\2\2\2\u011a\u011d\5\30\r\2\u011b\u011d\5\b\5\2\u011c\u011a"+
		"\3\2\2\2\u011c\u011b\3\2\2\2\u011d\u011f\3\2\2\2\u011e\u0120\5@!\2\u011f"+
		"\u011e\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0123\t\6"+
		"\2\2\u0122\u0124\5@!\2\u0123\u0122\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0127"+
		"\3\2\2\2\u0125\u0128\5\30\r\2\u0126\u0128\5\b\5\2\u0127\u0125\3\2\2\2"+
		"\u0127\u0126\3\2\2\2\u0128!\3\2\2\2\u0129\u012b\5\4\3\2\u012a\u012c\5"+
		"@!\2\u012b\u012a\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012e\3\2\2\2\u012d"+
		"\u0129\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2"+
		"\2\2\u0130#\3\2\2\2\u0131\u0132\7%\2\2\u0132\u0133\5@!\2\u0133\u0134\5"+
		"&\24\2\u0134\u0135\5@!\2\u0135\u0137\7&\2\2\u0136\u0138\5@!\2\u0137\u0136"+
		"\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013a\7\25\2\2"+
		"\u013a%\3\2\2\2\u013b\u013d\5\26\f\2\u013c\u013e\5@!\2\u013d\u013c\3\2"+
		"\2\2\u013d\u013e\3\2\2\2\u013e\u0140\3\2\2\2\u013f\u013b\3\2\2\2\u0140"+
		"\u0141\3\2\2\2\u0141\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142\'\3\2\2\2"+
		"\u0143\u0145\7\'\2\2\u0144\u0146\5@!\2\u0145\u0144\3\2\2\2\u0145\u0146"+
		"\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0149\7\17\2\2\u0148\u014a\5@!\2\u0149"+
		"\u0148\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014d\5 "+
		"\21\2\u014c\u014e\5@!\2\u014d\u014c\3\2\2\2\u014d\u014e\3\2\2\2\u014e"+
		"\u014f\3\2\2\2\u014f\u0150\7\20\2\2\u0150\u0151\5@!\2\u0151\u0152\5*\26"+
		"\2\u0152\u0153\5@!\2\u0153\u0155\7(\2\2\u0154\u0156\5@!\2\u0155\u0154"+
		"\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0158\7\25\2\2"+
		"\u0158)\3\2\2\2\u0159\u015b\5\4\3\2\u015a\u0159\3\2\2\2\u015b\u015c\3"+
		"\2\2\2\u015c\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d+\3\2\2\2\u015e\u0160"+
		"\5<\37\2\u015f\u015e\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u0161\3\2\2\2\u0161"+
		"\u0162\5\n\6\2\u0162\u0164\7\17\2\2\u0163\u0165\5@!\2\u0164\u0163\3\2"+
		"\2\2\u0164\u0165\3\2\2\2\u0165\u016a\3\2\2\2\u0166\u0168\5\64\33\2\u0167"+
		"\u0169\5@!\2\u0168\u0167\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u016b\3\2\2"+
		"\2\u016a\u0166\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016e"+
		"\7\20\2\2\u016d\u016f\5@!\2\u016e\u016d\3\2\2\2\u016e\u016f\3\2\2\2\u016f"+
		"\u0170\3\2\2\2\u0170\u0171\7\25\2\2\u0171-\3\2\2\2\u0172\u0173\7)\2\2"+
		"\u0173\u0174\5@!\2\u0174\u0175\5\n\6\2\u0175\u0177\7\17\2\2\u0176\u0178"+
		"\5@!\2\u0177\u0176\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u017a\3\2\2\2\u0179"+
		"\u017b\5\62\32\2\u017a\u0179\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017d\3"+
		"\2\2\2\u017c\u017e\5@!\2\u017d\u017c\3\2\2\2\u017d\u017e\3\2\2\2\u017e"+
		"\u017f\3\2\2\2\u017f\u018b\7\20\2\2\u0180\u0182\5@!\2\u0181\u0180\3\2"+
		"\2\2\u0181\u0182\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0185\7*\2\2\u0184"+
		"\u0186\5@!\2\u0185\u0184\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0187\3\2\2"+
		"\2\u0187\u0189\5\6\4\2\u0188\u018a\5@!\2\u0189\u0188\3\2\2\2\u0189\u018a"+
		"\3\2\2\2\u018a\u018c\3\2\2\2\u018b\u0181\3\2\2\2\u018b\u018c\3\2\2\2\u018c"+
		"\u018d\3\2\2\2\u018d\u018e\5@!\2\u018e\u0190\7\32\2\2\u018f\u0191\5@!"+
		"\2\u0190\u018f\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0194"+
		"\5\60\31\2\u0193\u0195\5@!\2\u0194\u0193\3\2\2\2\u0194\u0195\3\2\2\2\u0195"+
		"\u0196\3\2\2\2\u0196\u0198\7+\2\2\u0197\u0199\5@!\2\u0198\u0197\3\2\2"+
		"\2\u0198\u0199\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u019b\7\25\2\2\u019b"+
		"/\3\2\2\2\u019c\u019e\5\4\3\2\u019d\u019f\5@!\2\u019e\u019d\3\2\2\2\u019e"+
		"\u019f\3\2\2\2\u019f\u01a1\3\2\2\2\u01a0\u019c\3\2\2\2\u01a1\u01a2\3\2"+
		"\2\2\u01a2\u01a0\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\61\3\2\2\2\u01a4\u01af"+
		"\5\66\34\2\u01a5\u01a7\5@!\2\u01a6\u01a5\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7"+
		"\u01a8\3\2\2\2\u01a8\u01aa\7\r\2\2\u01a9\u01ab\5@!\2\u01aa\u01a9\3\2\2"+
		"\2\u01aa\u01ab\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01ae\5\66\34\2\u01ad"+
		"\u01a6\3\2\2\2\u01ae\u01b1\3\2\2\2\u01af\u01ad\3\2\2\2\u01af\u01b0\3\2"+
		"\2\2\u01b0\63\3\2\2\2\u01b1\u01af\3\2\2\2\u01b2\u01bd\5\b\5\2\u01b3\u01b5"+
		"\5@!\2\u01b4\u01b3\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6"+
		"\u01b8\7\r\2\2\u01b7\u01b9\5@!\2\u01b8\u01b7\3\2\2\2\u01b8\u01b9\3\2\2"+
		"\2\u01b9\u01ba\3\2\2\2\u01ba\u01bc\5\b\5\2\u01bb\u01b4\3\2\2\2\u01bc\u01bf"+
		"\3\2\2\2\u01bd\u01bb\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\65\3\2\2\2\u01bf"+
		"\u01bd\3\2\2\2\u01c0\u01c1\5\6\4\2\u01c1\u01c2\5@!\2\u01c2\u01c3\5\b\5"+
		"\2\u01c3\67\3\2\2\2\u01c4\u01c8\7,\2\2\u01c5\u01c7\13\2\2\2\u01c6\u01c5"+
		"\3\2\2\2\u01c7\u01ca\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c8\u01c6\3\2\2\2\u01c9"+
		"\u01cb\3\2\2\2\u01ca\u01c8\3\2\2\2\u01cb\u01cc\7-\2\2\u01cc9\3\2\2\2\u01cd"+
		"\u01d1\7;\2\2\u01ce\u01d0\t\3\2\2\u01cf\u01ce\3\2\2\2\u01d0\u01d3\3\2"+
		"\2\2\u01d1\u01cf\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2;\3\2\2\2\u01d3\u01d1"+
		"\3\2\2\2\u01d4\u01d5\5:\36\2\u01d5\u01d6\7.\2\2\u01d6\u01d8\3\2\2\2\u01d7"+
		"\u01d4\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01d7\3\2\2\2\u01d9\u01da\3\2"+
		"\2\2\u01da=\3\2\2\2\u01db\u01dd\5:\36\2\u01dc\u01de\5@!\2\u01dd\u01dc"+
		"\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01df\3\2\2\2\u01df\u01e1\7/\2\2\u01e0"+
		"\u01e2\5@!\2\u01e1\u01e0\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e5\3\2\2"+
		"\2\u01e3\u01e6\5> \2\u01e4\u01e6\5\32\16\2\u01e5\u01e3\3\2\2\2\u01e5\u01e4"+
		"\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01e5\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8"+
		"\u01ea\3\2\2\2\u01e9\u01eb\5@!\2\u01ea\u01e9\3\2\2\2\u01ea\u01eb\3\2\2"+
		"\2\u01eb\u01ec\3\2\2\2\u01ec\u01ee\7\60\2\2\u01ed\u01ef\5@!\2\u01ee\u01ed"+
		"\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0\u01f1\7\25\2\2"+
		"\u01f1?\3\2\2\2\u01f2\u01f4\79\2\2\u01f3\u01f2\3\2\2\2\u01f4\u01f5\3\2"+
		"\2\2\u01f5\u01f3\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6A\3\2\2\2\u01f7\u01f9"+
		"\7\61\2\2\u01f8\u01fa\5@!\2\u01f9\u01f8\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa"+
		"\u01fd\3\2\2\2\u01fb\u01fe\5\b\5\2\u01fc\u01fe\5\24\13\2\u01fd\u01fb\3"+
		"\2\2\2\u01fd\u01fc\3\2\2\2\u01fe\u0200\3\2\2\2\u01ff\u0201\5@!\2\u0200"+
		"\u01ff\3\2\2\2\u0200\u0201\3\2\2\2\u0201\u0202\3\2\2\2\u0202\u0204\7\r"+
		"\2\2\u0203\u0205\5@!\2\u0204\u0203\3\2\2\2\u0204\u0205\3\2\2\2\u0205\u0208"+
		"\3\2\2\2\u0206\u0209\5\b\5\2\u0207\u0209\5\24\13\2\u0208\u0206\3\2\2\2"+
		"\u0208\u0207\3\2\2\2\u0209\u020b\3\2\2\2\u020a\u020c\5@!\2\u020b\u020a"+
		"\3\2\2\2\u020b\u020c\3\2\2\2\u020c\u020d\3\2\2\2\u020d\u020e\7\25\2\2"+
		"\u020eC\3\2\2\2\u020f\u0211\7\62\2\2\u0210\u0212\5@!\2\u0211\u0210\3\2"+
		"\2\2\u0211\u0212\3\2\2\2\u0212\u0213\3\2\2\2\u0213\u0215\t\7\2\2\u0214"+
		"\u0216\5@!\2\u0215\u0214\3\2\2\2\u0215\u0216\3\2\2\2\u0216\u0217\3\2\2"+
		"\2\u0217\u0219\7\65\2\2\u0218\u021a\5@!\2\u0219\u0218\3\2\2\2\u0219\u021a"+
		"\3\2\2\2\u021a\u021b\3\2\2\2\u021b\u021d\5\b\5\2\u021c\u021e\5@!\2\u021d"+
		"\u021c\3\2\2\2\u021d\u021e\3\2\2\2\u021e\u021f\3\2\2\2\u021f\u0220\7\25"+
		"\2\2\u0220E\3\2\2\2\u0221\u0223\7\66\2\2\u0222\u0224\5@!\2\u0223\u0222"+
		"\3\2\2\2\u0223\u0224\3\2\2\2\u0224\u0227\3\2\2\2\u0225\u0228\5\b\5\2\u0226"+
		"\u0228\5\24\13\2\u0227\u0225\3\2\2\2\u0227\u0226\3\2\2\2\u0228\u022a\3"+
		"\2\2\2\u0229\u022b\5@!\2\u022a\u0229\3\2\2\2\u022a\u022b\3\2\2\2\u022b"+
		"\u022c\3\2\2\2\u022c\u022e\7\r\2\2\u022d\u022f\5@!\2\u022e\u022d\3\2\2"+
		"\2\u022e\u022f\3\2\2\2\u022f\u0232\3\2\2\2\u0230\u0233\5\b\5\2\u0231\u0233"+
		"\5\24\13\2\u0232\u0230\3\2\2\2\u0232\u0231\3\2\2\2\u0233\u0235\3\2\2\2"+
		"\u0234\u0236\5@!\2\u0235\u0234\3\2\2\2\u0235\u0236\3\2\2\2\u0236\u0237"+
		"\3\2\2\2\u0237\u0238\7\25\2\2\u0238G\3\2\2\2\u0239\u023b\7\67\2\2\u023a"+
		"\u023c\5@!\2\u023b\u023a\3\2\2\2\u023b\u023c\3\2\2\2\u023c\u023d\3\2\2"+
		"\2\u023d\u023f\t\b\2\2\u023e\u0240\5@!\2\u023f\u023e\3\2\2\2\u023f\u0240"+
		"\3\2\2\2\u0240\u0241\3\2\2\2\u0241\u0243\7\65\2\2\u0242\u0244\5@!\2\u0243"+
		"\u0242\3\2\2\2\u0243\u0244\3\2\2\2\u0244\u0245\3\2\2\2\u0245\u0247\5\b"+
		"\5\2\u0246\u0248\5@!\2\u0247\u0246\3\2\2\2\u0247\u0248\3\2\2\2\u0248\u0249"+
		"\3\2\2\2\u0249\u024a\7\25\2\2\u024aI\3\2\2\2bKPSWaflsz~\u0081\u0087\u008e"+
		"\u0096\u0099\u00b2\u00be\u00c6\u00c8\u00cb\u00db\u00df\u00e3\u00e8\u00f5"+
		"\u0104\u0108\u010c\u0116\u011c\u011f\u0123\u0127\u012b\u012f\u0137\u013d"+
		"\u0141\u0145\u0149\u014d\u0155\u015c\u015f\u0164\u0168\u016a\u016e\u0177"+
		"\u017a\u017d\u0181\u0185\u0189\u018b\u0190\u0194\u0198\u019e\u01a2\u01a6"+
		"\u01aa\u01af\u01b4\u01b8\u01bd\u01c8\u01d1\u01d9\u01dd\u01e1\u01e5\u01e7"+
		"\u01ea\u01ee\u01f5\u01f9\u01fd\u0200\u0204\u0208\u020b\u0211\u0215\u0219"+
		"\u021d\u0223\u0227\u022a\u022e\u0232\u0235\u023b\u023f\u0243\u0247";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}