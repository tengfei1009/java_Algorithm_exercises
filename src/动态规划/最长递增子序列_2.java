package 动态规划;

import java.util.Arrays;

public class 最长递增子序列_2 {
    public int lengthOfLIS(int[] nums) {
        int n =nums.length;
        //表示以第几个为结尾的子序列的长度
        int[]dp =new int[n];
        Arrays.fill(dp,1);
        int max =Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if(nums[i]>nums[j]){
                    dp[i] =Math.max(dp[i],dp[j]+1);
                }
            }
            max=dp[i]>max?  dp[i]:max;
        }
        return max;
    }
}
