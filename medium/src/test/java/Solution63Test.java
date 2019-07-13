import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution63Test {

    @Test
    public void uniquePathsWithObstacles() {
        Solution63 solution = new Solution63();

        assertEquals(2, solution.uniquePathsWithObstacles(new int[][]{{0, 0, 0}, {0, 1, 0}, {0, 0, 0}}));
    }

}