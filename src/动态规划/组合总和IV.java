package 动态规划;

public class 组合总和IV {
    public int combinationSum4(int[] nums, int target) {
        //总和为target的组合的个数
        int[] dp = new int[target + 1];
        dp[0] = 1;
        //遍历背包
        for (int i = 0; i <= target; i++) {
            //遍历物品
            for(int j = 0;j<nums.length;j++){
                if(i>=nums[j]){
                    dp[i] +=dp[i-nums[j]];
                }
            }
        }
        return dp[target];
    }
}