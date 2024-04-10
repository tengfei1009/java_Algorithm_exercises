package 动态规划;


public class 买卖股票的最佳时机 {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int max =0;
        int[] result = new int[n];
        //遍历天数,从当前天开始
        for (int i = 0; i < prices.length; i++) {
            for (int j = i+1; j < prices.length; j++) {
                if(prices[j]>prices[i]){
                    result[i]= Math.max(result[i],prices[j]-prices[i]);
                }
            }
            max = Math.max(max,result[i]);
        }
        return max;
    }
}
