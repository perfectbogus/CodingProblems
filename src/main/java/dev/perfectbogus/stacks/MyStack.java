package dev.perfectbogus.stacks;

import java.util.EmptyStackException;

public class MyStack<T> {

    private static class StackNode<T> {
        private T data;
        private StackNode<T> next;

        public StackNode(T data) {
            this.data = data;
        }
    }

    private StackNode<T> top;

    public T pop() {
        if (top == null) throw new EmptyStackException();
        T item = top.data;
        top = top.next;
        return item;
    }

    public void push(T item) {
        StackNode<T> t = new StackNode<T>(item);
        t.next = top;
        top = t;
    }

    public T peek() {
        if (top == null) throw new EmptyStackException();
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    @Override
    public String toString() {
        StringBuilder aux = new StringBuilder();
        StackNode<T> loop = top;
        while (loop != null) {
            aux.append(top.data.toString()).append("\n");
            loop = loop.next;
        }
        return "MyStack{" +
                aux.toString() +
                '}';
    }
}