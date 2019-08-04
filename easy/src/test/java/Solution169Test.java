import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution169Test {

    @Test
    public void majorityElement() {
        Solution169 solution = new Solution169();
        assertEquals(3, solution.majorityElement(new int[]{3,2,3}));
        assertEquals(2, solution.majorityElement(new int[]{2,2,1,1,1,2,2}));
    }

}