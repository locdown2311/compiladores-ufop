package lang.nodes.expr;

import lang.codegen.Visitor;
import lang.nodes.dotutils.DotFile;
import lang.nodes.dotutils.DotFile;
import lang.nodes.environment.Env;

public class Not extends Exp {

     private Exp le;

     public Not(Exp le) {
          this.le = le;

     }

     public Exp getExp() {
          return le;
     }

     public Object eval(Env e) {
          return !((Boolean) getExp().eval(e));
     }

     public void accept(Visitor v) {
          v.visit(this);
     }

     public int toDot(DotFile d) {
          int ne = le.toDot(d);
          int root = d.addNode("Nots");
          d.addEdge(root, ne);
          return root;
     }
}
