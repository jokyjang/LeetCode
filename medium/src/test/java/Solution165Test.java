import org.junit.Test;

import static org.junit.Assert.*;

public class Solution165Test {

    @Test
    public void compareVersion() {
        Solution165 solution = new Solution165();

        assertEquals(0, solution.compareVersion("1.0", "1"));
        assertEquals(-1, solution.compareVersion("0.1", "1.1"));
        assertEquals(-1, solution.compareVersion("7.5.2.4", "7.5.3"));
    }

}