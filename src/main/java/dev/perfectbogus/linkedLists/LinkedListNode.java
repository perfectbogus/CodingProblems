package dev.perfectbogus.linkedLists;

public class LinkedListNode {

    private Node head;

    public LinkedListNode() {
        this.head = null;
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
    }

    public void remove(String key) {
        Node currentNode = this.head;
        Node previous = null;

        //Case A: the kay is in the head node
        if (currentNode != null && currentNode.getData().equals(key)) {
            this.head = currentNode.getNext();
        } else {
            //Case B: the key is somewhere else
            while (currentNode != null && !currentNode.getData().equals(key)) {
                previous = currentNode;
                currentNode = currentNode.getNext();
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
            auxStr = auxStr.delete(auxStr.length() - 2, auxStr.length());
        }
        auxStr.append("]");
        return auxStr.toString();
    }
}
