import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Solution88Test {

    @Test
    public void merge() {
        Solution88 solution = new Solution88();

        int[] input = new int[]{1,2,3,0,0,0};
        solution.merge(input, 3, new int[]{2,5,6}, 3);
        assertArrayEquals(new int[]{1,2,2,3,5,6}, input);
    }
}