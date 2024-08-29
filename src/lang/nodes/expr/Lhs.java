package lang.nodes.expr;

import lang.nodes.dotutils.DotFile;
import lang.nodes.dotutils.DotFile;
import lang.nodes.environment.Env;

public class Lhs extends Exp{

      private Exp idx;
      private Exp lhs;

      public Lhs(Exp lhs, Exp idx){
           super();
           this.lhs = lhs;
           this.idx = idx;
      }

      public Exp getidx(){ return idx;}
      public Exp getlhs(){ return lhs;}

      public Object eval(Env e){
          Object[] v = ((Object[])lhs.eval(e));
          Integer i  = ((Integer)idx.eval(e));
          return (v[i]);
      }

      public int toDot(DotFile d){
         int nl = lhs.toDot(d);
         int nd = idx.toDot(d);
         int root = d.addNode("Lhs");
         d.addEdge(root, nl);
         d.addEdge(root, nd);
         return root;
      }
}
