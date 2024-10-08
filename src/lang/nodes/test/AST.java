package lang.nodes.test;

abstract class Node {
    abstract int evaluate();
}

class IntNode extends Node {
    int value;
    IntNode(int value) { this.value = value; }
    
    @Override
    int evaluate() {
        return value;
    }
}

class BinaryOpNode extends Node {
    String op;
    Node left, right;
    BinaryOpNode(String op, Node left, Node right) {
        this.op = op;
        this.left = left;
        this.right = right;
    }
    
    @Override
    int evaluate() {
        int leftValue = left.evaluate();
        int rightValue = right.evaluate();
        switch (op) {
            case "+":
                return leftValue + rightValue;
            case "-":
                return leftValue - rightValue;
            case "*":
                return leftValue * rightValue;
            case "/":
                return leftValue / rightValue;
            default:
                throw new IllegalArgumentException("Operador desconhecido: " + op);
        }
    }
}
