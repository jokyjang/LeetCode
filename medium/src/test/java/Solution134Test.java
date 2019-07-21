import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution134Test {

    @Test
    public void canComplete() {
        Solution134 solution = new Solution134();

        assertEquals(3, solution.canCompleteCircuit(new int[]{1,2,3,4,5}, new int[]{3,4,5,1,2}));
        assertEquals(-1, solution.canCompleteCircuit(new int[]{2,3,4}, new int[]{3,4,3}));
    }

}