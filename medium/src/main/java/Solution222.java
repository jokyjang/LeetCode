// TODO
public class Solution222 {
    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = depth(root.left);
        int right = depth(root.right);
        return (1<<right) + countNodes(left == right ? root.right : root.left);
    }

    private int depth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return depth(root.left) + 1;
    }
}
