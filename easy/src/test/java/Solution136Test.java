import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution136Test {

    @Test
    public void singleNumber() {
        Solution136 solution = new Solution136();

        assertEquals(1, solution.singleNumber(new int[]{2, 2, 1}));
        assertEquals(4, solution.singleNumber(new int[]{4, 1, 2, 1, 2}));
    }

}