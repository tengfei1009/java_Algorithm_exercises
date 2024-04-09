package 动态规划;

import java.util.Scanner;

public class 采药_01背包 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  //采药的总时间
        int m = sc.nextInt();   //采药的种类
        int[] time = new int[m];
        int[] value = new int[m];
        for (int i = 0; i < m; i++) {
            time[i] = sc.nextInt();
            value[i] = sc.nextInt();
        }
        int[][] dp = new int[m][n + 1];
        //初始化边界
        for (int i = 0; i <= n; i++) {
            if(i >= time[0]){
                dp[0][i] = value[0];
            } else {
                dp[0][i] = 0;
            }
        }
        //初始化第一列
        for (int i = 0; i < m; i++) {
            dp[i][0] = 0;
        }

        for (int i = 1; i < m; i++) {
            //时间够采集,就添加,看是添加大还是不添加大
            for (int j = 1; j <= n; j++) {
                if (j<time[i]){
                    //填不了就和没填一样
                    dp[i][j] =dp[i - 1][j];
                }else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - time[i]] + value[i]);
                }
            }
        }
        System.out.println(dp[m-1][n]);
    }
}