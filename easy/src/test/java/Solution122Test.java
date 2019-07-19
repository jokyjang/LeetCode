import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution122Test {

    @Test
    public void maxProfit() {
        Solution122 solution = new Solution122();

        assertEquals(7, solution.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        assertEquals(4, solution.maxProfit(new int[]{1, 2, 3, 4, 5}));
        assertEquals(0, solution.maxProfit(new int[]{7, 6, 4, 3, 1}));
    }

}