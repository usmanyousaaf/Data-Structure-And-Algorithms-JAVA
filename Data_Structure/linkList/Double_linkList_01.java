package linkList;

class Node6 {
    int data;
    Node6 next;
    Node6 previous;

    public Node6(int data) {
        this.data = data;
        this.next = null;
        this.previous = null;
    }
}

class list {
    Node6 head;
    Node6 tail = null;
    int size = 0;

    public void addFirst(int data) {
        Node6 newnode = new Node6(data);
        if (head == null) {
            tail = newnode;
        } else {
            head.previous = newnode;
        }
        newnode.next = head;
        head = newnode;
        size++;
    }

    public void addLast(int data) {
        Node6 newnode = new Node6(data);
        if (head == null) {
            head = newnode;
            return;
        } else {
            tail.next = newnode;
        }
        newnode.previous = tail;
        tail = newnode;
        size++;
    }

    public void addInBetween(int data, int location) {
        Node6 newnode = new Node6(data);
        Node6 temp = head;
        Node6 temp1 = head.next;
        int count = 1;
        while (count < location) {
            temp = temp.next;
            temp1 = temp1.next;
            count++;
        }
        temp.next = newnode;
        newnode.next = temp1;

        newnode.previous = temp;
        temp1.previous = newnode;
        size++;

    }

    public void searchElement(int data) {
        Node6 temp = head;
        int count=1;
        while (temp != null) {
            temp = temp.next;
            if (data==temp.data){
                System.out.print(temp.data+" IS AVAILABLE IN THE LIST AT POSITION "+count);
                break;
        }
            else {
                //
            }
            count++;
    }

}

    public void deleteFirst() {
        Node6 temp = head;
        if (head == null) {
            System.out.println("The List Is Empty!");
            return;
        }
        if (head == tail) {
            tail = null;
        }
        head.next.previous = null;
        head = head.next;
        size--;
        return;

    }

    public void deleteLast() {
        Node6 temp = tail;
        if (head == null) {
            System.out.println("the list is empty");
            return;
        }
        if (head == tail) {
            head = null;
        } else {
            tail.previous.next = null;
        }
        tail = tail.previous;
        temp.previous = null;
        size--;
        return;
    }


    public void display() {
        if (head == null) {
            System.out.println("The List Is Empty!");
            return;
        }
        Node6 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ---> ");
            temp = temp.next;
        }
        System.out.println("NUll");
    }

    public void display_reverse() {
        if (tail == null) {
            System.out.println("The List Is Empty!");
            return;
        }
        Node6 temp = tail;
        while (temp != null) {
            System.out.print(temp.data + " ---> ");
            temp = temp.previous;
        }
        System.out.println("Null");
    }

}


public class Double_linkList_01 {
    public static void main(String[] args) {
        list l1 = new list();
        l1.addFirst(185);
        l1.addFirst(158);
        l1.addFirst(175);
        l1.addFirst(155);
        l1.addLast(55);
        l1.display();
        System.out.println("NODE IS: ");
        l1.display();
        System.out.println("DELETE FIRST NODE: ");
        l1.deleteFirst();
        l1.display();
        System.out.println("DELETE LAST NODE: ");
        l1.deleteLast();
        l1.display();
        System.out.println("ADD DATA IN BETWEEN");
        l1.addInBetween(25, 2);
        l1.display();
        System.out.println("THE REVERSE OF THE LIST IS: ");
        l1.display_reverse();
        System.out.println("THE SIZE OF THE LIST IS :" + l1.size);

        System.out.println("SEARCH NUMBER FROM THE LIST:");
        l1.searchElement(158);


    }
}
