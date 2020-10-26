package dev.perfectbogus.linkedLists;

import dev.perfectbogus.linkedLists.Partition.BookLinkedListNode;

import java.util.Stack;

public class Palindrome {

    public static void main(String[] args){
        BookLinkedListNode aList;

        aList = new BookLinkedListNode(0);
        BookLinkedListNode aListB = new BookLinkedListNode(1);
        aList.next = aListB;
        BookLinkedListNode aListC = new BookLinkedListNode(2);
        aListB.next = aListC;
        BookLinkedListNode aListD = new BookLinkedListNode(1);
        aListC.next = aListD;
        BookLinkedListNode aListE = new BookLinkedListNode(0);
        aListD.next = aListE;

        System.out.println(isPalindrome(aList));
    }

    public static boolean isAnotherPalindrome(BookLinkedListNode head){
        BookLinkedListNode fast = head;
        BookLinkedListNode slow = head;

        Stack<Integer> stack = new Stack<>();
        while (fast != null && fast.next != null){
            stack.push(slow.data);
            slow = slow.next;
            fast = fast.next.next;
        }

        if (fast != null){
            slow = slow.next;
        }

        while (slow != null){
            int top = stack.pop().intValue();
            if (top != slow.data){
                return false;
            }
            slow = slow.next;
        }
        return true;
    }


    public static boolean isPalindrome(BookLinkedListNode head){
        BookLinkedListNode reversed = reverseAndClone(head);
        return isEqual(head, reversed);
    }

    public static BookLinkedListNode reverseAndClone(BookLinkedListNode node){
        BookLinkedListNode head = null;
        while (node != null ) {
            BookLinkedListNode n = new BookLinkedListNode(node.data);
            n.next = head;
            head = n;
            node = node.next;
        }
        return head;
    }

    public static boolean isEqual(BookLinkedListNode one, BookLinkedListNode two){
        while (one != null && two != null ){
            if ( one.data != two.data ){
                return false;
            }
            one = one.next;
            two = two.next;
        }
        return one == null && two == null;
    }
}
