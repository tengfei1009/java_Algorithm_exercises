package 二分查找;

public class 二分查找 {
    public int search(int[] nums, int target) {
        //因为是有序升序数组,左右都知道
        int left = 0;
        int right = nums.length-1;
        while (left<= right) {  //因为/2只可能小于等于
            int middle = left + (right-left)/2;
            if (nums[middle] > target) {
                right = middle-1;
            }else if(nums[middle] <target) {
                left = middle+1;
            } else  {
                //相等
                return middle;
            }
        }
        return -1;
    }
}
