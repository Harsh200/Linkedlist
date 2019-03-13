public class CircularLinkedList {
    int size = 0;
    Node head = null;
    Node tail = null;

    public static void main(String[] args) {
        CircularLinkedList linkedList = new CircularLinkedList();
        for (int i = 0; i < 5; i++) {
             linkedList.addNodeToHead(i+1);
        }
        linkedList.print();
        linkedList.addNodeToHead(45);
        linkedList.print();
        linkedList.deleteHead();
        linkedList.print();

    }

    class Node {
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
    }

        public void print() {
            if (size == 0) {
                System.out.println("List is empty");
            } else {
                Node temp = head;
                do {
                    System.out.print(" " + temp.data);
                    temp = temp.next;
                }
                while (temp != head);
                System.out.println("");
            }
        }

        public void addNodeToHead(int data) {
            Node n = new Node(data);
            if (size == 0) {
                head = n;
                tail = n;
                n.next = head;

            } else {
                Node temp = head;
                n.next = temp;
                head = n;
                tail.next = head;

            }
            size++;
        }
          public void addNodeToTail(int data){
              if(size==0){
                  addNodeToHead(data);
              }
              else{
                  Node node = new Node(data);
                  tail.next=node;
                  tail=node;
                  tail.next=head;
                  size++;
              }
          }
          public void deleteHead(){
                  if(size!=0){
                      Node temp=head;
                      head=head.next;
                      tail.next=head;
                      size--;
                  }
          }
    }




