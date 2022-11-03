package STACK_DSA;

import java.util.Scanner;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Stack {
    Node top; // same as head; you can also name as head.
    // how top work ?
    // top-->top.next--->top.next.next   ||  we put values like top=null & top.next=data using loop
    int size;

    public Stack(Node top, int size) {
        this.top = null;
        this.size = 0;
    }

    public Stack() {

    }

    public void push(int data) {
        Node newnode = new Node(data);
        newnode.next = top;
        top = newnode;
        size++;
    }

    public int pop() {
        if (top == null) {
            System.out.println("THE STACK IS EMPTY!!");
        }
        int result = top.data;
        top = top.next;
        size--;
        return result;
    }

    public int peak() {
        if (top == null) {
            System.out.println("THE STACK IS EMPTY!!");
        }
        return top.data;
    }

    public void addInBetween(int data,int location){
        Node newnode=new Node(data);
        Node temp,temp1;
        temp=top;
        temp1=top.next;
        int count=1;
        if (top==null || top.next==null){
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

    public void display() {
        if (top == null) {
            System.out.println("STACK IS EMPTY!");
            return;
        }
        Node temp = top;
        while (temp.next != null) {
            System.out.print("|_____| --->");
            System.out.println(" "+temp.data);
            temp = temp.next;
        }
        System.out.print("|_____| --->");
        System.out.println(" " + temp.data);

    }
}

public class Stack_01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack s1 = new Stack();
        int exit;
        do {
            System.out.println("ENTER YOUR CHOICE:\n1.PUSH\n2.POP\n3.DISPLAY\n4.PEAK\n5.PUSH-IN-BETWEEN\n6.EXIT");
            int choice=sc.nextInt() ;
            switch (choice){
                case 1:
                    System.out.println("Enter Element: ");
                    int d=sc.nextInt();
                    s1.push(d);
                    break;
                case 2:
                    s1.pop();
                    break;
                case 3:
                    s1.display();
                    break;
                case 4:
                    System.out.println(">>>"+s1.peak());
                    break;
                case 5:
                    System.out.println("Enter Elements:");
                    int d1=sc.nextInt();
                    System.out.println("Enter Location");
                    int l=sc.nextInt();
                    s1.addInBetween(d1,l);
                    break;
                case 6:
                    System.out.println("----------Exit---------");
                    break;
                default:
                    System.out.println("Wrong Entry \n ");
                    break;
            }
            exit=choice;

        }while (exit!=6);


        /*
        s1.push(15);
        s1.push(20);
        s1.push(55);
        s1.push(50);
        s1.push(75);
        s1.push(85);
        s1.pop();
        s1.display();
        s1.peak();
         */


    }
}
