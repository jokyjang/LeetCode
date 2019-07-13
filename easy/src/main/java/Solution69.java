public class Solution69 {
    public int mySqrt(int x) {
        int low = 1;
        int high = x;
        while (low <= high) {
            int middle = low+(high - low)/2;
            int value = x / middle;
            int value2 = x/ (middle +1);
            if (value >= middle && value2 < middle + 1) {
                return middle;
            }
            if (value > middle) {
                low = middle + 1;
            } else {
                high = middle - 1;
            }
        }
        return 0;
    }
}
