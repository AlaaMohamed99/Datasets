// Generated from ScssParser.g4 by ANTLR 4.4
package com.example.translator;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ScssParser}.
 */
public interface ScssParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ScssParser#identifierVariableName}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierVariableName(@NotNull ScssParser.IdentifierVariableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScssParser#identifierVariableName}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierVariableName(@NotNull ScssParser.IdentifierVariableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScssParser#identifierValue}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierValue(@NotNull ScssParser.IdentifierValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScssParser#identifierValue}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierValue(@NotNull ScssParser.IdentifierValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScssParser#functionReturn}.
	 * @param ctx the parse tree
	 */
	void enterFunctionReturn(@NotNull ScssParser.FunctionReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScssParser#functionReturn}.
	 * @param ctx the parse tree
	 */
	void exitFunctionReturn(@NotNull ScssParser.FunctionReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScssParser#nested}.
	 * @param ctx the parse tree
	 */
	void enterNested(@NotNull ScssParser.NestedContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScssParser#nested}.
	 * @param ctx the parse tree
	 */
	void exitNested(@NotNull ScssParser.NestedContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScssParser#property}.
	 * @param ctx the parse tree
	 */
	void enterProperty(@NotNull ScssParser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScssParser#property}.
	 * @param ctx the parse tree
	 */
	void exitProperty(@NotNull ScssParser.PropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScssParser#paramOptionalValue}.
	 * @param ctx the parse tree
	 */
	void enterParamOptionalValue(@NotNull ScssParser.ParamOptionalValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScssParser#paramOptionalValue}.
	 * @param ctx the parse tree
	 */
	void exitParamOptionalValue(@NotNull ScssParser.ParamOptionalValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScssParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull ScssParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScssParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull ScssParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScssParser#ifDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterIfDeclaration(@NotNull ScssParser.IfDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScssParser#ifDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitIfDeclaration(@NotNull ScssParser.IfDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScssParser#mixinDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMixinDeclaration(@NotNull ScssParser.MixinDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScssParser#mixinDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMixinDeclaration(@NotNull ScssParser.MixinDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScssParser#pseudo}.
	 * @param ctx the parse tree
	 */
	void enterPseudo(@NotNull ScssParser.PseudoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScssParser#pseudo}.
	 * @param ctx the parse tree
	 */
	void exitPseudo(@NotNull ScssParser.PseudoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScssParser#attribRelate}.
	 * @param ctx the parse tree
	 */
	void enterAttribRelate(@NotNull ScssParser.AttribRelateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScssParser#attribRelate}.
	 * @param ctx the parse tree
	 */
	void exitAttribRelate(@NotNull ScssParser.AttribRelateContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScssParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(@NotNull ScssParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScssParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(@NotNull ScssParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScssParser#stylesheet}.
	 * @param ctx the parse tree
	 */
	void enterStylesheet(@NotNull ScssParser.StylesheetContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScssParser#stylesheet}.
	 * @param ctx the parse tree
	 */
	void exitStylesheet(@NotNull ScssParser.StylesheetContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScssParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(@NotNull ScssParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScssParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(@NotNull ScssParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScssParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(@NotNull ScssParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScssParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(@NotNull ScssParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScssParser#ruleset}.
	 * @param ctx the parse tree
	 */
	void enterRuleset(@NotNull ScssParser.RulesetContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScssParser#ruleset}.
	 * @param ctx the parse tree
	 */
	void exitRuleset(@NotNull ScssParser.RulesetContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScssParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(@NotNull ScssParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScssParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(@NotNull ScssParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScssParser#referenceUrl}.
	 * @param ctx the parse tree
	 */
	void enterReferenceUrl(@NotNull ScssParser.ReferenceUrlContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScssParser#referenceUrl}.
	 * @param ctx the parse tree
	 */
	void exitReferenceUrl(@NotNull ScssParser.ReferenceUrlContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScssParser#fromNumber}.
	 * @param ctx the parse tree
	 */
	void enterFromNumber(@NotNull ScssParser.FromNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScssParser#fromNumber}.
	 * @param ctx the parse tree
	 */
	void exitFromNumber(@NotNull ScssParser.FromNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScssParser#throughNumber}.
	 * @param ctx the parse tree
	 */
	void enterThroughNumber(@NotNull ScssParser.ThroughNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScssParser#throughNumber}.
	 * @param ctx the parse tree
	 */
	void exitThroughNumber(@NotNull ScssParser.ThroughNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScssParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(@NotNull ScssParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScssParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(@NotNull ScssParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScssParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void enterElseStatement(@NotNull ScssParser.ElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScssParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void exitElseStatement(@NotNull ScssParser.ElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScssParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(@NotNull ScssParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScssParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(@NotNull ScssParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScssParser#forDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterForDeclaration(@NotNull ScssParser.ForDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScssParser#forDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitForDeclaration(@NotNull ScssParser.ForDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScssParser#conditions}.
	 * @param ctx the parse tree
	 */
	void enterConditions(@NotNull ScssParser.ConditionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScssParser#conditions}.
	 * @param ctx the parse tree
	 */
	void exitConditions(@NotNull ScssParser.ConditionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScssParser#eachValueList}.
	 * @param ctx the parse tree
	 */
	void enterEachValueList(@NotNull ScssParser.EachValueListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScssParser#eachValueList}.
	 * @param ctx the parse tree
	 */
	void exitEachValueList(@NotNull ScssParser.EachValueListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScssParser#mathCharacter}.
	 * @param ctx the parse tree
	 */
	void enterMathCharacter(@NotNull ScssParser.MathCharacterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScssParser#mathCharacter}.
	 * @param ctx the parse tree
	 */
	void exitMathCharacter(@NotNull ScssParser.MathCharacterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScssParser#values}.
	 * @param ctx the parse tree
	 */
	void enterValues(@NotNull ScssParser.ValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScssParser#values}.
	 * @param ctx the parse tree
	 */
	void exitValues(@NotNull ScssParser.ValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScssParser#eachDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEachDeclaration(@NotNull ScssParser.EachDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScssParser#eachDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEachDeclaration(@NotNull ScssParser.EachDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScssParser#selectors}.
	 * @param ctx the parse tree
	 */
	void enterSelectors(@NotNull ScssParser.SelectorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScssParser#selectors}.
	 * @param ctx the parse tree
	 */
	void exitSelectors(@NotNull ScssParser.SelectorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScssParser#whileDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterWhileDeclaration(@NotNull ScssParser.WhileDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScssParser#whileDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitWhileDeclaration(@NotNull ScssParser.WhileDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScssParser#measurement}.
	 * @param ctx the parse tree
	 */
	void enterMeasurement(@NotNull ScssParser.MeasurementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScssParser#measurement}.
	 * @param ctx the parse tree
	 */
	void exitMeasurement(@NotNull ScssParser.MeasurementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScssParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(@NotNull ScssParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScssParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(@NotNull ScssParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScssParser#attrib}.
	 * @param ctx the parse tree
	 */
	void enterAttrib(@NotNull ScssParser.AttribContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScssParser#attrib}.
	 * @param ctx the parse tree
	 */
	void exitAttrib(@NotNull ScssParser.AttribContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScssParser#commandStatement}.
	 * @param ctx the parse tree
	 */
	void enterCommandStatement(@NotNull ScssParser.CommandStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScssParser#commandStatement}.
	 * @param ctx the parse tree
	 */
	void exitCommandStatement(@NotNull ScssParser.CommandStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScssParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull ScssParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScssParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull ScssParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScssParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterSelector(@NotNull ScssParser.SelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScssParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitSelector(@NotNull ScssParser.SelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScssParser#selectorPrefix}.
	 * @param ctx the parse tree
	 */
	void enterSelectorPrefix(@NotNull ScssParser.SelectorPrefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScssParser#selectorPrefix}.
	 * @param ctx the parse tree
	 */
	void exitSelectorPrefix(@NotNull ScssParser.SelectorPrefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScssParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(@NotNull ScssParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScssParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(@NotNull ScssParser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScssParser#includeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterIncludeDeclaration(@NotNull ScssParser.IncludeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScssParser#includeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitIncludeDeclaration(@NotNull ScssParser.IncludeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScssParser#identifierListOrMap}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierListOrMap(@NotNull ScssParser.IdentifierListOrMapContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScssParser#identifierListOrMap}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierListOrMap(@NotNull ScssParser.IdentifierListOrMapContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScssParser#variableName}.
	 * @param ctx the parse tree
	 */
	void enterVariableName(@NotNull ScssParser.VariableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScssParser#variableName}.
	 * @param ctx the parse tree
	 */
	void exitVariableName(@NotNull ScssParser.VariableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScssParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull ScssParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScssParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull ScssParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScssParser#nest}.
	 * @param ctx the parse tree
	 */
	void enterNest(@NotNull ScssParser.NestContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScssParser#nest}.
	 * @param ctx the parse tree
	 */
	void exitNest(@NotNull ScssParser.NestContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScssParser#elseIfStatement}.
	 * @param ctx the parse tree
	 */
	void enterElseIfStatement(@NotNull ScssParser.ElseIfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScssParser#elseIfStatement}.
	 * @param ctx the parse tree
	 */
	void exitElseIfStatement(@NotNull ScssParser.ElseIfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScssParser#url}.
	 * @param ctx the parse tree
	 */
	void enterUrl(@NotNull ScssParser.UrlContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScssParser#url}.
	 * @param ctx the parse tree
	 */
	void exitUrl(@NotNull ScssParser.UrlContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScssParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(@NotNull ScssParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScssParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(@NotNull ScssParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScssParser#mediaTypes}.
	 * @param ctx the parse tree
	 */
	void enterMediaTypes(@NotNull ScssParser.MediaTypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScssParser#mediaTypes}.
	 * @param ctx the parse tree
	 */
	void exitMediaTypes(@NotNull ScssParser.MediaTypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScssParser#functionStatement}.
	 * @param ctx the parse tree
	 */
	void enterFunctionStatement(@NotNull ScssParser.FunctionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScssParser#functionStatement}.
	 * @param ctx the parse tree
	 */
	void exitFunctionStatement(@NotNull ScssParser.FunctionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScssParser#identifierPart}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierPart(@NotNull ScssParser.IdentifierPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScssParser#identifierPart}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierPart(@NotNull ScssParser.IdentifierPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScssParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(@NotNull ScssParser.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScssParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(@NotNull ScssParser.FunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScssParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(@NotNull ScssParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScssParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(@NotNull ScssParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScssParser#mathStatement}.
	 * @param ctx the parse tree
	 */
	void enterMathStatement(@NotNull ScssParser.MathStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScssParser#mathStatement}.
	 * @param ctx the parse tree
	 */
	void exitMathStatement(@NotNull ScssParser.MathStatementContext ctx);
}