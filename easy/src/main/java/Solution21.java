public class Solution21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode root = null;
        ListNode current = null;
        while (l1 != null || l2 != null) {
            ListNode node = null;
            if (l1 == null || (l2 != null && l1.val > l2.val)) {
                node = new ListNode(l2.val);
                l2 = l2.next;
            } else {
                node = new ListNode(l1.val);
                l1 = l1.next;
            }
            if (root == null) {
                root = node;

            } else {
                current.next = node;

            }
            current = node;
        }
        return root;
    }
}
