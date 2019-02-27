public class CircularList {
    class Node{
int data;
Node next;

        public Node(int data) {
            this.data = data;
            this.next=null;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
    int size=0;
    Node head=null;

    public static void main(String[] args) {
CircularList list=new CircularList();
    }
}
