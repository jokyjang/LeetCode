import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution168Test {

    @Test
    public void convertToTitle() {
        Solution168 solution = new Solution168();
        assertEquals("A", solution.convertToTitle(1));
        assertEquals("AB", solution.convertToTitle(28));
        assertEquals("ZY", solution.convertToTitle(701));
    }
}