import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Solution9Test {

    @Test
    public void isPalindrome() {
        Solution9 solution = new Solution9();
        assertTrue(solution.isPalindrome(0));
        assertFalse(solution.isPalindrome(10));
        assertTrue(solution.isPalindrome(121));
        assertFalse(solution.isPalindrome(-121));
    }
}