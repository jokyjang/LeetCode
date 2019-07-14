public class Solution24 {
    // TODO solution could be better by having a dummy head node to babysitter the swap
    public ListNode swapPairs(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }

        ListNode first = head;
        ListNode next = head.next;
        ListNode root = next;
        ListNode previous = first;
        while (first != null && next != null) {
            ListNode temp = next.next;
            next.next = first;
            first.next = temp;

            first = temp;
            if (first != null) {
                next = first.next;
                if (next != null) {
                    previous.next = next;
                    previous = first;
                }
            }
        }

        return root;
    }
}
