import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Solution73Test {

    @Test
    public void setZeroes() {
        Solution73 solution = new Solution73();

        int[][] input = new int[][]{{1,1,1}, {1,0,1}, {1,1,1}};
        solution.setZeroes(input);
        assertArrayEquals(new int[][]{{1,0,1}, {0,0,0}, {1,0,1}}, input);

        input = new int[][]{{0,1,2,0}, {3,4,5,2}, {1,3,1,5}};
        solution.setZeroes(input);
        assertArrayEquals(new int[][]{{0,0,0,0}, {0,4,5,0}, {0,3,1,0}}, input);
    }
}