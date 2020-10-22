package dev.perfectbogus.linkedLists;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class DeleteMiddleNodeTests {

    private LinkedListNode list;

    @BeforeEach
    public void setup(){
        list = new LinkedListNode();
        list.insert("hola");
        list.insert("world");
        list.insert("peace");
        list.insert("hola");
        list.insert("war");
    }

    @Test void testGetNthNode(){
        Node result = list.getNthElement(2);
        assertEquals(result.getData(), "world");
    }

    @Test void testGetNthNodeInvalid(){
        Node result = list.getNthElement(6);
        assertNull(result.getData());
        assertNull(result.getNext());
    }

    @Test
    public void deleteMiddleNodeValid(){
        Node middleNode = list.getNthElement(4);
        list.deleteMiddleNode(middleNode);
        assertEquals("[\"hola\", \"world\", \"peace\", \"war\"]", list.toString());
    }

    @Test
    public void deleteMiddleNodeStart(){
        Node middleNode = list.getNthElement(1);
        list.deleteMiddleNode(middleNode);
        assertEquals("[\"world\", \"peace\", \"hola\", \"war\"]", list.toString());
    }

    @Test
    public void deleteMiddleNodeEnd(){
        list.deleteMiddleNode(list.getNthElement(5));
        assertEquals("[\"hola\", \"world\", \"peace\", \"hola\"]", list.toString());
    }
}
