public class Solution11 {
    public int maxArea(int[] height) {
        int length = height.length;
        if (length < 2) {
            return 0;
        }

        int left = 0;
        int right = length - 1;
        int max = 0;
        while (left < right) {
            int area = 0;
            if (height[left] > height[right]) {
                area = (right - left) * height[right];
                right--;
            } else {
                area = (right - left) * height[left];
                left++;
            }
            if (area > max) {
                max = area;
            }
        }
        return max;
    }
}
