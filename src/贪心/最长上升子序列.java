package 贪心;

public class 最长上升子序列 {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] d = new int[n+1];
        int len = 1;
        d[len] = nums[0]; // 初始化 d 数组，d[1] = nums[0]，表示长度为 1 的最长上升子序列的末尾元素

        for (int i = 1; i < n; i++) {
            if (nums[i] > d[len]) {
                d[++len] = nums[i]; // 如果当前元素大于 d 数组的末尾元素，直接将当前元素添加到 d 数组的末尾，并更新 len
            } else {
                int left = 1, right = len + 1, mid;
                while (left < right) {
                    mid = left + (right - left) / 2;
                    if (d[mid] < nums[i]) {
                        left = mid + 1;
                    } else {
                        right = mid;
                    }
                }
                d[left] = nums[i]; // 通过二分查找找到第一个大于等于当前元素的位置 left，更新 d[left] = nums[i]
            }
        }
        return len; // 返回最长上升子序列的长度
    }
}
