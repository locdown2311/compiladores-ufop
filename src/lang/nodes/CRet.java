package lang.nodes;

import lang.codegen.Visitor;
import lang.nodes.dotutils.DotFile;
import lang.nodes.expr.Exp;
import lang.nodes.environment.Env;

import java.util.ArrayList;

public class CRet extends CNode {

    private ArrayList<Exp> expressions;

    public CRet(ArrayList<Exp> expressions) {
        super();
        this.expressions = expressions;
    }

    public ArrayList<Exp> getExpressions() {
        return expressions;
    }

    public void interp(Env env) {
        for (Exp e : expressions) {
            Object val = e.eval(env);
            env.push(val);
        }
        throw new ReturnExcept("ret");
    }
    public void accept (Visitor v) {v.visit(this);}


    public int toDot(DotFile d) {
        int root = d.addNode("Ret");
        for (Exp e : expressions) {
            int ne = e.toDot(d);
            d.addEdge(root, ne);
        }
        return root;
    }
}