package tinyscript;

import org.antlr.v4.runtime.ParserRuleContext;
import tinyscript.exceptions.TinyScriptException;
import tinyscript.exceptions.TinyScriptExceptionHandler;
import tinyscript.generated.TinyScriptBaseVisitor;
import tinyscript.generated.TinyScriptParser;
import tinyscript.symboltable.FunctionSymbol;
import tinyscript.symboltable.Scope;
import tinyscript.symboltable.VariableSymbol;
import tinyscript.typesystem.TypeSystem;
import tinyscript.typesystem.TypeSystemHelper;

public class TinyScriptSemanticAnalyzer extends TinyScriptBaseVisitor<Object> {
    private Scope scope;
    private TypeSystem ts;
    private final TinyScriptExceptionHandler exceptionHandler;
    private FunctionSymbol currentFunction = null;

    public TinyScriptSemanticAnalyzer(TinyScriptExceptionHandler exceptionHandler) {
        this.exceptionHandler = exceptionHandler;

        scope = new Scope(null);
        ts = new TypeSystem();
    }

    @Override
    public Object visitProgram(TinyScriptParser.ProgramContext ctx) {
        // Visit functions first so that the symbol table is properly built
        // Usually, we  use another visitor whose  purpose is building the symbol table
        // However, we chose to do the simple solution here
        for (var funDef: ctx.functionDefinition()) {
            visitFunctionDefinition(funDef);
        }
        return visitMain(ctx.main());
    }

    @Override
    public Object visitFunctionDefinition(TinyScriptParser.FunctionDefinitionContext ctx) {
        var name = ctx.functionName().getText();
        var returnType = ts.getType(ctx.returnType().getText());
        currentFunction = new FunctionSymbol(name, returnType);
        addFunctionToScope(ctx, currentFunction);

        scope = new Scope(scope);
        System.out.println("Function entry");

        var result = super.visitFunctionDefinition(ctx);

        System.out.println("Function exit");
        System.out.println(scope.toString());
        scope = scope.getPrevious();

        currentFunction = null;

        return result;
    }

    @Override
    public Object visitFunctionParameter(TinyScriptParser.FunctionParameterContext ctx) {
        var paramSymbol = createSymbolFromFunctionParameter(ctx);

        if (currentFunction != null)
            currentFunction.addParameter(paramSymbol.name, paramSymbol);
        scope.addVariable(paramSymbol.name, paramSymbol);

        return super.visitFunctionParameter(ctx);
    }

    @Override
    public Object visitReturnStatement(TinyScriptParser.ReturnStatementContext ctx) {
        if (currentFunction == null) {
            addException(ctx, "return statements can only be present inside a function");
        }
        else {
            var type = TypeSystemHelper.getType(ctx.expression(), ts, scope);
            if (!type.isCompatibleWith(currentFunction.returnType))
                addException(ctx, "return statement type " + type.name + " is not compatible with function return type " + currentFunction.returnType.name);
        }

        return super.visitReturnStatement(ctx);
    }

    @Override
    public Object visitCondition(TinyScriptParser.ConditionContext ctx) {
        var type = TypeSystemHelper.getType(ctx.expression(), ts, scope);
        if (!type.isCompatibleWith(ts.BOOLEAN))
            addException(ctx, "condition must be of type " + ts.BOOLEAN.name);

        return super.visitCondition(ctx);
    }

    @Override
    public Object visitFunctionCall(TinyScriptParser.FunctionCallContext ctx) {
        var function = getFunctionFromScope(ctx, ctx.functionTarget().getText());
        if (function != null) {
            int paramCount = 0;
            if (ctx.parameterList() != null) paramCount = ctx.parameterList().expression().size();

            if (function.parameters.size() != paramCount)
                addException(ctx, "invalid number of passed parameters to function '" + function.name + "'");

            else if (paramCount > 0) {
                for (int i = 0; i < ctx.parameterList().expression().size(); i++) {
                    var expr = ctx.parameterList().expression(i);
                    var exprType = TypeSystemHelper.getType(expr, ts, scope);
                    var paramType = function.parameters.values().stream().toList().get(i).type; // TODO: ugly
                    if (!exprType.isCompatibleWith(paramType))
                        addException(expr, "type '" + exprType.name + "' of passed parameter is not compatible with expected type '" + paramType.name + "' ");
                }
            }
        }

        return super.visitFunctionCall(ctx);
    }

    @Override
    public Object visitAssignmentStatement(TinyScriptParser.AssignmentStatementContext ctx) {
        var expressionType = TypeSystemHelper.getType(ctx.expression(), ts, scope);
        var varName = ctx.varName().getText();
        var symbol = getVariableFromScope(ctx.varName(), varName);
        if (symbol != null) {
            var varType = symbol.type;
            if (!expressionType.isCompatibleWith(varType))
                addException(ctx, "an expression of type '" + expressionType.name + "' is not assignable" + " to variable '" + varName + "' of type " + varType.name);
        }

        return super.visitAssignmentStatement(ctx);
    }

