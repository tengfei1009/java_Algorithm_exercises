package 前缀和;

import java.util.Scanner;

public class 求和_3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int []a  = new int[n+1];
        long []sum = new long[n+1];
        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
        }
        //前缀合数组
        for (int i = 1; i <= n; i++) {
           sum[i] = sum[i-1]+a[i];
        }
        long count = 0;
        for (int i = 1; i <= n; i++) {
            count += (sum[n]-sum[i])*a[i];
        }
        System.out.println(count);
    }
}
