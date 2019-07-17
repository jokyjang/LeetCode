public class Solution105 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTree(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }

    private TreeNode buildTree(int[] preorder, int prelow, int prehigh, int[] inorder, int inlow, int inhigh) {
        if (prelow > prehigh) {
            return null;
        }
        TreeNode node = new TreeNode(preorder[prelow]);
        int index = inlow;
        while (inorder[index] != preorder[prelow] && index <= inhigh) {
            index++;
        }
        TreeNode left = buildTree(preorder, prelow + 1, prelow + index - inlow, inorder, inlow, index);
        TreeNode right = buildTree(preorder, prelow + index - inlow + 1, prehigh, inorder, index + 1, inhigh);
        node.left = left;
        node.right = right;
        return node;
    }
}
