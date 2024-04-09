package 动态规划;

public class 打家劫舍 {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==0)return 0;
        if(n==1) return nums[0];
        int[] dp = new int[n];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0],nums[1]);
        for (int i = 2; i < n; i++) {
            //偷当前房屋,和偷前一个房屋
            dp[i] =Math.max(dp[i-1],dp[i-2]+nums[i]);
        }
        return dp[n-1];
    }
}
