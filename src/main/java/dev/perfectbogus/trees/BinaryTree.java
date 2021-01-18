package dev.perfectbogus.trees;

public class BinaryTree<T> {

    private NodeBT<T> root;

    public BinaryTree() {
        this.root = new NodeBT<T>();
    }

    public NodeBT<T> getRoot() {
        return root;
    }
}
