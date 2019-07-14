import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution91Test {
    @Test
    public void numDecodings() {
        Solution91 solution = new Solution91();

        assertEquals(2, solution.numDecodings("12"));
        assertEquals(3, solution.numDecodings("226"));
        assertEquals(0, solution.numDecodings("0"));
        assertEquals(1, solution.numDecodings("34"));
    }

}