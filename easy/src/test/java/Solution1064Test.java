import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution1064Test {

    @Test
    public void fixedPoint() {
        Solution1064 solution = new Solution1064();
        assertEquals(3, solution.fixedPoint(new int[]{-10,-5,0,3,7}));
    }
}