import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution53Test {

    @Test
    public void maxSubArray() {
        Solution53 solution = new Solution53();

        assertEquals(6, solution.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }
}