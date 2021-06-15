package dev.perfectbogus.dailyCoding.NumbersOnList;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NumbersOnListTest {

    @Test
    public void trueListNumberTest(){
        int k = 17;
        List<Integer> list = Arrays.asList(10, 15, 3, 7);

        boolean res = NumbersOnList.simpleSolution(k, list);
        assertTrue(res);
    }

    @Test
    public void nonNumberOnListTest(){
        int k = 9;
        List<Integer> list = Arrays.asList(10, 15, 3, 7);

        boolean res = NumbersOnList.simpleSolution(k, list);
        assertFalse(res);
    }

    @Test
    public void emptyList(){
        int k = 1;
        List<Integer> list = Arrays.asList();

        boolean res = NumbersOnList.simpleSolution(k, list);
        assertFalse(res);
    }

}