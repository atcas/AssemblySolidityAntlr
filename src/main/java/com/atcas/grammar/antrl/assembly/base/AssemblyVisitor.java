// Generated from Assembly.g4 by ANTLR 4.5
package com.atcas.grammar.antrl.assembly.base;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AssemblyParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AssemblyVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AssemblyParser#assemblyBlockProgram}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssemblyBlockProgram(AssemblyParser.AssemblyBlockProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblyParser#assemblyBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssemblyBlock(AssemblyParser.AssemblyBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblyParser#assemblyItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssemblyItem(AssemblyParser.AssemblyItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblyParser#dataValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataValue(AssemblyParser.DataValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblyParser#functionalAssemblyExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionalAssemblyExpression(AssemblyParser.FunctionalAssemblyExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblyParser#assemblyLocalDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssemblyLocalDefinition(AssemblyParser.AssemblyLocalDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblyParser#functionalAssemblyAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionalAssemblyAssignment(AssemblyParser.FunctionalAssemblyAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblyParser#identifierOrList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierOrList(AssemblyParser.IdentifierOrListContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblyParser#identifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierList(AssemblyParser.IdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblyParser#assemblyAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssemblyAssignment(AssemblyParser.AssemblyAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblyParser#labelDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabelDefinition(AssemblyParser.LabelDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblyParser#assemblySwitch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssemblySwitch(AssemblyParser.AssemblySwitchContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblyParser#assemblyCase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssemblyCase(AssemblyParser.AssemblyCaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblyParser#assemblyFunctionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssemblyFunctionDefinition(AssemblyParser.AssemblyFunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblyParser#assemblyFor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssemblyFor(AssemblyParser.AssemblyForContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblyParser#subAssembly}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubAssembly(AssemblyParser.SubAssemblyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblyParser#linkerSymbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinkerSymbol(AssemblyParser.LinkerSymbolContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblyParser#numberLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberLiteral(AssemblyParser.NumberLiteralContext ctx);
}