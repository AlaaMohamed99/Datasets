// Generated from E:/antler-project/src\ScssParser.g4 by ANTLR 4.9
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ScssParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NULL=1, IN=2, Unit=3, COMBINE_COMPARE=4, Ellipsis=5, InterpolationStart=6, 
		LPAREN=7, RPAREN=8, BlockStart=9, BlockEnd=10, LBRACK=11, RBRACK=12, GT=13, 
		TIL=14, LT=15, COLON=16, SEMI=17, COMMA=18, DOT=19, DOLLAR=20, AT=21, 
		AND=22, HASH=23, COLONCOLON=24, PLUS=25, TIMES=26, DIV=27, MINUS=28, PERC=29, 
		UrlStart=30, EQEQ=31, NOTEQ=32, EQ=33, PIPE_EQ=34, TILD_EQ=35, MIXIN=36, 
		FUNCTION=37, AT_ELSE=38, IF=39, AT_IF=40, AT_FOR=41, AT_WHILE=42, AT_EACH=43, 
		INCLUDE=44, IMPORT=45, RETURN=46, FROM=47, THROUGH=48, POUND_DEFAULT=49, 
		Identifier=50, Variable=51, Var=52, StringLiteral=53, Number=54, Color=55, 
		WS=56, SL_COMMENT=57, COMMENT=58, UrlEnd=59, Url=60, SPACE=61, InterpolationStartAfter=62, 
		IdentifierAfter=63;
	public static final int
		RULE_stylesheet = 0, RULE_statement = 1, RULE_params = 2, RULE_param = 3, 
		RULE_variableName = 4, RULE_paramOptionalValue = 5, RULE_mixinDeclaration = 6, 
		RULE_includeDeclaration = 7, RULE_functionDeclaration = 8, RULE_functionBody = 9, 
		RULE_functionReturn = 10, RULE_functionStatement = 11, RULE_commandStatement = 12, 
		RULE_mathCharacter = 13, RULE_mathStatement = 14, RULE_expression = 15, 
		RULE_ifDeclaration = 16, RULE_elseIfStatement = 17, RULE_elseStatement = 18, 
		RULE_conditions = 19, RULE_condition = 20, RULE_variableDeclaration = 21, 
		RULE_forDeclaration = 22, RULE_fromNumber = 23, RULE_throughNumber = 24, 
		RULE_whileDeclaration = 25, RULE_eachDeclaration = 26, RULE_eachValueList = 27, 
		RULE_identifierListOrMap = 28, RULE_identifierValue = 29, RULE_importDeclaration = 30, 
		RULE_referenceUrl = 31, RULE_mediaTypes = 32, RULE_nested = 33, RULE_nest = 34, 
		RULE_ruleset = 35, RULE_block = 36, RULE_selectors = 37, RULE_selector = 38, 
		RULE_selectorPrefix = 39, RULE_element = 40, RULE_pseudo = 41, RULE_attrib = 42, 
		RULE_attribRelate = 43, RULE_identifier = 44, RULE_identifierPart = 45, 
		RULE_identifierVariableName = 46, RULE_property = 47, RULE_var = 48, RULE_values = 49, 
		RULE_url = 50, RULE_measurement = 51, RULE_functionCall = 52;
	private static String[] makeRuleNames() {
		return new String[] {
			"stylesheet", "statement", "params", "param", "variableName", "paramOptionalValue", 
			"mixinDeclaration", "includeDeclaration", "functionDeclaration", "functionBody", 
			"functionReturn", "functionStatement", "commandStatement", "mathCharacter", 
			"mathStatement", "expression", "ifDeclaration", "elseIfStatement", "elseStatement", 
			"conditions", "condition", "variableDeclaration", "forDeclaration", "fromNumber", 
			"throughNumber", "whileDeclaration", "eachDeclaration", "eachValueList", 
			"identifierListOrMap", "identifierValue", "importDeclaration", "referenceUrl", 
			"mediaTypes", "nested", "nest", "ruleset", "block", "selectors", "selector", 
			"selectorPrefix", "element", "pseudo", "attrib", "attribRelate", "identifier", 
			"identifierPart", "identifierVariableName", "property", "var", "values", 
			"url", "measurement", "functionCall"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'null'", "'in'", null, null, "'...'", null, "'('", "')'", "'{'", 
			"'}'", "'['", "']'", "'>'", "'~'", "'<'", "':'", "';'", "','", "'.'", 
			"'$'", "'@'", "'&'", "'#'", "'::'", "'+'", "'*'", "'/'", "'-'", "'%'", 
			null, "'=='", "'!='", "'='", "'|='", "'~='", "'@mixin'", "'@function'", 
			"'@else'", "'if'", "'@if'", "'@for'", "'@while'", "'@each'", "'@include'", 
			"'@import'", "'@return'", "'from'", "'through'", "'!default'", null, 
			null, "'var('"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NULL", "IN", "Unit", "COMBINE_COMPARE", "Ellipsis", "InterpolationStart", 
			"LPAREN", "RPAREN", "BlockStart", "BlockEnd", "LBRACK", "RBRACK", "GT", 
			"TIL", "LT", "COLON", "SEMI", "COMMA", "DOT", "DOLLAR", "AT", "AND", 
			"HASH", "COLONCOLON", "PLUS", "TIMES", "DIV", "MINUS", "PERC", "UrlStart", 
			"EQEQ", "NOTEQ", "EQ", "PIPE_EQ", "TILD_EQ", "MIXIN", "FUNCTION", "AT_ELSE", 
			"IF", "AT_IF", "AT_FOR", "AT_WHILE", "AT_EACH", "INCLUDE", "IMPORT", 
			"RETURN", "FROM", "THROUGH", "POUND_DEFAULT", "Identifier", "Variable", 
			"Var", "StringLiteral", "Number", "Color", "WS", "SL_COMMENT", "COMMENT", 
			"UrlEnd", "Url", "SPACE", "InterpolationStartAfter", "IdentifierAfter"
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
	public String getGrammarFileName() { return "ScssParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ScssParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StylesheetContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StylesheetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stylesheet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterStylesheet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitStylesheet(this);
		}
	}

	public final StylesheetContext stylesheet() throws RecognitionException {
		StylesheetContext _localctx = new StylesheetContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_stylesheet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << InterpolationStart) | (1L << DOT) | (1L << DOLLAR) | (1L << AT) | (1L << AND) | (1L << HASH) | (1L << TIMES) | (1L << MIXIN) | (1L << FUNCTION) | (1L << AT_IF) | (1L << AT_FOR) | (1L << AT_WHILE) | (1L << AT_EACH) | (1L << INCLUDE) | (1L << IMPORT) | (1L << Identifier))) != 0)) {
				{
				{
				setState(106);
				statement();
				}
				}
				setState(111);
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

	public static class StatementContext extends ParserRuleContext {
		public ImportDeclarationContext importDeclaration() {
			return getRuleContext(ImportDeclarationContext.class,0);
		}
		public NestedContext nested() {
			return getRuleContext(NestedContext.class,0);
		}
		public RulesetContext ruleset() {
			return getRuleContext(RulesetContext.class,0);
		}
		public MixinDeclarationContext mixinDeclaration() {
			return getRuleContext(MixinDeclarationContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public IncludeDeclarationContext includeDeclaration() {
			return getRuleContext(IncludeDeclarationContext.class,0);
		}
		public IfDeclarationContext ifDeclaration() {
			return getRuleContext(IfDeclarationContext.class,0);
		}
		public ForDeclarationContext forDeclaration() {
			return getRuleContext(ForDeclarationContext.class,0);
		}
		public WhileDeclarationContext whileDeclaration() {
			return getRuleContext(WhileDeclarationContext.class,0);
		}
		public EachDeclarationContext eachDeclaration() {
			return getRuleContext(EachDeclarationContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(123);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMPORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				importDeclaration();
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				nested();
				}
				break;
			case InterpolationStart:
			case DOT:
			case AND:
			case HASH:
			case TIMES:
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(114);
				ruleset();
				}
				break;
			case MIXIN:
				enterOuterAlt(_localctx, 4);
				{
				setState(115);
				mixinDeclaration();
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 5);
				{
				setState(116);
				functionDeclaration();
				}
				break;
			case DOLLAR:
				enterOuterAlt(_localctx, 6);
				{
				setState(117);
				variableDeclaration();
				}
				break;
			case INCLUDE:
				enterOuterAlt(_localctx, 7);
				{
				setState(118);
				includeDeclaration();
				}
				break;
			case AT_IF:
				enterOuterAlt(_localctx, 8);
				{
				setState(119);
				ifDeclaration();
				}
				break;
			case AT_FOR:
				enterOuterAlt(_localctx, 9);
				{
				setState(120);
				forDeclaration();
				}
				break;
			case AT_WHILE:
				enterOuterAlt(_localctx, 10);
				{
				setState(121);
				whileDeclaration();
				}
				break;
			case AT_EACH:
				enterOuterAlt(_localctx, 11);
				{
				setState(122);
				eachDeclaration();
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

	public static class ParamsContext extends ParserRuleContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ScssParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ScssParser.COMMA, i);
		}
		public TerminalNode Ellipsis() { return getToken(ScssParser.Ellipsis, 0); }
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitParams(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			param();
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(126);
				match(COMMA);
				setState(127);
				param();
				}
				}
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ellipsis) {
				{
				setState(133);
				match(Ellipsis);
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

	public static class ParamContext extends ParserRuleContext {
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public ParamOptionalValueContext paramOptionalValue() {
			return getRuleContext(ParamOptionalValueContext.class,0);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitParam(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			variableName();
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(137);
				paramOptionalValue();
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

	public static class VariableNameContext extends ParserRuleContext {
		public TerminalNode DOLLAR() { return getToken(ScssParser.DOLLAR, 0); }
		public TerminalNode Identifier() { return getToken(ScssParser.Identifier, 0); }
		public VariableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterVariableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitVariableName(this);
		}
	}

	public final VariableNameContext variableName() throws RecognitionException {
		VariableNameContext _localctx = new VariableNameContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(DOLLAR);
			setState(141);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamOptionalValueContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(ScssParser.COLON, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ParamOptionalValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramOptionalValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterParamOptionalValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitParamOptionalValue(this);
		}
	}

	public final ParamOptionalValueContext paramOptionalValue() throws RecognitionException {
		ParamOptionalValueContext _localctx = new ParamOptionalValueContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_paramOptionalValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(COLON);
			setState(145); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(144);
				expression();
				}
				}
				setState(147); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NULL) | (1L << InterpolationStart) | (1L << DOLLAR) | (1L << UrlStart) | (1L << Identifier) | (1L << Var) | (1L << StringLiteral) | (1L << Number) | (1L << Color))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MixinDeclarationContext extends ParserRuleContext {
		public TerminalNode MIXIN() { return getToken(ScssParser.MIXIN, 0); }
		public TerminalNode Identifier() { return getToken(ScssParser.Identifier, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(ScssParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ScssParser.RPAREN, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public MixinDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mixinDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterMixinDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitMixinDeclaration(this);
		}
	}

	public final MixinDeclarationContext mixinDeclaration() throws RecognitionException {
		MixinDeclarationContext _localctx = new MixinDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_mixinDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(MIXIN);
			setState(150);
			match(Identifier);
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(151);
				match(LPAREN);
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOLLAR) {
					{
					setState(152);
					params();
					}
				}

				setState(155);
				match(RPAREN);
				}
			}

			setState(158);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IncludeDeclarationContext extends ParserRuleContext {
		public TerminalNode INCLUDE() { return getToken(ScssParser.INCLUDE, 0); }
		public TerminalNode Identifier() { return getToken(ScssParser.Identifier, 0); }
		public TerminalNode SEMI() { return getToken(ScssParser.SEMI, 0); }
		public TerminalNode LPAREN() { return getToken(ScssParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ScssParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public IncludeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_includeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterIncludeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitIncludeDeclaration(this);
		}
	}

	public final IncludeDeclarationContext includeDeclaration() throws RecognitionException {
		IncludeDeclarationContext _localctx = new IncludeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_includeDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(INCLUDE);
			setState(161);
			match(Identifier);
			setState(176);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEMI:
				{
				setState(162);
				match(SEMI);
				}
				break;
			case NULL:
			case InterpolationStart:
			case LPAREN:
			case BlockStart:
			case BlockEnd:
			case DOT:
			case DOLLAR:
			case AT:
			case AND:
			case HASH:
			case TIMES:
			case UrlStart:
			case MIXIN:
			case FUNCTION:
			case AT_IF:
			case AT_FOR:
			case AT_WHILE:
			case AT_EACH:
			case INCLUDE:
			case IMPORT:
			case RETURN:
			case Identifier:
			case Variable:
			case Var:
			case StringLiteral:
			case Number:
			case Color:
				{
				setState(171);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(163);
					match(LPAREN);
					setState(165);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NULL) | (1L << InterpolationStart) | (1L << LPAREN) | (1L << DOLLAR) | (1L << UrlStart) | (1L << Identifier) | (1L << Var) | (1L << StringLiteral) | (1L << Number) | (1L << Color))) != 0)) {
						{
						setState(164);
						values();
						}
					}

					setState(167);
					match(RPAREN);
					setState(169);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(168);
						match(SEMI);
						}
					}

					}
					break;
				}
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BlockStart) {
					{
					setState(173);
					block();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(ScssParser.FUNCTION, 0); }
		public TerminalNode Identifier() { return getToken(ScssParser.Identifier, 0); }
		public TerminalNode LPAREN() { return getToken(ScssParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ScssParser.RPAREN, 0); }
		public TerminalNode BlockStart() { return getToken(ScssParser.BlockStart, 0); }
		public TerminalNode BlockEnd() { return getToken(ScssParser.BlockEnd, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitFunctionDeclaration(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(FUNCTION);
			setState(179);
			match(Identifier);
			setState(180);
			match(LPAREN);
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOLLAR) {
				{
				setState(181);
				params();
				}
			}

			setState(184);
			match(RPAREN);
			setState(185);
			match(BlockStart);
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NULL) | (1L << InterpolationStart) | (1L << LPAREN) | (1L << DOT) | (1L << DOLLAR) | (1L << AT) | (1L << AND) | (1L << HASH) | (1L << TIMES) | (1L << UrlStart) | (1L << MIXIN) | (1L << FUNCTION) | (1L << AT_IF) | (1L << AT_FOR) | (1L << AT_WHILE) | (1L << AT_EACH) | (1L << INCLUDE) | (1L << IMPORT) | (1L << RETURN) | (1L << Identifier) | (1L << Var) | (1L << StringLiteral) | (1L << Number) | (1L << Color))) != 0)) {
				{
				setState(186);
				functionBody();
				}
			}

			setState(189);
			match(BlockEnd);
			}
		}
		catch (RecognitionException re) {
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
		public FunctionReturnContext functionReturn() {
			return getRuleContext(FunctionReturnContext.class,0);
		}
		public List<FunctionStatementContext> functionStatement() {
			return getRuleContexts(FunctionStatementContext.class);
		}
		public FunctionStatementContext functionStatement(int i) {
			return getRuleContext(FunctionStatementContext.class,i);
		}
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitFunctionBody(this);
		}
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_functionBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NULL) | (1L << InterpolationStart) | (1L << LPAREN) | (1L << DOT) | (1L << DOLLAR) | (1L << AT) | (1L << AND) | (1L << HASH) | (1L << TIMES) | (1L << UrlStart) | (1L << MIXIN) | (1L << FUNCTION) | (1L << AT_IF) | (1L << AT_FOR) | (1L << AT_WHILE) | (1L << AT_EACH) | (1L << INCLUDE) | (1L << IMPORT) | (1L << Identifier) | (1L << Var) | (1L << StringLiteral) | (1L << Number) | (1L << Color))) != 0)) {
				{
				{
				setState(191);
				functionStatement();
				}
				}
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(197);
			functionReturn();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionReturnContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(ScssParser.RETURN, 0); }
		public CommandStatementContext commandStatement() {
			return getRuleContext(CommandStatementContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ScssParser.SEMI, 0); }
		public FunctionReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionReturn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterFunctionReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitFunctionReturn(this);
		}
	}

	public final FunctionReturnContext functionReturn() throws RecognitionException {
		FunctionReturnContext _localctx = new FunctionReturnContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_functionReturn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(RETURN);
			setState(200);
			commandStatement();
			setState(201);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionStatementContext extends ParserRuleContext {
		public CommandStatementContext commandStatement() {
			return getRuleContext(CommandStatementContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ScssParser.SEMI, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public FunctionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterFunctionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitFunctionStatement(this);
		}
	}

	public final FunctionStatementContext functionStatement() throws RecognitionException {
		FunctionStatementContext _localctx = new FunctionStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_functionStatement);
		try {
			setState(207);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				commandStatement();
				setState(204);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
				statement();
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

	public static class CommandStatementContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(ScssParser.LPAREN, 0); }
		public CommandStatementContext commandStatement() {
			return getRuleContext(CommandStatementContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ScssParser.RPAREN, 0); }
		public MathStatementContext mathStatement() {
			return getRuleContext(MathStatementContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public CommandStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commandStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterCommandStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitCommandStatement(this);
		}
	}

	public final CommandStatementContext commandStatement() throws RecognitionException {
		CommandStatementContext _localctx = new CommandStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_commandStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NULL:
			case InterpolationStart:
			case DOLLAR:
			case UrlStart:
			case Identifier:
			case Var:
			case StringLiteral:
			case Number:
			case Color:
				{
				setState(210); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(209);
					expression();
					}
					}
					setState(212); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NULL) | (1L << InterpolationStart) | (1L << DOLLAR) | (1L << UrlStart) | (1L << Identifier) | (1L << Var) | (1L << StringLiteral) | (1L << Number) | (1L << Color))) != 0) );
				}
				break;
			case LPAREN:
				{
				setState(214);
				match(LPAREN);
				setState(215);
				commandStatement();
				setState(216);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << TIMES) | (1L << DIV) | (1L << MINUS) | (1L << PERC))) != 0)) {
				{
				setState(220);
				mathStatement();
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

	public static class MathCharacterContext extends ParserRuleContext {
		public TerminalNode TIMES() { return getToken(ScssParser.TIMES, 0); }
		public TerminalNode PLUS() { return getToken(ScssParser.PLUS, 0); }
		public TerminalNode DIV() { return getToken(ScssParser.DIV, 0); }
		public TerminalNode MINUS() { return getToken(ScssParser.MINUS, 0); }
		public TerminalNode PERC() { return getToken(ScssParser.PERC, 0); }
		public MathCharacterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathCharacter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterMathCharacter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitMathCharacter(this);
		}
	}

	public final MathCharacterContext mathCharacter() throws RecognitionException {
		MathCharacterContext _localctx = new MathCharacterContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_mathCharacter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << TIMES) | (1L << DIV) | (1L << MINUS) | (1L << PERC))) != 0)) ) {
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

	public static class MathStatementContext extends ParserRuleContext {
		public MathCharacterContext mathCharacter() {
			return getRuleContext(MathCharacterContext.class,0);
		}
		public CommandStatementContext commandStatement() {
			return getRuleContext(CommandStatementContext.class,0);
		}
		public MathStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterMathStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitMathStatement(this);
		}
	}

	public final MathStatementContext mathStatement() throws RecognitionException {
		MathStatementContext _localctx = new MathStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_mathStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			mathCharacter();
			setState(226);
			commandStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public MeasurementContext measurement() {
			return getRuleContext(MeasurementContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode Color() { return getToken(ScssParser.Color, 0); }
		public TerminalNode StringLiteral() { return getToken(ScssParser.StringLiteral, 0); }
		public TerminalNode NULL() { return getToken(ScssParser.NULL, 0); }
		public UrlContext url() {
			return getRuleContext(UrlContext.class,0);
		}
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expression);
		try {
			setState(237);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(228);
				measurement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(229);
				identifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(230);
				var();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(231);
				match(Color);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(232);
				match(StringLiteral);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(233);
				match(NULL);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(234);
				url();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(235);
				variableName();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(236);
				functionCall();
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

	public static class IfDeclarationContext extends ParserRuleContext {
		public TerminalNode AT_IF() { return getToken(ScssParser.AT_IF, 0); }
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<ElseIfStatementContext> elseIfStatement() {
			return getRuleContexts(ElseIfStatementContext.class);
		}
		public ElseIfStatementContext elseIfStatement(int i) {
			return getRuleContext(ElseIfStatementContext.class,i);
		}
		public ElseStatementContext elseStatement() {
			return getRuleContext(ElseStatementContext.class,0);
		}
		public IfDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterIfDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitIfDeclaration(this);
		}
	}

	public final IfDeclarationContext ifDeclaration() throws RecognitionException {
		IfDeclarationContext _localctx = new IfDeclarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_ifDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(AT_IF);
			setState(240);
			conditions();
			setState(241);
			block();
			setState(245);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(242);
					elseIfStatement();
					}
					} 
				}
				setState(247);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT_ELSE) {
				{
				setState(248);
				elseStatement();
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

	public static class ElseIfStatementContext extends ParserRuleContext {
		public TerminalNode AT_ELSE() { return getToken(ScssParser.AT_ELSE, 0); }
		public TerminalNode IF() { return getToken(ScssParser.IF, 0); }
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElseIfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIfStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterElseIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitElseIfStatement(this);
		}
	}

	public final ElseIfStatementContext elseIfStatement() throws RecognitionException {
		ElseIfStatementContext _localctx = new ElseIfStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_elseIfStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(AT_ELSE);
			setState(252);
			match(IF);
			setState(253);
			conditions();
			setState(254);
			block();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode AT_ELSE() { return getToken(ScssParser.AT_ELSE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitElseStatement(this);
		}
	}

	public final ElseStatementContext elseStatement() throws RecognitionException {
		ElseStatementContext _localctx = new ElseStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_elseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(AT_ELSE);
			setState(257);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionsContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode COMBINE_COMPARE() { return getToken(ScssParser.COMBINE_COMPARE, 0); }
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
		public TerminalNode NULL() { return getToken(ScssParser.NULL, 0); }
		public ConditionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterConditions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitConditions(this);
		}
	}

	public final ConditionsContext conditions() throws RecognitionException {
		ConditionsContext _localctx = new ConditionsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_conditions);
		try {
			setState(265);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(259);
				condition();
				setState(262);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(260);
					match(COMBINE_COMPARE);
					setState(261);
					conditions();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(264);
				match(NULL);
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

	public static class ConditionContext extends ParserRuleContext {
		public CommandStatementContext commandStatement() {
			return getRuleContext(CommandStatementContext.class,0);
		}
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
		public TerminalNode EQEQ() { return getToken(ScssParser.EQEQ, 0); }
		public TerminalNode LT() { return getToken(ScssParser.LT, 0); }
		public TerminalNode GT() { return getToken(ScssParser.GT, 0); }
		public TerminalNode NOTEQ() { return getToken(ScssParser.NOTEQ, 0); }
		public TerminalNode LPAREN() { return getToken(ScssParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ScssParser.RPAREN, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_condition);
		int _la;
		try {
			setState(276);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(267);
				commandStatement();
				setState(270);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << EQEQ) | (1L << NOTEQ))) != 0)) {
					{
					setState(268);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << EQEQ) | (1L << NOTEQ))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(269);
					conditions();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(272);
				match(LPAREN);
				setState(273);
				conditions();
				setState(274);
				match(RPAREN);
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

	public static class VariableDeclarationContext extends ParserRuleContext {
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public TerminalNode COLON() { return getToken(ScssParser.COLON, 0); }
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ScssParser.SEMI, 0); }
		public TerminalNode POUND_DEFAULT() { return getToken(ScssParser.POUND_DEFAULT, 0); }
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitVariableDeclaration(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			variableName();
			setState(279);
			match(COLON);
			setState(280);
			values();
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==POUND_DEFAULT) {
				{
				setState(281);
				match(POUND_DEFAULT);
				}
			}

			setState(284);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForDeclarationContext extends ParserRuleContext {
		public TerminalNode AT_FOR() { return getToken(ScssParser.AT_FOR, 0); }
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public TerminalNode FROM() { return getToken(ScssParser.FROM, 0); }
		public FromNumberContext fromNumber() {
			return getRuleContext(FromNumberContext.class,0);
		}
		public TerminalNode THROUGH() { return getToken(ScssParser.THROUGH, 0); }
		public ThroughNumberContext throughNumber() {
			return getRuleContext(ThroughNumberContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterForDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitForDeclaration(this);
		}
	}

	public final ForDeclarationContext forDeclaration() throws RecognitionException {
		ForDeclarationContext _localctx = new ForDeclarationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_forDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(AT_FOR);
			setState(287);
			variableName();
			setState(288);
			match(FROM);
			setState(289);
			fromNumber();
			setState(290);
			match(THROUGH);
			setState(291);
			throughNumber();
			setState(292);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FromNumberContext extends ParserRuleContext {
		public TerminalNode Number() { return getToken(ScssParser.Number, 0); }
		public FromNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterFromNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitFromNumber(this);
		}
	}

	public final FromNumberContext fromNumber() throws RecognitionException {
		FromNumberContext _localctx = new FromNumberContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_fromNumber);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(Number);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ThroughNumberContext extends ParserRuleContext {
		public TerminalNode Number() { return getToken(ScssParser.Number, 0); }
		public ThroughNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throughNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterThroughNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitThroughNumber(this);
		}
	}

	public final ThroughNumberContext throughNumber() throws RecognitionException {
		ThroughNumberContext _localctx = new ThroughNumberContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_throughNumber);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(Number);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileDeclarationContext extends ParserRuleContext {
		public TerminalNode AT_WHILE() { return getToken(ScssParser.AT_WHILE, 0); }
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterWhileDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitWhileDeclaration(this);
		}
	}

	public final WhileDeclarationContext whileDeclaration() throws RecognitionException {
		WhileDeclarationContext _localctx = new WhileDeclarationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_whileDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(AT_WHILE);
			setState(299);
			conditions();
			setState(300);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EachDeclarationContext extends ParserRuleContext {
		public TerminalNode AT_EACH() { return getToken(ScssParser.AT_EACH, 0); }
		public List<VariableNameContext> variableName() {
			return getRuleContexts(VariableNameContext.class);
		}
		public VariableNameContext variableName(int i) {
			return getRuleContext(VariableNameContext.class,i);
		}
		public TerminalNode IN() { return getToken(ScssParser.IN, 0); }
		public EachValueListContext eachValueList() {
			return getRuleContext(EachValueListContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(ScssParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ScssParser.COMMA, i);
		}
		public EachDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eachDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterEachDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitEachDeclaration(this);
		}
	}

	public final EachDeclarationContext eachDeclaration() throws RecognitionException {
		EachDeclarationContext _localctx = new EachDeclarationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_eachDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			match(AT_EACH);
			setState(303);
			variableName();
			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(304);
				match(COMMA);
				setState(305);
				variableName();
				}
				}
				setState(310);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(311);
			match(IN);
			setState(312);
			eachValueList();
			setState(313);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EachValueListContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(ScssParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(ScssParser.Identifier, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ScssParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ScssParser.COMMA, i);
		}
		public List<IdentifierListOrMapContext> identifierListOrMap() {
			return getRuleContexts(IdentifierListOrMapContext.class);
		}
		public IdentifierListOrMapContext identifierListOrMap(int i) {
			return getRuleContext(IdentifierListOrMapContext.class,i);
		}
		public EachValueListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eachValueList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterEachValueList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitEachValueList(this);
		}
	}

	public final EachValueListContext eachValueList() throws RecognitionException {
		EachValueListContext _localctx = new EachValueListContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_eachValueList);
		int _la;
		try {
			setState(331);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(315);
				match(Identifier);
				setState(320);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(316);
					match(COMMA);
					setState(317);
					match(Identifier);
					}
					}
					setState(322);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(323);
				identifierListOrMap();
				setState(328);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(324);
					match(COMMA);
					setState(325);
					identifierListOrMap();
					}
					}
					setState(330);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class IdentifierListOrMapContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(ScssParser.LPAREN, 0); }
		public List<IdentifierValueContext> identifierValue() {
			return getRuleContexts(IdentifierValueContext.class);
		}
		public IdentifierValueContext identifierValue(int i) {
			return getRuleContext(IdentifierValueContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(ScssParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ScssParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ScssParser.COMMA, i);
		}
		public IdentifierListOrMapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierListOrMap; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterIdentifierListOrMap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitIdentifierListOrMap(this);
		}
	}

	public final IdentifierListOrMapContext identifierListOrMap() throws RecognitionException {
		IdentifierListOrMapContext _localctx = new IdentifierListOrMapContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_identifierListOrMap);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			match(LPAREN);
			setState(334);
			identifierValue();
			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(335);
				match(COMMA);
				setState(336);
				identifierValue();
				}
				}
				setState(341);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(342);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierValueContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(ScssParser.COLON, 0); }
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public IdentifierValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterIdentifierValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitIdentifierValue(this);
		}
	}

	public final IdentifierValueContext identifierValue() throws RecognitionException {
		IdentifierValueContext _localctx = new IdentifierValueContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_identifierValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			identifier();
			setState(347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(345);
				match(COLON);
				setState(346);
				values();
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

	public static class ImportDeclarationContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(ScssParser.IMPORT, 0); }
		public ReferenceUrlContext referenceUrl() {
			return getRuleContext(ReferenceUrlContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ScssParser.SEMI, 0); }
		public MediaTypesContext mediaTypes() {
			return getRuleContext(MediaTypesContext.class,0);
		}
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitImportDeclaration(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_importDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			match(IMPORT);
			setState(350);
			referenceUrl();
			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(351);
				mediaTypes();
				}
			}

			setState(354);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReferenceUrlContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(ScssParser.StringLiteral, 0); }
		public TerminalNode UrlStart() { return getToken(ScssParser.UrlStart, 0); }
		public TerminalNode Url() { return getToken(ScssParser.Url, 0); }
		public TerminalNode UrlEnd() { return getToken(ScssParser.UrlEnd, 0); }
		public ReferenceUrlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referenceUrl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterReferenceUrl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitReferenceUrl(this);
		}
	}

	public final ReferenceUrlContext referenceUrl() throws RecognitionException {
		ReferenceUrlContext _localctx = new ReferenceUrlContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_referenceUrl);
		try {
			setState(360);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StringLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(356);
				match(StringLiteral);
				}
				break;
			case UrlStart:
				enterOuterAlt(_localctx, 2);
				{
				setState(357);
				match(UrlStart);
				setState(358);
				match(Url);
				setState(359);
				match(UrlEnd);
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

	public static class MediaTypesContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(ScssParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(ScssParser.Identifier, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ScssParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ScssParser.COMMA, i);
		}
		public MediaTypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mediaTypes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterMediaTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitMediaTypes(this);
		}
	}

	public final MediaTypesContext mediaTypes() throws RecognitionException {
		MediaTypesContext _localctx = new MediaTypesContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_mediaTypes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(362);
			match(Identifier);
			setState(367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(363);
				match(COMMA);
				setState(364);
				match(Identifier);
				}
				}
				setState(369);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class NestedContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(ScssParser.AT, 0); }
		public NestContext nest() {
			return getRuleContext(NestContext.class,0);
		}
		public SelectorsContext selectors() {
			return getRuleContext(SelectorsContext.class,0);
		}
		public TerminalNode BlockStart() { return getToken(ScssParser.BlockStart, 0); }
		public StylesheetContext stylesheet() {
			return getRuleContext(StylesheetContext.class,0);
		}
		public TerminalNode BlockEnd() { return getToken(ScssParser.BlockEnd, 0); }
		public NestedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nested; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterNested(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitNested(this);
		}
	}

	public final NestedContext nested() throws RecognitionException {
		NestedContext _localctx = new NestedContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_nested);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			match(AT);
			setState(371);
			nest();
			setState(372);
			selectors();
			setState(373);
			match(BlockStart);
			setState(374);
			stylesheet();
			setState(375);
			match(BlockEnd);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NestContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(ScssParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(ScssParser.Identifier, i);
		}
		public TerminalNode AND() { return getToken(ScssParser.AND, 0); }
		public List<PseudoContext> pseudo() {
			return getRuleContexts(PseudoContext.class);
		}
		public PseudoContext pseudo(int i) {
			return getRuleContext(PseudoContext.class,i);
		}
		public NestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterNest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitNest(this);
		}
	}

	public final NestContext nest() throws RecognitionException {
		NestContext _localctx = new NestContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_nest);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			_la = _input.LA(1);
			if ( !(_la==AND || _la==Identifier) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(381);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(378);
					match(Identifier);
					}
					} 
				}
				setState(383);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			}
			setState(387);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COLON || _la==COLONCOLON) {
				{
				{
				setState(384);
				pseudo();
				}
				}
				setState(389);
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

	public static class RulesetContext extends ParserRuleContext {
		public SelectorsContext selectors() {
			return getRuleContext(SelectorsContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public RulesetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleset; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterRuleset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitRuleset(this);
		}
	}

	public final RulesetContext ruleset() throws RecognitionException {
		RulesetContext _localctx = new RulesetContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_ruleset);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			selectors();
			setState(391);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode BlockStart() { return getToken(ScssParser.BlockStart, 0); }
		public TerminalNode BlockEnd() { return getToken(ScssParser.BlockEnd, 0); }
		public List<PropertyContext> property() {
			return getRuleContexts(PropertyContext.class);
		}
		public PropertyContext property(int i) {
			return getRuleContext(PropertyContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(ScssParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(ScssParser.SEMI, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_block);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			match(BlockStart);
			setState(400);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(398);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
					case 1:
						{
						setState(394);
						property();
						setState(395);
						match(SEMI);
						}
						break;
					case 2:
						{
						setState(397);
						statement();
						}
						break;
					}
					} 
				}
				setState(402);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			}
			setState(404);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << InterpolationStart) | (1L << Identifier) | (1L << Variable))) != 0)) {
				{
				setState(403);
				property();
				}
			}

			setState(406);
			match(BlockEnd);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectorsContext extends ParserRuleContext {
		public List<SelectorContext> selector() {
			return getRuleContexts(SelectorContext.class);
		}
		public SelectorContext selector(int i) {
			return getRuleContext(SelectorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ScssParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ScssParser.COMMA, i);
		}
		public SelectorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectors; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterSelectors(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitSelectors(this);
		}
	}

	public final SelectorsContext selectors() throws RecognitionException {
		SelectorsContext _localctx = new SelectorsContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_selectors);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			selector();
			setState(413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(409);
				match(COMMA);
				setState(410);
				selector();
				}
				}
				setState(415);
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

	public static class SelectorContext extends ParserRuleContext {
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public List<SelectorPrefixContext> selectorPrefix() {
			return getRuleContexts(SelectorPrefixContext.class);
		}
		public SelectorPrefixContext selectorPrefix(int i) {
			return getRuleContext(SelectorPrefixContext.class,i);
		}
		public List<AttribContext> attrib() {
			return getRuleContexts(AttribContext.class);
		}
		public AttribContext attrib(int i) {
			return getRuleContext(AttribContext.class,i);
		}
		public List<PseudoContext> pseudo() {
			return getRuleContexts(PseudoContext.class);
		}
		public PseudoContext pseudo(int i) {
			return getRuleContext(PseudoContext.class,i);
		}
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitSelector(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_selector);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(417); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(416);
				element();
				}
				}
				setState(419); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << InterpolationStart) | (1L << DOT) | (1L << AND) | (1L << HASH) | (1L << TIMES) | (1L << Identifier))) != 0) );
			setState(426);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << TIL) | (1L << PLUS))) != 0)) {
				{
				{
				setState(421);
				selectorPrefix();
				setState(422);
				element();
				}
				}
				setState(428);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(432);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(429);
				attrib();
				}
				}
				setState(434);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(438);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(435);
					pseudo();
					}
					} 
				}
				setState(440);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
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

	public static class SelectorPrefixContext extends ParserRuleContext {
		public TerminalNode GT() { return getToken(ScssParser.GT, 0); }
		public TerminalNode PLUS() { return getToken(ScssParser.PLUS, 0); }
		public TerminalNode TIL() { return getToken(ScssParser.TIL, 0); }
		public SelectorPrefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectorPrefix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterSelectorPrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitSelectorPrefix(this);
		}
	}

	public final SelectorPrefixContext selectorPrefix() throws RecognitionException {
		SelectorPrefixContext _localctx = new SelectorPrefixContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_selectorPrefix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << TIL) | (1L << PLUS))) != 0)) ) {
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

	public static class ElementContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode HASH() { return getToken(ScssParser.HASH, 0); }
		public TerminalNode DOT() { return getToken(ScssParser.DOT, 0); }
		public TerminalNode AND() { return getToken(ScssParser.AND, 0); }
		public TerminalNode TIMES() { return getToken(ScssParser.TIMES, 0); }
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitElement(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_element);
		try {
			setState(450);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case InterpolationStart:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(443);
				identifier();
				}
				break;
			case HASH:
				enterOuterAlt(_localctx, 2);
				{
				setState(444);
				match(HASH);
				setState(445);
				identifier();
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 3);
				{
				setState(446);
				match(DOT);
				setState(447);
				identifier();
				}
				break;
			case AND:
				enterOuterAlt(_localctx, 4);
				{
				setState(448);
				match(AND);
				}
				break;
			case TIMES:
				enterOuterAlt(_localctx, 5);
				{
				setState(449);
				match(TIMES);
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

	public static class PseudoContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ScssParser.Identifier, 0); }
		public TerminalNode COLON() { return getToken(ScssParser.COLON, 0); }
		public TerminalNode COLONCOLON() { return getToken(ScssParser.COLONCOLON, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public PseudoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pseudo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterPseudo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitPseudo(this);
		}
	}

	public final PseudoContext pseudo() throws RecognitionException {
		PseudoContext _localctx = new PseudoContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_pseudo);
		int _la;
		try {
			setState(456);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(452);
				_la = _input.LA(1);
				if ( !(_la==COLON || _la==COLONCOLON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(453);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(454);
				_la = _input.LA(1);
				if ( !(_la==COLON || _la==COLONCOLON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(455);
				functionCall();
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

	public static class AttribContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(ScssParser.LBRACK, 0); }
		public List<TerminalNode> Identifier() { return getTokens(ScssParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(ScssParser.Identifier, i);
		}
		public TerminalNode RBRACK() { return getToken(ScssParser.RBRACK, 0); }
		public AttribRelateContext attribRelate() {
			return getRuleContext(AttribRelateContext.class,0);
		}
		public TerminalNode StringLiteral() { return getToken(ScssParser.StringLiteral, 0); }
		public AttribContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attrib; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterAttrib(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitAttrib(this);
		}
	}

	public final AttribContext attrib() throws RecognitionException {
		AttribContext _localctx = new AttribContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_attrib);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			match(LBRACK);
			setState(459);
			match(Identifier);
			setState(463);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << PIPE_EQ) | (1L << TILD_EQ))) != 0)) {
				{
				setState(460);
				attribRelate();
				setState(461);
				_la = _input.LA(1);
				if ( !(_la==Identifier || _la==StringLiteral) ) {
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
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttribRelateContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(ScssParser.EQ, 0); }
		public TerminalNode TILD_EQ() { return getToken(ScssParser.TILD_EQ, 0); }
		public TerminalNode PIPE_EQ() { return getToken(ScssParser.PIPE_EQ, 0); }
		public AttribRelateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribRelate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterAttribRelate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitAttribRelate(this);
		}
	}

	public final AttribRelateContext attribRelate() throws RecognitionException {
		AttribRelateContext _localctx = new AttribRelateContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_attribRelate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << PIPE_EQ) | (1L << TILD_EQ))) != 0)) ) {
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ScssParser.Identifier, 0); }
		public List<IdentifierPartContext> identifierPart() {
			return getRuleContexts(IdentifierPartContext.class);
		}
		public IdentifierPartContext identifierPart(int i) {
			return getRuleContext(IdentifierPartContext.class,i);
		}
		public TerminalNode InterpolationStart() { return getToken(ScssParser.InterpolationStart, 0); }
		public IdentifierVariableNameContext identifierVariableName() {
			return getRuleContext(IdentifierVariableNameContext.class,0);
		}
		public TerminalNode BlockEnd() { return getToken(ScssParser.BlockEnd, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_identifier);
		int _la;
		try {
			setState(485);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(469);
				match(Identifier);
				setState(473);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==InterpolationStartAfter || _la==IdentifierAfter) {
					{
					{
					setState(470);
					identifierPart();
					}
					}
					setState(475);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case InterpolationStart:
				enterOuterAlt(_localctx, 2);
				{
				setState(476);
				match(InterpolationStart);
				setState(477);
				identifierVariableName();
				setState(478);
				match(BlockEnd);
				setState(482);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==InterpolationStartAfter || _la==IdentifierAfter) {
					{
					{
					setState(479);
					identifierPart();
					}
					}
					setState(484);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class IdentifierPartContext extends ParserRuleContext {
		public TerminalNode InterpolationStartAfter() { return getToken(ScssParser.InterpolationStartAfter, 0); }
		public IdentifierVariableNameContext identifierVariableName() {
			return getRuleContext(IdentifierVariableNameContext.class,0);
		}
		public TerminalNode BlockEnd() { return getToken(ScssParser.BlockEnd, 0); }
		public TerminalNode IdentifierAfter() { return getToken(ScssParser.IdentifierAfter, 0); }
		public IdentifierPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterIdentifierPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitIdentifierPart(this);
		}
	}

	public final IdentifierPartContext identifierPart() throws RecognitionException {
		IdentifierPartContext _localctx = new IdentifierPartContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_identifierPart);
		try {
			setState(492);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case InterpolationStartAfter:
				enterOuterAlt(_localctx, 1);
				{
				setState(487);
				match(InterpolationStartAfter);
				setState(488);
				identifierVariableName();
				setState(489);
				match(BlockEnd);
				}
				break;
			case IdentifierAfter:
				enterOuterAlt(_localctx, 2);
				{
				setState(491);
				match(IdentifierAfter);
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

	public static class IdentifierVariableNameContext extends ParserRuleContext {
		public TerminalNode DOLLAR() { return getToken(ScssParser.DOLLAR, 0); }
		public TerminalNode Identifier() { return getToken(ScssParser.Identifier, 0); }
		public TerminalNode IdentifierAfter() { return getToken(ScssParser.IdentifierAfter, 0); }
		public IdentifierVariableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierVariableName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterIdentifierVariableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitIdentifierVariableName(this);
		}
	}

	public final IdentifierVariableNameContext identifierVariableName() throws RecognitionException {
		IdentifierVariableNameContext _localctx = new IdentifierVariableNameContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_identifierVariableName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
			match(DOLLAR);
			setState(495);
			_la = _input.LA(1);
			if ( !(_la==Identifier || _la==IdentifierAfter) ) {
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

	public static class PropertyContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(ScssParser.COLON, 0); }
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public TerminalNode Variable() { return getToken(ScssParser.Variable, 0); }
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitProperty(this);
		}
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_property);
		try {
			setState(504);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case InterpolationStart:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(497);
				identifier();
				setState(498);
				match(COLON);
				setState(499);
				values();
				}
				break;
			case Variable:
				enterOuterAlt(_localctx, 2);
				{
				setState(501);
				match(Variable);
				setState(502);
				match(COLON);
				setState(503);
				values();
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

	public static class VarContext extends ParserRuleContext {
		public TerminalNode Var() { return getToken(ScssParser.Var, 0); }
		public TerminalNode Variable() { return getToken(ScssParser.Variable, 0); }
		public TerminalNode RPAREN() { return getToken(ScssParser.RPAREN, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitVar(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(506);
			match(Var);
			setState(507);
			match(Variable);
			setState(508);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValuesContext extends ParserRuleContext {
		public List<CommandStatementContext> commandStatement() {
			return getRuleContexts(CommandStatementContext.class);
		}
		public CommandStatementContext commandStatement(int i) {
			return getRuleContext(CommandStatementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ScssParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ScssParser.COMMA, i);
		}
		public ValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitValues(this);
		}
	}

	public final ValuesContext values() throws RecognitionException {
		ValuesContext _localctx = new ValuesContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_values);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
			commandStatement();
			setState(515);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(511);
					match(COMMA);
					setState(512);
					commandStatement();
					}
					} 
				}
				setState(517);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
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

	public static class UrlContext extends ParserRuleContext {
		public TerminalNode UrlStart() { return getToken(ScssParser.UrlStart, 0); }
		public TerminalNode Url() { return getToken(ScssParser.Url, 0); }
		public TerminalNode UrlEnd() { return getToken(ScssParser.UrlEnd, 0); }
		public UrlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_url; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterUrl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitUrl(this);
		}
	}

	public final UrlContext url() throws RecognitionException {
		UrlContext _localctx = new UrlContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_url);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
			match(UrlStart);
			setState(519);
			match(Url);
			setState(520);
			match(UrlEnd);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MeasurementContext extends ParserRuleContext {
		public TerminalNode Number() { return getToken(ScssParser.Number, 0); }
		public TerminalNode Unit() { return getToken(ScssParser.Unit, 0); }
		public MeasurementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_measurement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterMeasurement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitMeasurement(this);
		}
	}

	public final MeasurementContext measurement() throws RecognitionException {
		MeasurementContext _localctx = new MeasurementContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_measurement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			match(Number);
			setState(524);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Unit) {
				{
				setState(523);
				match(Unit);
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

	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ScssParser.Identifier, 0); }
		public TerminalNode LPAREN() { return getToken(ScssParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ScssParser.RPAREN, 0); }
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitFunctionCall(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			match(Identifier);
			setState(527);
			match(LPAREN);
			setState(529);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NULL) | (1L << InterpolationStart) | (1L << LPAREN) | (1L << DOLLAR) | (1L << UrlStart) | (1L << Identifier) | (1L << Var) | (1L << StringLiteral) | (1L << Number) | (1L << Color))) != 0)) {
				{
				setState(528);
				values();
				}
			}

			setState(531);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3A\u0218\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\3\2\7\2n\n\2\f\2\16\2q\13\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3~\n\3\3\4\3\4\3\4\7\4\u0083\n\4\f\4\16\4"+
		"\u0086\13\4\3\4\5\4\u0089\n\4\3\5\3\5\5\5\u008d\n\5\3\6\3\6\3\6\3\7\3"+
		"\7\6\7\u0094\n\7\r\7\16\7\u0095\3\b\3\b\3\b\3\b\5\b\u009c\n\b\3\b\5\b"+
		"\u009f\n\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\5\t\u00a8\n\t\3\t\3\t\5\t\u00ac"+
		"\n\t\5\t\u00ae\n\t\3\t\5\t\u00b1\n\t\5\t\u00b3\n\t\3\n\3\n\3\n\3\n\5\n"+
		"\u00b9\n\n\3\n\3\n\3\n\5\n\u00be\n\n\3\n\3\n\3\13\7\13\u00c3\n\13\f\13"+
		"\16\13\u00c6\13\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\5\r\u00d2"+
		"\n\r\3\16\6\16\u00d5\n\16\r\16\16\16\u00d6\3\16\3\16\3\16\3\16\5\16\u00dd"+
		"\n\16\3\16\5\16\u00e0\n\16\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\5\21\u00f0\n\21\3\22\3\22\3\22\3\22\7\22\u00f6"+
		"\n\22\f\22\16\22\u00f9\13\22\3\22\5\22\u00fc\n\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\25\3\25\3\25\5\25\u0109\n\25\3\25\5\25\u010c\n"+
		"\25\3\26\3\26\3\26\5\26\u0111\n\26\3\26\3\26\3\26\3\26\5\26\u0117\n\26"+
		"\3\27\3\27\3\27\3\27\5\27\u011d\n\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34"+
		"\3\34\7\34\u0135\n\34\f\34\16\34\u0138\13\34\3\34\3\34\3\34\3\34\3\35"+
		"\3\35\3\35\7\35\u0141\n\35\f\35\16\35\u0144\13\35\3\35\3\35\3\35\7\35"+
		"\u0149\n\35\f\35\16\35\u014c\13\35\5\35\u014e\n\35\3\36\3\36\3\36\3\36"+
		"\7\36\u0154\n\36\f\36\16\36\u0157\13\36\3\36\3\36\3\37\3\37\3\37\5\37"+
		"\u015e\n\37\3 \3 \3 \5 \u0163\n \3 \3 \3!\3!\3!\3!\5!\u016b\n!\3\"\3\""+
		"\3\"\7\"\u0170\n\"\f\"\16\"\u0173\13\"\3#\3#\3#\3#\3#\3#\3#\3$\3$\7$\u017e"+
		"\n$\f$\16$\u0181\13$\3$\7$\u0184\n$\f$\16$\u0187\13$\3%\3%\3%\3&\3&\3"+
		"&\3&\3&\7&\u0191\n&\f&\16&\u0194\13&\3&\5&\u0197\n&\3&\3&\3\'\3\'\3\'"+
		"\7\'\u019e\n\'\f\'\16\'\u01a1\13\'\3(\6(\u01a4\n(\r(\16(\u01a5\3(\3(\3"+
		"(\7(\u01ab\n(\f(\16(\u01ae\13(\3(\7(\u01b1\n(\f(\16(\u01b4\13(\3(\7(\u01b7"+
		"\n(\f(\16(\u01ba\13(\3)\3)\3*\3*\3*\3*\3*\3*\3*\5*\u01c5\n*\3+\3+\3+\3"+
		"+\5+\u01cb\n+\3,\3,\3,\3,\3,\5,\u01d2\n,\3,\3,\3-\3-\3.\3.\7.\u01da\n"+
		".\f.\16.\u01dd\13.\3.\3.\3.\3.\7.\u01e3\n.\f.\16.\u01e6\13.\5.\u01e8\n"+
		".\3/\3/\3/\3/\3/\5/\u01ef\n/\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3"+
		"\61\3\61\5\61\u01fb\n\61\3\62\3\62\3\62\3\62\3\63\3\63\3\63\7\63\u0204"+
		"\n\63\f\63\16\63\u0207\13\63\3\64\3\64\3\64\3\64\3\65\3\65\5\65\u020f"+
		"\n\65\3\66\3\66\3\66\5\66\u0214\n\66\3\66\3\66\3\66\3\u01b8\2\67\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRT"+
		"VXZ\\^`bdfhj\2\n\3\2\33\37\5\2\17\17\21\21!\"\4\2\30\30\64\64\4\2\17\20"+
		"\33\33\4\2\22\22\32\32\4\2\64\64\67\67\3\2#%\4\2\64\64AA\2\u022f\2o\3"+
		"\2\2\2\4}\3\2\2\2\6\177\3\2\2\2\b\u008a\3\2\2\2\n\u008e\3\2\2\2\f\u0091"+
		"\3\2\2\2\16\u0097\3\2\2\2\20\u00a2\3\2\2\2\22\u00b4\3\2\2\2\24\u00c4\3"+
		"\2\2\2\26\u00c9\3\2\2\2\30\u00d1\3\2\2\2\32\u00dc\3\2\2\2\34\u00e1\3\2"+
		"\2\2\36\u00e3\3\2\2\2 \u00ef\3\2\2\2\"\u00f1\3\2\2\2$\u00fd\3\2\2\2&\u0102"+
		"\3\2\2\2(\u010b\3\2\2\2*\u0116\3\2\2\2,\u0118\3\2\2\2.\u0120\3\2\2\2\60"+
		"\u0128\3\2\2\2\62\u012a\3\2\2\2\64\u012c\3\2\2\2\66\u0130\3\2\2\28\u014d"+
		"\3\2\2\2:\u014f\3\2\2\2<\u015a\3\2\2\2>\u015f\3\2\2\2@\u016a\3\2\2\2B"+
		"\u016c\3\2\2\2D\u0174\3\2\2\2F\u017b\3\2\2\2H\u0188\3\2\2\2J\u018b\3\2"+
		"\2\2L\u019a\3\2\2\2N\u01a3\3\2\2\2P\u01bb\3\2\2\2R\u01c4\3\2\2\2T\u01ca"+
		"\3\2\2\2V\u01cc\3\2\2\2X\u01d5\3\2\2\2Z\u01e7\3\2\2\2\\\u01ee\3\2\2\2"+
		"^\u01f0\3\2\2\2`\u01fa\3\2\2\2b\u01fc\3\2\2\2d\u0200\3\2\2\2f\u0208\3"+
		"\2\2\2h\u020c\3\2\2\2j\u0210\3\2\2\2ln\5\4\3\2ml\3\2\2\2nq\3\2\2\2om\3"+
		"\2\2\2op\3\2\2\2p\3\3\2\2\2qo\3\2\2\2r~\5> \2s~\5D#\2t~\5H%\2u~\5\16\b"+
		"\2v~\5\22\n\2w~\5,\27\2x~\5\20\t\2y~\5\"\22\2z~\5.\30\2{~\5\64\33\2|~"+
		"\5\66\34\2}r\3\2\2\2}s\3\2\2\2}t\3\2\2\2}u\3\2\2\2}v\3\2\2\2}w\3\2\2\2"+
		"}x\3\2\2\2}y\3\2\2\2}z\3\2\2\2}{\3\2\2\2}|\3\2\2\2~\5\3\2\2\2\177\u0084"+
		"\5\b\5\2\u0080\u0081\7\24\2\2\u0081\u0083\5\b\5\2\u0082\u0080\3\2\2\2"+
		"\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0088"+
		"\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u0089\7\7\2\2\u0088\u0087\3\2\2\2\u0088"+
		"\u0089\3\2\2\2\u0089\7\3\2\2\2\u008a\u008c\5\n\6\2\u008b\u008d\5\f\7\2"+
		"\u008c\u008b\3\2\2\2\u008c\u008d\3\2\2\2\u008d\t\3\2\2\2\u008e\u008f\7"+
		"\26\2\2\u008f\u0090\7\64\2\2\u0090\13\3\2\2\2\u0091\u0093\7\22\2\2\u0092"+
		"\u0094\5 \21\2\u0093\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0093\3\2"+
		"\2\2\u0095\u0096\3\2\2\2\u0096\r\3\2\2\2\u0097\u0098\7&\2\2\u0098\u009e"+
		"\7\64\2\2\u0099\u009b\7\t\2\2\u009a\u009c\5\6\4\2\u009b\u009a\3\2\2\2"+
		"\u009b\u009c\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009f\7\n\2\2\u009e\u0099"+
		"\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\5J&\2\u00a1"+
		"\17\3\2\2\2\u00a2\u00a3\7.\2\2\u00a3\u00b2\7\64\2\2\u00a4\u00b3\7\23\2"+
		"\2\u00a5\u00a7\7\t\2\2\u00a6\u00a8\5d\63\2\u00a7\u00a6\3\2\2\2\u00a7\u00a8"+
		"\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ab\7\n\2\2\u00aa\u00ac\7\23\2\2"+
		"\u00ab\u00aa\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ae\3\2\2\2\u00ad\u00a5"+
		"\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00b0\3\2\2\2\u00af\u00b1\5J&\2\u00b0"+
		"\u00af\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b3\3\2\2\2\u00b2\u00a4\3\2"+
		"\2\2\u00b2\u00ad\3\2\2\2\u00b3\21\3\2\2\2\u00b4\u00b5\7\'\2\2\u00b5\u00b6"+
		"\7\64\2\2\u00b6\u00b8\7\t\2\2\u00b7\u00b9\5\6\4\2\u00b8\u00b7\3\2\2\2"+
		"\u00b8\u00b9\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\7\n\2\2\u00bb\u00bd"+
		"\7\13\2\2\u00bc\u00be\5\24\13\2\u00bd\u00bc\3\2\2\2\u00bd\u00be\3\2\2"+
		"\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\7\f\2\2\u00c0\23\3\2\2\2\u00c1\u00c3"+
		"\5\30\r\2\u00c2\u00c1\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2"+
		"\u00c4\u00c5\3\2\2\2\u00c5\u00c7\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00c8"+
		"\5\26\f\2\u00c8\25\3\2\2\2\u00c9\u00ca\7\60\2\2\u00ca\u00cb\5\32\16\2"+
		"\u00cb\u00cc\7\23\2\2\u00cc\27\3\2\2\2\u00cd\u00ce\5\32\16\2\u00ce\u00cf"+
		"\7\23\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00d2\5\4\3\2\u00d1\u00cd\3\2\2\2"+
		"\u00d1\u00d0\3\2\2\2\u00d2\31\3\2\2\2\u00d3\u00d5\5 \21\2\u00d4\u00d3"+
		"\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7"+
		"\u00dd\3\2\2\2\u00d8\u00d9\7\t\2\2\u00d9\u00da\5\32\16\2\u00da\u00db\7"+
		"\n\2\2\u00db\u00dd\3\2\2\2\u00dc\u00d4\3\2\2\2\u00dc\u00d8\3\2\2\2\u00dd"+
		"\u00df\3\2\2\2\u00de\u00e0\5\36\20\2\u00df\u00de\3\2\2\2\u00df\u00e0\3"+
		"\2\2\2\u00e0\33\3\2\2\2\u00e1\u00e2\t\2\2\2\u00e2\35\3\2\2\2\u00e3\u00e4"+
		"\5\34\17\2\u00e4\u00e5\5\32\16\2\u00e5\37\3\2\2\2\u00e6\u00f0\5h\65\2"+
		"\u00e7\u00f0\5Z.\2\u00e8\u00f0\5b\62\2\u00e9\u00f0\79\2\2\u00ea\u00f0"+
		"\7\67\2\2\u00eb\u00f0\7\3\2\2\u00ec\u00f0\5f\64\2\u00ed\u00f0\5\n\6\2"+
		"\u00ee\u00f0\5j\66\2\u00ef\u00e6\3\2\2\2\u00ef\u00e7\3\2\2\2\u00ef\u00e8"+
		"\3\2\2\2\u00ef\u00e9\3\2\2\2\u00ef\u00ea\3\2\2\2\u00ef\u00eb\3\2\2\2\u00ef"+
		"\u00ec\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00ee\3\2\2\2\u00f0!\3\2\2\2"+
		"\u00f1\u00f2\7*\2\2\u00f2\u00f3\5(\25\2\u00f3\u00f7\5J&\2\u00f4\u00f6"+
		"\5$\23\2\u00f5\u00f4\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7"+
		"\u00f8\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00fc\5&"+
		"\24\2\u00fb\u00fa\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc#\3\2\2\2\u00fd\u00fe"+
		"\7(\2\2\u00fe\u00ff\7)\2\2\u00ff\u0100\5(\25\2\u0100\u0101\5J&\2\u0101"+
		"%\3\2\2\2\u0102\u0103\7(\2\2\u0103\u0104\5J&\2\u0104\'\3\2\2\2\u0105\u0108"+
		"\5*\26\2\u0106\u0107\7\6\2\2\u0107\u0109\5(\25\2\u0108\u0106\3\2\2\2\u0108"+
		"\u0109\3\2\2\2\u0109\u010c\3\2\2\2\u010a\u010c\7\3\2\2\u010b\u0105\3\2"+
		"\2\2\u010b\u010a\3\2\2\2\u010c)\3\2\2\2\u010d\u0110\5\32\16\2\u010e\u010f"+
		"\t\3\2\2\u010f\u0111\5(\25\2\u0110\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111"+
		"\u0117\3\2\2\2\u0112\u0113\7\t\2\2\u0113\u0114\5(\25\2\u0114\u0115\7\n"+
		"\2\2\u0115\u0117\3\2\2\2\u0116\u010d\3\2\2\2\u0116\u0112\3\2\2\2\u0117"+
		"+\3\2\2\2\u0118\u0119\5\n\6\2\u0119\u011a\7\22\2\2\u011a\u011c\5d\63\2"+
		"\u011b\u011d\7\63\2\2\u011c\u011b\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011e"+
		"\3\2\2\2\u011e\u011f\7\23\2\2\u011f-\3\2\2\2\u0120\u0121\7+\2\2\u0121"+
		"\u0122\5\n\6\2\u0122\u0123\7\61\2\2\u0123\u0124\5\60\31\2\u0124\u0125"+
		"\7\62\2\2\u0125\u0126\5\62\32\2\u0126\u0127\5J&\2\u0127/\3\2\2\2\u0128"+
		"\u0129\78\2\2\u0129\61\3\2\2\2\u012a\u012b\78\2\2\u012b\63\3\2\2\2\u012c"+
		"\u012d\7,\2\2\u012d\u012e\5(\25\2\u012e\u012f\5J&\2\u012f\65\3\2\2\2\u0130"+
		"\u0131\7-\2\2\u0131\u0136\5\n\6\2\u0132\u0133\7\24\2\2\u0133\u0135\5\n"+
		"\6\2\u0134\u0132\3\2\2\2\u0135\u0138\3\2\2\2\u0136\u0134\3\2\2\2\u0136"+
		"\u0137\3\2\2\2\u0137\u0139\3\2\2\2\u0138\u0136\3\2\2\2\u0139\u013a\7\4"+
		"\2\2\u013a\u013b\58\35\2\u013b\u013c\5J&\2\u013c\67\3\2\2\2\u013d\u0142"+
		"\7\64\2\2\u013e\u013f\7\24\2\2\u013f\u0141\7\64\2\2\u0140\u013e\3\2\2"+
		"\2\u0141\u0144\3\2\2\2\u0142\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u014e"+
		"\3\2\2\2\u0144\u0142\3\2\2\2\u0145\u014a\5:\36\2\u0146\u0147\7\24\2\2"+
		"\u0147\u0149\5:\36\2\u0148\u0146\3\2\2\2\u0149\u014c\3\2\2\2\u014a\u0148"+
		"\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014e\3\2\2\2\u014c\u014a\3\2\2\2\u014d"+
		"\u013d\3\2\2\2\u014d\u0145\3\2\2\2\u014e9\3\2\2\2\u014f\u0150\7\t\2\2"+
		"\u0150\u0155\5<\37\2\u0151\u0152\7\24\2\2\u0152\u0154\5<\37\2\u0153\u0151"+
		"\3\2\2\2\u0154\u0157\3\2\2\2\u0155\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156"+
		"\u0158\3\2\2\2\u0157\u0155\3\2\2\2\u0158\u0159\7\n\2\2\u0159;\3\2\2\2"+
		"\u015a\u015d\5Z.\2\u015b\u015c\7\22\2\2\u015c\u015e\5d\63\2\u015d\u015b"+
		"\3\2\2\2\u015d\u015e\3\2\2\2\u015e=\3\2\2\2\u015f\u0160\7/\2\2\u0160\u0162"+
		"\5@!\2\u0161\u0163\5B\"\2\u0162\u0161\3\2\2\2\u0162\u0163\3\2\2\2\u0163"+
		"\u0164\3\2\2\2\u0164\u0165\7\23\2\2\u0165?\3\2\2\2\u0166\u016b\7\67\2"+
		"\2\u0167\u0168\7 \2\2\u0168\u0169\7>\2\2\u0169\u016b\7=\2\2\u016a\u0166"+
		"\3\2\2\2\u016a\u0167\3\2\2\2\u016bA\3\2\2\2\u016c\u0171\7\64\2\2\u016d"+
		"\u016e\7\24\2\2\u016e\u0170\7\64\2\2\u016f\u016d\3\2\2\2\u0170\u0173\3"+
		"\2\2\2\u0171\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172C\3\2\2\2\u0173\u0171"+
		"\3\2\2\2\u0174\u0175\7\27\2\2\u0175\u0176\5F$\2\u0176\u0177\5L\'\2\u0177"+
		"\u0178\7\13\2\2\u0178\u0179\5\2\2\2\u0179\u017a\7\f\2\2\u017aE\3\2\2\2"+
		"\u017b\u017f\t\4\2\2\u017c\u017e\7\64\2\2\u017d\u017c\3\2\2\2\u017e\u0181"+
		"\3\2\2\2\u017f\u017d\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0185\3\2\2\2\u0181"+
		"\u017f\3\2\2\2\u0182\u0184\5T+\2\u0183\u0182\3\2\2\2\u0184\u0187\3\2\2"+
		"\2\u0185\u0183\3\2\2\2\u0185\u0186\3\2\2\2\u0186G\3\2\2\2\u0187\u0185"+
		"\3\2\2\2\u0188\u0189\5L\'\2\u0189\u018a\5J&\2\u018aI\3\2\2\2\u018b\u0192"+
		"\7\13\2\2\u018c\u018d\5`\61\2\u018d\u018e\7\23\2\2\u018e\u0191\3\2\2\2"+
		"\u018f\u0191\5\4\3\2\u0190\u018c\3\2\2\2\u0190\u018f\3\2\2\2\u0191\u0194"+
		"\3\2\2\2\u0192\u0190\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0196\3\2\2\2\u0194"+
		"\u0192\3\2\2\2\u0195\u0197\5`\61\2\u0196\u0195\3\2\2\2\u0196\u0197\3\2"+
		"\2\2\u0197\u0198\3\2\2\2\u0198\u0199\7\f\2\2\u0199K\3\2\2\2\u019a\u019f"+
		"\5N(\2\u019b\u019c\7\24\2\2\u019c\u019e\5N(\2\u019d\u019b\3\2\2\2\u019e"+
		"\u01a1\3\2\2\2\u019f\u019d\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0M\3\2\2\2"+
		"\u01a1\u019f\3\2\2\2\u01a2\u01a4\5R*\2\u01a3\u01a2\3\2\2\2\u01a4\u01a5"+
		"\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01ac\3\2\2\2\u01a7"+
		"\u01a8\5P)\2\u01a8\u01a9\5R*\2\u01a9\u01ab\3\2\2\2\u01aa\u01a7\3\2\2\2"+
		"\u01ab\u01ae\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01b2"+
		"\3\2\2\2\u01ae\u01ac\3\2\2\2\u01af\u01b1\5V,\2\u01b0\u01af\3\2\2\2\u01b1"+
		"\u01b4\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b8\3\2"+
		"\2\2\u01b4\u01b2\3\2\2\2\u01b5\u01b7\5T+\2\u01b6\u01b5\3\2\2\2\u01b7\u01ba"+
		"\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b9O\3\2\2\2\u01ba"+
		"\u01b8\3\2\2\2\u01bb\u01bc\t\5\2\2\u01bcQ\3\2\2\2\u01bd\u01c5\5Z.\2\u01be"+
		"\u01bf\7\31\2\2\u01bf\u01c5\5Z.\2\u01c0\u01c1\7\25\2\2\u01c1\u01c5\5Z"+
		".\2\u01c2\u01c5\7\30\2\2\u01c3\u01c5\7\34\2\2\u01c4\u01bd\3\2\2\2\u01c4"+
		"\u01be\3\2\2\2\u01c4\u01c0\3\2\2\2\u01c4\u01c2\3\2\2\2\u01c4\u01c3\3\2"+
		"\2\2\u01c5S\3\2\2\2\u01c6\u01c7\t\6\2\2\u01c7\u01cb\7\64\2\2\u01c8\u01c9"+
		"\t\6\2\2\u01c9\u01cb\5j\66\2\u01ca\u01c6\3\2\2\2\u01ca\u01c8\3\2\2\2\u01cb"+
		"U\3\2\2\2\u01cc\u01cd\7\r\2\2\u01cd\u01d1\7\64\2\2\u01ce\u01cf\5X-\2\u01cf"+
		"\u01d0\t\7\2\2\u01d0\u01d2\3\2\2\2\u01d1\u01ce\3\2\2\2\u01d1\u01d2\3\2"+
		"\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01d4\7\16\2\2\u01d4W\3\2\2\2\u01d5\u01d6"+
		"\t\b\2\2\u01d6Y\3\2\2\2\u01d7\u01db\7\64\2\2\u01d8\u01da\5\\/\2\u01d9"+
		"\u01d8\3\2\2\2\u01da\u01dd\3\2\2\2\u01db\u01d9\3\2\2\2\u01db\u01dc\3\2"+
		"\2\2\u01dc\u01e8\3\2\2\2\u01dd\u01db\3\2\2\2\u01de\u01df\7\b\2\2\u01df"+
		"\u01e0\5^\60\2\u01e0\u01e4\7\f\2\2\u01e1\u01e3\5\\/\2\u01e2\u01e1\3\2"+
		"\2\2\u01e3\u01e6\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5"+
		"\u01e8\3\2\2\2\u01e6\u01e4\3\2\2\2\u01e7\u01d7\3\2\2\2\u01e7\u01de\3\2"+
		"\2\2\u01e8[\3\2\2\2\u01e9\u01ea\7@\2\2\u01ea\u01eb\5^\60\2\u01eb\u01ec"+
		"\7\f\2\2\u01ec\u01ef\3\2\2\2\u01ed\u01ef\7A\2\2\u01ee\u01e9\3\2\2\2\u01ee"+
		"\u01ed\3\2\2\2\u01ef]\3\2\2\2\u01f0\u01f1\7\26\2\2\u01f1\u01f2\t\t\2\2"+
		"\u01f2_\3\2\2\2\u01f3\u01f4\5Z.\2\u01f4\u01f5\7\22\2\2\u01f5\u01f6\5d"+
		"\63\2\u01f6\u01fb\3\2\2\2\u01f7\u01f8\7\65\2\2\u01f8\u01f9\7\22\2\2\u01f9"+
		"\u01fb\5d\63\2\u01fa\u01f3\3\2\2\2\u01fa\u01f7\3\2\2\2\u01fba\3\2\2\2"+
		"\u01fc\u01fd\7\66\2\2\u01fd\u01fe\7\65\2\2\u01fe\u01ff\7\n\2\2\u01ffc"+
		"\3\2\2\2\u0200\u0205\5\32\16\2\u0201\u0202\7\24\2\2\u0202\u0204\5\32\16"+
		"\2\u0203\u0201\3\2\2\2\u0204\u0207\3\2\2\2\u0205\u0203\3\2\2\2\u0205\u0206"+
		"\3\2\2\2\u0206e\3\2\2\2\u0207\u0205\3\2\2\2\u0208\u0209\7 \2\2\u0209\u020a"+
		"\7>\2\2\u020a\u020b\7=\2\2\u020bg\3\2\2\2\u020c\u020e\78\2\2\u020d\u020f"+
		"\7\5\2\2\u020e\u020d\3\2\2\2\u020e\u020f\3\2\2\2\u020fi\3\2\2\2\u0210"+
		"\u0211\7\64\2\2\u0211\u0213\7\t\2\2\u0212\u0214\5d\63\2\u0213\u0212\3"+
		"\2\2\2\u0213\u0214\3\2\2\2\u0214\u0215\3\2\2\2\u0215\u0216\7\n\2\2\u0216"+
		"k\3\2\2\2<o}\u0084\u0088\u008c\u0095\u009b\u009e\u00a7\u00ab\u00ad\u00b0"+
		"\u00b2\u00b8\u00bd\u00c4\u00d1\u00d6\u00dc\u00df\u00ef\u00f7\u00fb\u0108"+
		"\u010b\u0110\u0116\u011c\u0136\u0142\u014a\u014d\u0155\u015d\u0162\u016a"+
		"\u0171\u017f\u0185\u0190\u0192\u0196\u019f\u01a5\u01ac\u01b2\u01b8\u01c4"+
		"\u01ca\u01d1\u01db\u01e4\u01e7\u01ee\u01fa\u0205\u020e\u0213";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}