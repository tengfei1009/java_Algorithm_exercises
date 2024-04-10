package 动态规划;

public class 买卖股票的最佳时机II {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if(n<=1) return 0;
        if(n==2) return prices[1]>prices[0]? prices[1]-prices[0]:0;
        //dp[i][0] 表示持有股票的最大利润
        //dp[i][1] 表示没有持有股票的最大利润
        int[][] dp = new int[n][2];
        dp[0][0] = 0;
        dp[0][1] = -prices[0];
        for (int i = 1; i <n; i++) {
            //当前持有股票/前面持有股票/前面没有持有股票,今天买了才有的
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] - prices[i]);
            //当前没有持有股票/前面没有持有股票获得的利润,或者前面持有股票,今天卖了加上利润
            dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] + prices[i]);
        }
        return dp[n-1][1];
    }
}