package lang.nodes;

import lang.nodes.dotutils.DotFile;
import lang.nodes.expr.Exp;
import lang.nodes.environment.Env;

public class CRet extends CNode {

      private Exp e;

      public CRet(Exp e){
          super();
          this.e = e;
      }

      public Exp getExp(){ return e;}

      public void interp(Env env){
         Object val = e.eval(env);
         env.push(val);
         throw new ReturnExcept("ret");
      }

      public int toDot(DotFile d){
         int ne = e.toDot(d);
         int root = d.addNode("Ret");
         d.addEdge(root, ne);
         return root;
      }
}
