// TemplateExpander.java
package Code_Generation;

import SymbolTable.Component.ComponentSymbol;
import SymbolTable.Component.ComponentsSymboleTable;
import utils.FileManager;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TemplateExpander {

    private final ComponentsSymboleTable table;
    private final Set<String> visitedSelectors = new LinkedHashSet<>();
    private final List<String> collectedCss = new ArrayList<>();

    // <app-xyz ...>...</app-xyz>  أو self-closing <app-xyz />
    private static final Pattern CUSTOM_TAG = Pattern.compile(
            "<(app-[a-z0-9\\-]+)([^>]*)>(.*?)</\\1\\s*>|<(app-[a-z0-9\\-]+)([^>]*)\\s*/>",
            Pattern.CASE_INSENSITIVE | Pattern.DOTALL
    );

    public TemplateExpander(ComponentsSymboleTable table) {
        this.table = table;
    }

    public static class ExpandResult {
        public final String html;
        public final List<String> cssPaths;
        public ExpandResult(String html, List<String> cssPaths) {
            this.html = html;
            this.cssPaths = cssPaths;
        }
    }

    public ExpandResult expand(String html) {
        String out = html;
        boolean changed = true;
        while (changed) {
            changed = false;
            Matcher m = CUSTOM_TAG.matcher(out);
            StringBuffer sb = new StringBuffer();
            while (m.find()) {
                String selector = m.group(1) != null ? m.group(1) : m.group(4);
                if (selector == null) { m.appendReplacement(sb, m.group()); continue; }

                ComponentSymbol sym = table.getSymbols().get(selector);
                if (sym == null) { // ما عندك تعريف → اتركه كما هو
                    m.appendReplacement(sb, Matcher.quoteReplacement(m.group()));
                    continue;
                }

                // حمّل HTML الخاص بالمكوّن
                String tplPath = sym.getTemplatePath();  // صار مطلق من الخطوة (1)
                String compHtml = FileManager.readFile(tplPath);
                if (compHtml == null) compHtml = "";

                // اجمع CSS لو موجود
                String cssPath = sym.getStylePath();
                if (cssPath != null && !cssPath.isBlank()) {
                    // دعم SCSS: جرّب CSS بنفس الاسم
                    if (cssPath.endsWith(".scss")) {
                        String cssFallback = cssPath.substring(0, cssPath.length()-5) + ".css";
                        if (FileManager.fileExists(cssFallback)) cssPath = cssFallback;
                        else cssPath = null; // ما مندرج SCSS الخام
                    }
                    if (cssPath != null && FileManager.fileExists(cssPath) && !collectedCss.contains(cssPath)) {
                        collectedCss.add(cssPath);
                    }
                }

                visitedSelectors.add(selector);

                // توسعة recursive
                ExpandResult child = expand(compHtml);
                String replacement = child.html;

                m.appendReplacement(sb, Matcher.quoteReplacement(replacement));
                changed = true;
            }
            m.appendTail(sb);
            out = sb.toString();
        }
        return new ExpandResult(out, new ArrayList<>(collectedCss));
    }
}
