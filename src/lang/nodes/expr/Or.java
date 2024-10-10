package lang.nodes.expr;

import lang.codegen.Visitor;
import lang.nodes.dotutils.DotFile;
import lang.nodes.dotutils.DotFile;
import lang.nodes.environment.Env;

public class Or extends BinOp {
   public Or(Exp el, Exp er) {
      super(el, er);

   }

   public Object eval(Env e) {
      return ((Boolean) getLeft().eval(e)) || ((Boolean) getRight().eval(e));
   }

   public void accept(Visitor v) {
      v.visit(this);
   }

   public int toDot(DotFile d) {
      int ne = getLeft().toDot(d);
      int nd = getRight().toDot(d);
      int root = d.addNode("Or");
      d.addEdge(root, ne);
      d.addEdge(root, nd);
      return root;
   }
}
