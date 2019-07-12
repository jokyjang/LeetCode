import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution43Test {

    @Test
    public void multiply() {
        Solution43 solution = new Solution43();
        assertEquals("6", solution.multiply("2", "3"));
        assertEquals("56088", solution.multiply("123", "456"));
    }
}