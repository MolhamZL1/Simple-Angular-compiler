package AST.ComponentClasses.Template;

import AST.ASTNode;
import AST.ExpressionsClasses.Expression;
import Code_Generation.CodeResult;

import java.util.List;

public class Interpolation implements ASTNode {
    private Expression expression;

    public Interpolation(Expression expressions) {
        this.expression= expressions;
    }

    public Expression getExpression() {
        return expression;
    }


    @Override
    public String toString() {
        return "Interpolation{" +
                "expression=" + expression +
                '}';
    }
    // + داخل Interpolation.java
    public String asJsExpression() {
        CodeResult code = (expression != null) ? expression.generateCode() : null;
        if (code == null) return "undefined";
        String js = (code.js != null && !code.js.isEmpty()) ? code.js : code.html;
        return (js == null || js.isEmpty()) ? "undefined" : js;
    }

    @Override
    public CodeResult generateCode() {
        String id = "span_" + System.nanoTime();
        String html = "<span id=\"" + id + "\"></span>";
        String js   = "document.getElementById('" + id + "').textContent = String(" + asJsExpression() + ");\n";
        return new CodeResult(html, js);
    }



}
