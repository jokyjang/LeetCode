import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution29Test {

    @Test
    public void divide() {
        Solution29 solution = new Solution29();

        assertEquals(3, solution.divide(10, 3));
        assertEquals(-2, solution.divide(7, -3));
        assertEquals(715827882, solution.divide(2147483647, 3));
        assertEquals(-2147483648, solution.divide(-2147483648, 1));
        assertEquals(2147483647, solution.divide(-2147483648, -1));
        assertEquals(0, solution.divide(0, 3));
    }
}