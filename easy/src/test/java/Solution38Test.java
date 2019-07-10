import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution38Test {

    @Test
    public void countAndSay() {
        Solution38 solution = new Solution38();

        assertEquals("1", solution.countAndSay(1));
        assertEquals("111221", solution.countAndSay(5));
        assertEquals("312211", solution.countAndSay(6));
    }
}