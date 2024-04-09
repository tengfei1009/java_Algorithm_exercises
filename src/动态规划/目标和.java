package 动态规划;

public class 目标和 {
    /**
     * 硬是写不出来
     */
    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        //目标值 -1000~1000
        if (target < 0 && sum < -target) { //如果说当前目标值,特别特别不够使,全是负的也超出范围了,就返回
            return 0;
        }
        if((target + sum)%2 !=0){//得不到能够匹配的数
            return 0;
        }
        //数学,二元一次方程组
        int size = (target +sum)/2;
        if(size<0){
            size =- size;
        }
        int []dp =new int[size+1];
        dp[0] = 1;
        //定义dp数组,dp数组的含义是,装满背包容量为j的有多少种装法
        //遍历添加每个数
        for (int i = 0; i < nums.length; i++) {
            for(int j = size;j>nums[i];j--){
                //凑成dp[0]的方法加上凑成dp[1]的方法加上凑成dp[2]的方法加上凑成dp[3]的方法......
                dp[j] =dp[j]+dp[j - nums[i]];
            }
        }
        return dp[size];
    }
}
