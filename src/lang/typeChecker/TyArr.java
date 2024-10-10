package lang.typeChecker;


public class TyArr extends MType {

       private MType arg;

       public TyArr(MType t){
          arg = t;
       }

       public MType getArg(){ return arg;}

       public int getTyID(){ return TyEnum.TyArr.ordinal();}

       public boolean match(MType t){
            return this.getTyID() == t.getTyID() && arg.match( ((TyArr)t).getArg());
       }

       public String toString(){ return arg.toString() + "[]"; }
}
