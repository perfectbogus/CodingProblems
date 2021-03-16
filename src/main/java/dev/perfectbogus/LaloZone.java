package dev.perfectbogus;

import dev.perfectbogus.stacks.MyQueue;

import java.util.Iterator;
import java.util.Stack;

public class LaloZone {

    public static void main(String[] args) {

        MyQueue<Character> myQueue = new MyQueue<>();

        myQueue.push('A');
        myQueue.push('B');
        myQueue.push('C');

        myQueue.pop();
        myQueue.pop();

        Animal a = new Dog();
        a.eat();
    }

    static class Animal {
        void eat() {
            System.out.println("animal is eating...");
        }
    }

    static class Dog extends Animal {
        void eat() {
            System.out.println("dog is eating...");
        }
    }
}
