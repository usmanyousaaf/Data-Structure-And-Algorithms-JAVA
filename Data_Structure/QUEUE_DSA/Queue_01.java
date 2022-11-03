package QUEUE_DSA;

import java.util.Scanner;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Queue {
    Node front;
    Node rear;
    int size;


    public Queue(Node front, Node rear, int size) {
        this.front = front;
        this.rear = rear;
        this.size = size;
    }

    public Queue() {

    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void Add_Data(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {       // we also use if {size==0 OR front==null} instead of isEmpty function.

            front = newNode;
        } else {
            rear.next = newNode;
        }
        rear = newNode;
        size++;
    }

    public void Delete_Data() {
        if (front == null) {
            System.out.println("Queue is empty!");
            rear = null;
            return;
        }
        //int temp=front.data;
        front = front.next;
        size--;
        return;
    }

    public void display() {
        Node currentNode = front;
        if (currentNode == null) {
            System.out.println("Queue Is Empty!");
            return;
        }
        while (currentNode != null) {
            System.out.print(currentNode.data + " ---> ");
            currentNode = currentNode.next;
        }
        System.out.println("NULL");
    }

    public void addInBetween(int data, int location) {
        Node newNode = new Node(data);
        Node temp;
        Node temp1;
        temp = front;
        temp1 = front.next;
        int count = 1;
        if (front == null || front.next == null) {
            System.out.println("Can't Insert In Between");
            return;
        }
        while (count < location) {
            temp = temp.next;
            temp1 = temp1.next;
            count++;
        }
        temp.next = newNode;
        newNode.next = temp1;
    }
}

public class Queue_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue q1 = new Queue();
        int exit;
        do {
            System.out.println("ENTER YOUR CHOICE:\n1.ENTER DATA\n2.DELETE DATA\n3.DISPLAY\n4.ADD IN BETWEEN\n5.EXIT");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter Element: ");
                    int d = sc.nextInt();
                    q1.Add_Data(d);
                    break;
                case 2:
                    q1.Delete_Data();
                    break;
                case 3:
                    q1.display();
                    break;
                case 4:
                    System.out.println("Enter Element: ");
                    int d1 = sc.nextInt();
                    System.out.println("Enter Location: ");
                    int l = sc.nextInt();
                    q1.addInBetween(d1, l);
                    break;
                case 5:
                    System.out.println("----------Exit---------");
                    break;
                default:
                    System.out.println("Wrong Entry \n ");
                    break;
            }
            exit = choice;

        } while (exit != 5);


    }
}
