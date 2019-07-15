import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Solution139Test {

    @Test
    public void wordBreak() {
        Solution139 solution = new Solution139();

        assertTrue(solution.wordBreak("leetcode", Arrays.asList("leet", "code")));
        assertTrue(solution.wordBreak("applepenapple", Arrays.asList("apple", "pen")));
        assertFalse(solution.wordBreak("catsandog", Arrays.asList("cats", "dog", "sand", "and", "cat")));
    }

}