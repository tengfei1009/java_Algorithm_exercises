package 贪心;

public class 摆动序列2 {
    public int wiggleMaxLength(int[] nums) {
        if(nums.length ==1){
            return 1;
        }
        if(nums.length ==2){
            if(nums[0] == nums[1]){
                return 1;
            }
            return 2;
        }
        int  sum =1;
        int flag = 0;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]>nums[i-1] &&(flag ==0||flag ==-1)){
                sum++;
                flag =1;
            }else if(nums[i]<nums[i-1]&&(flag ==0||flag==1)){
                sum++;
                flag =-1;
            }
        }
        return sum;
    }
}
