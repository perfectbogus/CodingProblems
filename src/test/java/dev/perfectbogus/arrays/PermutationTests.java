package dev.perfectbogus.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PermutationTests {

    @Test
    public void testPermutation(){
        assertTrue(CheckPermutation.isPermutations("dog", "god"));
    }

    @Test
    public void testNoPermutationDiffSize(){
        assertFalse(CheckPermutation.isPermutations("asdf","asdfg"));
    }

    @Test
    public void testNoPermutationSameSize(){
        assertFalse(CheckPermutation.isPermutations("dog", "por"));
    }

    @Test
    public void testSpacePermutation(){
        assertTrue(CheckPermutation.isPermutations(" a", "a "));
    }
}
