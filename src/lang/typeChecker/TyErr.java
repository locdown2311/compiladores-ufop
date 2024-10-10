package lang.typeChecker;


public class TyErr extends MType {


       public int getTyID(){ return TyEnum.ERR.ordinal();}
       public boolean match(MType t){return true;}

       public String toString(){ return "Err"; }
}
