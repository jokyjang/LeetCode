import org.junit.Test;

import static org.junit.Assert.*;

public class Solution14Test {

    @Test
    public void longestCommonPrefix() {
        Solution14 solution = new Solution14();

        assertEquals("", solution.longestCommonPrefix(new String[]{}));
        assertEquals("fl", solution.longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        assertEquals("", solution.longestCommonPrefix(new String[]{"dog", "racecar", "car"}));
        assertEquals("hello", solution.longestCommonPrefix(new String[]{"hello"}));
    }

}