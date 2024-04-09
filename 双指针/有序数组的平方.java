package 双指针;

import java.util.Arrays;

public class 有序数组的平方 {
    public int[] sortedSquares(int[] nums) {
        // 将每个元素平方
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }

        // 对平方后的元素进行排序
        Arrays.sort(nums);

        return nums;
    }
}
