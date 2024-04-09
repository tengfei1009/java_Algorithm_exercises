package 搜索;

public class 最长递增子序列 {
    public int lengthOfLIS(int[] nums) {
        int max =0;
        int min =Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]<min){
                min =nums[i];
                int mid =dfs(nums,i);
                max= mid>max?mid:max;
            }
        }
        return max;
    }

    private static int dfs(int[] nums, int startIndex) {
        int res = 0;
        for (int i = startIndex+1; i < nums.length; i++) {
            if (nums[i] > nums[startIndex]) {
                res = Math.max(res, dfs(nums, i));
            }
        }
        return res + 1;
    }
}