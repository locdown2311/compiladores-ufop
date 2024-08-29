package lang.nodes.expr;
import lang.nodes.dotutils.DotFile;
import lang.nodes.dotutils.DotFile;
import lang.nodes.environment.Env;


public class Or extends BinOp{
    public Or(Exp el, Exp er){
        super(el,er);

   }
   public Object eval(Env e){
        return ((Boolean)getLeft().eval(e)) || ((Boolean)getRigth().eval(e));
   }

   public int toDot(DotFile d){
      int ne = getLeft().toDot(d);
      int nd = getRigth().toDot(d);
      int root = d.addNode("Or");
      d.addEdge(root, ne);
      d.addEdge(root, nd);
      return root;
   }
}

