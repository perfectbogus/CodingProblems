package dev.perfectbogus.linkedLists;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;

public class RemoveDuplicatesTests {

    @Test
    public void areDuplicates(){
        LinkedListNode list = new LinkedListNode();
        list.insert("hello");
        list.insert("world");
        list.insert("hello");
        RemoveDuplicates.removeDuplicates(list);

    }

    @Test
    public void areNotDuplicates(){

    }
}
