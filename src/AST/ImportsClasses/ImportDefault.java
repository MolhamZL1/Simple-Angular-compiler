package AST.ImportsClasses;


import AST.Identifier;
import Code_Generation.CodeResult;

public class ImportDefault implements ImportStatement {
    private Identifier name;
    private String module;



    public ImportDefault(Identifier name, String module) {
        this.name = name;
        this.module = module;
    }

    /** اسم المعرّف المستورد كـ Identifier */
    public Identifier getName() { return name; }

    /** نصّ الموديول كما جاء من البارسر (قد يحوي اقتباسات) */
    public String getRawModule() { return module; }

    /** نصّ الموديول بدون اقتباسات */
    public String getModule() { return stripQuotes(module); }

    @Override
    public CodeResult generateCode() {
        // الاستيراد معلومة تجميعية فقط — لا HTML/JS وقت التشغيل
        return new CodeResult("", "");
    }

    @Override
    public String toString() {
        String n = (name == null || name.getIdentifier() == null) ? "" : name.getIdentifier();
        String m = (module == null) ? "" : module;
        // نمط شكلي للديبَغ فقط
        return "\nimport " + n + " from " + m + ";";
    }

    // -------- helpers --------
    private static String stripQuotes(String s) {
        if (s == null || s.length() < 2) return s == null ? "" : s;
        char f = s.charAt(0), l = s.charAt(s.length() - 1);
        if ((f == '"' && l == '"') || (f == '\'' && l == '\'')) return s.substring(1, s.length() - 1);
        return s;
    }
}
