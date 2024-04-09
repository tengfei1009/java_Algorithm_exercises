package 动态规划;

public class 最小路径2 {
    public int minPathSum(int[][] grid) {
        //定义一个dp数组,代表当前格子的最短路径
        int m= grid.length;
        int n = grid[0].length;
        int [][]dp = new int[m][n];

        //初始化边界,因为0是取不到的,而0参与计算,所以要初始化所有0
        dp[0][0] = grid[0][0];
        //定义每一竖行
        for (int i = 1; i < m; i++) {
            dp[i][0] = dp[i-1][0] + grid[i][0];
        }
        //定义每一横行
        for (int i = 1; i < n; i++) {
            dp[0][i] = dp[0][i-1] + grid[0][i];
        }

        //得到关系运算式
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = Math.min(dp[i-1][j] , dp[i][j-1]) + grid[i][j];
            }
        }
        return dp[m-1][n-1];
    }
}
