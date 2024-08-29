package lang.nodes.environment;

import java.util.HashMap;
import java.util.Stack;

public class Env {

    //Ambiente é um mapeamento de Nome pra valor
    private Stack<HashMap<String, Object>> sm;
    private Stack<Object> stk;
    private HashMap<String, Object> funcs;

    public Env() {
        sm = new Stack<HashMap<String, Object>>();
        sm.push(new HashMap<String, Object>(10));
        funcs = new HashMap<String, Object>(20);
        stk = new Stack();
    }

    public Env(int sz) {
        sm = new Stack<HashMap<String, Object>>();
        sm.push(new HashMap<String, Object>(sz));
        funcs = new HashMap<String, Object>(20);
        stk = new Stack();
    }

    public void store(String vname, Object value) {
        sm.peek().put(vname, value);
    }

    public Object read(String vname) {
        Object i = sm.peek().get(vname);
        if (i == null) {
            throw new RuntimeException("Unknow variable " + vname);
        }
        return i;
    }

    public void pushVariablesEnv() {
        sm.push(new HashMap<String, Object>(10));
    }

    public void pushVariablesEnv(HashMap<String, Object> env) {
        sm.push(env);
    }

    public HashMap<String, Object> popVariablesEnv() {
        return sm.pop();
    }

    public void declareFunc(String fname, Object func) {
        funcs.put(fname, func);
    }

    public Object getFunc(String fname) {
        Object i = funcs.get(fname);
        if (i == null) {
            throw new RuntimeException("Unknown function " + fname);
        }
        return i;
    }

    public Object pop() {
        return stk.pop();
    }

    public Object peek() {
        return stk.peek();
    }

    public void push(Object val) {
        stk.push(val);
    }
}
