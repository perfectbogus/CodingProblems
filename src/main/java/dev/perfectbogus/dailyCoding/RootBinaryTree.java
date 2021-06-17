package dev.perfectbogus.dailyCoding;

public class RootBinaryTree {

    /**
     * Given the root to a binary tree, implement serialize(root), which serializes the
     * tree into a string, and deserialize(s), which deserializes the string back into
     * the tree.
     *
     * For example, given the following Node class
     */
    public static void main(String[] args){
        Node<Integer> root = new Node<>(1, new Node<>(2, null, null), null);
        System.out.println(serialize(root));
    }

    public static String serialize(Node<Integer> root){
        if(root == null){
            return "( null ) ";
        } else {
            return "( " + root.val + " " + serialize(root.left) + " " + serialize(root.right) + " )";
        }
//        str.append("( ");
//        str.append(temp.val);
//        str.append(" ");
//        str.append("( ");
//        str.append(root.left);
//        str.append(" ");
//        str.append(") ");
//        str.append("( ");
//        str.append(root.right);
//        str.append(" ");
//        str.append(") ");
//        str.append(") ");
    }

    public static Node<Integer> deserialize(String rootSerialized){

        return new Node<>(1);
    }
    public static class Node<T>{
        public T val;
        public Node<T> left;
        public Node<T> right;

        public Node(){
            this.val = null;
            this.left = null;
            this.right = null;
        }

        public Node(T val){
            this.val = val;
            this.left = null;
            this.right = null;
        }

        public Node(T val, Node<T> left, Node<T> right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
