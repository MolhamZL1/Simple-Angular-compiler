package AST.Statement.LoopStatement;

import AST.ExpressionsClasses.Expression;
import AST.Identifier;
import AST.Statement.Statement;
import AST.Statement.VariableDeclarationKeyword;
import Code_Generation.CodeResult;

public class ForOfStatement implements LoopStatement{
    private VariableDeclarationKeyword variableDeclarationKeyword;
    private Identifier item;
    private Expression items;
    private Statement body;

    public ForOfStatement(VariableDeclarationKeyword variableDeclarationKeyword,Identifier item, Expression items, Statement body) {
        this.item = item;
        this.items = items;
        this.body = body;
        this.variableDeclarationKeyword=variableDeclarationKeyword;
    }

    @Override
    public String toString() {
        return "\nForOfStatement{" +
                "variableDeclarationKeyword=" + variableDeclarationKeyword +
                "item=" + item +
                ", items=" + items +
                ", body=" + body +
                '}';
    }

    @Override
    public CodeResult generateCode() {
        String kw = variableDeclarationKeyword==null? "let" : variableDeclarationKeyword.getKeyword();
        String id = item==null? "_" : item.getIdentifier();
        CodeResult it = items!=null ? items.generateCode() : new CodeResult("[]", "");
        CodeResult b  = body!=null ? body.generateCode() : new CodeResult("","");

        String js = "for ("+kw+" "+id+" of "+it.html+") {\n"+safe(b.js)+"}\n";
        return new CodeResult("", safe(it.js)+js);
    }
    private static String safe(String s){ return s==null? "": s; }
}
