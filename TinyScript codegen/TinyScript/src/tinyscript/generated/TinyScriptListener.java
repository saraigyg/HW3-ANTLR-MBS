// Generated from E:/Egyetem/Modellalapu Szoftverfejlesztes/2024/Gyak/GY02/TinyScript oktatói/TinyScript/src/tinyscript/TinyScript.g4 by ANTLR 4.13.1
package tinyscript.generated;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TinyScriptParser}.
 */
public interface TinyScriptListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TinyScriptParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(TinyScriptParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyScriptParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(TinyScriptParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyScriptParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(TinyScriptParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyScriptParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(TinyScriptParser.FunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyScriptParser#returnType}.
	 * @param ctx the parse tree
	 */
	void enterReturnType(TinyScriptParser.ReturnTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyScriptParser#returnType}.
	 * @param ctx the parse tree
	 */
	void exitReturnType(TinyScriptParser.ReturnTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyScriptParser#functionName}.
	 * @param ctx the parse tree
	 */
	void enterFunctionName(TinyScriptParser.FunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyScriptParser#functionName}.
	 * @param ctx the parse tree
	 */
	void exitFunctionName(TinyScriptParser.FunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyScriptParser#functionParameter}.
	 * @param ctx the parse tree
	 */
	void enterFunctionParameter(TinyScriptParser.FunctionParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyScriptParser#functionParameter}.
	 * @param ctx the parse tree
	 */
	void exitFunctionParameter(TinyScriptParser.FunctionParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyScriptParser#parameterType}.
	 * @param ctx the parse tree
	 */
	void enterParameterType(TinyScriptParser.ParameterTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyScriptParser#parameterType}.
	 * @param ctx the parse tree
	 */
	void exitParameterType(TinyScriptParser.ParameterTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyScriptParser#parameterName}.
	 * @param ctx the parse tree
	 */
	void enterParameterName(TinyScriptParser.ParameterNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyScriptParser#parameterName}.
	 * @param ctx the parse tree
	 */
	void exitParameterName(TinyScriptParser.ParameterNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyScriptParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(TinyScriptParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyScriptParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(TinyScriptParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(TinyScriptParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(TinyScriptParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyScriptParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(TinyScriptParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyScriptParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(TinyScriptParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyScriptParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(TinyScriptParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyScriptParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(TinyScriptParser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyScriptParser#varName}.
	 * @param ctx the parse tree
	 */
	void enterVarName(TinyScriptParser.VarNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyScriptParser#varName}.
	 * @param ctx the parse tree
	 */
	void exitVarName(TinyScriptParser.VarNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyScriptParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(TinyScriptParser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyScriptParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(TinyScriptParser.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyScriptParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(TinyScriptParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyScriptParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(TinyScriptParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyScriptParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(TinyScriptParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyScriptParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(TinyScriptParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyScriptParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(TinyScriptParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyScriptParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(TinyScriptParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyScriptParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void enterElseStatement(TinyScriptParser.ElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyScriptParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void exitElseStatement(TinyScriptParser.ElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyScriptParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(TinyScriptParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyScriptParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(TinyScriptParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyScriptParser#functionTarget}.
	 * @param ctx the parse tree
	 */
	void enterFunctionTarget(TinyScriptParser.FunctionTargetContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyScriptParser#functionTarget}.
	 * @param ctx the parse tree
	 */
	void exitFunctionTarget(TinyScriptParser.FunctionTargetContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyScriptParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(TinyScriptParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyScriptParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(TinyScriptParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyScriptParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(TinyScriptParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyScriptParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(TinyScriptParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primaryExpression}
	 * labeled alternative in {@link TinyScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(TinyScriptParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primaryExpression}
	 * labeled alternative in {@link TinyScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(TinyScriptParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mulDivExpression}
	 * labeled alternative in {@link TinyScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMulDivExpression(TinyScriptParser.MulDivExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulDivExpression}
	 * labeled alternative in {@link TinyScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMulDivExpression(TinyScriptParser.MulDivExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addSubExpression}
	 * labeled alternative in {@link TinyScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddSubExpression(TinyScriptParser.AddSubExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addSubExpression}
	 * labeled alternative in {@link TinyScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddSubExpression(TinyScriptParser.AddSubExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalExpression}
	 * labeled alternative in {@link TinyScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpression(TinyScriptParser.LogicalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalExpression}
	 * labeled alternative in {@link TinyScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpression(TinyScriptParser.LogicalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyScriptParser#addSubOp}.
	 * @param ctx the parse tree
	 */
	void enterAddSubOp(TinyScriptParser.AddSubOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyScriptParser#addSubOp}.
	 * @param ctx the parse tree
	 */
	void exitAddSubOp(TinyScriptParser.AddSubOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyScriptParser#mulDivOp}.
	 * @param ctx the parse tree
	 */
	void enterMulDivOp(TinyScriptParser.MulDivOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyScriptParser#mulDivOp}.
	 * @param ctx the parse tree
	 */
	void exitMulDivOp(TinyScriptParser.MulDivOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyScriptParser#logicalOp}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOp(TinyScriptParser.LogicalOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyScriptParser#logicalOp}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOp(TinyScriptParser.LogicalOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyScriptParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(TinyScriptParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyScriptParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(TinyScriptParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyScriptParser#parenthesizedExpression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedExpression(TinyScriptParser.ParenthesizedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyScriptParser#parenthesizedExpression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedExpression(TinyScriptParser.ParenthesizedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyScriptParser#literalExpression}.
	 * @param ctx the parse tree
	 */
	void enterLiteralExpression(TinyScriptParser.LiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyScriptParser#literalExpression}.
	 * @param ctx the parse tree
	 */
	void exitLiteralExpression(TinyScriptParser.LiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyScriptParser#varRef}.
	 * @param ctx the parse tree
	 */
	void enterVarRef(TinyScriptParser.VarRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyScriptParser#varRef}.
	 * @param ctx the parse tree
	 */
	void exitVarRef(TinyScriptParser.VarRefContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyScriptParser#nullLiteral}.
	 * @param ctx the parse tree
	 */
	void enterNullLiteral(TinyScriptParser.NullLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyScriptParser#nullLiteral}.
	 * @param ctx the parse tree
	 */
	void exitNullLiteral(TinyScriptParser.NullLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyScriptParser#intLiteral}.
	 * @param ctx the parse tree
	 */
	void enterIntLiteral(TinyScriptParser.IntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyScriptParser#intLiteral}.
	 * @param ctx the parse tree
	 */
	void exitIntLiteral(TinyScriptParser.IntLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyScriptParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(TinyScriptParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyScriptParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(TinyScriptParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyScriptParser#boolLiteral}.
	 * @param ctx the parse tree
	 */
	void enterBoolLiteral(TinyScriptParser.BoolLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyScriptParser#boolLiteral}.
	 * @param ctx the parse tree
	 */
	void exitBoolLiteral(TinyScriptParser.BoolLiteralContext ctx);
}