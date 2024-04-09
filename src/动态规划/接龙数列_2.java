package 动态规划;

import java.util.Arrays;
import java.util.Scanner;

public class 接龙数列_2 {
    // 根据末尾的大小排序
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int minDeletion = findMinDeletion(arr);
        System.out.println(minDeletion);
    }

    public static int findMinDeletion(int[] nums) {
        int n = nums.length;
//        其中 dp[i] 表示以第 i 个数结尾的接龙序列的最长长度。
        int[] dp = new int[n];
        //全初始化为1
        Arrays.fill(dp, 1);
        //最小为1
        int maxChainLength = 1;

        for (int i = 1; i < n; i++) {
            for (int j = i - 1; j >= 0; j--) {
                // 判断是否满足接龙条件：当前数的首位数字等于前面数的末位数字
                if (getFirstDigit(nums[i]) == getLastDigit(nums[j])) {
                    // 更新以当前数结尾的接龙序列的最长长度
//                    说明当前数是前一个数的接龙,因为初始化都为1,
//                    所以dp[j]+1,也就是与前一个数拼接,前一个数被拼接的长度+1
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                    // 更新最长接龙序列的长度
                    maxChainLength = Math.max(maxChainLength, dp[i]);
                }
            }
        }
//        System.out.println(maxChainLength);
        // 返回需要删除的数的个数，即总数减去最长接龙序列的长度
        return n - maxChainLength;
    }

    // 获取一个数的首位数字
    public static int getFirstDigit(int num) {
        while (num >= 10) {
            num /= 10;
        }
        return num;
    }

    // 获取一个数的末位数字
    public static int getLastDigit(int num) {
        return num % 10;
    }
}