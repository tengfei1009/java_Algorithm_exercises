package 动态规划;

import java.util.Scanner;

public class 石子合并 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n + 1];
        int[] stones = new int[n + 1];
        //dp数组的含义是从第几个到第几个的最小花费
        int[][] dp = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            //每一项合并石子的最小花费
            arr[i] = arr[i - 1] + sc.nextInt();
            dp[i][i] = 0;
        }
        //计算最小花费
        //len是区间范围
        for (int len = 2; len <= n; len++) {
            //i是石子数量
            //石子数量
            for (int i = 1; i <= n - len + 1; i++) {
                int j = i + len - 1;
                dp[i][j] = Integer.MAX_VALUE;
                for (int k = i; k <= j - 1; k++) {
                    dp[i][j] = Math.min(dp[i][j], dp[i][k] + dp[k + 1][j] + arr[j] - arr[i - 1]); // 状态转移方程
                }
            }
        }
        System.out.println(dp[1][n]);
    }
}