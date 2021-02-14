package dev.perfectbogus.trees.Binary;

public class BinaryTree {

    Node root;

    public BinaryTree() {
    }

    private Node addRecursive(Node current, int value){
        if(current == null){
            return new Node(value);
        }
        if(value < current.getData()){
            current.setLeft(this.addRecursive(current, value));
        } else if(value > current.getData()){
            current.setRight(this.addRecursive(current, value));
        }else{
            return current;
        }
        return current;
    }

    public void add(int value){
        root = this.addRecursive(root, value);
    }
}
