// TODO
public class Solution849 {
    public int maxDistToClosest(int[] seats) {
        int max = 0, current = 0;
        for (int i = 0; i < seats.length; ++i) {
            if (seats[i] == 0) {
                ++current;
            } else {
                if (i - current != 0) {
                    max = Math.max(max, (current+1)/2);
                } else {
                    max = Math.max(max, current);
                }
                current = 0;
            }
        }
        return Math.max(max, current);
    }
}
