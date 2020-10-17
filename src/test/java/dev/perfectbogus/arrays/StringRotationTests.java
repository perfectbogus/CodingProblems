package dev.perfectbogus.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class StringRotationTests {

    @Test
    public void isStringRotation(){
        String a = "waterbottle";
        String b = "erbottlewat";

        assertTrue(StringRotation.isRotated(a,b));
    }

    @Test
    public void NoStringRotation(){
        String a = "nomatter";
        String b = "spa";

        assertFalse(StringRotation.isRotated(a,b));
    }
}
