// Generated from KotlinParser.g4 by ANTLR 4.4
package com.example.translator;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link KotlinParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface KotlinParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link KotlinParser#functionTypeParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionTypeParameters(@NotNull KotlinParser.FunctionTypeParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassMemberDeclaration(@NotNull KotlinParser.ClassMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#typeProjectionModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeProjectionModifier(@NotNull KotlinParser.TypeProjectionModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#parametersWithOptionalType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametersWithOptionalType(@NotNull KotlinParser.ParametersWithOptionalTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#enumEntries}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumEntries(@NotNull KotlinParser.EnumEntriesContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#whenExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhenExpression(@NotNull KotlinParser.WhenExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#typeParameterModifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameterModifiers(@NotNull KotlinParser.TypeParameterModifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#enumEntry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumEntry(@NotNull KotlinParser.EnumEntryContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(@NotNull KotlinParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#isOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsOperator(@NotNull KotlinParser.IsOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#infixFunctionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfixFunctionCall(@NotNull KotlinParser.InfixFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#parenthesizedExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedExpression(@NotNull KotlinParser.ParenthesizedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#additiveOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveOperator(@NotNull KotlinParser.AdditiveOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#classParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassParameter(@NotNull KotlinParser.ClassParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#nullableType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullableType(@NotNull KotlinParser.NullableTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#directlyAssignableExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirectlyAssignableExpression(@NotNull KotlinParser.DirectlyAssignableExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(@NotNull KotlinParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#prefixUnaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixUnaryExpression(@NotNull KotlinParser.PrefixUnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#catchBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchBlock(@NotNull KotlinParser.CatchBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(@NotNull KotlinParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#explicitDelegation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitDelegation(@NotNull KotlinParser.ExplicitDelegationContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#parameterModifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterModifiers(@NotNull KotlinParser.ParameterModifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#script}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScript(@NotNull KotlinParser.ScriptContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#multiVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiVariableDeclaration(@NotNull KotlinParser.MultiVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#stringLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(@NotNull KotlinParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#receiverType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiverType(@NotNull KotlinParser.ReceiverTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#multiAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiAnnotation(@NotNull KotlinParser.MultiAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#simpleIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleIdentifier(@NotNull KotlinParser.SimpleIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#rangeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRangeExpression(@NotNull KotlinParser.RangeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#propertyDelegate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyDelegate(@NotNull KotlinParser.PropertyDelegateContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#postfixUnarySuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixUnarySuffix(@NotNull KotlinParser.PostfixUnarySuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#objectDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectDeclaration(@NotNull KotlinParser.ObjectDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyDeclaration(@NotNull KotlinParser.PropertyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#typeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArguments(@NotNull KotlinParser.TypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#singleAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleAnnotation(@NotNull KotlinParser.SingleAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#classParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassParameters(@NotNull KotlinParser.ClassParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#controlStructureBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControlStructureBody(@NotNull KotlinParser.ControlStructureBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#semis}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSemis(@NotNull KotlinParser.SemisContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#functionValueParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionValueParameter(@NotNull KotlinParser.FunctionValueParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#classModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassModifier(@NotNull KotlinParser.ClassModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(@NotNull KotlinParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#annotatedLambda}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotatedLambda(@NotNull KotlinParser.AnnotatedLambdaContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#postfixUnaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixUnaryExpression(@NotNull KotlinParser.PostfixUnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#parenthesizedUserType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedUserType(@NotNull KotlinParser.ParenthesizedUserTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#indexingSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexingSuffix(@NotNull KotlinParser.IndexingSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#importList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportList(@NotNull KotlinParser.ImportListContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#delegationSpecifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelegationSpecifiers(@NotNull KotlinParser.DelegationSpecifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#finallyBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinallyBlock(@NotNull KotlinParser.FinallyBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#typeParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameters(@NotNull KotlinParser.TypeParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#importAlias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportAlias(@NotNull KotlinParser.ImportAliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#multiLineStringContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiLineStringContent(@NotNull KotlinParser.MultiLineStringContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#jumpExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJumpExpression(@NotNull KotlinParser.JumpExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#memberAccessOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberAccessOperator(@NotNull KotlinParser.MemberAccessOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#conjunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConjunction(@NotNull KotlinParser.ConjunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#parenthesizedDirectlyAssignableExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedDirectlyAssignableExpression(@NotNull KotlinParser.ParenthesizedDirectlyAssignableExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#primaryConstructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryConstructor(@NotNull KotlinParser.PrimaryConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#parenthesizedType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedType(@NotNull KotlinParser.ParenthesizedTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(@NotNull KotlinParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#functionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionType(@NotNull KotlinParser.FunctionTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#semi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSemi(@NotNull KotlinParser.SemiContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#whenSubject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhenSubject(@NotNull KotlinParser.WhenSubjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#ifExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfExpression(@NotNull KotlinParser.IfExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#rangeTest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRangeTest(@NotNull KotlinParser.RangeTestContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#typeTest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeTest(@NotNull KotlinParser.TypeTestContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#equality}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquality(@NotNull KotlinParser.EqualityContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(@NotNull KotlinParser.PrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#asOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsOperator(@NotNull KotlinParser.AsOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation(@NotNull KotlinParser.AnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#inOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInOperator(@NotNull KotlinParser.InOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull KotlinParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#objectLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectLiteral(@NotNull KotlinParser.ObjectLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(@NotNull KotlinParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#functionValueParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionValueParameters(@NotNull KotlinParser.FunctionValueParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#assignableSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignableSuffix(@NotNull KotlinParser.AssignableSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(@NotNull KotlinParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#lambdaParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaParameters(@NotNull KotlinParser.LambdaParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(@NotNull KotlinParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#typeConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeConstraint(@NotNull KotlinParser.TypeConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#varianceModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarianceModifier(@NotNull KotlinParser.VarianceModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(@NotNull KotlinParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#delegationSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelegationSpecifier(@NotNull KotlinParser.DelegationSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#typeProjectionModifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeProjectionModifiers(@NotNull KotlinParser.TypeProjectionModifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#equalityOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityOperator(@NotNull KotlinParser.EqualityOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#simpleUserType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleUserType(@NotNull KotlinParser.SimpleUserTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#excl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExcl(@NotNull KotlinParser.ExclContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#assignableExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignableExpression(@NotNull KotlinParser.AssignableExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#propertyModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyModifier(@NotNull KotlinParser.PropertyModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#shebangLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShebangLine(@NotNull KotlinParser.ShebangLineContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#typeAlias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeAlias(@NotNull KotlinParser.TypeAliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#setter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetter(@NotNull KotlinParser.SetterContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#elvisExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElvisExpression(@NotNull KotlinParser.ElvisExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#memberModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberModifier(@NotNull KotlinParser.MemberModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(@NotNull KotlinParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#annotatedDelegationSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotatedDelegationSpecifier(@NotNull KotlinParser.AnnotatedDelegationSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#topLevelObject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTopLevelObject(@NotNull KotlinParser.TopLevelObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#getter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetter(@NotNull KotlinParser.GetterContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#genericCallLikeComparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericCallLikeComparison(@NotNull KotlinParser.GenericCallLikeComparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifier(@NotNull KotlinParser.ModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#whenEntry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhenEntry(@NotNull KotlinParser.WhenEntryContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#quest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuest(@NotNull KotlinParser.QuestContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#collectionLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollectionLiteral(@NotNull KotlinParser.CollectionLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#multiplicativeOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeOperator(@NotNull KotlinParser.MultiplicativeOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#superExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperExpression(@NotNull KotlinParser.SuperExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#secondaryConstructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecondaryConstructor(@NotNull KotlinParser.SecondaryConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#inheritanceModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInheritanceModifier(@NotNull KotlinParser.InheritanceModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#navigationSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNavigationSuffix(@NotNull KotlinParser.NavigationSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#valueArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueArgument(@NotNull KotlinParser.ValueArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#visibilityModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVisibilityModifier(@NotNull KotlinParser.VisibilityModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#valueArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueArguments(@NotNull KotlinParser.ValueArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#constructorInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorInvocation(@NotNull KotlinParser.ConstructorInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#typeParameterModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameterModifier(@NotNull KotlinParser.TypeParameterModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#typeReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeReference(@NotNull KotlinParser.TypeReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#doWhileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileStatement(@NotNull KotlinParser.DoWhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#lineStringLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineStringLiteral(@NotNull KotlinParser.LineStringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#enumClassBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumClassBody(@NotNull KotlinParser.EnumClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#fileAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileAnnotation(@NotNull KotlinParser.FileAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(@NotNull KotlinParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#infixOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfixOperation(@NotNull KotlinParser.InfixOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#lineStringExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineStringExpression(@NotNull KotlinParser.LineStringExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#comparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOperator(@NotNull KotlinParser.ComparisonOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#companionObject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompanionObject(@NotNull KotlinParser.CompanionObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#assignmentAndOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentAndOperator(@NotNull KotlinParser.AssignmentAndOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#prefixUnaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixUnaryOperator(@NotNull KotlinParser.PrefixUnaryOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#multiLineStringLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiLineStringLiteral(@NotNull KotlinParser.MultiLineStringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#postfixUnaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixUnaryOperator(@NotNull KotlinParser.PostfixUnaryOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#importHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportHeader(@NotNull KotlinParser.ImportHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#unaryPrefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryPrefix(@NotNull KotlinParser.UnaryPrefixContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#asExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsExpression(@NotNull KotlinParser.AsExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#lineStringContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineStringContent(@NotNull KotlinParser.LineStringContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#functionLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionLiteral(@NotNull KotlinParser.FunctionLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#annotationUseSiteTarget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationUseSiteTarget(@NotNull KotlinParser.AnnotationUseSiteTargetContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#userType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserType(@NotNull KotlinParser.UserTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#parenthesizedAssignableExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedAssignableExpression(@NotNull KotlinParser.ParenthesizedAssignableExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#anonymousInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnonymousInitializer(@NotNull KotlinParser.AnonymousInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#typeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameter(@NotNull KotlinParser.TypeParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#unescapedAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnescapedAnnotation(@NotNull KotlinParser.UnescapedAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#anonymousFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnonymousFunction(@NotNull KotlinParser.AnonymousFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(@NotNull KotlinParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#modifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifiers(@NotNull KotlinParser.ModifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#classMemberDeclarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassMemberDeclarations(@NotNull KotlinParser.ClassMemberDeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#packageHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageHeader(@NotNull KotlinParser.PackageHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(@NotNull KotlinParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#lambdaLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaLiteral(@NotNull KotlinParser.LambdaLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#typeConstraints}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeConstraints(@NotNull KotlinParser.TypeConstraintsContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#typeModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeModifier(@NotNull KotlinParser.TypeModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#tryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryExpression(@NotNull KotlinParser.TryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#parameterModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterModifier(@NotNull KotlinParser.ParameterModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#reificationModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReificationModifier(@NotNull KotlinParser.ReificationModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(@NotNull KotlinParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#platformModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlatformModifier(@NotNull KotlinParser.PlatformModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull KotlinParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#elvis}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElvis(@NotNull KotlinParser.ElvisContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#functionModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionModifier(@NotNull KotlinParser.FunctionModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#lambdaParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaParameter(@NotNull KotlinParser.LambdaParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#typeModifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeModifiers(@NotNull KotlinParser.TypeModifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#constructorDelegationCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDelegationCall(@NotNull KotlinParser.ConstructorDelegationCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#disjunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisjunction(@NotNull KotlinParser.DisjunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(@NotNull KotlinParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#safeNav}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSafeNav(@NotNull KotlinParser.SafeNavContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#loopStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopStatement(@NotNull KotlinParser.LoopStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel(@NotNull KotlinParser.LabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#typeProjection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeProjection(@NotNull KotlinParser.TypeProjectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(@NotNull KotlinParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#callableReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallableReference(@NotNull KotlinParser.CallableReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#thisExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThisExpression(@NotNull KotlinParser.ThisExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#whenCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhenCondition(@NotNull KotlinParser.WhenConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#callSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallSuffix(@NotNull KotlinParser.CallSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#kotlinFile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKotlinFile(@NotNull KotlinParser.KotlinFileContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#parameterWithOptionalType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterWithOptionalType(@NotNull KotlinParser.ParameterWithOptionalTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#literalConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralConstant(@NotNull KotlinParser.LiteralConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#functionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBody(@NotNull KotlinParser.FunctionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#multiLineStringExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiLineStringExpression(@NotNull KotlinParser.MultiLineStringExpressionContext ctx);
}