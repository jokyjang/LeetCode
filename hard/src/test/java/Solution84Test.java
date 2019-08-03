import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution84Test {

    @Test
    public void largestRectangleArea() {
        Solution84 solution = new Solution84();

        assertEquals(10, solution.largestRectangleArea(new int[]{2,1,5,6,2,3}));
        assertEquals(20, solution.largestRectangleArea(new int[]{3,6,5,7,4,8,1,0}));
    }

}