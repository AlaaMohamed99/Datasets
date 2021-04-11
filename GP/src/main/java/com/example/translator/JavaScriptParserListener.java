// Generated from JavaScriptParser.g4 by ANTLR 4.4
package com.example.translator;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JavaScriptParser}.
 */
public interface JavaScriptParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code PropertyExpressionAssignment}
	 * labeled alternative in {@link JavaScriptParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void enterPropertyExpressionAssignment(@NotNull JavaScriptParser.PropertyExpressionAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PropertyExpressionAssignment}
	 * labeled alternative in {@link JavaScriptParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void exitPropertyExpressionAssignment(@NotNull JavaScriptParser.PropertyExpressionAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TemplateStringExpression}
	 * labeled alternative in {@link JavaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterTemplateStringExpression(@NotNull JavaScriptParser.TemplateStringExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplateStringExpression}
	 * labeled alternative in {@link JavaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitTemplateStringExpression(@NotNull JavaScriptParser.TemplateStringExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExportDefaultDeclaration}
	 * labeled alternative in {@link JavaScriptParser#exportStatement}.
	 * @param ctx the parse tree
	 */
	void enterExportDefaultDeclaration(@NotNull JavaScriptParser.ExportDefaultDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExportDefaultDeclaration}
	 * labeled alternative in {@link JavaScriptParser#exportStatement}.
	 * @param ctx the parse tree
	 */
	void exitExportDefaultDeclaration(@NotNull JavaScriptParser.ExportDefaultDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PowerExpression}
	 * labeled alternative in {@link JavaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterPowerExpression(@NotNull JavaScriptParser.PowerExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PowerExpression}
	 * labeled alternative in {@link JavaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitPowerExpression(@NotNull JavaScriptParser.PowerExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AnoymousFunctionDecl}
	 * labeled alternative in {@link JavaScriptParser#anoymousFunction}.
	 * @param ctx the parse tree
	 */
	void enterAnoymousFunctionDecl(@NotNull JavaScriptParser.AnoymousFunctionDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AnoymousFunctionDecl}
	 * labeled alternative in {@link JavaScriptParser#anoymousFunction}.
	 * @param ctx the parse tree
	 */
	void exitAnoymousFunctionDecl(@NotNull JavaScriptParser.AnoymousFunctionDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#arrowFunctionBody}.
	 * @param ctx the parse tree
	 */
	void enterArrowFunctionBody(@NotNull JavaScriptParser.ArrowFunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#arrowFunctionBody}.
	 * @param ctx the parse tree
	 */
	void exitArrowFunctionBody(@NotNull JavaScriptParser.ArrowFunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InExpression}
	 * labeled alternative in {@link JavaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterInExpression(@NotNull JavaScriptParser.InExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InExpression}
	 * labeled alternative in {@link JavaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitInExpression(@NotNull JavaScriptParser.InExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#eos}.
	 * @param ctx the parse tree
	 */
	void enterEos(@NotNull JavaScriptParser.EosContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#eos}.
	 * @param ctx the parse tree
	 */
	void exitEos(@NotNull JavaScriptParser.EosContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#methodDefinition}.
	 * @param ctx the parse tree
	 */
	void enterMethodDefinition(@NotNull JavaScriptParser.MethodDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#methodDefinition}.
	 * @param ctx the parse tree
	 */
	void exitMethodDefinition(@NotNull JavaScriptParser.MethodDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#sourceElements}.
	 * @param ctx the parse tree
	 */
	void enterSourceElements(@NotNull JavaScriptParser.SourceElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#sourceElements}.
	 * @param ctx the parse tree
	 */
	void exitSourceElements(@NotNull JavaScriptParser.SourceElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#htmlAttributeName}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAttributeName(@NotNull JavaScriptParser.HtmlAttributeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#htmlAttributeName}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAttributeName(@NotNull JavaScriptParser.HtmlAttributeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull JavaScriptParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull JavaScriptParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#exportFromBlock}.
	 * @param ctx the parse tree
	 */
	void enterExportFromBlock(@NotNull JavaScriptParser.ExportFromBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#exportFromBlock}.
	 * @param ctx the parse tree
	 */
	void exitExportFromBlock(@NotNull JavaScriptParser.ExportFromBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#lastFormalParameterArg}.
	 * @param ctx the parse tree
	 */
	void enterLastFormalParameterArg(@NotNull JavaScriptParser.LastFormalParameterArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#lastFormalParameterArg}.
	 * @param ctx the parse tree
	 */
	void exitLastFormalParameterArg(@NotNull JavaScriptParser.LastFormalParameterArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void enterHtmlContent(@NotNull JavaScriptParser.HtmlContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void exitHtmlContent(@NotNull JavaScriptParser.HtmlContentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArgumentsExpression}
	 * labeled alternative in {@link JavaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterArgumentsExpression(@NotNull JavaScriptParser.ArgumentsExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArgumentsExpression}
	 * labeled alternative in {@link JavaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitArgumentsExpression(@NotNull JavaScriptParser.ArgumentsExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#identifierName}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierName(@NotNull JavaScriptParser.IdentifierNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#identifierName}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierName(@NotNull JavaScriptParser.IdentifierNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeofExpression}
	 * labeled alternative in {@link JavaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterTypeofExpression(@NotNull JavaScriptParser.TypeofExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeofExpression}
	 * labeled alternative in {@link JavaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitTypeofExpression(@NotNull JavaScriptParser.TypeofExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull JavaScriptParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull JavaScriptParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(@NotNull JavaScriptParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(@NotNull JavaScriptParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#htmlTagClosingName}.
	 * @param ctx the parse tree
	 */
	void enterHtmlTagClosingName(@NotNull JavaScriptParser.HtmlTagClosingNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#htmlTagClosingName}.
	 * @param ctx the parse tree
	 */
	void exitHtmlTagClosingName(@NotNull JavaScriptParser.HtmlTagClosingNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#let}.
	 * @param ctx the parse tree
	 */
	void enterLet(@NotNull JavaScriptParser.LetContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#let}.
	 * @param ctx the parse tree
	 */
	void exitLet(@NotNull JavaScriptParser.LetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BitXOrExpression}
	 * labeled alternative in {@link JavaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterBitXOrExpression(@NotNull JavaScriptParser.BitXOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BitXOrExpression}
	 * labeled alternative in {@link JavaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitBitXOrExpression(@NotNull JavaScriptParser.BitXOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultiplicativeExpression}
	 * labeled alternative in {@link JavaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(@NotNull JavaScriptParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultiplicativeExpression}
	 * labeled alternative in {@link JavaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(@NotNull JavaScriptParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#numericLiteral}.
	 * @param ctx the parse tree
	 */
	void enterNumericLiteral(@NotNull JavaScriptParser.NumericLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#numericLiteral}.
	 * @param ctx the parse tree
	 */
	void exitNumericLiteral(@NotNull JavaScriptParser.NumericLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForInStatement}
	 * labeled alternative in {@link JavaScriptParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterForInStatement(@NotNull JavaScriptParser.ForInStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForInStatement}
	 * labeled alternative in {@link JavaScriptParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitForInStatement(@NotNull JavaScriptParser.ForInStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code htmlElementExpression}
	 * labeled alternative in {@link JavaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterHtmlElementExpression(@NotNull JavaScriptParser.HtmlElementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code htmlElementExpression}
	 * labeled alternative in {@link JavaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitHtmlElementExpression(@NotNull JavaScriptParser.HtmlElementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement(@NotNull JavaScriptParser.EmptyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement(@NotNull JavaScriptParser.EmptyStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AdditiveExpression}
	 * labeled alternative in {@link JavaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(@NotNull JavaScriptParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AdditiveExpression}
	 * labeled alternative in {@link JavaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(@NotNull JavaScriptParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RelationalExpression}
	 * labeled alternative in {@link JavaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(@NotNull JavaScriptParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RelationalExpression}
	 * labeled alternative in {@link JavaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(@NotNull JavaScriptParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(@NotNull JavaScriptParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(@NotNull JavaScriptParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#labelledStatement}.
	 * @param ctx the parse tree
	 */
	void enterLabelledStatement(@NotNull JavaScriptParser.LabelledStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#labelledStatement}.
	 * @param ctx the parse tree
	 */
	void exitLabelledStatement(@NotNull JavaScriptParser.LabelledStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#moduleItems}.
	 * @param ctx the parse tree
	 */
	void enterModuleItems(@NotNull JavaScriptParser.ModuleItemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#moduleItems}.
	 * @param ctx the parse tree
	 */
	void exitModuleItems(@NotNull JavaScriptParser.ModuleItemsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NewExpression}
	 * labeled alternative in {@link JavaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterNewExpression(@NotNull JavaScriptParser.NewExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NewExpression}
	 * labeled alternative in {@link JavaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitNewExpression(@NotNull JavaScriptParser.NewExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#htmlTagName}.
	 * @param ctx the parse tree
	 */
	void enterHtmlTagName(@NotNull JavaScriptParser.HtmlTagNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#htmlTagName}.
	 * @param ctx the parse tree
	 */
	void exitHtmlTagName(@NotNull JavaScriptParser.HtmlTagNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#withStatement}.
	 * @param ctx the parse tree
	 */
	void enterWithStatement(@NotNull JavaScriptParser.WithStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#withStatement}.
	 * @param ctx the parse tree
	 */
	void exitWithStatement(@NotNull JavaScriptParser.WithStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#arrayElement}.
	 * @param ctx the parse tree
	 */
	void enterArrayElement(@NotNull JavaScriptParser.ArrayElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#arrayElement}.
	 * @param ctx the parse tree
	 */
	void exitArrayElement(@NotNull JavaScriptParser.ArrayElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BitAndExpression}
	 * labeled alternative in {@link JavaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterBitAndExpression(@NotNull JavaScriptParser.BitAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BitAndExpression}
	 * labeled alternative in {@link JavaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitBitAndExpression(@NotNull JavaScriptParser.BitAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BitOrExpression}
	 * labeled alternative in {@link JavaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterBitOrExpression(@NotNull JavaScriptParser.BitOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BitOrExpression}
	 * labeled alternative in {@link JavaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitBitOrExpression(@NotNull JavaScriptParser.BitOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VoidExpression}
	 * labeled alternative in {@link JavaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterVoidExpression(@NotNull JavaScriptParser.VoidExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VoidExpression}
	 * labeled alternative in {@link JavaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitVoidExpression(@NotNull JavaScriptParser.VoidExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#objectExpressionSequence}.
	 * @param ctx the parse tree
	 */
	void enterObjectExpressionSequence(@NotNull JavaScriptParser.ObjectExpressionSequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#objectExpressionSequence}.
	 * @param ctx the parse tree
	 */
	void exitObjectExpressionSequence(@NotNull JavaScriptParser.ObjectExpressionSequenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TernaryExpression}
	 * labeled alternative in {@link JavaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterTernaryExpression(@NotNull JavaScriptParser.TernaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TernaryExpression}
	 * labeled alternative in {@link JavaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitTernaryExpression(@NotNull JavaScriptParser.TernaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalAndExpression}
	 * labeled alternative in {@link JavaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpression(@NotNull JavaScriptParser.LogicalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalAndExpression}
	 * labeled alternative in {@link JavaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpression(@NotNull JavaScriptParser.LogicalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterImportStatement(@NotNull JavaScriptParser.ImportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitImportStatement(@NotNull JavaScriptParser.ImportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void enterArrayLiteral(@NotNull JavaScriptParser.ArrayLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void exitArrayLiteral(@NotNull JavaScriptParser.ArrayLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#importFrom}.
	 * @param ctx the parse tree
	 */
	void enterImportFrom(@NotNull JavaScriptParser.ImportFromContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#importFrom}.
	 * @param ctx the parse tree
	 */
	void exitImportFrom(@NotNull JavaScriptParser.ImportFromContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileStatement}
	 * labeled alternative in {@link JavaScriptParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(@NotNull JavaScriptParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileStatement}
	 * labeled alternative in {@link JavaScriptParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(@NotNull JavaScriptParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(@NotNull JavaScriptParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(@NotNull JavaScriptParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PreDecreaseExpression}
	 * labeled alternative in {@link JavaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreDecreaseExpression(@NotNull JavaScriptParser.PreDecreaseExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PreDecreaseExpression}
	 * labeled alternative in {@link JavaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreDecreaseExpression(@NotNull JavaScriptParser.PreDecreaseExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#expressionSequence}.
	 * @param ctx the parse tree
	 */
	void enterExpressionSequence(@NotNull JavaScriptParser.ExpressionSequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#expressionSequence}.
	 * @param ctx the parse tree
	 */
	void exitExpressionSequence(@NotNull JavaScriptParser.ExpressionSequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(@NotNull JavaScriptParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(@NotNull JavaScriptParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#importFromBlock}.
	 * @param ctx the parse tree
	 */
	void enterImportFromBlock(@NotNull JavaScriptParser.ImportFromBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#importFromBlock}.
	 * @param ctx the parse tree
	 */
	void exitImportFromBlock(@NotNull JavaScriptParser.ImportFromBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#defaultClause}.
	 * @param ctx the parse tree
	 */
	void enterDefaultClause(@NotNull JavaScriptParser.DefaultClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#defaultClause}.
	 * @param ctx the parse tree
	 */
	void exitDefaultClause(@NotNull JavaScriptParser.DefaultClauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PostDecreaseExpression}
	 * labeled alternative in {@link JavaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostDecreaseExpression(@NotNull JavaScriptParser.PostDecreaseExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PostDecreaseExpression}
	 * labeled alternative in {@link JavaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostDecreaseExpression(@NotNull JavaScriptParser.PostDecreaseExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryPlusExpression}
	 * labeled alternative in {@link JavaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryPlusExpression(@NotNull JavaScriptParser.UnaryPlusExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryPlusExpression}
	 * labeled alternative in {@link JavaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryPlusExpression(@NotNull JavaScriptParser.UnaryPlusExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImportExpression}
	 * labeled alternative in {@link JavaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterImportExpression(@NotNull JavaScriptParser.ImportExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImportExpression}
	 * labeled alternative in {@link JavaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitImportExpression(@NotNull JavaScriptParser.ImportExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForStatement}
	 * labeled alternative in {@link JavaScriptParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(@NotNull JavaScriptParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForStatement}
	 * labeled alternative in {@link JavaScriptParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(@NotNull JavaScriptParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#caseBlock}.
	 * @param ctx the parse tree
	 */
	void enterCaseBlock(@NotNull JavaScriptParser.CaseBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#caseBlock}.
	 * @param ctx the parse tree
	 */
	void exitCaseBlock(@NotNull JavaScriptParser.CaseBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#arrowFunctionParameters}.
	 * @param ctx the parse tree
	 */
	void enterArrowFunctionParameters(@NotNull JavaScriptParser.ArrowFunctionParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#arrowFunctionParameters}.
	 * @param ctx the parse tree
	 */
	void exitArrowFunctionParameters(@NotNull JavaScriptParser.ArrowFunctionParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#caseClauses}.
	 * @param ctx the parse tree
	 */
	void enterCaseClauses(@NotNull JavaScriptParser.CaseClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#caseClauses}.
	 * @param ctx the parse tree
	 */
	void exitCaseClauses(@NotNull JavaScriptParser.CaseClausesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenthesizedExpression}
	 * labeled alternative in {@link JavaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedExpression(@NotNull JavaScriptParser.ParenthesizedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenthesizedExpression}
	 * labeled alternative in {@link JavaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedExpression(@NotNull JavaScriptParser.ParenthesizedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PostIncrementExpression}
	 * labeled alternative in {@link JavaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostIncrementExpression(@NotNull JavaScriptParser.PostIncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PostIncrementExpression}
	 * labeled alternative in {@link JavaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostIncrementExpression(@NotNull JavaScriptParser.PostIncrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#objectLiteral}.
	 * @param ctx the parse tree
	 */
	void enterObjectLiteral(@NotNull JavaScriptParser.ObjectLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#objectLiteral}.
	 * @param ctx the parse tree
	 */
	void exitObjectLiteral(@NotNull JavaScriptParser.ObjectLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void enterThrowStatement(@NotNull JavaScriptParser.ThrowStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void exitThrowStatement(@NotNull JavaScriptParser.ThrowStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#classElement}.
	 * @param ctx the parse tree
	 */
	void enterClassElement(@NotNull JavaScriptParser.ClassElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#classElement}.
	 * @param ctx the parse tree
	 */
	void exitClassElement(@NotNull JavaScriptParser.ClassElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(@NotNull JavaScriptParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(@NotNull JavaScriptParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(@NotNull JavaScriptParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(@NotNull JavaScriptParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdentifierExpression}
	 * labeled alternative in {@link JavaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierExpression(@NotNull JavaScriptParser.IdentifierExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdentifierExpression}
	 * labeled alternative in {@link JavaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierExpression(@NotNull JavaScriptParser.IdentifierExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#bigintLiteral}.
	 * @param ctx the parse tree
	 */
	void enterBigintLiteral(@NotNull JavaScriptParser.BigintLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#bigintLiteral}.
	 * @param ctx the parse tree
	 */
	void exitBigintLiteral(@NotNull JavaScriptParser.BigintLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#propertyName}.
	 * @param ctx the parse tree
	 */
	void enterPropertyName(@NotNull JavaScriptParser.PropertyNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#propertyName}.
	 * @param ctx the parse tree
	 */
	void exitPropertyName(@NotNull JavaScriptParser.PropertyNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#caseClause}.
	 * @param ctx the parse tree
	 */
	void enterCaseClause(@NotNull JavaScriptParser.CaseClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#caseClause}.
	 * @param ctx the parse tree
	 */
	void exitCaseClause(@NotNull JavaScriptParser.CaseClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#variableDeclarationList}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationList(@NotNull JavaScriptParser.VariableDeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#variableDeclarationList}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationList(@NotNull JavaScriptParser.VariableDeclarationListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#setter}.
	 * @param ctx the parse tree
	 */
	void enterSetter(@NotNull JavaScriptParser.SetterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#setter}.
	 * @param ctx the parse tree
	 */
	void exitSetter(@NotNull JavaScriptParser.SetterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(@NotNull JavaScriptParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(@NotNull JavaScriptParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CoalesceExpression}
	 * labeled alternative in {@link JavaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterCoalesceExpression(@NotNull JavaScriptParser.CoalesceExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CoalesceExpression}
	 * labeled alternative in {@link JavaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitCoalesceExpression(@NotNull JavaScriptParser.CoalesceExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAttribute(@NotNull JavaScriptParser.HtmlAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAttribute(@NotNull JavaScriptParser.HtmlAttributeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForOfStatement}
	 * labeled alternative in {@link JavaScriptParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterForOfStatement(@NotNull JavaScriptParser.ForOfStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForOfStatement}
	 * labeled alternative in {@link JavaScriptParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitForOfStatement(@NotNull JavaScriptParser.ForOfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#htmlAttributeValue}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAttributeValue(@NotNull JavaScriptParser.HtmlAttributeValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#htmlAttributeValue}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAttributeValue(@NotNull JavaScriptParser.HtmlAttributeValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(@NotNull JavaScriptParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(@NotNull JavaScriptParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#classTail}.
	 * @param ctx the parse tree
	 */
	void enterClassTail(@NotNull JavaScriptParser.ClassTailContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#classTail}.
	 * @param ctx the parse tree
	 */
	void exitClassTail(@NotNull JavaScriptParser.ClassTailContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#getter}.
	 * @param ctx the parse tree
	 */
	void enterGetter(@NotNull JavaScriptParser.GetterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#getter}.
	 * @param ctx the parse tree
	 */
	void exitGetter(@NotNull JavaScriptParser.GetterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PropertyShorthand}
	 * labeled alternative in {@link JavaScriptParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void enterPropertyShorthand(@NotNull JavaScriptParser.PropertyShorthandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PropertyShorthand}
	 * labeled alternative in {@link JavaScriptParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void exitPropertyShorthand(@NotNull JavaScriptParser.PropertyShorthandContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(@NotNull JavaScriptParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(@NotNull JavaScriptParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#htmlElements}.
	 * @param ctx the parse tree
	 */
	void enterHtmlElements(@NotNull JavaScriptParser.HtmlElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#htmlElements}.
	 * @param ctx the parse tree
	 */
	void exitHtmlElements(@NotNull JavaScriptParser.HtmlElementsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ThisExpression}
	 * labeled alternative in {@link JavaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterThisExpression(@NotNull JavaScriptParser.ThisExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ThisExpression}
	 * labeled alternative in {@link JavaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitThisExpression(@NotNull JavaScriptParser.ThisExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#statementList}.
	 * @param ctx the parse tree
	 */
	void enterStatementList(@NotNull JavaScriptParser.StatementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#statementList}.
	 * @param ctx the parse tree
	 */
	void exitStatementList(@NotNull JavaScriptParser.StatementListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PropertyGetter}
	 * labeled alternative in {@link JavaScriptParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void enterPropertyGetter(@NotNull JavaScriptParser.PropertyGetterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PropertyGetter}
	 * labeled alternative in {@link JavaScriptParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void exitPropertyGetter(@NotNull JavaScriptParser.PropertyGetterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EqualityExpression}
	 * labeled alternative in {@link JavaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(@NotNull JavaScriptParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EqualityExpression}
	 * labeled alternative in {@link JavaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(@NotNull JavaScriptParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeyword(@NotNull JavaScriptParser.KeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeyword(@NotNull JavaScriptParser.KeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#elementList}.
	 * @param ctx the parse tree
	 */
	void enterElementList(@NotNull JavaScriptParser.ElementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#elementList}.
	 * @param ctx the parse tree
	 */
	void exitElementList(@NotNull JavaScriptParser.ElementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#yieldStatement}.
	 * @param ctx the parse tree
	 */
	void enterYieldStatement(@NotNull JavaScriptParser.YieldStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#yieldStatement}.
	 * @param ctx the parse tree
	 */
	void exitYieldStatement(@NotNull JavaScriptParser.YieldStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BitShiftExpression}
	 * labeled alternative in {@link JavaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterBitShiftExpression(@NotNull JavaScriptParser.BitShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BitShiftExpression}
	 * labeled alternative in {@link JavaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitBitShiftExpression(@NotNull JavaScriptParser.BitShiftExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComputedPropertyExpressionAssignment}
	 * labeled alternative in {@link JavaScriptParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void enterComputedPropertyExpressionAssignment(@NotNull JavaScriptParser.ComputedPropertyExpressionAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComputedPropertyExpressionAssignment}
	 * labeled alternative in {@link JavaScriptParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void exitComputedPropertyExpressionAssignment(@NotNull JavaScriptParser.ComputedPropertyExpressionAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#aliasName}.
	 * @param ctx the parse tree
	 */
	void enterAliasName(@NotNull JavaScriptParser.AliasNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#aliasName}.
	 * @param ctx the parse tree
	 */
	void exitAliasName(@NotNull JavaScriptParser.AliasNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BitNotExpression}
	 * labeled alternative in {@link JavaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterBitNotExpression(@NotNull JavaScriptParser.BitNotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BitNotExpression}
	 * labeled alternative in {@link JavaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitBitNotExpression(@NotNull JavaScriptParser.BitNotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PropertySetter}
	 * labeled alternative in {@link JavaScriptParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void enterPropertySetter(@NotNull JavaScriptParser.PropertySetterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PropertySetter}
	 * labeled alternative in {@link JavaScriptParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void exitPropertySetter(@NotNull JavaScriptParser.PropertySetterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LiteralExpression}
	 * labeled alternative in {@link JavaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterLiteralExpression(@NotNull JavaScriptParser.LiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LiteralExpression}
	 * labeled alternative in {@link JavaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitLiteralExpression(@NotNull JavaScriptParser.LiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayLiteralExpression}
	 * labeled alternative in {@link JavaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterArrayLiteralExpression(@NotNull JavaScriptParser.ArrayLiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayLiteralExpression}
	 * labeled alternative in {@link JavaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitArrayLiteralExpression(@NotNull JavaScriptParser.ArrayLiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MemberDotExpression}
	 * labeled alternative in {@link JavaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterMemberDotExpression(@NotNull JavaScriptParser.MemberDotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MemberDotExpression}
	 * labeled alternative in {@link JavaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitMemberDotExpression(@NotNull JavaScriptParser.MemberDotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#htmlChardata}.
	 * @param ctx the parse tree
	 */
	void enterHtmlChardata(@NotNull JavaScriptParser.HtmlChardataContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#htmlChardata}.
	 * @param ctx the parse tree
	 */
	void exitHtmlChardata(@NotNull JavaScriptParser.HtmlChardataContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExportDeclaration}
	 * labeled alternative in {@link JavaScriptParser#exportStatement}.
	 * @param ctx the parse tree
	 */
	void enterExportDeclaration(@NotNull JavaScriptParser.ExportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExportDeclaration}
	 * labeled alternative in {@link JavaScriptParser#exportStatement}.
	 * @param ctx the parse tree
	 */
	void exitExportDeclaration(@NotNull JavaScriptParser.ExportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MemberIndexExpression}
	 * labeled alternative in {@link JavaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterMemberIndexExpression(@NotNull JavaScriptParser.MemberIndexExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MemberIndexExpression}
	 * labeled alternative in {@link JavaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitMemberIndexExpression(@NotNull JavaScriptParser.MemberIndexExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(@NotNull JavaScriptParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(@NotNull JavaScriptParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignmentOperatorExpression}
	 * labeled alternative in {@link JavaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperatorExpression(@NotNull JavaScriptParser.AssignmentOperatorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignmentOperatorExpression}
	 * labeled alternative in {@link JavaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperatorExpression(@NotNull JavaScriptParser.AssignmentOperatorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#htmlTagStartName}.
	 * @param ctx the parse tree
	 */
	void enterHtmlTagStartName(@NotNull JavaScriptParser.HtmlTagStartNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#htmlTagStartName}.
	 * @param ctx the parse tree
	 */
	void exitHtmlTagStartName(@NotNull JavaScriptParser.HtmlTagStartNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionProperty}
	 * labeled alternative in {@link JavaScriptParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void enterFunctionProperty(@NotNull JavaScriptParser.FunctionPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionProperty}
	 * labeled alternative in {@link JavaScriptParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void exitFunctionProperty(@NotNull JavaScriptParser.FunctionPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterHtmlElement(@NotNull JavaScriptParser.HtmlElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitHtmlElement(@NotNull JavaScriptParser.HtmlElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void enterTryStatement(@NotNull JavaScriptParser.TryStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void exitTryStatement(@NotNull JavaScriptParser.TryStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#debuggerStatement}.
	 * @param ctx the parse tree
	 */
	void enterDebuggerStatement(@NotNull JavaScriptParser.DebuggerStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#debuggerStatement}.
	 * @param ctx the parse tree
	 */
	void exitDebuggerStatement(@NotNull JavaScriptParser.DebuggerStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DoStatement}
	 * labeled alternative in {@link JavaScriptParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoStatement(@NotNull JavaScriptParser.DoStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DoStatement}
	 * labeled alternative in {@link JavaScriptParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoStatement(@NotNull JavaScriptParser.DoStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PreIncrementExpression}
	 * labeled alternative in {@link JavaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreIncrementExpression(@NotNull JavaScriptParser.PreIncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PreIncrementExpression}
	 * labeled alternative in {@link JavaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreIncrementExpression(@NotNull JavaScriptParser.PreIncrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ObjectLiteralExpression}
	 * labeled alternative in {@link JavaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterObjectLiteralExpression(@NotNull JavaScriptParser.ObjectLiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ObjectLiteralExpression}
	 * labeled alternative in {@link JavaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitObjectLiteralExpression(@NotNull JavaScriptParser.ObjectLiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MetaExpression}
	 * labeled alternative in {@link JavaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterMetaExpression(@NotNull JavaScriptParser.MetaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MetaExpression}
	 * labeled alternative in {@link JavaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitMetaExpression(@NotNull JavaScriptParser.MetaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalOrExpression}
	 * labeled alternative in {@link JavaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpression(@NotNull JavaScriptParser.LogicalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalOrExpression}
	 * labeled alternative in {@link JavaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpression(@NotNull JavaScriptParser.LogicalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#importDefault}.
	 * @param ctx the parse tree
	 */
	void enterImportDefault(@NotNull JavaScriptParser.ImportDefaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#importDefault}.
	 * @param ctx the parse tree
	 */
	void exitImportDefault(@NotNull JavaScriptParser.ImportDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotExpression}
	 * labeled alternative in {@link JavaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(@NotNull JavaScriptParser.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotExpression}
	 * labeled alternative in {@link JavaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(@NotNull JavaScriptParser.NotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#importNamespace}.
	 * @param ctx the parse tree
	 */
	void enterImportNamespace(@NotNull JavaScriptParser.ImportNamespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#importNamespace}.
	 * @param ctx the parse tree
	 */
	void exitImportNamespace(@NotNull JavaScriptParser.ImportNamespaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatement(@NotNull JavaScriptParser.SwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatement(@NotNull JavaScriptParser.SwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#formalParameterArg}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterArg(@NotNull JavaScriptParser.FormalParameterArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#formalParameterArg}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterArg(@NotNull JavaScriptParser.FormalParameterArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(@NotNull JavaScriptParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(@NotNull JavaScriptParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#variableStatement}.
	 * @param ctx the parse tree
	 */
	void enterVariableStatement(@NotNull JavaScriptParser.VariableStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#variableStatement}.
	 * @param ctx the parse tree
	 */
	void exitVariableStatement(@NotNull JavaScriptParser.VariableStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AwaitExpression}
	 * labeled alternative in {@link JavaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterAwaitExpression(@NotNull JavaScriptParser.AwaitExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AwaitExpression}
	 * labeled alternative in {@link JavaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitAwaitExpression(@NotNull JavaScriptParser.AwaitExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionExpression}
	 * labeled alternative in {@link JavaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionExpression(@NotNull JavaScriptParser.FunctionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionExpression}
	 * labeled alternative in {@link JavaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionExpression(@NotNull JavaScriptParser.FunctionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryMinusExpression}
	 * labeled alternative in {@link JavaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryMinusExpression(@NotNull JavaScriptParser.UnaryMinusExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryMinusExpression}
	 * labeled alternative in {@link JavaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryMinusExpression(@NotNull JavaScriptParser.UnaryMinusExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignmentExpression}
	 * labeled alternative in {@link JavaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(@NotNull JavaScriptParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignmentExpression}
	 * labeled alternative in {@link JavaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(@NotNull JavaScriptParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InstanceofExpression}
	 * labeled alternative in {@link JavaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterInstanceofExpression(@NotNull JavaScriptParser.InstanceofExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InstanceofExpression}
	 * labeled alternative in {@link JavaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitInstanceofExpression(@NotNull JavaScriptParser.InstanceofExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull JavaScriptParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull JavaScriptParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DeleteExpression}
	 * labeled alternative in {@link JavaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterDeleteExpression(@NotNull JavaScriptParser.DeleteExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DeleteExpression}
	 * labeled alternative in {@link JavaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitDeleteExpression(@NotNull JavaScriptParser.DeleteExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SuperExpression}
	 * labeled alternative in {@link JavaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterSuperExpression(@NotNull JavaScriptParser.SuperExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SuperExpression}
	 * labeled alternative in {@link JavaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitSuperExpression(@NotNull JavaScriptParser.SuperExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code YieldExpression}
	 * labeled alternative in {@link JavaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterYieldExpression(@NotNull JavaScriptParser.YieldExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code YieldExpression}
	 * labeled alternative in {@link JavaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitYieldExpression(@NotNull JavaScriptParser.YieldExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#sourceElement}.
	 * @param ctx the parse tree
	 */
	void enterSourceElement(@NotNull JavaScriptParser.SourceElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#sourceElement}.
	 * @param ctx the parse tree
	 */
	void exitSourceElement(@NotNull JavaScriptParser.SourceElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrowFunction}
	 * labeled alternative in {@link JavaScriptParser#anoymousFunction}.
	 * @param ctx the parse tree
	 */
	void enterArrowFunction(@NotNull JavaScriptParser.ArrowFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrowFunction}
	 * labeled alternative in {@link JavaScriptParser#anoymousFunction}.
	 * @param ctx the parse tree
	 */
	void exitArrowFunction(@NotNull JavaScriptParser.ArrowFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(@NotNull JavaScriptParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(@NotNull JavaScriptParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClassExpression}
	 * labeled alternative in {@link JavaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterClassExpression(@NotNull JavaScriptParser.ClassExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClassExpression}
	 * labeled alternative in {@link JavaScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitClassExpression(@NotNull JavaScriptParser.ClassExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(@NotNull JavaScriptParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(@NotNull JavaScriptParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#reservedWord}.
	 * @param ctx the parse tree
	 */
	void enterReservedWord(@NotNull JavaScriptParser.ReservedWordContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#reservedWord}.
	 * @param ctx the parse tree
	 */
	void exitReservedWord(@NotNull JavaScriptParser.ReservedWordContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#finallyProduction}.
	 * @param ctx the parse tree
	 */
	void enterFinallyProduction(@NotNull JavaScriptParser.FinallyProductionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#finallyProduction}.
	 * @param ctx the parse tree
	 */
	void exitFinallyProduction(@NotNull JavaScriptParser.FinallyProductionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#assignable}.
	 * @param ctx the parse tree
	 */
	void enterAssignable(@NotNull JavaScriptParser.AssignableContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#assignable}.
	 * @param ctx the parse tree
	 */
	void exitAssignable(@NotNull JavaScriptParser.AssignableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionDecl}
	 * labeled alternative in {@link JavaScriptParser#anoymousFunction}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDecl(@NotNull JavaScriptParser.FunctionDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionDecl}
	 * labeled alternative in {@link JavaScriptParser#anoymousFunction}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDecl(@NotNull JavaScriptParser.FunctionDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#catchProduction}.
	 * @param ctx the parse tree
	 */
	void enterCatchProduction(@NotNull JavaScriptParser.CatchProductionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#catchProduction}.
	 * @param ctx the parse tree
	 */
	void exitCatchProduction(@NotNull JavaScriptParser.CatchProductionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(@NotNull JavaScriptParser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(@NotNull JavaScriptParser.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(@NotNull JavaScriptParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(@NotNull JavaScriptParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(@NotNull JavaScriptParser.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(@NotNull JavaScriptParser.FunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaScriptParser#varModifier}.
	 * @param ctx the parse tree
	 */
	void enterVarModifier(@NotNull JavaScriptParser.VarModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaScriptParser#varModifier}.
	 * @param ctx the parse tree
	 */
	void exitVarModifier(@NotNull JavaScriptParser.VarModifierContext ctx);
}