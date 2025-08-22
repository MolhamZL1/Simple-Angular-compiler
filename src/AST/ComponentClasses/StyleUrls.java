package AST.ComponentClasses;

import Code_Generation.CodeResult;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StyleUrls implements StylesProperty {
    private final List<String> urls; // جايين من الجرامر على شكل "'. /file.scss'"

    public StyleUrls(List<String> urls) {
        this.urls = (urls == null) ? Collections.emptyList() : new ArrayList<>(urls);
    }

    /** ترجع اللستة كما هي من الـ parser (غالباً مع اقتباسات) */
    public List<String> getRawUrls() {
        return Collections.unmodifiableList(urls);
    }

    /** ترجع المسارات بدون اقتباسات ومسافات */
    public List<String> getCleanUrls() {
        List<String> out = new ArrayList<>(urls.size());
        for (String u : urls) {
            out.add(stripQuotes(u == null ? "" : u.trim()));
        }
        return out;
    }

    /** أهداف ملفات CSS الناتجة (نفترض تحويل .scss → .css لاحقاً) */
    public List<String> getCssTargets() {
        List<String> clean = getCleanUrls();
        List<String> out = new ArrayList<>(clean.size());
        for (String u : clean) {
            if (u.endsWith(".scss")) out.add(u.substring(0, u.length() - 5) + ".css");
            else out.add(u);
        }
        return out;
    }

    @Override
    public CodeResult generateCode() {
        // بيانات تعريفية فقط — لا HTML ولا JS وقت التشغيل
        return new CodeResult("", "");
    }

    @Override
    public String toString() {
        return "StyleUrls{" + urls + '}';
    }

    // ------------ helpers -------------
    private static String stripQuotes(String s) {
        if (s == null || s.length() < 2) return s == null ? "" : s;
        char f = s.charAt(0), l = s.charAt(s.length() - 1);
        if ((f == '"' && l == '"') || (f == '\'' && l == '\'')) return s.substring(1, s.length() - 1);
        return s;
    }
}
