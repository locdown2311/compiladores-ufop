package lang.nodes.expr;

import lang.nodes.dotutils.DotFile;
import lang.nodes.dotutils.DotFile;
import lang.nodes.environment.Env;

public class Plus extends BinOp {

    public Plus(Exp el, Exp er) {
        super(el, er);
    }

    public Object eval(Env e) {
        Object re,rd;
        re = getLeft().eval(e);
        rd = getRigth().eval(e);
        if ((re instanceof Integer) && (re instanceof Integer)) {
            return ((Integer) re + (Integer) rd);
        }
        if ((re instanceof Float) && (re instanceof Float)) {
            return ((Float) re + (Float) rd);
        }
        throw new RuntimeException("operador + : argumentos inválidos");
    }

    public int toDot(DotFile d) {
        int ne = getLeft().toDot(d);
        int nd = getRigth().toDot(d);
        int root = d.addNode("Plus");
        d.addEdge(root, ne);
        d.addEdge(root, nd);
        return root;
    }
}
