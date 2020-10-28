package dev.perfectbogus.linkedLists;

import dev.perfectbogus.linkedLists.Partition.BookLinkedListNode;

public class Intersection {

    public static void main(String[] args) {
        BookLinkedListNode aList = new BookLinkedListNode(0);
        BookLinkedListNode aListB = new BookLinkedListNode(1);
        aList.next = aListB;
        BookLinkedListNode aListC = new BookLinkedListNode(2);
        aListB.next = aListC;
        BookLinkedListNode aListD = new BookLinkedListNode(1);
        aListC.next = aListD;
        BookLinkedListNode aListE = new BookLinkedListNode(0);
        aListD.next = aListE;

        BookLinkedListNode bList = new BookLinkedListNode(10, new BookLinkedListNode(11, new BookLinkedListNode(12, aListD)));

        BookLinkedListNode result = intersection(aList, bList);
        System.out.println(result.toString());
    }


    /**
     * My Solution
     * Bubble Sort Approach
     *
     * @param aList
     * @param bList
     * @return
     */
    public static BookLinkedListNode intersection(BookLinkedListNode aList, BookLinkedListNode bList) {
        BookLinkedListNode outerList = aList;

        while (outerList != null) {
            BookLinkedListNode innerList = bList;
            while (innerList != null) {
                if (innerList == outerList) {
                    return outerList;
                } else {
                    innerList = innerList.next;
                }
            }
            outerList = outerList.next;
        }
        return null;
    }
}
