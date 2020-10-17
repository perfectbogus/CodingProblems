package dev.perfectbogus.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ZeroMatrixTests {

    @Test
    public void ZeroMatrix(){
        int[][] matrixBefore = { {1, 2, 3}, {4, 0, 6}, {7, 8, 9} };
        int[][] matrixAfter = { {1, 0, 3}, {0, 0, 0}, {7, 0, 9} };
        ZeroMatrix.Zeros(matrixBefore);
        assertArrayEquals(matrixBefore, matrixAfter);
    }

}
