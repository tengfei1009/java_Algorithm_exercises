package 动态规划;

public class 买卖股票的最佳时机IV_2 {
    //三维dp数组
    public int maxProfit(int k, int[] prices) {
        if(prices.length == 0) return 0;
        int n = prices.length;
        int[][][] dp =new int[n][k+1][2];

        //dp数组初始化
        for (int i = 0; i < k; i++) {
            dp[0][i][1] = -prices[i];
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                //不持有股票/这一次持有股票卖掉的利润
                dp[i][j][0] = Math.max(dp[i-1][j][0],dp[i-1][j][1]+prices[i]);
                //持有股票/上一次不持有股票的利润
                dp[i][j][1] =Math.max(dp[i-1][j][1],dp[i-1][j-1][0]-prices[i]);
            }
        }
        return dp[n-1][k][0];
    }
}
