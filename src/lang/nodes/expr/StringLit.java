package lang.nodes.expr;

import lang.codegen.Visitor;
import lang.nodes.dotutils.DotFile;
import lang.nodes.dotutils.DotFile;
import lang.nodes.environment.Env;

public class StringLit extends Exp {

    private String value;

    public StringLit(String value) {
        super();
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public Object eval(Env e) {
        return value;
    }

    public void accept(Visitor v) {
        v.visit(this);
    }

    public int toDot(DotFile d) {
        return d.addNode("\\\'" + value + "\\\'");
    }
}