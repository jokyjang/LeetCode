public class Solution190 {
    public int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; ++i) {
            result |= n & 0x01;
            if (i != 31) {
                result <<= 1;
            }
            n >>= 1;
        }
        return result;
    }
}
