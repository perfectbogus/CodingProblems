package dev.perfectbogus.edabit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PerfectNumberTest {

    @Test
    public void test(){
        assertTrue(PerfectNumber.checkPerfect(6));
    }

    @Test
    public void test2(){
        assertTrue(PerfectNumber.checkPerfect(28));
    }
}