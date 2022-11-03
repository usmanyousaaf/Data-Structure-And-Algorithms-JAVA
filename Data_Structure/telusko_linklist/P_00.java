package telusko_linklist;
class  Node{
    int data;
    Node next;
}
class linkList{
    Node head;
    public void insert(int data){
        Node node =new Node();
        node.data=data;
        node.next=null;
        if (head==null){
            head=node;
        }
        else {
            Node n = head;
            while (n.next!=null){
                n=n.next;
            }
            n.next=node;
        }
    }

    public void show(){
        Node node=head;
        while (node.next!=null){
            System.out.println(node.data);
            node=node.next;
        }
        System.out.println(node.data);

    }
}

public class P_00 {
    public static void main(String[] args) {
        linkList l1=new linkList();
        l1.insert(12);
        l1.insert(14);
        l1.insert(16);

        l1.show();
    }
}
