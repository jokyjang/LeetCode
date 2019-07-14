import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Solution75Test {

    @Test
    public void sortColors() {
        Solution75 solution = new Solution75();

        int[] input = new int[]{2,0,2,1,1,0};
        solution.sortColors(input);

        assertArrayEquals(new int[]{0,0,1,1,2,2}, input);
    }

}