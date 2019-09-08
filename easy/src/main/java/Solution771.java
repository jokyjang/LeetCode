public class Solution771 {
    public int numJewelsInStones(String J, String S) {
        boolean[] jewel = new boolean[256];
        for (char j : J.toCharArray()) {
            jewel[j] = true;
        }
        int sum = 0;
        for (char s : S.toCharArray()) {
            if (jewel[s]) {
                ++sum;
            }
        }
        return sum;
    }
}
