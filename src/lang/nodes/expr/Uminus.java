package lang.nodes.expr;

import lang.codegen.Visitor;
import lang.nodes.dotutils.DotFile;
import lang.nodes.environment.Env;

public class Uminus extends Exp {
    private Exp operand;

    public Uminus(Exp operand) {
        this.operand = operand;
    }

    public Object eval(Env e) {
        Object value = operand.eval(e);
        if (value instanceof Integer) {
            return -(Integer) value;
        }
        if (value instanceof Float) {
            return -(Float) value;
        }
        throw new RuntimeException("operador - : argumento inválido");
    }

    public void accept(Visitor v) {
        v.visit(this);
    }

    public int toDot(DotFile d) {
        int node = operand.toDot(d);
        int root = d.addNode("UMinus");
        d.addEdge(root, node);
        return root;
    }
}