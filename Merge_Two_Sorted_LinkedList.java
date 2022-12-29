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
public class Merge_Two_Sorted_LinkedList {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode tempNode = new ListNode(0); // temporary head
        ListNode currentNode = tempNode; // head to work with in the program

        while (list1 != null && list2 != null) { // while both lists arent null
            if (list1.val < list2.val) { // if value of one is less then other set current node to that
                currentNode.next = list1;
                list1 = list1.next; // go to next element
            }
            else {
                currentNode.next = list2;
                list2 = list2.next;
            }
            currentNode = currentNode.next; // go to next element
        }

        if (list1 != null) { // if one of the lists has ended while another hasnt
            currentNode.next = list1;
            list1 = list1.next;
        }

        else if (list2 != null) {
            currentNode.next = list2;
            list2 = list2.next;
        }

        return tempNode.next;
    }
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);
        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);
        System.out.println(mergeTwoLists(list1, list2));
    }
}
