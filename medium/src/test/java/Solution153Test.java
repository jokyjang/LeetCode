import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution153Test {

    @Test
    public void findMin() {
        Solution153 solution = new Solution153();

        assertEquals(1, solution.findMin(new int[]{3, 4, 5, 1, 2}));
        assertEquals(0, solution.findMin(new int[]{4,5,6,7,0,1,2}));
    }

}