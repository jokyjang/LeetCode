public class Solution110 {
    public boolean isBalanced(TreeNode root) {
        return getDepthIfBalanced(root) != -1;
    }

    // Return the depth of the tree if it is balanced, otherwise, return -1
    private int getDepthIfBalanced(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftDepth = getDepthIfBalanced(root.left);
        if (leftDepth == -1) {
            return -1;
        }
        int rightDepth = getDepthIfBalanced(root.right);
        if (rightDepth == -1) {
            return -1;
        }
        if (Math.abs(leftDepth - rightDepth) <= 1) {
            return Math.max(leftDepth, rightDepth) + 1;
        } else {
            return -1;
        }
    }
}
