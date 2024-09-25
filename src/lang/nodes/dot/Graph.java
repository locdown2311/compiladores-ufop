package lang.nodes.dot;

import org.antlr.v4.runtime.misc.*;

import java.util.Set;

public class Graph {

    Set<String> nodes = new OrderedHashSet<String>(); // list of functions
    MultiMap<String, String> edges = // caller->callee
            new MultiMap<String, String>();

    public void edge(String source, String target) {
        edges.map(source, target);
    }

    public String toDOT() {
        StringBuilder buf = new StringBuilder();
        buf.append("digraph G {\n");
        buf.append(" ranksep=.25;\n");
        buf.append(" edge [arrowsize=.5]\n");
        buf.append(" node [shape=circle, fontname=\"ArialNarrow\",\n");
        buf.append(" fontsize=12, fixedsize=true, height=.45];\n");
        buf.append(" ");
        for (String node : nodes) { // print all nodes first
            buf.append(node);
            buf.append("; ");
        }
        buf.append("\n");
        for (String src : edges.keySet()) {
            for (String trg : edges.get(src)) {
                buf.append(" ");
                buf.append(src);
                buf.append(" -> ");
                buf.append(trg);
                buf.append(";\n");
            }
        }
        buf.append("}\n");
        return buf.toString();

    }
}
