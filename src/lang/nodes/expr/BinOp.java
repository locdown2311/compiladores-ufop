package lang.nodes.expr;
import lang.nodes.dotutils.DotFile;
import lang.nodes.dotutils.DotFile;
import lang.nodes.environment.Env;

public abstract class BinOp extends Exp {
      private Exp left, rigth;

      public BinOp(Exp el, Exp er){
           super();
           left = el;
           rigth = er;
      }

      public Exp getLeft(){return left;}
      public Exp getRight(){return rigth;}
}

