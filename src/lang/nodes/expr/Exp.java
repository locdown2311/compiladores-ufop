package lang.nodes.expr;

import lang.nodes.CNode;
import lang.nodes.dotutils.DotFile;
import lang.nodes.dotutils.DotFile;
import lang.nodes.environment.Env;

public abstract class Exp extends CNode {

    public Exp() {
        super();
    }

    public final void interp(Env e) {
        return;
    }

    public abstract Object eval(Env e);
}
