import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution200Test {

    @Test
    public void numIslands() {
        Solution200 solution = new Solution200();
        assertEquals(1, solution.numIslands(new char[][]{
            {'1', '1', '1', '1', '0'},
            {'1', '1', '0', '1', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '0', '0', '0'}
        }));
    }

}