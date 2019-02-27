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
    Node tail=null;

     CircularList() {
        tail.next=head;
    }

    public static void main(String[] args) {
       CircularList list=new CircularList();
        System.out.println(list);
    }

    @Override
    public String toString() {
        StringBuilder response=new StringBuilder();
        response.append("[");
        Node temp=this.head;
        while(temp!=null){
            response.append(temp.data);
            if(temp.next!=null){
                response.append(" ==>");
            }
        }
        return  response.toString();

    }
}
