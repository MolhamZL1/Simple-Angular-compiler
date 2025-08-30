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
        CodeResult m = member != null ? member.generateCode() : new CodeResult("undefined", "");
        CodeResult i = index  != null ? index.generateCode()  : new CodeResult("0", "");

        String mm = (m.html != null && !m.html.isBlank()) ? m.html : (m.js == null ? "" : m.js);
        String ii = (i.html != null && !i.html.isBlank()) ? i.html : (i.js == null ? "" : i.js);
        if (ii == null || ii.isBlank()) ii = "0";

        String expr = mm + "[" + ii + "]";
        String side = (m.js == null ? "" : m.js) + (i.js == null ? "" : i.js);
        return new CodeResult(expr, side);
    }

    private static String pick(CodeResult cr){
        if (cr == null) return "undefined";
        String s = (cr.js != null && !cr.js.isEmpty()) ? cr.js : cr.html;
        return (s == null || s.isEmpty()) ? "undefined" : s;
    }



}
