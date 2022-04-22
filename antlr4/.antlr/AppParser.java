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
		T__52=53, WS=54, LOWERCASELETTER=55, UPPERCASELETTER=56, NONZERODIGIT=57, 
		ZERO=58;
	public static final int
		RULE_primaryExpression = 0, RULE_instruction = 1, RULE_variableType = 2, 
		RULE_variableName = 3, RULE_functionName = 4, RULE_integer = 5, RULE_float_type = 6, 
		RULE_force_type = 7, RULE_object_type = 8, RULE_applyForce = 9, RULE_arithmeticalExpression = 10, 
		RULE_declaration = 11, RULE_definition = 12, RULE_conditionalStatement = 13, 
		RULE_condition = 14, RULE_conditionBody = 15, RULE_parallelExpression = 16, 
		RULE_parallelBody = 17, RULE_loop = 18, RULE_loopBody = 19, RULE_functionCall = 20, 
		RULE_functionDeclaration = 21, RULE_functionBody = 22, RULE_functionArgs = 23, 
		RULE_functionParams = 24, RULE_functionArgument = 25, RULE_comment = 26, 
		RULE_scopeName = 27, RULE_scopeSequence = 28, RULE_scopeDeclaration = 29, 
		RULE_whiteSpace = 30, RULE_getAngle = 31, RULE_getCoordinate = 32, RULE_getDistance = 33, 
		RULE_getVelocity = 34;
	private static String[] makeRuleNames() {
		return new String[] {
			"primaryExpression", "instruction", "variableType", "variableName", "functionName", 
			"integer", "float_type", "force_type", "object_type", "applyForce", "arithmeticalExpression", 
			"declaration", "definition", "conditionalStatement", "condition", "conditionBody", 
			"parallelExpression", "parallelBody", "loop", "loopBody", "functionCall", 
			"functionDeclaration", "functionBody", "functionArgs", "functionParams", 
			"functionArgument", "comment", "scopeName", "scopeSequence", "scopeDeclaration", 
			"whiteSpace", "getAngle", "getCoordinate", "getDistance", "getVelocity"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'TIME'", "'INT'", "'FORCE'", "'OBJECT'", "'FLOAT'", "'_'", "'-'", 
			"'.'", "'['", "','", "']'", "'('", "')'", "'APPLY'", "'TO'", "'FOR'", 
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
			null, null, null, null, null, null, "WS", "LOWERCASELETTER", "UPPERCASELETTER", 
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
			setState(81); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(70);
					whiteSpace();
					}
				}

				setState(76);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(73);
					functionDeclaration();
					}
					break;
				case 2:
					{
					setState(74);
					instruction();
					}
					break;
				case 3:
					{
					setState(75);
					scopeDeclaration();
					}
					break;
				}
				setState(79);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(78);
					whiteSpace();
					}
					break;
				}
				}
				}
				setState(83); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__21) | (1L << T__23) | (1L << T__24) | (1L << T__33) | (1L << T__35) | (1L << T__37) | (1L << T__40) | (1L << WS) | (1L << LOWERCASELETTER) | (1L << UPPERCASELETTER))) != 0) );
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
			setState(93);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__21:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				declaration();
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				definition();
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 3);
				{
				setState(87);
				conditionalStatement();
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 4);
				{
				setState(88);
				parallelExpression();
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 5);
				{
				setState(89);
				loop();
				}
				break;
			case LOWERCASELETTER:
			case UPPERCASELETTER:
				enterOuterAlt(_localctx, 6);
				{
				setState(90);
				functionCall();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 7);
				{
				setState(91);
				applyForce();
				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 8);
				{
				setState(92);
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
			setState(95);
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
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UPPERCASELETTER) {
				{
				setState(97);
				((VariableNameContext)_localctx).scope_seq = scopeSequence();
				}
			}

			setState(100);
			match(LOWERCASELETTER);
			setState(104);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(101);
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
				setState(106);
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
			setState(107);
			match(LOWERCASELETTER);
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << LOWERCASELETTER) | (1L << UPPERCASELETTER) | (1L << NONZERODIGIT) | (1L << ZERO))) != 0)) {
				{
				{
				setState(108);
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
				setState(113);
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
			setState(122);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NONZERODIGIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				match(NONZERODIGIT);
				setState(118);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(115);
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
					setState(120);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				}
				}
				break;
			case ZERO:
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
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
			setState(149);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
			case NONZERODIGIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__6) {
					{
					setState(124);
					((Float_typeContext)_localctx).minus = match(T__6);
					}
				}

				setState(127);
				match(NONZERODIGIT);
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NONZERODIGIT || _la==ZERO) {
					{
					{
					setState(128);
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
					setState(133);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(134);
				match(T__7);
				setState(138);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(135);
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
					setState(140);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				}
				break;
			case ZERO:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				match(ZERO);
				setState(142);
				match(T__7);
				setState(146);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(143);
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
					setState(148);
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
		enterRule(_localctx, 14, RULE_force_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(T__8);
			setState(152);
			((Force_typeContext)_localctx).angle = integer();
			setState(153);
			match(T__9);
			setState(154);
			((Force_typeContext)_localctx).power = integer();
			setState(155);
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
		enterRule(_localctx, 16, RULE_object_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(T__11);
			setState(158);
			((Object_typeContext)_localctx).x_cor = integer();
			setState(159);
			match(T__9);
			setState(160);
			((Object_typeContext)_localctx).y_cor = integer();
			setState(161);
			match(T__12);
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
		enterRule(_localctx, 18, RULE_applyForce);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(T__13);
			setState(164);
			whiteSpace();
			setState(167);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOWERCASELETTER:
			case UPPERCASELETTER:
				{
				setState(165);
				((ApplyForceContext)_localctx).force_ = variableName();
				}
				break;
			case T__8:
				{
				setState(166);
				((ApplyForceContext)_localctx).force_val = force_type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(169);
			whiteSpace();
			setState(170);
			match(T__14);
			setState(171);
			whiteSpace();
			setState(172);
			((ApplyForceContext)_localctx).object_ = variableName();
			setState(173);
			whiteSpace();
			setState(174);
			match(T__15);
			setState(175);
			whiteSpace();
			setState(178);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOWERCASELETTER:
			case UPPERCASELETTER:
				{
				setState(176);
				((ApplyForceContext)_localctx).time_ = variableName();
				}
				break;
			case NONZERODIGIT:
			case ZERO:
				{
				setState(177);
				((ApplyForceContext)_localctx).time_val = integer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(180);
				whiteSpace();
				setState(181);
				match(T__16);
				setState(182);
				whiteSpace();
				setState(185);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LOWERCASELETTER:
				case UPPERCASELETTER:
					{
					setState(183);
					((ApplyForceContext)_localctx).delay_ = variableName();
					}
					break;
				case NONZERODIGIT:
				case ZERO:
					{
					setState(184);
					((ApplyForceContext)_localctx).delay_val_ = integer();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
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
			match(T__17);
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
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_arithmeticalExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(195);
				integer();
				}
				break;
			case 2:
				{
				setState(196);
				float_type();
				}
				break;
			case 3:
				{
				setState(197);
				force_type();
				}
				break;
			case 4:
				{
				setState(198);
				object_type();
				}
				break;
			case 5:
				{
				setState(199);
				variableName();
				}
				break;
			case 6:
				{
				setState(200);
				functionCall();
				}
				break;
			case 7:
				{
				setState(201);
				getAngle();
				}
				break;
			case 8:
				{
				setState(202);
				getCoordinate();
				}
				break;
			case 9:
				{
				setState(203);
				getDistance();
				}
				break;
			case 10:
				{
				setState(204);
				getVelocity();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(218);
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
					setState(207);
					if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
					setState(209);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(208);
						whiteSpace();
						}
					}

					setState(211);
					((ArithmeticalExpressionContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__18) | (1L << T__19) | (1L << T__20))) != 0)) ) {
						((ArithmeticalExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
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
					((ArithmeticalExpressionContext)_localctx).right = arithmeticalExpression(12);
					}
					} 
				}
				setState(220);
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
		enterRule(_localctx, 22, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(T__21);
			setState(222);
			whiteSpace();
			setState(223);
			((DeclarationContext)_localctx).type_sim = variableType();
			setState(224);
			whiteSpace();
			setState(225);
			((DeclarationContext)_localctx).name_ = variableName();
			setState(226);
			whiteSpace();
			setState(227);
			match(T__22);
			setState(228);
			whiteSpace();
			setState(229);
			((DeclarationContext)_localctx).value_ = arithmeticalExpression(0);
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(230);
				whiteSpace();
				}
			}

			setState(233);
			match(T__17);
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
		enterRule(_localctx, 24, RULE_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(T__23);
			setState(236);
			whiteSpace();
			setState(237);
			((DefinitionContext)_localctx).name_ = variableName();
			setState(238);
			whiteSpace();
			setState(239);
			match(T__22);
			setState(240);
			whiteSpace();
			setState(241);
			((DefinitionContext)_localctx).value_ = arithmeticalExpression(0);
			setState(242);
			match(T__17);
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
		enterRule(_localctx, 26, RULE_conditionalStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(T__24);
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(245);
				whiteSpace();
				}
			}

			setState(248);
			match(T__11);
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(249);
				whiteSpace();
				}
			}

			setState(252);
			((ConditionalStatementContext)_localctx).cond = condition();
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
			match(T__12);
			setState(257);
			whiteSpace();
			setState(258);
			match(T__25);
			setState(259);
			whiteSpace();
			setState(260);
			((ConditionalStatementContext)_localctx).con_body = conditionBody();
			setState(261);
			whiteSpace();
			setState(262);
			match(T__26);
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
			match(T__17);
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
		enterRule(_localctx, 28, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(268);
				((ConditionContext)_localctx).left_expr = arithmeticalExpression(0);
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
			((ConditionContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32))) != 0)) ) {
				((ConditionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
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
		enterRule(_localctx, 30, RULE_conditionBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(283);
				instruction();
				setState(285);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(284);
					whiteSpace();
					}
					break;
				}
				}
				}
				setState(289); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__21) | (1L << T__23) | (1L << T__24) | (1L << T__33) | (1L << T__35) | (1L << T__40) | (1L << LOWERCASELETTER) | (1L << UPPERCASELETTER))) != 0) );
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
		enterRule(_localctx, 32, RULE_parallelExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(T__33);
			setState(292);
			whiteSpace();
			setState(293);
			((ParallelExpressionContext)_localctx).par_body = parallelBody();
			setState(294);
			whiteSpace();
			setState(295);
			match(T__34);
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
			match(T__17);
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
		enterRule(_localctx, 34, RULE_parallelBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(301);
				((ParallelBodyContext)_localctx).app_force_ = applyForce();
				setState(303);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(302);
					whiteSpace();
					}
					break;
				}
				}
				}
				setState(307); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__13 );
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
		enterRule(_localctx, 36, RULE_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			match(T__35);
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
			match(T__11);
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
			condition();
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
			match(T__12);
			setState(322);
			whiteSpace();
			setState(323);
			((LoopContext)_localctx).l_body = loopBody();
			setState(324);
			whiteSpace();
			setState(325);
			match(T__36);
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
			match(T__17);
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
		enterRule(_localctx, 38, RULE_loopBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(331);
				instruction();
				}
				}
				setState(334); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__21) | (1L << T__23) | (1L << T__24) | (1L << T__33) | (1L << T__35) | (1L << T__40) | (1L << LOWERCASELETTER) | (1L << UPPERCASELETTER))) != 0) );
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
		enterRule(_localctx, 40, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UPPERCASELETTER) {
				{
				setState(336);
				((FunctionCallContext)_localctx).scope_seq = scopeSequence();
				}
			}

			setState(339);
			((FunctionCallContext)_localctx).f_name = functionName();
			setState(340);
			match(T__11);
			setState(342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(341);
				whiteSpace();
				}
			}

			setState(348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOWERCASELETTER || _la==UPPERCASELETTER) {
				{
				setState(344);
				((FunctionCallContext)_localctx).f_args = functionParams();
				setState(346);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(345);
					whiteSpace();
					}
				}

				}
			}

			setState(350);
			match(T__12);
			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(351);
				whiteSpace();
				}
			}

			setState(354);
			match(T__17);
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
		enterRule(_localctx, 42, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			match(T__37);
			setState(357);
			whiteSpace();
			setState(358);
			((FunctionDeclarationContext)_localctx).f_name = functionName();
			setState(359);
			match(T__11);
			setState(361);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(360);
				whiteSpace();
				}
				break;
			}
			setState(364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4))) != 0)) {
				{
				setState(363);
				((FunctionDeclarationContext)_localctx).f_args = functionArgs();
				}
			}

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
			match(T__12);
			setState(381);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
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
				match(T__38);
				setState(375);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(374);
					whiteSpace();
					}
				}

				setState(377);
				((FunctionDeclarationContext)_localctx).return_type = variableType();
				setState(379);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
				case 1:
					{
					setState(378);
					whiteSpace();
					}
					break;
				}
				}
				break;
			}
			setState(383);
			whiteSpace();
			setState(384);
			match(T__22);
			setState(386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(385);
				whiteSpace();
				}
			}

			setState(388);
			((FunctionDeclarationContext)_localctx).f_body = functionBody();
			setState(390);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(389);
				whiteSpace();
				}
			}

			setState(392);
			match(T__39);
			setState(394);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(393);
				whiteSpace();
				}
			}

			setState(396);
			match(T__17);
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
		enterRule(_localctx, 44, RULE_functionBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(398);
				instruction();
				setState(400);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
				case 1:
					{
					setState(399);
					whiteSpace();
					}
					break;
				}
				}
				}
				setState(404); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__21) | (1L << T__23) | (1L << T__24) | (1L << T__33) | (1L << T__35) | (1L << T__40) | (1L << LOWERCASELETTER) | (1L << UPPERCASELETTER))) != 0) );
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
		enterRule(_localctx, 46, RULE_functionArgs);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			functionArgument();
			setState(417);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(408);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(407);
						whiteSpace();
						}
					}

					setState(410);
					match(T__9);
					setState(412);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(411);
						whiteSpace();
						}
					}

					setState(414);
					functionArgument();
					}
					} 
				}
				setState(419);
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
		enterRule(_localctx, 48, RULE_functionParams);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			variableName();
			setState(431);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(422);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(421);
						whiteSpace();
						}
					}

					setState(424);
					match(T__9);
					setState(426);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(425);
						whiteSpace();
						}
					}

					setState(428);
					variableName();
					}
					} 
				}
				setState(433);
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
		enterRule(_localctx, 50, RULE_functionArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			((FunctionArgumentContext)_localctx).type_ = variableType();
			setState(435);
			whiteSpace();
			setState(436);
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
		enterRule(_localctx, 52, RULE_comment);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			match(T__40);
			setState(442);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(439);
					matchWildcard();
					}
					} 
				}
				setState(444);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			}
			setState(445);
			match(T__41);
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
		enterRule(_localctx, 54, RULE_scopeName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			match(UPPERCASELETTER);
			setState(451);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << LOWERCASELETTER) | (1L << UPPERCASELETTER) | (1L << NONZERODIGIT) | (1L << ZERO))) != 0)) {
				{
				{
				setState(448);
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
				setState(453);
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
		enterRule(_localctx, 56, RULE_scopeSequence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(454);
				scopeName();
				setState(455);
				match(T__42);
				}
				}
				setState(459); 
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
		enterRule(_localctx, 58, RULE_scopeDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			((ScopeDeclarationContext)_localctx).name = scopeName();
			setState(463);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(462);
				whiteSpace();
				}
			}

			setState(465);
			match(T__43);
			setState(467);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(466);
				whiteSpace();
				}
			}

			setState(471); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(471);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case UPPERCASELETTER:
					{
					setState(469);
					scopeDeclaration();
					}
					break;
				case T__21:
					{
					setState(470);
					declaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(473); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__21 || _la==UPPERCASELETTER );
			setState(476);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(475);
				whiteSpace();
				}
			}

			setState(478);
			match(T__44);
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
			match(T__17);
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
		enterRule(_localctx, 60, RULE_whiteSpace);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(485); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(484);
					match(WS);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(487); 
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
		enterRule(_localctx, 62, RULE_getAngle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(489);
			match(T__45);
			setState(491);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(490);
				whiteSpace();
				}
			}

			setState(495);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOWERCASELETTER:
			case UPPERCASELETTER:
				{
				setState(493);
				((GetAngleContext)_localctx).name_1 = variableName();
				}
				break;
			case T__11:
				{
				setState(494);
				((GetAngleContext)_localctx).object_1 = object_type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(498);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(497);
				whiteSpace();
				}
			}

			setState(500);
			match(T__9);
			setState(502);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(501);
				whiteSpace();
				}
			}

			setState(506);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOWERCASELETTER:
			case UPPERCASELETTER:
				{
				setState(504);
				((GetAngleContext)_localctx).name_2 = variableName();
				}
				break;
			case T__11:
				{
				setState(505);
				((GetAngleContext)_localctx).object_2 = object_type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(509);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(508);
				whiteSpace();
				}
			}

			setState(511);
			match(T__17);
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
		enterRule(_localctx, 64, RULE_getCoordinate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(513);
			match(T__46);
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
			((GetCoordinateContext)_localctx).axis = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__47 || _la==T__48) ) {
				((GetCoordinateContext)_localctx).axis = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(519);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(518);
				whiteSpace();
				}
			}

			setState(521);
			match(T__49);
			setState(523);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(522);
				whiteSpace();
				}
			}

			setState(525);
			((GetCoordinateContext)_localctx).name_ = variableName();
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
			match(T__17);
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
		enterRule(_localctx, 66, RULE_getDistance);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(531);
			match(T__50);
			setState(533);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(532);
				whiteSpace();
				}
			}

			setState(537);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOWERCASELETTER:
			case UPPERCASELETTER:
				{
				setState(535);
				((GetDistanceContext)_localctx).name_1 = variableName();
				}
				break;
			case T__11:
				{
				setState(536);
				((GetDistanceContext)_localctx).object_1 = object_type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
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
			match(T__9);
			setState(544);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(543);
				whiteSpace();
				}
			}

			setState(548);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOWERCASELETTER:
			case UPPERCASELETTER:
				{
				setState(546);
				((GetDistanceContext)_localctx).name_2 = variableName();
				}
				break;
			case T__11:
				{
				setState(547);
				((GetDistanceContext)_localctx).object_2 = object_type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(551);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(550);
				whiteSpace();
				}
			}

			setState(553);
			match(T__17);
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
		enterRule(_localctx, 68, RULE_getVelocity);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
			match(T__51);
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
			((GetVelocityContext)_localctx).axis = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__47) | (1L << T__48) | (1L << T__52))) != 0)) ) {
				((GetVelocityContext)_localctx).axis = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(561);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(560);
				whiteSpace();
				}
			}

			setState(563);
			match(T__49);
			setState(565);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(564);
				whiteSpace();
				}
			}

			setState(567);
			((GetVelocityContext)_localctx).name_ = variableName();
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
			match(T__17);
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
		case 10:
			return arithmeticalExpression_sempred((ArithmeticalExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean arithmeticalExpression_sempred(ArithmeticalExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 11);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3<\u0240\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\5\2J\n\2\3\2\3\2\3\2\5\2O\n\2\3\2\5\2R\n\2"+
		"\6\2T\n\2\r\2\16\2U\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3`\n\3\3\4\3\4\3"+
		"\5\5\5e\n\5\3\5\3\5\7\5i\n\5\f\5\16\5l\13\5\3\6\3\6\7\6p\n\6\f\6\16\6"+
		"s\13\6\3\7\3\7\7\7w\n\7\f\7\16\7z\13\7\3\7\5\7}\n\7\3\b\5\b\u0080\n\b"+
		"\3\b\3\b\7\b\u0084\n\b\f\b\16\b\u0087\13\b\3\b\3\b\7\b\u008b\n\b\f\b\16"+
		"\b\u008e\13\b\3\b\3\b\3\b\7\b\u0093\n\b\f\b\16\b\u0096\13\b\5\b\u0098"+
		"\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\5\13\u00aa\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13"+
		"\u00b5\n\13\3\13\3\13\3\13\3\13\3\13\5\13\u00bc\n\13\5\13\u00be\n\13\3"+
		"\13\5\13\u00c1\n\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\5\f\u00d0\n\f\3\f\3\f\5\f\u00d4\n\f\3\f\3\f\5\f\u00d8\n\f\3\f\7\f"+
		"\u00db\n\f\f\f\16\f\u00de\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\5\r\u00ea\n\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\17\3\17\5\17\u00f9\n\17\3\17\3\17\5\17\u00fd\n\17\3\17\3\17\5\17\u0101"+
		"\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u010b\n\17\3\17\3\17"+
		"\3\20\3\20\5\20\u0111\n\20\3\20\5\20\u0114\n\20\3\20\3\20\5\20\u0118\n"+
		"\20\3\20\3\20\5\20\u011c\n\20\3\21\3\21\5\21\u0120\n\21\6\21\u0122\n\21"+
		"\r\21\16\21\u0123\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u012c\n\22\3\22\3"+
		"\22\3\23\3\23\5\23\u0132\n\23\6\23\u0134\n\23\r\23\16\23\u0135\3\24\3"+
		"\24\5\24\u013a\n\24\3\24\3\24\5\24\u013e\n\24\3\24\3\24\5\24\u0142\n\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u014a\n\24\3\24\3\24\3\25\6\25\u014f"+
		"\n\25\r\25\16\25\u0150\3\26\5\26\u0154\n\26\3\26\3\26\3\26\5\26\u0159"+
		"\n\26\3\26\3\26\5\26\u015d\n\26\5\26\u015f\n\26\3\26\3\26\5\26\u0163\n"+
		"\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\5\27\u016c\n\27\3\27\5\27\u016f"+
		"\n\27\3\27\5\27\u0172\n\27\3\27\3\27\5\27\u0176\n\27\3\27\3\27\5\27\u017a"+
		"\n\27\3\27\3\27\5\27\u017e\n\27\5\27\u0180\n\27\3\27\3\27\3\27\5\27\u0185"+
		"\n\27\3\27\3\27\5\27\u0189\n\27\3\27\3\27\5\27\u018d\n\27\3\27\3\27\3"+
		"\30\3\30\5\30\u0193\n\30\6\30\u0195\n\30\r\30\16\30\u0196\3\31\3\31\5"+
		"\31\u019b\n\31\3\31\3\31\5\31\u019f\n\31\3\31\7\31\u01a2\n\31\f\31\16"+
		"\31\u01a5\13\31\3\32\3\32\5\32\u01a9\n\32\3\32\3\32\5\32\u01ad\n\32\3"+
		"\32\7\32\u01b0\n\32\f\32\16\32\u01b3\13\32\3\33\3\33\3\33\3\33\3\34\3"+
		"\34\7\34\u01bb\n\34\f\34\16\34\u01be\13\34\3\34\3\34\3\35\3\35\7\35\u01c4"+
		"\n\35\f\35\16\35\u01c7\13\35\3\36\3\36\3\36\6\36\u01cc\n\36\r\36\16\36"+
		"\u01cd\3\37\3\37\5\37\u01d2\n\37\3\37\3\37\5\37\u01d6\n\37\3\37\3\37\6"+
		"\37\u01da\n\37\r\37\16\37\u01db\3\37\5\37\u01df\n\37\3\37\3\37\5\37\u01e3"+
		"\n\37\3\37\3\37\3 \6 \u01e8\n \r \16 \u01e9\3!\3!\5!\u01ee\n!\3!\3!\5"+
		"!\u01f2\n!\3!\5!\u01f5\n!\3!\3!\5!\u01f9\n!\3!\3!\5!\u01fd\n!\3!\5!\u0200"+
		"\n!\3!\3!\3\"\3\"\5\"\u0206\n\"\3\"\3\"\5\"\u020a\n\"\3\"\3\"\5\"\u020e"+
		"\n\"\3\"\3\"\5\"\u0212\n\"\3\"\3\"\3#\3#\5#\u0218\n#\3#\3#\5#\u021c\n"+
		"#\3#\5#\u021f\n#\3#\3#\5#\u0223\n#\3#\3#\5#\u0227\n#\3#\5#\u022a\n#\3"+
		"#\3#\3$\3$\5$\u0230\n$\3$\3$\5$\u0234\n$\3$\3$\5$\u0238\n$\3$\3$\5$\u023c"+
		"\n$\3$\3$\3$\3\u01bc\3\26%\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$"+
		"&(*,.\60\62\64\668:<>@BDF\2\t\3\2\3\7\4\2\b\b9<\3\2;<\4\2\t\t\25\27\3"+
		"\2\36#\3\2\62\63\4\2\62\63\67\67\2\u028b\2S\3\2\2\2\4_\3\2\2\2\6a\3\2"+
		"\2\2\bd\3\2\2\2\nm\3\2\2\2\f|\3\2\2\2\16\u0097\3\2\2\2\20\u0099\3\2\2"+
		"\2\22\u009f\3\2\2\2\24\u00a5\3\2\2\2\26\u00cf\3\2\2\2\30\u00df\3\2\2\2"+
		"\32\u00ed\3\2\2\2\34\u00f6\3\2\2\2\36\u0110\3\2\2\2 \u0121\3\2\2\2\"\u0125"+
		"\3\2\2\2$\u0133\3\2\2\2&\u0137\3\2\2\2(\u014e\3\2\2\2*\u0153\3\2\2\2,"+
		"\u0166\3\2\2\2.\u0194\3\2\2\2\60\u0198\3\2\2\2\62\u01a6\3\2\2\2\64\u01b4"+
		"\3\2\2\2\66\u01b8\3\2\2\28\u01c1\3\2\2\2:\u01cb\3\2\2\2<\u01cf\3\2\2\2"+
		">\u01e7\3\2\2\2@\u01eb\3\2\2\2B\u0203\3\2\2\2D\u0215\3\2\2\2F\u022d\3"+
		"\2\2\2HJ\5> \2IH\3\2\2\2IJ\3\2\2\2JN\3\2\2\2KO\5,\27\2LO\5\4\3\2MO\5<"+
		"\37\2NK\3\2\2\2NL\3\2\2\2NM\3\2\2\2OQ\3\2\2\2PR\5> \2QP\3\2\2\2QR\3\2"+
		"\2\2RT\3\2\2\2SI\3\2\2\2TU\3\2\2\2US\3\2\2\2UV\3\2\2\2V\3\3\2\2\2W`\5"+
		"\30\r\2X`\5\32\16\2Y`\5\34\17\2Z`\5\"\22\2[`\5&\24\2\\`\5*\26\2]`\5\24"+
		"\13\2^`\5\66\34\2_W\3\2\2\2_X\3\2\2\2_Y\3\2\2\2_Z\3\2\2\2_[\3\2\2\2_\\"+
		"\3\2\2\2_]\3\2\2\2_^\3\2\2\2`\5\3\2\2\2ab\t\2\2\2b\7\3\2\2\2ce\5:\36\2"+
		"dc\3\2\2\2de\3\2\2\2ef\3\2\2\2fj\79\2\2gi\t\3\2\2hg\3\2\2\2il\3\2\2\2"+
		"jh\3\2\2\2jk\3\2\2\2k\t\3\2\2\2lj\3\2\2\2mq\79\2\2np\t\3\2\2on\3\2\2\2"+
		"ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2r\13\3\2\2\2sq\3\2\2\2tx\7;\2\2uw\t\4\2"+
		"\2vu\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y}\3\2\2\2zx\3\2\2\2{}\7<\2"+
		"\2|t\3\2\2\2|{\3\2\2\2}\r\3\2\2\2~\u0080\7\t\2\2\177~\3\2\2\2\177\u0080"+
		"\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0085\7;\2\2\u0082\u0084\t\4\2\2\u0083"+
		"\u0082\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2"+
		"\2\2\u0086\u0088\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u008c\7\n\2\2\u0089"+
		"\u008b\t\4\2\2\u008a\u0089\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2"+
		"\2\2\u008c\u008d\3\2\2\2\u008d\u0098\3\2\2\2\u008e\u008c\3\2\2\2\u008f"+
		"\u0090\7<\2\2\u0090\u0094\7\n\2\2\u0091\u0093\t\4\2\2\u0092\u0091\3\2"+
		"\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095"+
		"\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0097\177\3\2\2\2\u0097\u008f\3\2\2"+
		"\2\u0098\17\3\2\2\2\u0099\u009a\7\13\2\2\u009a\u009b\5\f\7\2\u009b\u009c"+
		"\7\f\2\2\u009c\u009d\5\f\7\2\u009d\u009e\7\r\2\2\u009e\21\3\2\2\2\u009f"+
		"\u00a0\7\16\2\2\u00a0\u00a1\5\f\7\2\u00a1\u00a2\7\f\2\2\u00a2\u00a3\5"+
		"\f\7\2\u00a3\u00a4\7\17\2\2\u00a4\23\3\2\2\2\u00a5\u00a6\7\20\2\2\u00a6"+
		"\u00a9\5> \2\u00a7\u00aa\5\b\5\2\u00a8\u00aa\5\20\t\2\u00a9\u00a7\3\2"+
		"\2\2\u00a9\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\5> \2\u00ac\u00ad"+
		"\7\21\2\2\u00ad\u00ae\5> \2\u00ae\u00af\5\b\5\2\u00af\u00b0\5> \2\u00b0"+
		"\u00b1\7\22\2\2\u00b1\u00b4\5> \2\u00b2\u00b5\5\b\5\2\u00b3\u00b5\5\f"+
		"\7\2\u00b4\u00b2\3\2\2\2\u00b4\u00b3\3\2\2\2\u00b5\u00bd\3\2\2\2\u00b6"+
		"\u00b7\5> \2\u00b7\u00b8\7\23\2\2\u00b8\u00bb\5> \2\u00b9\u00bc\5\b\5"+
		"\2\u00ba\u00bc\5\f\7\2\u00bb\u00b9\3\2\2\2\u00bb\u00ba\3\2\2\2\u00bc\u00be"+
		"\3\2\2\2\u00bd\u00b6\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c0\3\2\2\2\u00bf"+
		"\u00c1\5> \2\u00c0\u00bf\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\3\2\2"+
		"\2\u00c2\u00c3\7\24\2\2\u00c3\25\3\2\2\2\u00c4\u00c5\b\f\1\2\u00c5\u00d0"+
		"\5\f\7\2\u00c6\u00d0\5\16\b\2\u00c7\u00d0\5\20\t\2\u00c8\u00d0\5\22\n"+
		"\2\u00c9\u00d0\5\b\5\2\u00ca\u00d0\5*\26\2\u00cb\u00d0\5@!\2\u00cc\u00d0"+
		"\5B\"\2\u00cd\u00d0\5D#\2\u00ce\u00d0\5F$\2\u00cf\u00c4\3\2\2\2\u00cf"+
		"\u00c6\3\2\2\2\u00cf\u00c7\3\2\2\2\u00cf\u00c8\3\2\2\2\u00cf\u00c9\3\2"+
		"\2\2\u00cf\u00ca\3\2\2\2\u00cf\u00cb\3\2\2\2\u00cf\u00cc\3\2\2\2\u00cf"+
		"\u00cd\3\2\2\2\u00cf\u00ce\3\2\2\2\u00d0\u00dc\3\2\2\2\u00d1\u00d3\f\r"+
		"\2\2\u00d2\u00d4\5> \2\u00d3\u00d2\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5"+
		"\3\2\2\2\u00d5\u00d7\t\5\2\2\u00d6\u00d8\5> \2\u00d7\u00d6\3\2\2\2\u00d7"+
		"\u00d8\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00db\5\26\f\16\u00da\u00d1\3"+
		"\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd"+
		"\27\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00e0\7\30\2\2\u00e0\u00e1\5> \2"+
		"\u00e1\u00e2\5\6\4\2\u00e2\u00e3\5> \2\u00e3\u00e4\5\b\5\2\u00e4\u00e5"+
		"\5> \2\u00e5\u00e6\7\31\2\2\u00e6\u00e7\5> \2\u00e7\u00e9\5\26\f\2\u00e8"+
		"\u00ea\5> \2\u00e9\u00e8\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb\3\2\2"+
		"\2\u00eb\u00ec\7\24\2\2\u00ec\31\3\2\2\2\u00ed\u00ee\7\32\2\2\u00ee\u00ef"+
		"\5> \2\u00ef\u00f0\5\b\5\2\u00f0\u00f1\5> \2\u00f1\u00f2\7\31\2\2\u00f2"+
		"\u00f3\5> \2\u00f3\u00f4\5\26\f\2\u00f4\u00f5\7\24\2\2\u00f5\33\3\2\2"+
		"\2\u00f6\u00f8\7\33\2\2\u00f7\u00f9\5> \2\u00f8\u00f7\3\2\2\2\u00f8\u00f9"+
		"\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fc\7\16\2\2\u00fb\u00fd\5> \2\u00fc"+
		"\u00fb\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0100\5\36"+
		"\20\2\u00ff\u0101\5> \2\u0100\u00ff\3\2\2\2\u0100\u0101\3\2\2\2\u0101"+
		"\u0102\3\2\2\2\u0102\u0103\7\17\2\2\u0103\u0104\5> \2\u0104\u0105\7\34"+
		"\2\2\u0105\u0106\5> \2\u0106\u0107\5 \21\2\u0107\u0108\5> \2\u0108\u010a"+
		"\7\35\2\2\u0109\u010b\5> \2\u010a\u0109\3\2\2\2\u010a\u010b\3\2\2\2\u010b"+
		"\u010c\3\2\2\2\u010c\u010d\7\24\2\2\u010d\35\3\2\2\2\u010e\u0111\5\26"+
		"\f\2\u010f\u0111\5\b\5\2\u0110\u010e\3\2\2\2\u0110\u010f\3\2\2\2\u0111"+
		"\u0113\3\2\2\2\u0112\u0114\5> \2\u0113\u0112\3\2\2\2\u0113\u0114\3\2\2"+
		"\2\u0114\u0115\3\2\2\2\u0115\u0117\t\6\2\2\u0116\u0118\5> \2\u0117\u0116"+
		"\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u011b\3\2\2\2\u0119\u011c\5\26\f\2"+
		"\u011a\u011c\5\b\5\2\u011b\u0119\3\2\2\2\u011b\u011a\3\2\2\2\u011c\37"+
		"\3\2\2\2\u011d\u011f\5\4\3\2\u011e\u0120\5> \2\u011f\u011e\3\2\2\2\u011f"+
		"\u0120\3\2\2\2\u0120\u0122\3\2\2\2\u0121\u011d\3\2\2\2\u0122\u0123\3\2"+
		"\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124!\3\2\2\2\u0125\u0126"+
		"\7$\2\2\u0126\u0127\5> \2\u0127\u0128\5$\23\2\u0128\u0129\5> \2\u0129"+
		"\u012b\7%\2\2\u012a\u012c\5> \2\u012b\u012a\3\2\2\2\u012b\u012c\3\2\2"+
		"\2\u012c\u012d\3\2\2\2\u012d\u012e\7\24\2\2\u012e#\3\2\2\2\u012f\u0131"+
		"\5\24\13\2\u0130\u0132\5> \2\u0131\u0130\3\2\2\2\u0131\u0132\3\2\2\2\u0132"+
		"\u0134\3\2\2\2\u0133\u012f\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0133\3\2"+
		"\2\2\u0135\u0136\3\2\2\2\u0136%\3\2\2\2\u0137\u0139\7&\2\2\u0138\u013a"+
		"\5> \2\u0139\u0138\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013b\3\2\2\2\u013b"+
		"\u013d\7\16\2\2\u013c\u013e\5> \2\u013d\u013c\3\2\2\2\u013d\u013e\3\2"+
		"\2\2\u013e\u013f\3\2\2\2\u013f\u0141\5\36\20\2\u0140\u0142\5> \2\u0141"+
		"\u0140\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0144\7\17"+
		"\2\2\u0144\u0145\5> \2\u0145\u0146\5(\25\2\u0146\u0147\5> \2\u0147\u0149"+
		"\7\'\2\2\u0148\u014a\5> \2\u0149\u0148\3\2\2\2\u0149\u014a\3\2\2\2\u014a"+
		"\u014b\3\2\2\2\u014b\u014c\7\24\2\2\u014c\'\3\2\2\2\u014d\u014f\5\4\3"+
		"\2\u014e\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u014e\3\2\2\2\u0150\u0151"+
		"\3\2\2\2\u0151)\3\2\2\2\u0152\u0154\5:\36\2\u0153\u0152\3\2\2\2\u0153"+
		"\u0154\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0156\5\n\6\2\u0156\u0158\7\16"+
		"\2\2\u0157\u0159\5> \2\u0158\u0157\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015e"+
		"\3\2\2\2\u015a\u015c\5\62\32\2\u015b\u015d\5> \2\u015c\u015b\3\2\2\2\u015c"+
		"\u015d\3\2\2\2\u015d\u015f\3\2\2\2\u015e\u015a\3\2\2\2\u015e\u015f\3\2"+
		"\2\2\u015f\u0160\3\2\2\2\u0160\u0162\7\17\2\2\u0161\u0163\5> \2\u0162"+
		"\u0161\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0165\7\24"+
		"\2\2\u0165+\3\2\2\2\u0166\u0167\7(\2\2\u0167\u0168\5> \2\u0168\u0169\5"+
		"\n\6\2\u0169\u016b\7\16\2\2\u016a\u016c\5> \2\u016b\u016a\3\2\2\2\u016b"+
		"\u016c\3\2\2\2\u016c\u016e\3\2\2\2\u016d\u016f\5\60\31\2\u016e\u016d\3"+
		"\2\2\2\u016e\u016f\3\2\2\2\u016f\u0171\3\2\2\2\u0170\u0172\5> \2\u0171"+
		"\u0170\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u017f\7\17"+
		"\2\2\u0174\u0176\5> \2\u0175\u0174\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0177"+
		"\3\2\2\2\u0177\u0179\7)\2\2\u0178\u017a\5> \2\u0179\u0178\3\2\2\2\u0179"+
		"\u017a\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017d\5\6\4\2\u017c\u017e\5>"+
		" \2\u017d\u017c\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u0180\3\2\2\2\u017f"+
		"\u0175\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0182\5>"+
		" \2\u0182\u0184\7\31\2\2\u0183\u0185\5> \2\u0184\u0183\3\2\2\2\u0184\u0185"+
		"\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0188\5.\30\2\u0187\u0189\5> \2\u0188"+
		"\u0187\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018c\7*"+
		"\2\2\u018b\u018d\5> \2\u018c\u018b\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018e"+
		"\3\2\2\2\u018e\u018f\7\24\2\2\u018f-\3\2\2\2\u0190\u0192\5\4\3\2\u0191"+
		"\u0193\5> \2\u0192\u0191\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0195\3\2\2"+
		"\2\u0194\u0190\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0194\3\2\2\2\u0196\u0197"+
		"\3\2\2\2\u0197/\3\2\2\2\u0198\u01a3\5\64\33\2\u0199\u019b\5> \2\u019a"+
		"\u0199\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u019e\7\f"+
		"\2\2\u019d\u019f\5> \2\u019e\u019d\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a0"+
		"\3\2\2\2\u01a0\u01a2\5\64\33\2\u01a1\u019a\3\2\2\2\u01a2\u01a5\3\2\2\2"+
		"\u01a3\u01a1\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\61\3\2\2\2\u01a5\u01a3"+
		"\3\2\2\2\u01a6\u01b1\5\b\5\2\u01a7\u01a9\5> \2\u01a8\u01a7\3\2\2\2\u01a8"+
		"\u01a9\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ac\7\f\2\2\u01ab\u01ad\5>"+
		" \2\u01ac\u01ab\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae"+
		"\u01b0\5\b\5\2\u01af\u01a8\3\2\2\2\u01b0\u01b3\3\2\2\2\u01b1\u01af\3\2"+
		"\2\2\u01b1\u01b2\3\2\2\2\u01b2\63\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b4\u01b5"+
		"\5\6\4\2\u01b5\u01b6\5> \2\u01b6\u01b7\5\b\5\2\u01b7\65\3\2\2\2\u01b8"+
		"\u01bc\7+\2\2\u01b9\u01bb\13\2\2\2\u01ba\u01b9\3\2\2\2\u01bb\u01be\3\2"+
		"\2\2\u01bc\u01bd\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bd\u01bf\3\2\2\2\u01be"+
		"\u01bc\3\2\2\2\u01bf\u01c0\7,\2\2\u01c0\67\3\2\2\2\u01c1\u01c5\7:\2\2"+
		"\u01c2\u01c4\t\3\2\2\u01c3\u01c2\3\2\2\2\u01c4\u01c7\3\2\2\2\u01c5\u01c3"+
		"\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c69\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c8"+
		"\u01c9\58\35\2\u01c9\u01ca\7-\2\2\u01ca\u01cc\3\2\2\2\u01cb\u01c8\3\2"+
		"\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01cb\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce"+
		";\3\2\2\2\u01cf\u01d1\58\35\2\u01d0\u01d2\5> \2\u01d1\u01d0\3\2\2\2\u01d1"+
		"\u01d2\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01d5\7.\2\2\u01d4\u01d6\5> "+
		"\2\u01d5\u01d4\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d9\3\2\2\2\u01d7\u01da"+
		"\5<\37\2\u01d8\u01da\5\30\r\2\u01d9\u01d7\3\2\2\2\u01d9\u01d8\3\2\2\2"+
		"\u01da\u01db\3\2\2\2\u01db\u01d9\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc\u01de"+
		"\3\2\2\2\u01dd\u01df\5> \2\u01de\u01dd\3\2\2\2\u01de\u01df\3\2\2\2\u01df"+
		"\u01e0\3\2\2\2\u01e0\u01e2\7/\2\2\u01e1\u01e3\5> \2\u01e2\u01e1\3\2\2"+
		"\2\u01e2\u01e3\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01e5\7\24\2\2\u01e5"+
		"=\3\2\2\2\u01e6\u01e8\78\2\2\u01e7\u01e6\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9"+
		"\u01e7\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea?\3\2\2\2\u01eb\u01ed\7\60\2\2"+
		"\u01ec\u01ee\5> \2\u01ed\u01ec\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee\u01f1"+
		"\3\2\2\2\u01ef\u01f2\5\b\5\2\u01f0\u01f2\5\22\n\2\u01f1\u01ef\3\2\2\2"+
		"\u01f1\u01f0\3\2\2\2\u01f2\u01f4\3\2\2\2\u01f3\u01f5\5> \2\u01f4\u01f3"+
		"\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01f8\7\f\2\2\u01f7"+
		"\u01f9\5> \2\u01f8\u01f7\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9\u01fc\3\2\2"+
		"\2\u01fa\u01fd\5\b\5\2\u01fb\u01fd\5\22\n\2\u01fc\u01fa\3\2\2\2\u01fc"+
		"\u01fb\3\2\2\2\u01fd\u01ff\3\2\2\2\u01fe\u0200\5> \2\u01ff\u01fe\3\2\2"+
		"\2\u01ff\u0200\3\2\2\2\u0200\u0201\3\2\2\2\u0201\u0202\7\24\2\2\u0202"+
		"A\3\2\2\2\u0203\u0205\7\61\2\2\u0204\u0206\5> \2\u0205\u0204\3\2\2\2\u0205"+
		"\u0206\3\2\2\2\u0206\u0207\3\2\2\2\u0207\u0209\t\7\2\2\u0208\u020a\5>"+
		" \2\u0209\u0208\3\2\2\2\u0209\u020a\3\2\2\2\u020a\u020b\3\2\2\2\u020b"+
		"\u020d\7\64\2\2\u020c\u020e\5> \2\u020d\u020c\3\2\2\2\u020d\u020e\3\2"+
		"\2\2\u020e\u020f\3\2\2\2\u020f\u0211\5\b\5\2\u0210\u0212\5> \2\u0211\u0210"+
		"\3\2\2\2\u0211\u0212\3\2\2\2\u0212\u0213\3\2\2\2\u0213\u0214\7\24\2\2"+
		"\u0214C\3\2\2\2\u0215\u0217\7\65\2\2\u0216\u0218\5> \2\u0217\u0216\3\2"+
		"\2\2\u0217\u0218\3\2\2\2\u0218\u021b\3\2\2\2\u0219\u021c\5\b\5\2\u021a"+
		"\u021c\5\22\n\2\u021b\u0219\3\2\2\2\u021b\u021a\3\2\2\2\u021c\u021e\3"+
		"\2\2\2\u021d\u021f\5> \2\u021e\u021d\3\2\2\2\u021e\u021f\3\2\2\2\u021f"+
		"\u0220\3\2\2\2\u0220\u0222\7\f\2\2\u0221\u0223\5> \2\u0222\u0221\3\2\2"+
		"\2\u0222\u0223\3\2\2\2\u0223\u0226\3\2\2\2\u0224\u0227\5\b\5\2\u0225\u0227"+
		"\5\22\n\2\u0226\u0224\3\2\2\2\u0226\u0225\3\2\2\2\u0227\u0229\3\2\2\2"+
		"\u0228\u022a\5> \2\u0229\u0228\3\2\2\2\u0229\u022a\3\2\2\2\u022a\u022b"+
		"\3\2\2\2\u022b\u022c\7\24\2\2\u022cE\3\2\2\2\u022d\u022f\7\66\2\2\u022e"+
		"\u0230\5> \2\u022f\u022e\3\2\2\2\u022f\u0230\3\2\2\2\u0230\u0231\3\2\2"+
		"\2\u0231\u0233\t\b\2\2\u0232\u0234\5> \2\u0233\u0232\3\2\2\2\u0233\u0234"+
		"\3\2\2\2\u0234\u0235\3\2\2\2\u0235\u0237\7\64\2\2\u0236\u0238\5> \2\u0237"+
		"\u0236\3\2\2\2\u0237\u0238\3\2\2\2\u0238\u0239\3\2\2\2\u0239\u023b\5\b"+
		"\5\2\u023a\u023c\5> \2\u023b\u023a\3\2\2\2\u023b\u023c\3\2\2\2\u023c\u023d"+
		"\3\2\2\2\u023d\u023e\7\24\2\2\u023eG\3\2\2\2bINQU_djqx|\177\u0085\u008c"+
		"\u0094\u0097\u00a9\u00b4\u00bb\u00bd\u00c0\u00cf\u00d3\u00d7\u00dc\u00e9"+
		"\u00f8\u00fc\u0100\u010a\u0110\u0113\u0117\u011b\u011f\u0123\u012b\u0131"+
		"\u0135\u0139\u013d\u0141\u0149\u0150\u0153\u0158\u015c\u015e\u0162\u016b"+
		"\u016e\u0171\u0175\u0179\u017d\u017f\u0184\u0188\u018c\u0192\u0196\u019a"+
		"\u019e\u01a3\u01a8\u01ac\u01b1\u01bc\u01c5\u01cd\u01d1\u01d5\u01d9\u01db"+
		"\u01de\u01e2\u01e9\u01ed\u01f1\u01f4\u01f8\u01fc\u01ff\u0205\u0209\u020d"+
		"\u0211\u0217\u021b\u021e\u0222\u0226\u0229\u022f\u0233\u0237\u023b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}