package dev.perfectbogus.exceptions;

import org.junit.jupiter.api.Test;


public class CalculateExceptionTest {

    @Test
    void executeExceptionNested(){
        CalculateException c = new CalculateException(10);
        int result = c.add();
        System.out.println("result = "+result);
    }
}
