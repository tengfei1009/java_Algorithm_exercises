package 贪心;

public class 最大子数组和_2 {
    public int maxSubArray(int[] nums) {
        int res= Integer.MIN_VALUE;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                count+=nums[j];
                if(count>=res){
                    res= count;
                }
            }
            count =0;
        }
        return res;
    }
}
