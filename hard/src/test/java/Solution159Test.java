import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution159Test {

    @Test
    public void lengthOfLongestSubstring() {
        Solution159 solution = new Solution159();

        assertEquals(3, solution.lengthOfLongestSubstringTwoDistinct("eceba"));
        assertEquals(5, solution.lengthOfLongestSubstringTwoDistinct("ccaabbb"));
    }

}