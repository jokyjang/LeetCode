import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution41Test {
    @Test
    public void firstMissingPositive() {
        Solution41 solution = new Solution41();
        assertEquals(3, solution.firstMissingPositive(new int[]{1,2,0}));
        assertEquals(2, solution.firstMissingPositive(new int[]{3,4,-1,1}));
        assertEquals(2, solution.firstMissingPositive(new int[]{1, 1}));
    }

}