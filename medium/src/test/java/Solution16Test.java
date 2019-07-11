import org.junit.Test;

import static org.junit.Assert.*;

public class Solution16Test {

    @Test
    public void threeSumCloset() {
        Solution16 solution = new Solution16();

        assertEquals(2, solution.threeSumClosest(new int[]{-1, 2, 1, 4}, 1));
        assertEquals(3, solution.threeSumClosest(new int[]{2, 0, 1}, 3));
    }
}