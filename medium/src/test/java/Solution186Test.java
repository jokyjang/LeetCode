import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Solution186Test {

    @Test
    public void reverseWord() {
        Solution186 solution = new Solution186();
        char[] s = new char[]{
            't','h','e',' ','s','k','y',' ','i','s',' ','b','l','u','e'
        };
        solution.reverseWords(s);
        assertArrayEquals(new char[]{'b','l','u','e',' ','i','s',' ','s','k','y',' ','t','h','e'}, s);
    }

}