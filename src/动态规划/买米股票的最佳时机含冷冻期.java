package 动态规划;

public class 买米股票的最佳时机含冷冻期 {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int [][]dp =new int[n][3];
        //持有股票
        dp[0][0] = -prices[0];
        //不持有股票
        dp[0][1]=0;
        //冷冻期
        dp[0][2] =0;
        for (int i = 1; i < n; i++) {
            //买入，在上一个冷冻期的后一天才能买入
            dp[i][0] = Math.max(dp[i-1][0],dp[i-1][2]-prices[i]);
            //卖出
            dp[i][1] =Math.max(dp[i-1][1],dp[i-1][0]+prices[i]);
            //冷冻，等于前一天卖出
            dp[i][2] =dp[i-1][1];
        }
        return Math.max(dp[n-1][1],dp[n-1][2]);
    }
}
