package AST.ImportsClasses;

import AST.Identifier;
import Code_Generation.CodeResult;

import java.util.List;
import java.util.stream.Collectors;

public class ImportDefaultWithNamed implements ImportStatement {
    private Identifier defaultId;
    private List<ImportItem> items;
    private String module;



    public ImportDefaultWithNamed(Identifier defaultId, List<ImportItem> items, String module) {
        this.defaultId = defaultId;
        this.items = items;
        this.module = module;
    }

    /** المعرف الافتراضي */
    public Identifier getDefaultId() { return defaultId; }

    /** العناصر المسماة */
    public List<ImportItem> getItems() { return items; }

    /** الموديول كما جاء من البارسر (قد يحوي اقتباسات) */
    public String getRawModule() { return module; }

    /** الموديول بدون اقتباسات */
    public String getModule() { return stripQuotes(module); }

    @Override
    public CodeResult generateCode() {
        // استيراد—معلومة تجميعية فقط، لا مخرجات وقت التشغيل
        return new CodeResult("", "");
    }

    @Override
    public String toString() {
        String def = (defaultId == null || defaultId.getIdentifier() == null) ? "" : defaultId.getIdentifier();
        String named = (items == null ? "" :
                items.stream().map(Object::toString).collect(Collectors.joining(", ")));
        String mod = (module == null ? "" : module);
        return "\nimport " + def + ", { " + named + " } from " + mod + ";";
    }

    // ------- helpers -------
    private static String stripQuotes(String s) {
        if (s == null || s.length() < 2) return s == null ? "" : s;
        char f = s.charAt(0), l = s.charAt(s.length() - 1);
        if ((f == '"' && l == '"') || (f == '\'' && l == '\'')) return s.substring(1, s.length() - 1);
        return s;
    }
}
