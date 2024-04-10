package 动态规划;

public class 买卖股票的最佳时机II_3 {
    public int maxProfit(int[] prices) {
        int sum =0;
        for (int i = 1; i < prices.length; i++) {
            int temp = prices[i]-prices[i-1];
            if(temp>0){
                sum+=temp;
            }
        }
        return sum;
    }
}
