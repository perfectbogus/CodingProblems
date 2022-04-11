package dev.perfectbogus.binaryTrees.identical;

import dev.perfectbogus.binaryTrees.identicalProblem.Iterative;
import dev.perfectbogus.binaryTrees.identicalProblem.Node;
import dev.perfectbogus.binaryTrees.identicalProblem.Recursive;
import dev.perfectbogus.binaryTrees.identicalProblem.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IdenticalTests {

    private final Solution r = new Recursive();
    private final Solution i = new Iterative();


    @Test
    public void areNotIdenticalIterativeSolutionTest(){
        Node x = getNode();
        Node y = new Node(1);
        y.setLeft(new Node(2));
        y.setRight(new Node(4));

        final boolean result = i.isIdentical(x, y);
        assertFalse(result);
    }

    @Test
    public void areIdenticalIterativeSolutionTest(){
        Node x = getNode();
        Node y = getNode();

        final boolean result = i.isIdentical(x, y);
        assertTrue(result);
    }

    @Test
    public void areIdenticalRecursiveSolutionTest(){
        Node x = getNode();
        Node y = getNode();
        boolean result = r.isIdentical(x, y);
        assertTrue(result);
    }

    @Test
    public void areNotIdenticalRecursiveSolutionTest(){
        Node x = getNode();
        Node y = new Node(1);
        y.setLeft(new Node(2));
        boolean result = r.isIdentical(x, y);
        assertFalse(result);
    }

    private Node getNode(){
        Node node = new Node(1);
        node.setLeft(new Node(2));
        node.setRight( new Node(3));
        return node;
    }
}
