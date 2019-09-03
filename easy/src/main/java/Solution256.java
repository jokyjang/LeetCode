//TODO
public class Solution256 {
    public int minCost(int[][] costs) {
        if (costs.length == 0) return 0;
        int[] minCost = costs[0].clone();
        for (int i = 1; i < costs.length; ++i) {
            int[] cost = costs[i].clone();
            cost[0] += Math.min(minCost[1], minCost[2]);
            cost[1] += Math.min(minCost[0], minCost[2]);
            cost[2] += Math.min(minCost[0], minCost[1]);
            minCost = cost;
        }
        return Math.min(Math.min(minCost[0], minCost[1]), minCost[2]);
    }
}
