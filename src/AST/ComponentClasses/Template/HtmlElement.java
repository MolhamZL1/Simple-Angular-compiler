package AST.ComponentClasses.Template;

import AST.ASTNode;
import AST.ComponentClasses.MetadataProperty;
import AST.ComponentClasses.SelectorProperty;
import AST.Identifier;
import AST.Program;
import Code_Generation.CodeGeneration;
import Code_Generation.CodeResult;
import SymbolTable.Component.ComponentSymbol;
import SymbolTable.Component.ComponentsSymboleTable;
import org.antlr.v4.runtime.tree.ParseTree;
import visitor.BaseVisitor;

import java.io.IOException;
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
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HtmlElement{");

        // التاغ
        sb.append("tag=").append(tagname != null ? tagname.toString() : "null");

        // الخصائص
        if (attributes != null && !attributes.isEmpty()) {
            sb.append(", attributes=[");
            for (int i = 0; i < attributes.size(); i++) {
                sb.append(attributes.get(i));
                if (i < attributes.size() - 1) sb.append(", ");
            }
            sb.append("]");
        } else {
            sb.append(", attributes=(none)");
        }

        // الكونتنت
        sb.append(", content=");
        sb.append(templateContent != null ? templateContent.toString() : "null");

        sb.append("}");
        return sb.toString();
    }
 private CodeResult parseComponent(String tag){
     CodeResult codeResult=null;
             ComponentSymbol componentSymbol=   ComponentsSymboleTable.symbols.get(tag);
             String componentPath=componentSymbol.getPath();
     System.out.println(componentPath);
             try {
                 ParseTree componentTree=   CodeGeneration.parse(componentPath);
                 Program componentProgram = (Program) new BaseVisitor(new ComponentsSymboleTable(), componentPath).visit(componentTree);
                  codeResult=  componentProgram.generateCode();

             } catch (IOException e) {
                 throw new RuntimeException(e);

     }
return codeResult;
}
    @Override
    public CodeResult generateCode() {
        String tag = tagname.generateCode().html;
        if (tag.contains("app-")){
            CodeResult codeResult=parseComponent(tag);
         return codeResult;

        }
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

        return new CodeResult(html.toString()+"\n", js.toString());
    }
}
