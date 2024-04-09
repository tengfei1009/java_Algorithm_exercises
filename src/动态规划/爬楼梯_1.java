package 动态规划;

import java.util.Scanner;

public class 爬楼梯_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 输入的台阶数
        int m = sc.nextInt(); // 每次最多可走的步数
        int[] dp = new int[n + 1]; // dp数组，dp[i]表示到达第i个台阶的方法数

        // 初始化
        dp[1] = 1; // 到达第1个台阶只有一种方法
        for (int i = 2; i <= m; i++) {
            // 对于前m个台阶，每个台阶的方法数等于前面所有台阶的方法数之和再加1
            for (int j = 1; j < i; j++) {
                dp[i] += dp[j];
            }
            dp[i] += 1;
        }

        // 计算
        for (int i = m + 1; i <= n; i++) {
            // 对于第m+1个台阶及之后的台阶，每个台阶的方法数等于前面m个台阶的方法数之和
            for (int j = 1; j <= m; j++) {
                dp[i] += dp[i - j];
            }
        }

        System.out.print(dp[n]); // 输出到达第n个台阶的方法数
    }



}