package dev.perfectbogus.stacks;

import java.util.Stack;

/**
 * Sort a Stack:
 * <p>
 * Write a program to sort a stack that the smallest items are on the top. You can use a temporary stack, but
 * you may not copy the elements into any another data structure (such as array). The stack supports the following
 * operations: push, pop, peek, and isEmpty.
 * <p>
 * Approaches:
 * pop the element on the input stack after that use the second stack to store that value
 * after that pop the next element and compare with the first value of the other stack
 * if
 */

public class SortStack {

    public static void sort(Stack<Integer> inputStack) {
        Stack<Integer> swapStack = new Stack<>();
        while (inputStack.size() > 0) {
            Integer data = inputStack.pop();
            if (swapStack.isEmpty()) {
                swapStack.push(data);
            } else {
                Integer peekData = swapStack.peek();
                if (data >= peekData) {
                    swapStack.push(data);
                } else {
                    int indexPopped = 0;
                    while (peekData > data) {
                        peekData = swapStack.pop();
                        inputStack.push(peekData);
                        indexPopped++;
                        if (swapStack.size() > 0) {
                            peekData = swapStack.peek();
                        } else {
                            break;
                        }
                    }
                    swapStack.push(data);
                    while (indexPopped > 0) {
                        int tempData = inputStack.pop();
                        swapStack.push(tempData);
                        indexPopped--;
                    }
                }
            }
        }
        while (!swapStack.isEmpty()) {
            int tempData = swapStack.pop();
            inputStack.push(tempData);
        }
    }

    public static void sorting(Stack<Integer> s) {
        Stack<Integer> r = new Stack<>();
        while (!s.isEmpty()) {
            int tmp = s.pop();
            while(!r.isEmpty() && r.peek() > tmp){
                s.push(r.pop());
            }
            r.push(tmp);
        }

        while(!r.isEmpty()) {
            s.push(r.pop());
        }
    }

}
