import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution123Test {

    @Test
    public void maxProfit() {
        Solution123 solution = new Solution123();
        assertEquals(6, solution.maxProfit(new int[]{3,3,5,0,0,3,1,4}));
    }
}