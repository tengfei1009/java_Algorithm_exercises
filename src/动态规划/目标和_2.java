package 动态规划;

import java.util.regex.Pattern;

public class 目标和_2 {
    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        if (sum < Math.abs(target)) {
            return 0;
        }
        if (sum + target % 2 != 0) {
            return 0;
        }
        int left = (sum + target) / 2;

//        dp[i][j] :遍历到数组第i个数时,left为j时,能装满背包的方法总数
        int[][] dp = new int[nums.length][left + 1];

        if (nums[0] <= left) {
            dp[0][nums[0]] = 1;
        }
        int numZeros = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                numZeros++;
            }
            dp[i][0] = (int) Math.pow(2, numZeros);
        }
        return dp[nums.length - 1][left];
    }

}
