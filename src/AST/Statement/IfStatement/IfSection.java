package AST.Statement.IfStatement;

import AST.ASTNode;
import AST.ExpressionsClasses.Expression;
import AST.Statement.Statement;
import Code_Generation.CodeResult;

public class IfSection implements ASTNode {
private Expression condition;
private Statement body;

    public IfSection(Expression condition, Statement body) {
        this.condition = condition;
        this.body = body;
    }

    @Override
    public String toString() {
        return "\nIfSection{" +
                "condition=" + condition +
                ", body=" + body +
                '}';
    }

    @Override
    public CodeResult generateCode() {
        CodeResult c = condition!=null ? condition.generateCode() : new CodeResult("false","");
        CodeResult b = body!=null ? body.generateCode() : new CodeResult("","");
        String js = "if ("+c.html+") {\n" + safe(b.js) + "}\n";
        return new CodeResult("", safe(c.js)+js);
    }
    private static String safe(String s){ return s==null? "": s; }
}
