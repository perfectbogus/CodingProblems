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

        int rest = countUnivalSubtreesN(root);
        System.out.println(rest);
    }

    public static int countUnivalSubtreesN(Node node){
        return helper(node).count;
    }

    public static Tuple helper(Node node){
        if( node == null){
            return new Tuple(0, true);
        }
        Tuple left = helper(node.left);
        Tuple right = helper(node.right);
        int total_counts = left.count + right.count;
        if( left.isUnival && right.isUnival){
            if(node.left != null && node.value != node.left.value){
                return new Tuple(total_counts, false);
            }
            if(node.right != null && node.value != node.right.value){
                return new Tuple(total_counts, false);
            }
            return new Tuple(total_counts + 1, true);
        } else {
            return new Tuple(total_counts, false);
        }
    }

    public static class Tuple {

        public int count;
        public boolean isUnival;

        public Tuple(int count, boolean isUnival){
            this.count = count;
            this.isUnival = isUnival;
        }
    }

    /**
     * -------------------------------n^2 solution -------------------------------
     * @param root
     * @return
     */
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

    public static boolean univalHelper(Node node, int rootValue){
        if(node == null){
            return true;
        }
        if (node.value == rootValue){
            return univalHelper(node.left, rootValue) && univalHelper(node.right, rootValue);
        }
        return false;
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
