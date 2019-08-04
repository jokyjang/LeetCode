import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution172Test {

    @Test
    public void trailingZeros() {
        Solution172 solution = new Solution172();

        assertEquals(0, solution.trailingZeroes(3));
        assertEquals(1, solution.trailingZeroes(5));
        assertEquals(452137076, solution.trailingZeroes(1808548329));
    }
}