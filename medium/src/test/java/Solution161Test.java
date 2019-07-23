import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Solution161Test {

    @Test
    public void isOneEditDistance() {
        Solution161 solution = new Solution161();

        assertTrue(solution.isOneEditDistance("ab", "acb"));
        assertTrue(solution.isOneEditDistance("1213", "1203"));
        assertFalse(solution.isOneEditDistance("", ""));
    }
}