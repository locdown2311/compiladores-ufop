package lang.nodes;

import lang.nodes.dotutils.DotFile;
import lang.nodes.expr.Exp;
import lang.nodes.environment.Env;
import java.util.ArrayList;
import java.util.HashMap;

public class CFuncDef extends CNode {

      private String v;
      private CVarDec[]  args;
      private CType t;
      private CNode body;

      public CFuncDef(String v,  CVarDec[] aList, CType t, CNode b){
          super();
          this.v = v;
          this.t = t;
          body = b;
          if(aList == null){
             args = new CVarDec[0];
          }else{args = aList;}
      }

      public HashMap<String, Object> buildLocalEnv(Object vals[]){
          HashMap<String, Object> env1 = new HashMap<String, Object>();
          int i = 0;
          for(CVarDec vd : args){
                env1.put(vd.getID(),vals[i]);
                i++;
          }
          return env1;
      }

      public HashMap<String, Object> buildLocalEnv(Object val){
          HashMap<String, Object> env1 = new HashMap<String, Object>();
          int i = 0;
          for(CVarDec vd : args){
                env1.put(vd.getID(),val);
                i++;
          }
          return env1;
      }


      public CVarDec[] getArgList(){ return args;}
      public String getID(){  return v;}
      public CNode getBody(){ return body;}
      public CType getType(){ return t;}

      public void interp(Env env){
          body.interp(env);
      }

      public int toDot(DotFile d){
          int root = d.addNode("Func:");
          int nv   = d.addNode(v);
          int c;
          for(CVarDec vd : args){
              c = vd.toDot(d);
              d.addEdge(root,c);
          }
          c = t.toDot(d);
          d.addEdge(root,c);
          c = body.toDot(d);
          d.addEdge(root,nv);
          d.addEdge(root,c);
          return root;
      }
}
