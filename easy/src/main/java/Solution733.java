// TODO
public class Solution733 {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int m = image.length, n = image[0].length, oldColor = image[sr][sc];
        if (oldColor == newColor) {
            return image;
        }
        image[sr][sc] = newColor;
        if (sr > 0 && image[sr-1][sc] == oldColor) floodFill(image, sr-1, sc, newColor);
        if (sr < m-1 && image[sr+1][sc] == oldColor) floodFill(image, sr+1, sc, newColor);
        if (sc > 0 && image[sr][sc-1] == oldColor) floodFill(image, sr, sc-1, newColor);
        if (sc < n-1 && image[sr][sc+1] == oldColor) floodFill(image, sr, sc+1, newColor);
        return image;
    }
}
