import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        TreeNode temp = root;
        while (temp.left != null) {
            temp = temp.left;
            stack.push(temp);
        }
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            result.add(node.val);
            temp = node.right;
            while (temp != null) {
                stack.push(temp);
                temp = temp.left;
            }
        }
        return result;
    }
}
