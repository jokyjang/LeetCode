import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution145 {
    private class Pair {
        TreeNode node;
        boolean left, right;
        Pair(TreeNode node) {
            this.node = node;
        }
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Stack<Pair> stack = new Stack<>();
        stack.push(new Pair(root));
        while (!stack.isEmpty()) {
            Pair pair = stack.peek();
            if ((pair.node.left == null && pair.node.right == null) || (pair.left && pair.right)) {
                result.add(pair.node.val);
                stack.pop();
                continue;
            }
            if (!pair.left && pair.node.left != null) {
                stack.push(new Pair(pair.node.left));
                pair.left = true;
            } else if (!pair.left) {
                pair.left = true;
            } else if (!pair.right && pair.node.right != null) {
                pair.right = true;
                stack.push(new Pair(pair.node.right));
            } else if (!pair.right) {
                pair.right = true;
            }
        }
        return result;
    }
}
