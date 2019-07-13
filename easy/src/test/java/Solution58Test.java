import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution58Test {

    @Test
    public void lengthOfLastWord() {
        Solution58 solution = new Solution58();

        assertEquals(5, solution.lengthOfLastWord("Hello World"));
        assertEquals(0, solution.lengthOfLastWord("    "));
        assertEquals(5, solution.lengthOfLastWord("Hello "));
    }
}