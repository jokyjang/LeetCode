public class Solution201 {
    public int rangeBitwiseAnd(int m, int n) {
        int highBit = 0, shift = 30;
        while (shift >= 0) {
            int targetNumber = 0x01 << shift;
            if (m >= targetNumber) {
                highBit |= targetNumber;
                m -= targetNumber;
                n -= targetNumber;
            } else if (n >= targetNumber) {
                return highBit;
            }
            --shift;
        }
        return highBit;
    }
}
