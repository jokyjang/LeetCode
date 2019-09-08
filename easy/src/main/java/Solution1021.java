public class Solution1021 {
    public String removeOuterParentheses(String S) {
        int openCount = 0;
        StringBuilder sb = new StringBuilder();
        for (char s : S.toCharArray()) {
            if (s == '(') {
                if (openCount != 0) {
                    sb.append(s);
                }
                ++openCount;
            } else {
                --openCount;
                if (openCount != 0) {
                    sb.append(s);
                }
            }
        }
        return sb.toString();
    }
}
