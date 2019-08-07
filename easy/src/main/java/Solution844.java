// TODO
public class Solution844 {
    public boolean backspaceCompare(String S, String T) {
        int i = find(S, S.length() - 1), j = find(T, T.length() - 1);
        while (i >= 0 && j >= 0 && S.charAt(i) == T.charAt(j)) {
            i = find(S, i-1);
            j = find(T, j-1);
        }
        return i < 0 && j < 0;
    }

    private int find(String s, int i) {
        int numSharp = 0;
        while (i >= 0 && (numSharp != 0 || s.charAt(i) == '#')) {
            if (s.charAt(i) == '#') {
                ++numSharp;
            } else {
                --numSharp;
            }
            --i;
        }
        return i;
    }
}
