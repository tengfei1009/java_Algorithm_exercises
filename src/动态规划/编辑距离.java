package 动态规划;

public class 编辑距离 {
    public int minDistance(String word1, String word2) {
        //定义dp数组，表示两个字符串转换的最小操作数
        int m = word1.length();
        int n = word2.length();
        int[][] dp = new int[m+1][n+1];

        for (int i = 1; i < m; i++) {
            dp[i][0] = i;
        }
        for (int j = 1; j < n; j++) {
            dp[0][j] = j;
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j <= n; j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    //对第一个进行插入相当于对第二个进行删除
                    //对第一个进行删除相当于对第二个进行插入
                    //对第一个和第二个进行替换,对两个来说,都进行了操作
                    dp[i][j] = Math.min(Math.min(dp[i - 1][j], dp[i][j - 1]), dp[i - 1][j - 1]) + 1;
                }
            }
        }
        return dp[m][n];
    }
}
