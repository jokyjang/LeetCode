import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution69Test {

    @Test
    public void mySqrt() {
        Solution69 solution = new Solution69();

        assertEquals(2, solution.mySqrt(4));

        assertEquals(2, solution.mySqrt(8));
        assertEquals(1, solution.mySqrt(1));
        assertEquals(46340, solution.mySqrt(Integer.MAX_VALUE));
    }

}