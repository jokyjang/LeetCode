// TODO add tests
public class Solution543 {
    private int max = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        depth(root);
        return max;
    }

    private int depth(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int left = depth(node.left);
        int right = depth(node.right);
        max = Math.max(max, left + right);
        return Math.max(left, right) + 1;
    }
}
