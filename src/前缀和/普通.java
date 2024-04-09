package 前缀和;

import java.util.Scanner;

public class 普通 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int m = sc.nextInt();
        int []arr =new int[n+1];
        int sum =0;
        for (int i = 0; i <= n; i++) {
            arr[i]=i;
        }
        for (int i = 0; i < m; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            for (int j = l; j <= r; j++) {
                sum+=arr[j];
            }
        }
        System.out.println(sum);
    }
}
