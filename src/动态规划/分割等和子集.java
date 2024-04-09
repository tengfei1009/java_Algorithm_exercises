package 动态规划;

public class 分割等和子集 {
    public boolean canPartition(int[] nums) {
        //定义dp数组,dp数组的含义是当前位置,放该数和不放该数,是否能达到子集元素和的一半
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
        }
        if (sum % 2 != 0) {
            return false; // 总和为奇数，无法分割成等和子集
        }
        int target = sum/2;
        int []dp =new int[target+1];

        //外层遍历每个元素
        for (int i = 0; i < nums.length; i++) {
            //内层遍历,是否放当前元素,是否放得下当前元素,一直放当前第一个元素,然后放第二个第三个一直到放完为止,求出target
            for (int j = target; j>=nums[i]; j--) {
              dp[j] = Math.max(dp[j],dp[j-nums[i]]+nums[i]);
            }
        }
        return dp[target]==target;
    }
}
