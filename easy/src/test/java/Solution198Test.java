import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution198Test {
    @Test
    public void rob() {
        Solution198 solution = new Solution198();
        assertEquals(4, solution.rob(new int[]{1,2,3,1}));
        assertEquals(4, solution.rob(new int[]{2,1,1,2}));
    }
}