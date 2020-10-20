package dev.perfectbogus.linkedLists;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KthtoLastTests {

    private static LinkedListNode list;
    private String resultStr;

    @BeforeEach
    public void setup(){
        list = new LinkedListNode();
        list.insert("hola");
        list.insert("world");
        list.insert("peace");
        list.insert("hola");
        list.insert("war");

        resultStr = "[\"peace\", \"hola\", \"war\"]";
    }

    @Test
    public void testValidCaseIterative(){
        LinkedListNode result = KthtoLast.getKthtoLastElement(list, 3);
        assertEquals(result.toString(), resultStr);
    }

    @Test
    public void testNoValidCaseIterative(){
        LinkedListNode result = KthtoLast.getKthtoLastElement(list, 6);
        assertEquals(result.toString(), "[]");
    }

    @Test
    public void testValidCaseRecursive(){
        LinkedListNode result = KthtoLast.getKthtoLastElementRecursive(list, 3);
        assertEquals(result.toString(), resultStr);
    }

    @Test
    public void testNoValidCaseRecursive(){
        LinkedListNode result = KthtoLast.getKthtoLastElementRecursive(list, 6);
        assertEquals(result.toString(), "[]");
    }
}
