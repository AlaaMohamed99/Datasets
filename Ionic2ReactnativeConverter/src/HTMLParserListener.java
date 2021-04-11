// Generated from E:/antler-project/src\HTMLParser.g4 by ANTLR 4.9
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
	void enterHtmlDocument(HTMLParser.HtmlDocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#htmlDocument}.
	 * @param ctx the parse tree
	 */
	void exitHtmlDocument(HTMLParser.HtmlDocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#scriptletOrSeaWs}.
	 * @param ctx the parse tree
	 */
	void enterScriptletOrSeaWs(HTMLParser.ScriptletOrSeaWsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#scriptletOrSeaWs}.
	 * @param ctx the parse tree
	 */
	void exitScriptletOrSeaWs(HTMLParser.ScriptletOrSeaWsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#htmlElements}.
	 * @param ctx the parse tree
	 */
	void enterHtmlElements(HTMLParser.HtmlElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#htmlElements}.
	 * @param ctx the parse tree
	 */
	void exitHtmlElements(HTMLParser.HtmlElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterHtmlElement(HTMLParser.HtmlElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitHtmlElement(HTMLParser.HtmlElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#binding}.
	 * @param ctx the parse tree
	 */
	void enterBinding(HTMLParser.BindingContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#binding}.
	 * @param ctx the parse tree
	 */
	void exitBinding(HTMLParser.BindingContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#structural_binding}.
	 * @param ctx the parse tree
	 */
	void enterStructural_binding(HTMLParser.Structural_bindingContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#structural_binding}.
	 * @param ctx the parse tree
	 */
	void exitStructural_binding(HTMLParser.Structural_bindingContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#eventbinding}.
	 * @param ctx the parse tree
	 */
	void enterEventbinding(HTMLParser.EventbindingContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#eventbinding}.
	 * @param ctx the parse tree
	 */
	void exitEventbinding(HTMLParser.EventbindingContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#propertybinding}.
	 * @param ctx the parse tree
	 */
	void enterPropertybinding(HTMLParser.PropertybindingContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#propertybinding}.
	 * @param ctx the parse tree
	 */
	void exitPropertybinding(HTMLParser.PropertybindingContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#twowaybining}.
	 * @param ctx the parse tree
	 */
	void enterTwowaybining(HTMLParser.TwowaybiningContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#twowaybining}.
	 * @param ctx the parse tree
	 */
	void exitTwowaybining(HTMLParser.TwowaybiningContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#htmlContent}.
     * @param ctx the parse tree
	 */
	void enterHtmlContent(HTMLParser.HtmlContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void exitHtmlContent(HTMLParser.HtmlContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAttribute(HTMLParser.HtmlAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAttribute(HTMLParser.HtmlAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#htmlChardata}.
	 * @param ctx the parse tree
	 */
	void enterHtmlChardata(HTMLParser.HtmlChardataContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#htmlChardata}.
	 * @param ctx the parse tree
	 */
	void exitHtmlChardata(HTMLParser.HtmlChardataContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#htmlMisc}.
	 * @param ctx the parse tree
	 */
	void enterHtmlMisc(HTMLParser.HtmlMiscContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#htmlMisc}.
	 * @param ctx the parse tree
	 */
	void exitHtmlMisc(HTMLParser.HtmlMiscContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#htmlComment}.
	 * @param ctx the parse tree
	 */
	void enterHtmlComment(HTMLParser.HtmlCommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#htmlComment}.
	 * @param ctx the parse tree
	 */
	void exitHtmlComment(HTMLParser.HtmlCommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#script}.
	 * @param ctx the parse tree
	 */
	void enterScript(HTMLParser.ScriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#script}.
	 * @param ctx the parse tree
	 */
	void exitScript(HTMLParser.ScriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#style}.
	 * @param ctx the parse tree
	 */
	void enterStyle(HTMLParser.StyleContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#style}.
	 * @param ctx the parse tree
	 */
	void exitStyle(HTMLParser.StyleContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#interpolation}.
	 * @param ctx the parse tree
	 */
	void enterInterpolation(HTMLParser.InterpolationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#interpolation}.
	 * @param ctx the parse tree
	 */
	void exitInterpolation(HTMLParser.InterpolationContext ctx);
}