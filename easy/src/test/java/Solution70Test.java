import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution70Test {

    @Test
    public void climbStairs() {
        Solution70 solution = new Solution70();

        assertEquals(2, solution.climbStairs(2));
        assertEquals(5, solution.climbStairs(4));
    }

}