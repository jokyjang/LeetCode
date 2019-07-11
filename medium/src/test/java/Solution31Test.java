import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Solution31Test {

    @Test
    public void nextPermutation() {
        Solution31 solution = new Solution31();

        int[] input = new int[]{1, 2, 3};
        solution.nextPermutation(input);
        assertArrayEquals(new int[]{1, 3, 2}, input);

        input = new int[]{5, 1, 1};
        solution.nextPermutation(input);
        assertArrayEquals(new int[]{1, 1, 5}, input);

        input = new int[]{1, 3, 2};
        solution.nextPermutation(input);
        assertArrayEquals(new int[]{2, 1, 3}, input);
    }
}