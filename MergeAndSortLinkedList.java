import java.util.*;
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}public class MergeAndSortLinkedList {
    public static Node mergeLinkedLists(Node head1, Node head2) {
        Node mergedHead = null;
        Node current = null;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                if (mergedHead == null) {
                    mergedHead = head1;
                    current = mergedHead;
                } else {
                    current.next = head1;
                    current = current.next;
                }
                head1 = head1.next;
            } else {
                if (mergedHead == null) {
                    mergedHead = head2;
                    current = mergedHead;
                } else {
                    current.next = head2;
                    current = current.next;
                }
                head2 = head2.next;
            }
        }

        if (head1 != null) {
            if (mergedHead == null) {
                mergedHead = head1;
            } else {
                current.next = head1;
            }
        }

        if (head2 != null) {
            if (mergedHead == null) {
                mergedHead = head2;
            } else {
                current.next = head2;
            }
        }

        return mergedHead;
    }

    public static Node sortLinkedList(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node mid = getMiddle(head);
        Node nextToMid = mid.next;
        mid.next = null;

        Node left = sortLinkedList(head);
        Node right = sortLinkedList(nextToMid);

        return mergeSortedLists(left, right);
    }

    public static Node getMiddle(Node head) {
        if (head == null) {
            return head;
        }

        Node slow = head;
        Node fast = head.next;

        while (fast != null) {
            fast = fast.next;
            if (fast != null) {
                slow = slow.next;
                fast = fast.next;
            }
        }

        return slow;
    }

    public static Node mergeSortedLists(Node head1, Node head2) {
        Node mergedHead = null;
        Node current = null;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                if (mergedHead == null) {
                    mergedHead = head1;
                    current = mergedHead;
                } else {
                    current.next = head1;
                    current = current.next;
                }
                head1 = head1.next;
            } else {
                if (mergedHead == null) {
                    mergedHead = head2;
                    current = mergedHead;
                } else {
                    current.next = head2;
                    current = current.next;
                }
                head2 = head2.next;
            }
        }

        if (head1 != null) {
            if (mergedHead == null) {
                mergedHead = head1;
            } else {
                current.next = head1;
            }
        }

        if (head2 != null) {
            if (mergedHead == null) {
                mergedHead = head2;
            } else {
                current.next = head2;
            }
        }

        return mergedHead;
    }
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

    public static void main(String[] args) {
        // Example usage
        Node head1 = new Node(25);
        insertingnode(35,head1);
        insertingnode(12,head1);
        insertingnode(4,head1);
        insertingnode(36,head1);
        insertingnode(48,head1);

        Node head2 = new Node(2);
        insertingnode(8,head2);
        insertingnode(32,head2);
        insertingnode(22,head2);
        insertingnode(45,head2);
        insertingnode(63,head2);
        insertingnode(49,head2);

        Node mergedHead = mergeLinkedLists(head1, head2);
        Node sortedHead = sortLinkedList(mergedHead);

        // Printing the sorted linked list
        while (sortedHead != null) {
            System.out.print(sortedHead.data + " ");
            sortedHead = sortedHead.next;
        }
    }
}
