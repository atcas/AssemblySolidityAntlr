// Generated from Assembly.g4 by ANTLR 4.5
package com.atcas.grammar.antrl.assembly.base;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AssemblyParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, Identifier=23, HexLiteral=24, 
		StringLiteral=25, HexNumber=26, DecimalNumber=27, WhiteSpaces=28, MultiLineComment=29, 
		SingleLineComment=30, NEWLINE=31, WS=32;
	public static final int
		RULE_assemblyBlockProgram = 0, RULE_assemblyBlock = 1, RULE_assemblyItem = 2, 
		RULE_dataValue = 3, RULE_functionalAssemblyExpression = 4, RULE_assemblyLocalDefinition = 5, 
		RULE_functionalAssemblyAssignment = 6, RULE_identifierOrList = 7, RULE_identifierList = 8, 
		RULE_assemblyAssignment = 9, RULE_labelDefinition = 10, RULE_assemblySwitch = 11, 
		RULE_assemblyCase = 12, RULE_assemblyFunctionDefinition = 13, RULE_assemblyFor = 14, 
		RULE_subAssembly = 15, RULE_linkerSymbol = 16, RULE_numberLiteral = 17;
	public static final String[] ruleNames = {
		"assemblyBlockProgram", "assemblyBlock", "assemblyItem", "dataValue", 
		"functionalAssemblyExpression", "assemblyLocalDefinition", "functionalAssemblyAssignment", 
		"identifierOrList", "identifierList", "assemblyAssignment", "labelDefinition", 
		"assemblySwitch", "assemblyCase", "assemblyFunctionDefinition", "assemblyFor", 
		"subAssembly", "linkerSymbol", "numberLiteral"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'assembly'", "'{'", "'}'", "'break'", "'continue'", "'dataSize'", 
		"'('", "')'", "'errorLabel'", "'bytecodeSize'", "','", "'let'", "':='", 
		"'=:'", "':'", "'switch'", "'default'", "'case'", "'function'", "'->'", 
		"'for'", "'linkerSymbol'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, "Identifier", 
		"HexLiteral", "StringLiteral", "HexNumber", "DecimalNumber", "WhiteSpaces", 
		"MultiLineComment", "SingleLineComment", "NEWLINE", "WS"
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

	@Override
	public String getGrammarFileName() { return "Assembly.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AssemblyParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class AssemblyBlockProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(AssemblyParser.EOF, 0); }
		public List<AssemblyBlockContext> assemblyBlock() {
			return getRuleContexts(AssemblyBlockContext.class);
		}
		public AssemblyBlockContext assemblyBlock(int i) {
			return getRuleContext(AssemblyBlockContext.class,i);
		}
		public AssemblyBlockProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyBlockProgram; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).enterAssemblyBlockProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).exitAssemblyBlockProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblyVisitor ) return ((AssemblyVisitor<? extends T>)visitor).visitAssemblyBlockProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblyBlockProgramContext assemblyBlockProgram() throws RecognitionException {
		AssemblyBlockProgramContext _localctx = new AssemblyBlockProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_assemblyBlockProgram);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(T__0);
			setState(38); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(37);
				assemblyBlock();
				}
				}
				setState(40); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__1 );
			setState(42);
			match(EOF);
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

	public static class AssemblyBlockContext extends ParserRuleContext {
		public List<AssemblyItemContext> assemblyItem() {
			return getRuleContexts(AssemblyItemContext.class);
		}
		public AssemblyItemContext assemblyItem(int i) {
			return getRuleContext(AssemblyItemContext.class,i);
		}
		public AssemblyBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).enterAssemblyBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).exitAssemblyBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblyVisitor ) return ((AssemblyVisitor<? extends T>)visitor).visitAssemblyBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblyBlockContext assemblyBlock() throws RecognitionException {
		AssemblyBlockContext _localctx = new AssemblyBlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_assemblyBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(T__1);
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << T__13) | (1L << T__15) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << Identifier) | (1L << HexLiteral) | (1L << StringLiteral) | (1L << HexNumber) | (1L << DecimalNumber))) != 0)) {
				{
				{
				setState(45);
				assemblyItem();
				}
				}
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(51);
			match(T__2);
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

	public static class AssemblyItemContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AssemblyParser.Identifier, 0); }
		public AssemblyBlockContext assemblyBlock() {
			return getRuleContext(AssemblyBlockContext.class,0);
		}
		public FunctionalAssemblyExpressionContext functionalAssemblyExpression() {
			return getRuleContext(FunctionalAssemblyExpressionContext.class,0);
		}
		public AssemblyLocalDefinitionContext assemblyLocalDefinition() {
			return getRuleContext(AssemblyLocalDefinitionContext.class,0);
		}
		public FunctionalAssemblyAssignmentContext functionalAssemblyAssignment() {
			return getRuleContext(FunctionalAssemblyAssignmentContext.class,0);
		}
		public AssemblyAssignmentContext assemblyAssignment() {
			return getRuleContext(AssemblyAssignmentContext.class,0);
		}
		public LabelDefinitionContext labelDefinition() {
			return getRuleContext(LabelDefinitionContext.class,0);
		}
		public AssemblySwitchContext assemblySwitch() {
			return getRuleContext(AssemblySwitchContext.class,0);
		}
		public AssemblyFunctionDefinitionContext assemblyFunctionDefinition() {
			return getRuleContext(AssemblyFunctionDefinitionContext.class,0);
		}
		public AssemblyForContext assemblyFor() {
			return getRuleContext(AssemblyForContext.class,0);
		}
		public SubAssemblyContext subAssembly() {
			return getRuleContext(SubAssemblyContext.class,0);
		}
		public LinkerSymbolContext linkerSymbol() {
			return getRuleContext(LinkerSymbolContext.class,0);
		}
		public NumberLiteralContext numberLiteral() {
			return getRuleContext(NumberLiteralContext.class,0);
		}
		public TerminalNode StringLiteral() { return getToken(AssemblyParser.StringLiteral, 0); }
		public TerminalNode HexLiteral() { return getToken(AssemblyParser.HexLiteral, 0); }
		public AssemblyItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).enterAssemblyItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).exitAssemblyItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblyVisitor ) return ((AssemblyVisitor<? extends T>)visitor).visitAssemblyItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblyItemContext assemblyItem() throws RecognitionException {
		AssemblyItemContext _localctx = new AssemblyItemContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assemblyItem);
		try {
			setState(76);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				assemblyBlock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(55);
				functionalAssemblyExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(56);
				assemblyLocalDefinition();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(57);
				functionalAssemblyAssignment();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(58);
				assemblyAssignment();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(59);
				labelDefinition();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(60);
				assemblySwitch();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(61);
				assemblyFunctionDefinition();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(62);
				assemblyFor();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(63);
				match(T__3);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(64);
				match(T__4);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(65);
				subAssembly();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(66);
				match(T__5);
				setState(67);
				match(T__6);
				setState(68);
				match(Identifier);
				setState(69);
				match(T__7);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(70);
				linkerSymbol();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(71);
				match(T__8);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(72);
				match(T__9);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(73);
				numberLiteral();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(74);
				match(StringLiteral);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(75);
				match(HexLiteral);
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

	public static class DataValueContext extends ParserRuleContext {
		public NumberLiteralContext numberLiteral() {
			return getRuleContext(NumberLiteralContext.class,0);
		}
		public TerminalNode StringLiteral() { return getToken(AssemblyParser.StringLiteral, 0); }
		public TerminalNode HexLiteral() { return getToken(AssemblyParser.HexLiteral, 0); }
		public TerminalNode Identifier() { return getToken(AssemblyParser.Identifier, 0); }
		public DataValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).enterDataValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).exitDataValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblyVisitor ) return ((AssemblyVisitor<? extends T>)visitor).visitDataValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataValueContext dataValue() throws RecognitionException {
		DataValueContext _localctx = new DataValueContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_dataValue);
		try {
			setState(82);
			switch (_input.LA(1)) {
			case HexNumber:
			case DecimalNumber:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				numberLiteral();
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				match(StringLiteral);
				}
				break;
			case HexLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(80);
				match(HexLiteral);
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 4);
				{
				setState(81);
				match(Identifier);
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

	public static class FunctionalAssemblyExpressionContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AssemblyParser.Identifier, 0); }
		public List<AssemblyItemContext> assemblyItem() {
			return getRuleContexts(AssemblyItemContext.class);
		}
		public AssemblyItemContext assemblyItem(int i) {
			return getRuleContext(AssemblyItemContext.class,i);
		}
		public FunctionalAssemblyExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionalAssemblyExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).enterFunctionalAssemblyExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).exitFunctionalAssemblyExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblyVisitor ) return ((AssemblyVisitor<? extends T>)visitor).visitFunctionalAssemblyExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionalAssemblyExpressionContext functionalAssemblyExpression() throws RecognitionException {
		FunctionalAssemblyExpressionContext _localctx = new FunctionalAssemblyExpressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_functionalAssemblyExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(Identifier);
			setState(85);
			match(T__6);
			setState(94);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << T__13) | (1L << T__15) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << Identifier) | (1L << HexLiteral) | (1L << StringLiteral) | (1L << HexNumber) | (1L << DecimalNumber))) != 0)) {
				{
				setState(86);
				assemblyItem();
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(87);
					match(T__10);
					setState(88);
					assemblyItem();
					}
					}
					setState(93);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(96);
			match(T__7);
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

	public static class AssemblyLocalDefinitionContext extends ParserRuleContext {
		public IdentifierOrListContext identifierOrList() {
			return getRuleContext(IdentifierOrListContext.class,0);
		}
		public FunctionalAssemblyExpressionContext functionalAssemblyExpression() {
			return getRuleContext(FunctionalAssemblyExpressionContext.class,0);
		}
		public DataValueContext dataValue() {
			return getRuleContext(DataValueContext.class,0);
		}
		public AssemblyLocalDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyLocalDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).enterAssemblyLocalDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).exitAssemblyLocalDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblyVisitor ) return ((AssemblyVisitor<? extends T>)visitor).visitAssemblyLocalDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblyLocalDefinitionContext assemblyLocalDefinition() throws RecognitionException {
		AssemblyLocalDefinitionContext _localctx = new AssemblyLocalDefinitionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assemblyLocalDefinition);
		try {
			setState(108);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				match(T__11);
				setState(99);
				identifierOrList();
				setState(100);
				match(T__12);
				setState(101);
				functionalAssemblyExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				match(T__11);
				setState(104);
				identifierOrList();
				setState(105);
				match(T__12);
				setState(106);
				dataValue();
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

	public static class FunctionalAssemblyAssignmentContext extends ParserRuleContext {
		public IdentifierOrListContext identifierOrList() {
			return getRuleContext(IdentifierOrListContext.class,0);
		}
		public FunctionalAssemblyExpressionContext functionalAssemblyExpression() {
			return getRuleContext(FunctionalAssemblyExpressionContext.class,0);
		}
		public DataValueContext dataValue() {
			return getRuleContext(DataValueContext.class,0);
		}
		public FunctionalAssemblyAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionalAssemblyAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).enterFunctionalAssemblyAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).exitFunctionalAssemblyAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblyVisitor ) return ((AssemblyVisitor<? extends T>)visitor).visitFunctionalAssemblyAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionalAssemblyAssignmentContext functionalAssemblyAssignment() throws RecognitionException {
		FunctionalAssemblyAssignmentContext _localctx = new FunctionalAssemblyAssignmentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_functionalAssemblyAssignment);
		try {
			setState(118);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				identifierOrList();
				setState(111);
				match(T__12);
				setState(112);
				functionalAssemblyExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				identifierOrList();
				setState(115);
				match(T__12);
				setState(116);
				dataValue();
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

	public static class IdentifierOrListContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AssemblyParser.Identifier, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public IdentifierOrListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierOrList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).enterIdentifierOrList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).exitIdentifierOrList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblyVisitor ) return ((AssemblyVisitor<? extends T>)visitor).visitIdentifierOrList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierOrListContext identifierOrList() throws RecognitionException {
		IdentifierOrListContext _localctx = new IdentifierOrListContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_identifierOrList);
		try {
			setState(125);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				match(Identifier);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				match(T__6);
				setState(122);
				identifierList();
				setState(123);
				match(T__7);
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

	public static class IdentifierListContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(AssemblyParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(AssemblyParser.Identifier, i);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).enterIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).exitIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblyVisitor ) return ((AssemblyVisitor<? extends T>)visitor).visitIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_identifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(Identifier);
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(128);
				match(T__10);
				setState(129);
				match(Identifier);
				}
				}
				setState(134);
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

	public static class AssemblyAssignmentContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AssemblyParser.Identifier, 0); }
		public AssemblyAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).enterAssemblyAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).exitAssemblyAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblyVisitor ) return ((AssemblyVisitor<? extends T>)visitor).visitAssemblyAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblyAssignmentContext assemblyAssignment() throws RecognitionException {
		AssemblyAssignmentContext _localctx = new AssemblyAssignmentContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assemblyAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(T__13);
			setState(136);
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

	public static class LabelDefinitionContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AssemblyParser.Identifier, 0); }
		public LabelDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).enterLabelDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).exitLabelDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblyVisitor ) return ((AssemblyVisitor<? extends T>)visitor).visitLabelDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelDefinitionContext labelDefinition() throws RecognitionException {
		LabelDefinitionContext _localctx = new LabelDefinitionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_labelDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(Identifier);
			setState(139);
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

	public static class AssemblySwitchContext extends ParserRuleContext {
		public FunctionalAssemblyExpressionContext functionalAssemblyExpression() {
			return getRuleContext(FunctionalAssemblyExpressionContext.class,0);
		}
		public List<AssemblyCaseContext> assemblyCase() {
			return getRuleContexts(AssemblyCaseContext.class);
		}
		public AssemblyCaseContext assemblyCase(int i) {
			return getRuleContext(AssemblyCaseContext.class,i);
		}
		public AssemblyBlockContext assemblyBlock() {
			return getRuleContext(AssemblyBlockContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(AssemblyParser.Identifier, 0); }
		public AssemblySwitchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblySwitch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).enterAssemblySwitch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).exitAssemblySwitch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblyVisitor ) return ((AssemblyVisitor<? extends T>)visitor).visitAssemblySwitch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblySwitchContext assemblySwitch() throws RecognitionException {
		AssemblySwitchContext _localctx = new AssemblySwitchContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_assemblySwitch);
		int _la;
		try {
			int _alt;
			setState(167);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				match(T__15);
				setState(142);
				functionalAssemblyExpression();
				setState(146);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(143);
						assemblyCase();
						}
						} 
					}
					setState(148);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				}
				setState(152);
				_la = _input.LA(1);
				if (_la==T__16) {
					{
					setState(149);
					match(T__16);
					setState(150);
					match(T__14);
					setState(151);
					assemblyBlock();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				match(T__15);
				setState(155);
				match(Identifier);
				setState(159);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(156);
						assemblyCase();
						}
						} 
					}
					setState(161);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				setState(165);
				_la = _input.LA(1);
				if (_la==T__16) {
					{
					setState(162);
					match(T__16);
					setState(163);
					match(T__14);
					setState(164);
					assemblyBlock();
					}
				}

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

	public static class AssemblyCaseContext extends ParserRuleContext {
		public FunctionalAssemblyExpressionContext functionalAssemblyExpression() {
			return getRuleContext(FunctionalAssemblyExpressionContext.class,0);
		}
		public AssemblyBlockContext assemblyBlock() {
			return getRuleContext(AssemblyBlockContext.class,0);
		}
		public DataValueContext dataValue() {
			return getRuleContext(DataValueContext.class,0);
		}
		public AssemblyCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyCase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).enterAssemblyCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).exitAssemblyCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblyVisitor ) return ((AssemblyVisitor<? extends T>)visitor).visitAssemblyCase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblyCaseContext assemblyCase() throws RecognitionException {
		AssemblyCaseContext _localctx = new AssemblyCaseContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_assemblyCase);
		try {
			setState(183);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				match(T__17);
				setState(170);
				functionalAssemblyExpression();
				setState(171);
				match(T__14);
				setState(172);
				assemblyBlock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				match(T__17);
				setState(175);
				dataValue();
				setState(176);
				match(T__14);
				setState(177);
				assemblyBlock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(179);
				dataValue();
				setState(180);
				match(T__14);
				setState(181);
				assemblyBlock();
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

	public static class AssemblyFunctionDefinitionContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AssemblyParser.Identifier, 0); }
		public AssemblyBlockContext assemblyBlock() {
			return getRuleContext(AssemblyBlockContext.class,0);
		}
		public List<IdentifierListContext> identifierList() {
			return getRuleContexts(IdentifierListContext.class);
		}
		public IdentifierListContext identifierList(int i) {
			return getRuleContext(IdentifierListContext.class,i);
		}
		public AssemblyFunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyFunctionDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).enterAssemblyFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).exitAssemblyFunctionDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblyVisitor ) return ((AssemblyVisitor<? extends T>)visitor).visitAssemblyFunctionDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblyFunctionDefinitionContext assemblyFunctionDefinition() throws RecognitionException {
		AssemblyFunctionDefinitionContext _localctx = new AssemblyFunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_assemblyFunctionDefinition);
		int _la;
		try {
			setState(212);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
				match(T__18);
				setState(186);
				match(Identifier);
				setState(187);
				match(T__6);
				setState(189);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(188);
					identifierList();
					}
				}

				setState(191);
				match(T__7);
				setState(197);
				_la = _input.LA(1);
				if (_la==T__19) {
					{
					setState(192);
					match(T__19);
					setState(193);
					match(T__6);
					setState(194);
					identifierList();
					setState(195);
					match(T__7);
					}
				}

				setState(199);
				assemblyBlock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(200);
				match(T__18);
				setState(201);
				match(Identifier);
				setState(202);
				match(T__6);
				setState(204);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(203);
					identifierList();
					}
				}

				setState(206);
				match(T__7);
				setState(209);
				_la = _input.LA(1);
				if (_la==T__19) {
					{
					setState(207);
					match(T__19);
					setState(208);
					identifierList();
					}
				}

				setState(211);
				assemblyBlock();
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

	public static class AssemblyForContext extends ParserRuleContext {
		public List<FunctionalAssemblyExpressionContext> functionalAssemblyExpression() {
			return getRuleContexts(FunctionalAssemblyExpressionContext.class);
		}
		public FunctionalAssemblyExpressionContext functionalAssemblyExpression(int i) {
			return getRuleContext(FunctionalAssemblyExpressionContext.class,i);
		}
		public List<AssemblyBlockContext> assemblyBlock() {
			return getRuleContexts(AssemblyBlockContext.class);
		}
		public AssemblyBlockContext assemblyBlock(int i) {
			return getRuleContext(AssemblyBlockContext.class,i);
		}
		public AssemblyForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyFor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).enterAssemblyFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).exitAssemblyFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblyVisitor ) return ((AssemblyVisitor<? extends T>)visitor).visitAssemblyFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblyForContext assemblyFor() throws RecognitionException {
		AssemblyForContext _localctx = new AssemblyForContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_assemblyFor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(T__20);
			setState(217);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(215);
				assemblyBlock();
				}
				break;
			case Identifier:
				{
				setState(216);
				functionalAssemblyExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(219);
			functionalAssemblyExpression();
			setState(222);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(220);
				assemblyBlock();
				}
				break;
			case Identifier:
				{
				setState(221);
				functionalAssemblyExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(224);
			assemblyBlock();
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

	public static class SubAssemblyContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AssemblyParser.Identifier, 0); }
		public AssemblyBlockContext assemblyBlock() {
			return getRuleContext(AssemblyBlockContext.class,0);
		}
		public SubAssemblyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subAssembly; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).enterSubAssembly(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).exitSubAssembly(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblyVisitor ) return ((AssemblyVisitor<? extends T>)visitor).visitSubAssembly(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubAssemblyContext subAssembly() throws RecognitionException {
		SubAssemblyContext _localctx = new SubAssemblyContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_subAssembly);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(T__0);
			setState(227);
			match(Identifier);
			setState(228);
			assemblyBlock();
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

	public static class LinkerSymbolContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(AssemblyParser.StringLiteral, 0); }
		public LinkerSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linkerSymbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).enterLinkerSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).exitLinkerSymbol(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblyVisitor ) return ((AssemblyVisitor<? extends T>)visitor).visitLinkerSymbol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LinkerSymbolContext linkerSymbol() throws RecognitionException {
		LinkerSymbolContext _localctx = new LinkerSymbolContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_linkerSymbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(T__21);
			setState(231);
			match(T__6);
			setState(232);
			match(StringLiteral);
			setState(233);
			match(T__7);
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

	public static class NumberLiteralContext extends ParserRuleContext {
		public TerminalNode HexNumber() { return getToken(AssemblyParser.HexNumber, 0); }
		public TerminalNode DecimalNumber() { return getToken(AssemblyParser.DecimalNumber, 0); }
		public NumberLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).enterNumberLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblyListener ) ((AssemblyListener)listener).exitNumberLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblyVisitor ) return ((AssemblyVisitor<? extends T>)visitor).visitNumberLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberLiteralContext numberLiteral() throws RecognitionException {
		NumberLiteralContext _localctx = new NumberLiteralContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_numberLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			_la = _input.LA(1);
			if ( !(_la==HexNumber || _la==DecimalNumber) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\"\u00f0\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\6\2)\n\2\r\2\16\2*\3\2\3\2\3\3\3\3\7\3\61\n\3\f\3\16"+
		"\3\64\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4O\n\4\3\5\3\5\3\5\3\5\5\5"+
		"U\n\5\3\6\3\6\3\6\3\6\3\6\7\6\\\n\6\f\6\16\6_\13\6\5\6a\n\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7o\n\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\5\by\n\b\3\t\3\t\3\t\3\t\3\t\5\t\u0080\n\t\3\n\3\n\3\n\7\n"+
		"\u0085\n\n\f\n\16\n\u0088\13\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r"+
		"\7\r\u0093\n\r\f\r\16\r\u0096\13\r\3\r\3\r\3\r\5\r\u009b\n\r\3\r\3\r\3"+
		"\r\7\r\u00a0\n\r\f\r\16\r\u00a3\13\r\3\r\3\r\3\r\5\r\u00a8\n\r\5\r\u00aa"+
		"\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\5\16\u00ba\n\16\3\17\3\17\3\17\3\17\5\17\u00c0\n\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\5\17\u00c8\n\17\3\17\3\17\3\17\3\17\3\17\5\17\u00cf"+
		"\n\17\3\17\3\17\3\17\5\17\u00d4\n\17\3\17\5\17\u00d7\n\17\3\20\3\20\3"+
		"\20\5\20\u00dc\n\20\3\20\3\20\3\20\5\20\u00e1\n\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\2\2\24\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$\2\3\3\2\34\35\u0109\2&\3\2\2\2\4.\3\2"+
		"\2\2\6N\3\2\2\2\bT\3\2\2\2\nV\3\2\2\2\fn\3\2\2\2\16x\3\2\2\2\20\177\3"+
		"\2\2\2\22\u0081\3\2\2\2\24\u0089\3\2\2\2\26\u008c\3\2\2\2\30\u00a9\3\2"+
		"\2\2\32\u00b9\3\2\2\2\34\u00d6\3\2\2\2\36\u00d8\3\2\2\2 \u00e4\3\2\2\2"+
		"\"\u00e8\3\2\2\2$\u00ed\3\2\2\2&(\7\3\2\2\')\5\4\3\2(\'\3\2\2\2)*\3\2"+
		"\2\2*(\3\2\2\2*+\3\2\2\2+,\3\2\2\2,-\7\2\2\3-\3\3\2\2\2.\62\7\4\2\2/\61"+
		"\5\6\4\2\60/\3\2\2\2\61\64\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\65\3"+
		"\2\2\2\64\62\3\2\2\2\65\66\7\5\2\2\66\5\3\2\2\2\67O\7\31\2\28O\5\4\3\2"+
		"9O\5\n\6\2:O\5\f\7\2;O\5\16\b\2<O\5\24\13\2=O\5\26\f\2>O\5\30\r\2?O\5"+
		"\34\17\2@O\5\36\20\2AO\7\6\2\2BO\7\7\2\2CO\5 \21\2DE\7\b\2\2EF\7\t\2\2"+
		"FG\7\31\2\2GO\7\n\2\2HO\5\"\22\2IO\7\13\2\2JO\7\f\2\2KO\5$\23\2LO\7\33"+
		"\2\2MO\7\32\2\2N\67\3\2\2\2N8\3\2\2\2N9\3\2\2\2N:\3\2\2\2N;\3\2\2\2N<"+
		"\3\2\2\2N=\3\2\2\2N>\3\2\2\2N?\3\2\2\2N@\3\2\2\2NA\3\2\2\2NB\3\2\2\2N"+
		"C\3\2\2\2ND\3\2\2\2NH\3\2\2\2NI\3\2\2\2NJ\3\2\2\2NK\3\2\2\2NL\3\2\2\2"+
		"NM\3\2\2\2O\7\3\2\2\2PU\5$\23\2QU\7\33\2\2RU\7\32\2\2SU\7\31\2\2TP\3\2"+
		"\2\2TQ\3\2\2\2TR\3\2\2\2TS\3\2\2\2U\t\3\2\2\2VW\7\31\2\2W`\7\t\2\2X]\5"+
		"\6\4\2YZ\7\r\2\2Z\\\5\6\4\2[Y\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^"+
		"a\3\2\2\2_]\3\2\2\2`X\3\2\2\2`a\3\2\2\2ab\3\2\2\2bc\7\n\2\2c\13\3\2\2"+
		"\2de\7\16\2\2ef\5\20\t\2fg\7\17\2\2gh\5\n\6\2ho\3\2\2\2ij\7\16\2\2jk\5"+
		"\20\t\2kl\7\17\2\2lm\5\b\5\2mo\3\2\2\2nd\3\2\2\2ni\3\2\2\2o\r\3\2\2\2"+
		"pq\5\20\t\2qr\7\17\2\2rs\5\n\6\2sy\3\2\2\2tu\5\20\t\2uv\7\17\2\2vw\5\b"+
		"\5\2wy\3\2\2\2xp\3\2\2\2xt\3\2\2\2y\17\3\2\2\2z\u0080\7\31\2\2{|\7\t\2"+
		"\2|}\5\22\n\2}~\7\n\2\2~\u0080\3\2\2\2\177z\3\2\2\2\177{\3\2\2\2\u0080"+
		"\21\3\2\2\2\u0081\u0086\7\31\2\2\u0082\u0083\7\r\2\2\u0083\u0085\7\31"+
		"\2\2\u0084\u0082\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086"+
		"\u0087\3\2\2\2\u0087\23\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u008a\7\20\2"+
		"\2\u008a\u008b\7\31\2\2\u008b\25\3\2\2\2\u008c\u008d\7\31\2\2\u008d\u008e"+
		"\7\21\2\2\u008e\27\3\2\2\2\u008f\u0090\7\22\2\2\u0090\u0094\5\n\6\2\u0091"+
		"\u0093\5\32\16\2\u0092\u0091\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3"+
		"\2\2\2\u0094\u0095\3\2\2\2\u0095\u009a\3\2\2\2\u0096\u0094\3\2\2\2\u0097"+
		"\u0098\7\23\2\2\u0098\u0099\7\21\2\2\u0099\u009b\5\4\3\2\u009a\u0097\3"+
		"\2\2\2\u009a\u009b\3\2\2\2\u009b\u00aa\3\2\2\2\u009c\u009d\7\22\2\2\u009d"+
		"\u00a1\7\31\2\2\u009e\u00a0\5\32\16\2\u009f\u009e\3\2\2\2\u00a0\u00a3"+
		"\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a7\3\2\2\2\u00a3"+
		"\u00a1\3\2\2\2\u00a4\u00a5\7\23\2\2\u00a5\u00a6\7\21\2\2\u00a6\u00a8\5"+
		"\4\3\2\u00a7\u00a4\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00aa\3\2\2\2\u00a9"+
		"\u008f\3\2\2\2\u00a9\u009c\3\2\2\2\u00aa\31\3\2\2\2\u00ab\u00ac\7\24\2"+
		"\2\u00ac\u00ad\5\n\6\2\u00ad\u00ae\7\21\2\2\u00ae\u00af\5\4\3\2\u00af"+
		"\u00ba\3\2\2\2\u00b0\u00b1\7\24\2\2\u00b1\u00b2\5\b\5\2\u00b2\u00b3\7"+
		"\21\2\2\u00b3\u00b4\5\4\3\2\u00b4\u00ba\3\2\2\2\u00b5\u00b6\5\b\5\2\u00b6"+
		"\u00b7\7\21\2\2\u00b7\u00b8\5\4\3\2\u00b8\u00ba\3\2\2\2\u00b9\u00ab\3"+
		"\2\2\2\u00b9\u00b0\3\2\2\2\u00b9\u00b5\3\2\2\2\u00ba\33\3\2\2\2\u00bb"+
		"\u00bc\7\25\2\2\u00bc\u00bd\7\31\2\2\u00bd\u00bf\7\t\2\2\u00be\u00c0\5"+
		"\22\n\2\u00bf\u00be\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1"+
		"\u00c7\7\n\2\2\u00c2\u00c3\7\26\2\2\u00c3\u00c4\7\t\2\2\u00c4\u00c5\5"+
		"\22\n\2\u00c5\u00c6\7\n\2\2\u00c6\u00c8\3\2\2\2\u00c7\u00c2\3\2\2\2\u00c7"+
		"\u00c8\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00d7\5\4\3\2\u00ca\u00cb\7\25"+
		"\2\2\u00cb\u00cc\7\31\2\2\u00cc\u00ce\7\t\2\2\u00cd\u00cf\5\22\n\2\u00ce"+
		"\u00cd\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d3\7\n"+
		"\2\2\u00d1\u00d2\7\26\2\2\u00d2\u00d4\5\22\n\2\u00d3\u00d1\3\2\2\2\u00d3"+
		"\u00d4\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d7\5\4\3\2\u00d6\u00bb\3\2"+
		"\2\2\u00d6\u00ca\3\2\2\2\u00d7\35\3\2\2\2\u00d8\u00db\7\27\2\2\u00d9\u00dc"+
		"\5\4\3\2\u00da\u00dc\5\n\6\2\u00db\u00d9\3\2\2\2\u00db\u00da\3\2\2\2\u00dc"+
		"\u00dd\3\2\2\2\u00dd\u00e0\5\n\6\2\u00de\u00e1\5\4\3\2\u00df\u00e1\5\n"+
		"\6\2\u00e0\u00de\3\2\2\2\u00e0\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2"+
		"\u00e3\5\4\3\2\u00e3\37\3\2\2\2\u00e4\u00e5\7\3\2\2\u00e5\u00e6\7\31\2"+
		"\2\u00e6\u00e7\5\4\3\2\u00e7!\3\2\2\2\u00e8\u00e9\7\30\2\2\u00e9\u00ea"+
		"\7\t\2\2\u00ea\u00eb\7\33\2\2\u00eb\u00ec\7\n\2\2\u00ec#\3\2\2\2\u00ed"+
		"\u00ee\t\2\2\2\u00ee%\3\2\2\2\31*\62NT]`nx\177\u0086\u0094\u009a\u00a1"+
		"\u00a7\u00a9\u00b9\u00bf\u00c7\u00ce\u00d3\u00d6\u00db\u00e0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}