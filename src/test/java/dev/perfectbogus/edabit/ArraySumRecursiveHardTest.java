package dev.perfectbogus.edabit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArraySumRecursiveHardTest {

    @Test
    public void exampleTest(){
        int[] arr = {1, 2, 3, 4};

        int rest = ArraySumRecursiveHard.sum(arr);
        assertEquals(10, rest);
    }

    @Test
    public void exampleTest2(){
        int[] arr = {};
        int rest = ArraySumRecursiveHard.sum(arr);
        assertEquals(0, rest);
    }

    @Test
    public void oneElementTest(){
        int[] arr = {1};
        int rest = ArraySumRecursiveHard.sum(arr);
        assertEquals(1,rest);
    }

}