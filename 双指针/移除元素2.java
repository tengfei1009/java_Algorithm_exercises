package 双指针;

public class 移除元素2 {
    public int removeElement(int[] nums, int val) {
        int size = nums.length;
        for (int i = 0; i < size; i++) {
            if (nums[i] == val) {
                for (int j = i + 1; j < size; j++) {
                    //前一个数等于后一个数,也就是将后面的数依次赋值给前面的数
                    nums[j - 1] = nums[j];
                }
                i--;
                size--;
            }
        }
        return size;
    }
}
