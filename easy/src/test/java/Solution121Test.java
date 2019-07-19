import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution121Test {

    @Test
    public void maxProfit() {
        Solution121 solution = new Solution121();
        assertEquals(5, solution.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        assertEquals(0, solution.maxProfit(new int[]{7, 6, 5, 4, 3, 2}));
    }
}