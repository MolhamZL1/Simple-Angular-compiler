package AST.ClassDeclaration.AngularSpecificMember;

import AST.Identifier;
import AST.Primary.ObjectInit;
import AST.Type;
import Code_Generation.CodeResult;

public class OutputDeclaration implements AngularSpecificMember{
    private String alias;
    private Identifier identifier;
    private Type type;

    private ObjectInit eventEmitter;

    public OutputDeclaration(String alias, Identifier identifier, Type type, ObjectInit eventEmitter) {
        this.alias = alias;
        this.identifier = identifier;
        this.type = type;
        this.eventEmitter = eventEmitter;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("\nOutputDeclaration{");
        sb.append("alias='").append(alias != null ? alias : "").append('\'');
        sb.append(", identifier=").append(identifier);

        if (type != null) {
            sb.append(", type=").append(type);
        }

        sb.append(", eventEmitter=").append(eventEmitter);
        sb.append('}');
        return sb.toString();
    }
    @Override
    public CodeResult generateCode() {
        // اسم الخاصية (var name)
        String varName = (identifier == null || identifier.getIdentifier() == null || identifier.getIdentifier().isBlank())
                ? "_output"
                : identifier.getIdentifier();

        // اسم الحدث اللي رح نطلقه (alias بدون اقتباسات، وإلا اسم الخاصية)
        String evtName = (alias != null && !alias.isBlank())
                ? stripQuotes(alias.trim())
                : varName;

        StringBuilder js = new StringBuilder();

        // أي JS جانبي ناتج عن الـ ObjectInit (ما نعتمد عليه فعليًا)
        if (eventEmitter != null) {
            CodeResult r = eventEmitter.generateCode();
            if (r.js != null) js.append(r.js);
            // ما منستخدم r.html هون لأننا ما منبني EventEmitter حقيقي.
        }

        // بولي‌فيل Emitter بسيط عالمي
        js.append("var ").append(varName).append(" = {\n")
                .append("  __target: null,\n")
                .append("  bind: function(el){ this.__target = el; },\n")
                .append("  emit: function(value){\n")
                .append("    try {\n")
                .append("      var tgt = this.__target || document;\n")
                .append("      tgt.dispatchEvent(new CustomEvent('").append(evtName).append("', { detail: value }));\n")
                .append("    } catch(e) { console.error(e); }\n")
                .append("  }\n")
                .append("};\n");

        // ملاحظة: type/alias ميتاداتا فقط وقت التوليد
        // js.append(\"/* @Output ").append(varName).append(\" as '").append(evtName).append("' */\\n\");

        return new CodeResult("", js.toString());
    }

    private static String stripQuotes(String s){
        if (s == null || s.length() < 2) return s == null ? "" : s;
        char f = s.charAt(0), l = s.charAt(s.length()-1);
        if ((f=='\"' && l=='\"') || (f=='\'' && l=='\'')) return s.substring(1, s.length()-1);
        return s;
    }
}
