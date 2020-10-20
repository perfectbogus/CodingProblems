package dev.perfectbogus.linkedLists;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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

    @Test
    public void deleteMiddleNodeValid(){

    }
}
