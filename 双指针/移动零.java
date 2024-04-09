package 双指针;

public class 移动零 {
    public void moveZeroes(int[] nums) {
        int slow= 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=0){
                nums[slow++]=nums[i];
            }
        }
        //后面的数全部重置为0
        for (int i = slow; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
