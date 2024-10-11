package lang.nodes.expr;

import lang.codegen.Visitor;
import lang.nodes.dotutils.DotFile;
import lang.nodes.environment.Env;

public class Plus extends BinOp {

    public Plus(Exp el, Exp er) {
        super(el, er);
    }

    public Object eval(Env e) {
        Object re, rd;
        re = getLeft().eval(e);
        rd = getRight().eval(e);
        System.out.println("Left operand: " + re + ", Right operand: " + rd); // Adiciona log

        if ((re instanceof Integer) && (rd instanceof Integer)) {
            System.out.println("Integer addition: " + re + " + " + rd); // Adiciona log
            return ((Integer) re + (Integer) rd);
        }
        if ((re instanceof Float) && (rd instanceof Float)) {
            System.out.println("Float addition: " + re + " + " + rd); // Adiciona log
            return ((Float) re + (Float) rd);
        }
        throw new RuntimeException("operador + : argumentos inválidos");
    }

    public void accept(Visitor v) {
        v.visit(this);
    }

    public int toDot(DotFile d) {
        int ne = getLeft().toDot(d);
        int nd = getRight().toDot(d);
        int root = d.addNode("Plus");
        d.addEdge(root, ne);
        d.addEdge(root, nd);
        return root;
    }
}
