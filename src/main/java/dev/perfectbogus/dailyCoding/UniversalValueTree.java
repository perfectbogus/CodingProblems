package dev.perfectbogus.dailyCoding;

public class UniversalValueTree {
    /**
     * A unival tree (which stands for "universal value") is a tree where all nodes under it have the same value.
     *
     * Given the root to a binary tree, count the number of unival subtrees.
     *
     * For example, the following tree has 5 unival subtrees:
     *
     *    0
     *   / \
     *  1   0
     *     / \
     *    1   0
     *   / \
     *  1   1
     */

    public static void main(String[] args){
        Node root = new Node(0,
                new Node(1, null, null),
                        new Node(0,
                new Node(1,
            new Node(1, null, null),
                        new Node(1, null, null)), new Node(0, null, null)));



        int count = countUnivalSubtrees(root);
        System.out.println(count);
    }

    public static boolean univalHelper(Node root, int value){
        if(root == null){
            return true;
        }
        if (root.value == value){
            return univalHelper(root.left, value) && univalHelper(root.right, value);
        }
        return false;
    }

    public static int countUnivalSubtrees(Node root){
        if( root == null){
            return 0;
        }
        int left = countUnivalSubtrees(root.left);
        int right = countUnivalSubtrees(root.right);
        if( isUnival(root) ){
            return 1 + right + left;
        } else {
            return left + right;
        }
    }

    public static boolean isUnival(Node root){
        return univalHelper(root, root.value);
    }

    public static class Node{
        int value;
        Node left;
        Node right;

        public Node(int value, Node left, Node right){
            this.value = value;
            this.left = left;
            this.right = right;
        }
    }
}
