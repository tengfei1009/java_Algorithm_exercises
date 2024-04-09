package 入门四;

import java.util.Scanner;

public class Turn_On_The_Light_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 定义一个数组,默认初始化值为0
        int[] arr = new int[1000086];
        // 操作了多少次
        int n = sc.nextInt();

        // 开关次数
        for (int i = 0; i < n; i++) {
            // 每次重新划分开灯名单
            double a = sc.nextDouble();
            int t = sc.nextInt();
            // t从1开始往后和a相乘
            for (int j = 1; j <= t; j++) {
                int temp =(int)(j * a);
                if (arr[temp] == 0) arr[temp] = 1;
                else arr[temp] = 0;
            }
        }
        // 循环遍历数组
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                System.out.println(i);
                break;
            }
        }
    }
}