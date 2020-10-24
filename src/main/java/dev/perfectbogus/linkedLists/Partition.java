package dev.perfectbogus.linkedLists;

public class Partition {

    public static void main(String[] args){
        //3 -> 5 -> 8 5 -> 10 2 1[partition=5]
        BookLinkedListNode a = new BookLinkedListNode(3);

        BookLinkedListNode b = new BookLinkedListNode(5);
        a.next = b;

        BookLinkedListNode c = new BookLinkedListNode(8);
        b.next = c;

        BookLinkedListNode d = new BookLinkedListNode(5);
        c.next = d;

        BookLinkedListNode e = new BookLinkedListNode(10);
        d.next = e;

        BookLinkedListNode f = new BookLinkedListNode(2);
        e.next = f;

        BookLinkedListNode g = new BookLinkedListNode(1);
        f.next = g;

        printBookLinkedListNode(a);

        BookLinkedListNode result = partitions(a, 5);
        System.out.println();
        printBookLinkedListNode(result);

    }

    private static void printBookLinkedListNode(BookLinkedListNode node){
        BookLinkedListNode head = node;
        while( head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static BookLinkedListNode partitions(BookLinkedListNode node, int x){
        BookLinkedListNode head = node;
        BookLinkedListNode tail = node;

        while(node != null){
            BookLinkedListNode next = node.next;
            if(node.data < x){
                node.next = head;
                head = node;
            } else {
                tail.next = node;
                tail = node;
            }
            node = next;
        }
        tail.next = null;
        return head;
    }

    static class BookLinkedListNode {

        public int data;
        public BookLinkedListNode next;

        public BookLinkedListNode(int data){
            this.data = data;
            this.next = null;
        }

        public BookLinkedListNode(){
            this.next = null;
        }

        public BookLinkedListNode(int data, BookLinkedListNode next){
            this.data = data;
            this.next = next;
        }
    }
}
