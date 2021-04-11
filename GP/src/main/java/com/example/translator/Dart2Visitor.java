// Generated from Dart2.g4 by ANTLR 4.4
package com.example.translator;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Dart2Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Dart2Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#classMemberDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassMemberDefinition(@NotNull Dart2Parser.ClassMemberDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#qualified}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualified(@NotNull Dart2Parser.QualifiedContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#defaultNamedParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultNamedParameter(@NotNull Dart2Parser.DefaultNamedParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#metadata}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetadata(@NotNull Dart2Parser.MetadataContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#staticFinalDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticFinalDeclaration(@NotNull Dart2Parser.StaticFinalDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#functionSignature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionSignature(@NotNull Dart2Parser.FunctionSignatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#minusOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinusOperator(@NotNull Dart2Parser.MinusOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#enumEntry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumEntry(@NotNull Dart2Parser.EnumEntryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#ifNullExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfNullExpression(@NotNull Dart2Parser.IfNullExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#relationalOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalOperator(@NotNull Dart2Parser.RelationalOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#simpleFormalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleFormalParameter(@NotNull Dart2Parser.SimpleFormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#constObjectExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstObjectExpression(@NotNull Dart2Parser.ConstObjectExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#functionExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionExpression(@NotNull Dart2Parser.FunctionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#isOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsOperator(@NotNull Dart2Parser.IsOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#normalFormalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalFormalParameter(@NotNull Dart2Parser.NormalFormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(@NotNull Dart2Parser.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#mixins}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMixins(@NotNull Dart2Parser.MixinsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#importSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportSpecification(@NotNull Dart2Parser.ImportSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#formalParameterPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterPart(@NotNull Dart2Parser.FormalParameterPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#expressionWithoutCascade}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionWithoutCascade(@NotNull Dart2Parser.ExpressionWithoutCascadeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#additiveOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveOperator(@NotNull Dart2Parser.AdditiveOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#superclass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperclass(@NotNull Dart2Parser.SuperclassContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#methodSignature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodSignature(@NotNull Dart2Parser.MethodSignatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#mapLiteralEntry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapLiteralEntry(@NotNull Dart2Parser.MapLiteralEntryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#logicalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAndExpression(@NotNull Dart2Parser.LogicalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#cascadeSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCascadeSelector(@NotNull Dart2Parser.CascadeSelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(@NotNull Dart2Parser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(@NotNull Dart2Parser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#libraryDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLibraryDefinition(@NotNull Dart2Parser.LibraryDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#forInitializerStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInitializerStatement(@NotNull Dart2Parser.ForInitializerStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#throwExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrowExpression(@NotNull Dart2Parser.ThrowExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(@NotNull Dart2Parser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#numericLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericLiteral(@NotNull Dart2Parser.NumericLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#classDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDefinition(@NotNull Dart2Parser.ClassDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#bitwiseXorExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitwiseXorExpression(@NotNull Dart2Parser.BitwiseXorExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(@NotNull Dart2Parser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#partHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartHeader(@NotNull Dart2Parser.PartHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#identifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierList(@NotNull Dart2Parser.IdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#shiftExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftExpression(@NotNull Dart2Parser.ShiftExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#finallyPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinallyPart(@NotNull Dart2Parser.FinallyPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#cascadeSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCascadeSection(@NotNull Dart2Parser.CascadeSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#getOrSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetOrSet(@NotNull Dart2Parser.GetOrSetContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#functionTypeAlias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionTypeAlias(@NotNull Dart2Parser.FunctionTypeAliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#dtype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDtype(@NotNull Dart2Parser.DtypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#scriptTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScriptTag(@NotNull Dart2Parser.ScriptTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#incrementOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrementOperator(@NotNull Dart2Parser.IncrementOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#defaultFormalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultFormalParameter(@NotNull Dart2Parser.DefaultFormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#typeCast}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeCast(@NotNull Dart2Parser.TypeCastContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(@NotNull Dart2Parser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#bitwiseOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitwiseOrExpression(@NotNull Dart2Parser.BitwiseOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#stringLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(@NotNull Dart2Parser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#optionalFormalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionalFormalParameters(@NotNull Dart2Parser.OptionalFormalParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#factoryConstructorSignature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactoryConstructorSignature(@NotNull Dart2Parser.FactoryConstructorSignatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#assertStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssertStatement(@NotNull Dart2Parser.AssertStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(@NotNull Dart2Parser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#returnType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnType(@NotNull Dart2Parser.ReturnTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#mixinApplication}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMixinApplication(@NotNull Dart2Parser.MixinApplicationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(@NotNull Dart2Parser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#libraryName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLibraryName(@NotNull Dart2Parser.LibraryNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#typeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArguments(@NotNull Dart2Parser.TypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#combinator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCombinator(@NotNull Dart2Parser.CombinatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(@NotNull Dart2Parser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(@NotNull Dart2Parser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#enumType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumType(@NotNull Dart2Parser.EnumTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#listLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListLiteral(@NotNull Dart2Parser.ListLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeName(@NotNull Dart2Parser.TypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#operatorSignature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorSignature(@NotNull Dart2Parser.OperatorSignatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(@NotNull Dart2Parser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#typeParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameters(@NotNull Dart2Parser.TypeParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#bitwiseOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitwiseOperator(@NotNull Dart2Parser.BitwiseOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(@NotNull Dart2Parser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#unconditionalAssignableSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnconditionalAssignableSelector(@NotNull Dart2Parser.UnconditionalAssignableSelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#partDirective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartDirective(@NotNull Dart2Parser.PartDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#typeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeList(@NotNull Dart2Parser.TypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#shiftOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftOperator(@NotNull Dart2Parser.ShiftOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#assertion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssertion(@NotNull Dart2Parser.AssertionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#typeTest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeTest(@NotNull Dart2Parser.TypeTestContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpression(@NotNull Dart2Parser.PostfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#asOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsOperator(@NotNull Dart2Parser.AsOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#functionPrefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionPrefix(@NotNull Dart2Parser.FunctionPrefixContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull Dart2Parser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#finalConstVarOrType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinalConstVarOrType(@NotNull Dart2Parser.FinalConstVarOrTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#varOrType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarOrType(@NotNull Dart2Parser.VarOrTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#initializedIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializedIdentifier(@NotNull Dart2Parser.InitializedIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(@NotNull Dart2Parser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#fieldFormalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldFormalParameter(@NotNull Dart2Parser.FieldFormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#topLevelDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTopLevelDefinition(@NotNull Dart2Parser.TopLevelDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#logicalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOrExpression(@NotNull Dart2Parser.LogicalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(@NotNull Dart2Parser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(@NotNull Dart2Parser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#uri}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUri(@NotNull Dart2Parser.UriContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(@NotNull Dart2Parser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#equalityOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityOperator(@NotNull Dart2Parser.EqualityOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#doStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoStatement(@NotNull Dart2Parser.DoStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#assignableExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignableExpression(@NotNull Dart2Parser.AssignableExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#binaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryOperator(@NotNull Dart2Parser.BinaryOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#tildeOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTildeOperator(@NotNull Dart2Parser.TildeOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#mapLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapLiteral(@NotNull Dart2Parser.MapLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#typeAlias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeAlias(@NotNull Dart2Parser.TypeAliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#staticFinalDeclarationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticFinalDeclarationList(@NotNull Dart2Parser.StaticFinalDeclarationListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#stringInterpolation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringInterpolation(@NotNull Dart2Parser.StringInterpolationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperator(@NotNull Dart2Parser.AssignmentOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#multiplicativeOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeOperator(@NotNull Dart2Parser.MultiplicativeOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(@NotNull Dart2Parser.OperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#configurationUri}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConfigurationUri(@NotNull Dart2Parser.ConfigurationUriContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#constantConstructorSignature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantConstructorSignature(@NotNull Dart2Parser.ConstantConstructorSignatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#yieldEachStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYieldEachStatement(@NotNull Dart2Parser.YieldEachStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#assignableSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignableSelector(@NotNull Dart2Parser.AssignableSelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#bitwiseAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitwiseAndExpression(@NotNull Dart2Parser.BitwiseAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#prefixOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixOperator(@NotNull Dart2Parser.PrefixOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#negationOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegationOperator(@NotNull Dart2Parser.NegationOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#namedFormalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedFormalParameters(@NotNull Dart2Parser.NamedFormalParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#booleanLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiteral(@NotNull Dart2Parser.BooleanLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#normalFormalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalFormalParameters(@NotNull Dart2Parser.NormalFormalParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#yieldStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYieldStatement(@NotNull Dart2Parser.YieldStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#declaredIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaredIdentifier(@NotNull Dart2Parser.DeclaredIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#awaitExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAwaitExpression(@NotNull Dart2Parser.AwaitExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#catchPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchPart(@NotNull Dart2Parser.CatchPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#initializedIdentifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializedIdentifierList(@NotNull Dart2Parser.InitializedIdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#compoundAssignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundAssignmentOperator(@NotNull Dart2Parser.CompoundAssignmentOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#nayaExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNayaExpression(@NotNull Dart2Parser.NayaExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(@NotNull Dart2Parser.FormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#uriTest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUriTest(@NotNull Dart2Parser.UriTestContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(@NotNull Dart2Parser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#setterSignature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetterSignature(@NotNull Dart2Parser.SetterSignatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#libraryExport}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLibraryExport(@NotNull Dart2Parser.LibraryExportContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#argumentPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentPart(@NotNull Dart2Parser.ArgumentPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#switchCase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchCase(@NotNull Dart2Parser.SwitchCaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#typeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameter(@NotNull Dart2Parser.TypeParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#tryStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryStatement(@NotNull Dart2Parser.TryStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#optionalPositionalFormalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionalPositionalFormalParameters(@NotNull Dart2Parser.OptionalPositionalFormalParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#fieldInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldInitializer(@NotNull Dart2Parser.FieldInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#constructorSignature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorSignature(@NotNull Dart2Parser.ConstructorSignatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#dottedIdentifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDottedIdentifierList(@NotNull Dart2Parser.DottedIdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(@NotNull Dart2Parser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#rethrowStatment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRethrowStatment(@NotNull Dart2Parser.RethrowStatmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#functionFormalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionFormalParameter(@NotNull Dart2Parser.FunctionFormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#throwExpressionWithoutCascade}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrowExpressionWithoutCascade(@NotNull Dart2Parser.ThrowExpressionWithoutCascadeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#switchStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStatement(@NotNull Dart2Parser.SwitchStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#initializedVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializedVariableDeclaration(@NotNull Dart2Parser.InitializedVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#importOrExport}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportOrExport(@NotNull Dart2Parser.ImportOrExportContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull Dart2Parser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#localFunctionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalFunctionDeclaration(@NotNull Dart2Parser.LocalFunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelector(@NotNull Dart2Parser.SelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#redirection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRedirection(@NotNull Dart2Parser.RedirectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#mixinApplicationClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMixinApplicationClass(@NotNull Dart2Parser.MixinApplicationClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#namedArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedArgument(@NotNull Dart2Parser.NamedArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#typeAliasBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeAliasBody(@NotNull Dart2Parser.TypeAliasBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#interfaces}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaces(@NotNull Dart2Parser.InterfacesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#nullLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullLiteral(@NotNull Dart2Parser.NullLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#symbolLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymbolLiteral(@NotNull Dart2Parser.SymbolLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#postfixOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixOperator(@NotNull Dart2Parser.PostfixOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#conditionalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(@NotNull Dart2Parser.ConditionalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#partDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartDeclaration(@NotNull Dart2Parser.PartDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#getterSignature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetterSignature(@NotNull Dart2Parser.GetterSignatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#breakStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStatement(@NotNull Dart2Parser.BreakStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(@NotNull Dart2Parser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel(@NotNull Dart2Parser.LabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#libraryimport}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLibraryimport(@NotNull Dart2Parser.LibraryimportContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#configurableUri}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConfigurableUri(@NotNull Dart2Parser.ConfigurableUriContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#onPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnPart(@NotNull Dart2Parser.OnPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(@NotNull Dart2Parser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclaration(@NotNull Dart2Parser.LocalVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#forLoopParts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLoopParts(@NotNull Dart2Parser.ForLoopPartsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#initializers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializers(@NotNull Dart2Parser.InitializersContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#thisExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThisExpression(@NotNull Dart2Parser.ThisExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#redirectingFactoryConstructorSignature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRedirectingFactoryConstructorSignature(@NotNull Dart2Parser.RedirectingFactoryConstructorSignatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(@NotNull Dart2Parser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#continueStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStatement(@NotNull Dart2Parser.ContinueStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#functionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBody(@NotNull Dart2Parser.FunctionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#initializerListEntry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializerListEntry(@NotNull Dart2Parser.InitializerListEntryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#defaultCase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultCase(@NotNull Dart2Parser.DefaultCaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#nonLabledStatment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonLabledStatment(@NotNull Dart2Parser.NonLabledStatmentContext ctx);
}