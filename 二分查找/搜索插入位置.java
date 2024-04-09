package 二分查找;

public class 搜索插入位置 {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        while (left<=right) {
         //遍历数组，获取元素
            int mid = left + (right-left)/2;
         if(nums[mid]>target) {
             right = mid-1;  //最后有边界时最大值
         } else if(nums[mid]<target) {
             left = mid +1;//最后左边界是最小值
         }else {
             return mid;
         }
        }
        //如果不存在就插入,现在知道了最后的范围
//        因为是left+1
        return left;
    }
}
