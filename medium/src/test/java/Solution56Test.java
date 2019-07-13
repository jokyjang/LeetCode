import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Solution56Test {

    @Test
    public void merge() {
        Solution56 solution = new Solution56();

        int[][] actual = solution.merge(new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}});
        int[][] expected = new int[][]{{1, 6}, {8, 10}, {15, 18}};
        assertArrayEquals(expected, actual);
    }

}