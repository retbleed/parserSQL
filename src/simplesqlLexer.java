// Generated from D:/Projects/parserSQL/src\simplesql.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class simplesqlLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		SELECT=10, INSERT=11, INTO=12, VALUES=13, UPDATE=14, SET=15, DELETE=16, 
		FROM=17, WHERE=18, AND=19, OR=20, ID=21, INT=22, STRING=23, WS=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"SELECT", "INSERT", "INTO", "VALUES", "UPDATE", "SET", "DELETE", "FROM", 
			"WHERE", "AND", "OR", "ID", "INT", "STRING", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'('", "')'", "'='", "'<>'", "'<'", "'>'", "'<='", "'>='", 
			"'SELECT'", "'INSERT'", "'INTO'", "'VALUES'", "'UPDATE'", "'SET'", "'DELETE'", 
			"'FROM'", "'WHERE'", "'AND'", "'OR'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "SELECT", 
			"INSERT", "INTO", "VALUES", "UPDATE", "SET", "DELETE", "FROM", "WHERE", 
			"AND", "OR", "ID", "INT", "STRING", "WS"
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


	public simplesqlLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "simplesql.g4"; }

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
		"\u0004\u0000\u0018\u00a0\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0014\u0001\u0014\u0005\u0014\u0087\b\u0014\n\u0014"+
		"\f\u0014\u008a\t\u0014\u0001\u0015\u0004\u0015\u008d\b\u0015\u000b\u0015"+
		"\f\u0015\u008e\u0001\u0016\u0001\u0016\u0005\u0016\u0093\b\u0016\n\u0016"+
		"\f\u0016\u0096\t\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0004\u0017"+
		"\u009b\b\u0017\u000b\u0017\f\u0017\u009c\u0001\u0017\u0001\u0017\u0000"+
		"\u0000\u0018\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b"+
		"\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b"+
		"\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016"+
		"-\u0017/\u0018\u0001\u0000\u0005\u0003\u0000AZ__az\u0004\u000009AZ__a"+
		"z\u0001\u000009\u0003\u0000\n\n\r\r\'\'\u0003\u0000\t\n\r\r  \u00a3\u0000"+
		"\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000"+
		"\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000"+
		"\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r"+
		"\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000"+
		"\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000"+
		"\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/"+
		"\u0001\u0000\u0000\u0000\u00011\u0001\u0000\u0000\u0000\u00033\u0001\u0000"+
		"\u0000\u0000\u00055\u0001\u0000\u0000\u0000\u00077\u0001\u0000\u0000\u0000"+
		"\t9\u0001\u0000\u0000\u0000\u000b<\u0001\u0000\u0000\u0000\r>\u0001\u0000"+
		"\u0000\u0000\u000f@\u0001\u0000\u0000\u0000\u0011C\u0001\u0000\u0000\u0000"+
		"\u0013F\u0001\u0000\u0000\u0000\u0015M\u0001\u0000\u0000\u0000\u0017T"+
		"\u0001\u0000\u0000\u0000\u0019Y\u0001\u0000\u0000\u0000\u001b`\u0001\u0000"+
		"\u0000\u0000\u001dg\u0001\u0000\u0000\u0000\u001fk\u0001\u0000\u0000\u0000"+
		"!r\u0001\u0000\u0000\u0000#w\u0001\u0000\u0000\u0000%}\u0001\u0000\u0000"+
		"\u0000\'\u0081\u0001\u0000\u0000\u0000)\u0084\u0001\u0000\u0000\u0000"+
		"+\u008c\u0001\u0000\u0000\u0000-\u0090\u0001\u0000\u0000\u0000/\u009a"+
		"\u0001\u0000\u0000\u000012\u0005,\u0000\u00002\u0002\u0001\u0000\u0000"+
		"\u000034\u0005(\u0000\u00004\u0004\u0001\u0000\u0000\u000056\u0005)\u0000"+
		"\u00006\u0006\u0001\u0000\u0000\u000078\u0005=\u0000\u00008\b\u0001\u0000"+
		"\u0000\u00009:\u0005<\u0000\u0000:;\u0005>\u0000\u0000;\n\u0001\u0000"+
		"\u0000\u0000<=\u0005<\u0000\u0000=\f\u0001\u0000\u0000\u0000>?\u0005>"+
		"\u0000\u0000?\u000e\u0001\u0000\u0000\u0000@A\u0005<\u0000\u0000AB\u0005"+
		"=\u0000\u0000B\u0010\u0001\u0000\u0000\u0000CD\u0005>\u0000\u0000DE\u0005"+
		"=\u0000\u0000E\u0012\u0001\u0000\u0000\u0000FG\u0005S\u0000\u0000GH\u0005"+
		"E\u0000\u0000HI\u0005L\u0000\u0000IJ\u0005E\u0000\u0000JK\u0005C\u0000"+
		"\u0000KL\u0005T\u0000\u0000L\u0014\u0001\u0000\u0000\u0000MN\u0005I\u0000"+
		"\u0000NO\u0005N\u0000\u0000OP\u0005S\u0000\u0000PQ\u0005E\u0000\u0000"+
		"QR\u0005R\u0000\u0000RS\u0005T\u0000\u0000S\u0016\u0001\u0000\u0000\u0000"+
		"TU\u0005I\u0000\u0000UV\u0005N\u0000\u0000VW\u0005T\u0000\u0000WX\u0005"+
		"O\u0000\u0000X\u0018\u0001\u0000\u0000\u0000YZ\u0005V\u0000\u0000Z[\u0005"+
		"A\u0000\u0000[\\\u0005L\u0000\u0000\\]\u0005U\u0000\u0000]^\u0005E\u0000"+
		"\u0000^_\u0005S\u0000\u0000_\u001a\u0001\u0000\u0000\u0000`a\u0005U\u0000"+
		"\u0000ab\u0005P\u0000\u0000bc\u0005D\u0000\u0000cd\u0005A\u0000\u0000"+
		"de\u0005T\u0000\u0000ef\u0005E\u0000\u0000f\u001c\u0001\u0000\u0000\u0000"+
		"gh\u0005S\u0000\u0000hi\u0005E\u0000\u0000ij\u0005T\u0000\u0000j\u001e"+
		"\u0001\u0000\u0000\u0000kl\u0005D\u0000\u0000lm\u0005E\u0000\u0000mn\u0005"+
		"L\u0000\u0000no\u0005E\u0000\u0000op\u0005T\u0000\u0000pq\u0005E\u0000"+
		"\u0000q \u0001\u0000\u0000\u0000rs\u0005F\u0000\u0000st\u0005R\u0000\u0000"+
		"tu\u0005O\u0000\u0000uv\u0005M\u0000\u0000v\"\u0001\u0000\u0000\u0000"+
		"wx\u0005W\u0000\u0000xy\u0005H\u0000\u0000yz\u0005E\u0000\u0000z{\u0005"+
		"R\u0000\u0000{|\u0005E\u0000\u0000|$\u0001\u0000\u0000\u0000}~\u0005A"+
		"\u0000\u0000~\u007f\u0005N\u0000\u0000\u007f\u0080\u0005D\u0000\u0000"+
		"\u0080&\u0001\u0000\u0000\u0000\u0081\u0082\u0005O\u0000\u0000\u0082\u0083"+
		"\u0005R\u0000\u0000\u0083(\u0001\u0000\u0000\u0000\u0084\u0088\u0007\u0000"+
		"\u0000\u0000\u0085\u0087\u0007\u0001\u0000\u0000\u0086\u0085\u0001\u0000"+
		"\u0000\u0000\u0087\u008a\u0001\u0000\u0000\u0000\u0088\u0086\u0001\u0000"+
		"\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089*\u0001\u0000\u0000"+
		"\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008b\u008d\u0007\u0002\u0000"+
		"\u0000\u008c\u008b\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000"+
		"\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000"+
		"\u0000\u008f,\u0001\u0000\u0000\u0000\u0090\u0094\u0005\'\u0000\u0000"+
		"\u0091\u0093\b\u0003\u0000\u0000\u0092\u0091\u0001\u0000\u0000\u0000\u0093"+
		"\u0096\u0001\u0000\u0000\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0094"+
		"\u0095\u0001\u0000\u0000\u0000\u0095\u0097\u0001\u0000\u0000\u0000\u0096"+
		"\u0094\u0001\u0000\u0000\u0000\u0097\u0098\u0005\'\u0000\u0000\u0098."+
		"\u0001\u0000\u0000\u0000\u0099\u009b\u0007\u0004\u0000\u0000\u009a\u0099"+
		"\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u009a"+
		"\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u009e"+
		"\u0001\u0000\u0000\u0000\u009e\u009f\u0006\u0017\u0000\u0000\u009f0\u0001"+
		"\u0000\u0000\u0000\u0005\u0000\u0088\u008e\u0094\u009c\u0001\u0006\u0000"+
		"\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}