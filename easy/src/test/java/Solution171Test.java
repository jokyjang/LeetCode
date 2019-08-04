import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution171Test {

    @Test
    public void titleToNumber() {
        Solution171 solution = new Solution171();

        assertEquals(1, solution.titleToNumber("A"));
        assertEquals(28, solution.titleToNumber("AB"));
        assertEquals(701, solution.titleToNumber("ZY"));
    }
}