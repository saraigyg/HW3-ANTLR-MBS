// Generated from E:/Egyetem/Modellalapu Szoftverfejlesztes/2024/Gyak/GY02/TinyScript oktatói/TinyScript/src/tinyscript/TinyScript.g4 by ANTLR 4.13.1
package tinyscript.generated;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TinyScriptParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TinyScriptVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TinyScriptParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(TinyScriptParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyScriptParser#functionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinition(TinyScriptParser.FunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyScriptParser#returnType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnType(TinyScriptParser.ReturnTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyScriptParser#functionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionName(TinyScriptParser.FunctionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyScriptParser#functionParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionParameter(TinyScriptParser.FunctionParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyScriptParser#parameterType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterType(TinyScriptParser.ParameterTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyScriptParser#parameterName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterName(TinyScriptParser.ParameterNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyScriptParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(TinyScriptParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyScriptParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(TinyScriptParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyScriptParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(TinyScriptParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyScriptParser#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeName(TinyScriptParser.TypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyScriptParser#varName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarName(TinyScriptParser.VarNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyScriptParser#assignmentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStatement(TinyScriptParser.AssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyScriptParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(TinyScriptParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyScriptParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(TinyScriptParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyScriptParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(TinyScriptParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyScriptParser#elseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseStatement(TinyScriptParser.ElseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyScriptParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(TinyScriptParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyScriptParser#functionTarget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionTarget(TinyScriptParser.FunctionTargetContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyScriptParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(TinyScriptParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyScriptParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(TinyScriptParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryExpression}
	 * labeled alternative in {@link TinyScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(TinyScriptParser.PrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mulDivExpression}
	 * labeled alternative in {@link TinyScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDivExpression(TinyScriptParser.MulDivExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addSubExpression}
	 * labeled alternative in {@link TinyScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSubExpression(TinyScriptParser.AddSubExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalExpression}
	 * labeled alternative in {@link TinyScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalExpression(TinyScriptParser.LogicalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyScriptParser#addSubOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSubOp(TinyScriptParser.AddSubOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyScriptParser#mulDivOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDivOp(TinyScriptParser.MulDivOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyScriptParser#logicalOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOp(TinyScriptParser.LogicalOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyScriptParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(TinyScriptParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyScriptParser#parenthesizedExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedExpression(TinyScriptParser.ParenthesizedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyScriptParser#literalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralExpression(TinyScriptParser.LiteralExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyScriptParser#varRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarRef(TinyScriptParser.VarRefContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyScriptParser#nullLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullLiteral(TinyScriptParser.NullLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyScriptParser#intLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntLiteral(TinyScriptParser.IntLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyScriptParser#stringLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(TinyScriptParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyScriptParser#boolLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolLiteral(TinyScriptParser.BoolLiteralContext ctx);
}