import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Solution1Test {

    @Test
    public void twoSum() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = Solution1.twoSum(nums, target);
        assertArrayEquals(new int[]{0, 1}, result);
    }
}
