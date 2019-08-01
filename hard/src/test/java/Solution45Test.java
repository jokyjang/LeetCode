import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution45Test {

    @Test
    public void jump() {
        Solution45 solution = new Solution45();

        assertEquals(2, solution.jump(new int[]{2, 3, 1, 1, 4}));
        assertEquals(0, solution.jump(new int[]{0}));
        assertEquals(3, solution.jump(new int[]{1,2,1,1,1}));
    }

}