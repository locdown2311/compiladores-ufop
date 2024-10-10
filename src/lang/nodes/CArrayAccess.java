package lang.nodes;

import lang.nodes.expr.Exp;
import lang.nodes.environment.*;
import lang.codegen.Visitor;
import lang.nodes.dotutils.DotFile;

public class CArrayAccess extends Exp {
    private Exp array;
    private Exp index;

    public CArrayAccess(Exp array, Exp index) {
        this.array = array;
        this.index = index;
    }

    public Exp getArray() {
        return array;
    }

    public Exp getIndex() {
        return index;
    }

    @Override
    public String toString() {
        return array.toString() + "[" + index.toString() + "]";
    }

    @Override
    public Object eval(Env e) {
        return 0;
    };

    public void accept(Visitor v) {
        v.visit(this);
    }

    public int toDot(DotFile d) {
        return 0;
    };
}
