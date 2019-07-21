import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution151Test {

    @Test
    public void reverseWords() {
        Solution151 solution = new Solution151();
        assertEquals("blue is sky the", solution.reverseWords("the sky is blue"));
        assertEquals("world! hello", solution.reverseWords("  hello world!  "));
        assertEquals("example good a", solution.reverseWords("a good   example"));
    }
}