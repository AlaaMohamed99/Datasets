// Generated from E:/antlr_project/src\HTMLLexer.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HTMLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OPEN_curly_brac=1, HTML_COMMENT=2, HTML_CONDITIONAL_COMMENT=3, XML=4, 
		CDATA=5, DTD=6, SCRIPTLET=7, SEA_WS=8, SCRIPT_OPEN=9, STYLE_OPEN=10, TAG_OPEN=11, 
		HTML_TEXT=12, TAG_CLOSE=13, TAG_SLASH_CLOSE=14, TAG_SLASH=15, TAG_EQUALS=16, 
		TAG_NAME=17, TAG_WHITESPACE=18, OPEN_PAR=19, OPEN_SQUARE_PARKET=20, Two_way_binding_open=21, 
		Astrict=22, SCRIPT_BODY=23, SCRIPT_SHORT_BODY=24, STYLE_BODY=25, STYLE_SHORT_BODY=26, 
		ATTVALUE_VALUE=27, ATTRIBUTE=28, Property=29, CLOSE_PAR=30, Two_way_binding_close=31, 
		CLOSE_SQUARE_PARKET=32, Interpolation_inside=33, CLOSE_curly_brac=34;
	public static final int
		TAG=1, SCRIPT=2, STYLE=3, ATTVALUE=4, Binding=5, Interpolation=6;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "TAG", "SCRIPT", "STYLE", "ATTVALUE", "Binding", "Interpolation"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"OPEN_curly_brac", "HTML_COMMENT", "HTML_CONDITIONAL_COMMENT", "XML", 
			"CDATA", "DTD", "SCRIPTLET", "SEA_WS", "SCRIPT_OPEN", "STYLE_OPEN", "TAG_OPEN", 
			"HTML_TEXT", "TAG_CLOSE", "TAG_SLASH_CLOSE", "TAG_SLASH", "TAG_EQUALS", 
			"TAG_NAME", "TAG_WHITESPACE", "HEXDIGIT", "DIGIT", "TAG_NameChar", "TAG_NameStartChar", 
			"OPEN_PAR", "OPEN_SQUARE_PARKET", "Two_way_binding_open", "Astrict", 
			"SCRIPT_BODY", "SCRIPT_SHORT_BODY", "STYLE_BODY", "STYLE_SHORT_BODY", 
			"ATTVALUE_VALUE", "ATTRIBUTE", "ATTCHARS", "ATTCHAR", "HEXCHARS", "DECCHARS", 
			"DOUBLE_QUOTE_STRING", "SINGLE_QUOTE_STRING", "Property", "Binding_NameChar", 
			"Binding_NameStartChar", "CLOSE_PAR", "Two_way_binding_close", "CLOSE_SQUARE_PARKET", 
			"Interpolation_inside", "CLOSE_curly_brac"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{{'", null, null, null, null, null, null, null, null, null, "'<'", 
			null, "'>'", "'/>'", "'/'", "'='", null, null, "'('", "'['", "'[('", 
			"'*'", null, null, null, null, null, null, null, "')'", "')]'", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "OPEN_curly_brac", "HTML_COMMENT", "HTML_CONDITIONAL_COMMENT", 
			"XML", "CDATA", "DTD", "SCRIPTLET", "SEA_WS", "SCRIPT_OPEN", "STYLE_OPEN", 
			"TAG_OPEN", "HTML_TEXT", "TAG_CLOSE", "TAG_SLASH_CLOSE", "TAG_SLASH", 
			"TAG_EQUALS", "TAG_NAME", "TAG_WHITESPACE", "OPEN_PAR", "OPEN_SQUARE_PARKET", 
			"Two_way_binding_open", "Astrict", "SCRIPT_BODY", "SCRIPT_SHORT_BODY", 
			"STYLE_BODY", "STYLE_SHORT_BODY", "ATTVALUE_VALUE", "ATTRIBUTE", "Property", 
			"CLOSE_PAR", "Two_way_binding_close", "CLOSE_SQUARE_PARKET", "Interpolation_inside", 
			"CLOSE_curly_brac"
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


	public HTMLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "HTMLLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2$\u01cf\b\1\b\1\b"+
		"\1\b\1\b\1\b\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b"+
		"\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36"+
		"\t\36\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4"+
		"(\t(\4)\t)\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\3\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\7\3q\n\3\f\3\16\3t\13\3\3\3\3\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\3\4\7\4\177\n\4\f\4\16\4\u0082\13\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\7\5\u008e\n\5\f\5\16\5\u0091\13\5\3\5\3\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u00a0\n\6\f\6\16\6\u00a3\13\6\3\6\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\7\7\u00ad\n\7\f\7\16\7\u00b0\13\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\7\b\u00b8\n\b\f\b\16\b\u00bb\13\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\7\b\u00c3\n\b\f\b\16\b\u00c6\13\b\3\b\3\b\5\b\u00ca\n\b\3\t\3\t\5\t\u00ce"+
		"\n\t\3\t\6\t\u00d1\n\t\r\t\16\t\u00d2\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\7\n\u00de\n\n\f\n\16\n\u00e1\13\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\7\13\u00ef\n\13\f\13\16\13\u00f2\13\13\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\6\r\u00fd\n\r\r\r\16\r\u00fe\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\7\22\u0112\n\22\f\22\16\22\u0115\13\22\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\5\26\u0123\n\26\3\27\5\27\u0126"+
		"\n\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\33\3\33\3\34\7\34\u0138\n\34\f\34\16\34\u013b\13\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\7\35\u014a\n\35\f\35"+
		"\16\35\u014d\13\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\7\36\u0156\n\36"+
		"\f\36\16\36\u0159\13\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\37\7\37\u0167\n\37\f\37\16\37\u016a\13\37\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3 \7 \u0173\n \f \16 \u0176\13 \3 \3 \3 \3 \3!\3!\3!\3!"+
		"\3!\5!\u0181\n!\3\"\6\"\u0184\n\"\r\"\16\"\u0185\3\"\5\"\u0189\n\"\3#"+
		"\5#\u018c\n#\3$\3$\6$\u0190\n$\r$\16$\u0191\3%\6%\u0195\n%\r%\16%\u0196"+
		"\3%\5%\u019a\n%\3&\3&\7&\u019e\n&\f&\16&\u01a1\13&\3&\3&\3\'\3\'\7\'\u01a7"+
		"\n\'\f\'\16\'\u01aa\13\'\3\'\3\'\3(\3(\7(\u01b0\n(\f(\16(\u01b3\13(\3"+
		")\3)\5)\u01b7\n)\3*\5*\u01ba\n*\3+\3+\3+\3+\3,\3,\3,\3,\3,\3-\3-\3-\3"+
		"-\3.\3.\3/\3/\3/\3/\3/\17r\u0080\u008f\u00a1\u00ae\u00b9\u00c4\u00df\u00f0"+
		"\u0139\u014b\u0157\u0168\2\60\t\3\13\4\r\5\17\6\21\7\23\b\25\t\27\n\31"+
		"\13\33\f\35\r\37\16!\17#\20%\21\'\22)\23+\24-\2/\2\61\2\63\2\65\25\67"+
		"\269\27;\30=\31?\32A\33C\34E\35G\36I\2K\2M\2O\2Q\2S\2U\37W\2Y\2[ ]!_\""+
		"a#c$\t\2\3\4\5\6\7\b\16\4\2\13\13\"\"\5\2>>}}\177\177\5\2\13\f\17\17\""+
		"\"\5\2\62;CHch\3\2\62;\4\2/\60aa\5\2\u00b9\u00b9\u0302\u0371\u2041\u2042"+
		"\n\2<<C\\c|\u2072\u2191\u2c02\u2ff1\u3003\ud801\uf902\ufdd1\ufdf2\uffff"+
		"\t\2%%-=??AAC\\aac|\4\2$$>>\4\2))>>\6\2<<C\\aac|\2\u01e0\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\3!\3\2\2\2\3#\3\2\2\2\3%\3\2\2\2\3\'\3\2\2\2\3)\3\2\2\2\3+\3\2\2\2"+
		"\3\65\3\2\2\2\3\67\3\2\2\2\39\3\2\2\2\3;\3\2\2\2\4=\3\2\2\2\4?\3\2\2\2"+
		"\5A\3\2\2\2\5C\3\2\2\2\6E\3\2\2\2\6G\3\2\2\2\7U\3\2\2\2\7[\3\2\2\2\7]"+
		"\3\2\2\2\7_\3\2\2\2\ba\3\2\2\2\bc\3\2\2\2\te\3\2\2\2\13j\3\2\2\2\ry\3"+
		"\2\2\2\17\u0086\3\2\2\2\21\u0094\3\2\2\2\23\u00a8\3\2\2\2\25\u00c9\3\2"+
		"\2\2\27\u00d0\3\2\2\2\31\u00d4\3\2\2\2\33\u00e6\3\2\2\2\35\u00f7\3\2\2"+
		"\2\37\u00fc\3\2\2\2!\u0100\3\2\2\2#\u0104\3\2\2\2%\u0109\3\2\2\2\'\u010b"+
		"\3\2\2\2)\u010f\3\2\2\2+\u0116\3\2\2\2-\u011a\3\2\2\2/\u011c\3\2\2\2\61"+
		"\u0122\3\2\2\2\63\u0125\3\2\2\2\65\u0127\3\2\2\2\67\u012b\3\2\2\29\u012f"+
		"\3\2\2\2;\u0134\3\2\2\2=\u0139\3\2\2\2?\u014b\3\2\2\2A\u0157\3\2\2\2C"+
		"\u0168\3\2\2\2E\u0174\3\2\2\2G\u0180\3\2\2\2I\u0183\3\2\2\2K\u018b\3\2"+
		"\2\2M\u018d\3\2\2\2O\u0194\3\2\2\2Q\u019b\3\2\2\2S\u01a4\3\2\2\2U\u01ad"+
		"\3\2\2\2W\u01b6\3\2\2\2Y\u01b9\3\2\2\2[\u01bb\3\2\2\2]\u01bf\3\2\2\2_"+
		"\u01c4\3\2\2\2a\u01c8\3\2\2\2c\u01ca\3\2\2\2ef\7}\2\2fg\7}\2\2gh\3\2\2"+
		"\2hi\b\2\2\2i\n\3\2\2\2jk\7>\2\2kl\7#\2\2lm\7/\2\2mn\7/\2\2nr\3\2\2\2"+
		"oq\13\2\2\2po\3\2\2\2qt\3\2\2\2rs\3\2\2\2rp\3\2\2\2su\3\2\2\2tr\3\2\2"+
		"\2uv\7/\2\2vw\7/\2\2wx\7@\2\2x\f\3\2\2\2yz\7>\2\2z{\7#\2\2{|\7]\2\2|\u0080"+
		"\3\2\2\2}\177\13\2\2\2~}\3\2\2\2\177\u0082\3\2\2\2\u0080\u0081\3\2\2\2"+
		"\u0080~\3\2\2\2\u0081\u0083\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0084\7"+
		"_\2\2\u0084\u0085\7@\2\2\u0085\16\3\2\2\2\u0086\u0087\7>\2\2\u0087\u0088"+
		"\7A\2\2\u0088\u0089\7z\2\2\u0089\u008a\7o\2\2\u008a\u008b\7n\2\2\u008b"+
		"\u008f\3\2\2\2\u008c\u008e\13\2\2\2\u008d\u008c\3\2\2\2\u008e\u0091\3"+
		"\2\2\2\u008f\u0090\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0092\3\2\2\2\u0091"+
		"\u008f\3\2\2\2\u0092\u0093\7@\2\2\u0093\20\3\2\2\2\u0094\u0095\7>\2\2"+
		"\u0095\u0096\7#\2\2\u0096\u0097\7]\2\2\u0097\u0098\7E\2\2\u0098\u0099"+
		"\7F\2\2\u0099\u009a\7C\2\2\u009a\u009b\7V\2\2\u009b\u009c\7C\2\2\u009c"+
		"\u009d\7]\2\2\u009d\u00a1\3\2\2\2\u009e\u00a0\13\2\2\2\u009f\u009e\3\2"+
		"\2\2\u00a0\u00a3\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2"+
		"\u00a4\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a5\7_\2\2\u00a5\u00a6\7_\2"+
		"\2\u00a6\u00a7\7@\2\2\u00a7\22\3\2\2\2\u00a8\u00a9\7>\2\2\u00a9\u00aa"+
		"\7#\2\2\u00aa\u00ae\3\2\2\2\u00ab\u00ad\13\2\2\2\u00ac\u00ab\3\2\2\2\u00ad"+
		"\u00b0\3\2\2\2\u00ae\u00af\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b1\3\2"+
		"\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00b2\7@\2\2\u00b2\24\3\2\2\2\u00b3\u00b4"+
		"\7>\2\2\u00b4\u00b5\7A\2\2\u00b5\u00b9\3\2\2\2\u00b6\u00b8\13\2\2\2\u00b7"+
		"\u00b6\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00ba\3\2\2\2\u00b9\u00b7\3\2"+
		"\2\2\u00ba\u00bc\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00bd\7A\2\2\u00bd"+
		"\u00ca\7@\2\2\u00be\u00bf\7>\2\2\u00bf\u00c0\7\'\2\2\u00c0\u00c4\3\2\2"+
		"\2\u00c1\u00c3\13\2\2\2\u00c2\u00c1\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4"+
		"\u00c5\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c7\3\2\2\2\u00c6\u00c4\3\2"+
		"\2\2\u00c7\u00c8\7\'\2\2\u00c8\u00ca\7@\2\2\u00c9\u00b3\3\2\2\2\u00c9"+
		"\u00be\3\2\2\2\u00ca\26\3\2\2\2\u00cb\u00d1\t\2\2\2\u00cc\u00ce\7\17\2"+
		"\2\u00cd\u00cc\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d1"+
		"\7\f\2\2\u00d0\u00cb\3\2\2\2\u00d0\u00cd\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2"+
		"\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\30\3\2\2\2\u00d4\u00d5\7>\2\2"+
		"\u00d5\u00d6\7u\2\2\u00d6\u00d7\7e\2\2\u00d7\u00d8\7t\2\2\u00d8\u00d9"+
		"\7k\2\2\u00d9\u00da\7r\2\2\u00da\u00db\7v\2\2\u00db\u00df\3\2\2\2\u00dc"+
		"\u00de\13\2\2\2\u00dd\u00dc\3\2\2\2\u00de\u00e1\3\2\2\2\u00df\u00e0\3"+
		"\2\2\2\u00df\u00dd\3\2\2\2\u00e0\u00e2\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2"+
		"\u00e3\7@\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\b\n\3\2\u00e5\32\3\2\2\2"+
		"\u00e6\u00e7\7>\2\2\u00e7\u00e8\7u\2\2\u00e8\u00e9\7v\2\2\u00e9\u00ea"+
		"\7{\2\2\u00ea\u00eb\7n\2\2\u00eb\u00ec\7g\2\2\u00ec\u00f0\3\2\2\2\u00ed"+
		"\u00ef\13\2\2\2\u00ee\u00ed\3\2\2\2\u00ef\u00f2\3\2\2\2\u00f0\u00f1\3"+
		"\2\2\2\u00f0\u00ee\3\2\2\2\u00f1\u00f3\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3"+
		"\u00f4\7@\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f6\b\13\4\2\u00f6\34\3\2\2"+
		"\2\u00f7\u00f8\7>\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fa\b\f\5\2\u00fa\36"+
		"\3\2\2\2\u00fb\u00fd\n\3\2\2\u00fc\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe"+
		"\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff \3\2\2\2\u0100\u0101\7@\2\2\u0101"+
		"\u0102\3\2\2\2\u0102\u0103\b\16\6\2\u0103\"\3\2\2\2\u0104\u0105\7\61\2"+
		"\2\u0105\u0106\7@\2\2\u0106\u0107\3\2\2\2\u0107\u0108\b\17\6\2\u0108$"+
		"\3\2\2\2\u0109\u010a\7\61\2\2\u010a&\3\2\2\2\u010b\u010c\7?\2\2\u010c"+
		"\u010d\3\2\2\2\u010d\u010e\b\21\7\2\u010e(\3\2\2\2\u010f\u0113\5\63\27"+
		"\2\u0110\u0112\5\61\26\2\u0111\u0110\3\2\2\2\u0112\u0115\3\2\2\2\u0113"+
		"\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114*\3\2\2\2\u0115\u0113\3\2\2\2"+
		"\u0116\u0117\t\4\2\2\u0117\u0118\3\2\2\2\u0118\u0119\b\23\b\2\u0119,\3"+
		"\2\2\2\u011a\u011b\t\5\2\2\u011b.\3\2\2\2\u011c\u011d\t\6\2\2\u011d\60"+
		"\3\2\2\2\u011e\u0123\5\63\27\2\u011f\u0123\t\7\2\2\u0120\u0123\5/\25\2"+
		"\u0121\u0123\t\b\2\2\u0122\u011e\3\2\2\2\u0122\u011f\3\2\2\2\u0122\u0120"+
		"\3\2\2\2\u0122\u0121\3\2\2\2\u0123\62\3\2\2\2\u0124\u0126\t\t\2\2\u0125"+
		"\u0124\3\2\2\2\u0126\64\3\2\2\2\u0127\u0128\7*\2\2\u0128\u0129\3\2\2\2"+
		"\u0129\u012a\b\30\t\2\u012a\66\3\2\2\2\u012b\u012c\7]\2\2\u012c\u012d"+
		"\3\2\2\2\u012d\u012e\b\31\t\2\u012e8\3\2\2\2\u012f\u0130\7]\2\2\u0130"+
		"\u0131\7*\2\2\u0131\u0132\3\2\2\2\u0132\u0133\b\32\t\2\u0133:\3\2\2\2"+
		"\u0134\u0135\7,\2\2\u0135<\3\2\2\2\u0136\u0138\13\2\2\2\u0137\u0136\3"+
		"\2\2\2\u0138\u013b\3\2\2\2\u0139\u013a\3\2\2\2\u0139\u0137\3\2\2\2\u013a"+
		"\u013c\3\2\2\2\u013b\u0139\3\2\2\2\u013c\u013d\7>\2\2\u013d\u013e\7\61"+
		"\2\2\u013e\u013f\7u\2\2\u013f\u0140\7e\2\2\u0140\u0141\7t\2\2\u0141\u0142"+
		"\7k\2\2\u0142\u0143\7r\2\2\u0143\u0144\7v\2\2\u0144\u0145\7@\2\2\u0145"+
		"\u0146\3\2\2\2\u0146\u0147\b\34\6\2\u0147>\3\2\2\2\u0148\u014a\13\2\2"+
		"\2\u0149\u0148\3\2\2\2\u014a\u014d\3\2\2\2\u014b\u014c\3\2\2\2\u014b\u0149"+
		"\3\2\2\2\u014c\u014e\3\2\2\2\u014d\u014b\3\2\2\2\u014e\u014f\7>\2\2\u014f"+
		"\u0150\7\61\2\2\u0150\u0151\7@\2\2\u0151\u0152\3\2\2\2\u0152\u0153\b\35"+
		"\6\2\u0153@\3\2\2\2\u0154\u0156\13\2\2\2\u0155\u0154\3\2\2\2\u0156\u0159"+
		"\3\2\2\2\u0157\u0158\3\2\2\2\u0157\u0155\3\2\2\2\u0158\u015a\3\2\2\2\u0159"+
		"\u0157\3\2\2\2\u015a\u015b\7>\2\2\u015b\u015c\7\61\2\2\u015c\u015d\7u"+
		"\2\2\u015d\u015e\7v\2\2\u015e\u015f\7{\2\2\u015f\u0160\7n\2\2\u0160\u0161"+
		"\7g\2\2\u0161\u0162\7@\2\2\u0162\u0163\3\2\2\2\u0163\u0164\b\36\6\2\u0164"+
		"B\3\2\2\2\u0165\u0167\13\2\2\2\u0166\u0165\3\2\2\2\u0167\u016a\3\2\2\2"+
		"\u0168\u0169\3\2\2\2\u0168\u0166\3\2\2\2\u0169\u016b\3\2\2\2\u016a\u0168"+
		"\3\2\2\2\u016b\u016c\7>\2\2\u016c\u016d\7\61\2\2\u016d\u016e\7@\2\2\u016e"+
		"\u016f\3\2\2\2\u016f\u0170\b\37\6\2\u0170D\3\2\2\2\u0171\u0173\7\"\2\2"+
		"\u0172\u0171\3\2\2\2\u0173\u0176\3\2\2\2\u0174\u0172\3\2\2\2\u0174\u0175"+
		"\3\2\2\2\u0175\u0177\3\2\2\2\u0176\u0174\3\2\2\2\u0177\u0178\5G!\2\u0178"+
		"\u0179\3\2\2\2\u0179\u017a\b \6\2\u017aF\3\2\2\2\u017b\u0181\5Q&\2\u017c"+
		"\u0181\5S\'\2\u017d\u0181\5I\"\2\u017e\u0181\5M$\2\u017f\u0181\5O%\2\u0180"+
		"\u017b\3\2\2\2\u0180\u017c\3\2\2\2\u0180\u017d\3\2\2\2\u0180\u017e\3\2"+
		"\2\2\u0180\u017f\3\2\2\2\u0181H\3\2\2\2\u0182\u0184\5K#\2\u0183\u0182"+
		"\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0183\3\2\2\2\u0185\u0186\3\2\2\2\u0186"+
		"\u0188\3\2\2\2\u0187\u0189\7\"\2\2\u0188\u0187\3\2\2\2\u0188\u0189\3\2"+
		"\2\2\u0189J\3\2\2\2\u018a\u018c\t\n\2\2\u018b\u018a\3\2\2\2\u018cL\3\2"+
		"\2\2\u018d\u018f\7%\2\2\u018e\u0190\t\5\2\2\u018f\u018e\3\2\2\2\u0190"+
		"\u0191\3\2\2\2\u0191\u018f\3\2\2\2\u0191\u0192\3\2\2\2\u0192N\3\2\2\2"+
		"\u0193\u0195\t\6\2\2\u0194\u0193\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0194"+
		"\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u0199\3\2\2\2\u0198\u019a\7\'\2\2\u0199"+
		"\u0198\3\2\2\2\u0199\u019a\3\2\2\2\u019aP\3\2\2\2\u019b\u019f\7$\2\2\u019c"+
		"\u019e\n\13\2\2\u019d\u019c\3\2\2\2\u019e\u01a1\3\2\2\2\u019f\u019d\3"+
		"\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a2\3\2\2\2\u01a1\u019f\3\2\2\2\u01a2"+
		"\u01a3\7$\2\2\u01a3R\3\2\2\2\u01a4\u01a8\7)\2\2\u01a5\u01a7\n\f\2\2\u01a6"+
		"\u01a5\3\2\2\2\u01a7\u01aa\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a8\u01a9\3\2"+
		"\2\2\u01a9\u01ab\3\2\2\2\u01aa\u01a8\3\2\2\2\u01ab\u01ac\7)\2\2\u01ac"+
		"T\3\2\2\2\u01ad\u01b1\5Y*\2\u01ae\u01b0\5W)\2\u01af\u01ae\3\2\2\2\u01b0"+
		"\u01b3\3\2\2\2\u01b1\u01af\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2V\3\2\2\2"+
		"\u01b3\u01b1\3\2\2\2\u01b4\u01b7\5Y*\2\u01b5\u01b7\4/\60\2\u01b6\u01b4"+
		"\3\2\2\2\u01b6\u01b5\3\2\2\2\u01b7X\3\2\2\2\u01b8\u01ba\t\r\2\2\u01b9"+
		"\u01b8\3\2\2\2\u01baZ\3\2\2\2\u01bb\u01bc\7+\2\2\u01bc\u01bd\3\2\2\2\u01bd"+
		"\u01be\b+\6\2\u01be\\\3\2\2\2\u01bf\u01c0\7+\2\2\u01c0\u01c1\7_\2\2\u01c1"+
		"\u01c2\3\2\2\2\u01c2\u01c3\b,\6\2\u01c3^\3\2\2\2\u01c4\u01c5\7_\2\2\u01c5"+
		"\u01c6\3\2\2\2\u01c6\u01c7\b-\6\2\u01c7`\3\2\2\2\u01c8\u01c9\5\37\r\2"+
		"\u01c9b\3\2\2\2\u01ca\u01cb\7\177\2\2\u01cb\u01cc\7\177\2\2\u01cc\u01cd"+
		"\3\2\2\2\u01cd\u01ce\b/\6\2\u01ced\3\2\2\2+\2\3\4\5\6\7\br\u0080\u008f"+
		"\u00a1\u00ae\u00b9\u00c4\u00c9\u00cd\u00d0\u00d2\u00df\u00f0\u00fe\u0113"+
		"\u0122\u0125\u0139\u014b\u0157\u0168\u0174\u0180\u0185\u0188\u018b\u0191"+
		"\u0196\u0199\u019f\u01a8\u01b1\u01b6\u01b9\n\7\b\2\7\4\2\7\5\2\7\3\2\6"+
		"\2\2\7\6\2\2\3\2\7\7\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}