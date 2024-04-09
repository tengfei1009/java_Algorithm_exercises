package 前缀和;

import java.util.Scanner;

public class 求区间和 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] sum = new int[n+1];
        for (int i = 1; i <= n; i++) {
            sum[i] =sum[i-1]+sc.nextInt();
        }
        //操作数
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            System.out.println(sum[r] - sum[l - 1]);
        }
    }
}
