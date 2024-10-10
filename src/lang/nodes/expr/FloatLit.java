package lang.nodes.expr;

import lang.codegen.Visitor;
import lang.nodes.dotutils.DotFile;
import lang.nodes.dotutils.DotFile;
import lang.nodes.environment.Env;

public class FloatLit extends Exp {

    private double value;

    public FloatLit(double value) {
        super();
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void accept(Visitor v) {
        v.visit(this);
    }

    public Object eval(Env e) {
        return value;
    }

    public int toDot(DotFile d) {
        return d.addNode("" + value);
    }
}
