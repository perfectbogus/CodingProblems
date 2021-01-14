package dev.perfectbogus.stacks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


import java.util.Stack;

public class SortStackTests {

    @Test
    public void sortTest(){
        Stack<Integer> myStack = new Stack<>();

        myStack.push(5);
        myStack.push(30);
        myStack.push(10);
        myStack.push(18);
        myStack.push(3);

        SortStack.sort(myStack);
        int peekData = myStack.pop()    ;
        while (!myStack.isEmpty()){
            int nextData = myStack.pop();
            assertEquals(true, peekData < nextData);
            peekData = nextData;
        }
    }

    @Test
    public void bookSolution(){
        Stack<Integer> myStack = new Stack<>();

        myStack.push(5);
        myStack.push(30);
        myStack.push(10);
        myStack.push(18);
        myStack.push(3);

        SortStack.sorting(myStack);
    }
}
