package 动态规划;

public class 最长连续递增序列 {
    public static void main(String[] args) {
        int []arr ={1,3,5,7};
        System.out.println(findLengthOfLCIS(arr));
    }
    public static int findLengthOfLCIS(int[] nums) {
        int max = 1;
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                count++;
            } else {
                count = 1;
            }
            max = count > max ? count : max;
        }
        return max;
    }
}
