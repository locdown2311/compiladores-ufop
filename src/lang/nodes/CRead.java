package lang.nodes;

import lang.nodes.environment.Env;
import lang.codegen.Visitor;
import lang.nodes.dotutils.DotFile;
import java.util.Scanner;

public class CRead extends CNode {

    private CNode lvalue;

    public CRead(CNode lvalue) {
        super();
        this.lvalue = lvalue;
    }

    @Override
    public void interp(Env env) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        Object value = scanner.nextLine();
    }
    public void accept (Visitor v) {v.visit(this);}

    @Override
    public int toDot(DotFile d) {
        int node = d.addNode("Read");
        int lvalNode = lvalue.toDot(d);
        d.addEdge(node, lvalNode);
        return node;
    }
}