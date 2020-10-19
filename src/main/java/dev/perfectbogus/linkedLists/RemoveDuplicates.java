package dev.perfectbogus.linkedLists;

import java.util.HashSet;

public class RemoveDuplicates {

    public static void main(String[] args) {
        LinkedListNode list = new LinkedListNode();
        list.insert("hola");
        list.insert("world");
        list.insert("peace");
        list.insert("hola");
        list.insert("war");

        System.out.println(list.toString());
        deleteDuplicates(list);
        System.out.println(list.toString());
    }

    /**
     * Remove Duplicates:
     * Write Code to remove duplicates from an unsorted linked list.
     * <p>
     * Follow up:
     * How would you solve this problem if a temporary buffer is not allowed.
     * <p>
     * Assumptions:
     * Remove all concurrences or only the first appear
     * Solution with Buffer.
     */
    public static void removeDuplicates(LinkedListNode list) {
        HashSet<String> set = new HashSet<>();
        Node currentNode = list.getHead();
        Node previous = new Node();
        while (currentNode != null) {
            if (set.contains(currentNode.getData())) {
                // Delete node
                previous.setNext(currentNode.getNext());
            } else {
                set.add(currentNode.getData());
            }
            // keep the following of the previous node
            previous = currentNode;
            currentNode = currentNode.getNext();
        }

    }

    /**
     * Solution without buffer
     */
    public static void deleteDuplicates(LinkedListNode list) {
        Node currentNode = list.getHead();
        while (currentNode != null) {
            Node racer = currentNode;
            while (racer.getNext() != null) {
                if (currentNode.getData().equals(racer.getNext().getData())) {
                    racer.setNext(racer.getNext().getNext());
                } else {
                    racer = racer.getNext();
                }
            }
            currentNode = currentNode.getNext();
        }
    }

}
