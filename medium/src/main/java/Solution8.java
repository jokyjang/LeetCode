public class Solution8 {
    public int myAtoi(String str) {
        int i = 0;
        // Process space chars
        while (i < str.length() && str.charAt(i) == ' ') {
            i++;
        }
        // If all the chars are space, return 0
        if (i == str.length()) {
            return 0;
        }
        int sign = 1;
        if (str.charAt(i) == '-') {
            sign = -1;
            i++;
        } else if (str.charAt(i) == '+') {
            i++;
        }

        long value = 0;
        while (i < str.length() && '0' <= str.charAt(i) && '9' >= str.charAt(i)) {
            value = value * 10 + (long)(str.charAt(i) - '0');
            if (sign * value > (long)Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            } else if (sign * value < (long)Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            ++i;
        }
        return (int)(sign*value);
    }
}
