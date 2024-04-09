package 动态规划;

import java.util.Arrays;

public class 最长连续递增子序列 {
    public static int findLengthOfLCIS(int[] nums) {
        int n = nums.length;
        int max =1;
        //dp数组的含义是以当前为结尾的最大长度是多少
        int []dp =new int[n];
        Arrays.fill(dp,1);
        for (int i = 1; i < n; i++) {
            if(nums[i]>nums[i-1]){
                dp[i] =Math.max(dp[i-1]+1,dp[i]);
            }
            max =dp[i]>max?dp[i]:max;
        }
        return max;
    }
}
