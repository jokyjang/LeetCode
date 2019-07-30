public class Solution42 {
    public int trap(int[] height) {
        if (height == null || height.length < 3) {
            return 0;
        }
        int low = 0, high = height.length - 1, result = 0;
        int leftPeak = height[low++], rightPeak = height[high--];
        while (low <= high) {
            if (height[low] > leftPeak) {
                leftPeak = height[low];
                low++;
            } else if (height[high] > rightPeak) {
                rightPeak = height[high];
                high--;
            } else if (leftPeak <= rightPeak) {
                result += leftPeak - height[low];
                low++;
            } else {
                result += rightPeak - height[high];
                high--;
            }
        }
        return result;
    }
}
