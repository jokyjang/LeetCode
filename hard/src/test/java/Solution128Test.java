import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution128Test {

    @Test
    public void longestConsecutive() {
        Solution128 solution = new Solution128();

        assertEquals(4, solution.longestConsecutive(new int[]{100, 4, 200, 1, 3, 2}));
        assertEquals(0, solution.longestConsecutive(new int[]{}));
        assertEquals(1, solution.longestConsecutive(new int[]{0}));
        assertEquals(8, solution.longestConsecutive(new int[]{4,2,2,-4,0,-2,4,-3,-4,-4,-5,1,4,-9,5,0,6,-8,-1,-3,6,5,-8,-1,-5,-1,2,-9,1}));
    }

}