public class Solution188 {
    public int maxProfit(int k, int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        int n = prices.length;
        if (k >= n/2) {
            return quickFind(prices);
        }
        int[][] profits = new int[k+1][n];
        for (int i = 1; i <= k; ++i) {
            int tempMax = profits[i-1][0] - prices[0];
            for (int j = 1; j < n; ++j) {
                profits[i][j] = Math.max(profits[i][j-1], prices[j]+tempMax);
                tempMax = Math.max(tempMax, profits[i-1][j] - prices[j]);
            }
        }
        return profits[k][n-1];
    }

    private int quickFind(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; ++i) {
            if (prices[i] > prices[i-1]) {
                profit += prices[i] - prices[i-1];
            }
        }
        return profit;
    }
}
