package dev.perfectbogus.stacks;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * Queue via Stacks:
 * Implement MyQueue class which implements a queue using two stacks.
 * <p>
 * Approaches:
 * on pop insert on the first stack and clone it on the second stack but on inverse mode
 *
 * @param <T>
 */

public class MyQueue<T> {

    private Stack<T> pushStack;
    private Stack<T> popStack;

    public MyQueue() {
        pushStack = new Stack<>();
        popStack = new Stack<>();
    }

    public void push(T obj) {
        if (pushStack.isEmpty()) {
            pushStack.push(obj);
            popStack.push(obj);
        } else {
            pushStack.push(obj);
            popStack.removeAllElements();
            Stack<T> swapStack = (Stack<T>) pushStack.clone();
            while (swapStack.size() > 0){
                T swapObj = swapStack.pop();
                popStack.push(swapObj);
            }
        }
    }

    public T pop() {
        if (popStack.isEmpty()) throw new EmptyStackException();
        T poppedObj = popStack.pop();
        pushStack.removeAllElements();
        Stack<T> swapStack = (Stack<T>) popStack.clone();
        while (swapStack.size() > 0) {
            T swapObj = swapStack.pop();
            pushStack.push(swapObj);
        }
        return poppedObj;
    }

    public int size(){
        return this.pushStack.size();
    }

    public String toString() {
        StringBuilder str = new StringBuilder();
        for (T obj : popStack) {
            str.append(obj.toString()).append(" ");
        }
        return "MyQueue{ " + str + " }";
    }
}
