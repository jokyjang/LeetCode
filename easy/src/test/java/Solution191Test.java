import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution191Test {
    @Test
    public void hammingWeight() {
        Solution191 solution = new Solution191();
        assertEquals(3, solution.hammingWeight(11));
    }
}