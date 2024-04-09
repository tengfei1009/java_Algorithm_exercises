package 蓝桥杯;

import java.util.Scanner;

public class 走方格 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        //定义dp数组
        int[][] dp = new int[n + 1][m + 1];
        int[][] obstacle = new int[n + 1][m + 1];
        if (n % 2 == 0 && m % 2 == 0) {
            System.out.println(0);
            return;
        }

        //障碍物数组
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i % 2 == 0 && j % 2 == 0) {
                    obstacle[i][j] = 1;
                }
            }
        }
        //初始化
        for (int i = 1; i <= n && obstacle[i][1] == 0; i++) {
            dp[i][1] = 1;
        }
        for (int i = 1; i <= m && obstacle[1][i] == 0; i++) {
            dp[1][i] = 1;
        }

        for (int i = 2; i <= n; i++) {
            for (int j = 2; j <= m; j++) {
                dp[i][j] = (obstacle[i][j] == 0) ? dp[i - 1][j] + dp[i][j - 1] : 0;//不能走就定义为0
            }
        }
        System.out.println(dp[n][m]);
    }
}
