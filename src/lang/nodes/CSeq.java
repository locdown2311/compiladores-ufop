package lang.nodes;

import lang.nodes.dotutils.DotFile;
import lang.nodes.environment.Env;

public class CSeq extends CNode {

      private CNode left;
      private CNode right;

      public CSeq(CNode l, CNode r){
          super();
          left = l;
          right = r;
      }

      public CNode getLeft(){ return left;}
      public CNode getRight(){ return right;}

      public void interp(Env e){
         left.interp(e);
         right.interp(e);
      }

      public int toDot(DotFile d){
         int ne = left.toDot(d);
         int nd = right.toDot(d);
         int root = d.addNode("Seq");
         d.addEdge(root, ne);
         d.addEdge(root, nd);
         return root;
      }
}
