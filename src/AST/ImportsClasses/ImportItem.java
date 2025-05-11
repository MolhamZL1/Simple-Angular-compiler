package AST.ImportsClasses;

import AST.ASTNode;
import AST.Identifier;

public class ImportItem implements ASTNode {
    private Identifier original;
    private Identifier alias;

    public ImportItem(Identifier original, Identifier alias) {
        this.original = original;
        this.alias = alias;
    }

    @Override
    public String toString() {
        if (alias != null){
            return   original + " as " + alias;
        }
        else{
            return original.toString();
        }
    }
}
