package lang.typeChecker;


public class TyBool extends MType {

       public int getTyID(){ return TyEnum.BOOL.ordinal();}
       public boolean match(MType t){return this.getTyID() == t.getTyID();}

       public String toString(){ return "Bool"; }
}
