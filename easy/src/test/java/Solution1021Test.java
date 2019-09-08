import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution1021Test {

    @Test
    public void removeOuterParentheses() {
        Solution1021 solution = new Solution1021();

        assertEquals("()()()", solution.removeOuterParentheses("(()())(())"));
    }
}