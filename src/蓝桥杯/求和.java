package 蓝桥杯;

import java.util.Scanner;

public class 求和 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n   = sc.nextInt();
        int []a =new int[n+1];
        long []sum = new long[n+1];
        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            sum[i]=sum[i-1]+a[i];
        }
        long res =0;
        for (int i = 0; i <= n; i++) {
            res +=(sum[n]-sum[i])*a[i];
        }
        System.out.println(res);
    }
}
