package lang.nodes.expr;

import lang.nodes.dotutils.DotFile;
import lang.nodes.dotutils.DotFile;
import lang.nodes.environment.Env;

public class BoolLit extends Exp{

      private boolean value;
      public BoolLit(boolean value){
           super();
           this.value = value;
      }

      public boolean getValue(){ return value;}

      public Object eval(Env e){
          return value;
      }

      public int toDot(DotFile d){
         return d.addNode(""+value);
      }
}
