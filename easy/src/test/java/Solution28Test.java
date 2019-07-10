import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution28Test {

    @Test
    public void strStr() {
        Solution28 solution = new Solution28();

        assertEquals(0, solution.strStr("hello", ""));
        assertEquals(2, solution.strStr("hello", "ll"));
        assertEquals(-1, solution.strStr("aaaaa", "bba"));
    }
}