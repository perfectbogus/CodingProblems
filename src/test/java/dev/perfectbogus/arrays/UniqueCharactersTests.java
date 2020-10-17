package dev.perfectbogus.arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UniqueCharactersTests {

    @Test
    public void testRepeatedChar(){
        char[] str = {'h', 'e', 'l', 'l', 'o'};
        assertFalse(UniqueCharacters.isUniqueCharacters(str));
        String aux = new String(str);
        assertFalse(UniqueCharacters.isUniqueChar(aux));
    }

    @Test
    public void testNoRepeatedChar() {
        char[] str = {'f', 'a', 's', 't'};
        assertTrue(UniqueCharacters.isUniqueCharacters(str));
        String aux = new String(str);
        assertTrue(UniqueCharacters.isUniqueChar(aux));
    }

    @Test
    public void testSpaceChar(){
        char[] str = {'y', 'o', 'u', ' ', 'a', 'r', 'e', ' ', 'f', 'i', 'n', 'e'};
        assertFalse(UniqueCharacters.isUniqueCharacters(str));
        String aux = new String(str);
        assertFalse(UniqueCharacters.isUniqueChar(aux));
    }


}
