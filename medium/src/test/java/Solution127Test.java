import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class Solution127Test {

    @Test
    public void ladderLength() {
        Solution127 solution = new Solution127();

        assertEquals(5, solution.ladderLength("hit", "cog", Arrays.asList(
            "hot", "dot", "dog", "lot", "log", "cog"))
        );
    }
}