package lang.nodes;

import lang.nodes.dotutils.DotFile;
import lang.nodes.environment.Env;
import lang.nodes.expr.Exp;

public class CNull extends Exp {

    public CNull() {
        super();
    }

    public Object eval(Env env) {
        return null;
    }

    public int toDot(DotFile d) {
        return d.addNode("Null");
    }
}