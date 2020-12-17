package dev.perfectbogus.linkedLists;

import dev.perfectbogus.linkedLists.Partition.BookLinkedListNode;

public class LoopDetection {

    public static void main(String[] args) {
        BookLinkedListNode aList = new BookLinkedListNode(0);
        BookLinkedListNode aListB = new BookLinkedListNode(1);
        aList.next = aListB;
        BookLinkedListNode aListC = new BookLinkedListNode(2);
        aListB.next = aListC;
        BookLinkedListNode aListD = new BookLinkedListNode(3);
        aListC.next = aListD;
        BookLinkedListNode aListE = new BookLinkedListNode(4);
        aListD.next = aListE;
        aListE.next = aListC;

        System.out.println(loopDetection(aList).toString());
    }

    public static BookLinkedListNode loopDetection(BookLinkedListNode head) {
        BookLinkedListNode slow = head;
        BookLinkedListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                break;
            }
        }

        if (fast == null || fast.next == null) {
            return null;
        }

        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        return fast;
    }
}
