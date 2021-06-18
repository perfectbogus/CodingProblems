package dev.perfectbogus.dailyCoding;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RootBinaryTree {

    /**
     * Given the root to a binary tree, implement serialize(root), which serializes the
     * tree into a string, and deserialize(s), which deserializes the string back into
     * the tree.
     *
     * For example, given the following Node class
     */
    public static void main(String[] args){
        Node<Integer> root = new Node<>(1, new Node<>(2, new Node<>(3 , null, null), null), new Node<>(3, null, null));
        String serRoot1 = serialize(root);
        System.out.println(serRoot1);

        Node<Integer> root2 = new Node<>(1, null, null);
        String serRoot = serialize(root2);
        System.out.println(serRoot);

        Node<Integer> des = deserialize(serRoot);
        Node<Integer> des1 = deserialize(serRoot1);
    }

    public static String serialize(Node<Integer> root){
        if(root == null){
            return "( null )";
        } else {
            return "( " + root.val + " " + serialize(root.left) + " " + serialize(root.right) + " )";
        }
    }

    public static Node<Integer> deserialize(String str){
        System.out.println(str);
        if(str.equals("( null )")){
            return null;
        } else {
            String pattern = "\\( ([0-9]*) \\( (.*)+ \\) \\( (.*)+ \\) \\)";
            Pattern r = Pattern.compile(pattern);
            Matcher matcher = r.matcher(str);
            String[] matches = new String[4];

            while (matcher.find()) {
                matches[0] = matcher.group(0);
                for (int i = 1; i <= matcher.groupCount(); i++) {
                    System.out.println("Group " + i + ": " + matcher.group(i));
                    matches[i] = matcher.group(i);
                }
            }

            return new Node<>(Integer.parseInt(matches[1]), deserialize("( " + matches[2] + " )"), deserialize("( " + matches[3]  + " )"));
        }
    }

    public static class NotValidStringSerializedException extends Exception {

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
