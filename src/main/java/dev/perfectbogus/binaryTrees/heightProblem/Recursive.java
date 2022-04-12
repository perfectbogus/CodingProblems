package dev.perfectbogus.binaryTrees.heightProblem;

import dev.perfectbogus.binaryTrees.Node;

public class Recursive extends Solution{

    @Override
    public int calculateHeight(Node node) {
        if(node == null){
            return 0;
        }
        return 1 + Math.max(
                calculateHeight(node.getLeft()),
                calculateHeight(node.getRight())
        );
    }
}
