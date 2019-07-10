import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Solution9 {
    public boolean isPalindrome(int x) {
        if (x == 0) {
            return true;
        }
        if (x < 0 || x % 10 == 0) {
            return false;
        }
        int y = x;
        int z = 0;
        while (y != 0) {
            z = z * 10 + y % 10;
            y /= 10;
        }

        return x == z;
    }
}
