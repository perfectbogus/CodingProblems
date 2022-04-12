package dev.perfectbogus.binaryTrees;

public class Node {
    private final int key;
    private Node left = null;
    private Node right = null;

    public Node(int key){
        this.key = key;
    }

    public void setLeft(Node left){
        this.left = left;
    }

    public void setRight(Node right){
        this.right = right;
    }

    public int getKey() {
        return key;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }
}
