import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution27Test {

    /**
     * TODO add more refined tests for in-place replacing.
     */
    @Test
    public void removeElement() {
        Solution27 solution = new Solution27();

        assertEquals(2, solution.removeElement(new int[]{3, 2, 2, 3}, 3));
    }
}