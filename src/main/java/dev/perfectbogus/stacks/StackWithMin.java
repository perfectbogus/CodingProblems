package dev.perfectbogus.stacks;

import java.util.Stack;

public class StackWithMin extends Stack<Integer> {

    Stack<Integer> stackMin;

    public StackWithMin() {
        stackMin = new Stack<>();
    }

    public void push(int value) {
        if (value <= min()) {
            stackMin.push(value);
        }
        super.push(value);
    }

    public Integer pop() {
        int value = super.pop();
        if (value == min()) {
            stackMin.pop();
        }
        return value;
    }

    private int min() {
        if (stackMin.isEmpty()) {
            return Integer.MAX_VALUE;
        } else {
            return stackMin.peek();
        }
    }
}
