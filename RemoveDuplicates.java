import java.util.ArrayList;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class RemoveDuplicates {
    public static void insertingnode(int i, Node head) {
        Node node=new Node(i);
        Node current=head;
        if(head==null) {
            head=node;
            head.next=null;
        }
        else {
            while(current.next!=null) {
                current=current.next;
            }
            current.next=node;
            node.next=null;
        }
    }
    public static Node removeDuplicates(Node head) {
        ArrayList<Integer> l=new ArrayList<>();
        Node current=head;
        Node previous=null;
        while(current!=null) {
            if(l.contains(current.data)) {
                previous.next=current.next;
            }
            else {
                l.add(current.data);
                previous=current;
            }
            current=current.next;
        }
        return head;
    }
    public static void main(String args[]) {
        Node head=new Node(2);
        insertingnode(5, head);
        insertingnode(12, head);
        insertingnode(2, head);
        insertingnode(3, head);
        insertingnode(5, head);
        insertingnode(1, head);
        insertingnode(2, head);
        insertingnode(5, head);
        insertingnode(5, head);
        Node h2=removeDuplicates(head);
        while(h2.next!=null) {
            System.out.print(h2.data+" ");
            h2=h2.next;
        }
    }
}
