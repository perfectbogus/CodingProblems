package dev.perfectbogus.linkedLists;

public class KthtoLast {

    public static void main(String[] args) {
        LinkedListNode list = new LinkedListNode();
        list.insert("hola");
        list.insert("world");
        list.insert("peace");
        list.insert("hola");
        list.insert("war");

        System.out.println(list.toString());
        LinkedListNode kthElement = getKthtoLastElement(list, 3);
        System.out.println(kthElement.toString());

        LinkedListNode kthElementRecursive = getKthtoLastElementRecursive(list, 6);
        System.out.println(kthElementRecursive.toString());

    }

    /**
     * Return Kth to Last: Implement an algorithm to find the kth to last element of
     * a singly linked list
     * <p>
     * Solution: Size is known.
     */
    public static LinkedListNode getKthtoLastElement(LinkedListNode list, int kthElement) {
        if (kthElement < list.getSize() && kthElement >= 1 && list.getSize() >= 1) {
            Node current = list.getHead();
            int i = 0;
            while (current != null) {
                i++;
                if (kthElement == i) {
                    return new LinkedListNode(current);
                }
                current = current.getNext();
            }
        }
        return new LinkedListNode();
    }

    public static LinkedListNode getKthtoLastElementRecursive(LinkedListNode list, int kthElement) {
        Node current = list.getHead();
        if (current == null) {
            return new LinkedListNode();
        } else {
            kthElement--;
            if ( kthElement == 0) {
                return new LinkedListNode(current);
            } else {
                return getKthtoLastElementRecursive(new LinkedListNode(current.getNext()), kthElement);
            }
        }
    }
}
