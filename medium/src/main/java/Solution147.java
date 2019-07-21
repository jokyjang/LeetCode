public class Solution147 {
    public ListNode insertionSortList(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode previous = dummy, next = head;
        while (next != null) {
            ListNode p2 = dummy, n2 = dummy.next;
            while (n2 != next && n2.val < next.val) {
                p2 = p2.next;
                n2 = n2.next;
            }
            if (n2 == next) {
                previous = next;
                next = next.next;
            } else {
                previous.next = next.next;
                next.next = n2;
                p2.next = next;
                next = previous.next;
            }
        }
        return dummy.next;
    }
}
