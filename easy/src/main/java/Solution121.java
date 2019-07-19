public class Solution121 {
    public int maxProfit(int[] prices) {
        int max = 0;
        int maxProfit = 0;
        for (int i = 1; i < prices.length; ++i) {
            maxProfit = Math.max(0, maxProfit + prices[i] - prices[i-1]);
            if (max < maxProfit) {
                max = maxProfit;
            }
        }
        return max;
    }
}
