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
		T__11=1, T__10=2, T__9=3, T__8=4, T__7=5, T__6=6, T__5=7, T__4=8, T__3=9, 
		T__2=10, T__1=11, T__0=12, COMMA=13, SEMICOLON=14, LBRACKET=15, RBRACKET=16, 
		EQUALS=17, PLUS=18, DIV=19, EQUALORLESS=20, INT=21, BOOL=22, ID=23, WS=24;
	public static final String[] tokenNames = {
		"<INVALID>", "'var'", "'else'", "'eq'", "'do'", "'and'", "'while'", "'then'", 
		"'not'", "'skip'", "'-'", "'='", "'if'", "','", "';'", "'('", "')'", "':='", 
		"'+'", "'/'", "'<='", "INT", "BOOL", "ID", "WS"
	};
	public static final int
		RULE_pgm = 0, RULE_modules = 1, RULE_body = 2, RULE_stmt = 3, RULE_bexpr = 4, 
		RULE_aexpr = 5;
	public static final String[] ruleNames = {
		"pgm", "modules", "body", "stmt", "bexpr", "aexpr"
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
		public ModulesContext modules(int i) {
			return getRuleContext(ModulesContext.class,i);
		}
		public List<ModulesContext> modules() {
			return getRuleContexts(ModulesContext.class);
		}
		public PgmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pgm; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof impVisitor ) return ((impVisitor<? extends T>)visitor).visitPgm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PgmContext pgm() throws RecognitionException {
		PgmContext _localctx = new PgmContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_pgm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(12); modules();
				}
				}
				setState(15); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__9) | (1L << T__6) | (1L << T__3) | (1L << T__0) | (1L << LBRACKET) | (1L << ID))) != 0) );
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

	public static class ModulesContext extends ParserRuleContext {
		public TerminalNode RBRACKET() { return getToken(impParser.RBRACKET, 0); }
		public TerminalNode ID() { return getToken(impParser.ID, 0); }
		public TerminalNode LBRACKET() { return getToken(impParser.LBRACKET, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public ModulesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modules; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof impVisitor ) return ((impVisitor<? extends T>)visitor).visitModules(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModulesContext modules() throws RecognitionException {
		ModulesContext _localctx = new ModulesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_modules);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(17); match(T__9);
				setState(18); match(ID);
				setState(19); match(T__1);
				setState(20); match(LBRACKET);
				}
			}

			setState(23); body();
			setState(25);
			_la = _input.LA(1);
			if (_la==RBRACKET) {
				{
				setState(24); match(RBRACKET);
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

	public static class BodyContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(impParser.ID); }
		public TerminalNode SEMICOLON() { return getToken(impParser.SEMICOLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(impParser.COMMA); }
		public TerminalNode ID(int i) {
			return getToken(impParser.ID, i);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(impParser.COMMA, i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof impVisitor ) return ((impVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_body);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(27); match(T__11);
				setState(28); match(ID);
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(29); match(COMMA);
					setState(30); match(ID);
					}
					}
					setState(35);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(36); match(SEMICOLON);
				}
			}

			setState(40); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(39); stmt(0);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(42); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class StmtContext extends ParserRuleContext {
		public List<TerminalNode> RBRACKET() { return getTokens(impParser.RBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(impParser.LBRACKET, i);
		}
		public TerminalNode ID() { return getToken(impParser.ID, 0); }
		public TerminalNode EQUALS() { return getToken(impParser.EQUALS, 0); }
		public TerminalNode SEMICOLON() { return getToken(impParser.SEMICOLON, 0); }
		public AexprContext aexpr() {
			return getRuleContext(AexprContext.class,0);
		}
		public TerminalNode RBRACKET(int i) {
			return getToken(impParser.RBRACKET, i);
		}
		public BexprContext bexpr() {
			return getRuleContext(BexprContext.class,0);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<TerminalNode> LBRACKET() { return getTokens(impParser.LBRACKET); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof impVisitor ) return ((impVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
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
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_stmt, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(45); match(T__6);
				setState(46); bexpr(0);
				setState(47); match(T__8);
				setState(48); stmt(6);
				}
				break;
			case 2:
				{
				setState(50); match(T__6);
				setState(51); match(LBRACKET);
				setState(52); bexpr(0);
				setState(53); match(RBRACKET);
				setState(54); match(T__8);
				setState(55); stmt(5);
				}
				break;
			case 3:
				{
				setState(57); match(ID);
				setState(58); match(EQUALS);
				setState(59); aexpr(0);
				setState(61);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(60); match(SEMICOLON);
					}
					break;
				}
				}
				break;
			case 4:
				{
				setState(63); match(LBRACKET);
				setState(64); stmt(0);
				setState(65); match(SEMICOLON);
				setState(66); stmt(0);
				setState(67); match(RBRACKET);
				}
				break;
			case 5:
				{
				setState(69); match(T__0);
				setState(70); bexpr(0);
				setState(71); match(T__5);
				setState(72); stmt(0);
				setState(73); match(T__10);
				setState(74); stmt(0);
				}
				break;
			case 6:
				{
				setState(76); match(T__0);
				setState(77); match(LBRACKET);
				setState(78); bexpr(0);
				setState(79); match(RBRACKET);
				setState(80); match(T__5);
				setState(81); match(LBRACKET);
				setState(82); stmt(0);
				setState(83); match(RBRACKET);
				setState(84); match(T__10);
				setState(85); match(LBRACKET);
				setState(86); stmt(0);
				setState(87); match(RBRACKET);
				}
				break;
			case 7:
				{
				setState(89); match(T__0);
				setState(90); match(LBRACKET);
				setState(91); bexpr(0);
				setState(92); match(RBRACKET);
				setState(93); match(T__5);
				setState(94); match(LBRACKET);
				setState(95); stmt(0);
				setState(96); match(RBRACKET);
				setState(97); match(T__10);
				setState(98); stmt(0);
				}
				break;
			case 8:
				{
				setState(100); match(T__0);
				setState(101); bexpr(0);
				setState(102); match(T__5);
				setState(103); stmt(0);
				setState(104); match(T__10);
				setState(105); match(LBRACKET);
				setState(106); stmt(0);
				setState(107); match(RBRACKET);
				}
				break;
			case 9:
				{
				setState(109); match(T__6);
				setState(110); bexpr(0);
				setState(111); match(T__8);
				setState(112); match(LBRACKET);
				setState(113); stmt(0);
				setState(114); match(RBRACKET);
				}
				break;
			case 10:
				{
				setState(116); match(T__6);
				setState(117); match(LBRACKET);
				setState(118); bexpr(0);
				setState(119); match(RBRACKET);
				setState(120); match(T__8);
				setState(121); match(LBRACKET);
				setState(122); stmt(0);
				setState(123); match(RBRACKET);
				}
				break;
			case 11:
				{
				setState(125); match(ID);
				setState(127);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(126); match(SEMICOLON);
					}
					break;
				}
				}
				break;
			case 12:
				{
				setState(129); match(T__3);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(137);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StmtContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_stmt);
					setState(132);
					if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
					setState(133); match(SEMICOLON);
					setState(134); stmt(13);
					}
					} 
				}
				setState(139);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
		public TerminalNode RBRACKET() { return getToken(impParser.RBRACKET, 0); }
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
		public TerminalNode LBRACKET() { return getToken(impParser.LBRACKET, 0); }
		public AexprContext aexpr(int i) {
			return getRuleContext(AexprContext.class,i);
		}
		public BexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bexpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof impVisitor ) return ((impVisitor<? extends T>)visitor).visitBexpr(this);
			else return visitor.visitChildren(this);
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
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_bexpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(141); match(T__4);
				setState(142); bexpr(3);
				}
				break;
			case 2:
				{
				setState(143); match(BOOL);
				}
				break;
			case 3:
				{
				setState(144); aexpr(0);
				setState(145); match(EQUALORLESS);
				setState(146); aexpr(0);
				}
				break;
			case 4:
				{
				setState(148); match(LBRACKET);
				setState(149); aexpr(0);
				setState(150); match(EQUALORLESS);
				setState(151); aexpr(0);
				setState(152); match(RBRACKET);
				}
				break;
			case 5:
				{
				setState(154); match(T__4);
				setState(155); match(LBRACKET);
				setState(156); bexpr(0);
				setState(157); match(RBRACKET);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(166);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BexprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_bexpr);
					setState(161);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(162); match(T__7);
					setState(163); bexpr(2);
					}
					} 
				}
				setState(168);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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
		public TerminalNode RBRACKET() { return getToken(impParser.RBRACKET, 0); }
		public TerminalNode ID() { return getToken(impParser.ID, 0); }
		public List<AexprContext> aexpr() {
			return getRuleContexts(AexprContext.class);
		}
		public TerminalNode LBRACKET() { return getToken(impParser.LBRACKET, 0); }
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof impVisitor ) return ((impVisitor<? extends T>)visitor).visitAexpr(this);
			else return visitor.visitChildren(this);
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
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_aexpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(170); match(INT);
				}
				break;
			case 2:
				{
				setState(171); match(T__2);
				setState(172); match(INT);
				}
				break;
			case 3:
				{
				setState(173); match(LBRACKET);
				setState(174); match(T__2);
				setState(175); match(INT);
				setState(176); match(RBRACKET);
				}
				break;
			case 4:
				{
				setState(177); match(ID);
				}
				break;
			case 5:
				{
				setState(178); match(LBRACKET);
				setState(179); aexpr(0);
				setState(180); match(PLUS);
				setState(181); aexpr(0);
				setState(182); match(RBRACKET);
				}
				break;
			case 6:
				{
				setState(184); match(LBRACKET);
				setState(185); aexpr(0);
				setState(186); match(DIV);
				setState(187); aexpr(0);
				setState(188); match(RBRACKET);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(200);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(198);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new AexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_aexpr);
						setState(192);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(193); match(PLUS);
						setState(194); aexpr(5);
						}
						break;
					case 2:
						{
						_localctx = new AexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_aexpr);
						setState(195);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(196); match(DIV);
						setState(197); aexpr(3);
						}
						break;
					}
					} 
				}
				setState(202);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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
		case 3: return stmt_sempred((StmtContext)_localctx, predIndex);
		case 4: return bexpr_sempred((BexprContext)_localctx, predIndex);
		case 5: return aexpr_sempred((AexprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean aexpr_sempred(AexprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2: return precpred(_ctx, 4);
		case 3: return precpred(_ctx, 2);
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
		case 0: return precpred(_ctx, 12);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\32\u00ce\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\6\2\20\n\2\r\2\16\2\21\3"+
		"\3\3\3\3\3\3\3\5\3\30\n\3\3\3\3\3\5\3\34\n\3\3\4\3\4\3\4\3\4\7\4\"\n\4"+
		"\f\4\16\4%\13\4\3\4\5\4(\n\4\3\4\6\4+\n\4\r\4\16\4,\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5@\n\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0082\n\5\3\5\5\5\u0085\n\5\3"+
		"\5\3\5\3\5\7\5\u008a\n\5\f\5\16\5\u008d\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00a2\n\6\3\6\3"+
		"\6\3\6\7\6\u00a7\n\6\f\6\16\6\u00aa\13\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00c1\n\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\7\7\u00c9\n\7\f\7\16\7\u00cc\13\7\3\7\2\5\b\n\f"+
		"\b\2\4\6\b\n\f\2\2\u00e7\2\17\3\2\2\2\4\27\3\2\2\2\6\'\3\2\2\2\b\u0084"+
		"\3\2\2\2\n\u00a1\3\2\2\2\f\u00c0\3\2\2\2\16\20\5\4\3\2\17\16\3\2\2\2\20"+
		"\21\3\2\2\2\21\17\3\2\2\2\21\22\3\2\2\2\22\3\3\2\2\2\23\24\7\5\2\2\24"+
		"\25\7\31\2\2\25\26\7\r\2\2\26\30\7\21\2\2\27\23\3\2\2\2\27\30\3\2\2\2"+
		"\30\31\3\2\2\2\31\33\5\6\4\2\32\34\7\22\2\2\33\32\3\2\2\2\33\34\3\2\2"+
		"\2\34\5\3\2\2\2\35\36\7\3\2\2\36#\7\31\2\2\37 \7\17\2\2 \"\7\31\2\2!\37"+
		"\3\2\2\2\"%\3\2\2\2#!\3\2\2\2#$\3\2\2\2$&\3\2\2\2%#\3\2\2\2&(\7\20\2\2"+
		"\'\35\3\2\2\2\'(\3\2\2\2(*\3\2\2\2)+\5\b\5\2*)\3\2\2\2+,\3\2\2\2,*\3\2"+
		"\2\2,-\3\2\2\2-\7\3\2\2\2./\b\5\1\2/\60\7\b\2\2\60\61\5\n\6\2\61\62\7"+
		"\6\2\2\62\63\5\b\5\b\63\u0085\3\2\2\2\64\65\7\b\2\2\65\66\7\21\2\2\66"+
		"\67\5\n\6\2\678\7\22\2\289\7\6\2\29:\5\b\5\7:\u0085\3\2\2\2;<\7\31\2\2"+
		"<=\7\23\2\2=?\5\f\7\2>@\7\20\2\2?>\3\2\2\2?@\3\2\2\2@\u0085\3\2\2\2AB"+
		"\7\21\2\2BC\5\b\5\2CD\7\20\2\2DE\5\b\5\2EF\7\22\2\2F\u0085\3\2\2\2GH\7"+
		"\16\2\2HI\5\n\6\2IJ\7\t\2\2JK\5\b\5\2KL\7\4\2\2LM\5\b\5\2M\u0085\3\2\2"+
		"\2NO\7\16\2\2OP\7\21\2\2PQ\5\n\6\2QR\7\22\2\2RS\7\t\2\2ST\7\21\2\2TU\5"+
		"\b\5\2UV\7\22\2\2VW\7\4\2\2WX\7\21\2\2XY\5\b\5\2YZ\7\22\2\2Z\u0085\3\2"+
		"\2\2[\\\7\16\2\2\\]\7\21\2\2]^\5\n\6\2^_\7\22\2\2_`\7\t\2\2`a\7\21\2\2"+
		"ab\5\b\5\2bc\7\22\2\2cd\7\4\2\2de\5\b\5\2e\u0085\3\2\2\2fg\7\16\2\2gh"+
		"\5\n\6\2hi\7\t\2\2ij\5\b\5\2jk\7\4\2\2kl\7\21\2\2lm\5\b\5\2mn\7\22\2\2"+
		"n\u0085\3\2\2\2op\7\b\2\2pq\5\n\6\2qr\7\6\2\2rs\7\21\2\2st\5\b\5\2tu\7"+
		"\22\2\2u\u0085\3\2\2\2vw\7\b\2\2wx\7\21\2\2xy\5\n\6\2yz\7\22\2\2z{\7\6"+
		"\2\2{|\7\21\2\2|}\5\b\5\2}~\7\22\2\2~\u0085\3\2\2\2\177\u0081\7\31\2\2"+
		"\u0080\u0082\7\20\2\2\u0081\u0080\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0085"+
		"\3\2\2\2\u0083\u0085\7\13\2\2\u0084.\3\2\2\2\u0084\64\3\2\2\2\u0084;\3"+
		"\2\2\2\u0084A\3\2\2\2\u0084G\3\2\2\2\u0084N\3\2\2\2\u0084[\3\2\2\2\u0084"+
		"f\3\2\2\2\u0084o\3\2\2\2\u0084v\3\2\2\2\u0084\177\3\2\2\2\u0084\u0083"+
		"\3\2\2\2\u0085\u008b\3\2\2\2\u0086\u0087\f\16\2\2\u0087\u0088\7\20\2\2"+
		"\u0088\u008a\5\b\5\17\u0089\u0086\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089"+
		"\3\2\2\2\u008b\u008c\3\2\2\2\u008c\t\3\2\2\2\u008d\u008b\3\2\2\2\u008e"+
		"\u008f\b\6\1\2\u008f\u0090\7\n\2\2\u0090\u00a2\5\n\6\5\u0091\u00a2\7\30"+
		"\2\2\u0092\u0093\5\f\7\2\u0093\u0094\7\26\2\2\u0094\u0095\5\f\7\2\u0095"+
		"\u00a2\3\2\2\2\u0096\u0097\7\21\2\2\u0097\u0098\5\f\7\2\u0098\u0099\7"+
		"\26\2\2\u0099\u009a\5\f\7\2\u009a\u009b\7\22\2\2\u009b\u00a2\3\2\2\2\u009c"+
		"\u009d\7\n\2\2\u009d\u009e\7\21\2\2\u009e\u009f\5\n\6\2\u009f\u00a0\7"+
		"\22\2\2\u00a0\u00a2\3\2\2\2\u00a1\u008e\3\2\2\2\u00a1\u0091\3\2\2\2\u00a1"+
		"\u0092\3\2\2\2\u00a1\u0096\3\2\2\2\u00a1\u009c\3\2\2\2\u00a2\u00a8\3\2"+
		"\2\2\u00a3\u00a4\f\3\2\2\u00a4\u00a5\7\7\2\2\u00a5\u00a7\5\n\6\4\u00a6"+
		"\u00a3\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2"+
		"\2\2\u00a9\13\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ac\b\7\1\2\u00ac\u00c1"+
		"\7\27\2\2\u00ad\u00ae\7\f\2\2\u00ae\u00c1\7\27\2\2\u00af\u00b0\7\21\2"+
		"\2\u00b0\u00b1\7\f\2\2\u00b1\u00b2\7\27\2\2\u00b2\u00c1\7\22\2\2\u00b3"+
		"\u00c1\7\31\2\2\u00b4\u00b5\7\21\2\2\u00b5\u00b6\5\f\7\2\u00b6\u00b7\7"+
		"\24\2\2\u00b7\u00b8\5\f\7\2\u00b8\u00b9\7\22\2\2\u00b9\u00c1\3\2\2\2\u00ba"+
		"\u00bb\7\21\2\2\u00bb\u00bc\5\f\7\2\u00bc\u00bd\7\25\2\2\u00bd\u00be\5"+
		"\f\7\2\u00be\u00bf\7\22\2\2\u00bf\u00c1\3\2\2\2\u00c0\u00ab\3\2\2\2\u00c0"+
		"\u00ad\3\2\2\2\u00c0\u00af\3\2\2\2\u00c0\u00b3\3\2\2\2\u00c0\u00b4\3\2"+
		"\2\2\u00c0\u00ba\3\2\2\2\u00c1\u00ca\3\2\2\2\u00c2\u00c3\f\6\2\2\u00c3"+
		"\u00c4\7\24\2\2\u00c4\u00c9\5\f\7\7\u00c5\u00c6\f\4\2\2\u00c6\u00c7\7"+
		"\25\2\2\u00c7\u00c9\5\f\7\5\u00c8\u00c2\3\2\2\2\u00c8\u00c5\3\2\2\2\u00c9"+
		"\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\r\3\2\2\2"+
		"\u00cc\u00ca\3\2\2\2\21\21\27\33#\',?\u0081\u0084\u008b\u00a1\u00a8\u00c0"+
		"\u00c8\u00ca";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}