package AST.ExpressionsClasses;

public class SafeNavExpr implements Expression{
    private Expression baseObject;
    private String id;

    public SafeNavExpr(Expression baseObject, String id) {
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
