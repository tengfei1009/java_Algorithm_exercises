package 双指针;

public class 有序数组的平方3 {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        // 两个指针：一个从数组开头开始，一个从数组末尾开始
        for (int i = 0, j = n - 1, pos = n - 1; i < j;) {
            if (nums[i] * nums[i] > nums[j] * nums[j]) {
                // 如果 nums[i] 的平方大于 nums[j] 的平方
                ans[pos] = nums[i] * nums[i];
                ++i;  // 移动指向开头的指针，向后移一位
            } else {
                // 如果 nums[i] 的平方小于等于 nums[j] 的平方
                ans[pos] = nums[j] * nums[j];
                --j;  // 移动指向末尾的指针，向前移一位
            }
            //存储完一个位置,存储下一个位置
            pos--;
        }
        return ans;
    }
}
