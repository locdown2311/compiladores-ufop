package lang.nodes.expr;

import lang.nodes.dotutils.DotFile;
import lang.nodes.dotutils.DotFile;
import lang.nodes.environment.Env;

public class Var extends Exp{

      private String name;
      public Var(String name){
           super();
           this.name = name;
      }

      public String getName(){ return name;}

      public Object eval(Env e){
          return e.read(name);
      }

      public int toDot(DotFile d){
         return d.addNode(name);
      }
}
