public class Solution4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
        }
        int m = nums1.length;
        int n = nums2.length;

        int min = 0;
        int max = m;

        int size = (m + n + 1) / 2;
        while (min <= max) {
            int i = (min + max) / 2;
            int j = size - i;
            if (i < max && nums1[i] < nums2[j-1]) {
                min = i + 1;
            } else if (i > 0 && nums1[i-1] > nums2[j]) {
                max = i - 1;
            } else {
                int leftBig = 0;
                if (i == 0) {
                    leftBig = nums2[j - 1];
                } else if (j == 0) {
                    leftBig = nums1[i - 1];
                } else {
                    leftBig = Math.max(nums2[j - 1], nums1[i - 1]);
                }

                if ((m + n) % 2 != 0) {
                    return (double)leftBig;
                }

                int rightSmall = 0;

                if (i == m) {
                    rightSmall = nums2[j];
                } else if (j == n) {
                    rightSmall = nums1[i];
                } else {
                    rightSmall = Math.min(nums1[i], nums2[j]);
                }
                return (leftBig + rightSmall)/2.0;
            }
        }
        return 0.0;
    }
}
