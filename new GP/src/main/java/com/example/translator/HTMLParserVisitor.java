// Generated from HTMLParser.g4 by ANTLR 4.4
package com.example.translator;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HTMLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HTMLParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HTMLParser#htmlDocument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlDocument(@NotNull HTMLParser.HtmlDocumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#htmlComment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlComment(@NotNull HTMLParser.HtmlCommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#propertybinding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertybinding(@NotNull HTMLParser.PropertybindingContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#htmlElements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlElements(@NotNull HTMLParser.HtmlElementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#binding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinding(@NotNull HTMLParser.BindingContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#htmlChardata}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlChardata(@NotNull HTMLParser.HtmlChardataContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#scriptletOrSeaWs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScriptletOrSeaWs(@NotNull HTMLParser.ScriptletOrSeaWsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#script}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScript(@NotNull HTMLParser.ScriptContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#htmlContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlContent(@NotNull HTMLParser.HtmlContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#twowaybining}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTwowaybining(@NotNull HTMLParser.TwowaybiningContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#interpolation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterpolation(@NotNull HTMLParser.InterpolationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#htmlMisc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlMisc(@NotNull HTMLParser.HtmlMiscContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#style}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyle(@NotNull HTMLParser.StyleContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#structural_binding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructural_binding(@NotNull HTMLParser.Structural_bindingContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlElement(@NotNull HTMLParser.HtmlElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#eventbinding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventbinding(@NotNull HTMLParser.EventbindingContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#htmlAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlAttribute(@NotNull HTMLParser.HtmlAttributeContext ctx);
}