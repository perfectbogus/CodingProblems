package dev.perfectbogus.stacks;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;
import java.util.Stack;

public class StackOfPlates<T> {

    private List<Stack> setOfStacks;
    private int stackCapacity;
    private int indexStack;

    public StackOfPlates(int stackCapacity) {
        this.stackCapacity = stackCapacity;
        indexStack = 0;
        Stack<T> firstStack = new Stack<>();
        setOfStacks = new ArrayList<>();
        setOfStacks.add(firstStack);
    }

    public void push(T obj) {
        Stack mainStack = setOfStacks.get(indexStack);
        if (mainStack.size() == stackCapacity) {
            Stack<T> newStack = new Stack<>();
            indexStack++;
            newStack.push(obj);
            setOfStacks.add(newStack);
        } else {
            Stack currentStack = setOfStacks.get(indexStack);
            currentStack.push(obj);
        }
    }

    public T pop() {
        if (this.isEmpty()) throw new EmptyStackException();
        Stack currentStack = setOfStacks.get(indexStack);
        T obj;
        if (currentStack.size() == 1 && indexStack > 0) {
            obj = (T) currentStack.pop();
            setOfStacks.remove(indexStack);
            indexStack--;
            return obj;
        } else {
            obj = (T) currentStack.pop();
            return obj;
        }
    }

    private boolean isEmpty() {
        return indexStack == 0 && setOfStacks.get(indexStack).isEmpty();
    }

    public int getIndexStack(){
        return indexStack;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for(List<Stack> e: setOfStacks){
            str.append(e.toString());
        }
        return "StackOfPlates{" +
                " stackCapacity= " + stackCapacity +
                ", indexStack= " + indexStack +
                ", Data: { " + str + " }" +
                " }\n";
    }
}
