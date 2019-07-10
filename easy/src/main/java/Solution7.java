public class Solution7 {
    public int reverse(int x) {
        int sign = 1;
        long value = x;
        if (x < 0) {
            sign = -1;
            value = -value;
        }

        long rev = 0;
        while (value != 0) {
            rev = rev * 10 + value % 10;
            value = value / 10;
        }
        rev = rev * sign;

        if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
            return 0;
        }

        return (int)rev;
    }
}
