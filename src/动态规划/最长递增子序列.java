package 动态规划;

public class 最长递增子序列 {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int res = 0;
        //表示以第几个为结尾的递增子序列
        int[] dp = new int[n];
        for (int i = 0; i < n; i++) {
            dp[i] =1;
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            res = dp[i] > res ? dp[i] : res;
        }
        return res;
    }
}
