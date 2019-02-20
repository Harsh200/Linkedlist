public class mylinkedlist {
    private node head;
    private node tail;
    private int currentSize;

    public node getHead() {
        return head;
    }

    public void setHead(node head) {
        this.head = head;
    }

    public node getTail() {
        return tail;
    }

    public void setTail(node tail) {
        this.tail = tail;
    }

    public int getCurrentSize() {
        return currentSize;
    }

    public void setCurrentSize(int currentSize) {
        this.currentSize = currentSize;
    }

    public mylinkedlist() {
        this.head=null;
        this.tail=null;
        this.currentSize=0;
    }

    public static void main(String[] args) {
        mylinkedlist linkedlist=new mylinkedlist();
        node no= new node(10,null);

    }
    public void display(mylinkedlist linkedlsit){

    }
}
