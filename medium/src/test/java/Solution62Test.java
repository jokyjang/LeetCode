import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution62Test {

    @Test
    public void uniquePaths() {
        Solution62 solution = new Solution62();

        assertEquals(28, solution.uniquePaths(7, 3));
        assertEquals(3, solution.uniquePaths(3, 2));
        assertEquals(1, solution.uniquePaths(1, 1));
    }
}