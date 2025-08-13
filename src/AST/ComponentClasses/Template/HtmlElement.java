package AST.ComponentClasses.Template;

import AST.ASTNode;
import AST.Identifier;
import Code_Generation.CodeResult;

import java.util.*;
import java.util.regex.Pattern;

public class HtmlElement implements ASTNode {
    private Identifier tagname;
    private List<Attribute> attributes;
    private TemplateContent templateContent;

    // 1) لائحة التاغات الـ void
    private static final Set<String> VOID_TAGS = Set.of(
            "area","base","br","col","embed","hr","img","input","link","meta","param","source","track","wbr"
    );

    // (اختياري) فلتر بسيط لمنع قيم خصائص فيها وسوم (علامة توليد خاطئ)
    private static final Pattern BAD_ATTR_VALUE = Pattern.compile(".*[<>].*");

    public HtmlElement(Identifier tagname, List<Attribute> attributes, TemplateContent templateContent) {
        this.tagname = tagname;
        this.attributes = attributes;
        this.templateContent = templateContent;
    }

    @Override
    public CodeResult generateCode() {
        String tag = tagname.generateCode().html;
        boolean isVoid = VOID_TAGS.contains(tag.toLowerCase());

        StringBuilder html = new StringBuilder();
        StringBuilder js   = new StringBuilder();

        html.append("<").append(tag);

        // 2) اطبع الخصائص + اجمع الـ JS من كل Attribute
        boolean hasId = false, hasClass = false;
        if (attributes != null) {
            for (Attribute attr : attributes) {
                if (attr == null) continue;
                CodeResult a = attr.generateCode();
                String ah = (a.html == null ? "" : a.html).trim();

                // امنع تكرار id/class (بسيط)
                if (ah.startsWith("id=")) {
                    if (hasId) continue;
                    hasId = true;
                } else if (ah.startsWith("class=")) {
                    if (hasClass) continue;
                    hasClass = true;
                }

                // امنع قيم خصائص فيها '<' أو '>' (غالباً غلط)
                if (BAD_ATTR_VALUE.matcher(ah).matches()) continue;

                if (!ah.isEmpty()) html.append(" ").append(ah);
                if (a.js != null && !a.js.isEmpty()) js.append(a.js);
            }
        }

        // 3) إغلاق صحيح حسب نوع التاغ
        if (isVoid) {
            // عناصر void: بدون self-closing وبدون closing tag
            html.append(">");
        } else {
            html.append(">");
            if (templateContent != null) {
                CodeResult content = templateContent.generateCode();
                html.append(content.html);
                js.append(content.js);
            }
            html.append("</").append(tag).append(">");
        }

        return new CodeResult(html.toString(), js.toString());
    }
}
