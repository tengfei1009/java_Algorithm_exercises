package 蓝桥杯;

import java.util.Scanner;

public class 成绩分析_2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int max =0;
        int min = 100;
        double res =0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            max = Math.max(max,a);
            min = Math.min(min,a);
            res+=a;
        }
        res/=n;
        System.out.println(max);
        System.out.println(min);
        System.out.printf("%.2f",res);
    }
}
