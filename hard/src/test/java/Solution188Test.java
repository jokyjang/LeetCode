import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution188Test {

    @Test
    public void maxProfit() {
        Solution188 solution = new Solution188();
        assertEquals(2, solution.maxProfit(2, new int[]{2,4,1}));
        assertEquals(7, solution.maxProfit(2, new int[]{3,2,6,5,0,3}));
    }
}