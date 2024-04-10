package 动态规划;

import java.util.ArrayList;
import java.util.Collections;

public class 买卖股票的最佳时机III {
    public int maxProfit(int[] prices) {
        int n = prices.length;

//        dp[i][0]  不操作
//        dp[i][1]  第一次持有
//        dp[i][2]  第一次不持有
//        dp[i][3]  第二次持有
//        dp[i][4]  第二次不持有
        int [][] dp =new int[n][5];
        //都是同一天
        dp[0][1] = -prices[0];
        dp[0][2] = 0;
        dp[0][3] = -prices[0];
        for (int i = 1; i < n; i++) {
            dp[i][1] = Math.max(dp[i-1][1],-prices[i]);
            dp[i][2] = Math.max(dp[i-1][2],dp[i][1]+prices[i]);
            dp[i][3] = Math.max(dp[i-1][3],dp[i][2]-prices[i]);
            dp[i][4] = Math.max(dp[i-1][4],dp[i][3]+prices[i]);
        }
        return dp[n-1][4];
    }
}
