import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution64Test {

    @Test
    public void minPathSum() {
        Solution64 solution = new Solution64();

        assertEquals(7, solution.minPathSum(new int[][]{{1,3,1}, {1,5,1}, {4,2,1}}));
    }

}