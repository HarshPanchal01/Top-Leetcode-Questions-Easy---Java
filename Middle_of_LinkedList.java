class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
public class Middle_of_LinkedList {
    public static ListNode middleNode(ListNode head) {
        ListNode slow = head; // make variables slow and fast to go through linkedlist
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next; // go through every two elements
            slow = slow.next; // go one element at a time
        }

        return slow; // return slow because it will arrive right in the middle
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        System.out.println(middleNode(head));
    }
}
