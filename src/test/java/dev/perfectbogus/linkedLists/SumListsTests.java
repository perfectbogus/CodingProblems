package dev.perfectbogus.linkedLists;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import dev.perfectbogus.linkedLists.Partition.BookLinkedListNode;

public class SumListsTests {

    private BookLinkedListNode aList;
    private BookLinkedListNode bList;

    @BeforeEach
    public void setup() {
        aList = new BookLinkedListNode(7);
        BookLinkedListNode aListB = new BookLinkedListNode(1);
        aList.next = aListB;
        BookLinkedListNode aListC = new BookLinkedListNode(6);
        aListB.next = aListC;

        bList = new BookLinkedListNode(5);
        BookLinkedListNode bListB = new BookLinkedListNode(9);
        bList.next = bListB;
        BookLinkedListNode bListC = new BookLinkedListNode(2);
        bListB.next = bListC;
    }

    @Test
    public void testSumLists(){
        assertEquals("2 1 9 ", SumList.addLists(aList, bList, 0).toString());
    }
}
