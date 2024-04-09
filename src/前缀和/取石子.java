package 前缀和;

import java.util.Scanner;

public class 取石子 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //总共有n堆石子
        int n = sc.nextInt();
        int[] a = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            sum += a[i];
            sum %= 10;//最后再求%2
        }
        if (sum % 2 == 1) {
            System.out.println("Alice");
        }else {
            System.out.println("Bob");
        }
    }
}
