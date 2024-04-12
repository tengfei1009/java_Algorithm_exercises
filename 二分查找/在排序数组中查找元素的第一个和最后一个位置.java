package 二分查找;

public class 在排序数组中查找元素的第一个和最后一个位置 {
    //获取该数组
    public int[] searchRange(int[] nums, int target) {
        int [] result = {-1,-1};
//        二分查找，第一次找到为起始值
        // 查找左边界
        int left = check_left(nums, target);
        if(left == -1) {
            return result;
        }
//       找右边界。
        int right = check_right (nums,target);

        result[0] = left;
        result[1] = right;
        return result;
    }
    public static  int check_left (int[] nums, int target) {
        int result = -1;
        int left = 0 ;
        int right = nums.length-1;
        while (left <right) {
            int mid = left + (right-left)/2;
            if(nums[mid]>=target){
                if(nums[mid] == target) {
                    result = mid;
                }
                right = mid-1;
            } else{
                left = mid + 1;
            }
        }
        return result;
    }


    public static  int check_right (int[] nums, int target) {
        int result = 0;
        int left = 0 ;
        int right = nums.length-1;
        while (left <right) {
            int mid = left + (right-left)/2;
            if(nums[mid]<=target){
                if(nums[mid] == target) {
                    result = mid;
                }
                left = mid+1;
            } else{
                right = mid - 1;
            }
        }
        return result;
    }
}
