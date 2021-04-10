// Generated from HTMLParser.g4 by ANTLR 4.4
package com.example.translator;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HTMLParser}.
 */
public interface HTMLParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HTMLParser#htmlDocument}.
	 * @param ctx the parse tree
	 */
	void enterHtmlDocument(@NotNull HTMLParser.HtmlDocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#htmlDocument}.
	 * @param ctx the parse tree
	 */
	void exitHtmlDocument(@NotNull HTMLParser.HtmlDocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#htmlComment}.
	 * @param ctx the parse tree
	 */
	void enterHtmlComment(@NotNull HTMLParser.HtmlCommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#htmlComment}.
	 * @param ctx the parse tree
	 */
	void exitHtmlComment(@NotNull HTMLParser.HtmlCommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#propertybinding}.
	 * @param ctx the parse tree
	 */
	void enterPropertybinding(@NotNull HTMLParser.PropertybindingContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#propertybinding}.
	 * @param ctx the parse tree
	 */
	void exitPropertybinding(@NotNull HTMLParser.PropertybindingContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#htmlElements}.
	 * @param ctx the parse tree
	 */
	void enterHtmlElements(@NotNull HTMLParser.HtmlElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#htmlElements}.
	 * @param ctx the parse tree
	 */
	void exitHtmlElements(@NotNull HTMLParser.HtmlElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#binding}.
	 * @param ctx the parse tree
	 */
	void enterBinding(@NotNull HTMLParser.BindingContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#binding}.
	 * @param ctx the parse tree
	 */
	void exitBinding(@NotNull HTMLParser.BindingContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#htmlChardata}.
	 * @param ctx the parse tree
	 */
	void enterHtmlChardata(@NotNull HTMLParser.HtmlChardataContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#htmlChardata}.
	 * @param ctx the parse tree
	 */
	void exitHtmlChardata(@NotNull HTMLParser.HtmlChardataContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#scriptletOrSeaWs}.
	 * @param ctx the parse tree
	 */
	void enterScriptletOrSeaWs(@NotNull HTMLParser.ScriptletOrSeaWsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#scriptletOrSeaWs}.
	 * @param ctx the parse tree
	 */
	void exitScriptletOrSeaWs(@NotNull HTMLParser.ScriptletOrSeaWsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#script}.
	 * @param ctx the parse tree
	 */
	void enterScript(@NotNull HTMLParser.ScriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#script}.
	 * @param ctx the parse tree
	 */
	void exitScript(@NotNull HTMLParser.ScriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void enterHtmlContent(@NotNull HTMLParser.HtmlContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void exitHtmlContent(@NotNull HTMLParser.HtmlContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#twowaybining}.
	 * @param ctx the parse tree
	 */
	void enterTwowaybining(@NotNull HTMLParser.TwowaybiningContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#twowaybining}.
	 * @param ctx the parse tree
	 */
	void exitTwowaybining(@NotNull HTMLParser.TwowaybiningContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#interpolation}.
	 * @param ctx the parse tree
	 */
	void enterInterpolation(@NotNull HTMLParser.InterpolationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#interpolation}.
	 * @param ctx the parse tree
	 */
	void exitInterpolation(@NotNull HTMLParser.InterpolationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#htmlMisc}.
	 * @param ctx the parse tree
	 */
	void enterHtmlMisc(@NotNull HTMLParser.HtmlMiscContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#htmlMisc}.
	 * @param ctx the parse tree
	 */
	void exitHtmlMisc(@NotNull HTMLParser.HtmlMiscContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#style}.
	 * @param ctx the parse tree
	 */
	void enterStyle(@NotNull HTMLParser.StyleContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#style}.
	 * @param ctx the parse tree
	 */
	void exitStyle(@NotNull HTMLParser.StyleContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#structural_binding}.
	 * @param ctx the parse tree
	 */
	void enterStructural_binding(@NotNull HTMLParser.Structural_bindingContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#structural_binding}.
	 * @param ctx the parse tree
	 */
	void exitStructural_binding(@NotNull HTMLParser.Structural_bindingContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterHtmlElement(@NotNull HTMLParser.HtmlElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitHtmlElement(@NotNull HTMLParser.HtmlElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#eventbinding}.
	 * @param ctx the parse tree
	 */
	void enterEventbinding(@NotNull HTMLParser.EventbindingContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#eventbinding}.
	 * @param ctx the parse tree
	 */
	void exitEventbinding(@NotNull HTMLParser.EventbindingContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAttribute(@NotNull HTMLParser.HtmlAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAttribute(@NotNull HTMLParser.HtmlAttributeContext ctx);
}