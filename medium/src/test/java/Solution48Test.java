import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Solution48Test {

    @Test
    public void rotate() {
        Solution48 solution = new Solution48();

        int[][] matrix = new int[][]{
            {1,2,3},{4,5,6},{7,8,9}
        };
        solution.rotate(matrix);
        assertArrayEquals(new int[][]{{7,4,1},{8,5,2},{9,6,3}}, matrix);
    }
}