    @Override
    public Object visitVariableDeclaration(TinyScriptParser.VariableDeclarationContext ctx) {
        var varName = ctx.varName().getText();
        // var
        if (ctx.VAR() != null) {
            if (ctx.expression() == null)
                addException(ctx, "variables declared using 'var' must have an initial value");
            else {
                var type = TypeSystemHelper.getType(ctx.expression(), ts, scope);
                var symbol = new VariableSymbol(type, varName);
                addVariableToScope(ctx.varName(), symbol);
            }
        }
        // not var
        else {
            var type = ts.getType(ctx.typeName().getText());

            if (ctx.expression() == null) {
                var symbol = new VariableSymbol(type, varName);
                addVariableToScope(ctx.varName(), symbol);
            }
            else {
                var expressionType = TypeSystemHelper.getType(ctx.expression(), ts, scope);
                if (!expressionType.isCompatibleWith(type))
                    addException(ctx, "an expression of type '" + expressionType.name + "' is not assignable" + " to variable '" + varName + "' of type " + type.name);
                else {
                    var symbol = new VariableSymbol(type, ctx.varName().getText());
                    addVariableToScope(ctx.varName(), symbol);
                }
            }
        }
        System.out.println("Var declaration visited");
        System.out.println(scope.toString());
        return super.visitVariableDeclaration(ctx);
    }

    // Let us assume that only integers can be used in a mul / div / add / sub expression
    @Override
    public Object visitMulDivExpression(TinyScriptParser.MulDivExpressionContext ctx) {
        var type1 = TypeSystemHelper.getType(ctx.expression(0), ts, scope);
        var type2 = TypeSystemHelper.getType(ctx.expression(1), ts, scope);
        if (!type1.isCompatibleWith(ts.INT) || !type2.isCompatibleWith(ts.INT))
            addException(ctx, "the left and right hand side of the expression must be compatible with type " + ts.INT.name);

        return super.visitMulDivExpression(ctx);
    }

    @Override
    public Object visitAddSubExpression(TinyScriptParser.AddSubExpressionContext ctx) {
        var type1 = TypeSystemHelper.getType(ctx.expression(0), ts, scope);
        var type2 = TypeSystemHelper.getType(ctx.expression(1), ts, scope);
        if (!type1.isCompatibleWith(ts.INT) || !type2.isCompatibleWith(ts.INT))
            addException(ctx, "the left and right hand side of the expression must be compatible with type " + ts.INT.name);

        return super.visitAddSubExpression(ctx);
    }

    // Let us assume that logical operators can be used between any types that are compatible (even string or boolean literals)
    @Override
    public Object visitLogicalExpression(TinyScriptParser.LogicalExpressionContext ctx) {
        var type1 = TypeSystemHelper.getType(ctx.expression(0), ts, scope);
        var type2 = TypeSystemHelper.getType(ctx.expression(1), ts, scope);
        if (!type1.isCompatibleWith(type2))
            addException(ctx, "the left and right hand side of the expression are not compatible with each other");

        return super.visitLogicalExpression(ctx);
    }

    // Helper functions
    private void addVariableToScope(ParserRuleContext ctx, VariableSymbol symbol) {
        if (!scope.addVariable(symbol.name, symbol))
            addException(ctx, "variable ' " + symbol.name + "' is already in scope");
    }

    private void addFunctionToScope(ParserRuleContext ctx, FunctionSymbol symbol) {
        if (!scope.addFunction(symbol.name, symbol))
            addException(ctx, "function ' " + symbol.name + "' is already in scope");
    }

    private VariableSymbol getVariableFromScope(ParserRuleContext ctx, String varName) {
        var symbol = scope.getVariable(varName);
        if (symbol != null)  return symbol;

        addException(ctx, "variable ' " + varName + "' does not exist in scope");
        return null;
    }

    private FunctionSymbol getFunctionFromScope(ParserRuleContext ctx, String functionName) {
        var symbol = scope.getFunction(functionName);
        if (symbol != null) return symbol;

        addException(ctx, "function ' " + functionName + "' does not exist in scope");
        return null;
    }

    private VariableSymbol createSymbolFromFunctionParameter(TinyScriptParser.FunctionParameterContext ctx) {
        var type = ts.getType(ctx.parameterType().getText());

        return new VariableSymbol(type, ctx.parameterName().getText());
    }

    private void addException(ParserRuleContext ctx, String message) {
        TinyScriptException exception = new TinyScriptException(ctx.start.getLine(), ctx.start.getCharPositionInLine(), message);
        exceptionHandler.addException(exception);
    }
}
