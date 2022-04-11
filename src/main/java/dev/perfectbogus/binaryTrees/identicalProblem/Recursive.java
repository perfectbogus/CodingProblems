package dev.perfectbogus.binaryTrees.identicalProblem;

public class Recursive extends Solution {

    @Override
    public boolean isIdentical(Node x, Node y) {
        if(x == null && y == null){
            return true;
        }

        return (x != null && y != null) &&
                (x.getKey() == y.getKey()) &&
                isIdentical(x.getLeft(), y.getLeft()) &&
                isIdentical(x.getRight(), y.getRight());
    }
}
