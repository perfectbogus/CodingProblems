package dev.perfectbogus.trees;

public class NodeBT<T> {

    private T data;
    private NodeBT right;
    private NodeBT left;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public NodeBT getRight() {
        return right;
    }

    public void setRight(NodeBT right) {
        this.right = right;
    }

    public NodeBT getLeft() {
        return left;
    }

    public void setLeft(NodeBT left) {
        this.left = left;
    }
}
