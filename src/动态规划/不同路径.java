package 动态规划;

import java.util.Scanner;

public class 不同路径 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        //定义到达的位置
        int dp[][] = new int[m][n];
        //有两种选择
        for (int i = 0; i < m; i++) {
            dp[i][0]=1;
        }
        for (int i = 0; i < n; i++) {
            dp[0][i] =1;
        }
        //横向走还是纵向走
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        System.out.println(dp[m-1][n-1]);
    }
}
