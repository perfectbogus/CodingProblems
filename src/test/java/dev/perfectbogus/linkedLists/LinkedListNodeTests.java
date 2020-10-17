package dev.perfectbogus.linkedLists;

import org.junit.jupiter.api.Test;

public class LinkedListNodeTests {

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
}
