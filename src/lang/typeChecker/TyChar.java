package lang.typeChecker;


public class TyChar extends MType {

       public int getTyID(){ return TyEnum.CHAR.ordinal();}
       public boolean match(MType t){return this.getTyID() == t.getTyID();}

       public String toString(){ return "Char"; }
}
