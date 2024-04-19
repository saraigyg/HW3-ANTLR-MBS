package tinyscript.typesystem;

import tinyscript.generated.TinyScriptParser;
import tinyscript.symboltable.Scope;

public class TypeSystemHelper {
    public static TSType getType(TinyScriptParser.ExpressionContext ctx, TypeSystem ts, Scope scope) {
        if (ctx instanceof TinyScriptParser.MulDivExpressionContext || ctx instanceof TinyScriptParser.AddSubExpressionContext)
            return ts.INT;

        if (ctx instanceof TinyScriptParser.LogicalExpressionContext)
            return ts.BOOLEAN;

        if (ctx instanceof TinyScriptParser.PrimaryExpressionContext) {
            return getType(((TinyScriptParser.PrimaryExpressionContext) ctx).primary(), ts, scope);
        }

        // If we reach this point, something is wrong; returning error type prevents escalation but also hides the problem
        return ts.ERROR;
    }

    public static TSType getType(TinyScriptParser.PrimaryContext ctx, TypeSystem ts, Scope scope) {
        if (ctx.parenthesizedExpression() != null) return getType(ctx.parenthesizedExpression().expression(), ts, scope);

        if (ctx.functionCall() != null) return getType(ctx.functionCall(), ts, scope);

        if (ctx.literalExpression() != null) return getType(ctx.literalExpression(), ts, scope);

        return ts.ERROR;
    }

    public static TSType getType(TinyScriptParser.FunctionCallContext ctx, TypeSystem ts, Scope scope) {
        var symbol = scope.getFunction(ctx.functionTarget().getText());
        if (symbol == null) return ts.ERROR;

        return symbol.returnType;
    }

    public static TSType getType(TinyScriptParser.LiteralExpressionContext ctx, TypeSystem ts, Scope scope) {
        if (ctx.varRef() != null) {
            var symbol = scope.getVariable(ctx.varRef().getText());
            if (symbol != null) return symbol.type;
            else return ts.ERROR;
        }

        if (ctx.intLiteral() != null) return ts.INT;
        if (ctx.boolLiteral() != null) return ts.BOOLEAN;
        if (ctx.stringLiteral() != null) return ts.STRING;
        if (ctx.nullLiteral() != null) return ts.NULL;

        return ts.ERROR;
    }
}
