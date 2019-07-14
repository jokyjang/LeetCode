public class Solution92 {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (m == n) {
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode first = dummy;
        for (int i = 1; i < m; ++i) {
            first = first.next;
        }

        ListNode last = first.next;
        ListNode slow = last, fast = last.next;
        for (int i = m; i < n; ++i) {
            ListNode temp = fast.next;
            fast.next = slow;
            slow = fast;
            fast = temp;
        }
        first.next = slow;
        last.next = fast;
        return dummy.next;
    }
}
