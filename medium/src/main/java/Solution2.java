public class Solution2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode root = null;
        ListNode current = null;
        while (l1 != null || l2 != null) {
            int sum = carry;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            carry = sum / 10;
            ListNode newNode = new ListNode(sum % 10);
            if (root == null) {
                root = newNode;
            } else {
                current.next = newNode;
            }
            current = newNode;
        }

        if (carry != 0) {
            current.next = new ListNode(carry);
        }
        return root;
    }
}
