public class Solution234 {
    public boolean isPalindrome(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast = dummy, slow = dummy;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode newHead = reverse(slow.next);
        while (newHead != null && head != null && newHead.val == head.val) {
            newHead = newHead.next;
            head = head.next;
        }
        return newHead == null;
    }

    private ListNode reverse(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode current = head, next = head.next;
        current.next = null;
        while (next != null) {
            ListNode temp = next.next;
            next.next = current;
            current = next;
            next = temp;
        }
        return current;
    }
}
