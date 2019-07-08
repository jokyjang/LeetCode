import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Solution167Test {
    @Test
    public void twoSum() {
        int[] result = Solution167.twoSum(new int[]{2, 7, 11, 15}, 9);
        assertArrayEquals(new int[]{1, 2}, result);
    }
}