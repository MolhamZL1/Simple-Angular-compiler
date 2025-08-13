package AST.ExpressionsClasses;

import Code_Generation.CodeResult;

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

    // MemberIndexExpr.java
    @Override
    public CodeResult generateCode() {
        CodeResult m = (member != null) ? member.generateCode() : null;
        CodeResult i = (index  != null) ? index.generateCode()  : null;

        String mm = pick(m);
        String ii = pick(i);
        if (ii.equals("undefined")) ii = "0"; // fallback

        String js = mm + "[" + ii + "]";
        return new CodeResult(js, js);
    }
    private static String pick(CodeResult cr){
        if (cr == null) return "undefined";
        String s = (cr.js != null && !cr.js.isEmpty()) ? cr.js : cr.html;
        return (s == null || s.isEmpty()) ? "undefined" : s;
    }



}
