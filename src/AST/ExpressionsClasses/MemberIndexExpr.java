package AST.ExpressionsClasses;

public class MemberIndexExpr implements Expression{
    private Expression member;
    private Expression index;

    public MemberIndexExpr(Expression member, Expression index) {
        this.member = member;
        this.index = index;
    }

    @Override
    public String toString() {
        return "\nMemberIndexExpr{" +
                "\nmember=" + member +
                "\n, index=" + index +
                "\n}";
    }
}
