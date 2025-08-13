package AST.ExpressionsClasses;

import AST.Identifier;
import Code_Generation.CodeResult;

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

    @Override
    public CodeResult generateCode() {
        return new CodeResult("","");
    }
}
