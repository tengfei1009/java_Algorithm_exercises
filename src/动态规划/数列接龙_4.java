package 动态规划;

import java.util.Scanner;

public class 数列接龙_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 输入的数列长度
        int[] mos = new int[10]; // 记录每个数字结尾的最长接龙长度
        String[] nums = new String[n]; // 存储输入的数列
        int[][] dp = new int[n][2]; // dp数组，dp[i][0]表示以第i个数结尾的最长接龙长度（不接当前数），dp[i][1]表示以第i个数结尾的最长接龙长度（接当前数）
        dp[0][1] = 1; // 初始化第一个数的接龙长度为1
        nums[0] = sc.next(); // 输入第一个数列元素
        for (int i = 1; i < n; i++) {
            nums[i] = sc.next(); // 输入第i个数列元素
            char shou = nums[i].charAt(0); // 当前数列元素的首位数字
            char wei = nums[i - 1].charAt(nums[i - 1].length() - 1); // 前一个数列元素的末位数字
            mos[wei - '0'] = Math.max(mos[wei - '0'], dp[i - 1][1]); // 更新以前一个数结尾的最长接龙长度
            if (shou == wei) { // 如果当前数的首位数字等于前一个数的末位数字
                dp[i][1] = Math.max(dp[i - 1][1], mos[shou - '0']) + 1; // 更新以当前数结尾的最长接龙长度（接当前数）
            } else {
                dp[i][1] = mos[shou - '0'] + 1; // 更新以当前数结尾的最长接龙长度（不接当前数）
            }

            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1]); // 更新以当前数结尾的最长接龙长度（不接当前数）
        }
        int max = Math.max(dp[n - 1][0], dp[n - 1][1]); // 获取最后一个数的最长接龙长度
        System.out.println(n - max); // 输出不符合接龙规则的数列元素个数
    }
}