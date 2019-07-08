import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution5Test {

    @Test
    public void longestPalindrome() {
        String palindrome = new Solution5().longestPalindrome("aacdefcaa");
        assertEquals("aa", palindrome);
    }
}