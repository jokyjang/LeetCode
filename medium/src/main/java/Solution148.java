public class Solution148 {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode fast = head.next, slow = head.next, previous = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            previous = previous.next;
        }
        previous.next = null;
        return merge(sortList(head), sortList(slow));
    }

    // Merge two sorted linked list, and return the new head
    private ListNode merge(ListNode head1, ListNode head2) {
        ListNode dummy = new ListNode(0);
        dummy.next = head1;

        ListNode previous = dummy;
        while (head1 != null && head2 != null) {
            if (head1.val < head2.val) {
                head1 = head1.next;
                previous = previous.next;
            } else {
                ListNode temp = head2.next;
                head2.next = head1;
                previous.next = head2;
                previous = head2;
                head2 = temp;
            }
        }
        if (head1 == null) {
            previous.next = head2;
        }
        return dummy.next;
    }
}
