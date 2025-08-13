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
        CodeResult result = new CodeResult("","");
        StringBuilder jsCode = new StringBuilder();

        if (expressions != null) {
            for (Expression expr : expressions) {
                if (expr != null) {
                    CodeResult exprCode = expr.generateCode();
                    if (exprCode != null && exprCode.js != null) {
                        if (jsCode.length() > 0) jsCode.append(", ");
                        jsCode.append(exprCode.js);
                    }
                }
            }
        }

        result.js = jsCode.toString();
        return result;
    }
}
