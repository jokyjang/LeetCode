import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution50Test {

    @Test
    public void myPow() {
        Solution50 solution = new Solution50();

        double delta = 0.001;
        assertEquals(1024.0, solution.myPow(2.0, 10), delta);
        assertEquals(9.261, solution.myPow(2.1, 3), delta);
        assertEquals(0.25, solution.myPow(2.0, -2), delta);
        assertEquals(0.0, solution.myPow(0.00001, 2147483647), Double.MIN_VALUE);
    }
}