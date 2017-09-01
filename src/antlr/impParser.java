package antlr;

// Generated from imp.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class impParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__7=1, T__6=2, T__5=3, T__4=4, T__3=5, T__2=6, T__1=7, T__0=8, COMMA=9, 
		SEMICOLON=10, LBRACKET=11, RBRACKET=12, EQUALS=13, PLUS=14, DIV=15, EQUALORLESS=16, 
		INT=17, BOOL=18, ID=19, WS=20;
	public static final String[] tokenNames = {
		"<INVALID>", "'var'", "'else'", "'do'", "'and'", "'while'", "'then'", 
		"'not'", "'if'", "','", "';'", "'('", "')'", "':='", "'+'", "'/'", "'<='", 
		"INT", "BOOL", "ID", "WS"
	};
	public static final int
		RULE_pgm = 0, RULE_stmt = 1, RULE_bexpr = 2, RULE_aexpr = 3;
	public static final String[] ruleNames = {
		"pgm", "stmt", "bexpr", "aexpr"
	};

	@Override
	public String getGrammarFileName() { return "imp.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public impParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class PgmContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(impParser.ID); }
		public TerminalNode SEMICOLON() { return getToken(impParser.SEMICOLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(impParser.COMMA); }
		public TerminalNode ID(int i) {
			return getToken(impParser.ID, i);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public TerminalNode COMMA(int i) {
			return getToken(impParser.COMMA, i);
		}
		public PgmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pgm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof impListener ) ((impListener)listener).enterPgm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof impListener ) ((impListener)listener).exitPgm(this);
		}
	}

	public final PgmContext pgm() throws RecognitionException {
		PgmContext _localctx = new PgmContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_pgm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(8); match(T__7);
				setState(9); match(ID);
				setState(14);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(10); match(COMMA);
					setState(11); match(ID);
					}
					}
					setState(16);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(17); match(SEMICOLON);
				}
				break;
			}
			setState(20); stmt(0);
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

	public static class StmtContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(impParser.ID, 0); }
		public TerminalNode EQUALS() { return getToken(impParser.EQUALS, 0); }
		public TerminalNode SEMICOLON() { return getToken(impParser.SEMICOLON, 0); }
		public AexprContext aexpr() {
			return getRuleContext(AexprContext.class,0);
		}
		public BexprContext bexpr() {
			return getRuleContext(BexprContext.class,0);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof impListener ) ((impListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof impListener ) ((impListener)listener).exitStmt(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		return stmt(0);
	}

	private StmtContext stmt(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StmtContext _localctx = new StmtContext(_ctx, _parentState);
		StmtContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_stmt, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(23); match(T__3);
				setState(24); bexpr(0);
				setState(25); match(T__5);
				setState(26); stmt(2);
				}
				break;
			case 2:
				{
				setState(28); match(ID);
				setState(29); match(EQUALS);
				setState(30); aexpr(0);
				}
				break;
			case 3:
				{
				setState(31); match(T__0);
				setState(32); bexpr(0);
				setState(33); match(T__2);
				setState(34); stmt(0);
				setState(35); match(T__6);
				setState(36); stmt(0);
				}
				break;
			case 4:
				{
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(46);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StmtContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_stmt);
					setState(41);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(42); match(SEMICOLON);
					setState(43); stmt(5);
					}
					} 
				}
				setState(48);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	public static class BexprContext extends ParserRuleContext {
		public TerminalNode BOOL() { return getToken(impParser.BOOL, 0); }
		public List<AexprContext> aexpr() {
			return getRuleContexts(AexprContext.class);
		}
		public BexprContext bexpr(int i) {
			return getRuleContext(BexprContext.class,i);
		}
		public TerminalNode EQUALORLESS() { return getToken(impParser.EQUALORLESS, 0); }
		public List<BexprContext> bexpr() {
			return getRuleContexts(BexprContext.class);
		}
		public AexprContext aexpr(int i) {
			return getRuleContext(AexprContext.class,i);
		}
		public BexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof impListener ) ((impListener)listener).enterBexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof impListener ) ((impListener)listener).exitBexpr(this);
		}
	}

	public final BexprContext bexpr() throws RecognitionException {
		return bexpr(0);
	}

	private BexprContext bexpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BexprContext _localctx = new BexprContext(_ctx, _parentState);
		BexprContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_bexpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(50); match(T__1);
				setState(51); bexpr(2);
				}
				break;
			case BOOL:
				{
				setState(52); match(BOOL);
				}
				break;
			case INT:
			case ID:
				{
				setState(53); aexpr(0);
				setState(54); match(EQUALORLESS);
				setState(55); aexpr(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(64);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BexprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_bexpr);
					setState(59);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(60); match(T__4);
					setState(61); bexpr(2);
					}
					} 
				}
				setState(66);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class AexprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(impParser.ID, 0); }
		public List<AexprContext> aexpr() {
			return getRuleContexts(AexprContext.class);
		}
		public TerminalNode PLUS() { return getToken(impParser.PLUS, 0); }
		public TerminalNode INT() { return getToken(impParser.INT, 0); }
		public AexprContext aexpr(int i) {
			return getRuleContext(AexprContext.class,i);
		}
		public TerminalNode DIV() { return getToken(impParser.DIV, 0); }
		public AexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof impListener ) ((impListener)listener).enterAexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof impListener ) ((impListener)listener).exitAexpr(this);
		}
	}

	public final AexprContext aexpr() throws RecognitionException {
		return aexpr(0);
	}

	private AexprContext aexpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AexprContext _localctx = new AexprContext(_ctx, _parentState);
		AexprContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_aexpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(68); match(INT);
				}
				break;
			case ID:
				{
				setState(69); match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(80);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(78);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new AexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_aexpr);
						setState(72);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(73); match(PLUS);
						setState(74); aexpr(3);
						}
						break;
					case 2:
						{
						_localctx = new AexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_aexpr);
						setState(75);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(76); match(DIV);
						setState(77); aexpr(2);
						}
						break;
					}
					} 
				}
				setState(82);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1: return stmt_sempred((StmtContext)_localctx, predIndex);
		case 2: return bexpr_sempred((BexprContext)_localctx, predIndex);
		case 3: return aexpr_sempred((AexprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean aexpr_sempred(AexprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2: return precpred(_ctx, 2);
		case 3: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean bexpr_sempred(BexprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean stmt_sempred(StmtContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\26V\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\3\2\7\2\17\n\2\f\2\16\2\22\13\2\3\2\5\2"+
		"\25\n\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\5\3*\n\3\3\3\3\3\3\3\7\3/\n\3\f\3\16\3\62\13\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\5\4<\n\4\3\4\3\4\3\4\7\4A\n\4\f\4\16\4D\13\4"+
		"\3\5\3\5\3\5\5\5I\n\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5Q\n\5\f\5\16\5T\13\5"+
		"\3\5\2\5\4\6\b\6\2\4\6\b\2\2]\2\24\3\2\2\2\4)\3\2\2\2\6;\3\2\2\2\bH\3"+
		"\2\2\2\n\13\7\3\2\2\13\20\7\25\2\2\f\r\7\13\2\2\r\17\7\25\2\2\16\f\3\2"+
		"\2\2\17\22\3\2\2\2\20\16\3\2\2\2\20\21\3\2\2\2\21\23\3\2\2\2\22\20\3\2"+
		"\2\2\23\25\7\f\2\2\24\n\3\2\2\2\24\25\3\2\2\2\25\26\3\2\2\2\26\27\5\4"+
		"\3\2\27\3\3\2\2\2\30\31\b\3\1\2\31\32\7\7\2\2\32\33\5\6\4\2\33\34\7\5"+
		"\2\2\34\35\5\4\3\4\35*\3\2\2\2\36\37\7\25\2\2\37 \7\17\2\2 *\5\b\5\2!"+
		"\"\7\n\2\2\"#\5\6\4\2#$\7\b\2\2$%\5\4\3\2%&\7\4\2\2&\'\5\4\3\2\'*\3\2"+
		"\2\2(*\3\2\2\2)\30\3\2\2\2)\36\3\2\2\2)!\3\2\2\2)(\3\2\2\2*\60\3\2\2\2"+
		"+,\f\6\2\2,-\7\f\2\2-/\5\4\3\7.+\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2\60\61"+
		"\3\2\2\2\61\5\3\2\2\2\62\60\3\2\2\2\63\64\b\4\1\2\64\65\7\t\2\2\65<\5"+
		"\6\4\4\66<\7\24\2\2\678\5\b\5\289\7\22\2\29:\5\b\5\2:<\3\2\2\2;\63\3\2"+
		"\2\2;\66\3\2\2\2;\67\3\2\2\2<B\3\2\2\2=>\f\3\2\2>?\7\6\2\2?A\5\6\4\4@"+
		"=\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2C\7\3\2\2\2DB\3\2\2\2EF\b\5\1\2"+
		"FI\7\23\2\2GI\7\25\2\2HE\3\2\2\2HG\3\2\2\2IR\3\2\2\2JK\f\4\2\2KL\7\20"+
		"\2\2LQ\5\b\5\5MN\f\3\2\2NO\7\21\2\2OQ\5\b\5\4PJ\3\2\2\2PM\3\2\2\2QT\3"+
		"\2\2\2RP\3\2\2\2RS\3\2\2\2S\t\3\2\2\2TR\3\2\2\2\13\20\24)\60;BHPR";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}