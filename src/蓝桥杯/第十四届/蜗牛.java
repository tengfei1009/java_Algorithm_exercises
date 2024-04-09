package 蓝桥杯.第十四届;

import java.util.Scanner;

public class 蜗牛 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        double[] start = new double[n];
        double[] end = new double[n];
        for (int i = 0; i < n - 1; i++) {
            start[i] = sc.nextInt();
            end[i] = sc.nextInt();
        }
        //dp数组表示当前竹子是否被使用
        double[][] dp = new double[n][2];
        dp[0][0] = arr[0];
        dp[0][1] = arr[0] + start[0] / 0.7;
        for (int i = 1; i < n; i++) {
            //当前竹子不用,前一个竹子用还是不用
            dp[i][0] = Math.min(dp[i - 1][0] + (arr[i] - arr[i - 1]), dp[i - 1][1] + end[i - 1] / 1.3);
            double mid = end[i - 1] > start[i] ? (end[i - 1] - start[i]) / 1.3 : (start[i] - end[i - 1]) / 0.7;
            //到达当前竹子起点需要的时间
            dp[i][1] = Math.min(dp[i - 1][0] + (arr[i] - arr[i - 1]) + start[i] / 0.7, dp[i - 1][1] + mid);
        }
        double min = Math.min(dp[n - 1][0], dp[n - 1][1]);
        System.out.printf("%.2f",min);
    }
}