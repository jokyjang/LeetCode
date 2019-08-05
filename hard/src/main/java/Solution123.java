public class Solution123 {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0;
        }
        int n = prices.length, temp1X = -prices[0], temp2X = -prices[0];
        int[][] profits = new int[2][n];
        for (int j = 1; j < n; ++j) {
            profits[0][j] = Math.max(profits[0][j-1], prices[j] + temp1X);
            profits[1][j] = Math.max(profits[1][j-1], prices[j] + temp2X);
            temp1X = Math.max(temp1X, -prices[j]);
            temp2X = Math.max(temp2X, profits[0][j]-prices[j]);
        }
        return profits[1][n-1];
    }
}
