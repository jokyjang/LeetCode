// TODO
public class Solution678 {
    public boolean checkValidString(String s) {
        return isValid(s.toCharArray(), 0, 0);
    }

    private boolean isValid(char[] s, int i, int count) {
        if (count < 0) return false;
        if (i == s.length) return count == 0;
        if (s[i] == '(') {
            return isValid(s, i+1, count+1);
        } else if (s[i] == ')') {
            return isValid(s, i+1, count-1);
        } else {
            return isValid(s, i+1, count)
                || isValid(s, i+1, count+1)
                || isValid(s, i+1, count-1);
        }
    }
}
