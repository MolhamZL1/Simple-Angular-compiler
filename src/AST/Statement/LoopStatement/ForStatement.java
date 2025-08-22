package AST.Statement.LoopStatement;

import AST.ASTNode;
import AST.ExpressionsClasses.Expression;
import AST.Statement.Statement;
import Code_Generation.CodeResult;

public class ForStatement implements LoopStatement{
    private ASTNode initialization;
    private Expression update;
    private Expression condition;
    private Statement body;

    public ForStatement(ASTNode initialization, Expression update, Expression condition, Statement body) {
        this.initialization = initialization;
        this.update = update;
        this.condition = condition;
        this.body = body;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("\nForStatement{")
                .append("initialization=").append(initialization);

        if (update != null) {
            sb.append(", update=").append(update);
        }

        if (condition != null) {
            sb.append(", condition=").append(condition);
        }

        sb.append(", body=").append(body)
                .append('}');

        return sb.toString();
    }


    @Override
    public CodeResult generateCode() {
        CodeResult init = initialization!=null ? initialization.generateCode() : new CodeResult("", "");
        CodeResult cond = condition!=null ? condition.generateCode() : new CodeResult("", "");
        CodeResult upd  = update!=null ? update.generateCode() : new CodeResult("", "");
        CodeResult b    = body!=null ? body.generateCode() : new CodeResult("", "");

        // إن كان init رجّع سطر let ...; خليه قبل اللوب
        String initStmt = init.js==null? "" : init.js;
        String head = "for (" +
                (init.html!=null && !init.html.isBlank() ? init.html : "") +
                (init.html!=null && !init.html.isBlank() ? ";" : "") +
                (cond.html==null? "" : cond.html) + ";" +
                (upd.html==null? "" : upd.html) +
                ") {\n" + safe(b.js) + "}\n";

        return new CodeResult("", safe(initStmt) + safe(cond.js) + safe(upd.js) + head);
    }
    private static String safe(String s){ return s==null? "": s; }
}
