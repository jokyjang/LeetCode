// TODO add tests
public class Solution124 {
    private int max = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        maxPathSumThroughNode(root);
        return max;
    }

    private int maxPathSumThroughNode(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = Math.max(0, maxPathSumThroughNode(root.left));
        int right = Math.max(0, maxPathSumThroughNode(root.right));
        int value = root.val + left + right;
        if (max < value) {
            max = value;
        }
        return Math.max(root.val + Math.max(left, right), 0);
    }
}
