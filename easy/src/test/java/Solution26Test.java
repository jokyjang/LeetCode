import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution26Test {

    /**
     * TODO add more refined tests.
     */
    @Test
    public void removeDuplicates() {
        Solution26 solution = new Solution26();
        assertEquals(2, solution.removeDuplicates(new int[]{1, 1, 2}));
        assertEquals(5, solution.removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));
    }
}