// TODO
public class Solution437 {
    public int pathSum(TreeNode root, int sum) {
        if (root == null) return 0;
        return pathSumFromRoot(root, sum)
            + pathSum(root.left, sum) + pathSum(root.right, sum);
    }

    private int pathSumFromRoot(TreeNode root, int sum) {
        if (root == null) return 0;
        return (root.val == sum ? 1 : 0) +
            pathSumFromRoot(root.left, sum-root.val) +
            pathSumFromRoot(root.right, sum-root.val);
    }
}
