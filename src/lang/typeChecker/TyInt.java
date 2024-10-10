package lang.typeChecker;


public class TyInt extends MType {

       public int getTyID(){ return TyEnum.INT.ordinal();}
       public boolean match(MType t){return this.getTyID() == t.getTyID();}

       public String toString(){ return "Int"; }
}
