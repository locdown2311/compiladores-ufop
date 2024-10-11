package lang.codegen;

import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.Stack;

import lang.nodes.expr.*;
import lang.nodes.*;
import lang.typeChecker.*;

public class TVisitor extends Visitor {
    private Stack<MType> stk;
    private TypeContext<String, CtxEntry<MType, TypeContext<String, MType>>> tyctx;
    private TypeContext<String, MType> localCtx;
    private ArrayList<String> err;
    private boolean returnReach;

    private TyInt ctyInt = new TyInt();
    private TyFloat ctyFloat = new TyFloat();
    private TyChar ctyChar = new TyChar();
    private TyBool ctyBool = new TyBool();
    private TyErr ctyErr = new TyErr();

    public TVisitor() {
        err = new ArrayList<String>();
        stk = new Stack<MType>();
        localCtx = null;
        tyctx = new TypeContext<String, CtxEntry<MType, TypeContext<String, MType>>>();
    }

    public boolean hasErrors() {
        return err.size() > 0;
    }

    public void printErrors() {
        for (String msg : err) {
            System.out.println(msg);
        }
        System.out.println(" Total de " + err.size() + " erros encontrados");
    }

    public TypeContext<String, CtxEntry<MType, TypeContext<String, MType>>> getTypeCtx() {
        return tyctx;
    }

    public void printTypeContext() {
        String aux = "", s = "";
        for (Entry<String, CtxEntry<MType, TypeContext<String, MType>>> e : tyctx.getEntrySet()) {
            aux = e.getKey().toString() + " :: ";
            s += aux + e.getValue().toStringIntdent(aux.length()) + "\n";
        }
        System.out.println(s);
    }
    private void funcSig(CFuncDef c){
           for(CVarDec vc : c.getArgList()){
              vc.accept(this);
          }
          TyFun tfn = new TyFun(c.getArgList().length);
          for(int i = c.getArgList().length -1; i >= 0 ; i--){
             tfn.setParamAt(i,stk.pop());
          }
          for (CType ct : c.getType()) {
            ct.accept(this);
          }
          tfn.setParamAt(c.getArgList().length,stk.pop());
          stk.push(tfn);
       }

    public void visit(CProg c) {
        for (CFuncDef f : c.getFuncs()) {
            localCtx = new TypeContext<String, MType>();
            funcSig(f);
            tyctx.add(f.getID(),
                    new CtxEntry<MType, TypeContext<String, MType>>(stk.pop(), localCtx));
        }
        for (CFuncDef f : c.getFuncs()) {
            localCtx = tyctx.get(f.getID()).getRight();
            f.accept(this);
        }
    }

    public void visit(CFuncDef c) {
        int ssz = stk.size();
        returnReach = false;
        c.getBody().accept(this);
        MType tr = tyctx.get(c.getID()).getLeft();
        MType tri;
        if (tr instanceof TyFun) {
            tr = ((TyFun) tr).getReturnType();
        }
        if (stk.size() == ssz) {
            String s = "Erro :\n";
            s += "    A função " + c.getID() + " não retorna nenhum valor. ";
            err.add(s);
        } else if (!returnReach) {
            String s = "Erro :\n";
            s += "    A função " + c.getID() + " pode não retornar valor.";
            err.add(s);
        } else {
            while (stk.size() > ssz) {
                tri = stk.pop();
                if (!tri.match(tr)) {
                    String s = "Erro de tipo em (" + c.getLine() + ", " + c.getColumn() + "):\n";
                    s += "    Tipo de retorno inconsistente com declarado: " + tri.toString() +
                            ", mas devia ser " + tr.toString();
                    err.add(s);
                }
            }
        }
    }

    public void visit(CType t) {
    }

    public void visit(CVarDec c) {
    }

    public void visit(CData c) {
    }

    public void visit(Call c) {
    }

    public void visit(CRead c) {
    }

    public void visit(CBlock c) {
    }

    public void visit(Print c) {
    }

    public void visit(CRet c) {
    }

    public void visit(CAttr c) {
    }

    public void visit(ArrInst c) {
    }

    public void visit(CIfthen c) {
    }

    public void visit(CLoop c) {
    }

    public void visit(Plus e) {
    }

    public void visit(Minus e) {
    }

    public void visit(Times e) {
    }

    public void visit(Div e) {
    }

    public void visit(Mod e) {
    }

    public void visit(Lt e) {
    }

    public void visit(Gt e) {
    }

    public void visit(Loe e) {
    }

    public void visit(Goe e) {
    }

    public void visit(Eq e) {
    }

    public void visit(Ne e) {
    }

    public void visit(And e) {
    }

    public void visit(Or e) {
    }

    public void visit(Not e) {
    }

    public void visit(Var e) {
    }

    public void visit(IntLit e) {
    }

    public void visit(CharLit e) {
    }

    public void visit(FloatLit e) {
    }

    public void visit(BoolLit e) {
    }

    public void visit(StringLit e) {
    }

    public void visit(Uminus e) {
    }

    public void visit(CFieldAccess e) {
    }

    public void visit(CArrayAccess e) {
    }

    public void visit(CNull e) {
    }
}
