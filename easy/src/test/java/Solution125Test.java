import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Solution125Test {

    @Test
    public void isPalindrome() {
        Solution125 solution = new Solution125();

        assertTrue(solution.isPalindrome("A man, a plan, a canal: Panama"));
        assertFalse(solution.isPalindrome("0P"));
        assertTrue(solution.isPalindrome(""));
    }
}