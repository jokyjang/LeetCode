import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class Solution17Test {

    @Test
    public void letterCombinations() {
        Solution17 solution = new Solution17();

        List<String> actual = solution.letterCombinations("23");
        List<String> expected = Arrays.asList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf");
        assertTrue(expected.containsAll(actual) && actual.containsAll(expected));
    }
}