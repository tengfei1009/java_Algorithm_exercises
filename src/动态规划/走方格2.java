package 动态规划;

import java.util.Scanner;

public class 走方格2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if (n % 2 == 0 && m % 2 == 0) {
            System.out.println(0);
            return;
        }
        int[][] obstacle = new int[n + 1][m + 1];
        int[][] dp = new int[n + 1][m + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i % 2 == 0 && j % 2 == 0) {
                    obstacle[i][j] = 1;
                }
            }
        }
        //初始化,从上面或者左边
        for (int i = 1; i <= n; i++) {
            dp[i][1] = 1;
        }
        for (int i = 1; i <= m; i++) {
            dp[1][i] = 1;
        }
        for (int i = 2; i <=n; i++) {
            for (int j = 2; j <=m; j++) {
                dp[i][j] = obstacle[i][j] == 0 ? dp[i - 1][j] + dp[i][j - 1] : 0;//当前格子是否有障碍物
            }
        }
        System.out.println(dp[n][m]);
    }
}
