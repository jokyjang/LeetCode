import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution179Test {

    @Test
    public void largestNumber() {
        Solution179 solution = new Solution179();

        assertEquals("210", solution.largestNumber(new int[]{10, 2}));
        assertEquals("0", solution.largestNumber(new int[]{0, 0}));
        assertEquals("9609938824824769735703560743981399",
            solution.largestNumber(new int[]{
                824,938,1399,5607,6973,5703,9609,4398,8247
            })
        );
        assertEquals("12121", solution.largestNumber(new int[]{121,12}));
    }

}