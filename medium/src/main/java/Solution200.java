public class Solution200 {
    public int numIslands(char[][] grid) {
        int result = 0;
        for (int i = 0; i < grid.length; ++i) {
            for (int j = 0; j < grid[i].length; ++j) {
                if (grid[i][j] != '1') continue;
                search(grid, i, j);
                result++;
            }
        }
        return result;
    }

    private void search(char[][] grid, int i, int j) {
        if (grid[i][j] != '1') return;
        grid[i][j] = 'x';
        if (i>0) search(grid, i-1, j);
        if (j>0) search(grid, i, j-1);
        if (i<grid.length-1) search(grid, i+1, j);
        if (j<grid[i].length-1) search(grid, i, j+1);
    }
}
