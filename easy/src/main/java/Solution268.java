public class Solution268 {
    public int missingNumber(int[] nums) {
        int n = nums.length, sum = 0;
        for (int i = 0; i <= n; ++i) {
            sum += i;
        }
        for (int num : nums) {
            sum -= num;
        }
        return sum;
    }
}
