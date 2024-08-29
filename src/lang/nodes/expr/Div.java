package lang.nodes.expr;

import lang.nodes.dotutils.DotFile;
import lang.nodes.dotutils.DotFile;
import lang.nodes.environment.Env;

public class Div extends BinOp {

      public Div(Exp el, Exp er){
           super(el,er);

      }
      public Object eval(Env e){
           return  ((Integer)getLeft().eval(e)) / ((Integer)getRigth().eval(e));
      }

      public int toDot(DotFile d){
         int ne = getLeft().toDot(d);
         int nd = getRigth().toDot(d);
         int root = d.addNode("Div");
         d.addEdge(root, ne);
         d.addEdge(root, nd);
         return root;
      }
}


