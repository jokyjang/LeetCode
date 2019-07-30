public class Solution25 {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k <= 1) {
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        int length = 0;
        while (head != null) {
            ++length;
            head = head.next;
        }
        int times = length / k;
        ListNode preHead = dummy, current = dummy.next, next = current.next;
        while (times-- > 0) {
            current.next = null;
            for (int i = 1; i < k; ++i) {
                ListNode temp = next.next;
                next.next = current;
                current = next;
                next = temp;
            }
            ListNode temp = preHead.next;
            preHead.next = current;
            temp.next = next;
            preHead = temp;
            current = next;
            if (current != null) next = current.next;
        }
        return dummy.next;
    }
}
