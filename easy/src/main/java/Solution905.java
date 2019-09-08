// TODO
public class Solution905 {
    public int[] sortArrayByParity(int[] A) {
        int low = 0, high = A.length - 1;
        while (low <= high) {
            if (A[low] % 2 == 0) {
                ++low;
                continue;
            }
            if (A[high] % 2 != 0) {
                --high;
                continue;
            }
            int temp = A[low];
            A[low] = A[high];
            A[high] = temp;
            ++low;
            --high;
        }
        return A;
    }
}
