import java.util.Stack;

public interface Solution32 {

    int longestValidParentheses(String s);

    class DP implements Solution32 {
        @Override
        public int longestValidParentheses(String s) {
            int[] longest = new int[s.length()];
            int max = 0;
            for (int i = 1; i < s.length(); ++i) {
                if (s.charAt(i) == ')') {
                    int prev = i - longest[i-1] - 1;
                    if (prev >= 0 && s.charAt(prev) == '(') {
                        longest[i] = 2 + longest[i-1];
                        if (prev - 1 >= 0) {
                            longest[i] += longest[prev-1];
                        }
                        max = Math.max(max, longest[i]);
                    }
                }
            }
            return max;
        }
    }

    class StackSolution implements Solution32 {
        @Override
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
}
