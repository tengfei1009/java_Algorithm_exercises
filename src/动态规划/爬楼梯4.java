package 动态规划;

import java.util.Scanner;

public class 爬楼梯4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 输入n阶楼梯
        int n = sc.nextInt();
        // 一次最多可以跨几步
        int m = sc.nextInt();
        // dp数组含义是到达当前台阶有多少种方式
        int[] dp = new int[n + 1];


        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            for (int j = 1; j <= m && j <= i-1; j++) {
                dp[i] += dp[i - j];
            }
        }

        System.out.println(dp[n]);
        sc.close();
    }
}

