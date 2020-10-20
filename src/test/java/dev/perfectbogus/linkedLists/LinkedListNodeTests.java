package dev.perfectbogus.linkedLists;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinkedListNodeTests {

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
    public void testInsert(){
        LinkedListNode list = new LinkedListNode();

        list.insert("hola");
        list.insert("world");

        System.out.println(list.toString());

        list.remove("hola");

        System.out.println(list.toString());

        list.remove("world");
        System.out.println(list.toString());
    }

    @Test
    public void testSizeLinkedList(){
        LinkedListNode list = new LinkedListNode();
        assertEquals(list.getSize(), 0);

        list.insert("hola");
        assertEquals(list.getSize(), 1 );

        list.insert("world");
        assertEquals(list.getSize(), 2);

        list.remove("hola");
        assertEquals(list.getSize(), 1);
    }

    @Test
    public void testGetKthElement(){
        Node element = list.getNthElement(2);
        assertEquals(element.getData(), "world");
    }
}
