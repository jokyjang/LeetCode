import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution215Test {

    @Test
    public void findKthLargest() {
        Solution215 solution = new Solution215();

        assertEquals(5, solution.findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 2));
    }

}