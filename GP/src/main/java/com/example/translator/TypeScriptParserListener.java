// Generated from TypeScriptParser.g4 by ANTLR 4.4
package com.example.translator;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TypeScriptParser}.
 */
public interface TypeScriptParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#arrowFunctionBody}.
	 * @param ctx the parse tree
	 */
	void enterArrowFunctionBody(@NotNull TypeScriptParser.ArrowFunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#arrowFunctionBody}.
	 * @param ctx the parse tree
	 */
	void exitArrowFunctionBody(@NotNull TypeScriptParser.ArrowFunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterInExpression(@NotNull TypeScriptParser.InExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitInExpression(@NotNull TypeScriptParser.InExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#sourceElements}.
	 * @param ctx the parse tree
	 */
	void enterSourceElements(@NotNull TypeScriptParser.SourceElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#sourceElements}.
	 * @param ctx the parse tree
	 */
	void exitSourceElements(@NotNull TypeScriptParser.SourceElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#identifierOrKeyWord}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierOrKeyWord(@NotNull TypeScriptParser.IdentifierOrKeyWordContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#identifierOrKeyWord}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierOrKeyWord(@NotNull TypeScriptParser.IdentifierOrKeyWordContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#typeMemberList}.
	 * @param ctx the parse tree
	 */
	void enterTypeMemberList(@NotNull TypeScriptParser.TypeMemberListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#typeMemberList}.
	 * @param ctx the parse tree
	 */
	void exitTypeMemberList(@NotNull TypeScriptParser.TypeMemberListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#lastFormalParameterArg}.
	 * @param ctx the parse tree
	 */
	void enterLastFormalParameterArg(@NotNull TypeScriptParser.LastFormalParameterArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#lastFormalParameterArg}.
	 * @param ctx the parse tree
	 */
	void exitLastFormalParameterArg(@NotNull TypeScriptParser.LastFormalParameterArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(@NotNull TypeScriptParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(@NotNull TypeScriptParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#identifierName}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierName(@NotNull TypeScriptParser.IdentifierNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#identifierName}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierName(@NotNull TypeScriptParser.IdentifierNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeofExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterTypeofExpression(@NotNull TypeScriptParser.TypeofExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeofExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitTypeofExpression(@NotNull TypeScriptParser.TypeofExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#callSignature}.
	 * @param ctx the parse tree
	 */
	void enterCallSignature(@NotNull TypeScriptParser.CallSignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#callSignature}.
	 * @param ctx the parse tree
	 */
	void exitCallSignature(@NotNull TypeScriptParser.CallSignatureContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BitXOrExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterBitXOrExpression(@NotNull TypeScriptParser.BitXOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BitXOrExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitBitXOrExpression(@NotNull TypeScriptParser.BitXOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultiplicativeExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(@NotNull TypeScriptParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultiplicativeExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(@NotNull TypeScriptParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#numericLiteral}.
	 * @param ctx the parse tree
	 */
	void enterNumericLiteral(@NotNull TypeScriptParser.NumericLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#numericLiteral}.
	 * @param ctx the parse tree
	 */
	void exitNumericLiteral(@NotNull TypeScriptParser.NumericLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#generatorFunctionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGeneratorFunctionDeclaration(@NotNull TypeScriptParser.GeneratorFunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#generatorFunctionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGeneratorFunctionDeclaration(@NotNull TypeScriptParser.GeneratorFunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#constructSignature}.
	 * @param ctx the parse tree
	 */
	void enterConstructSignature(@NotNull TypeScriptParser.ConstructSignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#constructSignature}.
	 * @param ctx the parse tree
	 */
	void exitConstructSignature(@NotNull TypeScriptParser.ConstructSignatureContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AdditiveExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(@NotNull TypeScriptParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AdditiveExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(@NotNull TypeScriptParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RelationalExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(@NotNull TypeScriptParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RelationalExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(@NotNull TypeScriptParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(@NotNull TypeScriptParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(@NotNull TypeScriptParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#labelledStatement}.
	 * @param ctx the parse tree
	 */
	void enterLabelledStatement(@NotNull TypeScriptParser.LabelledStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#labelledStatement}.
	 * @param ctx the parse tree
	 */
	void exitLabelledStatement(@NotNull TypeScriptParser.LabelledStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#generatorBlock}.
	 * @param ctx the parse tree
	 */
	void enterGeneratorBlock(@NotNull TypeScriptParser.GeneratorBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#generatorBlock}.
	 * @param ctx the parse tree
	 */
	void exitGeneratorBlock(@NotNull TypeScriptParser.GeneratorBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#tupleElementTypes}.
	 * @param ctx the parse tree
	 */
	void enterTupleElementTypes(@NotNull TypeScriptParser.TupleElementTypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#tupleElementTypes}.
	 * @param ctx the parse tree
	 */
	void exitTupleElementTypes(@NotNull TypeScriptParser.TupleElementTypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#classExtendsClause}.
	 * @param ctx the parse tree
	 */
	void enterClassExtendsClause(@NotNull TypeScriptParser.ClassExtendsClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#classExtendsClause}.
	 * @param ctx the parse tree
	 */
	void exitClassExtendsClause(@NotNull TypeScriptParser.ClassExtendsClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#withStatement}.
	 * @param ctx the parse tree
	 */
	void enterWithStatement(@NotNull TypeScriptParser.WithStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#withStatement}.
	 * @param ctx the parse tree
	 */
	void exitWithStatement(@NotNull TypeScriptParser.WithStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#arrayElement}.
	 * @param ctx the parse tree
	 */
	void enterArrayElement(@NotNull TypeScriptParser.ArrayElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#arrayElement}.
	 * @param ctx the parse tree
	 */
	void exitArrayElement(@NotNull TypeScriptParser.ArrayElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#fromBlock}.
	 * @param ctx the parse tree
	 */
	void enterFromBlock(@NotNull TypeScriptParser.FromBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#fromBlock}.
	 * @param ctx the parse tree
	 */
	void exitFromBlock(@NotNull TypeScriptParser.FromBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BitAndExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterBitAndExpression(@NotNull TypeScriptParser.BitAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BitAndExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitBitAndExpression(@NotNull TypeScriptParser.BitAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#predefinedType}.
	 * @param ctx the parse tree
	 */
	void enterPredefinedType(@NotNull TypeScriptParser.PredefinedTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#predefinedType}.
	 * @param ctx the parse tree
	 */
	void exitPredefinedType(@NotNull TypeScriptParser.PredefinedTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(@NotNull TypeScriptParser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(@NotNull TypeScriptParser.TypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TernaryExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterTernaryExpression(@NotNull TypeScriptParser.TernaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TernaryExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitTernaryExpression(@NotNull TypeScriptParser.TernaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void enterArrayLiteral(@NotNull TypeScriptParser.ArrayLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void exitArrayLiteral(@NotNull TypeScriptParser.ArrayLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(@NotNull TypeScriptParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(@NotNull TypeScriptParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameters(@NotNull TypeScriptParser.TypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameters(@NotNull TypeScriptParser.TypeParametersContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PreDecreaseExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreDecreaseExpression(@NotNull TypeScriptParser.PreDecreaseExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PreDecreaseExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreDecreaseExpression(@NotNull TypeScriptParser.PreDecreaseExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Union}
	 * labeled alternative in {@link TypeScriptParser#unionOrIntersectionOrPrimaryType}.
	 * @param ctx the parse tree
	 */
	void enterUnion(@NotNull TypeScriptParser.UnionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Union}
	 * labeled alternative in {@link TypeScriptParser#unionOrIntersectionOrPrimaryType}.
	 * @param ctx the parse tree
	 */
	void exitUnion(@NotNull TypeScriptParser.UnionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#expressionSequence}.
	 * @param ctx the parse tree
	 */
	void enterExpressionSequence(@NotNull TypeScriptParser.ExpressionSequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#expressionSequence}.
	 * @param ctx the parse tree
	 */
	void exitExpressionSequence(@NotNull TypeScriptParser.ExpressionSequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(@NotNull TypeScriptParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(@NotNull TypeScriptParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#typeBody}.
	 * @param ctx the parse tree
	 */
	void enterTypeBody(@NotNull TypeScriptParser.TypeBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#typeBody}.
	 * @param ctx the parse tree
	 */
	void exitTypeBody(@NotNull TypeScriptParser.TypeBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#typeMember}.
	 * @param ctx the parse tree
	 */
	void enterTypeMember(@NotNull TypeScriptParser.TypeMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#typeMember}.
	 * @param ctx the parse tree
	 */
	void exitTypeMember(@NotNull TypeScriptParser.TypeMemberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PostDecreaseExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostDecreaseExpression(@NotNull TypeScriptParser.PostDecreaseExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PostDecreaseExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostDecreaseExpression(@NotNull TypeScriptParser.PostDecreaseExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#getAccessor}.
	 * @param ctx the parse tree
	 */
	void enterGetAccessor(@NotNull TypeScriptParser.GetAccessorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#getAccessor}.
	 * @param ctx the parse tree
	 */
	void exitGetAccessor(@NotNull TypeScriptParser.GetAccessorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#functionType}.
	 * @param ctx the parse tree
	 */
	void enterFunctionType(@NotNull TypeScriptParser.FunctionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#functionType}.
	 * @param ctx the parse tree
	 */
	void exitFunctionType(@NotNull TypeScriptParser.FunctionTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrowFunctionExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterArrowFunctionExpression(@NotNull TypeScriptParser.ArrowFunctionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrowFunctionExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitArrowFunctionExpression(@NotNull TypeScriptParser.ArrowFunctionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(@NotNull TypeScriptParser.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(@NotNull TypeScriptParser.EnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PostIncrementExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostIncrementExpression(@NotNull TypeScriptParser.PostIncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PostIncrementExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostIncrementExpression(@NotNull TypeScriptParser.PostIncrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#typeQueryExpression}.
	 * @param ctx the parse tree
	 */
	void enterTypeQueryExpression(@NotNull TypeScriptParser.TypeQueryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#typeQueryExpression}.
	 * @param ctx the parse tree
	 */
	void exitTypeQueryExpression(@NotNull TypeScriptParser.TypeQueryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void enterThrowStatement(@NotNull TypeScriptParser.ThrowStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void exitThrowStatement(@NotNull TypeScriptParser.ThrowStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#setAccessor}.
	 * @param ctx the parse tree
	 */
	void enterSetAccessor(@NotNull TypeScriptParser.SetAccessorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#setAccessor}.
	 * @param ctx the parse tree
	 */
	void exitSetAccessor(@NotNull TypeScriptParser.SetAccessorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(@NotNull TypeScriptParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(@NotNull TypeScriptParser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdentifierExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierExpression(@NotNull TypeScriptParser.IdentifierExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdentifierExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierExpression(@NotNull TypeScriptParser.IdentifierExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#propertyName}.
	 * @param ctx the parse tree
	 */
	void enterPropertyName(@NotNull TypeScriptParser.PropertyNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#propertyName}.
	 * @param ctx the parse tree
	 */
	void exitPropertyName(@NotNull TypeScriptParser.PropertyNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ObjectPrimType}
	 * labeled alternative in {@link TypeScriptParser#primaryType}.
	 * @param ctx the parse tree
	 */
	void enterObjectPrimType(@NotNull TypeScriptParser.ObjectPrimTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ObjectPrimType}
	 * labeled alternative in {@link TypeScriptParser#primaryType}.
	 * @param ctx the parse tree
	 */
	void exitObjectPrimType(@NotNull TypeScriptParser.ObjectPrimTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#generatorDefinition}.
	 * @param ctx the parse tree
	 */
	void enterGeneratorDefinition(@NotNull TypeScriptParser.GeneratorDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#generatorDefinition}.
	 * @param ctx the parse tree
	 */
	void exitGeneratorDefinition(@NotNull TypeScriptParser.GeneratorDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#setter}.
	 * @param ctx the parse tree
	 */
	void enterSetter(@NotNull TypeScriptParser.SetterContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#setter}.
	 * @param ctx the parse tree
	 */
	void exitSetter(@NotNull TypeScriptParser.SetterContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#classTail}.
	 * @param ctx the parse tree
	 */
	void enterClassTail(@NotNull TypeScriptParser.ClassTailContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#classTail}.
	 * @param ctx the parse tree
	 */
	void exitClassTail(@NotNull TypeScriptParser.ClassTailContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#getter}.
	 * @param ctx the parse tree
	 */
	void enterGetter(@NotNull TypeScriptParser.GetterContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#getter}.
	 * @param ctx the parse tree
	 */
	void exitGetter(@NotNull TypeScriptParser.GetterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PropertyShorthand}
	 * labeled alternative in {@link TypeScriptParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void enterPropertyShorthand(@NotNull TypeScriptParser.PropertyShorthandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PropertyShorthand}
	 * labeled alternative in {@link TypeScriptParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void exitPropertyShorthand(@NotNull TypeScriptParser.PropertyShorthandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GenericTypes}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterGenericTypes(@NotNull TypeScriptParser.GenericTypesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GenericTypes}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitGenericTypes(@NotNull TypeScriptParser.GenericTypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#tupleType}.
	 * @param ctx the parse tree
	 */
	void enterTupleType(@NotNull TypeScriptParser.TupleTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#tupleType}.
	 * @param ctx the parse tree
	 */
	void exitTupleType(@NotNull TypeScriptParser.TupleTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#typeAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterTypeAnnotation(@NotNull TypeScriptParser.TypeAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#typeAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitTypeAnnotation(@NotNull TypeScriptParser.TypeAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#objectType}.
	 * @param ctx the parse tree
	 */
	void enterObjectType(@NotNull TypeScriptParser.ObjectTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#objectType}.
	 * @param ctx the parse tree
	 */
	void exitObjectType(@NotNull TypeScriptParser.ObjectTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#statementList}.
	 * @param ctx the parse tree
	 */
	void enterStatementList(@NotNull TypeScriptParser.StatementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#statementList}.
	 * @param ctx the parse tree
	 */
	void exitStatementList(@NotNull TypeScriptParser.StatementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#typeReference}.
	 * @param ctx the parse tree
	 */
	void enterTypeReference(@NotNull TypeScriptParser.TypeReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#typeReference}.
	 * @param ctx the parse tree
	 */
	void exitTypeReference(@NotNull TypeScriptParser.TypeReferenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EqualityExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(@NotNull TypeScriptParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EqualityExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(@NotNull TypeScriptParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CastAsExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastAsExpression(@NotNull TypeScriptParser.CastAsExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CastAsExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastAsExpression(@NotNull TypeScriptParser.CastAsExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeyword(@NotNull TypeScriptParser.KeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeyword(@NotNull TypeScriptParser.KeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#namespaceName}.
	 * @param ctx the parse tree
	 */
	void enterNamespaceName(@NotNull TypeScriptParser.NamespaceNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#namespaceName}.
	 * @param ctx the parse tree
	 */
	void exitNamespaceName(@NotNull TypeScriptParser.NamespaceNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#yieldStatement}.
	 * @param ctx the parse tree
	 */
	void enterYieldStatement(@NotNull TypeScriptParser.YieldStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#yieldStatement}.
	 * @param ctx the parse tree
	 */
	void exitYieldStatement(@NotNull TypeScriptParser.YieldStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComputedPropertyExpressionAssignment}
	 * labeled alternative in {@link TypeScriptParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void enterComputedPropertyExpressionAssignment(@NotNull TypeScriptParser.ComputedPropertyExpressionAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComputedPropertyExpressionAssignment}
	 * labeled alternative in {@link TypeScriptParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void exitComputedPropertyExpressionAssignment(@NotNull TypeScriptParser.ComputedPropertyExpressionAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LiteralExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterLiteralExpression(@NotNull TypeScriptParser.LiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LiteralExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitLiteralExpression(@NotNull TypeScriptParser.LiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MemberDotExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterMemberDotExpression(@NotNull TypeScriptParser.MemberDotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MemberDotExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitMemberDotExpression(@NotNull TypeScriptParser.MemberDotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#typeParameterList}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameterList(@NotNull TypeScriptParser.TypeParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#typeParameterList}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameterList(@NotNull TypeScriptParser.TypeParameterListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MemberIndexExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterMemberIndexExpression(@NotNull TypeScriptParser.MemberIndexExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MemberIndexExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitMemberIndexExpression(@NotNull TypeScriptParser.MemberIndexExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(@NotNull TypeScriptParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(@NotNull TypeScriptParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#asExpression}.
	 * @param ctx the parse tree
	 */
	void enterAsExpression(@NotNull TypeScriptParser.AsExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#asExpression}.
	 * @param ctx the parse tree
	 */
	void exitAsExpression(@NotNull TypeScriptParser.AsExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForVarInStatement}
	 * labeled alternative in {@link TypeScriptParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterForVarInStatement(@NotNull TypeScriptParser.ForVarInStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForVarInStatement}
	 * labeled alternative in {@link TypeScriptParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitForVarInStatement(@NotNull TypeScriptParser.ForVarInStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignmentOperatorExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperatorExpression(@NotNull TypeScriptParser.AssignmentOperatorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignmentOperatorExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperatorExpression(@NotNull TypeScriptParser.AssignmentOperatorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(@NotNull TypeScriptParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(@NotNull TypeScriptParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#multipleImportStatement}.
	 * @param ctx the parse tree
	 */
	void enterMultipleImportStatement(@NotNull TypeScriptParser.MultipleImportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#multipleImportStatement}.
	 * @param ctx the parse tree
	 */
	void exitMultipleImportStatement(@NotNull TypeScriptParser.MultipleImportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(@NotNull TypeScriptParser.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(@NotNull TypeScriptParser.TypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#debuggerStatement}.
	 * @param ctx the parse tree
	 */
	void enterDebuggerStatement(@NotNull TypeScriptParser.DebuggerStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#debuggerStatement}.
	 * @param ctx the parse tree
	 */
	void exitDebuggerStatement(@NotNull TypeScriptParser.DebuggerStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#arrowFunctionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterArrowFunctionDeclaration(@NotNull TypeScriptParser.ArrowFunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#arrowFunctionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitArrowFunctionDeclaration(@NotNull TypeScriptParser.ArrowFunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayPrimType}
	 * labeled alternative in {@link TypeScriptParser#primaryType}.
	 * @param ctx the parse tree
	 */
	void enterArrayPrimType(@NotNull TypeScriptParser.ArrayPrimTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayPrimType}
	 * labeled alternative in {@link TypeScriptParser#primaryType}.
	 * @param ctx the parse tree
	 */
	void exitArrayPrimType(@NotNull TypeScriptParser.ArrayPrimTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DoStatement}
	 * labeled alternative in {@link TypeScriptParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoStatement(@NotNull TypeScriptParser.DoStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DoStatement}
	 * labeled alternative in {@link TypeScriptParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoStatement(@NotNull TypeScriptParser.DoStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgument(@NotNull TypeScriptParser.TypeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgument(@NotNull TypeScriptParser.TypeArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#decoratorCallExpression}.
	 * @param ctx the parse tree
	 */
	void enterDecoratorCallExpression(@NotNull TypeScriptParser.DecoratorCallExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#decoratorCallExpression}.
	 * @param ctx the parse tree
	 */
	void exitDecoratorCallExpression(@NotNull TypeScriptParser.DecoratorCallExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ObjectLiteralExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterObjectLiteralExpression(@NotNull TypeScriptParser.ObjectLiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ObjectLiteralExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitObjectLiteralExpression(@NotNull TypeScriptParser.ObjectLiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#functionExpressionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionExpressionDeclaration(@NotNull TypeScriptParser.FunctionExpressionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#functionExpressionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionExpressionDeclaration(@NotNull TypeScriptParser.FunctionExpressionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#enumBody}.
	 * @param ctx the parse tree
	 */
	void enterEnumBody(@NotNull TypeScriptParser.EnumBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#enumBody}.
	 * @param ctx the parse tree
	 */
	void exitEnumBody(@NotNull TypeScriptParser.EnumBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#bindingPattern}.
	 * @param ctx the parse tree
	 */
	void enterBindingPattern(@NotNull TypeScriptParser.BindingPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#bindingPattern}.
	 * @param ctx the parse tree
	 */
	void exitBindingPattern(@NotNull TypeScriptParser.BindingPatternContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(@NotNull TypeScriptParser.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(@NotNull TypeScriptParser.NotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#formalParameterArg}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterArg(@NotNull TypeScriptParser.FormalParameterArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#formalParameterArg}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterArg(@NotNull TypeScriptParser.FormalParameterArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#variableStatement}.
	 * @param ctx the parse tree
	 */
	void enterVariableStatement(@NotNull TypeScriptParser.VariableStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#variableStatement}.
	 * @param ctx the parse tree
	 */
	void exitVariableStatement(@NotNull TypeScriptParser.VariableStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionExpression(@NotNull TypeScriptParser.FunctionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionExpression(@NotNull TypeScriptParser.FunctionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryMinusExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryMinusExpression(@NotNull TypeScriptParser.UnaryMinusExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryMinusExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryMinusExpression(@NotNull TypeScriptParser.UnaryMinusExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignmentExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(@NotNull TypeScriptParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignmentExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(@NotNull TypeScriptParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PropertyDeclarationExpression}
	 * labeled alternative in {@link TypeScriptParser#propertyMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPropertyDeclarationExpression(@NotNull TypeScriptParser.PropertyDeclarationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PropertyDeclarationExpression}
	 * labeled alternative in {@link TypeScriptParser#propertyMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPropertyDeclarationExpression(@NotNull TypeScriptParser.PropertyDeclarationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#requiredParameter}.
	 * @param ctx the parse tree
	 */
	void enterRequiredParameter(@NotNull TypeScriptParser.RequiredParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#requiredParameter}.
	 * @param ctx the parse tree
	 */
	void exitRequiredParameter(@NotNull TypeScriptParser.RequiredParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull TypeScriptParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull TypeScriptParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DeleteExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterDeleteExpression(@NotNull TypeScriptParser.DeleteExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DeleteExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitDeleteExpression(@NotNull TypeScriptParser.DeleteExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IteratorsExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterIteratorsExpression(@NotNull TypeScriptParser.IteratorsExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IteratorsExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitIteratorsExpression(@NotNull TypeScriptParser.IteratorsExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SuperExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterSuperExpression(@NotNull TypeScriptParser.SuperExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SuperExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitSuperExpression(@NotNull TypeScriptParser.SuperExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#decoratorMemberExpression}.
	 * @param ctx the parse tree
	 */
	void enterDecoratorMemberExpression(@NotNull TypeScriptParser.DecoratorMemberExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#decoratorMemberExpression}.
	 * @param ctx the parse tree
	 */
	void exitDecoratorMemberExpression(@NotNull TypeScriptParser.DecoratorMemberExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code YieldExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterYieldExpression(@NotNull TypeScriptParser.YieldExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code YieldExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitYieldExpression(@NotNull TypeScriptParser.YieldExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForVarStatement}
	 * labeled alternative in {@link TypeScriptParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterForVarStatement(@NotNull TypeScriptParser.ForVarStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForVarStatement}
	 * labeled alternative in {@link TypeScriptParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitForVarStatement(@NotNull TypeScriptParser.ForVarStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#sourceElement}.
	 * @param ctx the parse tree
	 */
	void enterSourceElement(@NotNull TypeScriptParser.SourceElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#sourceElement}.
	 * @param ctx the parse tree
	 */
	void exitSourceElement(@NotNull TypeScriptParser.SourceElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GetterSetterDeclarationExpression}
	 * labeled alternative in {@link TypeScriptParser#propertyMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGetterSetterDeclarationExpression(@NotNull TypeScriptParser.GetterSetterDeclarationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GetterSetterDeclarationExpression}
	 * labeled alternative in {@link TypeScriptParser#propertyMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGetterSetterDeclarationExpression(@NotNull TypeScriptParser.GetterSetterDeclarationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClassExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterClassExpression(@NotNull TypeScriptParser.ClassExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClassExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitClassExpression(@NotNull TypeScriptParser.ClassExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(@NotNull TypeScriptParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(@NotNull TypeScriptParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code QueryPrimType}
	 * labeled alternative in {@link TypeScriptParser#primaryType}.
	 * @param ctx the parse tree
	 */
	void enterQueryPrimType(@NotNull TypeScriptParser.QueryPrimTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code QueryPrimType}
	 * labeled alternative in {@link TypeScriptParser#primaryType}.
	 * @param ctx the parse tree
	 */
	void exitQueryPrimType(@NotNull TypeScriptParser.QueryPrimTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#identifierOrPattern}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierOrPattern(@NotNull TypeScriptParser.IdentifierOrPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#identifierOrPattern}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierOrPattern(@NotNull TypeScriptParser.IdentifierOrPatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#decoratorList}.
	 * @param ctx the parse tree
	 */
	void enterDecoratorList(@NotNull TypeScriptParser.DecoratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#decoratorList}.
	 * @param ctx the parse tree
	 */
	void exitDecoratorList(@NotNull TypeScriptParser.DecoratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(@NotNull TypeScriptParser.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(@NotNull TypeScriptParser.FunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#typeIncludeGeneric}.
	 * @param ctx the parse tree
	 */
	void enterTypeIncludeGeneric(@NotNull TypeScriptParser.TypeIncludeGenericContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#typeIncludeGeneric}.
	 * @param ctx the parse tree
	 */
	void exitTypeIncludeGeneric(@NotNull TypeScriptParser.TypeIncludeGenericContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#type_}.
	 * @param ctx the parse tree
	 */
	void enterType_(@NotNull TypeScriptParser.Type_Context ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#type_}.
	 * @param ctx the parse tree
	 */
	void exitType_(@NotNull TypeScriptParser.Type_Context ctx);
	/**
	 * Enter a parse tree produced by the {@code PropertyExpressionAssignment}
	 * labeled alternative in {@link TypeScriptParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void enterPropertyExpressionAssignment(@NotNull TypeScriptParser.PropertyExpressionAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PropertyExpressionAssignment}
	 * labeled alternative in {@link TypeScriptParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void exitPropertyExpressionAssignment(@NotNull TypeScriptParser.PropertyExpressionAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TemplateStringExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterTemplateStringExpression(@NotNull TypeScriptParser.TemplateStringExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplateStringExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitTemplateStringExpression(@NotNull TypeScriptParser.TemplateStringExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#enumMemberList}.
	 * @param ctx the parse tree
	 */
	void enterEnumMemberList(@NotNull TypeScriptParser.EnumMemberListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#enumMemberList}.
	 * @param ctx the parse tree
	 */
	void exitEnumMemberList(@NotNull TypeScriptParser.EnumMemberListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GeneratorsExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterGeneratorsExpression(@NotNull TypeScriptParser.GeneratorsExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GeneratorsExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitGeneratorsExpression(@NotNull TypeScriptParser.GeneratorsExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PredefinedPrimType}
	 * labeled alternative in {@link TypeScriptParser#primaryType}.
	 * @param ctx the parse tree
	 */
	void enterPredefinedPrimType(@NotNull TypeScriptParser.PredefinedPrimTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PredefinedPrimType}
	 * labeled alternative in {@link TypeScriptParser#primaryType}.
	 * @param ctx the parse tree
	 */
	void exitPredefinedPrimType(@NotNull TypeScriptParser.PredefinedPrimTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#eos}.
	 * @param ctx the parse tree
	 */
	void enterEos(@NotNull TypeScriptParser.EosContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#eos}.
	 * @param ctx the parse tree
	 */
	void exitEos(@NotNull TypeScriptParser.EosContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull TypeScriptParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull TypeScriptParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArgumentsExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterArgumentsExpression(@NotNull TypeScriptParser.ArgumentsExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArgumentsExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitArgumentsExpression(@NotNull TypeScriptParser.ArgumentsExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#namespaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNamespaceDeclaration(@NotNull TypeScriptParser.NamespaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#namespaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNamespaceDeclaration(@NotNull TypeScriptParser.NamespaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#methodSignature}.
	 * @param ctx the parse tree
	 */
	void enterMethodSignature(@NotNull TypeScriptParser.MethodSignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#methodSignature}.
	 * @param ctx the parse tree
	 */
	void exitMethodSignature(@NotNull TypeScriptParser.MethodSignatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull TypeScriptParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull TypeScriptParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(@NotNull TypeScriptParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(@NotNull TypeScriptParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GeneratorsFunctionExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterGeneratorsFunctionExpression(@NotNull TypeScriptParser.GeneratorsFunctionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GeneratorsFunctionExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitGeneratorsFunctionExpression(@NotNull TypeScriptParser.GeneratorsFunctionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForInStatement}
	 * labeled alternative in {@link TypeScriptParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterForInStatement(@NotNull TypeScriptParser.ForInStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForInStatement}
	 * labeled alternative in {@link TypeScriptParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitForInStatement(@NotNull TypeScriptParser.ForInStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement(@NotNull TypeScriptParser.EmptyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement(@NotNull TypeScriptParser.EmptyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#requiredParameterList}.
	 * @param ctx the parse tree
	 */
	void enterRequiredParameterList(@NotNull TypeScriptParser.RequiredParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#requiredParameterList}.
	 * @param ctx the parse tree
	 */
	void exitRequiredParameterList(@NotNull TypeScriptParser.RequiredParameterListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NewExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterNewExpression(@NotNull TypeScriptParser.NewExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NewExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitNewExpression(@NotNull TypeScriptParser.NewExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#classHeritage}.
	 * @param ctx the parse tree
	 */
	void enterClassHeritage(@NotNull TypeScriptParser.ClassHeritageContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#classHeritage}.
	 * @param ctx the parse tree
	 */
	void exitClassHeritage(@NotNull TypeScriptParser.ClassHeritageContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MethodDeclarationExpression}
	 * labeled alternative in {@link TypeScriptParser#propertyMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclarationExpression(@NotNull TypeScriptParser.MethodDeclarationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MethodDeclarationExpression}
	 * labeled alternative in {@link TypeScriptParser#propertyMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclarationExpression(@NotNull TypeScriptParser.MethodDeclarationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AbstractMemberDeclaration}
	 * labeled alternative in {@link TypeScriptParser#propertyMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAbstractMemberDeclaration(@NotNull TypeScriptParser.AbstractMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AbstractMemberDeclaration}
	 * labeled alternative in {@link TypeScriptParser#propertyMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAbstractMemberDeclaration(@NotNull TypeScriptParser.AbstractMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RedefinitionOfType}
	 * labeled alternative in {@link TypeScriptParser#primaryType}.
	 * @param ctx the parse tree
	 */
	void enterRedefinitionOfType(@NotNull TypeScriptParser.RedefinitionOfTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RedefinitionOfType}
	 * labeled alternative in {@link TypeScriptParser#primaryType}.
	 * @param ctx the parse tree
	 */
	void exitRedefinitionOfType(@NotNull TypeScriptParser.RedefinitionOfTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#exportStatement}.
	 * @param ctx the parse tree
	 */
	void enterExportStatement(@NotNull TypeScriptParser.ExportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#exportStatement}.
	 * @param ctx the parse tree
	 */
	void exitExportStatement(@NotNull TypeScriptParser.ExportStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BitOrExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterBitOrExpression(@NotNull TypeScriptParser.BitOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BitOrExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitBitOrExpression(@NotNull TypeScriptParser.BitOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VoidExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterVoidExpression(@NotNull TypeScriptParser.VoidExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VoidExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitVoidExpression(@NotNull TypeScriptParser.VoidExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Intersection}
	 * labeled alternative in {@link TypeScriptParser#unionOrIntersectionOrPrimaryType}.
	 * @param ctx the parse tree
	 */
	void enterIntersection(@NotNull TypeScriptParser.IntersectionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Intersection}
	 * labeled alternative in {@link TypeScriptParser#unionOrIntersectionOrPrimaryType}.
	 * @param ctx the parse tree
	 */
	void exitIntersection(@NotNull TypeScriptParser.IntersectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#propertySignatur}.
	 * @param ctx the parse tree
	 */
	void enterPropertySignatur(@NotNull TypeScriptParser.PropertySignaturContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#propertySignatur}.
	 * @param ctx the parse tree
	 */
	void exitPropertySignatur(@NotNull TypeScriptParser.PropertySignaturContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#decorator}.
	 * @param ctx the parse tree
	 */
	void enterDecorator(@NotNull TypeScriptParser.DecoratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#decorator}.
	 * @param ctx the parse tree
	 */
	void exitDecorator(@NotNull TypeScriptParser.DecoratorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalAndExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpression(@NotNull TypeScriptParser.LogicalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalAndExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpression(@NotNull TypeScriptParser.LogicalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterImportStatement(@NotNull TypeScriptParser.ImportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitImportStatement(@NotNull TypeScriptParser.ImportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(@NotNull TypeScriptParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(@NotNull TypeScriptParser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileStatement}
	 * labeled alternative in {@link TypeScriptParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(@NotNull TypeScriptParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileStatement}
	 * labeled alternative in {@link TypeScriptParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(@NotNull TypeScriptParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#defaultClause}.
	 * @param ctx the parse tree
	 */
	void enterDefaultClause(@NotNull TypeScriptParser.DefaultClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#defaultClause}.
	 * @param ctx the parse tree
	 */
	void exitDefaultClause(@NotNull TypeScriptParser.DefaultClauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenthesizedPrimType}
	 * labeled alternative in {@link TypeScriptParser#primaryType}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedPrimType(@NotNull TypeScriptParser.ParenthesizedPrimTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenthesizedPrimType}
	 * labeled alternative in {@link TypeScriptParser#primaryType}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedPrimType(@NotNull TypeScriptParser.ParenthesizedPrimTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#restParameter}.
	 * @param ctx the parse tree
	 */
	void enterRestParameter(@NotNull TypeScriptParser.RestParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#restParameter}.
	 * @param ctx the parse tree
	 */
	void exitRestParameter(@NotNull TypeScriptParser.RestParameterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryPlusExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryPlusExpression(@NotNull TypeScriptParser.UnaryPlusExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryPlusExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryPlusExpression(@NotNull TypeScriptParser.UnaryPlusExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForStatement}
	 * labeled alternative in {@link TypeScriptParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(@NotNull TypeScriptParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForStatement}
	 * labeled alternative in {@link TypeScriptParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(@NotNull TypeScriptParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#typeAliasDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeAliasDeclaration(@NotNull TypeScriptParser.TypeAliasDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#typeAliasDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeAliasDeclaration(@NotNull TypeScriptParser.TypeAliasDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#caseBlock}.
	 * @param ctx the parse tree
	 */
	void enterCaseBlock(@NotNull TypeScriptParser.CaseBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#caseBlock}.
	 * @param ctx the parse tree
	 */
	void exitCaseBlock(@NotNull TypeScriptParser.CaseBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#arrowFunctionParameters}.
	 * @param ctx the parse tree
	 */
	void enterArrowFunctionParameters(@NotNull TypeScriptParser.ArrowFunctionParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#arrowFunctionParameters}.
	 * @param ctx the parse tree
	 */
	void exitArrowFunctionParameters(@NotNull TypeScriptParser.ArrowFunctionParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#caseClauses}.
	 * @param ctx the parse tree
	 */
	void enterCaseClauses(@NotNull TypeScriptParser.CaseClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#caseClauses}.
	 * @param ctx the parse tree
	 */
	void exitCaseClauses(@NotNull TypeScriptParser.CaseClausesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenthesizedExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedExpression(@NotNull TypeScriptParser.ParenthesizedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenthesizedExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedExpression(@NotNull TypeScriptParser.ParenthesizedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#objectLiteral}.
	 * @param ctx the parse tree
	 */
	void enterObjectLiteral(@NotNull TypeScriptParser.ObjectLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#objectLiteral}.
	 * @param ctx the parse tree
	 */
	void exitObjectLiteral(@NotNull TypeScriptParser.ObjectLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#indexMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterIndexMemberDeclaration(@NotNull TypeScriptParser.IndexMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#indexMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitIndexMemberDeclaration(@NotNull TypeScriptParser.IndexMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#classElement}.
	 * @param ctx the parse tree
	 */
	void enterClassElement(@NotNull TypeScriptParser.ClassElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#classElement}.
	 * @param ctx the parse tree
	 */
	void exitClassElement(@NotNull TypeScriptParser.ClassElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#typeArgumentList}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentList(@NotNull TypeScriptParser.TypeArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#typeArgumentList}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentList(@NotNull TypeScriptParser.TypeArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#nestedTypeGeneric}.
	 * @param ctx the parse tree
	 */
	void enterNestedTypeGeneric(@NotNull TypeScriptParser.NestedTypeGenericContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#nestedTypeGeneric}.
	 * @param ctx the parse tree
	 */
	void exitNestedTypeGeneric(@NotNull TypeScriptParser.NestedTypeGenericContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#initializer}.
	 * @param ctx the parse tree
	 */
	void enterInitializer(@NotNull TypeScriptParser.InitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#initializer}.
	 * @param ctx the parse tree
	 */
	void exitInitializer(@NotNull TypeScriptParser.InitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(@NotNull TypeScriptParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(@NotNull TypeScriptParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#implementsClause}.
	 * @param ctx the parse tree
	 */
	void enterImplementsClause(@NotNull TypeScriptParser.ImplementsClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#implementsClause}.
	 * @param ctx the parse tree
	 */
	void exitImplementsClause(@NotNull TypeScriptParser.ImplementsClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#constraint}.
	 * @param ctx the parse tree
	 */
	void enterConstraint(@NotNull TypeScriptParser.ConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#constraint}.
	 * @param ctx the parse tree
	 */
	void exitConstraint(@NotNull TypeScriptParser.ConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#caseClause}.
	 * @param ctx the parse tree
	 */
	void enterCaseClause(@NotNull TypeScriptParser.CaseClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#caseClause}.
	 * @param ctx the parse tree
	 */
	void exitCaseClause(@NotNull TypeScriptParser.CaseClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#interfaceExtendsClause}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceExtendsClause(@NotNull TypeScriptParser.InterfaceExtendsClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#interfaceExtendsClause}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceExtendsClause(@NotNull TypeScriptParser.InterfaceExtendsClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#variableDeclarationList}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationList(@NotNull TypeScriptParser.VariableDeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#variableDeclarationList}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationList(@NotNull TypeScriptParser.VariableDeclarationListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReferencePrimType}
	 * labeled alternative in {@link TypeScriptParser#primaryType}.
	 * @param ctx the parse tree
	 */
	void enterReferencePrimType(@NotNull TypeScriptParser.ReferencePrimTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReferencePrimType}
	 * labeled alternative in {@link TypeScriptParser#primaryType}.
	 * @param ctx the parse tree
	 */
	void exitReferencePrimType(@NotNull TypeScriptParser.ReferencePrimTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(@NotNull TypeScriptParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(@NotNull TypeScriptParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#enumMember}.
	 * @param ctx the parse tree
	 */
	void enterEnumMember(@NotNull TypeScriptParser.EnumMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#enumMember}.
	 * @param ctx the parse tree
	 */
	void exitEnumMember(@NotNull TypeScriptParser.EnumMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(@NotNull TypeScriptParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(@NotNull TypeScriptParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(@NotNull TypeScriptParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(@NotNull TypeScriptParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ThisExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterThisExpression(@NotNull TypeScriptParser.ThisExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ThisExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitThisExpression(@NotNull TypeScriptParser.ThisExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Primary}
	 * labeled alternative in {@link TypeScriptParser#unionOrIntersectionOrPrimaryType}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(@NotNull TypeScriptParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Primary}
	 * labeled alternative in {@link TypeScriptParser#unionOrIntersectionOrPrimaryType}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(@NotNull TypeScriptParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ThisPrimType}
	 * labeled alternative in {@link TypeScriptParser#primaryType}.
	 * @param ctx the parse tree
	 */
	void enterThisPrimType(@NotNull TypeScriptParser.ThisPrimTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ThisPrimType}
	 * labeled alternative in {@link TypeScriptParser#primaryType}.
	 * @param ctx the parse tree
	 */
	void exitThisPrimType(@NotNull TypeScriptParser.ThisPrimTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PropertyGetter}
	 * labeled alternative in {@link TypeScriptParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void enterPropertyGetter(@NotNull TypeScriptParser.PropertyGetterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PropertyGetter}
	 * labeled alternative in {@link TypeScriptParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void exitPropertyGetter(@NotNull TypeScriptParser.PropertyGetterContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#elementList}.
	 * @param ctx the parse tree
	 */
	void enterElementList(@NotNull TypeScriptParser.ElementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#elementList}.
	 * @param ctx the parse tree
	 */
	void exitElementList(@NotNull TypeScriptParser.ElementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#typeQuery}.
	 * @param ctx the parse tree
	 */
	void enterTypeQuery(@NotNull TypeScriptParser.TypeQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#typeQuery}.
	 * @param ctx the parse tree
	 */
	void exitTypeQuery(@NotNull TypeScriptParser.TypeQueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BitShiftExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterBitShiftExpression(@NotNull TypeScriptParser.BitShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BitShiftExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitBitShiftExpression(@NotNull TypeScriptParser.BitShiftExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BitNotExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterBitNotExpression(@NotNull TypeScriptParser.BitNotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BitNotExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitBitNotExpression(@NotNull TypeScriptParser.BitNotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PropertySetter}
	 * labeled alternative in {@link TypeScriptParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void enterPropertySetter(@NotNull TypeScriptParser.PropertySetterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PropertySetter}
	 * labeled alternative in {@link TypeScriptParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void exitPropertySetter(@NotNull TypeScriptParser.PropertySetterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayLiteralExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterArrayLiteralExpression(@NotNull TypeScriptParser.ArrayLiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayLiteralExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitArrayLiteralExpression(@NotNull TypeScriptParser.ArrayLiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#typeGeneric}.
	 * @param ctx the parse tree
	 */
	void enterTypeGeneric(@NotNull TypeScriptParser.TypeGenericContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#typeGeneric}.
	 * @param ctx the parse tree
	 */
	void exitTypeGeneric(@NotNull TypeScriptParser.TypeGenericContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#constructorType}.
	 * @param ctx the parse tree
	 */
	void enterConstructorType(@NotNull TypeScriptParser.ConstructorTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#constructorType}.
	 * @param ctx the parse tree
	 */
	void exitConstructorType(@NotNull TypeScriptParser.ConstructorTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#generatorMethod}.
	 * @param ctx the parse tree
	 */
	void enterGeneratorMethod(@NotNull TypeScriptParser.GeneratorMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#generatorMethod}.
	 * @param ctx the parse tree
	 */
	void exitGeneratorMethod(@NotNull TypeScriptParser.GeneratorMethodContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TuplePrimType}
	 * labeled alternative in {@link TypeScriptParser#primaryType}.
	 * @param ctx the parse tree
	 */
	void enterTuplePrimType(@NotNull TypeScriptParser.TuplePrimTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TuplePrimType}
	 * labeled alternative in {@link TypeScriptParser#primaryType}.
	 * @param ctx the parse tree
	 */
	void exitTuplePrimType(@NotNull TypeScriptParser.TuplePrimTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#accessibilityModifier}.
	 * @param ctx the parse tree
	 */
	void enterAccessibilityModifier(@NotNull TypeScriptParser.AccessibilityModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#accessibilityModifier}.
	 * @param ctx the parse tree
	 */
	void exitAccessibilityModifier(@NotNull TypeScriptParser.AccessibilityModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#optionalParameter}.
	 * @param ctx the parse tree
	 */
	void enterOptionalParameter(@NotNull TypeScriptParser.OptionalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#optionalParameter}.
	 * @param ctx the parse tree
	 */
	void exitOptionalParameter(@NotNull TypeScriptParser.OptionalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#propertyMemberBase}.
	 * @param ctx the parse tree
	 */
	void enterPropertyMemberBase(@NotNull TypeScriptParser.PropertyMemberBaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#propertyMemberBase}.
	 * @param ctx the parse tree
	 */
	void exitPropertyMemberBase(@NotNull TypeScriptParser.PropertyMemberBaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#abstractDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAbstractDeclaration(@NotNull TypeScriptParser.AbstractDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#abstractDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAbstractDeclaration(@NotNull TypeScriptParser.AbstractDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void enterTryStatement(@NotNull TypeScriptParser.TryStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void exitTryStatement(@NotNull TypeScriptParser.TryStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PreIncrementExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreIncrementExpression(@NotNull TypeScriptParser.PreIncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PreIncrementExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreIncrementExpression(@NotNull TypeScriptParser.PreIncrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#indexSignature}.
	 * @param ctx the parse tree
	 */
	void enterIndexSignature(@NotNull TypeScriptParser.IndexSignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#indexSignature}.
	 * @param ctx the parse tree
	 */
	void exitIndexSignature(@NotNull TypeScriptParser.IndexSignatureContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalOrExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpression(@NotNull TypeScriptParser.LogicalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalOrExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpression(@NotNull TypeScriptParser.LogicalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatement(@NotNull TypeScriptParser.SwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatement(@NotNull TypeScriptParser.SwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(@NotNull TypeScriptParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(@NotNull TypeScriptParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#iteratorDefinition}.
	 * @param ctx the parse tree
	 */
	void enterIteratorDefinition(@NotNull TypeScriptParser.IteratorDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#iteratorDefinition}.
	 * @param ctx the parse tree
	 */
	void exitIteratorDefinition(@NotNull TypeScriptParser.IteratorDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#importAliasDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportAliasDeclaration(@NotNull TypeScriptParser.ImportAliasDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#importAliasDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportAliasDeclaration(@NotNull TypeScriptParser.ImportAliasDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(@NotNull TypeScriptParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(@NotNull TypeScriptParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InstanceofExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterInstanceofExpression(@NotNull TypeScriptParser.InstanceofExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InstanceofExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitInstanceofExpression(@NotNull TypeScriptParser.InstanceofExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(@NotNull TypeScriptParser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(@NotNull TypeScriptParser.InterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(@NotNull TypeScriptParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(@NotNull TypeScriptParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RestParameterInObject}
	 * labeled alternative in {@link TypeScriptParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void enterRestParameterInObject(@NotNull TypeScriptParser.RestParameterInObjectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RestParameterInObject}
	 * labeled alternative in {@link TypeScriptParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void exitRestParameterInObject(@NotNull TypeScriptParser.RestParameterInObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#iteratorBlock}.
	 * @param ctx the parse tree
	 */
	void enterIteratorBlock(@NotNull TypeScriptParser.IteratorBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#iteratorBlock}.
	 * @param ctx the parse tree
	 */
	void exitIteratorBlock(@NotNull TypeScriptParser.IteratorBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#reservedWord}.
	 * @param ctx the parse tree
	 */
	void enterReservedWord(@NotNull TypeScriptParser.ReservedWordContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#reservedWord}.
	 * @param ctx the parse tree
	 */
	void exitReservedWord(@NotNull TypeScriptParser.ReservedWordContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#finallyProduction}.
	 * @param ctx the parse tree
	 */
	void enterFinallyProduction(@NotNull TypeScriptParser.FinallyProductionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#finallyProduction}.
	 * @param ctx the parse tree
	 */
	void exitFinallyProduction(@NotNull TypeScriptParser.FinallyProductionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#classOrInterfaceTypeList}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceTypeList(@NotNull TypeScriptParser.ClassOrInterfaceTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#classOrInterfaceTypeList}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceTypeList(@NotNull TypeScriptParser.ClassOrInterfaceTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#catchProduction}.
	 * @param ctx the parse tree
	 */
	void enterCatchProduction(@NotNull TypeScriptParser.CatchProductionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#catchProduction}.
	 * @param ctx the parse tree
	 */
	void exitCatchProduction(@NotNull TypeScriptParser.CatchProductionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(@NotNull TypeScriptParser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(@NotNull TypeScriptParser.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(@NotNull TypeScriptParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(@NotNull TypeScriptParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#varModifier}.
	 * @param ctx the parse tree
	 */
	void enterVarModifier(@NotNull TypeScriptParser.VarModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#varModifier}.
	 * @param ctx the parse tree
	 */
	void exitVarModifier(@NotNull TypeScriptParser.VarModifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MethodProperty}
	 * labeled alternative in {@link TypeScriptParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void enterMethodProperty(@NotNull TypeScriptParser.MethodPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MethodProperty}
	 * labeled alternative in {@link TypeScriptParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void exitMethodProperty(@NotNull TypeScriptParser.MethodPropertyContext ctx);
}