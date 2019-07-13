import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Solution55Test {

    @Test
    public void canJump() {
        Solution55 solution = new Solution55();

        assertTrue(solution.canJump(new int[]{2, 3, 1, 1, 4}));
        assertFalse(solution.canJump(new int[]{3, 2, 1, 0, 4}));
    }
}