package AST.ExpressionsClasses;

import AST.Args;
import Code_Generation.CodeResult;

public class CallExpr implements Expression{
private Expression expression;
private Args args;

    public CallExpr(Expression expression, Args args) {
        this.expression = expression;
        this.args = args;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("\nCallExpr{");
        sb.append("\nexpression=").append(expression);
        if (args != null) {
            sb.append(", \nargs=").append(args);
        }
        sb.append("\n}");
        return sb.toString();
    }

    @Override
    public CodeResult generateCode() {
        CodeResult f = expression.generateCode();
        CodeResult a = args != null ? args.generateCode() : new CodeResult("", "");
        String fn = f.js.isEmpty()?f.html:f.js;
        String js = fn + "(" + a.js + ")";
        return new CodeResult(js, js);
    }

}
