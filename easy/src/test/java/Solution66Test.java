import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution66Test {

    @Test
    public void plusOne() {
        Solution66 solution = new Solution66();

        assertEquals(new int[]{1,2,4}, solution.plusOne(new int[]{1,2,3}));
        assertEquals(new int[]{1,0,0,0}, solution.plusOne(new int[]{9,9,9}));
    }
}