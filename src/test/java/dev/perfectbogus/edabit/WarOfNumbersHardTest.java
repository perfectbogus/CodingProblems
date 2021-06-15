package dev.perfectbogus.edabit;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class WarOfNumbersHardTest {

    @Test
    public void warTest(){
        int[] data = {1 ,2 ,3 ,4};
        int rest = WarOfNumbersHard.anotherSolution(data);
        assertEquals(2, rest);
    }

}