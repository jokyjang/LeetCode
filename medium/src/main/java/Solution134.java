public class Solution134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tank = 0, min = 0, index = 0;
        for (int i = 0; i < gas.length; ++i) {
            tank = tank + gas[i] - cost[i];
            if (min >= tank) {
                min = tank;
                index = i;
            }
        }
        if (tank >= 0) {
            return (index + 1) % gas.length;
        } else {
            return -1;
        }
    }
}
