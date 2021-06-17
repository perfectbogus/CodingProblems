package dev.perfectbogus.trees;

import java.util.TreeSet;

public class TreeColors {

    public static void main(String[] args){
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Red");
        treeSet.add("Black");
        treeSet.add("Yellow");
        treeSet.add("Blue");
        System.out.println(treeSet);

        System.out.println("last: " + treeSet.last());
        System.out.println("first: " + treeSet.first());

    }

}
