//TODO
public class Solution746 {
    public int minCostClimbingStairs(int[] cost) {
        int cost1 = 0, cost2 = cost[0];
        for (int i = 1; i < cost.length; ++i) {
            int newCost = Math.min(cost1, cost2) + cost[i];
            cost1 = cost2;
            cost2 = newCost;
        }
        return Math.min(cost1, cost2);
    }
}
