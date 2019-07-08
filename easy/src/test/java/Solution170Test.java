import org.junit.Test;

import static org.junit.Assert.*;

public class Solution170Test {

    @Test
    public void find_1_3_5() {
        Solution170.TwoSum twoSum = new Solution170.TwoSum();
        twoSum.add(1);
        twoSum.add(3);
        twoSum.add(5);
        assertTrue(twoSum.find(4));
        assertFalse(twoSum.find(7));
    }

    @Test
    public void find_3_1_2() {
        Solution170.TwoSum twoSum = new Solution170.TwoSum();
        twoSum.add(3);
        twoSum.add(1);
        twoSum.add(2);
        assertTrue(twoSum.find(3));
        assertFalse(twoSum.find(6));
    }

    @Test
    public void find_0_0_1() {
        Solution170.TwoSum twoSum = new Solution170.TwoSum();
        twoSum.add(0);
        twoSum.add(0);
        twoSum.add(1);
        assertTrue(twoSum.find(0));
        assertFalse(twoSum.find(2));
    }
}