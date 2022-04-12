package dev.perfectbogus.binaryTrees.identicalProblem;

import dev.perfectbogus.binaryTrees.Node;

import java.util.ArrayDeque;
import java.util.Deque;

public class Iterative extends Solution {

    @Override
    public boolean isIdentical(Node x, Node y) {

        if (x == null && y == null) {
            return true;
        }

        if(x == null){
            return false;
        }

        if(y == null){
            return false;
        }

        Deque<Pair<Node, Node>> deque = new ArrayDeque<>();
        deque.add(Pair.of(x, y));

        while(!deque.isEmpty()) {
            Node xTemp = deque.peekLast().getFirst();
            Node yTemp = deque.peekLast().getSecond();

            deque.pollLast();

            if (xTemp.getKey() != yTemp.getKey()) {
                return false;
            }

            if (xTemp.getLeft() != null && yTemp.getLeft() != null) {
                deque.add(Pair.of(xTemp.getLeft(), yTemp.getLeft()));
            } else if (xTemp.getLeft() != null || yTemp.getLeft() != null) {
                return false;
            }

            if (xTemp.getRight() != null && yTemp.getRight() != null) {
                deque.add(Pair.of(xTemp.getRight(), yTemp.getRight()));
            } else if (xTemp.getRight() != null || yTemp.getRight() != null) {
                return false;
            }
        }

        return true;
    }

}
