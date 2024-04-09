package 动态规划;


public class 零钱兑换II {
    public int change(int amount, int[] coins) {
        //装满背包容量为j的背包有dp[j]种方法
        int[] dp = new int[amount + 1];
        dp[0] =1; //凑成0,可以有一种
        //遍历每种物品
//        2、装满原容量为1的背包，有dp[4]种方法; 装满原容量为2的背包，有dp[3]种方法; 装满原容量为3的背包，有dp[2]种方法; 装满原容量为4的背包，有dp[1]种方法; 装满原容.....
//        比如说dp1，dp1有一种方法的话，1+4等于5，相当于有几种方法组成dp1，就有几种方法组成dp5，dp2 dp3 dp4同理，其实前面也有类似的题，我记得是不同路径？思想很像
        //背包容量为5,在里面背包容量为1的有多少种,加上背包容量为2的有多少种,加上背包容量为3的有多少种,加上背包容量为4的有多少种
        for (int i = 0; i < coins.length; i++) {
            //遍历容量
            for(int j =coins[i];j<=amount;j++){
                dp[j] += dp[j-coins[i]];
            }
        }
        return dp[amount];
    }
}
