import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution11Test {

    @Test
    public void maxArea() {
        Solution11 solution = new Solution11();
        assertEquals(49, solution.maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }
}