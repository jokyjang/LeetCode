// TODO ADD TESTS
public class Solution204 {
    public int countPrimes(int n) {
        int count = 0;
        for (int i = 2; i < n; ++i) {
            if (isPrime(i)) {
                ++count;
            }
        }
        return count;
    }

    private boolean isPrime(int number) {
        if (number < 2) {
            return false;
        } else if (number == 2 || number == 3) {
            return true;
        } else if (number % 2 == 0 || number % 3 == 0) {
            return false;
        } else {
            for (int i = 5; i * i <= number; ++i) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
