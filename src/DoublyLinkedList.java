class Node {
    int data;
    Node next;
    Node previous;
}
public class DoublyLinkedList{
Node head;
int size;

    public static void main(String[] args) {
DoublyLinkedList obj=new DoublyLinkedList();
        for (int i = 0; i < 10; i++) {
            Node node=new Node();
            node.data=(i+1)*100;
            obj.insert(node);
            
        }
        obj.display();
        obj.delete();
    }
    void insert (Node node){
        System.out.println("inserting Node" + node.data +"atlast");
        if(head==null){
            head=node;
        }
        else{
            Node temp=head;
            while (temp.next!=null){

            }
        }
    }
}