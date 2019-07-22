import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution150Test {

    @Test
    public void evalRPN() {
        Solution150 solution = new Solution150();

        assertEquals(9, solution.evalRPN(new String[]{"2", "1", "+", "3", "*"}));
        assertEquals(6, solution.evalRPN(new String[]{"4", "13", "5", "/", "+"}));
        assertEquals(22, solution.evalRPN(new String[]{"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"}));
    }

}