package linkList;
class Node3{
    int data;
    Node3 next;
    Node3(int data){
        this.data=data;
        this.next=null;
    }
}
class LINKLIST{
    Node3 head;
    public void  addFist(int data){
        Node3 newnode=new Node3(data);
        if (head==null){
            head=newnode;
            return;
        }
        else {
            newnode.next=head;
            head=newnode;
            return;
        }
    }
    public void addLast(int data){
        Node3 newnode=new Node3(data);
        if (head==null){
            head=newnode;
            return;
        }
        else {
            Node3 temp;
            temp=head;
            while (temp.next!=null){
                temp=temp.next;
            }
            temp.next=newnode;
        }
    }

    public void show(){
        Node3 temp;
        temp=head;
        while (temp.next!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.print(temp.data+"-->Null");
    }
    // delete First
    public void deleteFirst(){
        if (head==null){
            System.out.println("the list is empty!");
            return;
        }
        else {
            head=head.next;
            return;
        }
    }
    // delete Last
    public void deleteLast(){
        if (head==null){
            System.out.println("the list is empty!");
        }
        if (head.next==null){
            head=null;
            return;
        }
        Node3 temp=head;
        Node3 temp1=head.next;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=null;
    }
}
public class practice_01 {
    public static void main(String[] args) {
        LINKLIST l=new LINKLIST();
        l.addFist(15);
        l.addFist(55);
        l.addLast(75);
        l.deleteLast();
        l.show();
    }
}
