// TODO add tests
public class Solution322 {
    public int coinChange(int[] coins, int amount) {
        int[] result = new int[amount+1];
        for (int i = 1; i <= amount; ++i) {
            int count = Integer.MAX_VALUE;
            for (int coin : coins) {
                if (i - coin < 0 || result[i-coin] == -1) continue;
                count = Math.min(count, result[i-coin]+1);
            }
            result[i] = count == Integer.MAX_VALUE ? -1 : count;
        }
        return result[amount];
    }
}
