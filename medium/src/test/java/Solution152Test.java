import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution152Test {

    @Test
    public void maxProduct() {
        Solution152 solution = new Solution152();
        assertEquals(6, solution.maxProduct(new int[]{2, 3, -2, 4}));
        assertEquals(0, solution.maxProduct(new int[]{-2, 0, -1}));
    }

}