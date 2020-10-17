package dev.perfectbogus.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PermutationTests {

    @Test
    public void testPermutation(){
        assertTrue(CheckPermutation.isPermutations("dog", "god"));
        assertTrue(CheckPermutation.isPermutationsN("dog", "god"));
    }

    @Test
    public void testNoPermutationDiffSize(){
        assertFalse(CheckPermutation.isPermutations("asdf","asdfg"));
        assertFalse(CheckPermutation.isPermutationsN("asdf","asdfg"));
    }

    @Test
    public void testNoPermutationSameSize(){
        assertFalse(CheckPermutation.isPermutations("dog", "por"));
        assertFalse(CheckPermutation.isPermutationsN("dog", "por"));
    }

    @Test
    public void testSpacePermutation(){
        assertTrue(CheckPermutation.isPermutations(" a", "a "));
        assertTrue(CheckPermutation.isPermutationsN(" a", "a "));
    }
}
