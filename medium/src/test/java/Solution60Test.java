import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution60Test {

    @Test
    public void getPermutation() {
        Solution60 solution = new Solution60();

        assertEquals("213", solution.getPermutation(3, 3));
    }
}