import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution201Test {

    @Test
    public void rangeBitwiseAnd() {
        Solution201 solution = new Solution201();

        assertEquals(4, solution.rangeBitwiseAnd(5, 7));
        assertEquals(0, solution.rangeBitwiseAnd(0, 1));
        assertEquals(1, solution.rangeBitwiseAnd(1, 1));
        assertEquals(0, solution.rangeBitwiseAnd(1, 2));
    }
}