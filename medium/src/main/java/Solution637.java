// TODO
public class Solution637 {
    public int findNumberOfLIS(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int[] length = new int[nums.length];
        int[] number = new int[nums.length];
        int maxLength = 1, maxNumber = 1;
        length[0] = 1;
        number[0] = 1;
        for (int i = 1; i < nums.length; ++i) {
            length[i] = 1;
            number[i] = 1;
            for (int j = i - 1; j >= 0; --j) {
                if (nums[j] >= nums[i] || length[j] + 1 < length[i]) continue;
                if (length[j] + 1 == length[i]) {
                    number[i] += number[j];
                } else {
                    length[i] = length[j] + 1;
                    number[i] = number[j];
                }
            }
            if (maxLength < length[i]) {
                maxLength = length[i];
                maxNumber = number[i];
            } else if (maxLength == length[i]) {
                maxNumber += number[i];
            }
        }
        return maxNumber;
    }
}
