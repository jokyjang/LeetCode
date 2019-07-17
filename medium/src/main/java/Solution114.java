public class Solution114 {
    public void flatten(TreeNode root) {
        doFlatten(root);
    }

    // Flatten root in-place, and return the last node
    private TreeNode doFlatten(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode left = doFlatten(root.left);
        TreeNode right = doFlatten(root.right);
        if (root.left != null) {
            TreeNode temp = root.right;
            root.right = root.left;
            root.left = null;
            left.right = temp;
        }
        return right == null ? (left == null ? root : left) : right;
    }
}
