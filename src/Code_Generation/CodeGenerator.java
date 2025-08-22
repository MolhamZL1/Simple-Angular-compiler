// CodeGenerator.java
package Code_Generation;

import SymbolTable.Component.ComponentSymbol;
import SymbolTable.Component.ComponentsSymboleTable;
import utils.FileManager;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CodeGenerator {

    private final ComponentsSymboleTable table;

    public CodeGenerator(ComponentsSymboleTable table) {
        this.table = table;
    }

    // التاج الأول من نوع app- داخل index.html هو الجذر
    private static String detectRootSelector(String indexHtml){
        Matcher m = Pattern.compile("<(app-[a-z0-9\\-]+)\\b", Pattern.CASE_INSENSITIVE).matcher(indexHtml);
        return m.find() ? m.group(1) : null;
    }

    public void generate(String indexPath, String outPath) {
        String indexHtml = FileManager.readFile(indexPath);
        if (indexHtml == null) indexHtml = "<!doctype html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "  <meta charset=\"utf-8\">\n" +
                "  <title>OnlineShopping</title>\n" +
                "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" +
                "  <!-- Bootstrap & FontAwesome (محلي أو CDN) -->\n" +
                "  <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n" +
                "  <link href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.2/css/all.min.css\" rel=\"stylesheet\">\n" +
                "</head>\n" +
                "<body>\n" +
                "  <div id=\"app\"></div>\n" +
                "\n" +
                "  <script src=\"app.js\"></script>\n" +
                "  <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js\"></script>\n" +
                "</body>\n" +
                "</html>\n";

        String rootSel = detectRootSelector(indexHtml);
        if (rootSel == null) {
            // fallback: لو ما لقيت جذر
            FileManager.writeFile(outPath, indexHtml);
            return;
        }

        ComponentSymbol root = table.getSymbols().get(rootSel);
        if (root == null) {
            // ما في تعريف للمكوّن الجذر
            FileManager.writeFile(outPath, indexHtml);
            return;
        }

        String rootTpl = FileManager.readFile(root.getTemplatePath());
        if (rootTpl == null) rootTpl = "";

        TemplateExpander expander = new TemplateExpander(table);
        TemplateExpander.ExpandResult result = expander.expand(rootTpl);

        // ضمّن CSS inline (Debug). ممكن تبدّلها لروابط خارجية بمود Production.
        StringBuilder styles = new StringBuilder();
        for (String cssPath : result.cssPaths) {
            String css = FileManager.readFile(cssPath);
            if (css != null) {
                styles.append("<style>").append(css).append("</style>\n");
            }
        }

        // بدّل <app-root> في index.html بالمحتوى الموسّع
        String finalPage = indexHtml.replaceFirst(
                "(?is)<" + Pattern.quote(rootSel) + "\\b[^>]*>(.*?)</" + Pattern.quote(rootSel) + "\\s*>",
                Matcher.quoteReplacement(result.html)
        ).replaceFirst("</head>", styles + "</head>");

        FileManager.createFile(outPath); // يتجاهل إذا موجود
        FileManager.writeFile(outPath, finalPage);
    }
}
