// TODO
public class Solution415 {
    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int carry = 0, m = num1.length(), n = num2.length();
        for (int i = m-1, j = n-1; i >= 0 || j >= 0; --i, --j) {
            int sum = carry;
            if (i >= 0) {
                sum += num1.charAt(i) - '0';
            }
            if (j >= 0) {
                sum += num2.charAt(j) - '0';
            }
            carry = sum / 10;
            sb.insert(0, sum % 10);
        }
        if (carry > 0) sb.insert(0, carry);
        return sb.toString();
    }
}
