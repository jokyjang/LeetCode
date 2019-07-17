import java.util.Arrays;

public class QuickSort {

    public int[] quicksort(int[] nums) {
        quicksort(nums, 0, nums.length - 1);
        return nums;
    }

    private void quicksort(int[] nums, int from, int to) {
        if (from == to) {
            return;
        }

        int low = from, high = to - 1;
        while (low < high) {
            if (nums[low] <= nums[to]) {
                low++;
            } else if (nums[high] >= nums[to]) {
                high--;
            } else {
                int temp = nums[low];
                nums[low] = nums[high];
                nums[high] = temp;
                low++;
                high--;
            }
        }
        if (nums[low] > nums[to]) {
            int temp = nums[low];
            nums[low] = nums[to];
            nums[to] = temp;
        }
        quicksort(nums, from, low);
        quicksort(nums, low + 1, to);
    }

    public static void main(String[] args) {
        QuickSort qs = new QuickSort();
        System.out.println(Arrays.toString(qs.quicksort(new int[]{1})));
        System.out.println(Arrays.toString(qs.quicksort(new int[]{3, 4, 2, 7, 5})));
        System.out.println(Arrays.toString(qs.quicksort(new int[]{1, 1, 1, 1, 1})));
        System.out.println(Arrays.toString(qs.quicksort(new int[]{9,8,7,6,5,4,3,2,1})));
    }
}
