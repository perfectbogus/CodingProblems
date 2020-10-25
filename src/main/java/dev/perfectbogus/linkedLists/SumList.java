package dev.perfectbogus.linkedLists;

import dev.perfectbogus.linkedLists.Partition.BookLinkedListNode;

public class SumList {

    public static void main(String[] args) {
        BookLinkedListNode aHeadList = new BookLinkedListNode(7);

        BookLinkedListNode aListB = new BookLinkedListNode(1);
        aHeadList.next = aListB;

        BookLinkedListNode aListC = new BookLinkedListNode(6);
        aListB.next = aListC;

        BookLinkedListNode bHeadList = new BookLinkedListNode(5);

        BookLinkedListNode bListB = new BookLinkedListNode(9);
        bHeadList.next = bListB;

        BookLinkedListNode bListC = new BookLinkedListNode(5);
        bListB.next = bListC;

        BookLinkedListNode result = addLists(aHeadList, bHeadList, 0);

    }

    public static BookLinkedListNode addLists(BookLinkedListNode aList, BookLinkedListNode bList, int carry) {
        if (aList == null && bList == null && carry == 0) {
            return null;
        }
        BookLinkedListNode result = new BookLinkedListNode();
        int value = carry;
        if (aList != null) {
            value += aList.data;
        }
        if (bList != null) {
            value += bList.data;
        }

        result.data = value % 10;

        if (aList != null || bList != null) {
            BookLinkedListNode more = addLists(aList == null ? null : aList.next, bList == null ? null : bList.next, value >= 10 ? 1 : 0);
            result.setNext(more);
        }
        return result;
    }

}
