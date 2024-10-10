package lang.nodes.expr;

import lang.codegen.Visitor;
import lang.nodes.dotutils.DotFile;
import lang.nodes.dotutils.DotFile;
import lang.nodes.environment.Env;

public class Goe extends BinOp {

    public Goe(Exp el, Exp er) {
        super(el, er);
    }

    public void accept(Visitor v) {
        v.visit(this);
    }

    public Object eval(Env e) {
        Object re, rd;
        re = getLeft().eval(e);
        rd = getRight().eval(e);
        if ((re instanceof Integer) && (re instanceof Integer)) {
            return ((Integer) re >= (Integer) rd);
        }
        if ((re instanceof Float) && (re instanceof Float)) {
            return ((Float) re >= (Float) rd);
        }
        return null;
    }

    public int toDot(DotFile d) {
        int ne = getLeft().toDot(d);
        int nd = getRight().toDot(d);
        int root = d.addNode("Goe");
        d.addEdge(root, ne);
        d.addEdge(root, nd);
        return root;
    }
}
