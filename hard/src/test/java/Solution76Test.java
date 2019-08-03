import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution76Test {

    @Test
    public void minWindow() {
        Solution76 solution = new Solution76();
        assertEquals("BANC", solution.minWindow("ADOBECODEBANC", "ABC"));
        assertEquals("", solution.minWindow("a", "aa"));
    }

}