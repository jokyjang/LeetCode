import java.util.Stack;

public class Solution173 {

    // TODO add tests
    class BSTIterator {
        private Stack<TreeNode> stack;

        public BSTIterator(TreeNode root) {
            stack = new Stack<>();
            if (root != null) {
                stack.push(root);
                while (stack.peek().left != null) {
                    stack.push(stack.peek().left);
                }
            }
        }

        /** @return the next smallest number */
        public int next() {
            if (stack.isEmpty()) {
                throw new RuntimeException("Has no next!");
            }
            TreeNode node = stack.pop();
            if (node.right != null) {
                stack.push(node.right);
                while (stack.peek().left != null) {
                    stack.push(stack.peek().left);
                }
            }
            return node.val;
        }

        /** @return whether we have a next smallest number */
        public boolean hasNext() {
            return !stack.isEmpty();
        }
    }
}
