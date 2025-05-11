package AST.ExpressionsClasses;

import AST.Identifier;

public class SafeNavExpr implements Expression{
    private Expression baseObject;
    private Identifier id;

    public SafeNavExpr(Expression baseObject, Identifier id) {
        this.baseObject = baseObject;
        this.id = id;
    }

    @Override
    public String toString() {
        return "\nSafeNavExpr{" +
                "baseObject=" + baseObject +
                ", id='" + id + '\'' +
                '}';
    }
}
