import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution190Test {
    @Test
    public void reverseBits() {
        Solution190 solution = new Solution190();
        assertEquals(964176192, solution.reverseBits(43261596));
    }
}