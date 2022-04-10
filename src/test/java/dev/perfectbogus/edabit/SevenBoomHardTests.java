package dev.perfectbogus.edabit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SevenBoomHardTests {

    @Test
    public void noSevenOnArrayTest(){
        int[] data = {1, 3 ,4};

        final String result = SevenBoomHard.isBoom(data);
        assertEquals("there is no 7 in the array", result);
    }

    @Test
    public void sevenInTheArray(){
        int[] data = {1, 5, 7, 0};
        final String result = SevenBoomHard.isBoom(data);
        assertEquals("Boom!", result);
    }

    @Test
    public void sevenInTheArrayComposed(){
        int[] data = {1, 17, 2, 4};
        final String result = SevenBoomHard.isBoom(data);
        assertEquals("Boom!", result);
    }

    @Test
    public void newSyntaxArray(){
        assertEquals("Boom!", SevenBoomHard.isBoom(new int[]{1, 7 , 6}));
    }

    @Test
    public void test1() {
        assertEquals("Boom!", SevenBoomHard.isBoom(new int[]{2, 6, 7, 9, 3}));
    }

    @Test
    public void test2() {
        assertEquals("there is no 7 in the array", SevenBoomHard.isBoom(new int[]{33, 68, 400, 5}));
    }

    @Test
    public void test3() {
        assertEquals("there is no 7 in the array", SevenBoomHard.isBoom(new int[]{86, 48, 100, 66}));
    }

    @Test
    public void test4() {
        assertEquals("Boom!", SevenBoomHard.isBoom(new int[]{76, 55, 44, 32}));
    }

    @Test
    public void test5() {
        assertEquals("Boom!", SevenBoomHard.isBoom(new int[]{35, 4, 9, 37}));
    }
}
