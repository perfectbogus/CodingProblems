package dev.perfectbogus.linkedLists;

import dev.perfectbogus.linkedLists.Partition.BookLinkedListNode;

import java.util.Stack;

public class Palindrome {

    public static void main(String[] args) {
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

        //System.out.println(isPalindrome(aList));
        //System.out.println(isAnotherPalindrome(aList));
        System.out.println(isPalindromeWrapper(aList));
    }

    public static boolean isAnotherPalindrome(BookLinkedListNode head) {
        BookLinkedListNode fast = head;
        BookLinkedListNode slow = head;

        Stack<Integer> stack = new Stack<>();
        while (fast != null && fast.next != null) {
            stack.push(slow.data);
            slow = slow.next;
            fast = fast.next.next;
        }

        if (fast != null) {
            slow = slow.next;
        }

        while (slow != null) {
            int top = stack.pop();
            if (top != slow.data) {
                return false;
            }
            slow = slow.next;
        }
        return true;
    }

    //Just to create the recursive algorithm is needed create this
    //intermediate class in order to keep the information between call on call.
    static class Result {
        BookLinkedListNode node;
        boolean result;

        public Result(BookLinkedListNode node, boolean result) {
            this.node = node;
            this.result = result;
        }
    }

    public static boolean isPalindromeWrapper(BookLinkedListNode head) {
        int length = lengthOfList(head);
        Result p = isPalindromeRecursive(head, length);
        return p.result;
    }

    public static Result isPalindromeRecursive(BookLinkedListNode head, int length) {
        if (head == null || length <= 0) {
            return new Result(head, true);
        } else if (length == 1) {// odd size of the list
            return new Result(head.next, true);
        }
        Result res = isPalindromeRecursive(head.next, length - 2);

        if (!res.result || res.node == null) {
            return res;
        }

        res.result = (head.data == res.node.data);

        res.node = res.node.next;

        return res;
    }

    public static int lengthOfList(BookLinkedListNode node) {
        int size = 0;
        while (node != null) {
            node = node.next;
            size++;
        }
        return size;
    }

    public static boolean isPalindrome(BookLinkedListNode head) {
        BookLinkedListNode reversed = reverseAndClone(head);
        return isEqual(head, reversed);
    }

    public static BookLinkedListNode reverseAndClone(BookLinkedListNode node) {
        BookLinkedListNode head = null;
        while (node != null) {
            BookLinkedListNode n = new BookLinkedListNode(node.data);
            n.next = head;
            head = n;
            node = node.next;
        }
        return head;
    }

    public static boolean isEqual(BookLinkedListNode one, BookLinkedListNode two) {
        while (one != null && two != null) {
            if (one.data != two.data) {
                return false;
            }
            one = one.next;
            two = two.next;
        }
        return one == null && two == null;
    }
}
