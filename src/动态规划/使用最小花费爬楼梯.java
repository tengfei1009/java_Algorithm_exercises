package 动态规划;

public class 使用最小花费爬楼梯 {
    public int minCostClimbingStairs(int[] cost) {
        //总共需要花费台阶的长度，一次判断前两个，哪一个跳到第三个最小
        int n = cost.length;
        //dp数组的下标代表到了哪个台阶了，dp数组的值代表最小消耗
        //dp数组的含义：到达i位置的最小花费为dp[i]
        //从0~n,一共n+1个台阶，数组的长度定义为n+1,最后需要到达的台阶为n
        int []dp = new int[n +1];
        //到达楼顶的最小花费,初始化两个
        dp[0] = 0;
        dp[1] =0;
        //判断，到达走一步还是走两步
        for (int i = 2; i <= n; i++) {
            dp[i] = Math.min((dp[i-1] +cost[i-1]),(dp[i-2]+cost[i-2]));//算出来dp[2]是多少，继续往下算，一直算到dp[len]
        }
        return dp[n];
    }
}
