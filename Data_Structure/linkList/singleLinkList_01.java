package linkList;

import java.util.Scanner;

class  Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }}
class linklist{
    Node head;
    int size;

    public void addFirst(int data){
         Node newnode=new Node(data);
        if (head==null){
             head=newnode;
             size++;
             return;
        }
        else {
            newnode.next=head;
            head=newnode;
            size++;
        }
    }
    public  void addLast(int data){
        Node newnode=new Node(data);
        if (head==null){
            head=newnode;
            size++;
            return;
        }

        Node currentNode=head;

        while (currentNode.next !=null){
            currentNode=currentNode.next;
        }
        currentNode.next=newnode;
        size++;
    }
// Add in second last
    public void addInSecondLast(int data){
        Node newnode=new Node(data);
        Node last=head.next;
        Node secondLast=head;

        while (last.next!=null){
            last=last.next;
            secondLast=secondLast.next;
        }
        secondLast.next=newnode;
        newnode.next=last;
        size++;
    }
// Add in between
    public void addInBetween(int data,int location){
        Node newnode = new Node(data);
        Node temp=head;
        Node temp1=head.next;
        int count=1;
        // if no value
        if (head==null || head.next==null){
            System.out.println("we can't inset in between!");
            return;
        }
        while (count<location){
            temp=temp.next;
            temp1=temp1.next;
            count++;
        }
        temp.next=newnode;
        newnode.next=temp1;
    }



    // DELETING

    public void deleteFirst(){
        if (head==null){
            System.out.println("The list is empty");
            return;
        }
        head=head.next;
        size--;
    }
    public void deleteLast(){
        if (head==null){
            System.out.println("The list is empty");
            return;
        }
        
        if (head.next==null){
            head=null;
            size--;
            return;
        }
        Node secondLastNode=head;
        Node lastNode=head.next;
        while (lastNode.next!=null){
            lastNode=lastNode.next;
            secondLastNode=secondLastNode.next;
        }
        secondLastNode.next=null;
        size--;
    }
    public void show(){
        Node currentNode=head;
        while (currentNode.next!=null){

            //System.out.print(currentNode.data+"|"+currentNode.next+"--->");
            //System.out.println(currentNode.data);
            System.out.print(currentNode.data +" ---> ");
            currentNode=currentNode.next;
        }
        System.out.print(currentNode.data +" ---> "+ currentNode.next);
       // System.out.print(currentNode.next);

    }
}
public class singleLinkList_01 {
    public static void main(String[] args) {
        linklist list = new linklist();
        Scanner sc = new Scanner(System.in);
        int exit;
        System.out.println("--------Single Linked List-------- \n");
        do {
            System.out.println("\nENTER YOUR CHOICE:");
            System.out.println("1. Add-First");
            System.out.println("2. Add-Last");
            System.out.println("3. Add-In-SecondLast");
            System.out.println("4. Add-In-Between");
            System.out.println("5. Delete-First ");
            System.out.println("6. Delete-Last");
            System.out.println("7. Check-Size");
            System.out.println("8. Display");
            System.out.println("9. Exit");


            int choice = sc.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.println("Enter element to insert at first");
                    list.addFirst(sc.nextInt());
                    break;
                case 2:
                    System.out.println("Enter  element to insert at last");
                    list.addLast(sc.nextInt());
                    break;
                case 3:
                    System.out.println("Enter element to insert at second last");
                    list.addInSecondLast(sc.nextInt());
                    break;
                case 4:
                    System.out.println("Enter element to insert at specific position");
                    System.out.println("enter data :");
                    int data = sc.nextInt();
                    System.out.println("enter location :");
                    int location = sc.nextInt();
                    list.addInBetween(data, location);
                    break;
                case 5:
                    System.out.println("the element in first position is deleted!");
                    list.deleteFirst();
                    break;
                case 6:
                    System.out.println("the element in last position is deleted!");
                    list.deleteLast();
                    break;
                case 7:
                    System.out.println("size of the list is  =" + list.size);
                    break;
                case 8:
                    list.show();
                    break;
                case 9:
                    System.out.println("_______EXIT_______");
                    break;
                default:
                    System.out.println("Wrong Entry \n ");
                    break;
            }
            exit = choice;

        } while (exit!=9);
    }

}

