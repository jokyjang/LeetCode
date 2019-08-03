public class Solution104 {
    public int maxDepth(TreeNode root) {
        return maxDepthFrom(root, 0);
    }

    private int maxDepthFrom(TreeNode root, int currentDepth) {
        if (root == null) {
            return currentDepth;
        } else if (root.left == null && root.right == null) {
            return currentDepth + 1;
        } else {
            return Math.max(maxDepthFrom(root.left, currentDepth + 1),
                maxDepthFrom(root.right, currentDepth + 1));
        }
    }
}
