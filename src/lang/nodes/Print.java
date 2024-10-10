package lang.nodes;

import lang.codegen.Visitor;
import lang.nodes.dotutils.DotFile;
import lang.nodes.expr.Exp;
import lang.nodes.environment.Env;

public class Print extends CNode {

   private Exp e;

   public Print(Exp e) {
      super();
      this.e = e;
   }

   public Exp getExp() {
      return e;
   }

   public void interp(Env env) {
      System.out.println(e.eval(env));
   }

   public void accept(Visitor v) {
      v.visit(this);
   }

   public int toDot(DotFile d) {
      int ne = e.toDot(d);
      int root = d.addNode("Print");
      d.addEdge(root, ne);
      return root;
   }
}
