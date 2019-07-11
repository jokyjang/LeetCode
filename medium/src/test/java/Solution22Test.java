import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class Solution22Test {

    @Test
    public void generateParenthesis() {
        Solution22 solution = new Solution22();

        List<String> actual = solution.generateParenthesis(3);
        List<String> expect = Arrays.asList("((()))", "(()())", "(())()", "()(())", "()()()");
        assertTrue(actual.containsAll(expect) && expect.containsAll(actual));
    }
}