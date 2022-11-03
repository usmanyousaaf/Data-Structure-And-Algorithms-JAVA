package linkList;
class Node5{
    int data;
    Node5 next;

    public Node5(int data) {
        this.data = data;
        this.next=null;
    }
}
class linklistt{
    Node5 head;
    public void addFirst(int data){
        Node5 newnode=new Node5(data);
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
        Node5 newnode=new Node5(data);
        if (head==null){
            head=newnode;
            return;
        }
        Node5 currentNode=head;
        while (currentNode!=null){
            currentNode=currentNode.next;
        }
        currentNode.next=newnode;
    }
    public void addInSecondLast(int data){
        Node5 newnode=new Node5(data);
        Node5 secondlastnode=head;
        Node5 lastnode=head.next;
        while (lastnode.next!=null){
            secondlastnode=secondlastnode.next;
            lastnode=lastnode.next;
        }
        secondlastnode.next=newnode;
        newnode.next=lastnode;
    }

    public void addInBetween(int data,int location){
        Node5 newnode=new Node5(data);
        int count=1;
        Node5 temp=head;
        Node5 temp1=head.next;
     while (count<location){
         temp=temp.next;
         temp1=temp1.next;
     }
     temp.next=newnode;
     newnode.next=temp1;
    }
    public void deleteFirst(){
        if (head==null){
            System.out.println("The list is empty");
            return;
        }
        head=head.next;

    }
    public void deleteLast(){
        if (head==null){
            System.out.println("The list is empty");
            return;
        }

        if (head.next==null){
            head=null;

            return;
        }
        Node5 secondLastNode=head;
        Node5 lastNode=head.next;
        while (lastNode.next!=null){
            lastNode=lastNode.next;
            secondLastNode=secondLastNode.next;
        }
        secondLastNode.next=null;

    }
    public void show(){
        Node5 currentNode=head;
        while (currentNode.next!=null){
            System.out.print(currentNode.data +" ---> ");
            currentNode=currentNode.next;
        }
        System.out.print(currentNode.data);
        //  System.out.print(currentNode.next);

    }
}
public class practice_02 {
    public static void main(String[] args) {
        linklistt ll2=new linklistt();
        ll2.addFirst(25);
        ll2.addFirst(255);
        ll2.addLast(266);
        ll2.addInSecondLast(56);
        ll2.addInBetween(15,2);
        ll2.deleteFirst();
        ll2.deleteLast();
        ll2.show();

    }
}
