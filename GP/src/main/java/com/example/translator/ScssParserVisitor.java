// Generated from ScssParser.g4 by ANTLR 4.4
package com.example.translator;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ScssParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ScssParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ScssParser#identifierVariableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierVariableName(@NotNull ScssParser.IdentifierVariableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScssParser#identifierValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierValue(@NotNull ScssParser.IdentifierValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScssParser#functionReturn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionReturn(@NotNull ScssParser.FunctionReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScssParser#nested}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNested(@NotNull ScssParser.NestedContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScssParser#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty(@NotNull ScssParser.PropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScssParser#paramOptionalValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamOptionalValue(@NotNull ScssParser.ParamOptionalValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScssParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(@NotNull ScssParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScssParser#ifDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfDeclaration(@NotNull ScssParser.IfDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScssParser#mixinDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMixinDeclaration(@NotNull ScssParser.MixinDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScssParser#pseudo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPseudo(@NotNull ScssParser.PseudoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScssParser#attribRelate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribRelate(@NotNull ScssParser.AttribRelateContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScssParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(@NotNull ScssParser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScssParser#stylesheet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStylesheet(@NotNull ScssParser.StylesheetContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScssParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(@NotNull ScssParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScssParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(@NotNull ScssParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScssParser#ruleset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleset(@NotNull ScssParser.RulesetContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScssParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(@NotNull ScssParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScssParser#referenceUrl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferenceUrl(@NotNull ScssParser.ReferenceUrlContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScssParser#fromNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromNumber(@NotNull ScssParser.FromNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScssParser#throughNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThroughNumber(@NotNull ScssParser.ThroughNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScssParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(@NotNull ScssParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScssParser#elseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseStatement(@NotNull ScssParser.ElseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScssParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(@NotNull ScssParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScssParser#forDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForDeclaration(@NotNull ScssParser.ForDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScssParser#conditions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditions(@NotNull ScssParser.ConditionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScssParser#eachValueList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEachValueList(@NotNull ScssParser.EachValueListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScssParser#mathCharacter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathCharacter(@NotNull ScssParser.MathCharacterContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScssParser#values}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValues(@NotNull ScssParser.ValuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScssParser#eachDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEachDeclaration(@NotNull ScssParser.EachDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScssParser#selectors}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectors(@NotNull ScssParser.SelectorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScssParser#whileDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileDeclaration(@NotNull ScssParser.WhileDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScssParser#measurement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMeasurement(@NotNull ScssParser.MeasurementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScssParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(@NotNull ScssParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScssParser#attrib}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrib(@NotNull ScssParser.AttribContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScssParser#commandStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommandStatement(@NotNull ScssParser.CommandStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScssParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull ScssParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScssParser#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelector(@NotNull ScssParser.SelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScssParser#selectorPrefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectorPrefix(@NotNull ScssParser.SelectorPrefixContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScssParser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDeclaration(@NotNull ScssParser.ImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScssParser#includeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncludeDeclaration(@NotNull ScssParser.IncludeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScssParser#identifierListOrMap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierListOrMap(@NotNull ScssParser.IdentifierListOrMapContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScssParser#variableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableName(@NotNull ScssParser.VariableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScssParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull ScssParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScssParser#nest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNest(@NotNull ScssParser.NestContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScssParser#elseIfStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseIfStatement(@NotNull ScssParser.ElseIfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScssParser#url}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUrl(@NotNull ScssParser.UrlContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScssParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(@NotNull ScssParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScssParser#mediaTypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMediaTypes(@NotNull ScssParser.MediaTypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScssParser#functionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionStatement(@NotNull ScssParser.FunctionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScssParser#identifierPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierPart(@NotNull ScssParser.IdentifierPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScssParser#functionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBody(@NotNull ScssParser.FunctionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScssParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(@NotNull ScssParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScssParser#mathStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathStatement(@NotNull ScssParser.MathStatementContext ctx);
}