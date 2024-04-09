package 入门六;

import java.util.Scanner;

public class 歌唱比赛 {
    static double min =11;
    static double max = -1;
    static double mid;
    static double average;
    static double result;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        double sum = 0;
        int m = sc.nextInt();
        for (int i = 0; i < n; i++) {
            min = 11; // 重置最小值
            max = -1; // 重置最大值
            sum = 0; // 重置总和
            for (int j = 0; j < m; j++) {
                a = sc.nextInt();
                //记录最大值和最小值
                min = a <= min ? a  : min;
                max = a >= max ? a : max;
                // 记录最大值和最小值
//                min = Math.min(a, min);
//                max = Math.max(a, max);
                sum += a;
            }
            average = (sum - min - max) / (m - 2); // 计算平均值
            result = average > mid ? average : mid;
            mid = result; // 更新中间值
        }
        System.out.printf("%.2f",result);
    }
}
