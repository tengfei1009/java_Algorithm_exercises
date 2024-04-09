package 双指针;

public class 移除元素4 {
    public int removeElement(int[] nums, int val) {
        int mid = 0; //从0 索引开始,满足条件++
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[mid++] = nums[i];
            }
        }
        return  mid;
    }
}
