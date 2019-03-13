public class CircularLinkedList {
int size=0;
Node head=null;
Node tail=null;
class Node{
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
public void print(){
Node temp=head;
do{
    System.out.println(" "+ temp.data);
    temp=temp.next;
}
while(temp!=head);
        System.out.println("");
    }
public void addNodeToHead(int data){
        Node n=new Node(data);

}
}
}
