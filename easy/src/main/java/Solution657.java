public class Solution657 {
    // TODO
    public boolean judgeCircle(String moves) {
        int h = 0, v = 0;
        for (int i = 0; i < moves.length(); ++i) {
            switch (moves.charAt(i)) {
                case 'U': v--; break;
                case 'D': v++; break;
                case 'L': h--; break;
                case 'R': h++; break;
                default: throw new RuntimeException("Invalid move!");
            }
        }
        return h == 0 && v == 0;
    }
}
