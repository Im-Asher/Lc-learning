public class MinPathSum {
    public int minPathSum(int[][] grid) {
        int ans = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (i == 0 && j == 0)
                    continue;
                else if (i == 0)
                    grid[i][j] = grid[i][j - 1] + grid[i][j];
                else if (j == 0)
                    grid[i][j] = grid[i - 1][j] + grid[i][j];
                else
                    grid[i][j] = Math.min(grid[i - 1][j], grid[i][j - 1]) + grid[i][j];
            }
        }
        ans = grid[grid.length - 1][grid[0].length - 1];
        return ans;

    }
}
