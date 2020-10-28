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
        BookLinkedListNode resultInter = findIntersection(aList, bList);
        System.out.println(resultInter.toString());
    }

    public static BookLinkedListNode findIntersection(BookLinkedListNode aList, BookLinkedListNode bList) {
        if (aList == null || bList == null) return null;

        NodeStats resultA = getNodeStats(aList);
        NodeStats resultB = getNodeStats(bList);

        if (resultA.tail != resultB.tail) {
            return null;
        }

        BookLinkedListNode shorter = resultA.size < resultB.size ? aList : bList;
        BookLinkedListNode longer = resultA.size < resultB.size ? bList : aList;

        longer = getKthNode(longer, Math.abs(resultA.size - resultB.size));
        while (shorter != longer) {
            shorter = shorter.next;
            longer = longer.next;

        }

        return longer;
    }

    public static BookLinkedListNode getKthNode(BookLinkedListNode node, int kth) {
        BookLinkedListNode current = node;
        while (kth > 0 && current != null) {
            current = current.next;
            kth--;
        }
        return current;
    }

    public static NodeStats getNodeStats(BookLinkedListNode node) {
        if (node == null) return null;

        int size = 1;
        BookLinkedListNode current = node;
        while (current.next != null) {
            size++;
            current = current.next;
        }
        return new NodeStats(current, size);
    }

    static class NodeStats {
        public BookLinkedListNode tail;
        public int size;

        public NodeStats(BookLinkedListNode tail, int size) {
            this.tail = tail;
            this.size = size;
        }
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
