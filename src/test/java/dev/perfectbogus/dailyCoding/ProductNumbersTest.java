package dev.perfectbogus.dailyCoding;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductNumbersTest {

    @Test
    public void exampleTest(){
        /**
         * [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24].
         */

        int[] input = { 1, 2, 3, 4, 5};
        int[] output = {120, 60, 40, 30, 24};

        int[] res = ProductNumbers.nonDivisionSolution(input);
        assertArrayEquals(output, res);

        int[] r = ProductNumbers.divisionSolution(input);
        assertArrayEquals(output, r);
    }

    @Test
    public void example2Test(){
        /**
         *  input was [3, 2, 1], the expected output would be [2, 3, 6].
         */
        int[] input = {3, 2, 1};
        int[] output = {2 , 3, 6};

        int[] res = ProductNumbers.nonDivisionSolution(input);
        assertArrayEquals(output, res);

        int[] r = ProductNumbers.divisionSolution(input);
        assertArrayEquals(output, r);
    }
}