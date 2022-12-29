class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
public class Intersection_LinkedList {
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) { // if either one is empty that means there is no intersection
            return null;
        }

        ListNode a_pointer = headA; // to traverse list a
        ListNode b_pointer = headB; // to traverse list b

        while (a_pointer != b_pointer) { // while the nodes dont equal each other
            if (a_pointer == null) { // if you hit end of list a, set it to the head of the longer list b 
                a_pointer = headB;
            }
            else { // otherwise keeping traversing
                a_pointer = a_pointer.next;
            }

            if (b_pointer == null) { // if you hit end of list b, set it to the head of the longer list a
                b_pointer = headA;
            }
            else { // otherwise keeping traversing
                b_pointer = b_pointer.next;
            }
        }

        return a_pointer; // after the while loop return the intersection
    }
    public static void main(String[] args) {
        ListNode headA = new ListNode(4);
        headA.next = new ListNode(1);
        headA.next.next = new ListNode(8);
        headA.next.next.next = new ListNode(4);
        headA.next.next.next.next = new ListNode(5);

        ListNode headB = new ListNode(5);
        headB.next = new ListNode(6);
        headB.next.next = new ListNode(1);
        headB.next.next.next = new ListNode(8);
        headB.next.next.next.next = new ListNode(4);
        headB.next.next.next.next.next = new ListNode(5);

        System.out.println(getIntersectionNode(headA, headB));
    }
}
