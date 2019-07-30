import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution32Test {
    @Test
    public void longestValidParentheses() {
        Solution32 solution = new Solution32();
        assertEquals(2, solution.longestValidParentheses("(()"));
        assertEquals(4, solution.longestValidParentheses(")()())"));
        assertEquals(2, solution.longestValidParentheses("()(()"));
    }

}