package lang.typeChecker;


public class TyFloat extends MType {

       public int getTyID(){ return TyEnum.FLOAT.ordinal();}
       public boolean match(MType t){return this.getTyID() == t.getTyID();}

       public String toString(){ return "Float"; }
}
