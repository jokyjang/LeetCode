import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution132Test {

    @Test
    public void minCut() {
        Solution132 solution = new Solution132();
        assertEquals(1, solution.minCut("aab"));
        assertEquals(0, solution.minCut("aa"));
    }
}