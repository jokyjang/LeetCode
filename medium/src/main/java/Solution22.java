import java.util.LinkedList;
import java.util.List;

public class Solution22 {
    public List<String> generateParenthesis(int n) {
        List<String> result = new LinkedList<>();
        if (n < 1) {
            return result;
        }
        backtrack("", 0, 0, n, result);
        return result;
    }

    private void backtrack(String prefix, int open, int close, int n, List<String> result) {
        if (prefix.length() == 2 * n) {
            result.add(prefix);
            return;
        }

        if (open < n) {
            backtrack(prefix + "(", open + 1, close, n, result);
        }
        if (close < open) {
            backtrack(prefix + ")", open, close + 1, n, result);
        }
    }
}
