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
		T__7=1, T__6=2, T__5=3, T__4=4, T__3=5, T__2=6, T__1=7, T__0=8, COMMA=9, 
		SEMICOLON=10, LBRACKET=11, RBRACKET=12, EQUALS=13, PLUS=14, DIV=15, EQUALORLESS=16, 
		INT=17, BOOL=18, ID=19, WS=20;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'"
	};
	public static final String[] ruleNames = {
		"T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "COMMA", 
		"SEMICOLON", "LBRACKET", "RBRACKET", "EQUALS", "PLUS", "DIV", "EQUALORLESS", 
		"INT", "BOOL", "ID", "WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\26{\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16"+
		"\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22\6\22a\n\22\r\22\16\22b\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23n\n\23\3\24\6\24q\n\24"+
		"\r\24\16\24r\3\25\6\25v\n\25\r\25\16\25w\3\25\3\25\2\2\26\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26\3\2\5\3\2\62;\3\2C|\5\2\13\f\17\17\"\"~\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\3+\3\2\2\2\5/\3\2\2\2\7\64\3\2\2\2\t\67\3\2\2\2"+
		"\13;\3\2\2\2\rA\3\2\2\2\17F\3\2\2\2\21J\3\2\2\2\23M\3\2\2\2\25O\3\2\2"+
		"\2\27Q\3\2\2\2\31S\3\2\2\2\33U\3\2\2\2\35X\3\2\2\2\37Z\3\2\2\2!\\\3\2"+
		"\2\2#`\3\2\2\2%m\3\2\2\2\'p\3\2\2\2)u\3\2\2\2+,\7x\2\2,-\7c\2\2-.\7t\2"+
		"\2.\4\3\2\2\2/\60\7g\2\2\60\61\7n\2\2\61\62\7u\2\2\62\63\7g\2\2\63\6\3"+
		"\2\2\2\64\65\7f\2\2\65\66\7q\2\2\66\b\3\2\2\2\678\7c\2\289\7p\2\29:\7"+
		"f\2\2:\n\3\2\2\2;<\7y\2\2<=\7j\2\2=>\7k\2\2>?\7n\2\2?@\7g\2\2@\f\3\2\2"+
		"\2AB\7v\2\2BC\7j\2\2CD\7g\2\2DE\7p\2\2E\16\3\2\2\2FG\7p\2\2GH\7q\2\2H"+
		"I\7v\2\2I\20\3\2\2\2JK\7k\2\2KL\7h\2\2L\22\3\2\2\2MN\7.\2\2N\24\3\2\2"+
		"\2OP\7=\2\2P\26\3\2\2\2QR\7*\2\2R\30\3\2\2\2ST\7+\2\2T\32\3\2\2\2UV\7"+
		"<\2\2VW\7?\2\2W\34\3\2\2\2XY\7-\2\2Y\36\3\2\2\2Z[\7\61\2\2[ \3\2\2\2\\"+
		"]\7>\2\2]^\7?\2\2^\"\3\2\2\2_a\t\2\2\2`_\3\2\2\2ab\3\2\2\2b`\3\2\2\2b"+
		"c\3\2\2\2c$\3\2\2\2de\7V\2\2ef\7t\2\2fg\7w\2\2gn\7g\2\2hi\7H\2\2ij\7c"+
		"\2\2jk\7n\2\2kl\7u\2\2ln\7g\2\2md\3\2\2\2mh\3\2\2\2n&\3\2\2\2oq\t\3\2"+
		"\2po\3\2\2\2qr\3\2\2\2rp\3\2\2\2rs\3\2\2\2s(\3\2\2\2tv\t\4\2\2ut\3\2\2"+
		"\2vw\3\2\2\2wu\3\2\2\2wx\3\2\2\2xy\3\2\2\2yz\b\25\2\2z*\3\2\2\2\7\2bm"+
		"rw\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}