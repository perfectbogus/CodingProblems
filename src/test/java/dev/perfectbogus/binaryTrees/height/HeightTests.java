package dev.perfectbogus.binaryTrees.height;

import dev.perfectbogus.binaryTrees.Node;
import dev.perfectbogus.binaryTrees.heightProblem.Iterative;
import dev.perfectbogus.binaryTrees.heightProblem.Recursive;
import dev.perfectbogus.binaryTrees.heightProblem.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HeightTests {

    private final Solution r = new Recursive();
    private final Solution i = new Iterative();

    @Test
    public void emptyTreeRecursiveTest(){
        Node node = null;
        final int result = r.calculateHeight(node);
        assertEquals(0, result);
    }

    @Test
    public void oneNodeTreeRecursiveTest(){
        Node node = new Node(1);
        final int result = r.calculateHeight(node);
        assertEquals(1, result);
    }

    @Test
    public void moreThanLevelTreeRecursiveTest(){
        Node node = new Node(1);
        node.setLeft(new Node(2));
        node.setRight(new Node(3));

        Node root = new Node(4);
        root.setLeft(node);
        root.setRight(new Node(5));

        final int result = r.calculateHeight(root);
        assertEquals(3, result);
    }

}
