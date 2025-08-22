package AST.ImportsClasses;

import AST.Identifier;
import Code_Generation.CodeResult;

public class ImportDefaultWithNamespace implements ImportStatement {
    private Identifier defaultId;
    private Identifier alias;
    private String module;


    public ImportDefaultWithNamespace(Identifier defaultId, Identifier alias, String module) {
        this.defaultId = defaultId;
        this.alias = alias;
        this.module = module;
    }

    /** المعرّف الافتراضي */
    public Identifier getDefaultId() { return defaultId; }

    /** اسم الـ namespace alias */
    public Identifier getAlias() { return alias; }

    /** نصّ الموديول كما جاء من البارسر (قد يحوي اقتباسات) */
    public String getRawModule() { return module; }

    /** نصّ الموديول بدون اقتباسات */
    public String getModule() { return stripQuotes(module); }

    @Override
    public CodeResult generateCode() {
        // الاستيراد ميتاداتا فقط — لا HTML/JS وقت التشغيل
        return new CodeResult("", "");
    }

    @Override
    public String toString() {
        String def = (defaultId == null || defaultId.getIdentifier() == null) ? "" : defaultId.getIdentifier();
        String al  = (alias == null || alias.getIdentifier() == null) ? "" : alias.getIdentifier();
        String mod = (module == null) ? "" : module;
        return "\nimport " + def + ", * as " + al + " from " + mod + ";";
    }

    // -------- helpers --------
    private static String stripQuotes(String s) {
        if (s == null || s.length() < 2) return s == null ? "" : s;
        char f = s.charAt(0), l = s.charAt(s.length() - 1);
        if ((f == '"' && l == '"') || (f == '\'' && l == '\'')) return s.substring(1, s.length() - 1);
        return s;
    }
}
