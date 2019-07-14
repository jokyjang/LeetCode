import java.util.Stack;

public class Solution445 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> s1 = pushToStack(l1);
        Stack<Integer> s2 = pushToStack(l2);

        int carry = 0;
        ListNode lowDigit = null;
        while (!s1.isEmpty() || !s2.isEmpty()) {
            int sum = carry;
            if (!s1.isEmpty()) {
                sum += s1.pop();
            }
            if (!s2.isEmpty()) {
                sum += s2.pop();
            }
            ListNode newNode = new ListNode(sum % 10);
            newNode.next = lowDigit;
            lowDigit = newNode;
            carry = sum / 10;
        }

        if (carry != 0) {
            ListNode newNode = new ListNode(carry);
            newNode.next = lowDigit;
            lowDigit = newNode;
        }

        return lowDigit;
    }

    // Push the linked list to stack
    private Stack<Integer> pushToStack(ListNode node) {
        Stack<Integer> stack = new Stack<>();

        while (node != null) {
            stack.push(node.val);
            node = node.next;
        }

        return stack;
    }
}
