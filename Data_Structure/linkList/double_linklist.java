package linkList;

class Node4{
    int data;
    Node4 next;
    Node4 previous;
    public Node4(int data){
        this.next=null;
        this.previous=null;
        this.data=data;
    }

    public void setData(int data) {
        this.data = data;
    }
    public int getData() {
        return data;
    }

    public Node4 getNext() {
        return next;
    }

    public void setNext(Node4 next) {
        this.next = next;
    }

    public Node4 getPrevious() {
        return previous;
    }

    public void setPrevious(Node4 previous) {
        this.previous = previous;
    }
}
class Double_LL{
    Node4 start=null;
    Node4 end=null;
    int size=0;

    public Double_LL(Node4 start, Node4 end, int size) {
        this.start = start;
        this.end = end;
        this.size = size;
    }

    public Double_LL() {

    }

    public boolean isEmpty(){
        return start==null;
    }
    /*
    public int setSize(int size){
        this.size=size;
        return size;
    }*/
    public int getSize(){
        return size;
    }

    public void insertatstart(int data){
        Node4 newnode=new Node4(data);
        if (start == null) {
            start = newnode;
            end = start;
        } else {
            start.setPrevious(newnode);
            newnode.setNext(start);
            start = newnode;
        }
        size++;
    }

    public void insertAtEnd(int data) {
        Node4 newnode = new Node4(data);
        if (start == null) {
            start = newnode;
            end = start;
        } else {
            newnode.setPrevious(end);
            end.setNext(newnode);
            end = newnode;
        }
        size++;
    }
    public void display() {
        System.out.print("\nDoubly Linked List = ");

        if (size == 0) {
            System.out.print("empty\n");
            return;
        }

        if (start.getNext() == null) {
            System.out.println(start.getData());
            return;
        }

        Node4 temp = start;
        System.out.print(start.getData() + " <-> ");
        temp = start.getNext();

        while (temp.getNext() != null) {
            System.out.print(temp.getData() + " <-> ");
            temp = temp.getNext();
        }
        System.out.print(temp.getData() + "\n");
    }
}

public class double_linklist {
    public static void main(String[] args) {
        Double_LL dll=new Double_LL();
        dll.insertatstart(15);
        dll.insertatstart(156);
        dll.insertAtEnd(25);
        System.out.println("the size is : "+dll.getSize());

        dll.display();
    }
}
