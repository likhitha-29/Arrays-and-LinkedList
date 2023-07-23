public class ReverseNodes {
    public static int getSize(ListNode head) {
        int size = 0;
        while (head != null) {
            head = head.next;
            size++;
        }
        return size;
    }
    
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode current = head;
        ListNode previous = null;
        ListNode nextNode = current;
        int count = 0;
    
        if (getSize(head) < k && nextNode != null) {
            return nextNode;
        } else {
            while (current != null && count < k) {
                nextNode = current.next;
                current.next = previous;
                previous = current;
                current = nextNode;
                count++;
            }
            if (nextNode != null) {
                head.next = reverseKGroup(nextNode, k);
            }
        }
        return previous;
    }
}
