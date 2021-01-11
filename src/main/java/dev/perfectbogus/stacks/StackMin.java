package dev.perfectbogus.stacks;

import java.util.Stack;

/**
 * How would you design a stack which, in addition to push and pop, has a function min which
 * returns the minimum element? Push, pop and min should all operate in O(1) time.
 *
 * Approaches:
 * a)
 *  we can use a variable to keep the minimum value, but every time that
 *  update the stack (add or delete), we have to search the minimum value on the
 *  stack.
 *
 *  but this condition break the rule of the O(1) time on the push and the pop
 *
 *  b)
 *  keep the record of the minimum value on each stack
 *
 */

public class StackMin extends Stack<NodeWithMin> {

    public void push(int value){
        int newMin = Math.min(value, min());
        super.push(new NodeWithMin(value, newMin));
    }

    public int min(){
        if ( this.isEmpty() ){
            return Integer.MAX_VALUE;
        } else {
            return peek().min;
        }
    }

}
