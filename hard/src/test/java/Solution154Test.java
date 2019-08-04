import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution154Test {

    @Test
    public void findMin() {
        Solution154 solution = new Solution154();
        assertEquals(1, solution.findMin(new int[]{1,3,5}));
        assertEquals(0, solution.findMin(new int[]{2,2,2,0,1}));
    }
}