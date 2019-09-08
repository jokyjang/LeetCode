public class Solution1064 {
    public int fixedPoint(int[] A) {
        int low = 0, high = A.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (mid > A[mid]) {
                low = mid + 1;
            } else if (mid < A[mid]) {
                high = mid - 1;
            } else {
                while (mid > 0 && mid-1 == A[mid-1]) {
                    --mid;
                }
                return mid;
            }
        }
        return -1;
    }
}
