package AST.ComponentClasses;

import Code_Generation.CodeResult;

public class SelectorProperty implements MetadataProperty{
    String selector;

    public SelectorProperty(String selector) {
        this.selector = selector;
    }

    public String getRawSelector() {
        return selector;
    }

    /** يرجع السلكتور بدون اقتباسات */
    public String getSelector() {
        return stripQuotes(selector);
    }

    @Override
    public CodeResult generateCode() {
        // ميتاداتا فقط — لا HTML/JS وقت التشغيل
        return new CodeResult("", "");
    }

    @Override
    public String toString() {
        return "selectorProperty{" + selector + '}';
    }

    // ---------- helpers ----------
    private static String stripQuotes(String s) {
        if (s == null || s.length() < 2) return s == null ? "" : s;
        char f = s.charAt(0), l = s.charAt(s.length() - 1);
        if ((f == '"' && l == '"') || (f == '\'' && l == '\'')) return s.substring(1, s.length() - 1);
        return s;
    }
}
