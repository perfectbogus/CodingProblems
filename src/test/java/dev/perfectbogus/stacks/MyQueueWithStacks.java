package dev.perfectbogus.stacks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyQueueWithStacks {

    private MyQueue<Character> pushQueue;
    private MyQueue<Character> popQueue;
    private MyQueue<Character> pushAndPopQueue;

    @BeforeEach
    public void setup(){
        this.pushQueue = new MyQueue<>();
        this.popQueue = new MyQueue<>();
        this.pushAndPopQueue = new MyQueue<>();
    }

    @Test
    public void pushQueue(){
        pushQueue.push('A');
        assertEquals(1, pushQueue.size());
    }

    @Test
    public void popQueue(){
        popQueue.push('A');
        Character data = popQueue.pop();
        assertEquals(0, popQueue.size());
        assertEquals(Character.valueOf('A'), data);
    }

    @Test
    public void pushAndPopQueue(){
        pushAndPopQueue.push('A');
        pushAndPopQueue.push('B');
        assertEquals(2, pushAndPopQueue.size());
        Character data = pushAndPopQueue.pop();
        assertEquals(Character.valueOf('A'), data);
        assertEquals(1, pushAndPopQueue.size());
    }

}
