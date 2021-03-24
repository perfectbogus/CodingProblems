package dev.perfectbogus.exceptions;

import dev.perfectbogus.abstraction.calculus.Calculate;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculateExceptionTest {

    @Test
    void executeExceptionNested(){
        CalculateException c = new CalculateException(10);
        int result = c.add();
        System.out.println("result = "+result);
    }
}
