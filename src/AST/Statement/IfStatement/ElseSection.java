package AST.Statement.IfStatement;

import AST.ASTNode;
import AST.Statement.Statement;
import Code_Generation.CodeResult;

public class ElseSection implements ASTNode {
    private Statement body;

    public ElseSection(Statement body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "\nelseSection{" +
                "body=" + body +
                '}';
    }

    @Override
    public CodeResult generateCode() {
        CodeResult b = body!=null ? body.generateCode() : new CodeResult("","");
        String js = "else {\n" + safe(b.js) + "}\n";
        return new CodeResult("", js);
    }
    private static String safe(String s){ return s==null? "": s; }
}
