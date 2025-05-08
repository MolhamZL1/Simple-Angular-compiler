package AST.ExpressionsClasses;

public class SafeIndexExpr implements Expression{
    private Expression baseObject;
    private Expression indexObject;

    public SafeIndexExpr(Expression baseObject, Expression indexObject) {
        this.baseObject = baseObject;
        this.indexObject = indexObject;
    }

    @Override
    public String toString() {
        return "\nSafeIndexExpr{" +
                "baseObject=" + baseObject +
                ", indexObject=" + indexObject +
                '}';
    }
}
