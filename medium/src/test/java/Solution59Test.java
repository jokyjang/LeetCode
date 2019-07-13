import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Solution59Test {

    @Test
    public void generateMatrix() {
        Solution59 solution = new Solution59();

        assertArrayEquals(new int[][]{{1, 2, 3}, {8, 9, 4}, {7, 6, 5}}, solution.generateMatrix(3));
        assertArrayEquals(new int[][]{{1}}, solution.generateMatrix(1));
    }
}