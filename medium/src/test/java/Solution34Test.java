import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Solution34Test {

    @Test
    public void searchRange() {
        Solution34 solution = new Solution34();

        int[] actual = solution.searchRange(new int[]{5,7,7,8,8,10}, 8);
        assertArrayEquals(new int[]{3, 4}, actual);
    }

}