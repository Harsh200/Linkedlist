public class stack {
    private static class Node {
        private int data;
        private Node next;

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

        public Node(int data, Node next) {

            this.data = data;
            this.next = next;
        }
    }
    private Node top=null;
    private int size=0;
    public void push(int data) {
        Node newNode = new Node(data, this.top) {
    this.top=newNode;
    this.size++;
        }
    }
    public int pop(){
        int response=-1;
        if(this.top!=null){
            response=this.top.getData();
            this.top=this.top.getNext();
            size--;
        }
        else{
            System.out.println("stack is empty");
        }
        return response;
    }

    public static void main(String[] args) {
   stack Stack=new stack();
    }
}
