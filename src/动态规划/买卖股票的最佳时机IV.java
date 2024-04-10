package 动态规划;

public class 买卖股票的最佳时机IV {
    public int maxProfit(int k, int[] prices) {
        if (prices.length == 0) return 0;
        // [天数][交易次数][是否持有股票]
        int n = prices.length;
        int [][] dp = new int[n][k*2+1];

        // dp数组的初始化, 与版本一同理
        for (int i = 1; i < k*2; i += 2) {
            dp[0][i] = -prices[0];
        }
//        dp[i][0]  不操作
//        dp[i][1]  第一次持有
//        dp[i][2]  第一次不持有
//        dp[i][3]  第二次持有
//        dp[i][4]  第二次不持有
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < k*2 - 1; j += 2) {
                //持有 /前一天持有 /前一天不持有当天持有
                dp[i][j + 1] = Math.max(dp[i - 1][j + 1], dp[i - 1][j] - prices[i]);
                //不持有/前一天不持有/前一天持有当天不持有
                dp[i][j + 2] = Math.max(dp[i - 1][j + 2], dp[i - 1][j + 1] + prices[i]);
            }
        }
        return dp[n - 1][k*2];
    }
}
