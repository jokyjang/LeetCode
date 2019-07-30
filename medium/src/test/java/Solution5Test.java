import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution5Test {

    @Test
    public void longestPalindrome() {
        Solution5.Matrix matrix = new Solution5.Matrix();
        Solution5.Extending extending = new Solution5.Extending();

        assertEquals("aa", matrix.longestPalindrome("aacdefcaa"));
        assertEquals("aa", extending.longestPalindrome("aacdefcaa"));
    }
}