import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution12Test {

    @Test
    public void intToRoman() {
        Solution12 solution = new Solution12();
        assertEquals("III", solution.intToRoman(3));
        assertEquals("IV", solution.intToRoman(4));
        assertEquals("IX", solution.intToRoman(9));
        assertEquals("LVIII", solution.intToRoman(58));
        assertEquals("MCMXCIV", solution.intToRoman(1994));
        assertEquals("LXXXV", solution.intToRoman(85));
    }
}