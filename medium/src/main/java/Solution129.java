public class Solution129 {
    public int sumNumbers(TreeNode root) {
        return sumNumbers(root, 0, 0);
    }

    private int sumNumbers(TreeNode root, int currentNumber, int currentSum) {
        if (root == null) {
            return currentSum;
        }

        if (root.left == null && root.right == null) {
            return currentNumber * 10 + root.val + currentSum;
        }

        currentSum = sumNumbers(root.left, currentNumber * 10 + root.val, currentSum);
        return sumNumbers(root.right, currentNumber * 10 + root.val, currentSum);
    }
}
