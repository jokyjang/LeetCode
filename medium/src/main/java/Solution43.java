public class Solution43 {
    public String multiply(String num1, String num2) {
        int l1 = num1.length();
        int l2 = num2.length();
        int[] digits = new int[l1 + l2];
        for (int i = 0; i < l1; ++i) {
            for (int j = 0; j < l2; ++j) {
                int n1 = num1.charAt(i) - '0';
                int n2 = num2.charAt(j) - '0';
                digits[i+j+1] += n1 * n2;
            }
        }

        int carry = 0;
        for (int i = digits.length - 1; i >= 0; --i) {
            int temp = digits[i] + carry;
            carry = temp / 10;
            digits[i] = temp % 10;
        }
        StringBuilder builder = new StringBuilder();
        for (int digit : digits) {
            builder.append(digit);
        }
        while (builder.length() != 1 && builder.charAt(0) == '0') {
            builder.deleteCharAt(0);
        }
        return builder.toString();
    }
}
