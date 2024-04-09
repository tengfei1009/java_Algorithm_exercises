package 双指针;

public class 删除有序数组中的重复项2 {
    public static int removeDuplicates(int[] nums) {
        int slow = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=nums[slow]){
                slow++;
                nums[slow] = nums[i];
            }
        }
        //数组长度比索引大1
        return slow +1;
    }
}
