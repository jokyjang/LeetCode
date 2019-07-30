import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Solution10Test {

    @Test
    public void isMatch() {
        Solution10 solution = new Solution10();

        assertTrue(solution.isMatch("aa", "a*"));
        assertFalse(solution.isMatch("aa", "a"));
        assertTrue(solution.isMatch("ab", ".*"));
    }
}