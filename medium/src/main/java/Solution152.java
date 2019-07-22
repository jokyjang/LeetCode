public interface Solution152 {
    int maxProduct(int[] nums);

    class ON implements Solution152 {
        @Override
        public int maxProduct(int[] nums) {
            int maxPositive = 0, minNegative = 0;
            int max = nums[0];
            if (nums[0] > 0) {
                maxPositive = nums[0];
            } else if (nums[0] < 0) {
                minNegative = nums[0];
            }
            for (int i = 1; i < nums.length; ++i) {
                if (nums[i] > 0) {
                    maxPositive = Math.max(nums[i], nums[i] * maxPositive);
                    minNegative = nums[i] * minNegative;
                } else if (nums[i] < 0) {
                    int temp = maxPositive;
                    maxPositive = nums[i] * minNegative;
                    minNegative = Math.min(nums[i], nums[i] * temp);
                } else {
                    maxPositive = 0;
                    minNegative = 0;
                }
                max = Math.max(max, maxPositive);
            }
            return max;
        }
    }

    class ON2 implements Solution152 {
        @Override
        public int maxProduct(int[] nums) {
            int[] products = new int[nums.length];
            int max = nums[0];
            for (int i = 0; i < nums.length; ++i) {
                products[i] = nums[i];
                max = Math.max(max, products[i]);
                for (int j = 0; j < i; ++j) {
                    products[j] = products[j] * nums[i];
                    max = Math.max(max, products[j]);
                }
            }

            return max;
        }
    }
}
