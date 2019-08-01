import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Solution57Test {

    @Test
    public void insert() {
        Solution57 solution = new Solution57();

        assertArrayEquals(
            new int[][]{{1, 5}, {6, 9}},
            solution.insert(
                new int[][]{{1, 3}, {6, 9}},
                new int[]{2, 5}
            )
        );
    }
}