public class Solution109 {
    private static class Pair {
        TreeNode treeNode;
        ListNode listNode;
        Pair(TreeNode treeNode, ListNode listNode) {
            this.treeNode = treeNode;
            this.listNode = listNode;
        }
    }
    public TreeNode sortedListToBST(ListNode head) {
        int size = 0;
        ListNode temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }

        return sortedListToBST(head, 0, size - 1).treeNode;
    }

    private Pair sortedListToBST(ListNode head, int low, int high) {
        if (low > high) {
            return new Pair(null, head);
        }

        int middle = (low + high) / 2;
        Pair left = sortedListToBST(head, low, middle - 1);
        TreeNode root = new TreeNode(left.listNode.val);
        Pair right = sortedListToBST(left.listNode.next, middle + 1, high);
        root.left = left.treeNode;
        root.right = right.treeNode;
        return new Pair(root, right.listNode);
    }
}
