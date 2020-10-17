package dev.perfectbogus.linkedLists;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;

public class RemoveDuplicatesTests {

    @Test
    public void areDuplicates(){
        LinkedList<String> data = new LinkedList();
        data.add("hello");
        data.add("world");
        data.add("hello");
        RemoveDuplicates.removeDuplicates(data);

    }

    @Test
    public void areNotDuplicates(){

    }
}
