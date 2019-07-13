public class Solution67 {
    public String addBinary(String a, String b) {
        int i = 0;
        int m = a.length();
        int n = b.length();
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        while (i < m || i < n) {
            if (i >= m) {
                int bit = b.charAt(n - i - 1) - '0';
                sb.insert(0, carry ^ bit);
                carry = carry & bit;
            } else if (i >= n) {
                int bit = a.charAt(m - i - 1) - '0';
                sb.insert(0, carry ^ bit);
                carry = carry & bit;
            } else {
                int bitA = a.charAt(m - i - 1) - '0';
                int bitB = b.charAt(n - i - 1) - '0';

                sb.insert(0, (bitA ^ bitB) ^ carry);
                carry = (bitA & bitB) ^ (carry & (bitA ^ bitB));
            }
            ++i;
        }
        if (carry != 0) {
            sb.insert(0, carry);
        }
        return sb.toString();
    }
}
