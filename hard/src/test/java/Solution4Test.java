import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution4Test {

    @Test
    public void findMedianSortedArrays() {
        Solution4 solution = new Solution4();

        assertEquals(2.0, solution.findMedianSortedArrays(
            new int[]{1, 3},
            new int[]{2}
        ), Double.MIN_VALUE);

        assertEquals(2.5, solution.findMedianSortedArrays(
            new int[]{},
            new int[]{2, 3}
        ), Double.MIN_VALUE);

        assertEquals(3.5, solution.findMedianSortedArrays(
            new int[]{4, 5},
            new int[]{2, 3}
        ), Double.MIN_VALUE);
    }
}