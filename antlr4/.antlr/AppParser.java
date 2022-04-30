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
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, WS=58, LOWERCASELETTER=59, 
		UPPERCASELETTER=60, NONZERODIGIT=61, ZERO=62;
	public static final int
		RULE_primaryExpression = 0, RULE_instruction = 1, RULE_variableType = 2, 
		RULE_variableName = 3, RULE_functionName = 4, RULE_integer = 5, RULE_float_type = 6, 
		RULE_time_type = 7, RULE_force_type = 8, RULE_object_type = 9, RULE_applyForce = 10, 
		RULE_arithmeticalExpression = 11, RULE_declaration = 12, RULE_definition = 13, 
		RULE_conditionalStatement = 14, RULE_condition = 15, RULE_conditionBody = 16, 
		RULE_elifStatement = 17, RULE_elseStatement = 18, RULE_parallelExpression = 19, 
		RULE_parallelBody = 20, RULE_loop = 21, RULE_loopBody = 22, RULE_functionCall = 23, 
		RULE_functionDeclaration = 24, RULE_functionBody = 25, RULE_functionArgs = 26, 
		RULE_functionParams = 27, RULE_functionArgument = 28, RULE_return_statement = 29, 
		RULE_comment = 30, RULE_scopeName = 31, RULE_scopeSequence = 32, RULE_scopeDeclaration = 33, 
		RULE_whiteSpace = 34, RULE_getAngle = 35, RULE_getCoordinate = 36, RULE_getDistance = 37, 
		RULE_getVelocity = 38;
	private static String[] makeRuleNames() {
		return new String[] {
			"primaryExpression", "instruction", "variableType", "variableName", "functionName", 
			"integer", "float_type", "time_type", "force_type", "object_type", "applyForce", 
			"arithmeticalExpression", "declaration", "definition", "conditionalStatement", 
			"condition", "conditionBody", "elifStatement", "elseStatement", "parallelExpression", 
			"parallelBody", "loop", "loopBody", "functionCall", "functionDeclaration", 
			"functionBody", "functionArgs", "functionParams", "functionArgument", 
			"return_statement", "comment", "scopeName", "scopeSequence", "scopeDeclaration", 
			"whiteSpace", "getAngle", "getCoordinate", "getDistance", "getVelocity"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'TIME'", "'INT'", "'FORCE'", "'OBJECT'", "'FLOAT'", "'_'", 
			"'-'", "'.'", "':'", "'['", "','", "']'", "'('", "')'", "'APPLY'", "'TO'", 
			"'FOR'", "'DELAY'", "'+'", "'/'", "'*'", "'DEFINE'", "'AS'", "'SET'", 
			"'IF'", "'THEN'", "'ENDIF'", "'=='", "'>'", "'<'", "'>='", "'<='", "'!='", 
			"'ELIF'", "'ELSE'", "'PARALLEL'", "'ENDPARALLEL'", "'LOOP'", "'ENDLOOP'", 
			"'DEFINE FUNCTION'", "'->'", "'ENDFUNCTION'", "'RETURN'", "'/*'", "'*/'", 
			"'::'", "'{'", "'}'", "'ANGLE BETWEEN'", "'COORDINATE'", "'X'", "'Y'", 
			"'OF'", "'DISTANCE BETWEEN'", "'VELOCITY'", "'VALUE'", null, null, null, 
			null, "'0'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "WS", "LOWERCASELETTER", 
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
			setState(89); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(78);
					whiteSpace();
					}
				}

				setState(84);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(81);
					functionDeclaration();
					}
					break;
				case 2:
					{
					setState(82);
					instruction();
					}
					break;
				case 3:
					{
					setState(83);
					scopeDeclaration();
					}
					break;
				}
				setState(87);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(86);
					whiteSpace();
					}
					break;
				}
				}
				}
				setState(91); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__22) | (1L << T__24) | (1L << T__25) | (1L << T__36) | (1L << T__38) | (1L << T__40) | (1L << T__44) | (1L << WS) | (1L << LOWERCASELETTER) | (1L << UPPERCASELETTER))) != 0) );
			}
		}
		catch (RecognitionException re) {
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
		public WhiteSpaceContext whiteSpace() {
			return getRuleContext(WhiteSpaceContext.class,0);
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
		int _la;
		try {
			setState(106);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__22:
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				declaration();
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				definition();
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 3);
				{
				setState(95);
				conditionalStatement();
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 4);
				{
				setState(96);
				parallelExpression();
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 5);
				{
				setState(97);
				loop();
				}
				break;
			case LOWERCASELETTER:
			case UPPERCASELETTER:
				enterOuterAlt(_localctx, 6);
				{
				setState(98);
				functionCall();
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(99);
					whiteSpace();
					}
				}

				setState(102);
				match(T__0);
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 7);
				{
				setState(104);
				applyForce();
				}
				break;
			case T__44:
				enterOuterAlt(_localctx, 8);
				{
				setState(105);
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
			setState(108);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5))) != 0)) ) {
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
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UPPERCASELETTER) {
				{
				setState(110);
				((VariableNameContext)_localctx).scope_seq = scopeSequence();
				}
			}

			setState(113);
			match(LOWERCASELETTER);
			setState(117);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(114);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << LOWERCASELETTER) | (1L << UPPERCASELETTER) | (1L << NONZERODIGIT) | (1L << ZERO))) != 0)) ) {
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
				setState(119);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
			setState(120);
			match(LOWERCASELETTER);
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << LOWERCASELETTER) | (1L << UPPERCASELETTER) | (1L << NONZERODIGIT) | (1L << ZERO))) != 0)) {
				{
				{
				setState(121);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << LOWERCASELETTER) | (1L << UPPERCASELETTER) | (1L << NONZERODIGIT) | (1L << ZERO))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(126);
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
			setState(135);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NONZERODIGIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				match(NONZERODIGIT);
				setState(131);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
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
					}
					setState(133);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				}
				break;
			case ZERO:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
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
			setState(160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
			case NONZERODIGIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(137);
					((Float_typeContext)_localctx).minus = match(T__7);
					}
				}

				setState(140);
				match(NONZERODIGIT);
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NONZERODIGIT || _la==ZERO) {
					{
					{
					setState(141);
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
					setState(146);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(147);
				match(T__8);
				setState(149); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(148);
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
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(151); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case ZERO:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				match(ZERO);
				setState(154);
				match(T__8);
				setState(156); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(155);
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
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(158); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
			setState(163); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
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
				}
				}
				setState(165); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NONZERODIGIT || _la==ZERO );
			setState(167);
			match(T__9);
			setState(168);
			_la = _input.LA(1);
			if ( !(_la==NONZERODIGIT || _la==ZERO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(169);
			_la = _input.LA(1);
			if ( !(_la==NONZERODIGIT || _la==ZERO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(170);
			match(T__9);
			setState(171);
			_la = _input.LA(1);
			if ( !(_la==NONZERODIGIT || _la==ZERO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(172);
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
		public ArithmeticalExpressionContext angle;
		public ArithmeticalExpressionContext power;
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
		public Force_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_force_type; }
	}

	public final Force_typeContext force_type() throws RecognitionException {
		Force_typeContext _localctx = new Force_typeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_force_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(T__10);
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(175);
				whiteSpace();
				}
			}

			setState(178);
			((Force_typeContext)_localctx).angle = arithmeticalExpression(0);
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(179);
				whiteSpace();
				}
			}

			setState(182);
			match(T__11);
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(183);
				whiteSpace();
				}
			}

			setState(186);
			((Force_typeContext)_localctx).power = arithmeticalExpression(0);
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(187);
				whiteSpace();
				}
			}

			setState(190);
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

	public static class Object_typeContext extends ParserRuleContext {
		public ArithmeticalExpressionContext x_cor;
		public ArithmeticalExpressionContext y_cor;
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
		public Object_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object_type; }
	}

	public final Object_typeContext object_type() throws RecognitionException {
		Object_typeContext _localctx = new Object_typeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_object_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(T__13);
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
			((Object_typeContext)_localctx).x_cor = arithmeticalExpression(0);
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(197);
				whiteSpace();
				}
			}

			setState(200);
			match(T__11);
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(201);
				whiteSpace();
				}
			}

			setState(204);
			((Object_typeContext)_localctx).y_cor = arithmeticalExpression(0);
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
			setState(210);
			match(T__15);
			setState(211);
			whiteSpace();
			setState(214);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOWERCASELETTER:
			case UPPERCASELETTER:
				{
				setState(212);
				((ApplyForceContext)_localctx).force_ = variableName();
				}
				break;
			case T__10:
				{
				setState(213);
				((ApplyForceContext)_localctx).force_val = force_type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(216);
			whiteSpace();
			setState(217);
			match(T__16);
			setState(218);
			whiteSpace();
			setState(219);
			((ApplyForceContext)_localctx).object_ = variableName();
			setState(220);
			whiteSpace();
			setState(221);
			match(T__17);
			setState(222);
			whiteSpace();
			setState(226);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(223);
				((ApplyForceContext)_localctx).time_ = variableName();
				}
				break;
			case 2:
				{
				setState(224);
				((ApplyForceContext)_localctx).time_val = integer();
				}
				break;
			case 3:
				{
				setState(225);
				((ApplyForceContext)_localctx).time_type_val = time_type();
				}
				break;
			}
			setState(236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(228);
				whiteSpace();
				setState(229);
				match(T__18);
				setState(230);
				whiteSpace();
				setState(234);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(231);
					((ApplyForceContext)_localctx).delay_ = variableName();
					}
					break;
				case 2:
					{
					setState(232);
					((ApplyForceContext)_localctx).delay_val_ = integer();
					}
					break;
				case 3:
					{
					setState(233);
					((ApplyForceContext)_localctx).delay_time_type_val = time_type();
					}
					break;
				}
				}
				break;
			}
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(238);
				whiteSpace();
				}
			}

			setState(241);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
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
			setState(255);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(244);
				integer();
				}
				break;
			case 2:
				{
				setState(245);
				float_type();
				}
				break;
			case 3:
				{
				setState(246);
				force_type();
				}
				break;
			case 4:
				{
				setState(247);
				object_type();
				}
				break;
			case 5:
				{
				setState(248);
				time_type();
				}
				break;
			case 6:
				{
				setState(249);
				variableName();
				}
				break;
			case 7:
				{
				setState(250);
				functionCall();
				}
				break;
			case 8:
				{
				setState(251);
				getAngle();
				}
				break;
			case 9:
				{
				setState(252);
				getCoordinate();
				}
				break;
			case 10:
				{
				setState(253);
				getDistance();
				}
				break;
			case 11:
				{
				setState(254);
				getVelocity();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(268);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
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
					setState(257);
					if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
					setState(259);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(258);
						whiteSpace();
						}
					}

					setState(261);
					((ArithmeticalExpressionContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__19) | (1L << T__20) | (1L << T__21))) != 0)) ) {
						((ArithmeticalExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
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
					((ArithmeticalExpressionContext)_localctx).right = arithmeticalExpression(13);
					}
					} 
				}
				setState(270);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
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
		public VariableTypeContext type_;
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
			setState(271);
			match(T__22);
			setState(272);
			whiteSpace();
			setState(273);
			((DeclarationContext)_localctx).type_ = variableType();
			setState(274);
			whiteSpace();
			setState(275);
			((DeclarationContext)_localctx).name_ = variableName();
			setState(276);
			whiteSpace();
			setState(277);
			match(T__23);
			setState(278);
			whiteSpace();
			setState(279);
			((DeclarationContext)_localctx).value_ = arithmeticalExpression(0);
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
			match(T__0);
			}
		}
		catch (RecognitionException re) {
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
			setState(285);
			match(T__24);
			setState(286);
			whiteSpace();
			setState(287);
			((DefinitionContext)_localctx).name_ = variableName();
			setState(288);
			whiteSpace();
			setState(289);
			match(T__23);
			setState(290);
			whiteSpace();
			setState(291);
			((DefinitionContext)_localctx).value_ = arithmeticalExpression(0);
			setState(292);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
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
		public ElifStatementContext elif_stat;
		public ElseStatementContext else_stat;
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
		public List<ElifStatementContext> elifStatement() {
			return getRuleContexts(ElifStatementContext.class);
		}
		public ElifStatementContext elifStatement(int i) {
			return getRuleContext(ElifStatementContext.class,i);
		}
		public ElseStatementContext elseStatement() {
			return getRuleContext(ElseStatementContext.class,0);
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
			setState(294);
			match(T__25);
			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(295);
				whiteSpace();
				}
			}

			setState(298);
			match(T__13);
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(299);
				whiteSpace();
				}
			}

			setState(302);
			((ConditionalStatementContext)_localctx).cond = condition();
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(303);
				whiteSpace();
				}
			}

			setState(306);
			match(T__14);
			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(307);
				whiteSpace();
				}
			}

			setState(310);
			match(T__26);
			setState(311);
			whiteSpace();
			setState(312);
			((ConditionalStatementContext)_localctx).con_body = conditionBody();
			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(313);
				whiteSpace();
				}
			}

			setState(319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__34) {
				{
				{
				setState(316);
				((ConditionalStatementContext)_localctx).elif_stat = elifStatement();
				}
				}
				setState(321);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__35) {
				{
				setState(322);
				((ConditionalStatementContext)_localctx).else_stat = elseStatement();
				}
			}

			setState(325);
			match(T__27);
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
			match(T__0);
			}
		}
		catch (RecognitionException re) {
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
		public Token op;
		public ArithmeticalExpressionContext right_expr;
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
			setState(331);
			((ConditionContext)_localctx).left_expr = arithmeticalExpression(0);
			setState(333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(332);
				whiteSpace();
				}
			}

			setState(335);
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
			setState(337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(336);
				whiteSpace();
				}
			}

			setState(339);
			((ConditionContext)_localctx).right_expr = arithmeticalExpression(0);
			}
		}
		catch (RecognitionException re) {
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
			setState(345); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(341);
				instruction();
				setState(343);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(342);
					whiteSpace();
					}
					break;
				}
				}
				}
				setState(347); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__22) | (1L << T__24) | (1L << T__25) | (1L << T__36) | (1L << T__38) | (1L << T__44) | (1L << LOWERCASELETTER) | (1L << UPPERCASELETTER))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElifStatementContext extends ParserRuleContext {
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
		public ElifStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elifStatement; }
	}

	public final ElifStatementContext elifStatement() throws RecognitionException {
		ElifStatementContext _localctx = new ElifStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_elifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			match(T__34);
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
			match(T__13);
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
			((ElifStatementContext)_localctx).cond = condition();
			setState(359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(358);
				whiteSpace();
				}
			}

			setState(361);
			match(T__14);
			setState(363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(362);
				whiteSpace();
				}
			}

			setState(365);
			match(T__26);
			setState(366);
			whiteSpace();
			setState(367);
			((ElifStatementContext)_localctx).con_body = conditionBody();
			setState(369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(368);
				whiteSpace();
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

	public static class ElseStatementContext extends ParserRuleContext {
		public ConditionBodyContext con_body;
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public ConditionBodyContext conditionBody() {
			return getRuleContext(ConditionBodyContext.class,0);
		}
		public ElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStatement; }
	}

	public final ElseStatementContext elseStatement() throws RecognitionException {
		ElseStatementContext _localctx = new ElseStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_elseStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			match(T__35);
			setState(373);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(372);
				whiteSpace();
				}
				break;
			}
			setState(375);
			whiteSpace();
			setState(376);
			((ElseStatementContext)_localctx).con_body = conditionBody();
			setState(378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(377);
				whiteSpace();
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
		enterRule(_localctx, 38, RULE_parallelExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			match(T__36);
			setState(381);
			whiteSpace();
			setState(382);
			((ParallelExpressionContext)_localctx).par_body = parallelBody();
			setState(383);
			whiteSpace();
			setState(384);
			match(T__37);
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
			match(T__0);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 40, RULE_parallelBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(390);
				((ParallelBodyContext)_localctx).app_force_ = applyForce();
				setState(392);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
				case 1:
					{
					setState(391);
					whiteSpace();
					}
					break;
				}
				}
				}
				setState(396); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__15 );
			}
		}
		catch (RecognitionException re) {
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
		public ConditionContext cond;
		public LoopBodyContext l_body;
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public LoopBodyContext loopBody() {
			return getRuleContext(LoopBodyContext.class,0);
		}
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			match(T__38);
			setState(400);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(399);
				whiteSpace();
				}
			}

			setState(402);
			match(T__13);
			setState(404);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(403);
				whiteSpace();
				}
			}

			setState(406);
			((LoopContext)_localctx).cond = condition();
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
			match(T__14);
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
			((LoopContext)_localctx).l_body = loopBody();
			setState(416);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(415);
				whiteSpace();
				}
			}

			setState(418);
			match(T__39);
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
			match(T__0);
			}
		}
		catch (RecognitionException re) {
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
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public LoopBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopBody; }
	}

	public final LoopBodyContext loopBody() throws RecognitionException {
		LoopBodyContext _localctx = new LoopBodyContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_loopBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(424);
				instruction();
				setState(426);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
				case 1:
					{
					setState(425);
					whiteSpace();
					}
					break;
				}
				}
				}
				setState(430); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__22) | (1L << T__24) | (1L << T__25) | (1L << T__36) | (1L << T__38) | (1L << T__44) | (1L << LOWERCASELETTER) | (1L << UPPERCASELETTER))) != 0) );
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 46, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UPPERCASELETTER) {
				{
				setState(432);
				((FunctionCallContext)_localctx).scope_seq = scopeSequence();
				}
			}

			setState(435);
			((FunctionCallContext)_localctx).f_name = functionName();
			setState(436);
			match(T__13);
			setState(438);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(437);
				whiteSpace();
				}
			}

			setState(444);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__10) | (1L << T__13) | (1L << T__49) | (1L << T__50) | (1L << T__54) | (1L << T__55) | (1L << LOWERCASELETTER) | (1L << UPPERCASELETTER) | (1L << NONZERODIGIT) | (1L << ZERO))) != 0)) {
				{
				setState(440);
				((FunctionCallContext)_localctx).f_args = functionParams();
				setState(442);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(441);
					whiteSpace();
					}
				}

				}
			}

			setState(446);
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
		public FunctionArgsContext f_args;
		public VariableTypeContext return_type;
		public FunctionBodyContext f_body;
		public Return_statementContext return_stat;
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
		public VariableTypeContext variableType() {
			return getRuleContext(VariableTypeContext.class,0);
		}
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			match(T__40);
			setState(449);
			whiteSpace();
			setState(450);
			((FunctionDeclarationContext)_localctx).f_name = functionName();
			setState(451);
			match(T__13);
			setState(453);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				{
				setState(452);
				whiteSpace();
				}
				break;
			}
			setState(456);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5))) != 0)) {
				{
				setState(455);
				((FunctionDeclarationContext)_localctx).f_args = functionArgs();
				}
			}

			setState(459);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(458);
				whiteSpace();
				}
			}

			setState(461);
			match(T__14);
			setState(473);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
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
				match(T__41);
				setState(467);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(466);
					whiteSpace();
					}
				}

				setState(469);
				((FunctionDeclarationContext)_localctx).return_type = variableType();
				setState(471);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
				case 1:
					{
					setState(470);
					whiteSpace();
					}
					break;
				}
				}
				break;
			}
			setState(475);
			whiteSpace();
			setState(476);
			match(T__23);
			setState(478);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				{
				setState(477);
				whiteSpace();
				}
				break;
			}
			setState(481);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__22) | (1L << T__24) | (1L << T__25) | (1L << T__36) | (1L << T__38) | (1L << T__44) | (1L << LOWERCASELETTER) | (1L << UPPERCASELETTER))) != 0)) {
				{
				setState(480);
				((FunctionDeclarationContext)_localctx).f_body = functionBody();
				}
			}

			setState(484);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				{
				setState(483);
				whiteSpace();
				}
				break;
			}
			setState(487);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__43) {
				{
				setState(486);
				((FunctionDeclarationContext)_localctx).return_stat = return_statement();
				}
			}

			setState(490);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(489);
				whiteSpace();
				}
			}

			setState(492);
			match(T__42);
			setState(494);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(493);
				whiteSpace();
				}
			}

			setState(496);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 50, RULE_functionBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(498);
				instruction();
				setState(500);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
				case 1:
					{
					setState(499);
					whiteSpace();
					}
					break;
				}
				}
				}
				setState(504); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__22) | (1L << T__24) | (1L << T__25) | (1L << T__36) | (1L << T__38) | (1L << T__44) | (1L << LOWERCASELETTER) | (1L << UPPERCASELETTER))) != 0) );
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 52, RULE_functionArgs);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(506);
			functionArgument();
			setState(517);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(508);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(507);
						whiteSpace();
						}
					}

					setState(510);
					match(T__11);
					setState(512);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(511);
						whiteSpace();
						}
					}

					setState(514);
					functionArgument();
					}
					} 
				}
				setState(519);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
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
		public FunctionParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionParams; }
	}

	public final FunctionParamsContext functionParams() throws RecognitionException {
		FunctionParamsContext _localctx = new FunctionParamsContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_functionParams);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				{
				setState(520);
				variableName();
				}
				break;
			case 2:
				{
				setState(521);
				arithmeticalExpression(0);
				}
				break;
			}
			setState(537);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(525);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(524);
						whiteSpace();
						}
					}

					setState(527);
					match(T__11);
					setState(529);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(528);
						whiteSpace();
						}
					}

					setState(533);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
					case 1:
						{
						setState(531);
						variableName();
						}
						break;
					case 2:
						{
						setState(532);
						arithmeticalExpression(0);
						}
						break;
					}
					}
					} 
				}
				setState(539);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
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
		enterRule(_localctx, 56, RULE_functionArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(540);
			((FunctionArgumentContext)_localctx).type_ = variableType();
			setState(541);
			whiteSpace();
			setState(542);
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

	public static class Return_statementContext extends ParserRuleContext {
		public ArithmeticalExpressionContext expr;
		public List<WhiteSpaceContext> whiteSpace() {
			return getRuleContexts(WhiteSpaceContext.class);
		}
		public WhiteSpaceContext whiteSpace(int i) {
			return getRuleContext(WhiteSpaceContext.class,i);
		}
		public ArithmeticalExpressionContext arithmeticalExpression() {
			return getRuleContext(ArithmeticalExpressionContext.class,0);
		}
		public Return_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_statement; }
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_return_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(544);
			match(T__43);
			setState(545);
			whiteSpace();
			setState(546);
			((Return_statementContext)_localctx).expr = arithmeticalExpression(0);
			setState(548);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(547);
				whiteSpace();
				}
			}

			setState(550);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 60, RULE_comment);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(552);
			match(T__44);
			setState(556);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(553);
					matchWildcard();
					}
					} 
				}
				setState(558);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
			}
			setState(559);
			match(T__45);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 62, RULE_scopeName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(561);
			match(UPPERCASELETTER);
			setState(565);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << LOWERCASELETTER) | (1L << UPPERCASELETTER) | (1L << NONZERODIGIT) | (1L << ZERO))) != 0)) {
				{
				{
				setState(562);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << LOWERCASELETTER) | (1L << UPPERCASELETTER) | (1L << NONZERODIGIT) | (1L << ZERO))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(567);
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
		enterRule(_localctx, 64, RULE_scopeSequence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(571); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(568);
				scopeName();
				setState(569);
				match(T__46);
				}
				}
				setState(573); 
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
		enterRule(_localctx, 66, RULE_scopeDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(575);
			((ScopeDeclarationContext)_localctx).name = scopeName();
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
			match(T__47);
			setState(581);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(580);
				whiteSpace();
				}
			}

			setState(585); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(585);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case UPPERCASELETTER:
					{
					setState(583);
					scopeDeclaration();
					}
					break;
				case T__22:
					{
					setState(584);
					declaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(587); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__22 || _la==UPPERCASELETTER );
			setState(590);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(589);
				whiteSpace();
				}
			}

			setState(592);
			match(T__48);
			setState(594);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(593);
				whiteSpace();
				}
			}

			setState(596);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 68, RULE_whiteSpace);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(599); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(598);
					match(WS);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(601); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
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
		enterRule(_localctx, 70, RULE_getAngle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(603);
			match(T__49);
			setState(605);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(604);
				whiteSpace();
				}
			}

			setState(609);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOWERCASELETTER:
			case UPPERCASELETTER:
				{
				setState(607);
				((GetAngleContext)_localctx).name_1 = variableName();
				}
				break;
			case T__13:
				{
				setState(608);
				((GetAngleContext)_localctx).object_1 = object_type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(612);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(611);
				whiteSpace();
				}
			}

			setState(614);
			match(T__11);
			setState(616);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(615);
				whiteSpace();
				}
			}

			setState(620);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOWERCASELETTER:
			case UPPERCASELETTER:
				{
				setState(618);
				((GetAngleContext)_localctx).name_2 = variableName();
				}
				break;
			case T__13:
				{
				setState(619);
				((GetAngleContext)_localctx).object_2 = object_type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(623);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				{
				setState(622);
				whiteSpace();
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
		enterRule(_localctx, 72, RULE_getCoordinate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(625);
			match(T__50);
			setState(627);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(626);
				whiteSpace();
				}
			}

			setState(629);
			((GetCoordinateContext)_localctx).axis = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__51 || _la==T__52) ) {
				((GetCoordinateContext)_localctx).axis = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(631);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(630);
				whiteSpace();
				}
			}

			setState(633);
			match(T__53);
			setState(635);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(634);
				whiteSpace();
				}
			}

			setState(637);
			((GetCoordinateContext)_localctx).name_ = variableName();
			setState(639);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				{
				setState(638);
				whiteSpace();
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
		enterRule(_localctx, 74, RULE_getDistance);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(641);
			match(T__54);
			setState(643);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(642);
				whiteSpace();
				}
			}

			setState(647);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOWERCASELETTER:
			case UPPERCASELETTER:
				{
				setState(645);
				((GetDistanceContext)_localctx).name_1 = variableName();
				}
				break;
			case T__13:
				{
				setState(646);
				((GetDistanceContext)_localctx).object_1 = object_type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(650);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(649);
				whiteSpace();
				}
			}

			setState(652);
			match(T__11);
			setState(654);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(653);
				whiteSpace();
				}
			}

			setState(658);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOWERCASELETTER:
			case UPPERCASELETTER:
				{
				setState(656);
				((GetDistanceContext)_localctx).name_2 = variableName();
				}
				break;
			case T__13:
				{
				setState(657);
				((GetDistanceContext)_localctx).object_2 = object_type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(661);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				{
				setState(660);
				whiteSpace();
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
		enterRule(_localctx, 76, RULE_getVelocity);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(663);
			match(T__55);
			setState(665);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(664);
				whiteSpace();
				}
			}

			setState(667);
			((GetVelocityContext)_localctx).axis = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__51) | (1L << T__52) | (1L << T__56))) != 0)) ) {
				((GetVelocityContext)_localctx).axis = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(669);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(668);
				whiteSpace();
				}
			}

			setState(671);
			match(T__53);
			setState(673);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(672);
				whiteSpace();
				}
			}

			setState(675);
			((GetVelocityContext)_localctx).name_ = variableName();
			setState(677);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				{
				setState(676);
				whiteSpace();
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3@\u02aa\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\5\2R\n\2\3\2\3\2"+
		"\3\2\5\2W\n\2\3\2\5\2Z\n\2\6\2\\\n\2\r\2\16\2]\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\5\3g\n\3\3\3\3\3\3\3\3\3\5\3m\n\3\3\4\3\4\3\5\5\5r\n\5\3\5\3\5\7"+
		"\5v\n\5\f\5\16\5y\13\5\3\6\3\6\7\6}\n\6\f\6\16\6\u0080\13\6\3\7\3\7\7"+
		"\7\u0084\n\7\f\7\16\7\u0087\13\7\3\7\5\7\u008a\n\7\3\b\5\b\u008d\n\b\3"+
		"\b\3\b\7\b\u0091\n\b\f\b\16\b\u0094\13\b\3\b\3\b\6\b\u0098\n\b\r\b\16"+
		"\b\u0099\3\b\3\b\3\b\6\b\u009f\n\b\r\b\16\b\u00a0\5\b\u00a3\n\b\3\t\6"+
		"\t\u00a6\n\t\r\t\16\t\u00a7\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\5\n\u00b3"+
		"\n\n\3\n\3\n\5\n\u00b7\n\n\3\n\3\n\5\n\u00bb\n\n\3\n\3\n\5\n\u00bf\n\n"+
		"\3\n\3\n\3\13\3\13\5\13\u00c5\n\13\3\13\3\13\5\13\u00c9\n\13\3\13\3\13"+
		"\5\13\u00cd\n\13\3\13\3\13\5\13\u00d1\n\13\3\13\3\13\3\f\3\f\3\f\3\f\5"+
		"\f\u00d9\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00e5\n\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\5\f\u00ed\n\f\5\f\u00ef\n\f\3\f\5\f\u00f2\n\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0102\n\r\3\r"+
		"\3\r\5\r\u0106\n\r\3\r\3\r\5\r\u010a\n\r\3\r\7\r\u010d\n\r\f\r\16\r\u0110"+
		"\13\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u011c\n\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\5\20"+
		"\u012b\n\20\3\20\3\20\5\20\u012f\n\20\3\20\3\20\5\20\u0133\n\20\3\20\3"+
		"\20\5\20\u0137\n\20\3\20\3\20\3\20\3\20\5\20\u013d\n\20\3\20\7\20\u0140"+
		"\n\20\f\20\16\20\u0143\13\20\3\20\5\20\u0146\n\20\3\20\3\20\5\20\u014a"+
		"\n\20\3\20\3\20\3\21\3\21\5\21\u0150\n\21\3\21\3\21\5\21\u0154\n\21\3"+
		"\21\3\21\3\22\3\22\5\22\u015a\n\22\6\22\u015c\n\22\r\22\16\22\u015d\3"+
		"\23\3\23\5\23\u0162\n\23\3\23\3\23\5\23\u0166\n\23\3\23\3\23\5\23\u016a"+
		"\n\23\3\23\3\23\5\23\u016e\n\23\3\23\3\23\3\23\3\23\5\23\u0174\n\23\3"+
		"\24\3\24\5\24\u0178\n\24\3\24\3\24\3\24\5\24\u017d\n\24\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\5\25\u0185\n\25\3\25\3\25\3\26\3\26\5\26\u018b\n\26\6"+
		"\26\u018d\n\26\r\26\16\26\u018e\3\27\3\27\5\27\u0193\n\27\3\27\3\27\5"+
		"\27\u0197\n\27\3\27\3\27\5\27\u019b\n\27\3\27\3\27\5\27\u019f\n\27\3\27"+
		"\3\27\5\27\u01a3\n\27\3\27\3\27\5\27\u01a7\n\27\3\27\3\27\3\30\3\30\5"+
		"\30\u01ad\n\30\6\30\u01af\n\30\r\30\16\30\u01b0\3\31\5\31\u01b4\n\31\3"+
		"\31\3\31\3\31\5\31\u01b9\n\31\3\31\3\31\5\31\u01bd\n\31\5\31\u01bf\n\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\32\3\32\5\32\u01c8\n\32\3\32\5\32\u01cb\n"+
		"\32\3\32\5\32\u01ce\n\32\3\32\3\32\5\32\u01d2\n\32\3\32\3\32\5\32\u01d6"+
		"\n\32\3\32\3\32\5\32\u01da\n\32\5\32\u01dc\n\32\3\32\3\32\3\32\5\32\u01e1"+
		"\n\32\3\32\5\32\u01e4\n\32\3\32\5\32\u01e7\n\32\3\32\5\32\u01ea\n\32\3"+
		"\32\5\32\u01ed\n\32\3\32\3\32\5\32\u01f1\n\32\3\32\3\32\3\33\3\33\5\33"+
		"\u01f7\n\33\6\33\u01f9\n\33\r\33\16\33\u01fa\3\34\3\34\5\34\u01ff\n\34"+
		"\3\34\3\34\5\34\u0203\n\34\3\34\7\34\u0206\n\34\f\34\16\34\u0209\13\34"+
		"\3\35\3\35\5\35\u020d\n\35\3\35\5\35\u0210\n\35\3\35\3\35\5\35\u0214\n"+
		"\35\3\35\3\35\5\35\u0218\n\35\7\35\u021a\n\35\f\35\16\35\u021d\13\35\3"+
		"\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\5\37\u0227\n\37\3\37\3\37\3 \3"+
		" \7 \u022d\n \f \16 \u0230\13 \3 \3 \3!\3!\7!\u0236\n!\f!\16!\u0239\13"+
		"!\3\"\3\"\3\"\6\"\u023e\n\"\r\"\16\"\u023f\3#\3#\5#\u0244\n#\3#\3#\5#"+
		"\u0248\n#\3#\3#\6#\u024c\n#\r#\16#\u024d\3#\5#\u0251\n#\3#\3#\5#\u0255"+
		"\n#\3#\3#\3$\6$\u025a\n$\r$\16$\u025b\3%\3%\5%\u0260\n%\3%\3%\5%\u0264"+
		"\n%\3%\5%\u0267\n%\3%\3%\5%\u026b\n%\3%\3%\5%\u026f\n%\3%\5%\u0272\n%"+
		"\3&\3&\5&\u0276\n&\3&\3&\5&\u027a\n&\3&\3&\5&\u027e\n&\3&\3&\5&\u0282"+
		"\n&\3\'\3\'\5\'\u0286\n\'\3\'\3\'\5\'\u028a\n\'\3\'\5\'\u028d\n\'\3\'"+
		"\3\'\5\'\u0291\n\'\3\'\3\'\5\'\u0295\n\'\3\'\5\'\u0298\n\'\3(\3(\5(\u029c"+
		"\n(\3(\3(\5(\u02a0\n(\3(\3(\5(\u02a4\n(\3(\3(\5(\u02a8\n(\3(\3\u022e\3"+
		"\30)\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@"+
		"BDFHJLN\2\t\3\2\4\b\4\2\t\t=@\3\2?@\4\2\n\n\26\30\3\2\37$\3\2\66\67\4"+
		"\2\66\67;;\2\u030f\2[\3\2\2\2\4l\3\2\2\2\6n\3\2\2\2\bq\3\2\2\2\nz\3\2"+
		"\2\2\f\u0089\3\2\2\2\16\u00a2\3\2\2\2\20\u00a5\3\2\2\2\22\u00b0\3\2\2"+
		"\2\24\u00c2\3\2\2\2\26\u00d4\3\2\2\2\30\u0101\3\2\2\2\32\u0111\3\2\2\2"+
		"\34\u011f\3\2\2\2\36\u0128\3\2\2\2 \u014d\3\2\2\2\"\u015b\3\2\2\2$\u015f"+
		"\3\2\2\2&\u0175\3\2\2\2(\u017e\3\2\2\2*\u018c\3\2\2\2,\u0190\3\2\2\2."+
		"\u01ae\3\2\2\2\60\u01b3\3\2\2\2\62\u01c2\3\2\2\2\64\u01f8\3\2\2\2\66\u01fc"+
		"\3\2\2\28\u020c\3\2\2\2:\u021e\3\2\2\2<\u0222\3\2\2\2>\u022a\3\2\2\2@"+
		"\u0233\3\2\2\2B\u023d\3\2\2\2D\u0241\3\2\2\2F\u0259\3\2\2\2H\u025d\3\2"+
		"\2\2J\u0273\3\2\2\2L\u0283\3\2\2\2N\u0299\3\2\2\2PR\5F$\2QP\3\2\2\2QR"+
		"\3\2\2\2RV\3\2\2\2SW\5\62\32\2TW\5\4\3\2UW\5D#\2VS\3\2\2\2VT\3\2\2\2V"+
		"U\3\2\2\2WY\3\2\2\2XZ\5F$\2YX\3\2\2\2YZ\3\2\2\2Z\\\3\2\2\2[Q\3\2\2\2\\"+
		"]\3\2\2\2][\3\2\2\2]^\3\2\2\2^\3\3\2\2\2_m\5\32\16\2`m\5\34\17\2am\5\36"+
		"\20\2bm\5(\25\2cm\5,\27\2df\5\60\31\2eg\5F$\2fe\3\2\2\2fg\3\2\2\2gh\3"+
		"\2\2\2hi\7\3\2\2im\3\2\2\2jm\5\26\f\2km\5> \2l_\3\2\2\2l`\3\2\2\2la\3"+
		"\2\2\2lb\3\2\2\2lc\3\2\2\2ld\3\2\2\2lj\3\2\2\2lk\3\2\2\2m\5\3\2\2\2no"+
		"\t\2\2\2o\7\3\2\2\2pr\5B\"\2qp\3\2\2\2qr\3\2\2\2rs\3\2\2\2sw\7=\2\2tv"+
		"\t\3\2\2ut\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2x\t\3\2\2\2yw\3\2\2\2"+
		"z~\7=\2\2{}\t\3\2\2|{\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177"+
		"\13\3\2\2\2\u0080~\3\2\2\2\u0081\u0085\7?\2\2\u0082\u0084\t\4\2\2\u0083"+
		"\u0082\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2"+
		"\2\2\u0086\u008a\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u008a\7@\2\2\u0089"+
		"\u0081\3\2\2\2\u0089\u0088\3\2\2\2\u008a\r\3\2\2\2\u008b\u008d\7\n\2\2"+
		"\u008c\u008b\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0092"+
		"\7?\2\2\u008f\u0091\t\4\2\2\u0090\u008f\3\2\2\2\u0091\u0094\3\2\2\2\u0092"+
		"\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0095\3\2\2\2\u0094\u0092\3\2"+
		"\2\2\u0095\u0097\7\13\2\2\u0096\u0098\t\4\2\2\u0097\u0096\3\2\2\2\u0098"+
		"\u0099\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u00a3\3\2"+
		"\2\2\u009b\u009c\7@\2\2\u009c\u009e\7\13\2\2\u009d\u009f\t\4\2\2\u009e"+
		"\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2"+
		"\2\2\u00a1\u00a3\3\2\2\2\u00a2\u008c\3\2\2\2\u00a2\u009b\3\2\2\2\u00a3"+
		"\17\3\2\2\2\u00a4\u00a6\t\4\2\2\u00a5\u00a4\3\2\2\2\u00a6\u00a7\3\2\2"+
		"\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa"+
		"\7\f\2\2\u00aa\u00ab\t\4\2\2\u00ab\u00ac\t\4\2\2\u00ac\u00ad\7\f\2\2\u00ad"+
		"\u00ae\t\4\2\2\u00ae\u00af\t\4\2\2\u00af\21\3\2\2\2\u00b0\u00b2\7\r\2"+
		"\2\u00b1\u00b3\5F$\2\u00b2\u00b1\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4"+
		"\3\2\2\2\u00b4\u00b6\5\30\r\2\u00b5\u00b7\5F$\2\u00b6\u00b5\3\2\2\2\u00b6"+
		"\u00b7\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00ba\7\16\2\2\u00b9\u00bb\5"+
		"F$\2\u00ba\u00b9\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc"+
		"\u00be\5\30\r\2\u00bd\u00bf\5F$\2\u00be\u00bd\3\2\2\2\u00be\u00bf\3\2"+
		"\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\7\17\2\2\u00c1\23\3\2\2\2\u00c2\u00c4"+
		"\7\20\2\2\u00c3\u00c5\5F$\2\u00c4\u00c3\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5"+
		"\u00c6\3\2\2\2\u00c6\u00c8\5\30\r\2\u00c7\u00c9\5F$\2\u00c8\u00c7\3\2"+
		"\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cc\7\16\2\2\u00cb"+
		"\u00cd\5F$\2\u00cc\u00cb\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00ce\3\2\2"+
		"\2\u00ce\u00d0\5\30\r\2\u00cf\u00d1\5F$\2\u00d0\u00cf\3\2\2\2\u00d0\u00d1"+
		"\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d3\7\21\2\2\u00d3\25\3\2\2\2\u00d4"+
		"\u00d5\7\22\2\2\u00d5\u00d8\5F$\2\u00d6\u00d9\5\b\5\2\u00d7\u00d9\5\22"+
		"\n\2\u00d8\u00d6\3\2\2\2\u00d8\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da"+
		"\u00db\5F$\2\u00db\u00dc\7\23\2\2\u00dc\u00dd\5F$\2\u00dd\u00de\5\b\5"+
		"\2\u00de\u00df\5F$\2\u00df\u00e0\7\24\2\2\u00e0\u00e4\5F$\2\u00e1\u00e5"+
		"\5\b\5\2\u00e2\u00e5\5\f\7\2\u00e3\u00e5\5\20\t\2\u00e4\u00e1\3\2\2\2"+
		"\u00e4\u00e2\3\2\2\2\u00e4\u00e3\3\2\2\2\u00e5\u00ee\3\2\2\2\u00e6\u00e7"+
		"\5F$\2\u00e7\u00e8\7\25\2\2\u00e8\u00ec\5F$\2\u00e9\u00ed\5\b\5\2\u00ea"+
		"\u00ed\5\f\7\2\u00eb\u00ed\5\20\t\2\u00ec\u00e9\3\2\2\2\u00ec\u00ea\3"+
		"\2\2\2\u00ec\u00eb\3\2\2\2\u00ed\u00ef\3\2\2\2\u00ee\u00e6\3\2\2\2\u00ee"+
		"\u00ef\3\2\2\2\u00ef\u00f1\3\2\2\2\u00f0\u00f2\5F$\2\u00f1\u00f0\3\2\2"+
		"\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\7\3\2\2\u00f4\27"+
		"\3\2\2\2\u00f5\u00f6\b\r\1\2\u00f6\u0102\5\f\7\2\u00f7\u0102\5\16\b\2"+
		"\u00f8\u0102\5\22\n\2\u00f9\u0102\5\24\13\2\u00fa\u0102\5\20\t\2\u00fb"+
		"\u0102\5\b\5\2\u00fc\u0102\5\60\31\2\u00fd\u0102\5H%\2\u00fe\u0102\5J"+
		"&\2\u00ff\u0102\5L\'\2\u0100\u0102\5N(\2\u0101\u00f5\3\2\2\2\u0101\u00f7"+
		"\3\2\2\2\u0101\u00f8\3\2\2\2\u0101\u00f9\3\2\2\2\u0101\u00fa\3\2\2\2\u0101"+
		"\u00fb\3\2\2\2\u0101\u00fc\3\2\2\2\u0101\u00fd\3\2\2\2\u0101\u00fe\3\2"+
		"\2\2\u0101\u00ff\3\2\2\2\u0101\u0100\3\2\2\2\u0102\u010e\3\2\2\2\u0103"+
		"\u0105\f\16\2\2\u0104\u0106\5F$\2\u0105\u0104\3\2\2\2\u0105\u0106\3\2"+
		"\2\2\u0106\u0107\3\2\2\2\u0107\u0109\t\5\2\2\u0108\u010a\5F$\2\u0109\u0108"+
		"\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010d\5\30\r\17"+
		"\u010c\u0103\3\2\2\2\u010d\u0110\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f"+
		"\3\2\2\2\u010f\31\3\2\2\2\u0110\u010e\3\2\2\2\u0111\u0112\7\31\2\2\u0112"+
		"\u0113\5F$\2\u0113\u0114\5\6\4\2\u0114\u0115\5F$\2\u0115\u0116\5\b\5\2"+
		"\u0116\u0117\5F$\2\u0117\u0118\7\32\2\2\u0118\u0119\5F$\2\u0119\u011b"+
		"\5\30\r\2\u011a\u011c\5F$\2\u011b\u011a\3\2\2\2\u011b\u011c\3\2\2\2\u011c"+
		"\u011d\3\2\2\2\u011d\u011e\7\3\2\2\u011e\33\3\2\2\2\u011f\u0120\7\33\2"+
		"\2\u0120\u0121\5F$\2\u0121\u0122\5\b\5\2\u0122\u0123\5F$\2\u0123\u0124"+
		"\7\32\2\2\u0124\u0125\5F$\2\u0125\u0126\5\30\r\2\u0126\u0127\7\3\2\2\u0127"+
		"\35\3\2\2\2\u0128\u012a\7\34\2\2\u0129\u012b\5F$\2\u012a\u0129\3\2\2\2"+
		"\u012a\u012b\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012e\7\20\2\2\u012d\u012f"+
		"\5F$\2\u012e\u012d\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0130\3\2\2\2\u0130"+
		"\u0132\5 \21\2\u0131\u0133\5F$\2\u0132\u0131\3\2\2\2\u0132\u0133\3\2\2"+
		"\2\u0133\u0134\3\2\2\2\u0134\u0136\7\21\2\2\u0135\u0137\5F$\2\u0136\u0135"+
		"\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u0139\7\35\2\2"+
		"\u0139\u013a\5F$\2\u013a\u013c\5\"\22\2\u013b\u013d\5F$\2\u013c\u013b"+
		"\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u0141\3\2\2\2\u013e\u0140\5$\23\2\u013f"+
		"\u013e\3\2\2\2\u0140\u0143\3\2\2\2\u0141\u013f\3\2\2\2\u0141\u0142\3\2"+
		"\2\2\u0142\u0145\3\2\2\2\u0143\u0141\3\2\2\2\u0144\u0146\5&\24\2\u0145"+
		"\u0144\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0149\7\36"+
		"\2\2\u0148\u014a\5F$\2\u0149\u0148\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014b"+
		"\3\2\2\2\u014b\u014c\7\3\2\2\u014c\37\3\2\2\2\u014d\u014f\5\30\r\2\u014e"+
		"\u0150\5F$\2\u014f\u014e\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0151\3\2\2"+
		"\2\u0151\u0153\t\6\2\2\u0152\u0154\5F$\2\u0153\u0152\3\2\2\2\u0153\u0154"+
		"\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0156\5\30\r\2\u0156!\3\2\2\2\u0157"+
		"\u0159\5\4\3\2\u0158\u015a\5F$\2\u0159\u0158\3\2\2\2\u0159\u015a\3\2\2"+
		"\2\u015a\u015c\3\2\2\2\u015b\u0157\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015b"+
		"\3\2\2\2\u015d\u015e\3\2\2\2\u015e#\3\2\2\2\u015f\u0161\7%\2\2\u0160\u0162"+
		"\5F$\2\u0161\u0160\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0163\3\2\2\2\u0163"+
		"\u0165\7\20\2\2\u0164\u0166\5F$\2\u0165\u0164\3\2\2\2\u0165\u0166\3\2"+
		"\2\2\u0166\u0167\3\2\2\2\u0167\u0169\5 \21\2\u0168\u016a\5F$\2\u0169\u0168"+
		"\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016d\7\21\2\2"+
		"\u016c\u016e\5F$\2\u016d\u016c\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u016f"+
		"\3\2\2\2\u016f\u0170\7\35\2\2\u0170\u0171\5F$\2\u0171\u0173\5\"\22\2\u0172"+
		"\u0174\5F$\2\u0173\u0172\3\2\2\2\u0173\u0174\3\2\2\2\u0174%\3\2\2\2\u0175"+
		"\u0177\7&\2\2\u0176\u0178\5F$\2\u0177\u0176\3\2\2\2\u0177\u0178\3\2\2"+
		"\2\u0178\u0179\3\2\2\2\u0179\u017a\5F$\2\u017a\u017c\5\"\22\2\u017b\u017d"+
		"\5F$\2\u017c\u017b\3\2\2\2\u017c\u017d\3\2\2\2\u017d\'\3\2\2\2\u017e\u017f"+
		"\7\'\2\2\u017f\u0180\5F$\2\u0180\u0181\5*\26\2\u0181\u0182\5F$\2\u0182"+
		"\u0184\7(\2\2\u0183\u0185\5F$\2\u0184\u0183\3\2\2\2\u0184\u0185\3\2\2"+
		"\2\u0185\u0186\3\2\2\2\u0186\u0187\7\3\2\2\u0187)\3\2\2\2\u0188\u018a"+
		"\5\26\f\2\u0189\u018b\5F$\2\u018a\u0189\3\2\2\2\u018a\u018b\3\2\2\2\u018b"+
		"\u018d\3\2\2\2\u018c\u0188\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u018c\3\2"+
		"\2\2\u018e\u018f\3\2\2\2\u018f+\3\2\2\2\u0190\u0192\7)\2\2\u0191\u0193"+
		"\5F$\2\u0192\u0191\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0194\3\2\2\2\u0194"+
		"\u0196\7\20\2\2\u0195\u0197\5F$\2\u0196\u0195\3\2\2\2\u0196\u0197\3\2"+
		"\2\2\u0197\u0198\3\2\2\2\u0198\u019a\5 \21\2\u0199\u019b\5F$\2\u019a\u0199"+
		"\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u019e\7\21\2\2"+
		"\u019d\u019f\5F$\2\u019e\u019d\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a0"+
		"\3\2\2\2\u01a0\u01a2\5.\30\2\u01a1\u01a3\5F$\2\u01a2\u01a1\3\2\2\2\u01a2"+
		"\u01a3\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a6\7*\2\2\u01a5\u01a7\5F$"+
		"\2\u01a6\u01a5\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01a9"+
		"\7\3\2\2\u01a9-\3\2\2\2\u01aa\u01ac\5\4\3\2\u01ab\u01ad\5F$\2\u01ac\u01ab"+
		"\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01af\3\2\2\2\u01ae\u01aa\3\2\2\2\u01af"+
		"\u01b0\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1/\3\2\2\2"+
		"\u01b2\u01b4\5B\"\2\u01b3\u01b2\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01b5"+
		"\3\2\2\2\u01b5\u01b6\5\n\6\2\u01b6\u01b8\7\20\2\2\u01b7\u01b9\5F$\2\u01b8"+
		"\u01b7\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01be\3\2\2\2\u01ba\u01bc\58"+
		"\35\2\u01bb\u01bd\5F$\2\u01bc\u01bb\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd"+
		"\u01bf\3\2\2\2\u01be\u01ba\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c0\3\2"+
		"\2\2\u01c0\u01c1\7\21\2\2\u01c1\61\3\2\2\2\u01c2\u01c3\7+\2\2\u01c3\u01c4"+
		"\5F$\2\u01c4\u01c5\5\n\6\2\u01c5\u01c7\7\20\2\2\u01c6\u01c8\5F$\2\u01c7"+
		"\u01c6\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01ca\3\2\2\2\u01c9\u01cb\5\66"+
		"\34\2\u01ca\u01c9\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01cd\3\2\2\2\u01cc"+
		"\u01ce\5F$\2\u01cd\u01cc\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce\u01cf\3\2\2"+
		"\2\u01cf\u01db\7\21\2\2\u01d0\u01d2\5F$\2\u01d1\u01d0\3\2\2\2\u01d1\u01d2"+
		"\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01d5\7,\2\2\u01d4\u01d6\5F$\2\u01d5"+
		"\u01d4\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01d9\5\6"+
		"\4\2\u01d8\u01da\5F$\2\u01d9\u01d8\3\2\2\2\u01d9\u01da\3\2\2\2\u01da\u01dc"+
		"\3\2\2\2\u01db\u01d1\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd"+
		"\u01de\5F$\2\u01de\u01e0\7\32\2\2\u01df\u01e1\5F$\2\u01e0\u01df\3\2\2"+
		"\2\u01e0\u01e1\3\2\2\2\u01e1\u01e3\3\2\2\2\u01e2\u01e4\5\64\33\2\u01e3"+
		"\u01e2\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01e6\3\2\2\2\u01e5\u01e7\5F"+
		"$\2\u01e6\u01e5\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01e9\3\2\2\2\u01e8"+
		"\u01ea\5<\37\2\u01e9\u01e8\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01ec\3\2"+
		"\2\2\u01eb\u01ed\5F$\2\u01ec\u01eb\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01ee"+
		"\3\2\2\2\u01ee\u01f0\7-\2\2\u01ef\u01f1\5F$\2\u01f0\u01ef\3\2\2\2\u01f0"+
		"\u01f1\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01f3\7\3\2\2\u01f3\63\3\2\2"+
		"\2\u01f4\u01f6\5\4\3\2\u01f5\u01f7\5F$\2\u01f6\u01f5\3\2\2\2\u01f6\u01f7"+
		"\3\2\2\2\u01f7\u01f9\3\2\2\2\u01f8\u01f4\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa"+
		"\u01f8\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb\65\3\2\2\2\u01fc\u0207\5:\36"+
		"\2\u01fd\u01ff\5F$\2\u01fe\u01fd\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\u0200"+
		"\3\2\2\2\u0200\u0202\7\16\2\2\u0201\u0203\5F$\2\u0202\u0201\3\2\2\2\u0202"+
		"\u0203\3\2\2\2\u0203\u0204\3\2\2\2\u0204\u0206\5:\36\2\u0205\u01fe\3\2"+
		"\2\2\u0206\u0209\3\2\2\2\u0207\u0205\3\2\2\2\u0207\u0208\3\2\2\2\u0208"+
		"\67\3\2\2\2\u0209\u0207\3\2\2\2\u020a\u020d\5\b\5\2\u020b\u020d\5\30\r"+
		"\2\u020c\u020a\3\2\2\2\u020c\u020b\3\2\2\2\u020d\u021b\3\2\2\2\u020e\u0210"+
		"\5F$\2\u020f\u020e\3\2\2\2\u020f\u0210\3\2\2\2\u0210\u0211\3\2\2\2\u0211"+
		"\u0213\7\16\2\2\u0212\u0214\5F$\2\u0213\u0212\3\2\2\2\u0213\u0214\3\2"+
		"\2\2\u0214\u0217\3\2\2\2\u0215\u0218\5\b\5\2\u0216\u0218\5\30\r\2\u0217"+
		"\u0215\3\2\2\2\u0217\u0216\3\2\2\2\u0218\u021a\3\2\2\2\u0219\u020f\3\2"+
		"\2\2\u021a\u021d\3\2\2\2\u021b\u0219\3\2\2\2\u021b\u021c\3\2\2\2\u021c"+
		"9\3\2\2\2\u021d\u021b\3\2\2\2\u021e\u021f\5\6\4\2\u021f\u0220\5F$\2\u0220"+
		"\u0221\5\b\5\2\u0221;\3\2\2\2\u0222\u0223\7.\2\2\u0223\u0224\5F$\2\u0224"+
		"\u0226\5\30\r\2\u0225\u0227\5F$\2\u0226\u0225\3\2\2\2\u0226\u0227\3\2"+
		"\2\2\u0227\u0228\3\2\2\2\u0228\u0229\7\3\2\2\u0229=\3\2\2\2\u022a\u022e"+
		"\7/\2\2\u022b\u022d\13\2\2\2\u022c\u022b\3\2\2\2\u022d\u0230\3\2\2\2\u022e"+
		"\u022f\3\2\2\2\u022e\u022c\3\2\2\2\u022f\u0231\3\2\2\2\u0230\u022e\3\2"+
		"\2\2\u0231\u0232\7\60\2\2\u0232?\3\2\2\2\u0233\u0237\7>\2\2\u0234\u0236"+
		"\t\3\2\2\u0235\u0234\3\2\2\2\u0236\u0239\3\2\2\2\u0237\u0235\3\2\2\2\u0237"+
		"\u0238\3\2\2\2\u0238A\3\2\2\2\u0239\u0237\3\2\2\2\u023a\u023b\5@!\2\u023b"+
		"\u023c\7\61\2\2\u023c\u023e\3\2\2\2\u023d\u023a\3\2\2\2\u023e\u023f\3"+
		"\2\2\2\u023f\u023d\3\2\2\2\u023f\u0240\3\2\2\2\u0240C\3\2\2\2\u0241\u0243"+
		"\5@!\2\u0242\u0244\5F$\2\u0243\u0242\3\2\2\2\u0243\u0244\3\2\2\2\u0244"+
		"\u0245\3\2\2\2\u0245\u0247\7\62\2\2\u0246\u0248\5F$\2\u0247\u0246\3\2"+
		"\2\2\u0247\u0248\3\2\2\2\u0248\u024b\3\2\2\2\u0249\u024c\5D#\2\u024a\u024c"+
		"\5\32\16\2\u024b\u0249\3\2\2\2\u024b\u024a\3\2\2\2\u024c\u024d\3\2\2\2"+
		"\u024d\u024b\3\2\2\2\u024d\u024e\3\2\2\2\u024e\u0250\3\2\2\2\u024f\u0251"+
		"\5F$\2\u0250\u024f\3\2\2\2\u0250\u0251\3\2\2\2\u0251\u0252\3\2\2\2\u0252"+
		"\u0254\7\63\2\2\u0253\u0255\5F$\2\u0254\u0253\3\2\2\2\u0254\u0255\3\2"+
		"\2\2\u0255\u0256\3\2\2\2\u0256\u0257\7\3\2\2\u0257E\3\2\2\2\u0258\u025a"+
		"\7<\2\2\u0259\u0258\3\2\2\2\u025a\u025b\3\2\2\2\u025b\u0259\3\2\2\2\u025b"+
		"\u025c\3\2\2\2\u025cG\3\2\2\2\u025d\u025f\7\64\2\2\u025e\u0260\5F$\2\u025f"+
		"\u025e\3\2\2\2\u025f\u0260\3\2\2\2\u0260\u0263\3\2\2\2\u0261\u0264\5\b"+
		"\5\2\u0262\u0264\5\24\13\2\u0263\u0261\3\2\2\2\u0263\u0262\3\2\2\2\u0264"+
		"\u0266\3\2\2\2\u0265\u0267\5F$\2\u0266\u0265\3\2\2\2\u0266\u0267\3\2\2"+
		"\2\u0267\u0268\3\2\2\2\u0268\u026a\7\16\2\2\u0269\u026b\5F$\2\u026a\u0269"+
		"\3\2\2\2\u026a\u026b\3\2\2\2\u026b\u026e\3\2\2\2\u026c\u026f\5\b\5\2\u026d"+
		"\u026f\5\24\13\2\u026e\u026c\3\2\2\2\u026e\u026d\3\2\2\2\u026f\u0271\3"+
		"\2\2\2\u0270\u0272\5F$\2\u0271\u0270\3\2\2\2\u0271\u0272\3\2\2\2\u0272"+
		"I\3\2\2\2\u0273\u0275\7\65\2\2\u0274\u0276\5F$\2\u0275\u0274\3\2\2\2\u0275"+
		"\u0276\3\2\2\2\u0276\u0277\3\2\2\2\u0277\u0279\t\7\2\2\u0278\u027a\5F"+
		"$\2\u0279\u0278\3\2\2\2\u0279\u027a\3\2\2\2\u027a\u027b\3\2\2\2\u027b"+
		"\u027d\78\2\2\u027c\u027e\5F$\2\u027d\u027c\3\2\2\2\u027d\u027e\3\2\2"+
		"\2\u027e\u027f\3\2\2\2\u027f\u0281\5\b\5\2\u0280\u0282\5F$\2\u0281\u0280"+
		"\3\2\2\2\u0281\u0282\3\2\2\2\u0282K\3\2\2\2\u0283\u0285\79\2\2\u0284\u0286"+
		"\5F$\2\u0285\u0284\3\2\2\2\u0285\u0286\3\2\2\2\u0286\u0289\3\2\2\2\u0287"+
		"\u028a\5\b\5\2\u0288\u028a\5\24\13\2\u0289\u0287\3\2\2\2\u0289\u0288\3"+
		"\2\2\2\u028a\u028c\3\2\2\2\u028b\u028d\5F$\2\u028c\u028b\3\2\2\2\u028c"+
		"\u028d\3\2\2\2\u028d\u028e\3\2\2\2\u028e\u0290\7\16\2\2\u028f\u0291\5"+
		"F$\2\u0290\u028f\3\2\2\2\u0290\u0291\3\2\2\2\u0291\u0294\3\2\2\2\u0292"+
		"\u0295\5\b\5\2\u0293\u0295\5\24\13\2\u0294\u0292\3\2\2\2\u0294\u0293\3"+
		"\2\2\2\u0295\u0297\3\2\2\2\u0296\u0298\5F$\2\u0297\u0296\3\2\2\2\u0297"+
		"\u0298\3\2\2\2\u0298M\3\2\2\2\u0299\u029b\7:\2\2\u029a\u029c\5F$\2\u029b"+
		"\u029a\3\2\2\2\u029b\u029c\3\2\2\2\u029c\u029d\3\2\2\2\u029d\u029f\t\b"+
		"\2\2\u029e\u02a0\5F$\2\u029f\u029e\3\2\2\2\u029f\u02a0\3\2\2\2\u02a0\u02a1"+
		"\3\2\2\2\u02a1\u02a3\78\2\2\u02a2\u02a4\5F$\2\u02a3\u02a2\3\2\2\2\u02a3"+
		"\u02a4\3\2\2\2\u02a4\u02a5\3\2\2\2\u02a5\u02a7\5\b\5\2\u02a6\u02a8\5F"+
		"$\2\u02a7\u02a6\3\2\2\2\u02a7\u02a8\3\2\2\2\u02a8O\3\2\2\2}QVY]flqw~\u0085"+
		"\u0089\u008c\u0092\u0099\u00a0\u00a2\u00a7\u00b2\u00b6\u00ba\u00be\u00c4"+
		"\u00c8\u00cc\u00d0\u00d8\u00e4\u00ec\u00ee\u00f1\u0101\u0105\u0109\u010e"+
		"\u011b\u012a\u012e\u0132\u0136\u013c\u0141\u0145\u0149\u014f\u0153\u0159"+
		"\u015d\u0161\u0165\u0169\u016d\u0173\u0177\u017c\u0184\u018a\u018e\u0192"+
		"\u0196\u019a\u019e\u01a2\u01a6\u01ac\u01b0\u01b3\u01b8\u01bc\u01be\u01c7"+
		"\u01ca\u01cd\u01d1\u01d5\u01d9\u01db\u01e0\u01e3\u01e6\u01e9\u01ec\u01f0"+
		"\u01f6\u01fa\u01fe\u0202\u0207\u020c\u020f\u0213\u0217\u021b\u0226\u022e"+
		"\u0237\u023f\u0243\u0247\u024b\u024d\u0250\u0254\u025b\u025f\u0263\u0266"+
		"\u026a\u026e\u0271\u0275\u0279\u027d\u0281\u0285\u0289\u028c\u0290\u0294"+
		"\u0297\u029b\u029f\u02a3\u02a7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}