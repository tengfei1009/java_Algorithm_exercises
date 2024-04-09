package 双指针;

//双指针法
public class 移除元素 {
    public int removeElement(int[] nums, int val) {
        int mid = 0;
        for (int i = 0; i < nums.length; i++) {
            //从0开始满足条件就++,不满足就跳过
            if(nums[i] ==val){
                continue;
            }
            nums[mid]=nums[i];
            mid++;
        }
        return mid;
    }
}
