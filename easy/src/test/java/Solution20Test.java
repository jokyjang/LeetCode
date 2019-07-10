import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Solution20Test {

    @Test
    public void isValid() {
        Solution20 solution = new Solution20();

        assertTrue(solution.isValid("()"));
        assertTrue(solution.isValid("[]"));
        assertTrue(solution.isValid("{}"));
        assertTrue(solution.isValid("()[]{}"));
        assertFalse(solution.isValid("(]"));
        assertFalse(solution.isValid("([)]"));
        assertTrue(solution.isValid("{[]}"));
    }
}