package 动态规划;

public class 买股票的最佳时机_2 {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int max =0;
        int mid =0;
        for (int i = 1; i < prices.length; i++) {
            if(prices[i]<min){
                min = prices[i];
            }else {
                mid =prices[i]-min;
                max = Math.max(mid,max);
            }
        }
        return max;
    }
}
