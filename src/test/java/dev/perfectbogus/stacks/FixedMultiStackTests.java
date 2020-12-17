package dev.perfectbogus.stacks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class FixedMultiStackTests {

    private FixedMultiStack fms;
    private FixedMultiStack emptyStack;

    @BeforeEach
    public void setup() throws FullStackException {
        emptyStack = new FixedMultiStack(1);
        fms = new FixedMultiStack(3);
        fms.push(0, 001);
        fms.push(0, 002);
        fms.push(0, 003);
        fms.push(1, 101);
        fms.push(1, 102);
        fms.push(1, 103);
        fms.push(2, 201);
        fms.push(2, 202);
        fms.push(2, 203);
    }

    @Test
    public void PushFullTest() throws FullStackException {
        assertThrows(FullStackException.class, () -> fms.push(1, 104));
    }

    @Test
    public void PopEmptyStackTest() throws EmptyStackException {
        assertThrows(EmptyStackException.class, () -> emptyStack.pop(1));
    }

    @Test
    public void PeekEmptyStackTest() throws EmptyStackException {
        assertThrows(EmptyStackException.class, () -> emptyStack.peek(1));
    }
}
