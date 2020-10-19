package dev.perfectbogus.linkedLists;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KthtoLastTests {

    private LinkedListNode list;

    @BeforeAll
    public void fillTheList(){
        list = new LinkedListNode();
        list.insert("hola");
        list.insert("world");
        list.insert("peace");
        list.insert("hola");
        list.insert("war");
    }

    @Test
    public void testValidCaseIterative(){
        LinkedListNode result = KthtoLast.getKthtoLastElement(list, 3);
        assertEquals(result.toString(), "[\"peace\", \"hola\", \"war\"]");
    }

    @Test
    public void testNoValidCaseIterative(){
        LinkedListNode result = KthtoLast.getKthtoLastElement(list, 6);
        assertEquals(result.toString(), "[]");
    }

}
