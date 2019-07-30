import java.util.Stack;

public class Solution32 {
    public int longestValidParentheses(String s) {
        int[] longest = new int[s.length()];
        Stack<Integer> stack = new Stack<>();
        int max = 0;
        if (s.isEmpty()) {
            return max;
        }
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else if (!stack.isEmpty()) {
                int prev = stack.pop();
                int current = 2 + longest[i-1] + (prev >= 1 ? longest[prev-1] : 0);
                longest[i] = current;
                if (current > max) {
                    max = current;
                }
            }
        }
        return max;
    }
}
