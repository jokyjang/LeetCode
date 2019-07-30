import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution35Test {

    @Test
    public void searchInsert() {
        Solution35 solution = new Solution35();
        assertEquals(2, solution.searchInsert(new int[]{1,3,5,6}, 5));
        assertEquals(4, solution.searchInsert(new int[]{1,3,5,6}, 7));
    }
}