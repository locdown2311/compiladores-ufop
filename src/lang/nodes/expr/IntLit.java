package lang.nodes.expr;

import lang.nodes.dotutils.DotFile;
import lang.nodes.dotutils.DotFile;
import lang.nodes.environment.Env;

public class IntLit extends Exp{

      private int value;
      public IntLit(int value){
           super();
           this.value = value;
      }

      public int getValue(){ return value;}

      public Object eval(Env e){
          return value;
      }

      public int toDot(DotFile d){
         return d.addNode(""+value);
      }
}
