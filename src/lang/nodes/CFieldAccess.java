package lang.nodes;

import lang.nodes.expr.Exp;
import lang.nodes.environment.*;
import lang.codegen.Visitor;
import lang.nodes.dotutils.DotFile;

public class CFieldAccess extends Exp {
    private Exp object;
    private String fieldName;

    public CFieldAccess(Exp object, String fieldName) {
        this.object = object;
        this.fieldName = fieldName;
    }

    public Exp getObject() {
        return object;
    }

    public String getFieldName() {
        return fieldName;
    }

    @Override
    public String toString() {
        return object.toString() + "." + fieldName;
    }
    public void accept (Visitor v) {v.visit(this);}

    public Object eval(Env e) {
        return 0;
    };

    public int toDot(DotFile d) {
        return 0;
    };
}
