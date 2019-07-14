public class Solution75 {
    public void sortColors(int[] nums) {
        int j = 0; // We put all 0s before this index
        int k = nums.length - 1; // We put all 2s after this index
        for (int i = j; i <= k; ++i) {
            if (nums[i] == 0) { // We need to move this value before j, and plus j
                if (i != j) {
                    nums[i] = 1;
                    nums[j] = 0;
                }
                j++;
            } else if (nums[i] == 2) {
                if (i != k) {
                    nums[i] = nums[k];
                    nums[k] = 2;
                }
                k--;
                i--;
            }
        }
    }
}
