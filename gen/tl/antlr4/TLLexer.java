// Generated from D:/gay/Java/tiny-language-antlr4/src/main/antlr4/tl/antlr4\TL.g4 by ANTLR 4.7
package tl.antlr4;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AtBegin=1, AtEnd=2, Println=3, Print=4, Input=5, Assert=6, Size=7, Def=8, 
		If=9, Else=10, Return=11, For=12, While=13, To=14, Do=15, End=16, In=17, 
		Null=18, Or=19, And=20, Equals=21, NEquals=22, GTEquals=23, LTEquals=24, 
		Pow=25, Excl=26, GT=27, LT=28, Add=29, Subtract=30, Multiply=31, Divide=32, 
		Modulus=33, OBrace=34, CBrace=35, OBracket=36, CBracket=37, OParen=38, 
		CParen=39, SColon=40, Assign=41, Comma=42, QMark=43, Colon=44, Bool=45, 
		Number=46, Identifier=47, String=48, Comment=49, Space=50;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"AtBegin", "AtEnd", "Println", "Print", "Input", "Assert", "Size", "Def", 
		"If", "Else", "Return", "For", "While", "To", "Do", "End", "In", "Null", 
		"Or", "And", "Equals", "NEquals", "GTEquals", "LTEquals", "Pow", "Excl", 
		"GT", "LT", "Add", "Subtract", "Multiply", "Divide", "Modulus", "OBrace", 
		"CBrace", "OBracket", "CBracket", "OParen", "CParen", "SColon", "Assign", 
		"Comma", "QMark", "Colon", "Bool", "Number", "Identifier", "String", "Comment", 
		"Space", "Int", "Digit"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'AtBegin'", "'AtEnd'", null, null, "'input'", "'assert'", "'size'", 
		"'def'", "'if'", "'else'", "'return'", "'for'", "'while'", "'to'", "'do'", 
		"'end'", "'in'", "'null'", "'||'", "'&&'", "'=='", "'!='", "'>='", "'<='", 
		"'^'", "'!'", "'>'", "'<'", "'+'", "'-'", "'*'", "'/'", "'%'", "'{'", 
		"'}'", "'['", "']'", "'('", "')'", "';'", "'='", "','", "'?'", "':'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "AtBegin", "AtEnd", "Println", "Print", "Input", "Assert", "Size", 
		"Def", "If", "Else", "Return", "For", "While", "To", "Do", "End", "In", 
		"Null", "Or", "And", "Equals", "NEquals", "GTEquals", "LTEquals", "Pow", 
		"Excl", "GT", "LT", "Add", "Subtract", "Multiply", "Divide", "Modulus", 
		"OBrace", "CBrace", "OBracket", "CBracket", "OParen", "CParen", "SColon", 
		"Assign", "Comma", "QMark", "Colon", "Bool", "Number", "Identifier", "String", 
		"Comment", "Space"
	};
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


	public TLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TL.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\64\u0166\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0086\n\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0090\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!"+
		"\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3"+
		",\3,\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u0116\n.\3/\3/\3/\7/\u011b\n"+
		"/\f/\16/\u011e\13/\5/\u0120\n/\3\60\3\60\7\60\u0124\n\60\f\60\16\60\u0127"+
		"\13\60\3\61\3\61\3\61\3\61\7\61\u012d\n\61\f\61\16\61\u0130\13\61\3\61"+
		"\3\61\3\61\3\61\3\61\7\61\u0137\n\61\f\61\16\61\u013a\13\61\3\61\5\61"+
		"\u013d\n\61\3\62\3\62\3\62\3\62\7\62\u0143\n\62\f\62\16\62\u0146\13\62"+
		"\3\62\3\62\3\62\3\62\7\62\u014c\n\62\f\62\16\62\u014f\13\62\3\62\3\62"+
		"\5\62\u0153\n\62\3\62\3\62\3\63\3\63\3\63\3\63\3\64\3\64\7\64\u015d\n"+
		"\64\f\64\16\64\u0160\13\64\3\64\5\64\u0163\n\64\3\65\3\65\3\u014d\2\66"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37"+
		"= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\2i\2\3\2\f\5\2"+
		"C\\aac|\6\2\62;C\\aac|\3\2$$\6\2\f\f\17\17$$^^\4\2\f\f\17\17\3\2))\6\2"+
		"\f\f\17\17))^^\5\2\13\f\16\17\"\"\3\2\63;\3\2\62;\2\u0173\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2"+
		"\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2"+
		"\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W"+
		"\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2"+
		"\2\2\2e\3\2\2\2\3k\3\2\2\2\5s\3\2\2\2\7\u0085\3\2\2\2\t\u008f\3\2\2\2"+
		"\13\u0091\3\2\2\2\r\u0097\3\2\2\2\17\u009e\3\2\2\2\21\u00a3\3\2\2\2\23"+
		"\u00a7\3\2\2\2\25\u00aa\3\2\2\2\27\u00af\3\2\2\2\31\u00b6\3\2\2\2\33\u00ba"+
		"\3\2\2\2\35\u00c0\3\2\2\2\37\u00c3\3\2\2\2!\u00c6\3\2\2\2#\u00ca\3\2\2"+
		"\2%\u00cd\3\2\2\2\'\u00d2\3\2\2\2)\u00d5\3\2\2\2+\u00d8\3\2\2\2-\u00db"+
		"\3\2\2\2/\u00de\3\2\2\2\61\u00e1\3\2\2\2\63\u00e4\3\2\2\2\65\u00e6\3\2"+
		"\2\2\67\u00e8\3\2\2\29\u00ea\3\2\2\2;\u00ec\3\2\2\2=\u00ee\3\2\2\2?\u00f0"+
		"\3\2\2\2A\u00f2\3\2\2\2C\u00f4\3\2\2\2E\u00f6\3\2\2\2G\u00f8\3\2\2\2I"+
		"\u00fa\3\2\2\2K\u00fc\3\2\2\2M\u00fe\3\2\2\2O\u0100\3\2\2\2Q\u0102\3\2"+
		"\2\2S\u0104\3\2\2\2U\u0106\3\2\2\2W\u0108\3\2\2\2Y\u010a\3\2\2\2[\u0115"+
		"\3\2\2\2]\u0117\3\2\2\2_\u0121\3\2\2\2a\u013c\3\2\2\2c\u0152\3\2\2\2e"+
		"\u0156\3\2\2\2g\u0162\3\2\2\2i\u0164\3\2\2\2kl\7C\2\2lm\7v\2\2mn\7D\2"+
		"\2no\7g\2\2op\7i\2\2pq\7k\2\2qr\7p\2\2r\4\3\2\2\2st\7C\2\2tu\7v\2\2uv"+
		"\7G\2\2vw\7p\2\2wx\7f\2\2x\6\3\2\2\2yz\7r\2\2z{\7t\2\2{|\7k\2\2|}\7p\2"+
		"\2}~\7v\2\2~\177\7n\2\2\177\u0086\7p\2\2\u0080\u0081\7u\2\2\u0081\u0082"+
		"\7c\2\2\u0082\u0083\7{\2\2\u0083\u0084\7n\2\2\u0084\u0086\7p\2\2\u0085"+
		"y\3\2\2\2\u0085\u0080\3\2\2\2\u0086\b\3\2\2\2\u0087\u0088\7r\2\2\u0088"+
		"\u0089\7t\2\2\u0089\u008a\7k\2\2\u008a\u008b\7p\2\2\u008b\u0090\7v\2\2"+
		"\u008c\u008d\7u\2\2\u008d\u008e\7c\2\2\u008e\u0090\7{\2\2\u008f\u0087"+
		"\3\2\2\2\u008f\u008c\3\2\2\2\u0090\n\3\2\2\2\u0091\u0092\7k\2\2\u0092"+
		"\u0093\7p\2\2\u0093\u0094\7r\2\2\u0094\u0095\7w\2\2\u0095\u0096\7v\2\2"+
		"\u0096\f\3\2\2\2\u0097\u0098\7c\2\2\u0098\u0099\7u\2\2\u0099\u009a\7u"+
		"\2\2\u009a\u009b\7g\2\2\u009b\u009c\7t\2\2\u009c\u009d\7v\2\2\u009d\16"+
		"\3\2\2\2\u009e\u009f\7u\2\2\u009f\u00a0\7k\2\2\u00a0\u00a1\7|\2\2\u00a1"+
		"\u00a2\7g\2\2\u00a2\20\3\2\2\2\u00a3\u00a4\7f\2\2\u00a4\u00a5\7g\2\2\u00a5"+
		"\u00a6\7h\2\2\u00a6\22\3\2\2\2\u00a7\u00a8\7k\2\2\u00a8\u00a9\7h\2\2\u00a9"+
		"\24\3\2\2\2\u00aa\u00ab\7g\2\2\u00ab\u00ac\7n\2\2\u00ac\u00ad\7u\2\2\u00ad"+
		"\u00ae\7g\2\2\u00ae\26\3\2\2\2\u00af\u00b0\7t\2\2\u00b0\u00b1\7g\2\2\u00b1"+
		"\u00b2\7v\2\2\u00b2\u00b3\7w\2\2\u00b3\u00b4\7t\2\2\u00b4\u00b5\7p\2\2"+
		"\u00b5\30\3\2\2\2\u00b6\u00b7\7h\2\2\u00b7\u00b8\7q\2\2\u00b8\u00b9\7"+
		"t\2\2\u00b9\32\3\2\2\2\u00ba\u00bb\7y\2\2\u00bb\u00bc\7j\2\2\u00bc\u00bd"+
		"\7k\2\2\u00bd\u00be\7n\2\2\u00be\u00bf\7g\2\2\u00bf\34\3\2\2\2\u00c0\u00c1"+
		"\7v\2\2\u00c1\u00c2\7q\2\2\u00c2\36\3\2\2\2\u00c3\u00c4\7f\2\2\u00c4\u00c5"+
		"\7q\2\2\u00c5 \3\2\2\2\u00c6\u00c7\7g\2\2\u00c7\u00c8\7p\2\2\u00c8\u00c9"+
		"\7f\2\2\u00c9\"\3\2\2\2\u00ca\u00cb\7k\2\2\u00cb\u00cc\7p\2\2\u00cc$\3"+
		"\2\2\2\u00cd\u00ce\7p\2\2\u00ce\u00cf\7w\2\2\u00cf\u00d0\7n\2\2\u00d0"+
		"\u00d1\7n\2\2\u00d1&\3\2\2\2\u00d2\u00d3\7~\2\2\u00d3\u00d4\7~\2\2\u00d4"+
		"(\3\2\2\2\u00d5\u00d6\7(\2\2\u00d6\u00d7\7(\2\2\u00d7*\3\2\2\2\u00d8\u00d9"+
		"\7?\2\2\u00d9\u00da\7?\2\2\u00da,\3\2\2\2\u00db\u00dc\7#\2\2\u00dc\u00dd"+
		"\7?\2\2\u00dd.\3\2\2\2\u00de\u00df\7@\2\2\u00df\u00e0\7?\2\2\u00e0\60"+
		"\3\2\2\2\u00e1\u00e2\7>\2\2\u00e2\u00e3\7?\2\2\u00e3\62\3\2\2\2\u00e4"+
		"\u00e5\7`\2\2\u00e5\64\3\2\2\2\u00e6\u00e7\7#\2\2\u00e7\66\3\2\2\2\u00e8"+
		"\u00e9\7@\2\2\u00e98\3\2\2\2\u00ea\u00eb\7>\2\2\u00eb:\3\2\2\2\u00ec\u00ed"+
		"\7-\2\2\u00ed<\3\2\2\2\u00ee\u00ef\7/\2\2\u00ef>\3\2\2\2\u00f0\u00f1\7"+
		",\2\2\u00f1@\3\2\2\2\u00f2\u00f3\7\61\2\2\u00f3B\3\2\2\2\u00f4\u00f5\7"+
		"\'\2\2\u00f5D\3\2\2\2\u00f6\u00f7\7}\2\2\u00f7F\3\2\2\2\u00f8\u00f9\7"+
		"\177\2\2\u00f9H\3\2\2\2\u00fa\u00fb\7]\2\2\u00fbJ\3\2\2\2\u00fc\u00fd"+
		"\7_\2\2\u00fdL\3\2\2\2\u00fe\u00ff\7*\2\2\u00ffN\3\2\2\2\u0100\u0101\7"+
		"+\2\2\u0101P\3\2\2\2\u0102\u0103\7=\2\2\u0103R\3\2\2\2\u0104\u0105\7?"+
		"\2\2\u0105T\3\2\2\2\u0106\u0107\7.\2\2\u0107V\3\2\2\2\u0108\u0109\7A\2"+
		"\2\u0109X\3\2\2\2\u010a\u010b\7<\2\2\u010bZ\3\2\2\2\u010c\u010d\7v\2\2"+
		"\u010d\u010e\7t\2\2\u010e\u010f\7w\2\2\u010f\u0116\7g\2\2\u0110\u0111"+
		"\7h\2\2\u0111\u0112\7c\2\2\u0112\u0113\7n\2\2\u0113\u0114\7u\2\2\u0114"+
		"\u0116\7g\2\2\u0115\u010c\3\2\2\2\u0115\u0110\3\2\2\2\u0116\\\3\2\2\2"+
		"\u0117\u011f\5g\64\2\u0118\u011c\7\60\2\2\u0119\u011b\5i\65\2\u011a\u0119"+
		"\3\2\2\2\u011b\u011e\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d"+
		"\u0120\3\2\2\2\u011e\u011c\3\2\2\2\u011f\u0118\3\2\2\2\u011f\u0120\3\2"+
		"\2\2\u0120^\3\2\2\2\u0121\u0125\t\2\2\2\u0122\u0124\t\3\2\2\u0123\u0122"+
		"\3\2\2\2\u0124\u0127\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126"+
		"`\3\2\2\2\u0127\u0125\3\2\2\2\u0128\u012e\t\4\2\2\u0129\u012d\n\5\2\2"+
		"\u012a\u012b\7^\2\2\u012b\u012d\n\6\2\2\u012c\u0129\3\2\2\2\u012c\u012a"+
		"\3\2\2\2\u012d\u0130\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f"+
		"\u0131\3\2\2\2\u0130\u012e\3\2\2\2\u0131\u013d\t\4\2\2\u0132\u0138\t\7"+
		"\2\2\u0133\u0137\n\b\2\2\u0134\u0135\7^\2\2\u0135\u0137\n\6\2\2\u0136"+
		"\u0133\3\2\2\2\u0136\u0134\3\2\2\2\u0137\u013a\3\2\2\2\u0138\u0136\3\2"+
		"\2\2\u0138\u0139\3\2\2\2\u0139\u013b\3\2\2\2\u013a\u0138\3\2\2\2\u013b"+
		"\u013d\t\7\2\2\u013c\u0128\3\2\2\2\u013c\u0132\3\2\2\2\u013db\3\2\2\2"+
		"\u013e\u013f\7\61\2\2\u013f\u0140\7\61\2\2\u0140\u0144\3\2\2\2\u0141\u0143"+
		"\n\6\2\2\u0142\u0141\3\2\2\2\u0143\u0146\3\2\2\2\u0144\u0142\3\2\2\2\u0144"+
		"\u0145\3\2\2\2\u0145\u0153\3\2\2\2\u0146\u0144\3\2\2\2\u0147\u0148\7\61"+
		"\2\2\u0148\u0149\7,\2\2\u0149\u014d\3\2\2\2\u014a\u014c\13\2\2\2\u014b"+
		"\u014a\3\2\2\2\u014c\u014f\3\2\2\2\u014d\u014e\3\2\2\2\u014d\u014b\3\2"+
		"\2\2\u014e\u0150\3\2\2\2\u014f\u014d\3\2\2\2\u0150\u0151\7,\2\2\u0151"+
		"\u0153\7\61\2\2\u0152\u013e\3\2\2\2\u0152\u0147\3\2\2\2\u0153\u0154\3"+
		"\2\2\2\u0154\u0155\b\62\2\2\u0155d\3\2\2\2\u0156\u0157\t\t\2\2\u0157\u0158"+
		"\3\2\2\2\u0158\u0159\b\63\2\2\u0159f\3\2\2\2\u015a\u015e\t\n\2\2\u015b"+
		"\u015d\5i\65\2\u015c\u015b\3\2\2\2\u015d\u0160\3\2\2\2\u015e\u015c\3\2"+
		"\2\2\u015e\u015f\3\2\2\2\u015f\u0163\3\2\2\2\u0160\u015e\3\2\2\2\u0161"+
		"\u0163\7\62\2\2\u0162\u015a\3\2\2\2\u0162\u0161\3\2\2\2\u0163h\3\2\2\2"+
		"\u0164\u0165\t\13\2\2\u0165j\3\2\2\2\23\2\u0085\u008f\u0115\u011c\u011f"+
		"\u0125\u012c\u012e\u0136\u0138\u013c\u0144\u014d\u0152\u015e\u0162\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}