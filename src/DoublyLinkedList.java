class Node {
    int data;
    Node next;
    Node previous;
}
public class DoublyLinkedList {
    Node head;
    int size;

    public static void main(String[] args) {
        DoublyLinkedList obj = new DoublyLinkedList();
        for (int i = 0; i < 10; i++) {
            Node node = new Node();
            node.data = (i + 1) * 100;
            obj.insert(node);

        }
        obj.display();
        obj.delete();
    }

    void insert(Node node) {
        System.out.println("inserting Node" + node.data + "atlast");
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            node.previous = temp;
            temp.next = node;
        }
    }//end of insert metho

    void display() {
        System.out.println("Doubly LinkedList");
        Node temp = head;
        System.out.println("null <-->");
        while (temp != null) {
            System.out.println(temp.data + "<-->");
            temp = temp.next;

        }
        System.out.println("null");
    }
    //end of display method in doubly linked list

    void delete() {
        if (head == null) {
            System.out.println("empty list");
        } else {

            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            System.out.println("deleting node" + temp.data + "from last");
            temp = temp.previous;
            temp.next = null;
        }
    }
        boolean search (Node node){
            boolean response = false;
            Node temp = head;
            while (temp != null) {
                if (temp.data == node.data) {
                    response = true;
                    break;
                }
                temp = temp.next;
            }
            return response;
        }
        void insertAtBegineer(Node node){
            System.out.println("inserting node " + node.data + "at begineer");
            if(head==null){
                head=node;
            }
            else{
                node.next=head;
                head.previous=node;
                head=node;
            }
                size++;
        }
        void deleteFromBegining(){
            System.out.println("deleting node" +head.data +"from begining");
            head=head.next;
            head.previous=null;
        }
        void insertBeforeNode(Node node ,Node nodeBefore){
            System.out.println("insert node" + node.data + "before node" +nodeBefore.data);
            Node temp=head;
            while (temp!=null){
                if(temp.data==nodeBefore.data){
                    temp.previous.next=node;
                    node.next=temp;

                    node.previous=node;
                }
            }
        }
    }



