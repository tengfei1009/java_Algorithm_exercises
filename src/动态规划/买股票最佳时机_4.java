package 动态规划;


public class 买股票最佳时机_4 {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        //定义一个二维dp数组
//        dp[i][0]表示持有该股票
        int [][]dp = new int[n][2];
        //持有股票的最大收益
        dp[0][0] =-prices[0];
        //不持有股票的最大收益
        dp[0][1] = 0;
        for (int i = 1; i < prices.length; i++) {
            //持有股票,最大收益
            dp[i][0] =Math.max(dp[i-1][0],-prices[i]);
            //不持有股票,金额最大
            dp[i][1]=Math.max(dp[i-1][1],dp[i][0]+prices[i]);
        }
        return dp[dp.length-1][1];
    }
}
