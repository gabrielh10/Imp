package antlr;

// Generated from imp.g4 by ANTLR 4.4
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class impLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__11=1, T__10=2, T__9=3, T__8=4, T__7=5, T__6=6, T__5=7, T__4=8, T__3=9, 
		T__2=10, T__1=11, T__0=12, COMMA=13, SEMICOLON=14, LBRACKET=15, RBRACKET=16, 
		EQUALS=17, PLUS=18, DIV=19, EQUALORLESS=20, INT=21, BOOL=22, ID=23, WS=24;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'"
	};
	public static final String[] ruleNames = {
		"T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", 
		"T__2", "T__1", "T__0", "COMMA", "SEMICOLON", "LBRACKET", "RBRACKET", 
		"EQUALS", "PLUS", "DIV", "EQUALORLESS", "INT", "BOOL", "ID", "WS"
	};


	public impLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "imp.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\32\u008f\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\17\3"+
		"\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3"+
		"\25\3\26\6\26u\n\26\r\26\16\26v\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\5\27\u0082\n\27\3\30\6\30\u0085\n\30\r\30\16\30\u0086\3\31\6\31"+
		"\u008a\n\31\r\31\16\31\u008b\3\31\3\31\2\2\32\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"+\27-\30/\31\61\32\3\2\5\3\2\62;\3\2C|\5\2\13\f\17\17\"\"\u0092\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61"+
		"\3\2\2\2\3\63\3\2\2\2\5\67\3\2\2\2\7<\3\2\2\2\t?\3\2\2\2\13B\3\2\2\2\r"+
		"F\3\2\2\2\17L\3\2\2\2\21Q\3\2\2\2\23U\3\2\2\2\25Z\3\2\2\2\27\\\3\2\2\2"+
		"\31^\3\2\2\2\33a\3\2\2\2\35c\3\2\2\2\37e\3\2\2\2!g\3\2\2\2#i\3\2\2\2%"+
		"l\3\2\2\2\'n\3\2\2\2)p\3\2\2\2+t\3\2\2\2-\u0081\3\2\2\2/\u0084\3\2\2\2"+
		"\61\u0089\3\2\2\2\63\64\7x\2\2\64\65\7c\2\2\65\66\7t\2\2\66\4\3\2\2\2"+
		"\678\7g\2\289\7n\2\29:\7u\2\2:;\7g\2\2;\6\3\2\2\2<=\7g\2\2=>\7s\2\2>\b"+
		"\3\2\2\2?@\7f\2\2@A\7q\2\2A\n\3\2\2\2BC\7c\2\2CD\7p\2\2DE\7f\2\2E\f\3"+
		"\2\2\2FG\7y\2\2GH\7j\2\2HI\7k\2\2IJ\7n\2\2JK\7g\2\2K\16\3\2\2\2LM\7v\2"+
		"\2MN\7j\2\2NO\7g\2\2OP\7p\2\2P\20\3\2\2\2QR\7p\2\2RS\7q\2\2ST\7v\2\2T"+
		"\22\3\2\2\2UV\7u\2\2VW\7m\2\2WX\7k\2\2XY\7r\2\2Y\24\3\2\2\2Z[\7/\2\2["+
		"\26\3\2\2\2\\]\7?\2\2]\30\3\2\2\2^_\7k\2\2_`\7h\2\2`\32\3\2\2\2ab\7.\2"+
		"\2b\34\3\2\2\2cd\7=\2\2d\36\3\2\2\2ef\7*\2\2f \3\2\2\2gh\7+\2\2h\"\3\2"+
		"\2\2ij\7<\2\2jk\7?\2\2k$\3\2\2\2lm\7-\2\2m&\3\2\2\2no\7\61\2\2o(\3\2\2"+
		"\2pq\7>\2\2qr\7?\2\2r*\3\2\2\2su\t\2\2\2ts\3\2\2\2uv\3\2\2\2vt\3\2\2\2"+
		"vw\3\2\2\2w,\3\2\2\2xy\7V\2\2yz\7t\2\2z{\7w\2\2{\u0082\7g\2\2|}\7H\2\2"+
		"}~\7c\2\2~\177\7n\2\2\177\u0080\7u\2\2\u0080\u0082\7g\2\2\u0081x\3\2\2"+
		"\2\u0081|\3\2\2\2\u0082.\3\2\2\2\u0083\u0085\t\3\2\2\u0084\u0083\3\2\2"+
		"\2\u0085\u0086\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\60"+
		"\3\2\2\2\u0088\u008a\t\4\2\2\u0089\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b"+
		"\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\b\31"+
		"\2\2\u008e\62\3\2\2\2\7\2v\u0081\u0086\u008b\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}