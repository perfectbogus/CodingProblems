package dev.perfectbogus.trees;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TraversalTreeTests {

    private BinaryTree<Integer> tree;

    @BeforeEach
    public void setup(){
        tree = new BinaryTree<>();
    }

    @Test
    public void inOrderTest(){
        Traversal.inOrder(tree.getRoot());
    }

}
