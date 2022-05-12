// Generated from /home/paulinagacek/Desktop/APP/antlr4/App.g4 by ANTLR 4.8
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
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		WS=60, LOWERCASELETTER=61, UPPERCASELETTER=62, NONZERODIGIT=63, ZERO=64;
	public static final int
		RULE_primaryExpression = 0, RULE_instruction = 1, RULE_variableType = 2, 
		RULE_variableName = 3, RULE_functionName = 4, RULE_integer = 5, RULE_float_type = 6, 
		RULE_time_type = 7, RULE_force_type = 8, RULE_object_type = 9, RULE_applyForce = 10, 
		RULE_arithmeticalExpression = 11, RULE_declaration = 12, RULE_massDefinition = 13, 
		RULE_sizeDefinition = 14, RULE_definition = 15, RULE_conditionalStatement = 16, 
		RULE_condition = 17, RULE_conditionBody = 18, RULE_elifStatement = 19, 
		RULE_elseStatement = 20, RULE_parallelExpression = 21, RULE_parallelBody = 22, 
		RULE_loop = 23, RULE_loopBody = 24, RULE_functionCall = 25, RULE_functionDeclaration = 26, 
		RULE_functionBody = 27, RULE_functionArgs = 28, RULE_functionParams = 29, 
		RULE_functionArgument = 30, RULE_return_statement = 31, RULE_comment = 32, 
		RULE_scopeName = 33, RULE_scopeSequence = 34, RULE_scopeDeclaration = 35, 
		RULE_whiteSpace = 36, RULE_getAngle = 37, RULE_getCoordinate = 38, RULE_getDistance = 39, 
		RULE_getVelocity = 40;
	private static String[] makeRuleNames() {
		return new String[] {
			"primaryExpression", "instruction", "variableType", "variableName", "functionName", 
			"integer", "float_type", "time_type", "force_type", "object_type", "applyForce", 
			"arithmeticalExpression", "declaration", "massDefinition", "sizeDefinition", 
			"definition", "conditionalStatement", "condition", "conditionBody", "elifStatement", 
			"elseStatement", "parallelExpression", "parallelBody", "loop", "loopBody", 
			"functionCall", "functionDeclaration", "functionBody", "functionArgs", 
			"functionParams", "functionArgument", "return_statement", "comment", 
			"scopeName", "scopeSequence", "scopeDeclaration", "whiteSpace", "getAngle", 
			"getCoordinate", "getDistance", "getVelocity"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'TIME'", "'INT'", "'FORCE'", "'OBJECT'", "'FLOAT'", "'_'", 
			"'-'", "'.'", "':'", "'['", "','", "']'", "'('", "')'", "'APPLY'", "'TO'", 
			"'FOR'", "'DELAY'", "'+'", "'/'", "'*'", "'DEFINE'", "'AS'", "'WITH MASS'", 
			"'WITH SIZE'", "'SET'", "'IF'", "'THEN'", "'ENDIF'", "'=='", "'>'", "'<'", 
			"'>='", "'<='", "'!='", "'ELIF'", "'ELSE'", "'PARALLEL'", "'ENDPARALLEL'", 
			"'LOOP'", "'ENDLOOP'", "'DEFINE FUNCTION'", "'->'", "'ENDFUNCTION'", 
			"'RETURN'", "'/*'", "'*/'", "'::'", "'{'", "'}'", "'ANGLE BETWEEN'", 
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
			setState(93); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(82);
					whiteSpace();
					}
				}

				setState(88);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(85);
					functionDeclaration();
					}
					break;
				case 2:
					{
					setState(86);
					instruction();
					}
					break;
				case 3:
					{
					setState(87);
					scopeDeclaration();
					}
					break;
				}
				setState(91);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(90);
					whiteSpace();
					}
					break;
				}
				}
				}
				setState(95); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__22) | (1L << T__26) | (1L << T__27) | (1L << T__38) | (1L << T__40) | (1L << T__42) | (1L << T__46) | (1L << WS) | (1L << LOWERCASELETTER) | (1L << UPPERCASELETTER))) != 0) );
			}
		}
		catch (RecognitionException re) {
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
			setState(110);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__22:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				declaration();
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				definition();
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 3);
				{
				setState(99);
				conditionalStatement();
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 4);
				{
				setState(100);
				parallelExpression();
				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 5);
				{
				setState(101);
				loop();
				}
				break;
			case LOWERCASELETTER:
			case UPPERCASELETTER:
				enterOuterAlt(_localctx, 6);
				{
				setState(102);
				functionCall();
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(103);
					whiteSpace();
					}
				}

				setState(106);
				match(T__0);
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 7);
				{
				setState(108);
				applyForce();
				}
				break;
			case T__46:
				enterOuterAlt(_localctx, 8);
				{
				setState(109);
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
			setState(112);
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
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UPPERCASELETTER) {
				{
				setState(114);
				((VariableNameContext)_localctx).scope_seq = scopeSequence();
				}
			}

			setState(117);
			match(LOWERCASELETTER);
			setState(121);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(118);
					_la = _input.LA(1);
					if ( !(((((_la - 7)) & ~0x3f) == 0 && ((1L << (_la - 7)) & ((1L << (T__6 - 7)) | (1L << (LOWERCASELETTER - 7)) | (1L << (UPPERCASELETTER - 7)) | (1L << (NONZERODIGIT - 7)) | (1L << (ZERO - 7)))) != 0)) ) {
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
				setState(123);
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
			setState(124);
			match(LOWERCASELETTER);
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 7)) & ~0x3f) == 0 && ((1L << (_la - 7)) & ((1L << (T__6 - 7)) | (1L << (LOWERCASELETTER - 7)) | (1L << (UPPERCASELETTER - 7)) | (1L << (NONZERODIGIT - 7)) | (1L << (ZERO - 7)))) != 0)) {
				{
				{
				setState(125);
				_la = _input.LA(1);
				if ( !(((((_la - 7)) & ~0x3f) == 0 && ((1L << (_la - 7)) & ((1L << (T__6 - 7)) | (1L << (LOWERCASELETTER - 7)) | (1L << (UPPERCASELETTER - 7)) | (1L << (NONZERODIGIT - 7)) | (1L << (ZERO - 7)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(130);
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
			setState(139);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NONZERODIGIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				match(NONZERODIGIT);
				setState(135);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(132);
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
					setState(137);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				}
				break;
			case ZERO:
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
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
			setState(164);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
			case NONZERODIGIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(141);
					((Float_typeContext)_localctx).minus = match(T__7);
					}
				}

				setState(144);
				match(NONZERODIGIT);
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NONZERODIGIT || _la==ZERO) {
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
					setState(150);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(151);
				match(T__8);
				setState(153); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(152);
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
					setState(155); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case ZERO:
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				match(ZERO);
				setState(158);
				match(T__8);
				setState(160); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
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
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(162); 
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
			setState(167); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(166);
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
				setState(169); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NONZERODIGIT || _la==ZERO );
			setState(171);
			match(T__9);
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
			setState(173);
			_la = _input.LA(1);
			if ( !(_la==NONZERODIGIT || _la==ZERO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(174);
			match(T__9);
			setState(175);
			_la = _input.LA(1);
			if ( !(_la==NONZERODIGIT || _la==ZERO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(176);
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
			setState(178);
			match(T__10);
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
			((Force_typeContext)_localctx).angle = arithmeticalExpression(0);
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
			match(T__11);
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
			((Force_typeContext)_localctx).power = arithmeticalExpression(0);
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(191);
				whiteSpace();
				}
			}

			setState(194);
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
			setState(196);
			match(T__13);
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
			((Object_typeContext)_localctx).x_cor = arithmeticalExpression(0);
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
			match(T__11);
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
			((Object_typeContext)_localctx).y_cor = arithmeticalExpression(0);
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(209);
				whiteSpace();
				}
			}

			setState(212);
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
			setState(214);
			match(T__15);
			setState(215);
			whiteSpace();
			setState(218);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOWERCASELETTER:
			case UPPERCASELETTER:
				{
				setState(216);
				((ApplyForceContext)_localctx).force_ = variableName();
				}
				break;
			case T__10:
				{
				setState(217);
				((ApplyForceContext)_localctx).force_val = force_type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(220);
			whiteSpace();
			setState(221);
			match(T__16);
			setState(222);
			whiteSpace();
			setState(223);
			((ApplyForceContext)_localctx).object_ = variableName();
			setState(224);
			whiteSpace();
			setState(225);
			match(T__17);
			setState(226);
			whiteSpace();
			setState(230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(227);
				((ApplyForceContext)_localctx).time_ = variableName();
				}
				break;
			case 2:
				{
				setState(228);
				((ApplyForceContext)_localctx).time_val = integer();
				}
				break;
			case 3:
				{
				setState(229);
				((ApplyForceContext)_localctx).time_type_val = time_type();
				}
				break;
			}
			setState(240);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(232);
				whiteSpace();
				setState(233);
				match(T__18);
				setState(234);
				whiteSpace();
				setState(238);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(235);
					((ApplyForceContext)_localctx).delay_ = variableName();
					}
					break;
				case 2:
					{
					setState(236);
					((ApplyForceContext)_localctx).delay_val_ = integer();
					}
					break;
				case 3:
					{
					setState(237);
					((ApplyForceContext)_localctx).delay_time_type_val = time_type();
					}
					break;
				}
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
			setState(259);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(248);
				integer();
				}
				break;
			case 2:
				{
				setState(249);
				float_type();
				}
				break;
			case 3:
				{
				setState(250);
				force_type();
				}
				break;
			case 4:
				{
				setState(251);
				object_type();
				}
				break;
			case 5:
				{
				setState(252);
				time_type();
				}
				break;
			case 6:
				{
				setState(253);
				variableName();
				}
				break;
			case 7:
				{
				setState(254);
				functionCall();
				}
				break;
			case 8:
				{
				setState(255);
				getAngle();
				}
				break;
			case 9:
				{
				setState(256);
				getCoordinate();
				}
				break;
			case 10:
				{
				setState(257);
				getDistance();
				}
				break;
			case 11:
				{
				setState(258);
				getVelocity();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(272);
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
					setState(261);
					if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
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
					((ArithmeticalExpressionContext)_localctx).right = arithmeticalExpression(13);
					}
					} 
				}
				setState(274);
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
		public MassDefinitionContext mass_def;
		public SizeDefinitionContext size_def;
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
		public MassDefinitionContext massDefinition() {
			return getRuleContext(MassDefinitionContext.class,0);
		}
		public SizeDefinitionContext sizeDefinition() {
			return getRuleContext(SizeDefinitionContext.class,0);
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
			setState(275);
			match(T__22);
			setState(276);
			whiteSpace();
			setState(277);
			((DeclarationContext)_localctx).type_ = variableType();
			setState(278);
			whiteSpace();
			setState(279);
			((DeclarationContext)_localctx).name_ = variableName();
			setState(280);
			whiteSpace();
			setState(281);
			match(T__23);
			setState(282);
			whiteSpace();
			setState(283);
			((DeclarationContext)_localctx).value_ = arithmeticalExpression(0);
			setState(287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(284);
				whiteSpace();
				setState(285);
				((DeclarationContext)_localctx).mass_def = massDefinition();
				}
				break;
			}
			setState(292);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(289);
				whiteSpace();
				setState(290);
				((DeclarationContext)_localctx).size_def = sizeDefinition();
				}
				break;
			}
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

	public static class MassDefinitionContext extends ParserRuleContext {
		public IntegerContext value_;
		public WhiteSpaceContext whiteSpace() {
			return getRuleContext(WhiteSpaceContext.class,0);
		}
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public MassDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_massDefinition; }
	}

	public final MassDefinitionContext massDefinition() throws RecognitionException {
		MassDefinitionContext _localctx = new MassDefinitionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_massDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			match(T__24);
			setState(300);
			whiteSpace();
			setState(301);
			((MassDefinitionContext)_localctx).value_ = integer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SizeDefinitionContext extends ParserRuleContext {
		public IntegerContext value_;
		public WhiteSpaceContext whiteSpace() {
			return getRuleContext(WhiteSpaceContext.class,0);
		}
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public SizeDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sizeDefinition; }
	}

	public final SizeDefinitionContext sizeDefinition() throws RecognitionException {
		SizeDefinitionContext _localctx = new SizeDefinitionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_sizeDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(T__25);
			setState(304);
			whiteSpace();
			setState(305);
			((SizeDefinitionContext)_localctx).value_ = integer();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 30, RULE_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(T__26);
			setState(308);
			whiteSpace();
			setState(309);
			((DefinitionContext)_localctx).name_ = variableName();
			setState(310);
			whiteSpace();
			setState(311);
			match(T__23);
			setState(312);
			whiteSpace();
			setState(313);
			((DefinitionContext)_localctx).value_ = arithmeticalExpression(0);
			setState(314);
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
		enterRule(_localctx, 32, RULE_conditionalStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			match(T__27);
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
			match(T__13);
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
			((ConditionalStatementContext)_localctx).cond = condition();
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
			match(T__28);
			setState(333);
			whiteSpace();
			setState(334);
			((ConditionalStatementContext)_localctx).con_body = conditionBody();
			setState(336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(335);
				whiteSpace();
				}
			}

			setState(341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__36) {
				{
				{
				setState(338);
				((ConditionalStatementContext)_localctx).elif_stat = elifStatement();
				}
				}
				setState(343);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__37) {
				{
				setState(344);
				((ConditionalStatementContext)_localctx).else_stat = elseStatement();
				}
			}

			setState(347);
			match(T__29);
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
		enterRule(_localctx, 34, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			((ConditionContext)_localctx).left_expr = arithmeticalExpression(0);
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
			((ConditionContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35))) != 0)) ) {
				((ConditionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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
		enterRule(_localctx, 36, RULE_conditionBody);
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
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
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
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__22) | (1L << T__26) | (1L << T__27) | (1L << T__38) | (1L << T__40) | (1L << T__46) | (1L << LOWERCASELETTER) | (1L << UPPERCASELETTER))) != 0) );
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 38, RULE_elifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			match(T__36);
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
			match(T__13);
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
			((ElifStatementContext)_localctx).cond = condition();
			setState(381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(380);
				whiteSpace();
				}
			}

			setState(383);
			match(T__14);
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
			match(T__28);
			setState(388);
			whiteSpace();
			setState(389);
			((ElifStatementContext)_localctx).con_body = conditionBody();
			setState(391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(390);
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
		enterRule(_localctx, 40, RULE_elseStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			match(T__37);
			setState(395);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(394);
				whiteSpace();
				}
				break;
			}
			setState(397);
			whiteSpace();
			setState(398);
			((ElseStatementContext)_localctx).con_body = conditionBody();
			setState(400);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(399);
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
		enterRule(_localctx, 42, RULE_parallelExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			match(T__38);
			setState(403);
			whiteSpace();
			setState(404);
			((ParallelExpressionContext)_localctx).par_body = parallelBody();
			setState(405);
			whiteSpace();
			setState(406);
			match(T__39);
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
		enterRule(_localctx, 44, RULE_parallelBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(412);
				((ParallelBodyContext)_localctx).app_force_ = applyForce();
				setState(414);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
				case 1:
					{
					setState(413);
					whiteSpace();
					}
					break;
				}
				}
				}
				setState(418); 
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
		enterRule(_localctx, 46, RULE_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			match(T__40);
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
			match(T__13);
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
			((LoopContext)_localctx).cond = condition();
			setState(430);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(429);
				whiteSpace();
				}
			}

			setState(432);
			match(T__14);
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
			((LoopContext)_localctx).l_body = loopBody();
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
			match(T__41);
			setState(442);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(441);
				whiteSpace();
				}
			}

			setState(444);
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
		enterRule(_localctx, 48, RULE_loopBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(446);
				instruction();
				setState(448);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
				case 1:
					{
					setState(447);
					whiteSpace();
					}
					break;
				}
				}
				}
				setState(452); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__22) | (1L << T__26) | (1L << T__27) | (1L << T__38) | (1L << T__40) | (1L << T__46) | (1L << LOWERCASELETTER) | (1L << UPPERCASELETTER))) != 0) );
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 50, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UPPERCASELETTER) {
				{
				setState(454);
				((FunctionCallContext)_localctx).scope_seq = scopeSequence();
				}
			}

			setState(457);
			((FunctionCallContext)_localctx).f_name = functionName();
			setState(458);
			match(T__13);
			setState(460);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(459);
				whiteSpace();
				}
			}

			setState(466);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 8)) & ~0x3f) == 0 && ((1L << (_la - 8)) & ((1L << (T__7 - 8)) | (1L << (T__10 - 8)) | (1L << (T__13 - 8)) | (1L << (T__51 - 8)) | (1L << (T__52 - 8)) | (1L << (T__56 - 8)) | (1L << (T__57 - 8)) | (1L << (LOWERCASELETTER - 8)) | (1L << (UPPERCASELETTER - 8)) | (1L << (NONZERODIGIT - 8)) | (1L << (ZERO - 8)))) != 0)) {
				{
				setState(462);
				((FunctionCallContext)_localctx).f_args = functionParams();
				setState(464);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(463);
					whiteSpace();
					}
				}

				}
			}

			setState(468);
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
		enterRule(_localctx, 52, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
			match(T__42);
			setState(471);
			whiteSpace();
			setState(472);
			((FunctionDeclarationContext)_localctx).f_name = functionName();
			setState(473);
			match(T__13);
			setState(475);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
				setState(474);
				whiteSpace();
				}
				break;
			}
			setState(478);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5))) != 0)) {
				{
				setState(477);
				((FunctionDeclarationContext)_localctx).f_args = functionArgs();
				}
			}

			setState(481);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(480);
				whiteSpace();
				}
			}

			setState(483);
			match(T__14);
			setState(495);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				{
				setState(485);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(484);
					whiteSpace();
					}
				}

				setState(487);
				match(T__43);
				setState(489);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(488);
					whiteSpace();
					}
				}

				setState(491);
				((FunctionDeclarationContext)_localctx).return_type = variableType();
				setState(493);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
				case 1:
					{
					setState(492);
					whiteSpace();
					}
					break;
				}
				}
				break;
			}
			setState(497);
			whiteSpace();
			setState(498);
			match(T__23);
			setState(500);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				{
				setState(499);
				whiteSpace();
				}
				break;
			}
			setState(503);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__22) | (1L << T__26) | (1L << T__27) | (1L << T__38) | (1L << T__40) | (1L << T__46) | (1L << LOWERCASELETTER) | (1L << UPPERCASELETTER))) != 0)) {
				{
				setState(502);
				((FunctionDeclarationContext)_localctx).f_body = functionBody();
				}
			}

			setState(506);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				{
				setState(505);
				whiteSpace();
				}
				break;
			}
			setState(509);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__45) {
				{
				setState(508);
				((FunctionDeclarationContext)_localctx).return_stat = return_statement();
				}
			}

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
			match(T__44);
			setState(516);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(515);
				whiteSpace();
				}
			}

			setState(518);
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
		enterRule(_localctx, 54, RULE_functionBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(524); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(520);
				instruction();
				setState(522);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
				case 1:
					{
					setState(521);
					whiteSpace();
					}
					break;
				}
				}
				}
				setState(526); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__22) | (1L << T__26) | (1L << T__27) | (1L << T__38) | (1L << T__40) | (1L << T__46) | (1L << LOWERCASELETTER) | (1L << UPPERCASELETTER))) != 0) );
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 56, RULE_functionArgs);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
			functionArgument();
			setState(539);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(530);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(529);
						whiteSpace();
						}
					}

					setState(532);
					match(T__11);
					setState(534);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(533);
						whiteSpace();
						}
					}

					setState(536);
					functionArgument();
					}
					} 
				}
				setState(541);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
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
		enterRule(_localctx, 58, RULE_functionParams);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(544);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				{
				setState(542);
				variableName();
				}
				break;
			case 2:
				{
				setState(543);
				arithmeticalExpression(0);
				}
				break;
			}
			setState(559);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(547);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(546);
						whiteSpace();
						}
					}

					setState(549);
					match(T__11);
					setState(551);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(550);
						whiteSpace();
						}
					}

					setState(555);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
					case 1:
						{
						setState(553);
						variableName();
						}
						break;
					case 2:
						{
						setState(554);
						arithmeticalExpression(0);
						}
						break;
					}
					}
					} 
				}
				setState(561);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
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
		enterRule(_localctx, 60, RULE_functionArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(562);
			((FunctionArgumentContext)_localctx).type_ = variableType();
			setState(563);
			whiteSpace();
			setState(564);
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
		enterRule(_localctx, 62, RULE_return_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(566);
			match(T__45);
			setState(567);
			whiteSpace();
			setState(568);
			((Return_statementContext)_localctx).expr = arithmeticalExpression(0);
			setState(570);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(569);
				whiteSpace();
				}
			}

			setState(572);
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
		enterRule(_localctx, 64, RULE_comment);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(574);
			match(T__46);
			setState(578);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(575);
					matchWildcard();
					}
					} 
				}
				setState(580);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
			}
			setState(581);
			match(T__47);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 66, RULE_scopeName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(583);
			match(UPPERCASELETTER);
			setState(587);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 7)) & ~0x3f) == 0 && ((1L << (_la - 7)) & ((1L << (T__6 - 7)) | (1L << (LOWERCASELETTER - 7)) | (1L << (UPPERCASELETTER - 7)) | (1L << (NONZERODIGIT - 7)) | (1L << (ZERO - 7)))) != 0)) {
				{
				{
				setState(584);
				_la = _input.LA(1);
				if ( !(((((_la - 7)) & ~0x3f) == 0 && ((1L << (_la - 7)) & ((1L << (T__6 - 7)) | (1L << (LOWERCASELETTER - 7)) | (1L << (UPPERCASELETTER - 7)) | (1L << (NONZERODIGIT - 7)) | (1L << (ZERO - 7)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(589);
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
		enterRule(_localctx, 68, RULE_scopeSequence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(593); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(590);
				scopeName();
				setState(591);
				match(T__48);
				}
				}
				setState(595); 
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
		enterRule(_localctx, 70, RULE_scopeDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(597);
			((ScopeDeclarationContext)_localctx).name = scopeName();
			setState(599);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(598);
				whiteSpace();
				}
			}

			setState(601);
			match(T__49);
			setState(603);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(602);
				whiteSpace();
				}
			}

			setState(607); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(607);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case UPPERCASELETTER:
					{
					setState(605);
					scopeDeclaration();
					}
					break;
				case T__22:
					{
					setState(606);
					declaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(609); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__22 || _la==UPPERCASELETTER );
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
			match(T__50);
			setState(616);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(615);
				whiteSpace();
				}
			}

			setState(618);
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
		enterRule(_localctx, 72, RULE_whiteSpace);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(621); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(620);
					match(WS);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(623); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
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
		enterRule(_localctx, 74, RULE_getAngle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(625);
			match(T__51);
			setState(627);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(626);
				whiteSpace();
				}
			}

			setState(631);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOWERCASELETTER:
			case UPPERCASELETTER:
				{
				setState(629);
				((GetAngleContext)_localctx).name_1 = variableName();
				}
				break;
			case T__13:
				{
				setState(630);
				((GetAngleContext)_localctx).object_1 = object_type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(634);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(633);
				whiteSpace();
				}
			}

			setState(636);
			match(T__11);
			setState(638);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(637);
				whiteSpace();
				}
			}

			setState(642);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOWERCASELETTER:
			case UPPERCASELETTER:
				{
				setState(640);
				((GetAngleContext)_localctx).name_2 = variableName();
				}
				break;
			case T__13:
				{
				setState(641);
				((GetAngleContext)_localctx).object_2 = object_type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(645);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				{
				setState(644);
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
		enterRule(_localctx, 76, RULE_getCoordinate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(647);
			match(T__52);
			setState(649);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(648);
				whiteSpace();
				}
			}

			setState(651);
			((GetCoordinateContext)_localctx).axis = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__53 || _la==T__54) ) {
				((GetCoordinateContext)_localctx).axis = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(653);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(652);
				whiteSpace();
				}
			}

			setState(655);
			match(T__55);
			setState(657);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(656);
				whiteSpace();
				}
			}

			setState(659);
			((GetCoordinateContext)_localctx).name_ = variableName();
			setState(661);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
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
		enterRule(_localctx, 78, RULE_getDistance);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(663);
			match(T__56);
			setState(665);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(664);
				whiteSpace();
				}
			}

			setState(669);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOWERCASELETTER:
			case UPPERCASELETTER:
				{
				setState(667);
				((GetDistanceContext)_localctx).name_1 = variableName();
				}
				break;
			case T__13:
				{
				setState(668);
				((GetDistanceContext)_localctx).object_1 = object_type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(672);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(671);
				whiteSpace();
				}
			}

			setState(674);
			match(T__11);
			setState(676);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(675);
				whiteSpace();
				}
			}

			setState(680);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOWERCASELETTER:
			case UPPERCASELETTER:
				{
				setState(678);
				((GetDistanceContext)_localctx).name_2 = variableName();
				}
				break;
			case T__13:
				{
				setState(679);
				((GetDistanceContext)_localctx).object_2 = object_type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(683);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				{
				setState(682);
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
		enterRule(_localctx, 80, RULE_getVelocity);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(685);
			match(T__57);
			setState(687);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(686);
				whiteSpace();
				}
			}

			setState(689);
			((GetVelocityContext)_localctx).axis = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__53) | (1L << T__54) | (1L << T__58))) != 0)) ) {
				((GetVelocityContext)_localctx).axis = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(691);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(690);
				whiteSpace();
				}
			}

			setState(693);
			match(T__55);
			setState(695);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(694);
				whiteSpace();
				}
			}

			setState(697);
			((GetVelocityContext)_localctx).name_ = variableName();
			setState(699);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				{
				setState(698);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3B\u02c0\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\5\2"+
		"V\n\2\3\2\3\2\3\2\5\2[\n\2\3\2\5\2^\n\2\6\2`\n\2\r\2\16\2a\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\5\3k\n\3\3\3\3\3\3\3\3\3\5\3q\n\3\3\4\3\4\3\5\5\5v\n"+
		"\5\3\5\3\5\7\5z\n\5\f\5\16\5}\13\5\3\6\3\6\7\6\u0081\n\6\f\6\16\6\u0084"+
		"\13\6\3\7\3\7\7\7\u0088\n\7\f\7\16\7\u008b\13\7\3\7\5\7\u008e\n\7\3\b"+
		"\5\b\u0091\n\b\3\b\3\b\7\b\u0095\n\b\f\b\16\b\u0098\13\b\3\b\3\b\6\b\u009c"+
		"\n\b\r\b\16\b\u009d\3\b\3\b\3\b\6\b\u00a3\n\b\r\b\16\b\u00a4\5\b\u00a7"+
		"\n\b\3\t\6\t\u00aa\n\t\r\t\16\t\u00ab\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\5\n\u00b7\n\n\3\n\3\n\5\n\u00bb\n\n\3\n\3\n\5\n\u00bf\n\n\3\n\3\n"+
		"\5\n\u00c3\n\n\3\n\3\n\3\13\3\13\5\13\u00c9\n\13\3\13\3\13\5\13\u00cd"+
		"\n\13\3\13\3\13\5\13\u00d1\n\13\3\13\3\13\5\13\u00d5\n\13\3\13\3\13\3"+
		"\f\3\f\3\f\3\f\5\f\u00dd\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5"+
		"\f\u00e9\n\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00f1\n\f\5\f\u00f3\n\f\3\f\5"+
		"\f\u00f6\n\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5"+
		"\r\u0106\n\r\3\r\3\r\5\r\u010a\n\r\3\r\3\r\5\r\u010e\n\r\3\r\7\r\u0111"+
		"\n\r\f\r\16\r\u0114\13\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\5\16\u0122\n\16\3\16\3\16\3\16\5\16\u0127\n\16\3\16\5"+
		"\16\u012a\n\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\5\22\u0141\n\22\3\22"+
		"\3\22\5\22\u0145\n\22\3\22\3\22\5\22\u0149\n\22\3\22\3\22\5\22\u014d\n"+
		"\22\3\22\3\22\3\22\3\22\5\22\u0153\n\22\3\22\7\22\u0156\n\22\f\22\16\22"+
		"\u0159\13\22\3\22\5\22\u015c\n\22\3\22\3\22\5\22\u0160\n\22\3\22\3\22"+
		"\3\23\3\23\5\23\u0166\n\23\3\23\3\23\5\23\u016a\n\23\3\23\3\23\3\24\3"+
		"\24\5\24\u0170\n\24\6\24\u0172\n\24\r\24\16\24\u0173\3\25\3\25\5\25\u0178"+
		"\n\25\3\25\3\25\5\25\u017c\n\25\3\25\3\25\5\25\u0180\n\25\3\25\3\25\5"+
		"\25\u0184\n\25\3\25\3\25\3\25\3\25\5\25\u018a\n\25\3\26\3\26\5\26\u018e"+
		"\n\26\3\26\3\26\3\26\5\26\u0193\n\26\3\27\3\27\3\27\3\27\3\27\3\27\5\27"+
		"\u019b\n\27\3\27\3\27\3\30\3\30\5\30\u01a1\n\30\6\30\u01a3\n\30\r\30\16"+
		"\30\u01a4\3\31\3\31\5\31\u01a9\n\31\3\31\3\31\5\31\u01ad\n\31\3\31\3\31"+
		"\5\31\u01b1\n\31\3\31\3\31\5\31\u01b5\n\31\3\31\3\31\5\31\u01b9\n\31\3"+
		"\31\3\31\5\31\u01bd\n\31\3\31\3\31\3\32\3\32\5\32\u01c3\n\32\6\32\u01c5"+
		"\n\32\r\32\16\32\u01c6\3\33\5\33\u01ca\n\33\3\33\3\33\3\33\5\33\u01cf"+
		"\n\33\3\33\3\33\5\33\u01d3\n\33\5\33\u01d5\n\33\3\33\3\33\3\34\3\34\3"+
		"\34\3\34\3\34\5\34\u01de\n\34\3\34\5\34\u01e1\n\34\3\34\5\34\u01e4\n\34"+
		"\3\34\3\34\5\34\u01e8\n\34\3\34\3\34\5\34\u01ec\n\34\3\34\3\34\5\34\u01f0"+
		"\n\34\5\34\u01f2\n\34\3\34\3\34\3\34\5\34\u01f7\n\34\3\34\5\34\u01fa\n"+
		"\34\3\34\5\34\u01fd\n\34\3\34\5\34\u0200\n\34\3\34\5\34\u0203\n\34\3\34"+
		"\3\34\5\34\u0207\n\34\3\34\3\34\3\35\3\35\5\35\u020d\n\35\6\35\u020f\n"+
		"\35\r\35\16\35\u0210\3\36\3\36\5\36\u0215\n\36\3\36\3\36\5\36\u0219\n"+
		"\36\3\36\7\36\u021c\n\36\f\36\16\36\u021f\13\36\3\37\3\37\5\37\u0223\n"+
		"\37\3\37\5\37\u0226\n\37\3\37\3\37\5\37\u022a\n\37\3\37\3\37\5\37\u022e"+
		"\n\37\7\37\u0230\n\37\f\37\16\37\u0233\13\37\3 \3 \3 \3 \3!\3!\3!\3!\5"+
		"!\u023d\n!\3!\3!\3\"\3\"\7\"\u0243\n\"\f\"\16\"\u0246\13\"\3\"\3\"\3#"+
		"\3#\7#\u024c\n#\f#\16#\u024f\13#\3$\3$\3$\6$\u0254\n$\r$\16$\u0255\3%"+
		"\3%\5%\u025a\n%\3%\3%\5%\u025e\n%\3%\3%\6%\u0262\n%\r%\16%\u0263\3%\5"+
		"%\u0267\n%\3%\3%\5%\u026b\n%\3%\3%\3&\6&\u0270\n&\r&\16&\u0271\3\'\3\'"+
		"\5\'\u0276\n\'\3\'\3\'\5\'\u027a\n\'\3\'\5\'\u027d\n\'\3\'\3\'\5\'\u0281"+
		"\n\'\3\'\3\'\5\'\u0285\n\'\3\'\5\'\u0288\n\'\3(\3(\5(\u028c\n(\3(\3(\5"+
		"(\u0290\n(\3(\3(\5(\u0294\n(\3(\3(\5(\u0298\n(\3)\3)\5)\u029c\n)\3)\3"+
		")\5)\u02a0\n)\3)\5)\u02a3\n)\3)\3)\5)\u02a7\n)\3)\3)\5)\u02ab\n)\3)\5"+
		")\u02ae\n)\3*\3*\5*\u02b2\n*\3*\3*\5*\u02b6\n*\3*\3*\5*\u02ba\n*\3*\3"+
		"*\5*\u02be\n*\3*\3\u0244\3\30+\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDFHJLNPR\2\t\3\2\4\b\4\2\t\t?B\3\2AB\4\2\n"+
		"\n\26\30\3\2!&\3\289\4\289==\2\u0325\2_\3\2\2\2\4p\3\2\2\2\6r\3\2\2\2"+
		"\bu\3\2\2\2\n~\3\2\2\2\f\u008d\3\2\2\2\16\u00a6\3\2\2\2\20\u00a9\3\2\2"+
		"\2\22\u00b4\3\2\2\2\24\u00c6\3\2\2\2\26\u00d8\3\2\2\2\30\u0105\3\2\2\2"+
		"\32\u0115\3\2\2\2\34\u012d\3\2\2\2\36\u0131\3\2\2\2 \u0135\3\2\2\2\"\u013e"+
		"\3\2\2\2$\u0163\3\2\2\2&\u0171\3\2\2\2(\u0175\3\2\2\2*\u018b\3\2\2\2,"+
		"\u0194\3\2\2\2.\u01a2\3\2\2\2\60\u01a6\3\2\2\2\62\u01c4\3\2\2\2\64\u01c9"+
		"\3\2\2\2\66\u01d8\3\2\2\28\u020e\3\2\2\2:\u0212\3\2\2\2<\u0222\3\2\2\2"+
		">\u0234\3\2\2\2@\u0238\3\2\2\2B\u0240\3\2\2\2D\u0249\3\2\2\2F\u0253\3"+
		"\2\2\2H\u0257\3\2\2\2J\u026f\3\2\2\2L\u0273\3\2\2\2N\u0289\3\2\2\2P\u0299"+
		"\3\2\2\2R\u02af\3\2\2\2TV\5J&\2UT\3\2\2\2UV\3\2\2\2VZ\3\2\2\2W[\5\66\34"+
		"\2X[\5\4\3\2Y[\5H%\2ZW\3\2\2\2ZX\3\2\2\2ZY\3\2\2\2[]\3\2\2\2\\^\5J&\2"+
		"]\\\3\2\2\2]^\3\2\2\2^`\3\2\2\2_U\3\2\2\2`a\3\2\2\2a_\3\2\2\2ab\3\2\2"+
		"\2b\3\3\2\2\2cq\5\32\16\2dq\5 \21\2eq\5\"\22\2fq\5,\27\2gq\5\60\31\2h"+
		"j\5\64\33\2ik\5J&\2ji\3\2\2\2jk\3\2\2\2kl\3\2\2\2lm\7\3\2\2mq\3\2\2\2"+
		"nq\5\26\f\2oq\5B\"\2pc\3\2\2\2pd\3\2\2\2pe\3\2\2\2pf\3\2\2\2pg\3\2\2\2"+
		"ph\3\2\2\2pn\3\2\2\2po\3\2\2\2q\5\3\2\2\2rs\t\2\2\2s\7\3\2\2\2tv\5F$\2"+
		"ut\3\2\2\2uv\3\2\2\2vw\3\2\2\2w{\7?\2\2xz\t\3\2\2yx\3\2\2\2z}\3\2\2\2"+
		"{y\3\2\2\2{|\3\2\2\2|\t\3\2\2\2}{\3\2\2\2~\u0082\7?\2\2\177\u0081\t\3"+
		"\2\2\u0080\177\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083"+
		"\3\2\2\2\u0083\13\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u0089\7A\2\2\u0086"+
		"\u0088\t\4\2\2\u0087\u0086\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2"+
		"\2\2\u0089\u008a\3\2\2\2\u008a\u008e\3\2\2\2\u008b\u0089\3\2\2\2\u008c"+
		"\u008e\7B\2\2\u008d\u0085\3\2\2\2\u008d\u008c\3\2\2\2\u008e\r\3\2\2\2"+
		"\u008f\u0091\7\n\2\2\u0090\u008f\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092"+
		"\3\2\2\2\u0092\u0096\7A\2\2\u0093\u0095\t\4\2\2\u0094\u0093\3\2\2\2\u0095"+
		"\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0099\3\2"+
		"\2\2\u0098\u0096\3\2\2\2\u0099\u009b\7\13\2\2\u009a\u009c\t\4\2\2\u009b"+
		"\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2"+
		"\2\2\u009e\u00a7\3\2\2\2\u009f\u00a0\7B\2\2\u00a0\u00a2\7\13\2\2\u00a1"+
		"\u00a3\t\4\2\2\u00a2\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a2\3\2"+
		"\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a7\3\2\2\2\u00a6\u0090\3\2\2\2\u00a6"+
		"\u009f\3\2\2\2\u00a7\17\3\2\2\2\u00a8\u00aa\t\4\2\2\u00a9\u00a8\3\2\2"+
		"\2\u00aa\u00ab\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad"+
		"\3\2\2\2\u00ad\u00ae\7\f\2\2\u00ae\u00af\t\4\2\2\u00af\u00b0\t\4\2\2\u00b0"+
		"\u00b1\7\f\2\2\u00b1\u00b2\t\4\2\2\u00b2\u00b3\t\4\2\2\u00b3\21\3\2\2"+
		"\2\u00b4\u00b6\7\r\2\2\u00b5\u00b7\5J&\2\u00b6\u00b5\3\2\2\2\u00b6\u00b7"+
		"\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00ba\5\30\r\2\u00b9\u00bb\5J&\2\u00ba"+
		"\u00b9\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00be\7\16"+
		"\2\2\u00bd\u00bf\5J&\2\u00be\u00bd\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0"+
		"\3\2\2\2\u00c0\u00c2\5\30\r\2\u00c1\u00c3\5J&\2\u00c2\u00c1\3\2\2\2\u00c2"+
		"\u00c3\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\7\17\2\2\u00c5\23\3\2\2"+
		"\2\u00c6\u00c8\7\20\2\2\u00c7\u00c9\5J&\2\u00c8\u00c7\3\2\2\2\u00c8\u00c9"+
		"\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cc\5\30\r\2\u00cb\u00cd\5J&\2\u00cc"+
		"\u00cb\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00d0\7\16"+
		"\2\2\u00cf\u00d1\5J&\2\u00d0\u00cf\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2"+
		"\3\2\2\2\u00d2\u00d4\5\30\r\2\u00d3\u00d5\5J&\2\u00d4\u00d3\3\2\2\2\u00d4"+
		"\u00d5\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7\7\21\2\2\u00d7\25\3\2\2"+
		"\2\u00d8\u00d9\7\22\2\2\u00d9\u00dc\5J&\2\u00da\u00dd\5\b\5\2\u00db\u00dd"+
		"\5\22\n\2\u00dc\u00da\3\2\2\2\u00dc\u00db\3\2\2\2\u00dd\u00de\3\2\2\2"+
		"\u00de\u00df\5J&\2\u00df\u00e0\7\23\2\2\u00e0\u00e1\5J&\2\u00e1\u00e2"+
		"\5\b\5\2\u00e2\u00e3\5J&\2\u00e3\u00e4\7\24\2\2\u00e4\u00e8\5J&\2\u00e5"+
		"\u00e9\5\b\5\2\u00e6\u00e9\5\f\7\2\u00e7\u00e9\5\20\t\2\u00e8\u00e5\3"+
		"\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e7\3\2\2\2\u00e9\u00f2\3\2\2\2\u00ea"+
		"\u00eb\5J&\2\u00eb\u00ec\7\25\2\2\u00ec\u00f0\5J&\2\u00ed\u00f1\5\b\5"+
		"\2\u00ee\u00f1\5\f\7\2\u00ef\u00f1\5\20\t\2\u00f0\u00ed\3\2\2\2\u00f0"+
		"\u00ee\3\2\2\2\u00f0\u00ef\3\2\2\2\u00f1\u00f3\3\2\2\2\u00f2\u00ea\3\2"+
		"\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f5\3\2\2\2\u00f4\u00f6\5J&\2\u00f5\u00f4"+
		"\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f8\7\3\2\2\u00f8"+
		"\27\3\2\2\2\u00f9\u00fa\b\r\1\2\u00fa\u0106\5\f\7\2\u00fb\u0106\5\16\b"+
		"\2\u00fc\u0106\5\22\n\2\u00fd\u0106\5\24\13\2\u00fe\u0106\5\20\t\2\u00ff"+
		"\u0106\5\b\5\2\u0100\u0106\5\64\33\2\u0101\u0106\5L\'\2\u0102\u0106\5"+
		"N(\2\u0103\u0106\5P)\2\u0104\u0106\5R*\2\u0105\u00f9\3\2\2\2\u0105\u00fb"+
		"\3\2\2\2\u0105\u00fc\3\2\2\2\u0105\u00fd\3\2\2\2\u0105\u00fe\3\2\2\2\u0105"+
		"\u00ff\3\2\2\2\u0105\u0100\3\2\2\2\u0105\u0101\3\2\2\2\u0105\u0102\3\2"+
		"\2\2\u0105\u0103\3\2\2\2\u0105\u0104\3\2\2\2\u0106\u0112\3\2\2\2\u0107"+
		"\u0109\f\16\2\2\u0108\u010a\5J&\2\u0109\u0108\3\2\2\2\u0109\u010a\3\2"+
		"\2\2\u010a\u010b\3\2\2\2\u010b\u010d\t\5\2\2\u010c\u010e\5J&\2\u010d\u010c"+
		"\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0111\5\30\r\17"+
		"\u0110\u0107\3\2\2\2\u0111\u0114\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113"+
		"\3\2\2\2\u0113\31\3\2\2\2\u0114\u0112\3\2\2\2\u0115\u0116\7\31\2\2\u0116"+
		"\u0117\5J&\2\u0117\u0118\5\6\4\2\u0118\u0119\5J&\2\u0119\u011a\5\b\5\2"+
		"\u011a\u011b\5J&\2\u011b\u011c\7\32\2\2\u011c\u011d\5J&\2\u011d\u0121"+
		"\5\30\r\2\u011e\u011f\5J&\2\u011f\u0120\5\34\17\2\u0120\u0122\3\2\2\2"+
		"\u0121\u011e\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0126\3\2\2\2\u0123\u0124"+
		"\5J&\2\u0124\u0125\5\36\20\2\u0125\u0127\3\2\2\2\u0126\u0123\3\2\2\2\u0126"+
		"\u0127\3\2\2\2\u0127\u0129\3\2\2\2\u0128\u012a\5J&\2\u0129\u0128\3\2\2"+
		"\2\u0129\u012a\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012c\7\3\2\2\u012c\33"+
		"\3\2\2\2\u012d\u012e\7\33\2\2\u012e\u012f\5J&\2\u012f\u0130\5\f\7\2\u0130"+
		"\35\3\2\2\2\u0131\u0132\7\34\2\2\u0132\u0133\5J&\2\u0133\u0134\5\f\7\2"+
		"\u0134\37\3\2\2\2\u0135\u0136\7\35\2\2\u0136\u0137\5J&\2\u0137\u0138\5"+
		"\b\5\2\u0138\u0139\5J&\2\u0139\u013a\7\32\2\2\u013a\u013b\5J&\2\u013b"+
		"\u013c\5\30\r\2\u013c\u013d\7\3\2\2\u013d!\3\2\2\2\u013e\u0140\7\36\2"+
		"\2\u013f\u0141\5J&\2\u0140\u013f\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0142"+
		"\3\2\2\2\u0142\u0144\7\20\2\2\u0143\u0145\5J&\2\u0144\u0143\3\2\2\2\u0144"+
		"\u0145\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0148\5$\23\2\u0147\u0149\5J"+
		"&\2\u0148\u0147\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014a\3\2\2\2\u014a"+
		"\u014c\7\21\2\2\u014b\u014d\5J&\2\u014c\u014b\3\2\2\2\u014c\u014d\3\2"+
		"\2\2\u014d\u014e\3\2\2\2\u014e\u014f\7\37\2\2\u014f\u0150\5J&\2\u0150"+
		"\u0152\5&\24\2\u0151\u0153\5J&\2\u0152\u0151\3\2\2\2\u0152\u0153\3\2\2"+
		"\2\u0153\u0157\3\2\2\2\u0154\u0156\5(\25\2\u0155\u0154\3\2\2\2\u0156\u0159"+
		"\3\2\2\2\u0157\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u015b\3\2\2\2\u0159"+
		"\u0157\3\2\2\2\u015a\u015c\5*\26\2\u015b\u015a\3\2\2\2\u015b\u015c\3\2"+
		"\2\2\u015c\u015d\3\2\2\2\u015d\u015f\7 \2\2\u015e\u0160\5J&\2\u015f\u015e"+
		"\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0162\7\3\2\2\u0162"+
		"#\3\2\2\2\u0163\u0165\5\30\r\2\u0164\u0166\5J&\2\u0165\u0164\3\2\2\2\u0165"+
		"\u0166\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0169\t\6\2\2\u0168\u016a\5J"+
		"&\2\u0169\u0168\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u016b\3\2\2\2\u016b"+
		"\u016c\5\30\r\2\u016c%\3\2\2\2\u016d\u016f\5\4\3\2\u016e\u0170\5J&\2\u016f"+
		"\u016e\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0172\3\2\2\2\u0171\u016d\3\2"+
		"\2\2\u0172\u0173\3\2\2\2\u0173\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174"+
		"\'\3\2\2\2\u0175\u0177\7\'\2\2\u0176\u0178\5J&\2\u0177\u0176\3\2\2\2\u0177"+
		"\u0178\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u017b\7\20\2\2\u017a\u017c\5"+
		"J&\2\u017b\u017a\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017d\3\2\2\2\u017d"+
		"\u017f\5$\23\2\u017e\u0180\5J&\2\u017f\u017e\3\2\2\2\u017f\u0180\3\2\2"+
		"\2\u0180\u0181\3\2\2\2\u0181\u0183\7\21\2\2\u0182\u0184\5J&\2\u0183\u0182"+
		"\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0186\7\37\2\2"+
		"\u0186\u0187\5J&\2\u0187\u0189\5&\24\2\u0188\u018a\5J&\2\u0189\u0188\3"+
		"\2\2\2\u0189\u018a\3\2\2\2\u018a)\3\2\2\2\u018b\u018d\7(\2\2\u018c\u018e"+
		"\5J&\2\u018d\u018c\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u018f\3\2\2\2\u018f"+
		"\u0190\5J&\2\u0190\u0192\5&\24\2\u0191\u0193\5J&\2\u0192\u0191\3\2\2\2"+
		"\u0192\u0193\3\2\2\2\u0193+\3\2\2\2\u0194\u0195\7)\2\2\u0195\u0196\5J"+
		"&\2\u0196\u0197\5.\30\2\u0197\u0198\5J&\2\u0198\u019a\7*\2\2\u0199\u019b"+
		"\5J&\2\u019a\u0199\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u019c\3\2\2\2\u019c"+
		"\u019d\7\3\2\2\u019d-\3\2\2\2\u019e\u01a0\5\26\f\2\u019f\u01a1\5J&\2\u01a0"+
		"\u019f\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a3\3\2\2\2\u01a2\u019e\3\2"+
		"\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5"+
		"/\3\2\2\2\u01a6\u01a8\7+\2\2\u01a7\u01a9\5J&\2\u01a8\u01a7\3\2\2\2\u01a8"+
		"\u01a9\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ac\7\20\2\2\u01ab\u01ad\5"+
		"J&\2\u01ac\u01ab\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae"+
		"\u01b0\5$\23\2\u01af\u01b1\5J&\2\u01b0\u01af\3\2\2\2\u01b0\u01b1\3\2\2"+
		"\2\u01b1\u01b2\3\2\2\2\u01b2\u01b4\7\21\2\2\u01b3\u01b5\5J&\2\u01b4\u01b3"+
		"\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b8\5\62\32\2"+
		"\u01b7\u01b9\5J&\2\u01b8\u01b7\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01ba"+
		"\3\2\2\2\u01ba\u01bc\7,\2\2\u01bb\u01bd\5J&\2\u01bc\u01bb\3\2\2\2\u01bc"+
		"\u01bd\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01bf\7\3\2\2\u01bf\61\3\2\2"+
		"\2\u01c0\u01c2\5\4\3\2\u01c1\u01c3\5J&\2\u01c2\u01c1\3\2\2\2\u01c2\u01c3"+
		"\3\2\2\2\u01c3\u01c5\3\2\2\2\u01c4\u01c0\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6"+
		"\u01c4\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\63\3\2\2\2\u01c8\u01ca\5F$\2"+
		"\u01c9\u01c8\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01cc"+
		"\5\n\6\2\u01cc\u01ce\7\20\2\2\u01cd\u01cf\5J&\2\u01ce\u01cd\3\2\2\2\u01ce"+
		"\u01cf\3\2\2\2\u01cf\u01d4\3\2\2\2\u01d0\u01d2\5<\37\2\u01d1\u01d3\5J"+
		"&\2\u01d2\u01d1\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01d5\3\2\2\2\u01d4"+
		"\u01d0\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d7\7\21"+
		"\2\2\u01d7\65\3\2\2\2\u01d8\u01d9\7-\2\2\u01d9\u01da\5J&\2\u01da\u01db"+
		"\5\n\6\2\u01db\u01dd\7\20\2\2\u01dc\u01de\5J&\2\u01dd\u01dc\3\2\2\2\u01dd"+
		"\u01de\3\2\2\2\u01de\u01e0\3\2\2\2\u01df\u01e1\5:\36\2\u01e0\u01df\3\2"+
		"\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01e3\3\2\2\2\u01e2\u01e4\5J&\2\u01e3\u01e2"+
		"\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01f1\7\21\2\2"+
		"\u01e6\u01e8\5J&\2\u01e7\u01e6\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01e9"+
		"\3\2\2\2\u01e9\u01eb\7.\2\2\u01ea\u01ec\5J&\2\u01eb\u01ea\3\2\2\2\u01eb"+
		"\u01ec\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01ef\5\6\4\2\u01ee\u01f0\5J"+
		"&\2\u01ef\u01ee\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0\u01f2\3\2\2\2\u01f1"+
		"\u01e7\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f4\5J"+
		"&\2\u01f4\u01f6\7\32\2\2\u01f5\u01f7\5J&\2\u01f6\u01f5\3\2\2\2\u01f6\u01f7"+
		"\3\2\2\2\u01f7\u01f9\3\2\2\2\u01f8\u01fa\58\35\2\u01f9\u01f8\3\2\2\2\u01f9"+
		"\u01fa\3\2\2\2\u01fa\u01fc\3\2\2\2\u01fb\u01fd\5J&\2\u01fc\u01fb\3\2\2"+
		"\2\u01fc\u01fd\3\2\2\2\u01fd\u01ff\3\2\2\2\u01fe\u0200\5@!\2\u01ff\u01fe"+
		"\3\2\2\2\u01ff\u0200\3\2\2\2\u0200\u0202\3\2\2\2\u0201\u0203\5J&\2\u0202"+
		"\u0201\3\2\2\2\u0202\u0203\3\2\2\2\u0203\u0204\3\2\2\2\u0204\u0206\7/"+
		"\2\2\u0205\u0207\5J&\2\u0206\u0205\3\2\2\2\u0206\u0207\3\2\2\2\u0207\u0208"+
		"\3\2\2\2\u0208\u0209\7\3\2\2\u0209\67\3\2\2\2\u020a\u020c\5\4\3\2\u020b"+
		"\u020d\5J&\2\u020c\u020b\3\2\2\2\u020c\u020d\3\2\2\2\u020d\u020f\3\2\2"+
		"\2\u020e\u020a\3\2\2\2\u020f\u0210\3\2\2\2\u0210\u020e\3\2\2\2\u0210\u0211"+
		"\3\2\2\2\u02119\3\2\2\2\u0212\u021d\5> \2\u0213\u0215\5J&\2\u0214\u0213"+
		"\3\2\2\2\u0214\u0215\3\2\2\2\u0215\u0216\3\2\2\2\u0216\u0218\7\16\2\2"+
		"\u0217\u0219\5J&\2\u0218\u0217\3\2\2\2\u0218\u0219\3\2\2\2\u0219\u021a"+
		"\3\2\2\2\u021a\u021c\5> \2\u021b\u0214\3\2\2\2\u021c\u021f\3\2\2\2\u021d"+
		"\u021b\3\2\2\2\u021d\u021e\3\2\2\2\u021e;\3\2\2\2\u021f\u021d\3\2\2\2"+
		"\u0220\u0223\5\b\5\2\u0221\u0223\5\30\r\2\u0222\u0220\3\2\2\2\u0222\u0221"+
		"\3\2\2\2\u0223\u0231\3\2\2\2\u0224\u0226\5J&\2\u0225\u0224\3\2\2\2\u0225"+
		"\u0226\3\2\2\2\u0226\u0227\3\2\2\2\u0227\u0229\7\16\2\2\u0228\u022a\5"+
		"J&\2\u0229\u0228\3\2\2\2\u0229\u022a\3\2\2\2\u022a\u022d\3\2\2\2\u022b"+
		"\u022e\5\b\5\2\u022c\u022e\5\30\r\2\u022d\u022b\3\2\2\2\u022d\u022c\3"+
		"\2\2\2\u022e\u0230\3\2\2\2\u022f\u0225\3\2\2\2\u0230\u0233\3\2\2\2\u0231"+
		"\u022f\3\2\2\2\u0231\u0232\3\2\2\2\u0232=\3\2\2\2\u0233\u0231\3\2\2\2"+
		"\u0234\u0235\5\6\4\2\u0235\u0236\5J&\2\u0236\u0237\5\b\5\2\u0237?\3\2"+
		"\2\2\u0238\u0239\7\60\2\2\u0239\u023a\5J&\2\u023a\u023c\5\30\r\2\u023b"+
		"\u023d\5J&\2\u023c\u023b\3\2\2\2\u023c\u023d\3\2\2\2\u023d\u023e\3\2\2"+
		"\2\u023e\u023f\7\3\2\2\u023fA\3\2\2\2\u0240\u0244\7\61\2\2\u0241\u0243"+
		"\13\2\2\2\u0242\u0241\3\2\2\2\u0243\u0246\3\2\2\2\u0244\u0245\3\2\2\2"+
		"\u0244\u0242\3\2\2\2\u0245\u0247\3\2\2\2\u0246\u0244\3\2\2\2\u0247\u0248"+
		"\7\62\2\2\u0248C\3\2\2\2\u0249\u024d\7@\2\2\u024a\u024c\t\3\2\2\u024b"+
		"\u024a\3\2\2\2\u024c\u024f\3\2\2\2\u024d\u024b\3\2\2\2\u024d\u024e\3\2"+
		"\2\2\u024eE\3\2\2\2\u024f\u024d\3\2\2\2\u0250\u0251\5D#\2\u0251\u0252"+
		"\7\63\2\2\u0252\u0254\3\2\2\2\u0253\u0250\3\2\2\2\u0254\u0255\3\2\2\2"+
		"\u0255\u0253\3\2\2\2\u0255\u0256\3\2\2\2\u0256G\3\2\2\2\u0257\u0259\5"+
		"D#\2\u0258\u025a\5J&\2\u0259\u0258\3\2\2\2\u0259\u025a\3\2\2\2\u025a\u025b"+
		"\3\2\2\2\u025b\u025d\7\64\2\2\u025c\u025e\5J&\2\u025d\u025c\3\2\2\2\u025d"+
		"\u025e\3\2\2\2\u025e\u0261\3\2\2\2\u025f\u0262\5H%\2\u0260\u0262\5\32"+
		"\16\2\u0261\u025f\3\2\2\2\u0261\u0260\3\2\2\2\u0262\u0263\3\2\2\2\u0263"+
		"\u0261\3\2\2\2\u0263\u0264\3\2\2\2\u0264\u0266\3\2\2\2\u0265\u0267\5J"+
		"&\2\u0266\u0265\3\2\2\2\u0266\u0267\3\2\2\2\u0267\u0268\3\2\2\2\u0268"+
		"\u026a\7\65\2\2\u0269\u026b\5J&\2\u026a\u0269\3\2\2\2\u026a\u026b\3\2"+
		"\2\2\u026b\u026c\3\2\2\2\u026c\u026d\7\3\2\2\u026dI\3\2\2\2\u026e\u0270"+
		"\7>\2\2\u026f\u026e\3\2\2\2\u0270\u0271\3\2\2\2\u0271\u026f\3\2\2\2\u0271"+
		"\u0272\3\2\2\2\u0272K\3\2\2\2\u0273\u0275\7\66\2\2\u0274\u0276\5J&\2\u0275"+
		"\u0274\3\2\2\2\u0275\u0276\3\2\2\2\u0276\u0279\3\2\2\2\u0277\u027a\5\b"+
		"\5\2\u0278\u027a\5\24\13\2\u0279\u0277\3\2\2\2\u0279\u0278\3\2\2\2\u027a"+
		"\u027c\3\2\2\2\u027b\u027d\5J&\2\u027c\u027b\3\2\2\2\u027c\u027d\3\2\2"+
		"\2\u027d\u027e\3\2\2\2\u027e\u0280\7\16\2\2\u027f\u0281\5J&\2\u0280\u027f"+
		"\3\2\2\2\u0280\u0281\3\2\2\2\u0281\u0284\3\2\2\2\u0282\u0285\5\b\5\2\u0283"+
		"\u0285\5\24\13\2\u0284\u0282\3\2\2\2\u0284\u0283\3\2\2\2\u0285\u0287\3"+
		"\2\2\2\u0286\u0288\5J&\2\u0287\u0286\3\2\2\2\u0287\u0288\3\2\2\2\u0288"+
		"M\3\2\2\2\u0289\u028b\7\67\2\2\u028a\u028c\5J&\2\u028b\u028a\3\2\2\2\u028b"+
		"\u028c\3\2\2\2\u028c\u028d\3\2\2\2\u028d\u028f\t\7\2\2\u028e\u0290\5J"+
		"&\2\u028f\u028e\3\2\2\2\u028f\u0290\3\2\2\2\u0290\u0291\3\2\2\2\u0291"+
		"\u0293\7:\2\2\u0292\u0294\5J&\2\u0293\u0292\3\2\2\2\u0293\u0294\3\2\2"+
		"\2\u0294\u0295\3\2\2\2\u0295\u0297\5\b\5\2\u0296\u0298\5J&\2\u0297\u0296"+
		"\3\2\2\2\u0297\u0298\3\2\2\2\u0298O\3\2\2\2\u0299\u029b\7;\2\2\u029a\u029c"+
		"\5J&\2\u029b\u029a\3\2\2\2\u029b\u029c\3\2\2\2\u029c\u029f\3\2\2\2\u029d"+
		"\u02a0\5\b\5\2\u029e\u02a0\5\24\13\2\u029f\u029d\3\2\2\2\u029f\u029e\3"+
		"\2\2\2\u02a0\u02a2\3\2\2\2\u02a1\u02a3\5J&\2\u02a2\u02a1\3\2\2\2\u02a2"+
		"\u02a3\3\2\2\2\u02a3\u02a4\3\2\2\2\u02a4\u02a6\7\16\2\2\u02a5\u02a7\5"+
		"J&\2\u02a6\u02a5\3\2\2\2\u02a6\u02a7\3\2\2\2\u02a7\u02aa\3\2\2\2\u02a8"+
		"\u02ab\5\b\5\2\u02a9\u02ab\5\24\13\2\u02aa\u02a8\3\2\2\2\u02aa\u02a9\3"+
		"\2\2\2\u02ab\u02ad\3\2\2\2\u02ac\u02ae\5J&\2\u02ad\u02ac\3\2\2\2\u02ad"+
		"\u02ae\3\2\2\2\u02aeQ\3\2\2\2\u02af\u02b1\7<\2\2\u02b0\u02b2\5J&\2\u02b1"+
		"\u02b0\3\2\2\2\u02b1\u02b2\3\2\2\2\u02b2\u02b3\3\2\2\2\u02b3\u02b5\t\b"+
		"\2\2\u02b4\u02b6\5J&\2\u02b5\u02b4\3\2\2\2\u02b5\u02b6\3\2\2\2\u02b6\u02b7"+
		"\3\2\2\2\u02b7\u02b9\7:\2\2\u02b8\u02ba\5J&\2\u02b9\u02b8\3\2\2\2\u02b9"+
		"\u02ba\3\2\2\2\u02ba\u02bb\3\2\2\2\u02bb\u02bd\5\b\5\2\u02bc\u02be\5J"+
		"&\2\u02bd\u02bc\3\2\2\2\u02bd\u02be\3\2\2\2\u02beS\3\2\2\2\177UZ]ajpu"+
		"{\u0082\u0089\u008d\u0090\u0096\u009d\u00a4\u00a6\u00ab\u00b6\u00ba\u00be"+
		"\u00c2\u00c8\u00cc\u00d0\u00d4\u00dc\u00e8\u00f0\u00f2\u00f5\u0105\u0109"+
		"\u010d\u0112\u0121\u0126\u0129\u0140\u0144\u0148\u014c\u0152\u0157\u015b"+
		"\u015f\u0165\u0169\u016f\u0173\u0177\u017b\u017f\u0183\u0189\u018d\u0192"+
		"\u019a\u01a0\u01a4\u01a8\u01ac\u01b0\u01b4\u01b8\u01bc\u01c2\u01c6\u01c9"+
		"\u01ce\u01d2\u01d4\u01dd\u01e0\u01e3\u01e7\u01eb\u01ef\u01f1\u01f6\u01f9"+
		"\u01fc\u01ff\u0202\u0206\u020c\u0210\u0214\u0218\u021d\u0222\u0225\u0229"+
		"\u022d\u0231\u023c\u0244\u024d\u0255\u0259\u025d\u0261\u0263\u0266\u026a"+
		"\u0271\u0275\u0279\u027c\u0280\u0284\u0287\u028b\u028f\u0293\u0297\u029b"+
		"\u029f\u02a2\u02a6\u02aa\u02ad\u02b1\u02b5\u02b9\u02bd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}