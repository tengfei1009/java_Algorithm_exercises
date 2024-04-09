package 蓝桥杯;

import java.util.Arrays;
import java.util.Scanner;

public class 等差数列 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for (int i = 1; i < n; i++) {
            a[i] = arr[i] - arr[i - 1];
        }
        Arrays.sort(a, 1, n);
        if (a[1] == 0) {
            System.out.println(n);
        } else {
            System.out.println((arr[n - 1] - arr[0]) / a[1] + 1);
        }
    }
}