class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { 
        this.val = val; 
    }
    ListNode(int val, ListNode next) { 
        this.val = val; 
        this.next = null; 
    }
}
public class Palindrome_LinkedList {
    public static boolean isPalindrome(ListNode head) {
        ListNode slow = head; // make variables slow and fast to go through linkedlist
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next; // go through every two elements
            slow = slow.next; // go one element at a time
        }

        slow = reversed(slow); // reverse the right half way point
        fast = head; // set fast to head again to compare reverse of halfway and from start to half way

        while (slow != null) { // while right half doesnt come to an end
            if (slow.val != fast.val) { // if the values are not equal to each other
                return false;
            }
            // iterate both of them by one this time
            slow = slow.next;
            fast = fast.next;
        }

        return true;
    }

    public static ListNode reversed(ListNode head) {
        ListNode prev = null; // previous node is null at start
        while (head != null) { // while list doesnt end
            ListNode next = head.next; // make next node into a variable
            head.next = prev; // set next value to prev
            prev = head; // set prev to head
            head = next; // go to next value
        }
        return prev; // return prev
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(2);
        head.next.next.next.next.next = new ListNode(1);
        System.out.println(isPalindrome(head));
    }
}
