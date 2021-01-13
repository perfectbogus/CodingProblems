package dev.perfectbogus;

import dev.perfectbogus.stacks.MyQueue;

import java.util.Iterator;
import java.util.Stack;

public class LaloZone {

    public static void main(String []args){

        MyQueue<Character> myQueue = new MyQueue<>();

        myQueue.push('A');
        myQueue.push('B');
        myQueue.push('C');

        myQueue.pop();
        myQueue.pop();


    }
}
