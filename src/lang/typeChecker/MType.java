package lang.typeChecker;


public abstract class MType {

     public abstract int getTyID();
     public abstract boolean match(MType t);

}
