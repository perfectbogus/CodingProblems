package dev.perfectbogus.abstraction;

import dev.perfectbogus.abstraction.calculus.Calculate;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculateTest {

    @Test
    void notAllowedInstanciate(){
        //We cannot instantiate any abstract class
        //this is not allowed -> Calculate cal = new Calculate();
    }

    @Test
    void exampleBaeldung(){
        // Here we are implementing calculate abstract class
        Calculate resultCalculate = new Calculate(){
            @Override
            public int multiply(int a, int b)
            {
                return a*b;
            }
        };

        int result = resultCalculate.multiply(1,3);
        assertEquals(3,result, "Should be allowed");
    }


}
