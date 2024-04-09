package 动态规划;

public class 不同路径2 {
    public int uniquePaths(int m, int n) {
        //定义dp数组
        int [][]dp = new int[m][n];

        //初始化,选择走右边,或者选择走下边
        //因为是如何渲染,是上面的加左边的,所以需要初始化上面还有左边
        for (int i = 0; i < m; i++) {
            dp[i][0] =1;
        }
        for (int i = 0; i < n; i++) {
            dp[0][i] =1;
        }
        //结束条件,最后,需要算的,从(1,1)开始延伸
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                //最后加到 i,j
                dp[i][j] = dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }
}
