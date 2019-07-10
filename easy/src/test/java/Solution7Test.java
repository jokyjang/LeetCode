import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution7Test {
    @Test
    public void reverse() {
        Solution7 solution = new Solution7();
        assertEquals(321, solution.reverse(123));
        assertEquals(-321, solution.reverse(-123));
        assertEquals(21, solution.reverse(120));
    }
}