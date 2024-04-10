package 动态规划;

public class 买卖股票的最佳时机_3 {
    public int maxProfit(int[] prices) {
        int max =0;
        int min =prices[0];
        for (int i = 1; i < prices.length; i++) {
            min = Math.min(min,prices[i]);
            max = Math.max(prices[i]-min,max);
        }
        return max;
    }
}
