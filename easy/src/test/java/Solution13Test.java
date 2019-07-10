import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution13Test {

    @Test
    public void romanToInt() {
        Solution13 solution = new Solution13();

        assertEquals(3, solution.romanToInt("III"));
        assertEquals(4, solution.romanToInt("IV"));
        assertEquals(9, solution.romanToInt("IX"));
        assertEquals(58, solution.romanToInt("LVIII"));
        assertEquals(1994, solution.romanToInt("MCMXCIV"));
        assertEquals(999, solution.romanToInt("CMXCIX"));
    }
}