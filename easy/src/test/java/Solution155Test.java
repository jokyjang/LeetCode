import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution155Test {

    @Test
    public void minStack() {
        Solution155 solution = new Solution155();

        solution.push(-2);
        solution.push(0);
        solution.push(-3);
        assertEquals(-3, solution.getMin());
        solution.pop();
        assertEquals(0, solution.top());
        assertEquals(-2, solution.getMin());
    }
}