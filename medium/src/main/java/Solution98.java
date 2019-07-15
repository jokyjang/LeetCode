public class Solution98 {
    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        return getMinMaxValueIfBst(root) != null;
    }

    private int[] getMinMaxValueIfBst(TreeNode root) {
        if (root.left == null && root.right == null) {
            return new int[]{root.val, root.val};
        } else if (root.left == null) {
            int[] values = getMinMaxValueIfBst(root.right);
            if (values == null || root.val >= values[0]) {
                return null;
            } else {
                return new int[]{root.val, values[1]};
            }
        } else if (root.right == null) {
            int[] values = getMinMaxValueIfBst(root.left);
            if (values == null || root.val <= values[1]) {
                return null;
            } else {
                return new int[]{values[0], root.val};
            }
        } else {
            int[] leftValues = getMinMaxValueIfBst(root.left);
            int[] rightValues = getMinMaxValueIfBst(root.right);
            if (leftValues == null || rightValues == null || leftValues[1] >= root.val || rightValues[0] <= root.val) {
                return null;
            } else {
                return new int[]{leftValues[0], rightValues[1]};
            }
        }
    }
}
