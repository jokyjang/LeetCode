import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution8Test {

    @Test
    public void myAtoi() {
        Solution8 solution = new Solution8();
        assertEquals(42, solution.myAtoi("42"));
        assertEquals(42, solution.myAtoi("  42"));
        assertEquals(42, solution.myAtoi("   +42"));
        assertEquals(-42, solution.myAtoi("   -42"));
        assertEquals(0, solution.myAtoi("hello"));
        assertEquals(0, solution.myAtoi("  -hello"));
        assertEquals(786, solution.myAtoi("  786Helloworld"));
    }

}