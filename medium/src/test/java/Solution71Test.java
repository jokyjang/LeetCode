import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution71Test {

    @Test
    public void simplifyPath() {
        Solution71 solution = new Solution71();

        assertEquals("/home", solution.simplifyPath("/home/"));
        assertEquals("/", solution.simplifyPath("/../"));
        assertEquals("/home/foo", solution.simplifyPath("/home//foo/"));
        assertEquals("/c", solution.simplifyPath("/a/./b/../../c/"));
        assertEquals("/c", solution.simplifyPath("/a/../../b/../c//.//"));
        assertEquals("/a/b/c", solution.simplifyPath("/a//b////c/d//././/.."));
    }
}