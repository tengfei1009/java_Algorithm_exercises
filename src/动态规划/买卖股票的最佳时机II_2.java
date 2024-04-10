package 动态规划;

public class 买卖股票的最佳时机II_2 {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int max = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i]>min) {
                //卖完股票更新最小值
                max += prices[i]-min;
            }
            min = prices[i];
        }
        return max;
    }
}