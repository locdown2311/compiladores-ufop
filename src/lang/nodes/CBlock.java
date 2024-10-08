package lang.nodes;

import lang.nodes.environment.Env;
import lang.nodes.dotutils.DotFile;

public class CBlock extends CNode {

    private CNode[] commands;

    public CBlock(CNode[] commands) {
        super();
        this.commands = commands;
    }

    public CNode[] getCommands() {
        return commands;
    }

    public void interp(Env env) {
        for (CNode command : commands) {
            command.interp(env);
        }
    }

    public int toDot(DotFile d) {
        int root = d.addNode("Block");
        for (CNode command : commands) {
            int cmdNode = command.toDot(d);
            d.addEdge(root, cmdNode);
        }
        return root;
    }
}