package dev.perfectbogus.linkedLists;

public class Node {

    private String data;
    private Node next;

    public Node(){
        this.data = null;
        this.next = null;
    }

    public Node(String data){
        this.data = data;
        this.next = null;
    }

    public String getData(){
        return this.data;
    }

    public Node getNext(){
        return this.next;
    }

    public void setNext(Node next){
        this.next = next;
    }

    public String toString(){
        return "[ " + this.data + " ]";
    }
}
