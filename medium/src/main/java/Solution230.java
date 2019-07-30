public class Solution230 {
    int index = 0;
    TreeNode value = null;

    public int kthSmallest(TreeNode root, int k) {
        index = 0;
        value = null;
        traverse(root, k);
        return value.val;
    }

    private void traverse(TreeNode root, int k) {
        if (root == null) {
            return;
        }
        traverse(root.left, k);
        if (value != null) {
            return;
        }
        if (++index == k) {
            value = root;
            return;
        }
        traverse(root.right, k);
    }
}
