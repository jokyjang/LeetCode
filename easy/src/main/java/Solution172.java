public class Solution172 {
    public int trailingZeroes(int n) {
        int count = 0;
        long sum = 1L;
        while (sum <= n) {
            sum *= 5;
            count += n / sum;
        }
        return count;
    }
}
