package 组内练习;

import java.util.Scanner;

public class 求和_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr  =new int[n+1];
        long []a = new long[n+1];
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();//输入数字
        }
        for (int i = 1; i <= n; i++) {
            a[i] =a[i-1]+arr[i];//
        }
        long sum=0;
        for (int i = 1; i <= n; i++) {
            sum+=arr[i]*(a[n]-a[i]);
        }
        System.out.println(sum);
    }
}
