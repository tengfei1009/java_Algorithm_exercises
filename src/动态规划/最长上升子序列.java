package 动态规划;

import java.util.Arrays;

public class 最长上升子序列 {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        //dp数组的含义是以第几个为结尾的最长子序列的长度
        int []dp = new int[n];
        int max =1;
        Arrays.fill(dp,1);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if(nums[i]>nums[j]){
                    dp[i] = Math.max(dp[j]+1,dp[i]);
                }
            }
            max= dp[i]>max?dp[i]:max;
        }
        return max;
    }
}