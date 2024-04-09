package 动态规划;

import java.util.Scanner;

public class 最小路径 {
    public int minPathSum(int[][] grid) {
        //定义一个dp数组,数组的含义是,当前所在位置
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        //初始化dp数组
        dp[0][0] = grid[0][0];
        for (int i = 1; i < m; i++) {
            //zuo一步到达下一步的分数,加上自己的分数,就是从(0,0)开始到达当前(i,j)的分数
            dp[i][0] = dp[i-1][0] + grid[i][0] ;
        }
        for (int i = 1; i < n; i++) {
            //左一步到达右一步的分数,加上自己的分数,就是从(0,0)开始到达当前(i,j)的分数
            dp[0][i] = dp[0][i-1] + grid[0][i];
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = (dp[i - 1][j] < dp[i][j - 1] ? dp[i - 1][j] : dp[i][j - 1]) + grid[i][j];
            }
        }
        return (dp[m - 1][n - 1]);
    }

}
