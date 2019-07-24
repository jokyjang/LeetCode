public class Solution156 {
    public TreeNode upsideDownBinaryTree(TreeNode root) {
        if (root == null || root.left == null) {
            return root;
        }
        TreeNode left = null, right = null;
        TreeNode current = root, next = root.left;
        while (next != null) {
            TreeNode temp = current.right;
            current.left = left;
            current.right = right;
            left = temp;
            right = current;
            current = next;
            next = current.left;
        }
        current.left = left;
        current.right = right;
        return current;
    }
}
