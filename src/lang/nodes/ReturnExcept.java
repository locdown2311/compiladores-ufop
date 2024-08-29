package lang.nodes;

import lang.nodes.dotutils.DotFile;
import lang.nodes.expr.Exp;
import lang.nodes.environment.Env;


public class ReturnExcept extends RuntimeException {

      public ReturnExcept(String msg){
            super(msg);
      }

}
