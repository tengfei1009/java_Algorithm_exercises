package 动态规划;

public class _1和零 {
    public int findMaxForm(String[] strs, int m, int n) {
        //dp数组的含义是装满m个0和n个1,所需的背包容量为多少
        int[][] dp = new int[m+1][n+1];
        dp[0][0] = 0;
        //外层遍历每个物品
        for (String str : strs) {
            int x = 0;
            int y = 0;
            for (int i = 0; i < str.length(); i++) {
                int c = str.charAt(i);
                if (c == '0') {
                    x++;
                } else {
                    y++;
                }
            }
            for (int i = m; i >= x; i--) {
                for (int j = n; j >= y; j--) {
                    dp[i][j] = Math.max(dp[i][j], dp[i - x][j - y] + 1);
                }
            }
        }
        return dp[m][n];
    }
}
