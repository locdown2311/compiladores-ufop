package lang.nodes;

import lang.nodes.dotutils.DotFile;
import lang.nodes.expr.Exp;
import lang.nodes.environment.Env;


public class CLoop extends CNode {

      private Exp cond;
      private CNode body;

      public CLoop(Exp c, CNode b){
          super();
          cond = c;
          body = b;
      }

      public CNode getCond(){ return cond; }
      public CNode getBody(){ return body; }

      public void interp(Env e){
             while((Boolean)cond.eval(e)){
                  body.interp(e);
             }
      }

      public int toDot(DotFile d){
         int nc = cond.toDot(d);
         int nt = body.toDot(d);
         int root = d.addNode("Loop");
         d.addEdge(root, nc);
         d.addEdge(root, nt);
         return root;
      }
}
