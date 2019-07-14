import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Solution81Test {

    @Test
    public void search() {
        Solution81 solution = new Solution81();

        assertTrue(solution.search(new int[]{2, 5, 6, 0, 0, 1, 2}, 0));
        assertTrue(solution.search(new int[]{1, 3, 5}, 5));
        assertFalse(solution.search(new int[]{2, 5, 6, 0, 0, 1, 2}, 3));
    }
}