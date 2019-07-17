public class Solution108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBST(nums, 0, nums.length - 1);
    }

    // Convert the sorted array nums in the range of from - to to the BST
    private TreeNode sortedArrayToBST(int[] nums, int from, int to) {
        if (from > to) {
            return null;
        }
        int middle = (from + to) / 2;
        TreeNode node = new TreeNode(nums[middle]);
        TreeNode left = sortedArrayToBST(nums, from, middle - 1);
        TreeNode right = sortedArrayToBST(nums, middle + 1, to);
        node.left = left;
        node.right = right;
        return node;
    }
}
