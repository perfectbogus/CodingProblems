package dev.perfectbogus.trees;

public class Traversal {

    public static void inOrder(NodeBT node){
        if (node != null){
            inOrder(node.getLeft());
            System.out.println(node.getData().toString());
            inOrder(node.getRight());
        }
    }

    public static void preOrder(NodeBT node){
        if (node != null) {
            System.out.println(node.getData().toString());
            preOrder(node.getLeft());
            preOrder(node.getRight());
        }
    }

    public static void postOrder(NodeBT node){
        if (node != null) {
            postOrder(node.getLeft());
            postOrder(node.getRight());
            System.out.println(node.getData().toString());

        }
    }
}
