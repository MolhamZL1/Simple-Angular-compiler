package AST;

import AST.ExpressionsClasses.Expression;
import Code_Generation.CodeResult;

import java.util.List;

public class Args implements ASTNode{
    List<Expression> expressions;

    public Args(List<Expression> expressions) {
        this.expressions = expressions;
    }

    @Override
    public String toString() {
        return "\nArgs{" +
                 expressions +
                '}';
    }


    @Override
    public CodeResult generateCode() {
        CodeResult result = new CodeResult("", "");
        StringBuilder argsExpr = new StringBuilder();
        StringBuilder side     = new StringBuilder();

        if (expressions != null) {
            for (int idx = 0; idx < expressions.size(); idx++) {
                Expression expr = expressions.get(idx);
                if (expr == null) continue;
                CodeResult cr = expr.generateCode();
                if (argsExpr.length() > 0) argsExpr.append(", ");
                argsExpr.append(cr.html == null ? "" : cr.html);
                if (cr.js != null) side.append(cr.js);
            }
        }
        result.html = argsExpr.toString();
        result.js   = side.toString();
        return result;
    }

}
