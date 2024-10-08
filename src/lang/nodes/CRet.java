package lang.nodes;

import lang.nodes.dotutils.DotFile;
import lang.nodes.expr.Exp;
import lang.nodes.environment.Env;
import java.util.List;

public class CRet extends CNode {

    private List<Exp> expressions;

    public CRet(List<Exp> expressions) {
        super();
        this.expressions = expressions;
    }

    public List<Exp> getExpressions() {
        return expressions;
    }

    public void interp(Env env) {
        for (Exp e : expressions) {
            Object val = e.eval(env);
            env.push(val);
        }
        throw new ReturnExcept("ret");
    }

    public int toDot(DotFile d) {
        int root = d.addNode("Ret");
        for (Exp e : expressions) {
            int ne = e.toDot(d);
            d.addEdge(root, ne);
        }
        return root;
    }
}