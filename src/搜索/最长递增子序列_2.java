package 搜索;

public class 最长递增子序列_2 {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        //dp数组的含义是以当前结尾的最长的长度
        int []dp = new int[n];
        int max =0;
        for (int i = 0; i < n; i++) {
            dp[i] =1;
            for (int j = 0; j < i; j++) {
                if(nums[i]>nums[j]){
                    dp[i] = Math.max(dp[i],dp[j]+1);
                }
            }
            max = Math.max(dp[i],max);
        }
        return max;
    }
}
