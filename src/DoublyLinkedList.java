public class DoublyLinkedList {
private static class Node{
private int data;
private Node pre;
private Node next;

    public Node(int data, Node pre, Node next) {
        this.data = data;
        this.pre = pre;
        this.next = next;
    }

    public Node(int data) {
        this.data = data;
        this.pre=null;
        this.next=null;
    }
}
private int size=0;
private Node head=null;
private Node tail=null;
}
