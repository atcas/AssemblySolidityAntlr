// Generated from Assembly.g4 by ANTLR 4.5
package com.atcas.grammar.antrl.assembly.base;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AssemblyParser}.
 */
public interface AssemblyListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AssemblyParser#assemblyBlockProgram}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyBlockProgram(AssemblyParser.AssemblyBlockProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblyParser#assemblyBlockProgram}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyBlockProgram(AssemblyParser.AssemblyBlockProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblyParser#assemblyBlock}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyBlock(AssemblyParser.AssemblyBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblyParser#assemblyBlock}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyBlock(AssemblyParser.AssemblyBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblyParser#assemblyItem}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyItem(AssemblyParser.AssemblyItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblyParser#assemblyItem}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyItem(AssemblyParser.AssemblyItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblyParser#dataValue}.
	 * @param ctx the parse tree
	 */
	void enterDataValue(AssemblyParser.DataValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblyParser#dataValue}.
	 * @param ctx the parse tree
	 */
	void exitDataValue(AssemblyParser.DataValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblyParser#functionalAssemblyExpression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionalAssemblyExpression(AssemblyParser.FunctionalAssemblyExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblyParser#functionalAssemblyExpression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionalAssemblyExpression(AssemblyParser.FunctionalAssemblyExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblyParser#assemblyLocalDefinition}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyLocalDefinition(AssemblyParser.AssemblyLocalDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblyParser#assemblyLocalDefinition}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyLocalDefinition(AssemblyParser.AssemblyLocalDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblyParser#functionalAssemblyAssignment}.
	 * @param ctx the parse tree
	 */
	void enterFunctionalAssemblyAssignment(AssemblyParser.FunctionalAssemblyAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblyParser#functionalAssemblyAssignment}.
	 * @param ctx the parse tree
	 */
	void exitFunctionalAssemblyAssignment(AssemblyParser.FunctionalAssemblyAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblyParser#identifierOrList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierOrList(AssemblyParser.IdentifierOrListContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblyParser#identifierOrList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierOrList(AssemblyParser.IdentifierOrListContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblyParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierList(AssemblyParser.IdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblyParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierList(AssemblyParser.IdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblyParser#assemblyAssignment}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyAssignment(AssemblyParser.AssemblyAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblyParser#assemblyAssignment}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyAssignment(AssemblyParser.AssemblyAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblyParser#labelDefinition}.
	 * @param ctx the parse tree
	 */
	void enterLabelDefinition(AssemblyParser.LabelDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblyParser#labelDefinition}.
	 * @param ctx the parse tree
	 */
	void exitLabelDefinition(AssemblyParser.LabelDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblyParser#assemblySwitch}.
	 * @param ctx the parse tree
	 */
	void enterAssemblySwitch(AssemblyParser.AssemblySwitchContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblyParser#assemblySwitch}.
	 * @param ctx the parse tree
	 */
	void exitAssemblySwitch(AssemblyParser.AssemblySwitchContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblyParser#assemblyCase}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyCase(AssemblyParser.AssemblyCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblyParser#assemblyCase}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyCase(AssemblyParser.AssemblyCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblyParser#assemblyFunctionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyFunctionDefinition(AssemblyParser.AssemblyFunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblyParser#assemblyFunctionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyFunctionDefinition(AssemblyParser.AssemblyFunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblyParser#assemblyFor}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyFor(AssemblyParser.AssemblyForContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblyParser#assemblyFor}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyFor(AssemblyParser.AssemblyForContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblyParser#subAssembly}.
	 * @param ctx the parse tree
	 */
	void enterSubAssembly(AssemblyParser.SubAssemblyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblyParser#subAssembly}.
	 * @param ctx the parse tree
	 */
	void exitSubAssembly(AssemblyParser.SubAssemblyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblyParser#linkerSymbol}.
	 * @param ctx the parse tree
	 */
	void enterLinkerSymbol(AssemblyParser.LinkerSymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblyParser#linkerSymbol}.
	 * @param ctx the parse tree
	 */
	void exitLinkerSymbol(AssemblyParser.LinkerSymbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblyParser#numberLiteral}.
	 * @param ctx the parse tree
	 */
	void enterNumberLiteral(AssemblyParser.NumberLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblyParser#numberLiteral}.
	 * @param ctx the parse tree
	 */
	void exitNumberLiteral(AssemblyParser.NumberLiteralContext ctx);
}