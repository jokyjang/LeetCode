import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Solution162Test {

    @Test
    public void findPeakElement() {
        Solution162 solution = new Solution162();

        assertEquals(2, solution.findPeakElement(new int[]{1,2,3,1}));
        assertTrue(Arrays.asList(1, 5).contains(solution.findPeakElement(new int[]{1,2,1,3,5,6,4})));
    }
}