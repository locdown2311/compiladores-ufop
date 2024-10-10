package lang.typeChecker;


public class TyFun extends MType {

       private MType[] t;

       public TyFun(int arity){
           t = new MType[arity+1];
       }

       public int getArity(){ return t.length - 1;}

       public MType getParamAt(int i){ return t[i];}
       public MType getReturnType(){ return t[t.length-1];}

       public void setParamAt(int i, MType ty){ t[i] = ty;}

       public int getTyID(){ return TyEnum.TyFun.ordinal();}

       public boolean match(MType ty){
            boolean r = true;
            if(this.getTyID() == ty.getTyID()){
                TyFun tf = (TyFun)ty;
                if(getArity() == tf.getArity()){
                    for(int i = 0; i < getArity() + 1; i++){
                       r = r && t[i].match(tf.getParamAt(i));
                    }
                    return r;
                }
            }
            return false;
       }

       public boolean matchParamsOnly(MType ty[]){
            boolean r = true;
            if(getArity() == ty.length){
                    for(int i = 0; i < getArity(); i++){
                       r = r && ty[i].match(getParamAt(i));
                    }
                    return r;
            }
            return false;
       }

       public String toString(){
          String r = "";
          if(t.length > 0){
             r = t[0].toString();
             for(int i = 1; i < t.length; i++){
                r += " -> " + t[i].toString();
             }
          }
          return r;
       }
}
