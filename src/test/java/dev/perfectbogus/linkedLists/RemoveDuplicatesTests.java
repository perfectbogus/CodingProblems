package dev.perfectbogus.linkedLists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveDuplicatesTests {

    @Test
    public void areDuplicatesBuffer(){
        LinkedListNode list = new LinkedListNode();
        list.insert("hola");
        list.insert("world");
        list.insert("peace");
        list.insert("hola");
        list.insert("war");

        RemoveDuplicates.removeDuplicates(list);
        assertEquals(list.toString(), "[\"hola\", \"world\", \"peace\", \"war\"]");
    }

    @Test
    public void areDuplicatesNoBuffer(){
        LinkedListNode list = new LinkedListNode();
        list.insert("hola");
        list.insert("world");
        list.insert("peace");
        list.insert("hola");
        list.insert("war");

        RemoveDuplicates.deleteDuplicates(list);
        assertEquals(list.toString(), "[\"hola\", \"world\", \"peace\", \"war\"]");
    }

    @Test
    public void areNotDuplicatesBuffer(){
        LinkedListNode list = new LinkedListNode();
        list.insert("hola");
        list.insert("world");
        list.insert("peace");
        list.insert("war");

        RemoveDuplicates.removeDuplicates(list);
        assertEquals(list.toString(), "[\"hola\", \"world\", \"peace\", \"war\"]");
    }
}
