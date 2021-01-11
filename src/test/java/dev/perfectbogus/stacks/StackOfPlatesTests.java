package dev.perfectbogus.stacks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StackOfPlatesTests {

    private StackOfPlates<Integer> emptyStackOfPlates;
    private StackOfPlates<Integer> stackOfPlates;
    private StackOfPlates<Integer> fullStackOfPlates;

    @BeforeEach
    public void setup(){
        emptyStackOfPlates = new StackOfPlates<>(3);
        stackOfPlates = new StackOfPlates<>(3);
        fullStackOfPlates = new StackOfPlates<>(3);
    }

    @Test
    public void pushEmptySetOfPlates(){
        StackOfPlates<Integer> pushSet = new StackOfPlates<>(2);
        pushSet.push(1);
        assertEquals(0, pushSet.getIndexStack());
    }

    @Test
    public void pushFullSetOfPlates(){
        StackOfPlates<Integer> pushSet = new StackOfPlates<>(2);
        pushSet.push(1);
        pushSet.push(2);
        pushSet.push(3);
        System.out.printf(pushSet.toString());
        assertEquals(1, pushSet.getIndexStack());
    }

    @Test
    public void  pushAndPopSetOfPlates(){
        StackOfPlates<Integer> pushSet = new StackOfPlates<>(2);
        pushSet.push(1);
        pushSet.push(2);
        pushSet.push(3);
        assertEquals(1, pushSet.getIndexStack());
        pushSet.pop();
        assertEquals(0, pushSet.getIndexStack());
    }

    @Test
    public void PopEmptySetOfPlatesTest(){
        assertThrows(EmptyStackException.class, () -> emptyStackOfPlates.pop() );
    }

    @Test
    public void popOneElementOnLastStack(){
        stackOfPlates.push(1);
        stackOfPlates.push(2);
        stackOfPlates.push(3);
        stackOfPlates.push(4);
        assertEquals(Integer.valueOf(4), stackOfPlates.pop());
        assertEquals(0, stackOfPlates.getIndexStack());
    }

    @Test
    public void popLastElement(){
        fullStackOfPlates.push(1);
        fullStackOfPlates.push(2);
        fullStackOfPlates.push(3);
        assertEquals(Integer.valueOf(3), fullStackOfPlates.pop());
        assertEquals(0, fullStackOfPlates.getIndexStack());
    }
}
