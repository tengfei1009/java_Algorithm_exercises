package 组内练习;

import java.util.Arrays;
import java.util.Scanner;

public class A_B数对_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long c = sc.nextLong();
        long[] a = new long[n + 1];
        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextLong();
        }
        Arrays.sort(a);
        for (int i = 0; i < n; i++) {
            long tb = a[i];

        }
    }
}
