import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution771Test {

    @Test
    public void numJewelsInStones() {
        Solution771 solution = new Solution771();
        assertEquals(3, solution.numJewelsInStones("aA", "aAAbbb"));
    }
}