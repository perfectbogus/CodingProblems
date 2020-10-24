package dev.perfectbogus.linkedLists;

public class LinkedListNode {

    private Node head;
    private int size;

    public LinkedListNode() {
        this.head = null;
        this.size = 0;
    }

    public LinkedListNode(Node head){
        if(head == null){
            new NullPointerException();
        } else {
            this.head = head;
            Node current = head;
            while(current != null){
                current = current.getNext();
                this.size++;
            }
        }
    }

    /**
     * TODO: Create another way to nullify this node
     * Bug: Due to I am using a value instead of reference,
     * I cannot nullify the node on this way
      */
    public void deleteMiddleNode(Node middleNode){
        Node nextNode = middleNode.getNext();
        if(nextNode == null){
            //Here cannot be null due to it is passing value and not reference
            middleNode.setNext(null);
            middleNode.setData(null);
            middleNode = null;
        } else {
            middleNode.setData(nextNode.getData());
            middleNode.setNext(nextNode.getNext());
        }
        this.size--;
    }

    public Node getNthElement(int kthElement){
        if(kthElement >= 1 && kthElement <= this.size ){
            Node currentNode = this.head;
            while(currentNode != null){
                kthElement--;
                if(kthElement == 0){
                    return currentNode;
                } else {
                    currentNode = currentNode.getNext();
                }
            }
        }
        return new Node();
    }

    public int getSize(){
        return this.size;
    }

    public Node getHead(){
        return this.head;
    }

    public void insert(String data) {
        Node newNode = new Node(data);
        if (this.head == null) {
            this.head = newNode;
        } else {
            Node last = this.head;
            while (last.getNext() != null) {
                last = last.getNext();
            }
            last.setNext(newNode);
        }
        this.size++;
    }

    public void remove(String key) {
        Node currentNode = this.head;
        Node previous = null;

        //Case A: the kay is in the head node
        if (currentNode != null && currentNode.getData().equals(key)) {
            this.head = currentNode.getNext();
            this.size--;
        } else {
            //Case B: the key is somewhere else
            while (currentNode != null && !currentNode.getData().equals(key)) {
                previous = currentNode;
                currentNode = currentNode.getNext();
                this.size--;
            }
            if (currentNode == null) {
                previous.setNext(currentNode.getNext());
            }
        }
    }

    public String toString() {
        StringBuilder auxStr = new StringBuilder("[");
        Node auxNode = this.head;
        while (auxNode != null) {
            auxStr.append("\"").append(auxNode.getData()).append("\", ");
            auxNode = auxNode.getNext();
        }
        if (auxStr.length() > 1) {
            auxStr.delete(auxStr.length() - 2, auxStr.length());
        }
        auxStr.append("]");
        return auxStr.toString();
    }
}
