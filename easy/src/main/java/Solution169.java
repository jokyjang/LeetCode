public class Solution169 {
    public int majorityElement(int[] nums) {
        int currentElement = nums[0], currentCount = 1;
        for (int i = 1; i < nums.length; ++i) {
            if (nums[i] == currentElement) {
                currentCount++;
            } else {
                currentCount--;
                if (currentCount == -1) {
                    currentElement = nums[i];
                    currentCount = 1;
                }
            }
        }
        return currentElement;
    }
}
